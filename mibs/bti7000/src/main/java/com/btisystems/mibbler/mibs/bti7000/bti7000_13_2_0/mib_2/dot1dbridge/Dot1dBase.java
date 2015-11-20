
package com.btisystems.mibbler.mibs.bti7000.bti7000_13_2_0.mib_2.dot1dbridge;

import java.io.Serializable;
import com.btisystems.mibbler.mibs.bti7000.interfaces.mib_2.dot1dbridge.IDot1dBase;
import com.btisystems.pronx.ems.core.model.AbstractRootEntity;
import com.btisystems.pronx.ems.core.model.DeviceEntity;
import com.btisystems.pronx.ems.core.model.DeviceEntityDescription;
import com.btisystems.pronx.ems.core.model.IVariableBindingSetter;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;
import org.snmp4j.smi.OID;
import org.snmp4j.smi.VariableBinding;

public class Dot1dBase
    extends DeviceEntity
    implements Serializable, IDot1dBase, IVariableBindingSetter
{

    private String dot1dBaseBridgeAddress;
    private int dot1dBaseNumPorts;
    private int dot1dBaseType;
    private AbstractRootEntity parentEntity;
    private final static DeviceEntityDescription _entityDescription = createEntityDescription();

    public Dot1dBase() {
    }

    public String getDot1dBaseBridgeAddress() {
        return this.dot1dBaseBridgeAddress;
    }

    public void setDot1dBaseBridgeAddress(String dot1dBaseBridgeAddress) {
        String oldValue = getDot1dBaseBridgeAddress();
        this.dot1dBaseBridgeAddress = dot1dBaseBridgeAddress;
        notifyChange(1, oldValue, dot1dBaseBridgeAddress);
    }

    public int getDot1dBaseNumPorts() {
        return this.dot1dBaseNumPorts;
    }

    public void setDot1dBaseNumPorts(int dot1dBaseNumPorts) {
        int oldValue = getDot1dBaseNumPorts();
        this.dot1dBaseNumPorts = dot1dBaseNumPorts;
        notifyChange(2, oldValue, dot1dBaseNumPorts);
    }

    public int getDot1dBaseType() {
        return this.dot1dBaseType;
    }

    public void setDot1dBaseType(int dot1dBaseType) {
        int oldValue = getDot1dBaseType();
        this.dot1dBaseType = dot1dBaseType;
        notifyChange(3, oldValue, dot1dBaseType);
    }

    public void set(VariableBinding binding) {
        switch (binding.getOid().get(8)) {
            case  1 :
                setDot1dBaseBridgeAddress(binding.getVariable().toString());
                break;
            case  2 :
                setDot1dBaseNumPorts(binding.getVariable().toInt());
                break;
            case  3 :
                setDot1dBaseType(binding.getVariable().toInt());
                break;
        }
    }

    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE).append("dot1dBaseBridgeAddress", dot1dBaseBridgeAddress).append("dot1dBaseNumPorts", dot1dBaseNumPorts).append("dot1dBaseType", dot1dBaseType).toString();
    }

    public int hashCode() {
        return new HashCodeBuilder().append(dot1dBaseBridgeAddress).append(dot1dBaseNumPorts).append(dot1dBaseType).toHashCode();
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (obj.getClass()!= this.getClass()) {
            return false;
        }
        Dot1dBase rhs = ((Dot1dBase) obj);
        return new EqualsBuilder().append(dot1dBaseBridgeAddress, rhs.dot1dBaseBridgeAddress).append(dot1dBaseNumPorts, rhs.dot1dBaseNumPorts).append(dot1dBaseType, rhs.dot1dBaseType).isEquals();
    }

    public Dot1dBase clone() {
        Dot1dBase _copy = new Dot1dBase();
        _copy.dot1dBaseBridgeAddress = dot1dBaseBridgeAddress;
        _copy.dot1dBaseNumPorts = dot1dBaseNumPorts;
        _copy.dot1dBaseType = dot1dBaseType;
        return _copy;
    }

    public void set_ParentEntity(AbstractRootEntity parent) {
        parentEntity = parent;
    }

    private static DeviceEntityDescription createEntityDescription() {
        DeviceEntityDescription description = new DeviceEntityDescription(new OID("1.3.6.1.2.1.17.1"));
        description.addField(new DeviceEntityDescription.FieldDescription(1, "dot1dBaseBridgeAddress", DeviceEntityDescription.FieldType.STRING, 18));
        description.addField(new DeviceEntityDescription.FieldDescription(2, "dot1dBaseNumPorts", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(3, "dot1dBaseType", DeviceEntityDescription.FieldType.INTEGER, -1));
        return description;
    }

    public DeviceEntityDescription get_Description() {
        return _entityDescription;
    }

}
