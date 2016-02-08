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

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class AbstractMibCompilerTest {

    @Test
    public void testThatAReservedWordIsHandledCorrectly() {
        assertTrue(AbstractMibCompiler.handleJavaReservedWords("switch").equals("switch_"));
    }

    @Test
    public void noReservedWordLeaveAlone() {
        assertTrue(AbstractMibCompiler.handleJavaReservedWords("wontChange").equals("wontChange"));
    }

    @Test
    public void shouldBeFiftyReservedWordsInSet() {
        assertEquals(50, AbstractMibCompiler.RESERVED_WORD_SET.size());
    }

}
