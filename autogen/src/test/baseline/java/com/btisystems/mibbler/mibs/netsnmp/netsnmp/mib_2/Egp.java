
package com.btisystems.mibbler.mibs.netsnmp.netsnmp.mib_2;

import java.io.Serializable;
import com.btisystems.mibbler.mibs.netsnmp.interfaces.mib_2.IEgp;
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

public class Egp
    extends DeviceEntity
    implements Serializable, IEgp, IVariableBindingSetter
{

    private int egpInMsgs;
    private int egpInErrors;
    private int egpOutMsgs;
    private int egpOutErrors;
    private int egpAs;
    private AbstractRootEntity parentEntity;
    private final static DeviceEntityDescription _entityDescription = createEntityDescription();

    public Egp() {
    }

    public int getEgpInMsgs() {
        return this.egpInMsgs;
    }

    public void setEgpInMsgs(int egpInMsgs) {
        int oldValue = getEgpInMsgs();
        this.egpInMsgs = egpInMsgs;
        notifyChange(1, oldValue, egpInMsgs);
    }

    public int getEgpInErrors() {
        return this.egpInErrors;
    }

    public void setEgpInErrors(int egpInErrors) {
        int oldValue = getEgpInErrors();
        this.egpInErrors = egpInErrors;
        notifyChange(2, oldValue, egpInErrors);
    }

    public int getEgpOutMsgs() {
        return this.egpOutMsgs;
    }

    public void setEgpOutMsgs(int egpOutMsgs) {
        int oldValue = getEgpOutMsgs();
        this.egpOutMsgs = egpOutMsgs;
        notifyChange(3, oldValue, egpOutMsgs);
    }

    public int getEgpOutErrors() {
        return this.egpOutErrors;
    }

    public void setEgpOutErrors(int egpOutErrors) {
        int oldValue = getEgpOutErrors();
        this.egpOutErrors = egpOutErrors;
        notifyChange(4, oldValue, egpOutErrors);
    }

    public int getEgpAs() {
        return this.egpAs;
    }

    public void setEgpAs(int egpAs) {
        int oldValue = getEgpAs();
        this.egpAs = egpAs;
        notifyChange(6, oldValue, egpAs);
    }

    public void set(VariableBinding binding) {
        switch (binding.getOid().get(7)) {
            case  1 :
                setEgpInMsgs(binding.getVariable().toInt());
                break;
            case  2 :
                setEgpInErrors(binding.getVariable().toInt());
                break;
            case  3 :
                setEgpOutMsgs(binding.getVariable().toInt());
                break;
            case  4 :
                setEgpOutErrors(binding.getVariable().toInt());
                break;
            case  6 :
                setEgpAs(binding.getVariable().toInt());
                break;
        }
    }

    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE).append("egpInMsgs", egpInMsgs).append("egpInErrors", egpInErrors).append("egpOutMsgs", egpOutMsgs).append("egpOutErrors", egpOutErrors).append("egpAs", egpAs).toString();
    }

    public int hashCode() {
        return new HashCodeBuilder().append(egpInMsgs).append(egpInErrors).append(egpOutMsgs).append(egpOutErrors).append(egpAs).toHashCode();
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
        Egp rhs = ((Egp) obj);
        return new EqualsBuilder().append(egpInMsgs, rhs.egpInMsgs).append(egpInErrors, rhs.egpInErrors).append(egpOutMsgs, rhs.egpOutMsgs).append(egpOutErrors, rhs.egpOutErrors).append(egpAs, rhs.egpAs).isEquals();
    }

    public Egp clone() {
        Egp _copy = new Egp();
        _copy.egpInMsgs = egpInMsgs;
        _copy.egpInErrors = egpInErrors;
        _copy.egpOutMsgs = egpOutMsgs;
        _copy.egpOutErrors = egpOutErrors;
        _copy.egpAs = egpAs;
        return _copy;
    }

    public void set_ParentEntity(AbstractRootEntity parent) {
        parentEntity = parent;
    }

    private static DeviceEntityDescription createEntityDescription() {
        DeviceEntityDescription description = new DeviceEntityDescription(new OID("1.3.6.1.2.1.8"));
        description.addField(new DeviceEntityDescription.FieldDescription(1, "egpInMsgs", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(2, "egpInErrors", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(3, "egpOutMsgs", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(4, "egpOutErrors", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(6, "egpAs", DeviceEntityDescription.FieldType.INTEGER, -1));
        return description;
    }

    public DeviceEntityDescription get_Description() {
        return _entityDescription;
    }

}
