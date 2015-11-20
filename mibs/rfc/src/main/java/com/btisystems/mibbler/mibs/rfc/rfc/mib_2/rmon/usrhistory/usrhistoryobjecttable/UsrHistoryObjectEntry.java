
package com.btisystems.mibbler.mibs.rfc.rfc.mib_2.rmon.usrhistory.usrhistoryobjecttable;

import java.io.Serializable;
import com.btisystems.mibbler.mibs.rfc.interfaces.mib_2.rmon.usrhistory.usrhistoryobjecttable.IUsrHistoryObjectEntry;
import com.btisystems.mibbler.mibs.rfc.rfc.mib_2.rmon.usrhistory.UsrHistoryObjectTable;
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

public class UsrHistoryObjectEntry
    extends DeviceEntity
    implements Serializable, IUsrHistoryObjectEntry, IIndexed, IVariableBindingSetter
{

    private int usrHistoryObjectIndex;
    private String usrHistoryObjectVariable;
    private int usrHistoryObjectSampleType;
    private String _index;
    private UsrHistoryObjectTable parentEntity;
    private final static DeviceEntityDescription _entityDescription = createEntityDescription();

    public UsrHistoryObjectEntry() {
    }

    public int getUsrHistoryObjectIndex() {
        return this.usrHistoryObjectIndex;
    }

    public void setUsrHistoryObjectIndex(int usrHistoryObjectIndex) {
        int oldValue = getUsrHistoryObjectIndex();
        this.usrHistoryObjectIndex = usrHistoryObjectIndex;
        notifyChange(1, oldValue, usrHistoryObjectIndex);
    }

    public String getUsrHistoryObjectVariable() {
        return this.usrHistoryObjectVariable;
    }

    public void setUsrHistoryObjectVariable(String usrHistoryObjectVariable) {
        String oldValue = getUsrHistoryObjectVariable();
        this.usrHistoryObjectVariable = usrHistoryObjectVariable;
        notifyChange(2, oldValue, usrHistoryObjectVariable);
    }

    public int getUsrHistoryObjectSampleType() {
        return this.usrHistoryObjectSampleType;
    }

    public void setUsrHistoryObjectSampleType(int usrHistoryObjectSampleType) {
        int oldValue = getUsrHistoryObjectSampleType();
        this.usrHistoryObjectSampleType = usrHistoryObjectSampleType;
        notifyChange(3, oldValue, usrHistoryObjectSampleType);
    }

    public void set(VariableBinding binding) {
        switch (binding.getOid().get(10)) {
            case  1 :
                setUsrHistoryObjectIndex(binding.getVariable().toInt());
                break;
            case  2 :
                setUsrHistoryObjectVariable(binding.getVariable().toString());
                break;
            case  3 :
                setUsrHistoryObjectSampleType(binding.getVariable().toInt());
                break;
        }
    }

    public void _setIndex(OID oid) {
        byte[] _oidBytes = oid.toByteArray();
        int[] _oidInts = oid.toIntArray();
        int arrayOffset = 11;
        int _len;
        _index = new OID(_oidInts, 11, (oid.size()- 11)).toString();
        arrayOffset += 1;
        setUsrHistoryObjectIndex(_oidInts[arrayOffset]);
        arrayOffset += 1;
    }

    public String _getIndex() {
        return _index;
    }

    public void _setTable(UsrHistoryObjectTable table) {
        this.parentEntity = table;
    }

    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE).append("usrHistoryObjectIndex", usrHistoryObjectIndex).append("usrHistoryObjectVariable", usrHistoryObjectVariable).append("usrHistoryObjectSampleType", usrHistoryObjectSampleType).append("_index", _index).toString();
    }

    public int hashCode() {
        return new HashCodeBuilder().append(usrHistoryObjectIndex).append(usrHistoryObjectVariable).append(usrHistoryObjectSampleType).append(_index).toHashCode();
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
        UsrHistoryObjectEntry rhs = ((UsrHistoryObjectEntry) obj);
        return new EqualsBuilder().append(usrHistoryObjectIndex, rhs.usrHistoryObjectIndex).append(usrHistoryObjectVariable, rhs.usrHistoryObjectVariable).append(usrHistoryObjectSampleType, rhs.usrHistoryObjectSampleType).append(_index, rhs._index).isEquals();
    }

    public UsrHistoryObjectEntry clone() {
        UsrHistoryObjectEntry _copy = new UsrHistoryObjectEntry();
        _copy.usrHistoryObjectIndex = usrHistoryObjectIndex;
        _copy.usrHistoryObjectVariable = usrHistoryObjectVariable;
        _copy.usrHistoryObjectSampleType = usrHistoryObjectSampleType;
        _copy._index = _index;
        _copy.parentEntity = parentEntity;
        return _copy;
    }

    private static DeviceEntityDescription createEntityDescription() {
        DeviceEntityDescription description = new DeviceEntityDescription(new OID("1.3.6.1.2.1.16.18.2.1"));
        description.addField(new DeviceEntityDescription.FieldDescription(1, "usrHistoryObjectIndex", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(2, "usrHistoryObjectVariable", DeviceEntityDescription.FieldType.OID, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(3, "usrHistoryObjectSampleType", DeviceEntityDescription.FieldType.INTEGER, -1));
        return description;
    }

    public DeviceEntityDescription get_Description() {
        return _entityDescription;
    }

}
