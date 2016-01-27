
package com.btisystems.mibbler.mibs.netsnmp.netsnmp.mib_2.dismaneventmib.dismaneventmibobjects;

import java.io.Serializable;
import com.btisystems.mibbler.mibs.netsnmp.interfaces.mib_2.dismaneventmib.dismaneventmibobjects.IMteResource;
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

public class MteResource
    extends DeviceEntity
    implements Serializable, IMteResource, IVariableBindingSetter
{

    private int mteResourceSampleMinimum;
    private int mteResourceSampleInstanceMaximum;
    private int mteResourceSampleInstances;
    private int mteResourceSampleInstancesHigh;
    private int mteResourceSampleInstanceLacks;
    private AbstractRootEntity parentEntity;
    private final static DeviceEntityDescription _entityDescription = createEntityDescription();

    public MteResource() {
    }

    public int getMteResourceSampleMinimum() {
        return this.mteResourceSampleMinimum;
    }

    public void setMteResourceSampleMinimum(int mteResourceSampleMinimum) {
        int oldValue = getMteResourceSampleMinimum();
        this.mteResourceSampleMinimum = mteResourceSampleMinimum;
        notifyChange(1, oldValue, mteResourceSampleMinimum);
    }

    public int getMteResourceSampleInstanceMaximum() {
        return this.mteResourceSampleInstanceMaximum;
    }

    public void setMteResourceSampleInstanceMaximum(int mteResourceSampleInstanceMaximum) {
        int oldValue = getMteResourceSampleInstanceMaximum();
        this.mteResourceSampleInstanceMaximum = mteResourceSampleInstanceMaximum;
        notifyChange(2, oldValue, mteResourceSampleInstanceMaximum);
    }

    public int getMteResourceSampleInstances() {
        return this.mteResourceSampleInstances;
    }

    public void setMteResourceSampleInstances(int mteResourceSampleInstances) {
        int oldValue = getMteResourceSampleInstances();
        this.mteResourceSampleInstances = mteResourceSampleInstances;
        notifyChange(3, oldValue, mteResourceSampleInstances);
    }

    public int getMteResourceSampleInstancesHigh() {
        return this.mteResourceSampleInstancesHigh;
    }

    public void setMteResourceSampleInstancesHigh(int mteResourceSampleInstancesHigh) {
        int oldValue = getMteResourceSampleInstancesHigh();
        this.mteResourceSampleInstancesHigh = mteResourceSampleInstancesHigh;
        notifyChange(4, oldValue, mteResourceSampleInstancesHigh);
    }

    public int getMteResourceSampleInstanceLacks() {
        return this.mteResourceSampleInstanceLacks;
    }

    public void setMteResourceSampleInstanceLacks(int mteResourceSampleInstanceLacks) {
        int oldValue = getMteResourceSampleInstanceLacks();
        this.mteResourceSampleInstanceLacks = mteResourceSampleInstanceLacks;
        notifyChange(5, oldValue, mteResourceSampleInstanceLacks);
    }

    public void set(VariableBinding binding) {
        switch (binding.getOid().get(9)) {
            case  1 :
                setMteResourceSampleMinimum(binding.getVariable().toInt());
                break;
            case  2 :
                setMteResourceSampleInstanceMaximum(binding.getVariable().toInt());
                break;
            case  3 :
                setMteResourceSampleInstances(binding.getVariable().toInt());
                break;
            case  4 :
                setMteResourceSampleInstancesHigh(binding.getVariable().toInt());
                break;
            case  5 :
                setMteResourceSampleInstanceLacks(binding.getVariable().toInt());
                break;
        }
    }

    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE).append("mteResourceSampleMinimum", mteResourceSampleMinimum).append("mteResourceSampleInstanceMaximum", mteResourceSampleInstanceMaximum).append("mteResourceSampleInstances", mteResourceSampleInstances).append("mteResourceSampleInstancesHigh", mteResourceSampleInstancesHigh).append("mteResourceSampleInstanceLacks", mteResourceSampleInstanceLacks).toString();
    }

    public int hashCode() {
        return new HashCodeBuilder().append(mteResourceSampleMinimum).append(mteResourceSampleInstanceMaximum).append(mteResourceSampleInstances).append(mteResourceSampleInstancesHigh).append(mteResourceSampleInstanceLacks).toHashCode();
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
        MteResource rhs = ((MteResource) obj);
        return new EqualsBuilder().append(mteResourceSampleMinimum, rhs.mteResourceSampleMinimum).append(mteResourceSampleInstanceMaximum, rhs.mteResourceSampleInstanceMaximum).append(mteResourceSampleInstances, rhs.mteResourceSampleInstances).append(mteResourceSampleInstancesHigh, rhs.mteResourceSampleInstancesHigh).append(mteResourceSampleInstanceLacks, rhs.mteResourceSampleInstanceLacks).isEquals();
    }

    public MteResource clone() {
        MteResource _copy = new MteResource();
        _copy.mteResourceSampleMinimum = mteResourceSampleMinimum;
        _copy.mteResourceSampleInstanceMaximum = mteResourceSampleInstanceMaximum;
        _copy.mteResourceSampleInstances = mteResourceSampleInstances;
        _copy.mteResourceSampleInstancesHigh = mteResourceSampleInstancesHigh;
        _copy.mteResourceSampleInstanceLacks = mteResourceSampleInstanceLacks;
        return _copy;
    }

    public void set_ParentEntity(AbstractRootEntity parent) {
        parentEntity = parent;
    }

    private static DeviceEntityDescription createEntityDescription() {
        DeviceEntityDescription description = new DeviceEntityDescription(new OID("1.3.6.1.2.1.88.1.1"));
        description.addField(new DeviceEntityDescription.FieldDescription(1, "mteResourceSampleMinimum", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(2, "mteResourceSampleInstanceMaximum", DeviceEntityDescription.FieldType.UNSIGNED32, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(3, "mteResourceSampleInstances", DeviceEntityDescription.FieldType.UNSIGNED32, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(4, "mteResourceSampleInstancesHigh", DeviceEntityDescription.FieldType.UNSIGNED32, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(5, "mteResourceSampleInstanceLacks", DeviceEntityDescription.FieldType.INTEGER, -1));
        return description;
    }

    public DeviceEntityDescription get_Description() {
        return _entityDescription;
    }

}
