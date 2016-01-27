package com.btisystems.pronx.ems;

import junitx.framework.FileAssert;
import org.apache.commons.io.FileUtils;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.File;
import java.util.Collection;


public class AppIntegrationTest {


    public static final String GENERATED_DIRECTORY = "./src/test/generated";
    private App app;

    @Before
    public void setUp() throws Exception {
        app = new App();
        System.setProperty("project.basedir", ".");
        app.main(new String[]{"-context", "file:${project.basedir}/src/test/resources/testConfiguration.xml"});
    }

    @After
    public void after() throws Exception {
        FileUtils.deleteDirectory(new File(GENERATED_DIRECTORY));
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
            FileAssert.assertEquals(new File(file.getCanonicalPath().replaceFirst("generated", "baseline")), file);
        }
    }

}
