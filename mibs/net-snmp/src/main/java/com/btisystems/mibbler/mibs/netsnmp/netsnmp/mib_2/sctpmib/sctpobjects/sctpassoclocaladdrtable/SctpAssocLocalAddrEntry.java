
package com.btisystems.mibbler.mibs.netsnmp.netsnmp.mib_2.sctpmib.sctpobjects.sctpassoclocaladdrtable;

import java.io.Serializable;
import com.btisystems.mibbler.mibs.netsnmp.interfaces.mib_2.sctpmib.sctpobjects.sctpassoclocaladdrtable.ISctpAssocLocalAddrEntry;
import com.btisystems.mibbler.mibs.netsnmp.netsnmp.mib_2.sctpmib.sctpobjects.SctpAssocLocalAddrTable;
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

public class SctpAssocLocalAddrEntry
    extends DeviceEntity
    implements Serializable, ISctpAssocLocalAddrEntry, IIndexed, IVariableBindingSetter
{

    private int sctpAssocLocalAddrType;
    private String sctpAssocLocalAddr;
    private int sctpAssocLocalAddrStartTime;
    private String _index;
    private SctpAssocLocalAddrTable parentEntity;
    private final static DeviceEntityDescription _entityDescription = createEntityDescription();

    public SctpAssocLocalAddrEntry() {
    }

    public int getSctpAssocLocalAddrType() {
        return this.sctpAssocLocalAddrType;
    }

    public void setSctpAssocLocalAddrType(int sctpAssocLocalAddrType) {
        int oldValue = getSctpAssocLocalAddrType();
        this.sctpAssocLocalAddrType = sctpAssocLocalAddrType;
        notifyChange(1, oldValue, sctpAssocLocalAddrType);
    }

    public String getSctpAssocLocalAddr() {
        return this.sctpAssocLocalAddr;
    }

    public void setSctpAssocLocalAddr(String sctpAssocLocalAddr) {
        String oldValue = getSctpAssocLocalAddr();
        this.sctpAssocLocalAddr = sctpAssocLocalAddr;
        notifyChange(2, oldValue, sctpAssocLocalAddr);
    }

    public int getSctpAssocLocalAddrStartTime() {
        return this.sctpAssocLocalAddrStartTime;
    }

    public void setSctpAssocLocalAddrStartTime(int sctpAssocLocalAddrStartTime) {
        int oldValue = getSctpAssocLocalAddrStartTime();
        this.sctpAssocLocalAddrStartTime = sctpAssocLocalAddrStartTime;
        notifyChange(3, oldValue, sctpAssocLocalAddrStartTime);
    }

    public void set(VariableBinding binding) {
        switch (binding.getOid().get(10)) {
            case  1 :
                setSctpAssocLocalAddrType(binding.getVariable().toInt());
                break;
            case  2 :
                setSctpAssocLocalAddr(binding.getVariable().toString());
                break;
            case  3 :
                setSctpAssocLocalAddrStartTime(binding.getVariable().toInt());
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
        setSctpAssocLocalAddrType(_oidInts[arrayOffset]);
        arrayOffset += 1;
        _len = _oidInts[arrayOffset ++];
        setSctpAssocLocalAddr(_getObjectIdentifier(_oidInts, arrayOffset, _len));
        arrayOffset += _len;
    }

    public String _getIndex() {
        return _index;
    }

    public void _setTable(SctpAssocLocalAddrTable table) {
        this.parentEntity = table;
    }

    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE).append("sctpAssocLocalAddrType", sctpAssocLocalAddrType).append("sctpAssocLocalAddr", sctpAssocLocalAddr).append("sctpAssocLocalAddrStartTime", sctpAssocLocalAddrStartTime).append("_index", _index).toString();
    }

    public int hashCode() {
        return new HashCodeBuilder().append(sctpAssocLocalAddrType).append(sctpAssocLocalAddr).append(sctpAssocLocalAddrStartTime).append(_index).toHashCode();
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
        SctpAssocLocalAddrEntry rhs = ((SctpAssocLocalAddrEntry) obj);
        return new EqualsBuilder().append(sctpAssocLocalAddrType, rhs.sctpAssocLocalAddrType).append(sctpAssocLocalAddr, rhs.sctpAssocLocalAddr).append(sctpAssocLocalAddrStartTime, rhs.sctpAssocLocalAddrStartTime).append(_index, rhs._index).isEquals();
    }

    public SctpAssocLocalAddrEntry clone() {
        SctpAssocLocalAddrEntry _copy = new SctpAssocLocalAddrEntry();
        _copy.sctpAssocLocalAddrType = sctpAssocLocalAddrType;
        _copy.sctpAssocLocalAddr = sctpAssocLocalAddr;
        _copy.sctpAssocLocalAddrStartTime = sctpAssocLocalAddrStartTime;
        _copy._index = _index;
        _copy.parentEntity = parentEntity;
        return _copy;
    }

    private static DeviceEntityDescription createEntityDescription() {
        DeviceEntityDescription description = new DeviceEntityDescription(new OID("1.3.6.1.2.1.104.1.4.1"));
        description.addField(new DeviceEntityDescription.FieldDescription(1, "sctpAssocLocalAddrType", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(2, "sctpAssocLocalAddr", DeviceEntityDescription.FieldType.STRING, 255));
        description.addField(new DeviceEntityDescription.FieldDescription(3, "sctpAssocLocalAddrStartTime", DeviceEntityDescription.FieldType.INTEGER, -1));
        return description;
    }

    public DeviceEntityDescription get_Description() {
        return _entityDescription;
    }

}
