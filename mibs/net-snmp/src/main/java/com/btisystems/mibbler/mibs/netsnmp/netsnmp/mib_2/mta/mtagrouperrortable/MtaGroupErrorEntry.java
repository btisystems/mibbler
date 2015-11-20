
package com.btisystems.mibbler.mibs.netsnmp.netsnmp.mib_2.mta.mtagrouperrortable;

import java.io.Serializable;
import com.btisystems.mibbler.mibs.netsnmp.interfaces.mib_2.mta.mtagrouperrortable.IMtaGroupErrorEntry;
import com.btisystems.mibbler.mibs.netsnmp.netsnmp.mib_2.mta.MtaGroupErrorTable;
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

public class MtaGroupErrorEntry
    extends DeviceEntity
    implements Serializable, IMtaGroupErrorEntry, IIndexed, IVariableBindingSetter
{

    private int mtaGroupInboundErrorCount;
    private int mtaGroupInternalErrorCount;
    private int mtaGroupOutboundErrorCount;
    private int mtaStatusCode;
    private String _index;
    private MtaGroupErrorTable parentEntity;
    private final static DeviceEntityDescription _entityDescription = createEntityDescription();

    public MtaGroupErrorEntry() {
    }

    public int getMtaGroupInboundErrorCount() {
        return this.mtaGroupInboundErrorCount;
    }

    public void setMtaGroupInboundErrorCount(int mtaGroupInboundErrorCount) {
        int oldValue = getMtaGroupInboundErrorCount();
        this.mtaGroupInboundErrorCount = mtaGroupInboundErrorCount;
        notifyChange(1, oldValue, mtaGroupInboundErrorCount);
    }

    public int getMtaGroupInternalErrorCount() {
        return this.mtaGroupInternalErrorCount;
    }

    public void setMtaGroupInternalErrorCount(int mtaGroupInternalErrorCount) {
        int oldValue = getMtaGroupInternalErrorCount();
        this.mtaGroupInternalErrorCount = mtaGroupInternalErrorCount;
        notifyChange(2, oldValue, mtaGroupInternalErrorCount);
    }

    public int getMtaGroupOutboundErrorCount() {
        return this.mtaGroupOutboundErrorCount;
    }

    public void setMtaGroupOutboundErrorCount(int mtaGroupOutboundErrorCount) {
        int oldValue = getMtaGroupOutboundErrorCount();
        this.mtaGroupOutboundErrorCount = mtaGroupOutboundErrorCount;
        notifyChange(3, oldValue, mtaGroupOutboundErrorCount);
    }

    public int getMtaStatusCode() {
        return this.mtaStatusCode;
    }

    public void setMtaStatusCode(int mtaStatusCode) {
        int oldValue = getMtaStatusCode();
        this.mtaStatusCode = mtaStatusCode;
        notifyChange(4, oldValue, mtaStatusCode);
    }

    public void set(VariableBinding binding) {
        switch (binding.getOid().get(9)) {
            case  1 :
                setMtaGroupInboundErrorCount(binding.getVariable().toInt());
                break;
            case  2 :
                setMtaGroupInternalErrorCount(binding.getVariable().toInt());
                break;
            case  3 :
                setMtaGroupOutboundErrorCount(binding.getVariable().toInt());
                break;
            case  4 :
                setMtaStatusCode(binding.getVariable().toInt());
                break;
        }
    }

    public void _setIndex(OID oid) {
        byte[] _oidBytes = oid.toByteArray();
        int[] _oidInts = oid.toIntArray();
        int arrayOffset = 10;
        int _len;
        _index = new OID(_oidInts, 10, (oid.size()- 10)).toString();
        arrayOffset += 1;
        arrayOffset += 1;
        setMtaStatusCode(_oidInts[arrayOffset]);
        arrayOffset += 1;
    }

    public String _getIndex() {
        return _index;
    }

    public void _setTable(MtaGroupErrorTable table) {
        this.parentEntity = table;
    }

    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE).append("mtaGroupInboundErrorCount", mtaGroupInboundErrorCount).append("mtaGroupInternalErrorCount", mtaGroupInternalErrorCount).append("mtaGroupOutboundErrorCount", mtaGroupOutboundErrorCount).append("mtaStatusCode", mtaStatusCode).append("_index", _index).toString();
    }

    public int hashCode() {
        return new HashCodeBuilder().append(mtaGroupInboundErrorCount).append(mtaGroupInternalErrorCount).append(mtaGroupOutboundErrorCount).append(mtaStatusCode).append(_index).toHashCode();
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
        MtaGroupErrorEntry rhs = ((MtaGroupErrorEntry) obj);
        return new EqualsBuilder().append(mtaGroupInboundErrorCount, rhs.mtaGroupInboundErrorCount).append(mtaGroupInternalErrorCount, rhs.mtaGroupInternalErrorCount).append(mtaGroupOutboundErrorCount, rhs.mtaGroupOutboundErrorCount).append(mtaStatusCode, rhs.mtaStatusCode).append(_index, rhs._index).isEquals();
    }

    public MtaGroupErrorEntry clone() {
        MtaGroupErrorEntry _copy = new MtaGroupErrorEntry();
        _copy.mtaGroupInboundErrorCount = mtaGroupInboundErrorCount;
        _copy.mtaGroupInternalErrorCount = mtaGroupInternalErrorCount;
        _copy.mtaGroupOutboundErrorCount = mtaGroupOutboundErrorCount;
        _copy.mtaStatusCode = mtaStatusCode;
        _copy._index = _index;
        _copy.parentEntity = parentEntity;
        return _copy;
    }

    private static DeviceEntityDescription createEntityDescription() {
        DeviceEntityDescription description = new DeviceEntityDescription(new OID("1.3.6.1.2.1.28.5.1"));
        description.addField(new DeviceEntityDescription.FieldDescription(1, "mtaGroupInboundErrorCount", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(2, "mtaGroupInternalErrorCount", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(3, "mtaGroupOutboundErrorCount", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(4, "mtaStatusCode", DeviceEntityDescription.FieldType.INTEGER, -1));
        return description;
    }

    public DeviceEntityDescription get_Description() {
        return _entityDescription;
    }

}
