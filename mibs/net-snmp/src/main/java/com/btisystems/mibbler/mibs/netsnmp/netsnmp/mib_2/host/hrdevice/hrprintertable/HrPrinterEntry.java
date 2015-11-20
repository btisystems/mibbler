
package com.btisystems.mibbler.mibs.netsnmp.netsnmp.mib_2.host.hrdevice.hrprintertable;

import java.io.Serializable;
import com.btisystems.mibbler.mibs.netsnmp.interfaces.mib_2.host.hrdevice.hrprintertable.IHrPrinterEntry;
import com.btisystems.mibbler.mibs.netsnmp.netsnmp.mib_2.host.hrdevice.HrPrinterTable;
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

public class HrPrinterEntry
    extends DeviceEntity
    implements Serializable, IHrPrinterEntry, IIndexed, IVariableBindingSetter
{

    private int hrPrinterStatus;
    private String hrPrinterDetectedErrorState;
    private String _index;
    private HrPrinterTable parentEntity;
    private final static DeviceEntityDescription _entityDescription = createEntityDescription();

    public HrPrinterEntry() {
    }

    public int getHrPrinterStatus() {
        return this.hrPrinterStatus;
    }

    public void setHrPrinterStatus(int hrPrinterStatus) {
        int oldValue = getHrPrinterStatus();
        this.hrPrinterStatus = hrPrinterStatus;
        notifyChange(1, oldValue, hrPrinterStatus);
    }

    public String getHrPrinterDetectedErrorState() {
        return this.hrPrinterDetectedErrorState;
    }

    public void setHrPrinterDetectedErrorState(String hrPrinterDetectedErrorState) {
        String oldValue = getHrPrinterDetectedErrorState();
        this.hrPrinterDetectedErrorState = hrPrinterDetectedErrorState;
        notifyChange(2, oldValue, hrPrinterDetectedErrorState);
    }

    public void set(VariableBinding binding) {
        switch (binding.getOid().get(10)) {
            case  1 :
                setHrPrinterStatus(binding.getVariable().toInt());
                break;
            case  2 :
                setHrPrinterDetectedErrorState(binding.getVariable().toString());
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
    }

    public String _getIndex() {
        return _index;
    }

    public void _setTable(HrPrinterTable table) {
        this.parentEntity = table;
    }

    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE).append("hrPrinterStatus", hrPrinterStatus).append("hrPrinterDetectedErrorState", hrPrinterDetectedErrorState).append("_index", _index).toString();
    }

    public int hashCode() {
        return new HashCodeBuilder().append(hrPrinterStatus).append(hrPrinterDetectedErrorState).append(_index).toHashCode();
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
        HrPrinterEntry rhs = ((HrPrinterEntry) obj);
        return new EqualsBuilder().append(hrPrinterStatus, rhs.hrPrinterStatus).append(hrPrinterDetectedErrorState, rhs.hrPrinterDetectedErrorState).append(_index, rhs._index).isEquals();
    }

    public HrPrinterEntry clone() {
        HrPrinterEntry _copy = new HrPrinterEntry();
        _copy.hrPrinterStatus = hrPrinterStatus;
        _copy.hrPrinterDetectedErrorState = hrPrinterDetectedErrorState;
        _copy._index = _index;
        _copy.parentEntity = parentEntity;
        return _copy;
    }

    private static DeviceEntityDescription createEntityDescription() {
        DeviceEntityDescription description = new DeviceEntityDescription(new OID("1.3.6.1.2.1.25.3.5.1"));
        description.addField(new DeviceEntityDescription.FieldDescription(1, "hrPrinterStatus", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(2, "hrPrinterDetectedErrorState", DeviceEntityDescription.FieldType.STRING, 65535));
        return description;
    }

    public DeviceEntityDescription get_Description() {
        return _entityDescription;
    }

}
