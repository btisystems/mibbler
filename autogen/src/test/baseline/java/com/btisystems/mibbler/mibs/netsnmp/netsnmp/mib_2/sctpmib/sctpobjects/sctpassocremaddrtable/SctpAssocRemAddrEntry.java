
package com.btisystems.mibbler.mibs.netsnmp.netsnmp.mib_2.sctpmib.sctpobjects.sctpassocremaddrtable;

import java.io.Serializable;
import com.btisystems.mibbler.mibs.netsnmp.interfaces.mib_2.sctpmib.sctpobjects.sctpassocremaddrtable.ISctpAssocRemAddrEntry;
import com.btisystems.mibbler.mibs.netsnmp.netsnmp.mib_2.sctpmib.sctpobjects.SctpAssocRemAddrTable;
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

public class SctpAssocRemAddrEntry
    extends DeviceEntity
    implements Serializable, ISctpAssocRemAddrEntry, IIndexed, IVariableBindingSetter
{

    private int sctpAssocRemAddrType;
    private String sctpAssocRemAddr;
    private int sctpAssocRemAddrActive;
    private int sctpAssocRemAddrHBActive;
    private int sctpAssocRemAddrRTO;
    private Integer sctpAssocRemAddrMaxPathRtx;
    private int sctpAssocRemAddrRtx;
    private int sctpAssocRemAddrStartTime;
    private String _index;
    private SctpAssocRemAddrTable parentEntity;
    private final static DeviceEntityDescription _entityDescription = createEntityDescription();

    public SctpAssocRemAddrEntry() {
    }

    public int getSctpAssocRemAddrType() {
        return this.sctpAssocRemAddrType;
    }

    public void setSctpAssocRemAddrType(int sctpAssocRemAddrType) {
        int oldValue = getSctpAssocRemAddrType();
        this.sctpAssocRemAddrType = sctpAssocRemAddrType;
        notifyChange(1, oldValue, sctpAssocRemAddrType);
    }

    public String getSctpAssocRemAddr() {
        return this.sctpAssocRemAddr;
    }

    public void setSctpAssocRemAddr(String sctpAssocRemAddr) {
        String oldValue = getSctpAssocRemAddr();
        this.sctpAssocRemAddr = sctpAssocRemAddr;
        notifyChange(2, oldValue, sctpAssocRemAddr);
    }

    public int getSctpAssocRemAddrActive() {
        return this.sctpAssocRemAddrActive;
    }

    public void setSctpAssocRemAddrActive(int sctpAssocRemAddrActive) {
        int oldValue = getSctpAssocRemAddrActive();
        this.sctpAssocRemAddrActive = sctpAssocRemAddrActive;
        notifyChange(3, oldValue, sctpAssocRemAddrActive);
    }

    public int getSctpAssocRemAddrHBActive() {
        return this.sctpAssocRemAddrHBActive;
    }

    public void setSctpAssocRemAddrHBActive(int sctpAssocRemAddrHBActive) {
        int oldValue = getSctpAssocRemAddrHBActive();
        this.sctpAssocRemAddrHBActive = sctpAssocRemAddrHBActive;
        notifyChange(4, oldValue, sctpAssocRemAddrHBActive);
    }

    public int getSctpAssocRemAddrRTO() {
        return this.sctpAssocRemAddrRTO;
    }

    public void setSctpAssocRemAddrRTO(int sctpAssocRemAddrRTO) {
        int oldValue = getSctpAssocRemAddrRTO();
        this.sctpAssocRemAddrRTO = sctpAssocRemAddrRTO;
        notifyChange(5, oldValue, sctpAssocRemAddrRTO);
    }

    public int getSctpAssocRemAddrMaxPathRtx() {
        if (this.sctpAssocRemAddrMaxPathRtx == null) {
            return  5;
        }
        return this.sctpAssocRemAddrMaxPathRtx;
    }

    public boolean isSctpAssocRemAddrMaxPathRtxDefined() {
        return (this.sctpAssocRemAddrMaxPathRtx!= null);
    }

    public void setSctpAssocRemAddrMaxPathRtx(int sctpAssocRemAddrMaxPathRtx) {
        int oldValue = getSctpAssocRemAddrMaxPathRtx();
        this.sctpAssocRemAddrMaxPathRtx = sctpAssocRemAddrMaxPathRtx;
        notifyChange(6, oldValue, sctpAssocRemAddrMaxPathRtx);
    }

    public int getSctpAssocRemAddrRtx() {
        return this.sctpAssocRemAddrRtx;
    }

    public void setSctpAssocRemAddrRtx(int sctpAssocRemAddrRtx) {
        int oldValue = getSctpAssocRemAddrRtx();
        this.sctpAssocRemAddrRtx = sctpAssocRemAddrRtx;
        notifyChange(7, oldValue, sctpAssocRemAddrRtx);
    }

    public int getSctpAssocRemAddrStartTime() {
        return this.sctpAssocRemAddrStartTime;
    }

    public void setSctpAssocRemAddrStartTime(int sctpAssocRemAddrStartTime) {
        int oldValue = getSctpAssocRemAddrStartTime();
        this.sctpAssocRemAddrStartTime = sctpAssocRemAddrStartTime;
        notifyChange(8, oldValue, sctpAssocRemAddrStartTime);
    }

    public void set(VariableBinding binding) {
        switch (binding.getOid().get(10)) {
            case  1 :
                setSctpAssocRemAddrType(binding.getVariable().toInt());
                break;
            case  2 :
                setSctpAssocRemAddr(binding.getVariable().toString());
                break;
            case  3 :
                setSctpAssocRemAddrActive(binding.getVariable().toInt());
                break;
            case  4 :
                setSctpAssocRemAddrHBActive(binding.getVariable().toInt());
                break;
            case  5 :
                setSctpAssocRemAddrRTO(binding.getVariable().toInt());
                break;
            case  6 :
                setSctpAssocRemAddrMaxPathRtx(binding.getVariable().toInt());
                break;
            case  7 :
                setSctpAssocRemAddrRtx(binding.getVariable().toInt());
                break;
            case  8 :
                setSctpAssocRemAddrStartTime(binding.getVariable().toInt());
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
        setSctpAssocRemAddrType(_oidInts[arrayOffset]);
        arrayOffset += 1;
        _len = _oidInts[arrayOffset ++];
        setSctpAssocRemAddr(_getObjectIdentifier(_oidInts, arrayOffset, _len));
        arrayOffset += _len;
    }

    public String _getIndex() {
        return _index;
    }

    public void _setTable(SctpAssocRemAddrTable table) {
        this.parentEntity = table;
    }

    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE).append("sctpAssocRemAddrType", sctpAssocRemAddrType).append("sctpAssocRemAddr", sctpAssocRemAddr).append("sctpAssocRemAddrActive", sctpAssocRemAddrActive).append("sctpAssocRemAddrHBActive", sctpAssocRemAddrHBActive).append("sctpAssocRemAddrRTO", sctpAssocRemAddrRTO).append("sctpAssocRemAddrMaxPathRtx", sctpAssocRemAddrMaxPathRtx).append("sctpAssocRemAddrRtx", sctpAssocRemAddrRtx).append("sctpAssocRemAddrStartTime", sctpAssocRemAddrStartTime).append("_index", _index).toString();
    }

    public int hashCode() {
        return new HashCodeBuilder().append(sctpAssocRemAddrType).append(sctpAssocRemAddr).append(sctpAssocRemAddrActive).append(sctpAssocRemAddrHBActive).append(sctpAssocRemAddrRTO).append(sctpAssocRemAddrMaxPathRtx).append(sctpAssocRemAddrRtx).append(sctpAssocRemAddrStartTime).append(_index).toHashCode();
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
        SctpAssocRemAddrEntry rhs = ((SctpAssocRemAddrEntry) obj);
        return new EqualsBuilder().append(sctpAssocRemAddrType, rhs.sctpAssocRemAddrType).append(sctpAssocRemAddr, rhs.sctpAssocRemAddr).append(sctpAssocRemAddrActive, rhs.sctpAssocRemAddrActive).append(sctpAssocRemAddrHBActive, rhs.sctpAssocRemAddrHBActive).append(sctpAssocRemAddrRTO, rhs.sctpAssocRemAddrRTO).append(sctpAssocRemAddrMaxPathRtx, rhs.sctpAssocRemAddrMaxPathRtx).append(sctpAssocRemAddrRtx, rhs.sctpAssocRemAddrRtx).append(sctpAssocRemAddrStartTime, rhs.sctpAssocRemAddrStartTime).append(_index, rhs._index).isEquals();
    }

    public SctpAssocRemAddrEntry clone() {
        SctpAssocRemAddrEntry _copy = new SctpAssocRemAddrEntry();
        _copy.sctpAssocRemAddrType = sctpAssocRemAddrType;
        _copy.sctpAssocRemAddr = sctpAssocRemAddr;
        _copy.sctpAssocRemAddrActive = sctpAssocRemAddrActive;
        _copy.sctpAssocRemAddrHBActive = sctpAssocRemAddrHBActive;
        _copy.sctpAssocRemAddrRTO = sctpAssocRemAddrRTO;
        _copy.sctpAssocRemAddrMaxPathRtx = sctpAssocRemAddrMaxPathRtx;
        _copy.sctpAssocRemAddrRtx = sctpAssocRemAddrRtx;
        _copy.sctpAssocRemAddrStartTime = sctpAssocRemAddrStartTime;
        _copy._index = _index;
        _copy.parentEntity = parentEntity;
        return _copy;
    }

    private static DeviceEntityDescription createEntityDescription() {
        DeviceEntityDescription description = new DeviceEntityDescription(new OID("1.3.6.1.2.1.104.1.5.1"));
        description.addField(new DeviceEntityDescription.FieldDescription(1, "sctpAssocRemAddrType", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(2, "sctpAssocRemAddr", DeviceEntityDescription.FieldType.STRING, 255));
        description.addField(new DeviceEntityDescription.FieldDescription(3, "sctpAssocRemAddrActive", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(4, "sctpAssocRemAddrHBActive", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(5, "sctpAssocRemAddrRTO", DeviceEntityDescription.FieldType.UNSIGNED32, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(6, "sctpAssocRemAddrMaxPathRtx", DeviceEntityDescription.FieldType.UNSIGNED32, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(7, "sctpAssocRemAddrRtx", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(8, "sctpAssocRemAddrStartTime", DeviceEntityDescription.FieldType.INTEGER, -1));
        return description;
    }

    public DeviceEntityDescription get_Description() {
        return _entityDescription;
    }

}
