/*
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package com.btisystems.pronx.ems;

import com.sun.codemodel.ClassType;
import com.sun.codemodel.JCodeModel;
import com.sun.codemodel.JDefinedClass;
import com.sun.codemodel.JFieldVar;
import com.sun.codemodel.JMod;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import net.percederberg.mibble.MibValueSymbol;
import net.percederberg.mibble.snmp.SnmpObjectType;
import net.percederberg.mibble.value.ObjectIdentifierValue;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

public class MibEntityCompilerTest {
    private Map<String, List<MibValueSymbol>> symbolMap = new HashMap<>();
    private MibEntityCompiler compiler;
    private final JCodeModel codeModel = new JCodeModel();
    @Mock private MibValueSymbol mockSymbol;
    @Mock private SnmpObjectType mockSnmpObjectType;
    
    public MibEntityCompilerTest() {
    }
    
    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);
        compiler = new MibEntityCompiler(symbolMap, "foo.bar");
        compiler.compile(codeModel);
    }

    @Test
    public void shouldCreateInterface() {
        final JDefinedClass jdefined = compiler.createInterface("foo.bar", "TestInterface");
        assertEquals("foo.bar.TestInterface", jdefined.fullName());
    }
    
    @Test
    public void shouldCreateClass() {
        final JDefinedClass jdefined = compiler.createClass("foo.bar", "TestClass", ClassType.CLASS);
        assertEquals("foo.bar.TestClass", jdefined.fullName());
    }
    
    @Test
    public void shouldCreateUtilityMethods() {
        final JDefinedClass jdefined = compiler.createClass("foo.bar", "TestClass", ClassType.CLASS);
        jdefined.field(JMod.PUBLIC, Integer.class, "testInteger");
        compiler.addCloneMethod(jdefined);
        compiler.addEqualsMethod(jdefined);
        compiler.addHashCodeMethod(jdefined);
        compiler.addToStringMethod(jdefined);
        
        assertEquals(4, jdefined.methods().size()); 
    }
    
    @Test
    public void shouldCreateAccessors() {
        Mockito.when(mockSymbol.getType()).thenReturn(mockSnmpObjectType);
        Mockito.when(mockSnmpObjectType.getDefaultValue()).thenReturn(new ObjectIdentifierValue("INTEGER", 1));
        Mockito.when(mockSymbol.getValue()).thenReturn(new ObjectIdentifierValue("INTEGER", 1));
        final JDefinedClass jdefined = compiler.createClass("foo.bar", "TestClass", ClassType.CLASS);
        final JFieldVar field = jdefined.field(JMod.PUBLIC, Integer.class, "testInteger");
        compiler.generateAccessors(jdefined, mockSymbol, field.type(), "testInteger");
        
        assertEquals(2, jdefined.methods().size()); 
    }
}
