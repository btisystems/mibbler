
package com.btisystems.mibbler.mibs.netsnmp.netsnmp.mib_2.host.hrswrunperf.hrswrunperftable;

import java.io.Serializable;
import com.btisystems.mibbler.mibs.netsnmp.interfaces.mib_2.host.hrswrunperf.hrswrunperftable.IHrSWRunPerfEntry;
import com.btisystems.mibbler.mibs.netsnmp.netsnmp.mib_2.host.hrswrunperf.HrSWRunPerfTable;
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

public class HrSWRunPerfEntry
    extends DeviceEntity
    implements Serializable, IHrSWRunPerfEntry, IIndexed, IVariableBindingSetter
{

    private int hrSWRunPerfCPU;
    private int hrSWRunPerfMem;
    private String _index;
    private HrSWRunPerfTable parentEntity;
    private final static DeviceEntityDescription _entityDescription = createEntityDescription();

    public HrSWRunPerfEntry() {
    }

    public int getHrSWRunPerfCPU() {
        return this.hrSWRunPerfCPU;
    }

    public void setHrSWRunPerfCPU(int hrSWRunPerfCPU) {
        int oldValue = getHrSWRunPerfCPU();
        this.hrSWRunPerfCPU = hrSWRunPerfCPU;
        notifyChange(1, oldValue, hrSWRunPerfCPU);
    }

    public int getHrSWRunPerfMem() {
        return this.hrSWRunPerfMem;
    }

    public void setHrSWRunPerfMem(int hrSWRunPerfMem) {
        int oldValue = getHrSWRunPerfMem();
        this.hrSWRunPerfMem = hrSWRunPerfMem;
        notifyChange(2, oldValue, hrSWRunPerfMem);
    }

    public void set(VariableBinding binding) {
        switch (binding.getOid().get(10)) {
            case  1 :
                setHrSWRunPerfCPU(binding.getVariable().toInt());
                break;
            case  2 :
                setHrSWRunPerfMem(binding.getVariable().toInt());
                break;
        }
    }

    public void _setIndex(OID oid) {
        byte[] _oidBytes = oid.toByteArray();
        int[] _oidInts = oid.toIntArray();
        int arrayOffset = 11;
        int _len;
        _index = new OID(_oidInts, 11, (oid.size()- 11)).toString();
    }

    public String _getIndex() {
        return _index;
    }

    public void _setTable(HrSWRunPerfTable table) {
        this.parentEntity = table;
    }

    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE).append("hrSWRunPerfCPU", hrSWRunPerfCPU).append("hrSWRunPerfMem", hrSWRunPerfMem).append("_index", _index).toString();
    }

    public int hashCode() {
        return new HashCodeBuilder().append(hrSWRunPerfCPU).append(hrSWRunPerfMem).append(_index).toHashCode();
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
        HrSWRunPerfEntry rhs = ((HrSWRunPerfEntry) obj);
        return new EqualsBuilder().append(hrSWRunPerfCPU, rhs.hrSWRunPerfCPU).append(hrSWRunPerfMem, rhs.hrSWRunPerfMem).append(_index, rhs._index).isEquals();
    }

    public HrSWRunPerfEntry clone() {
        HrSWRunPerfEntry _copy = new HrSWRunPerfEntry();
        _copy.hrSWRunPerfCPU = hrSWRunPerfCPU;
        _copy.hrSWRunPerfMem = hrSWRunPerfMem;
        _copy._index = _index;
        _copy.parentEntity = parentEntity;
        return _copy;
    }

    private static DeviceEntityDescription createEntityDescription() {
        DeviceEntityDescription description = new DeviceEntityDescription(new OID("1.3.6.1.2.1.25.5.1.1"));
        description.addField(new DeviceEntityDescription.FieldDescription(1, "hrSWRunPerfCPU", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(2, "hrSWRunPerfMem", DeviceEntityDescription.FieldType.INTEGER, -1));
        return description;
    }

    public DeviceEntityDescription get_Description() {
        return _entityDescription;
    }

}
