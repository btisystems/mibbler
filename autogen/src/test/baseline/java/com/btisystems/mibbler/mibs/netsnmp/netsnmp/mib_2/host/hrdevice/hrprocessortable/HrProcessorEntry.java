
package com.btisystems.mibbler.mibs.netsnmp.netsnmp.mib_2.host.hrdevice.hrprocessortable;

import java.io.Serializable;
import com.btisystems.mibbler.mibs.netsnmp.interfaces.mib_2.host.hrdevice.hrprocessortable.IHrProcessorEntry;
import com.btisystems.mibbler.mibs.netsnmp.netsnmp.mib_2.host.hrdevice.HrProcessorTable;
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

public class HrProcessorEntry
    extends DeviceEntity
    implements Serializable, IHrProcessorEntry, IIndexed, IVariableBindingSetter
{

    private String hrProcessorFrwID;
    private int hrProcessorLoad;
    private String _index;
    private HrProcessorTable parentEntity;
    private final static DeviceEntityDescription _entityDescription = createEntityDescription();

    public HrProcessorEntry() {
    }

    public String getHrProcessorFrwID() {
        return this.hrProcessorFrwID;
    }

    public void setHrProcessorFrwID(String hrProcessorFrwID) {
        String oldValue = getHrProcessorFrwID();
        this.hrProcessorFrwID = hrProcessorFrwID;
        notifyChange(1, oldValue, hrProcessorFrwID);
    }

    public int getHrProcessorLoad() {
        return this.hrProcessorLoad;
    }

    public void setHrProcessorLoad(int hrProcessorLoad) {
        int oldValue = getHrProcessorLoad();
        this.hrProcessorLoad = hrProcessorLoad;
        notifyChange(2, oldValue, hrProcessorLoad);
    }

    public void set(VariableBinding binding) {
        switch (binding.getOid().get(10)) {
            case  1 :
                setHrProcessorFrwID(binding.getVariable().toString());
                break;
            case  2 :
                setHrProcessorLoad(binding.getVariable().toInt());
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

    public void _setTable(HrProcessorTable table) {
        this.parentEntity = table;
    }

    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE).append("hrProcessorFrwID", hrProcessorFrwID).append("hrProcessorLoad", hrProcessorLoad).append("_index", _index).toString();
    }

    public int hashCode() {
        return new HashCodeBuilder().append(hrProcessorFrwID).append(hrProcessorLoad).append(_index).toHashCode();
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
        HrProcessorEntry rhs = ((HrProcessorEntry) obj);
        return new EqualsBuilder().append(hrProcessorFrwID, rhs.hrProcessorFrwID).append(hrProcessorLoad, rhs.hrProcessorLoad).append(_index, rhs._index).isEquals();
    }

    public HrProcessorEntry clone() {
        HrProcessorEntry _copy = new HrProcessorEntry();
        _copy.hrProcessorFrwID = hrProcessorFrwID;
        _copy.hrProcessorLoad = hrProcessorLoad;
        _copy._index = _index;
        _copy.parentEntity = parentEntity;
        return _copy;
    }

    private static DeviceEntityDescription createEntityDescription() {
        DeviceEntityDescription description = new DeviceEntityDescription(new OID("1.3.6.1.2.1.25.3.3.1"));
        description.addField(new DeviceEntityDescription.FieldDescription(1, "hrProcessorFrwID", DeviceEntityDescription.FieldType.OID, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(2, "hrProcessorLoad", DeviceEntityDescription.FieldType.INTEGER, -1));
        return description;
    }

    public DeviceEntityDescription get_Description() {
        return _entityDescription;
    }

}
