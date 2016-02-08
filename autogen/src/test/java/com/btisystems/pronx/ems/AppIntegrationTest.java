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

import junitx.framework.ComparisonFailure;
import junitx.framework.FileAssert;
import org.apache.commons.io.FileUtils;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class AppIntegrationTest {

    public static final String GENERATED_DIRECTORY = "./src/test/generated";
    private App app;
    private boolean failed = false;

    @Before
    public void setUp() throws Exception {
        app = new App();
        System.setProperty("project.basedir", ".");
        app.main(new String[] { "-context", "file:${project.basedir}/src/test/resources/testConfiguration.xml" });
    }

    @After
    public void after() throws Exception {
        if (!failed) {
            FileUtils.deleteDirectory(new File(GENERATED_DIRECTORY));
        }
    }

    /**
     * Integration test to verify the generated code is as expected. A previous
     * known good baseline is used and generated code compared to that.
     *
     * @throws Exception
     */
    @Test
    public void shouldGenerateExpectedModel() throws Exception {

        Collection<File> files = FileUtils.listFiles(new File(GENERATED_DIRECTORY), new String[] { "java", "xml" },
                true);

        for (final File file : files) {
            try {
                if (file.getCanonicalPath().endsWith("xml")) {
                    trimNotificationMeta(file);
                }

                FileAssert.assertEquals(new File(file.getCanonicalPath().replaceFirst("generated", "baseline")), file);

            } catch (ComparisonFailure fail) {
                System.out.println("Failure when comparing: " + file.getCanonicalPath());
                failed = true;
                throw fail;
            }
        }
    }

    /**
     * Strips out the Java version from the notification meta data. This isn't
     * needed when diffing the contents.
     *
     * @param file
     * @throws IOException
     */
    private void trimNotificationMeta(File file) throws IOException {
        List<String> lines = FileUtils.readLines(file);
        List<String> updatedLines = new ArrayList<>();
        for (final String line : lines) {
            if (!line.startsWith("<java version=")) {
                updatedLines.add(line);
            }
        }
        FileUtils.writeLines(file, updatedLines, false);
    }

}
