
package com.btisystems.mibbler.mibs.netsnmp.netsnmp.mib_2.dismaneventmib.dismaneventmibobjects.mteevent.mteeventsettable;

import java.io.Serializable;
import com.btisystems.mibbler.mibs.netsnmp.interfaces.mib_2.dismaneventmib.dismaneventmibobjects.mteevent.mteeventsettable.IMteEventSetEntry;
import com.btisystems.mibbler.mibs.netsnmp.netsnmp.mib_2.dismaneventmib.dismaneventmibobjects.mteevent.MteEventSetTable;
import com.btisystems.pronx.ems.core.model.DeviceEntity;
import com.btisystems.pronx.ems.core.model.DeviceEntityDescription;
import com.btisystems.pronx.ems.core.model.IIndexed;
import com.btisystems.pronx.ems.core.model.IVariableBindingSetter;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;
import org.snmp4j.smi.OID;
import org.snmp4j.smi.VariableBinding;

public class MteEventSetEntry
    extends DeviceEntity
    implements Serializable, IMteEventSetEntry, IIndexed, IVariableBindingSetter
{

    private String mteEventSetObject;
    private Integer mteEventSetObjectWildcard;
    private Integer mteEventSetValue;
    private String mteEventSetTargetTag;
    private String mteEventSetContextName;
    private Integer mteEventSetContextNameWildcard;
    private String _index;
    private MteEventSetTable parentEntity;
    private final static DeviceEntityDescription _entityDescription = createEntityDescription();

    public MteEventSetEntry() {
    }

    public String getMteEventSetObject() {
        return this.mteEventSetObject;
    }

    public void setMteEventSetObject(String mteEventSetObject) {
        String oldValue = getMteEventSetObject();
        this.mteEventSetObject = mteEventSetObject;
        notifyChange(1, oldValue, mteEventSetObject);
    }

    public int getMteEventSetObjectWildcard() {
        if (this.mteEventSetObjectWildcard == null) {
            return  2;
        }
        return this.mteEventSetObjectWildcard;
    }

    public boolean isMteEventSetObjectWildcardDefined() {
        return (this.mteEventSetObjectWildcard!= null);
    }

    public void setMteEventSetObjectWildcard(int mteEventSetObjectWildcard) {
        int oldValue = getMteEventSetObjectWildcard();
        this.mteEventSetObjectWildcard = mteEventSetObjectWildcard;
        notifyChange(2, oldValue, mteEventSetObjectWildcard);
    }

    public int getMteEventSetValue() {
        if (this.mteEventSetValue == null) {
            return  0;
        }
        return this.mteEventSetValue;
    }

    public boolean isMteEventSetValueDefined() {
        return (this.mteEventSetValue!= null);
    }

    public void setMteEventSetValue(int mteEventSetValue) {
        int oldValue = getMteEventSetValue();
        this.mteEventSetValue = mteEventSetValue;
        notifyChange(3, oldValue, mteEventSetValue);
    }

    public String getMteEventSetTargetTag() {
        return this.mteEventSetTargetTag;
    }

    public void setMteEventSetTargetTag(String mteEventSetTargetTag) {
        String oldValue = getMteEventSetTargetTag();
        this.mteEventSetTargetTag = mteEventSetTargetTag;
        notifyChange(4, oldValue, mteEventSetTargetTag);
    }

    public String getMteEventSetContextName() {
        return this.mteEventSetContextName;
    }

    public void setMteEventSetContextName(String mteEventSetContextName) {
        String oldValue = getMteEventSetContextName();
        this.mteEventSetContextName = mteEventSetContextName;
        notifyChange(5, oldValue, mteEventSetContextName);
    }

    public int getMteEventSetContextNameWildcard() {
        if (this.mteEventSetContextNameWildcard == null) {
            return  2;
        }
        return this.mteEventSetContextNameWildcard;
    }

    public boolean isMteEventSetContextNameWildcardDefined() {
        return (this.mteEventSetContextNameWildcard!= null);
    }

    public void setMteEventSetContextNameWildcard(int mteEventSetContextNameWildcard) {
        int oldValue = getMteEventSetContextNameWildcard();
        this.mteEventSetContextNameWildcard = mteEventSetContextNameWildcard;
        notifyChange(6, oldValue, mteEventSetContextNameWildcard);
    }

    public void set(VariableBinding binding) {
        switch (binding.getOid().get(11)) {
            case  1 :
                setMteEventSetObject(binding.getVariable().toString());
                break;
            case  2 :
                setMteEventSetObjectWildcard(binding.getVariable().toInt());
                break;
            case  3 :
                setMteEventSetValue(binding.getVariable().toInt());
                break;
            case  4 :
                setMteEventSetTargetTag(binding.getVariable().toString());
                break;
            case  5 :
                setMteEventSetContextName(binding.getVariable().toString());
                break;
            case  6 :
                setMteEventSetContextNameWildcard(binding.getVariable().toInt());
                break;
        }
    }

    public void _setIndex(OID oid) {
        byte[] _oidBytes = oid.toByteArray();
        int[] _oidInts = oid.toIntArray();
        int arrayOffset = 12;
        int _len;
        _index = new OID(_oidInts, 12, (oid.size()- 12)).toString();
        _len = _oidInts[arrayOffset ++];
        arrayOffset += _len;
    }

    public String _getIndex() {
        return _index;
    }

    public void _setTable(MteEventSetTable table) {
        this.parentEntity = table;
    }

    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE).append("mteEventSetObject", mteEventSetObject).append("mteEventSetObjectWildcard", mteEventSetObjectWildcard).append("mteEventSetValue", mteEventSetValue).append("mteEventSetTargetTag", mteEventSetTargetTag).append("mteEventSetContextName", mteEventSetContextName).append("mteEventSetContextNameWildcard", mteEventSetContextNameWildcard).append("_index", _index).toString();
    }

    public int hashCode() {
        return new HashCodeBuilder().append(mteEventSetObject).append(mteEventSetObjectWildcard).append(mteEventSetValue).append(mteEventSetTargetTag).append(mteEventSetContextName).append(mteEventSetContextNameWildcard).append(_index).toHashCode();
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
        MteEventSetEntry rhs = ((MteEventSetEntry) obj);
        return new EqualsBuilder().append(mteEventSetObject, rhs.mteEventSetObject).append(mteEventSetObjectWildcard, rhs.mteEventSetObjectWildcard).append(mteEventSetValue, rhs.mteEventSetValue).append(mteEventSetTargetTag, rhs.mteEventSetTargetTag).append(mteEventSetContextName, rhs.mteEventSetContextName).append(mteEventSetContextNameWildcard, rhs.mteEventSetContextNameWildcard).append(_index, rhs._index).isEquals();
    }

    public MteEventSetEntry clone() {
        MteEventSetEntry _copy = new MteEventSetEntry();
        _copy.mteEventSetObject = mteEventSetObject;
        _copy.mteEventSetObjectWildcard = mteEventSetObjectWildcard;
        _copy.mteEventSetValue = mteEventSetValue;
        _copy.mteEventSetTargetTag = mteEventSetTargetTag;
        _copy.mteEventSetContextName = mteEventSetContextName;
        _copy.mteEventSetContextNameWildcard = mteEventSetContextNameWildcard;
        _copy._index = _index;
        _copy.parentEntity = parentEntity;
        return _copy;
    }

    private static DeviceEntityDescription createEntityDescription() {
        DeviceEntityDescription description = new DeviceEntityDescription(new OID("1.3.6.1.2.1.88.1.4.4.1"));
        description.addField(new DeviceEntityDescription.FieldDescription(1, "mteEventSetObject", DeviceEntityDescription.FieldType.OID, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(2, "mteEventSetObjectWildcard", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(3, "mteEventSetValue", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(4, "mteEventSetTargetTag", DeviceEntityDescription.FieldType.STRING, 765));
        description.addField(new DeviceEntityDescription.FieldDescription(5, "mteEventSetContextName", DeviceEntityDescription.FieldType.STRING, 765));
        description.addField(new DeviceEntityDescription.FieldDescription(6, "mteEventSetContextNameWildcard", DeviceEntityDescription.FieldType.INTEGER, -1));
        return description;
    }

    public DeviceEntityDescription get_Description() {
        return _entityDescription;
    }

}
