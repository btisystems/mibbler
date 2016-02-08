package com.btisystems.pronx.ems;

import net.percederberg.mibble.MibSymbol;
import net.percederberg.mibble.MibValueSymbol;
import net.percederberg.mibble.MibValue;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class AppTest {

    @Mock
    private MibValueSymbol mockSymbol1;
    @Mock
    private MibValueSymbol mockSymbol2;
    @Mock
    private MibValue mockValue1;
    @Mock
    private MibValue mockValue2;

    @Before
    public void setUp() throws Exception {
        MockitoAnnotations.initMocks(this);

    }

    @After
    public void after() throws Exception {

    }

    @Test
    public void shouldCompareEquivalentSymbols() throws Exception {
        Mockito.when(mockSymbol1.getValue()).thenReturn(mockValue1);
        Mockito.when(mockSymbol2.getValue()).thenReturn(mockValue1);
        Mockito.when(mockSymbol1.getName()).thenReturn("Symbol");
        Mockito.when(mockSymbol2.getName()).thenReturn("Symbol");

        assertTrue(App.areEntitiesEquivalent(mockSymbol1, mockSymbol2));
    }

    @Test
    public void shouldCompareDifferentValues() throws Exception {
        Mockito.when(mockSymbol1.getValue()).thenReturn(mockValue1);
        Mockito.when(mockSymbol2.getValue()).thenReturn(mockValue2);

        assertFalse(App.areEntitiesEquivalent(mockSymbol1, mockSymbol2));
    }

    @Test
    public void shouldCompareDifferentNames() throws Exception {
        Mockito.when(mockSymbol1.getValue()).thenReturn(mockValue1);
        Mockito.when(mockSymbol2.getValue()).thenReturn(mockValue1);
        Mockito.when(mockSymbol1.getName()).thenReturn("Symbol");
        Mockito.when(mockSymbol2.getName()).thenReturn("Different Symbol");

        assertFalse(App.areEntitiesEquivalent(mockSymbol1, mockSymbol2));
    }

    @Test
    public void shouldCompareDifferentChildren() throws Exception {
        Mockito.when(mockSymbol1.getValue()).thenReturn(mockValue1);
        Mockito.when(mockSymbol2.getValue()).thenReturn(mockValue1);
        Mockito.when(mockSymbol1.getName()).thenReturn("Symbol");
        Mockito.when(mockSymbol2.getName()).thenReturn("Symbol");
        Mockito.when(mockSymbol1.getChildCount()).thenReturn(0);
        Mockito.when(mockSymbol2.getChildCount()).thenReturn(1);

        assertFalse(App.areEntitiesEquivalent(mockSymbol1, mockSymbol2));
    }

    @Test
    public void shouldCompareScalars() throws Exception {
        Mockito.when(mockSymbol1.getValue()).thenReturn(mockValue1);
        Mockito.when(mockSymbol2.getValue()).thenReturn(mockValue1);
        Mockito.when(mockSymbol1.getName()).thenReturn("Symbol");
        Mockito.when(mockSymbol2.getName()).thenReturn("Symbol");
        Mockito.when(mockSymbol1.getChildCount()).thenReturn(1);
        Mockito.when(mockSymbol2.getChildCount()).thenReturn(1);
        Mockito.when(mockSymbol1.isTable()).thenReturn(false);
        Mockito.when(mockSymbol1.isTable()).thenReturn(false);
        Mockito.when(mockSymbol1.getChild(0)).thenReturn(mockSymbol1);
        Mockito.when(mockSymbol2.getChild(0)).thenReturn(mockSymbol2);
        Mockito.when(mockSymbol1.isTableColumn()).thenReturn(true);
        Mockito.when(mockSymbol2.isTableColumn()).thenReturn(true);

        assertFalse(App.areEntitiesEquivalent(mockSymbol1, mockSymbol2));
    }

}
