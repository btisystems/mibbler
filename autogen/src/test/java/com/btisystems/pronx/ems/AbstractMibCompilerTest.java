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
