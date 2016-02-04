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
        app.main(new String[]{"-context", "file:${project.basedir}/src/test/resources/testConfiguration.xml"});
    }

    @After
    public void after() throws Exception {
        if (!failed) {
            FileUtils.deleteDirectory(new File(GENERATED_DIRECTORY));
        }
    }

    /**
     * Integration test to verify the generated code is as expected. A previous known good baseline is used and generated code
     * compared to that.
     *
     * @throws Exception
     */
    @Test
    public void shouldGenerateExpectedModel() throws Exception {

        Collection<File> files = FileUtils.listFiles(new File(GENERATED_DIRECTORY), new String[]{"java", "xml"}, true);

        for (final File file : files){
            try {
                if (file.getCanonicalPath().endsWith("xml")) {
                    trimNotificationMeta(file);
                }

                FileAssert.assertEquals(new File(file.getCanonicalPath().replaceFirst("generated", "baseline")), file);

            } catch (ComparisonFailure fail){
                System.out.println("Failure when comparing: " + file.getCanonicalPath());
                failed = true;
                throw fail;
            }
        }
    }

    /**
     * Strips out the Java version from the notification meta data. This isn't needed
     * when diffing the contents.
     *
     * @param file
     * @throws IOException
     */
    private void trimNotificationMeta(File file) throws IOException {
        List<String> lines = FileUtils.readLines(file);
        List<String> updatedLines = new ArrayList<>();
        for (final String line : lines){
            if (!line.startsWith("<java version=")){
                updatedLines.add(line);
            }
        }
        FileUtils.writeLines(file, updatedLines, false);
    }

}
