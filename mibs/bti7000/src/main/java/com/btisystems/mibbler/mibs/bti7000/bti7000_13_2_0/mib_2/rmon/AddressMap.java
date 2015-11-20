
package com.btisystems.mibbler.mibs.bti7000.bti7000_13_2_0.mib_2.rmon;

import java.io.Serializable;
import com.btisystems.mibbler.mibs.bti7000.interfaces.mib_2.rmon.IAddressMap;
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

public class AddressMap
    extends DeviceEntity
    implements Serializable, IAddressMap, IVariableBindingSetter
{

    private int addressMapInserts;
    private int addressMapDeletes;
    private int addressMapMaxDesiredEntries;
    private AbstractRootEntity parentEntity;
    private final static DeviceEntityDescription _entityDescription = createEntityDescription();

    public AddressMap() {
    }

    public int getAddressMapInserts() {
        return this.addressMapInserts;
    }

    public void setAddressMapInserts(int addressMapInserts) {
        int oldValue = getAddressMapInserts();
        this.addressMapInserts = addressMapInserts;
        notifyChange(1, oldValue, addressMapInserts);
    }

    public int getAddressMapDeletes() {
        return this.addressMapDeletes;
    }

    public void setAddressMapDeletes(int addressMapDeletes) {
        int oldValue = getAddressMapDeletes();
        this.addressMapDeletes = addressMapDeletes;
        notifyChange(2, oldValue, addressMapDeletes);
    }

    public int getAddressMapMaxDesiredEntries() {
        return this.addressMapMaxDesiredEntries;
    }

    public void setAddressMapMaxDesiredEntries(int addressMapMaxDesiredEntries) {
        int oldValue = getAddressMapMaxDesiredEntries();
        this.addressMapMaxDesiredEntries = addressMapMaxDesiredEntries;
        notifyChange(3, oldValue, addressMapMaxDesiredEntries);
    }

    public void set(VariableBinding binding) {
        switch (binding.getOid().get(8)) {
            case  1 :
                setAddressMapInserts(binding.getVariable().toInt());
                break;
            case  2 :
                setAddressMapDeletes(binding.getVariable().toInt());
                break;
            case  3 :
                setAddressMapMaxDesiredEntries(binding.getVariable().toInt());
                break;
        }
    }

    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE).append("addressMapInserts", addressMapInserts).append("addressMapDeletes", addressMapDeletes).append("addressMapMaxDesiredEntries", addressMapMaxDesiredEntries).toString();
    }

    public int hashCode() {
        return new HashCodeBuilder().append(addressMapInserts).append(addressMapDeletes).append(addressMapMaxDesiredEntries).toHashCode();
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
        AddressMap rhs = ((AddressMap) obj);
        return new EqualsBuilder().append(addressMapInserts, rhs.addressMapInserts).append(addressMapDeletes, rhs.addressMapDeletes).append(addressMapMaxDesiredEntries, rhs.addressMapMaxDesiredEntries).isEquals();
    }

    public AddressMap clone() {
        AddressMap _copy = new AddressMap();
        _copy.addressMapInserts = addressMapInserts;
        _copy.addressMapDeletes = addressMapDeletes;
        _copy.addressMapMaxDesiredEntries = addressMapMaxDesiredEntries;
        return _copy;
    }

    public void set_ParentEntity(AbstractRootEntity parent) {
        parentEntity = parent;
    }

    private static DeviceEntityDescription createEntityDescription() {
        DeviceEntityDescription description = new DeviceEntityDescription(new OID("1.3.6.1.2.1.16.13"));
        description.addField(new DeviceEntityDescription.FieldDescription(1, "addressMapInserts", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(2, "addressMapDeletes", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(3, "addressMapMaxDesiredEntries", DeviceEntityDescription.FieldType.INTEGER, -1));
        return description;
    }

    public DeviceEntityDescription get_Description() {
        return _entityDescription;
    }

}
