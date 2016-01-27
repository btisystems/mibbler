
package com.btisystems.mibbler.mibs.netsnmp.netsnmp.mib_2.dismaneventmib.dismaneventmibobjects.mteobjects.mteobjectstable;

import java.io.Serializable;
import com.btisystems.mibbler.mibs.netsnmp.interfaces.mib_2.dismaneventmib.dismaneventmibobjects.mteobjects.mteobjectstable.IMteObjectsEntry;
import com.btisystems.mibbler.mibs.netsnmp.netsnmp.mib_2.dismaneventmib.dismaneventmibobjects.mteobjects.MteObjectsTable;
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

public class MteObjectsEntry
    extends DeviceEntity
    implements Serializable, IMteObjectsEntry, IIndexed, IVariableBindingSetter
{

    private String mteObjectsName;
    private int mteObjectsIndex;
    private String mteObjectsID;
    private Integer mteObjectsIDWildcard;
    private int mteObjectsEntryStatus;
    private String _index;
    private MteObjectsTable parentEntity;
    private final static DeviceEntityDescription _entityDescription = createEntityDescription();

    public MteObjectsEntry() {
    }

    public String getMteObjectsName() {
        return this.mteObjectsName;
    }

    public void setMteObjectsName(String mteObjectsName) {
        String oldValue = getMteObjectsName();
        this.mteObjectsName = mteObjectsName;
        notifyChange(1, oldValue, mteObjectsName);
    }

    public int getMteObjectsIndex() {
        return this.mteObjectsIndex;
    }

    public void setMteObjectsIndex(int mteObjectsIndex) {
        int oldValue = getMteObjectsIndex();
        this.mteObjectsIndex = mteObjectsIndex;
        notifyChange(2, oldValue, mteObjectsIndex);
    }

    public String getMteObjectsID() {
        return this.mteObjectsID;
    }

    public void setMteObjectsID(String mteObjectsID) {
        String oldValue = getMteObjectsID();
        this.mteObjectsID = mteObjectsID;
        notifyChange(3, oldValue, mteObjectsID);
    }

    public int getMteObjectsIDWildcard() {
        if (this.mteObjectsIDWildcard == null) {
            return  2;
        }
        return this.mteObjectsIDWildcard;
    }

    public boolean isMteObjectsIDWildcardDefined() {
        return (this.mteObjectsIDWildcard!= null);
    }

    public void setMteObjectsIDWildcard(int mteObjectsIDWildcard) {
        int oldValue = getMteObjectsIDWildcard();
        this.mteObjectsIDWildcard = mteObjectsIDWildcard;
        notifyChange(4, oldValue, mteObjectsIDWildcard);
    }

    public int getMteObjectsEntryStatus() {
        return this.mteObjectsEntryStatus;
    }

    public void setMteObjectsEntryStatus(int mteObjectsEntryStatus) {
        int oldValue = getMteObjectsEntryStatus();
        this.mteObjectsEntryStatus = mteObjectsEntryStatus;
        notifyChange(5, oldValue, mteObjectsEntryStatus);
    }

    public void set(VariableBinding binding) {
        switch (binding.getOid().get(11)) {
            case  1 :
                setMteObjectsName(binding.getVariable().toString());
                break;
            case  2 :
                setMteObjectsIndex(binding.getVariable().toInt());
                break;
            case  3 :
                setMteObjectsID(binding.getVariable().toString());
                break;
            case  4 :
                setMteObjectsIDWildcard(binding.getVariable().toInt());
                break;
            case  5 :
                setMteObjectsEntryStatus(binding.getVariable().toInt());
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
        _len = _oidInts[arrayOffset ++];
        setMteObjectsName(new String(_oidBytes, arrayOffset, _len));
        arrayOffset += _len;
        setMteObjectsIndex(_oidInts[arrayOffset]);
        arrayOffset += 1;
    }

    public String _getIndex() {
        return _index;
    }

    public void _setTable(MteObjectsTable table) {
        this.parentEntity = table;
    }

    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE).append("mteObjectsName", mteObjectsName).append("mteObjectsIndex", mteObjectsIndex).append("mteObjectsID", mteObjectsID).append("mteObjectsIDWildcard", mteObjectsIDWildcard).append("mteObjectsEntryStatus", mteObjectsEntryStatus).append("_index", _index).toString();
    }

    public int hashCode() {
        return new HashCodeBuilder().append(mteObjectsName).append(mteObjectsIndex).append(mteObjectsID).append(mteObjectsIDWildcard).append(mteObjectsEntryStatus).append(_index).toHashCode();
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
        MteObjectsEntry rhs = ((MteObjectsEntry) obj);
        return new EqualsBuilder().append(mteObjectsName, rhs.mteObjectsName).append(mteObjectsIndex, rhs.mteObjectsIndex).append(mteObjectsID, rhs.mteObjectsID).append(mteObjectsIDWildcard, rhs.mteObjectsIDWildcard).append(mteObjectsEntryStatus, rhs.mteObjectsEntryStatus).append(_index, rhs._index).isEquals();
    }

    public MteObjectsEntry clone() {
        MteObjectsEntry _copy = new MteObjectsEntry();
        _copy.mteObjectsName = mteObjectsName;
        _copy.mteObjectsIndex = mteObjectsIndex;
        _copy.mteObjectsID = mteObjectsID;
        _copy.mteObjectsIDWildcard = mteObjectsIDWildcard;
        _copy.mteObjectsEntryStatus = mteObjectsEntryStatus;
        _copy._index = _index;
        _copy.parentEntity = parentEntity;
        return _copy;
    }

    private static DeviceEntityDescription createEntityDescription() {
        DeviceEntityDescription description = new DeviceEntityDescription(new OID("1.3.6.1.2.1.88.1.3.1.1"));
        description.addField(new DeviceEntityDescription.FieldDescription(1, "mteObjectsName", DeviceEntityDescription.FieldType.STRING, 765));
        description.addField(new DeviceEntityDescription.FieldDescription(2, "mteObjectsIndex", DeviceEntityDescription.FieldType.UNSIGNED32, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(3, "mteObjectsID", DeviceEntityDescription.FieldType.OID, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(4, "mteObjectsIDWildcard", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(5, "mteObjectsEntryStatus", DeviceEntityDescription.FieldType.INTEGER, -1));
        return description;
    }

    public DeviceEntityDescription get_Description() {
        return _entityDescription;
    }

}
