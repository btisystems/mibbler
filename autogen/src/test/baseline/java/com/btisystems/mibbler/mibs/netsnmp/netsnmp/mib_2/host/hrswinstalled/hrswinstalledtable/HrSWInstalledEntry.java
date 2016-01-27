
package com.btisystems.mibbler.mibs.netsnmp.netsnmp.mib_2.host.hrswinstalled.hrswinstalledtable;

import java.io.Serializable;
import com.btisystems.mibbler.mibs.netsnmp.interfaces.mib_2.host.hrswinstalled.hrswinstalledtable.IHrSWInstalledEntry;
import com.btisystems.mibbler.mibs.netsnmp.netsnmp.mib_2.host.hrswinstalled.HrSWInstalledTable;
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

public class HrSWInstalledEntry
    extends DeviceEntity
    implements Serializable, IHrSWInstalledEntry, IIndexed, IVariableBindingSetter
{

    private int hrSWInstalledIndex;
    private String hrSWInstalledName;
    private String hrSWInstalledID;
    private int hrSWInstalledType;
    private String hrSWInstalledDate;
    private String _index;
    private HrSWInstalledTable parentEntity;
    private final static DeviceEntityDescription _entityDescription = createEntityDescription();

    public HrSWInstalledEntry() {
    }

    public int getHrSWInstalledIndex() {
        return this.hrSWInstalledIndex;
    }

    public void setHrSWInstalledIndex(int hrSWInstalledIndex) {
        int oldValue = getHrSWInstalledIndex();
        this.hrSWInstalledIndex = hrSWInstalledIndex;
        notifyChange(1, oldValue, hrSWInstalledIndex);
    }

    public String getHrSWInstalledName() {
        return this.hrSWInstalledName;
    }

    public void setHrSWInstalledName(String hrSWInstalledName) {
        String oldValue = getHrSWInstalledName();
        this.hrSWInstalledName = hrSWInstalledName;
        notifyChange(2, oldValue, hrSWInstalledName);
    }

    public String getHrSWInstalledID() {
        return this.hrSWInstalledID;
    }

    public void setHrSWInstalledID(String hrSWInstalledID) {
        String oldValue = getHrSWInstalledID();
        this.hrSWInstalledID = hrSWInstalledID;
        notifyChange(3, oldValue, hrSWInstalledID);
    }

    public int getHrSWInstalledType() {
        return this.hrSWInstalledType;
    }

    public void setHrSWInstalledType(int hrSWInstalledType) {
        int oldValue = getHrSWInstalledType();
        this.hrSWInstalledType = hrSWInstalledType;
        notifyChange(4, oldValue, hrSWInstalledType);
    }

    public String getHrSWInstalledDate() {
        return this.hrSWInstalledDate;
    }

    public void setHrSWInstalledDate(String hrSWInstalledDate) {
        String oldValue = getHrSWInstalledDate();
        this.hrSWInstalledDate = hrSWInstalledDate;
        notifyChange(5, oldValue, hrSWInstalledDate);
    }

    public void set(VariableBinding binding) {
        switch (binding.getOid().get(10)) {
            case  1 :
                setHrSWInstalledIndex(binding.getVariable().toInt());
                break;
            case  2 :
                setHrSWInstalledName(binding.getVariable().toString());
                break;
            case  3 :
                setHrSWInstalledID(binding.getVariable().toString());
                break;
            case  4 :
                setHrSWInstalledType(binding.getVariable().toInt());
                break;
            case  5 :
                setHrSWInstalledDate(binding.getVariable().toString());
                break;
        }
    }

    public void _setIndex(OID oid) {
        byte[] _oidBytes = oid.toByteArray();
        int[] _oidInts = oid.toIntArray();
        int arrayOffset = 11;
        int _len;
        _index = new OID(_oidInts, 11, (oid.size()- 11)).toString();
        setHrSWInstalledIndex(_oidInts[arrayOffset]);
        arrayOffset += 1;
    }

    public String _getIndex() {
        return _index;
    }

    public void _setTable(HrSWInstalledTable table) {
        this.parentEntity = table;
    }

    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE).append("hrSWInstalledIndex", hrSWInstalledIndex).append("hrSWInstalledName", hrSWInstalledName).append("hrSWInstalledID", hrSWInstalledID).append("hrSWInstalledType", hrSWInstalledType).append("hrSWInstalledDate", hrSWInstalledDate).append("_index", _index).toString();
    }

    public int hashCode() {
        return new HashCodeBuilder().append(hrSWInstalledIndex).append(hrSWInstalledName).append(hrSWInstalledID).append(hrSWInstalledType).append(hrSWInstalledDate).append(_index).toHashCode();
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
        HrSWInstalledEntry rhs = ((HrSWInstalledEntry) obj);
        return new EqualsBuilder().append(hrSWInstalledIndex, rhs.hrSWInstalledIndex).append(hrSWInstalledName, rhs.hrSWInstalledName).append(hrSWInstalledID, rhs.hrSWInstalledID).append(hrSWInstalledType, rhs.hrSWInstalledType).append(hrSWInstalledDate, rhs.hrSWInstalledDate).append(_index, rhs._index).isEquals();
    }

    public HrSWInstalledEntry clone() {
        HrSWInstalledEntry _copy = new HrSWInstalledEntry();
        _copy.hrSWInstalledIndex = hrSWInstalledIndex;
        _copy.hrSWInstalledName = hrSWInstalledName;
        _copy.hrSWInstalledID = hrSWInstalledID;
        _copy.hrSWInstalledType = hrSWInstalledType;
        _copy.hrSWInstalledDate = hrSWInstalledDate;
        _copy._index = _index;
        _copy.parentEntity = parentEntity;
        return _copy;
    }

    private static DeviceEntityDescription createEntityDescription() {
        DeviceEntityDescription description = new DeviceEntityDescription(new OID("1.3.6.1.2.1.25.6.3.1"));
        description.addField(new DeviceEntityDescription.FieldDescription(1, "hrSWInstalledIndex", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(2, "hrSWInstalledName", DeviceEntityDescription.FieldType.STRING, 64));
        description.addField(new DeviceEntityDescription.FieldDescription(3, "hrSWInstalledID", DeviceEntityDescription.FieldType.OID, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(4, "hrSWInstalledType", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(5, "hrSWInstalledDate", DeviceEntityDescription.FieldType.DATE_AND_TIME, -1));
        return description;
    }

    public DeviceEntityDescription get_Description() {
        return _entityDescription;
    }

}
