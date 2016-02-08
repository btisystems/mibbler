/**
 *                     GNU GENERAL PUBLIC LICENSE
 *                        Version 3, 29 June 2007
 *
 *  Copyright (C) 2007 Free Software Foundation, Inc. <http://fsf.org/>
 *  Everyone is permitted to copy and distribute verbatim copies
 *  of this license document, but changing it is not allowed.
 *
 *  This program is free software: you can redistribute it and/or
 *  modify it under the terms of the GNU General Public License as published
 *  by the Free Software Foundation, either version 3 of the License, or
 *  (at your option) any later version.
 *
 *  This program is distributed in the hope that it will be useful, but WITHOUT
 *  ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 *  FOR A PARTICULAR PURPOSE. See the GNU General Public License for more details.
 */
package com.btisystems.pronx.ems;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Helper method to determine the column width to allow for a value with a
 * syntax that has an underlying primitive type of OCTET STRING with an
 * associated DISPLAY HINT. Complies with RFC 2579, but only with respect to
 * OCTET STRING types.
 */
class DisplayHintParser {

    private static final Logger LOG = LoggerFactory.getLogger(DisplayHintParser.class);

    // Refer to RFC 2579 for mapping of Display Hint
    private static final Pattern DISPLAY_HINT_PATTERN = Pattern.compile("(\\*?)" + "(\\d+)" + "([xdoat])"
            + "([^*0-9]?)" + "([^*0-9]?)");
    // The index of the capture groups in the regex above.
    private static final int REPEAT_INDICATOR_INDEX = 1;
    private static final int OCTET_COUNT_INDEX = 2;
    private static final int FORMAT_INDEX = 3;
    private static final int SEPARATOR_INDEX = 4;
    private static final int TERMINATOR_INDEX = 5;
    private static final int TWO_FIVE_FIVE = 255;
    private static final int FIVE = 5;
    private static final int THREE = 3;

    /**
     * The Output width.
     */
    protected final int outputWidth;
    /**
     * The Octets consumed.
     */
    protected final int octetsConsumed;
    /**
     * The Is repeated.
     */
    protected final boolean isRepeated;

    /**
     * Deliver the column with for an OCTET STRING value associated with the
     * suppled displayHint
     *
     * @param displayHint the display hint
     * @return the display hint parser
     */
    protected static DisplayHintParser parseOctetStringDisplayHint(final String displayHint) {

        LOG.debug("Display Hint = {}", displayHint);

        final Matcher matcher = DISPLAY_HINT_PATTERN.matcher(displayHint);
        int totalWidth = 0;
        int totalOctets = 0;
        boolean isRepeated = false;

        while (matcher.find()) {
            LOG.debug("Group:{}", matcher.group());

            int repeater = 1;
            if (matcher.group(REPEAT_INDICATOR_INDEX).length() > 0) {
                repeater = TWO_FIVE_FIVE; // Allow for the worst case
                isRepeated = true;
                totalOctets++;
            }

            final int octetCount = Integer.parseInt(matcher.group(OCTET_COUNT_INDEX));
            final int octetWidth = getOctetWidth(octetCount, matcher.group(FORMAT_INDEX).charAt(0));
            final int separatorWidth = matcher.group(SEPARATOR_INDEX).length() > 0 ? 1 : 0;
            final int terminatorWidth = matcher.group(TERMINATOR_INDEX).length() > 0 ? 1 : 0;

            final int fieldWidth = repeater * (octetWidth + separatorWidth + terminatorWidth);
            LOG.debug("FieldWidth {}", fieldWidth);
            totalWidth += fieldWidth;
            totalOctets += octetCount;

        }
        LOG.debug("Diplay Hint {} width {}", displayHint, totalWidth);
        if (totalWidth != 0) {
            return new DisplayHintParser(totalWidth, totalOctets, isRepeated);
        }
        return null;
    }

    private static int getOctetWidth(final int octetCount, final char format) {

        int width;
        // TODO Smarter way to determine widths?
        switch (format) {
        case 'd':
            width = octetCount * FIVE / 2 + octetCount % 2;
            break;
        case 'o':
            width = octetCount * THREE - (octetCount - 1) / THREE;
            break;
        case 'x':
            width = octetCount * 2;
            break;
        case 't':
            width = octetCount * THREE; // Allow for delimited twinhex
                                        // representation
            break;
        default:
            width = octetCount;
        }
        LOG.debug("OctetWidth Count " + octetCount + " Format " + format + " Width " + width);
        return width;
    }

    /**
     * Instantiates a new Display hint parser.
     *
     * @param outputWidth the output width
     * @param octetsConsumed the octets consumed
     * @param isRepeated the is repeated
     */
    protected DisplayHintParser(final int outputWidth, final int octetsConsumed, final boolean isRepeated) {
        this.outputWidth = outputWidth;
        this.octetsConsumed = octetsConsumed;
        this.isRepeated = isRepeated;
    }

    @Override
    public String toString() {
        return "DisplayHintParser [isRepeated=" + isRepeated + ", octetsConsumed=" + octetsConsumed + ", outputWidth="
                + outputWidth + "]";
    }
}
