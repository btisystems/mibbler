
package com.btisystems.mibbler.mibs.rfc.rfc.mib_2.rmon;

import java.io.Serializable;
import com.btisystems.mibbler.mibs.rfc.interfaces.mib_2.rmon.IProtocolDir;
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

public class ProtocolDir
    extends DeviceEntity
    implements Serializable, IProtocolDir, IVariableBindingSetter
{

    private int protocolDirLastChange;
    private AbstractRootEntity parentEntity;
    private final static DeviceEntityDescription _entityDescription = createEntityDescription();

    public ProtocolDir() {
    }

    public int getProtocolDirLastChange() {
        return this.protocolDirLastChange;
    }

    public void setProtocolDirLastChange(int protocolDirLastChange) {
        int oldValue = getProtocolDirLastChange();
        this.protocolDirLastChange = protocolDirLastChange;
        notifyChange(1, oldValue, protocolDirLastChange);
    }

    public void set(VariableBinding binding) {
        switch (binding.getOid().get(8)) {
            case  1 :
                setProtocolDirLastChange(binding.getVariable().toInt());
                break;
        }
    }

    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE).append("protocolDirLastChange", protocolDirLastChange).toString();
    }

    public int hashCode() {
        return new HashCodeBuilder().append(protocolDirLastChange).toHashCode();
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
        ProtocolDir rhs = ((ProtocolDir) obj);
        return new EqualsBuilder().append(protocolDirLastChange, rhs.protocolDirLastChange).isEquals();
    }

    public ProtocolDir clone() {
        ProtocolDir _copy = new ProtocolDir();
        _copy.protocolDirLastChange = protocolDirLastChange;
        return _copy;
    }

    public void set_ParentEntity(AbstractRootEntity parent) {
        parentEntity = parent;
    }

    private static DeviceEntityDescription createEntityDescription() {
        DeviceEntityDescription description = new DeviceEntityDescription(new OID("1.3.6.1.2.1.16.11"));
        description.addField(new DeviceEntityDescription.FieldDescription(1, "protocolDirLastChange", DeviceEntityDescription.FieldType.INTEGER, -1));
        return description;
    }

    public DeviceEntityDescription get_Description() {
        return _entityDescription;
    }

}
