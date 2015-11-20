
package com.btisystems.mibbler.mibs.bti7000.bti7000_13_2_0.btisystems.btiproducts.bti7000.objects.miscellaneous;

import java.io.Serializable;
import com.btisystems.mibbler.mibs.bti7000.interfaces.btisystems.btiproducts.bti7000.objects.miscellaneous.ISetErrorInfo;
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

public class SetErrorInfo
    extends DeviceEntity
    implements Serializable, ISetErrorInfo, IVariableBindingSetter
{

    private int setErrorCode;
    private String setErrorDesc;
    private AbstractRootEntity parentEntity;
    private final static DeviceEntityDescription _entityDescription = createEntityDescription();

    public SetErrorInfo() {
    }

    public int getSetErrorCode() {
        return this.setErrorCode;
    }

    public void setSetErrorCode(int setErrorCode) {
        int oldValue = getSetErrorCode();
        this.setErrorCode = setErrorCode;
        notifyChange(1, oldValue, setErrorCode);
    }

    public String getSetErrorDesc() {
        return this.setErrorDesc;
    }

    public void setSetErrorDesc(String setErrorDesc) {
        String oldValue = getSetErrorDesc();
        this.setErrorDesc = setErrorDesc;
        notifyChange(2, oldValue, setErrorDesc);
    }

    public void set(VariableBinding binding) {
        switch (binding.getOid().get(12)) {
            case  1 :
                setSetErrorCode(binding.getVariable().toInt());
                break;
            case  2 :
                setSetErrorDesc(binding.getVariable().toString());
                break;
        }
    }

    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE).append("setErrorCode", setErrorCode).append("setErrorDesc", setErrorDesc).toString();
    }

    public int hashCode() {
        return new HashCodeBuilder().append(setErrorCode).append(setErrorDesc).toHashCode();
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
        SetErrorInfo rhs = ((SetErrorInfo) obj);
        return new EqualsBuilder().append(setErrorCode, rhs.setErrorCode).append(setErrorDesc, rhs.setErrorDesc).isEquals();
    }

    public SetErrorInfo clone() {
        SetErrorInfo _copy = new SetErrorInfo();
        _copy.setErrorCode = setErrorCode;
        _copy.setErrorDesc = setErrorDesc;
        return _copy;
    }

    public void set_ParentEntity(AbstractRootEntity parent) {
        parentEntity = parent;
    }

    private static DeviceEntityDescription createEntityDescription() {
        DeviceEntityDescription description = new DeviceEntityDescription(new OID("1.3.6.1.4.1.18070.2.2.1.15.1"));
        description.addField(new DeviceEntityDescription.FieldDescription(1, "setErrorCode", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(2, "setErrorDesc", DeviceEntityDescription.FieldType.STRING, 255));
        return description;
    }

    public DeviceEntityDescription get_Description() {
        return _entityDescription;
    }

}
