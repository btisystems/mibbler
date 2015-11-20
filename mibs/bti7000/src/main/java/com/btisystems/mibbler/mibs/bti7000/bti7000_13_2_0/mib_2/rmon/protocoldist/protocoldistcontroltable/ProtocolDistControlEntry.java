
package com.btisystems.mibbler.mibs.bti7000.bti7000_13_2_0.mib_2.rmon.protocoldist.protocoldistcontroltable;

import java.io.Serializable;
import com.btisystems.mibbler.mibs.bti7000.bti7000_13_2_0.mib_2.rmon.protocoldist.ProtocolDistControlTable;
import com.btisystems.mibbler.mibs.bti7000.interfaces.mib_2.rmon.protocoldist.protocoldistcontroltable.IProtocolDistControlEntry;
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

public class ProtocolDistControlEntry
    extends DeviceEntity
    implements Serializable, IProtocolDistControlEntry, IIndexed, IVariableBindingSetter
{

    private int protocolDistControlIndex;
    private String protocolDistControlDataSource;
    private int protocolDistControlDroppedFrames;
    private int protocolDistControlCreateTime;
    private String protocolDistControlOwner;
    private int protocolDistControlStatus;
    private String _index;
    private ProtocolDistControlTable parentEntity;
    private final static DeviceEntityDescription _entityDescription = createEntityDescription();

    public ProtocolDistControlEntry() {
    }

    public int getProtocolDistControlIndex() {
        return this.protocolDistControlIndex;
    }

    public void setProtocolDistControlIndex(int protocolDistControlIndex) {
        int oldValue = getProtocolDistControlIndex();
        this.protocolDistControlIndex = protocolDistControlIndex;
        notifyChange(1, oldValue, protocolDistControlIndex);
    }

    public String getProtocolDistControlDataSource() {
        return this.protocolDistControlDataSource;
    }

    public void setProtocolDistControlDataSource(String protocolDistControlDataSource) {
        String oldValue = getProtocolDistControlDataSource();
        this.protocolDistControlDataSource = protocolDistControlDataSource;
        notifyChange(2, oldValue, protocolDistControlDataSource);
    }

    public int getProtocolDistControlDroppedFrames() {
        return this.protocolDistControlDroppedFrames;
    }

    public void setProtocolDistControlDroppedFrames(int protocolDistControlDroppedFrames) {
        int oldValue = getProtocolDistControlDroppedFrames();
        this.protocolDistControlDroppedFrames = protocolDistControlDroppedFrames;
        notifyChange(3, oldValue, protocolDistControlDroppedFrames);
    }

    public int getProtocolDistControlCreateTime() {
        return this.protocolDistControlCreateTime;
    }

    public void setProtocolDistControlCreateTime(int protocolDistControlCreateTime) {
        int oldValue = getProtocolDistControlCreateTime();
        this.protocolDistControlCreateTime = protocolDistControlCreateTime;
        notifyChange(4, oldValue, protocolDistControlCreateTime);
    }

    public String getProtocolDistControlOwner() {
        return this.protocolDistControlOwner;
    }

    public void setProtocolDistControlOwner(String protocolDistControlOwner) {
        String oldValue = getProtocolDistControlOwner();
        this.protocolDistControlOwner = protocolDistControlOwner;
        notifyChange(5, oldValue, protocolDistControlOwner);
    }

    public int getProtocolDistControlStatus() {
        return this.protocolDistControlStatus;
    }

    public void setProtocolDistControlStatus(int protocolDistControlStatus) {
        int oldValue = getProtocolDistControlStatus();
        this.protocolDistControlStatus = protocolDistControlStatus;
        notifyChange(6, oldValue, protocolDistControlStatus);
    }

    public void set(VariableBinding binding) {
        switch (binding.getOid().get(10)) {
            case  1 :
                setProtocolDistControlIndex(binding.getVariable().toInt());
                break;
            case  2 :
                setProtocolDistControlDataSource(binding.getVariable().toString());
                break;
            case  3 :
                setProtocolDistControlDroppedFrames(binding.getVariable().toInt());
                break;
            case  4 :
                setProtocolDistControlCreateTime(binding.getVariable().toInt());
                break;
            case  5 :
                setProtocolDistControlOwner(binding.getVariable().toString());
                break;
            case  6 :
                setProtocolDistControlStatus(binding.getVariable().toInt());
                break;
        }
    }

    public void _setIndex(OID oid) {
        byte[] _oidBytes = oid.toByteArray();
        int[] _oidInts = oid.toIntArray();
        int arrayOffset = 11;
        int _len;
        _index = new OID(_oidInts, 11, (oid.size()- 11)).toString();
        setProtocolDistControlIndex(_oidInts[arrayOffset]);
        arrayOffset += 1;
    }

    public String _getIndex() {
        return _index;
    }

    public void _setTable(ProtocolDistControlTable table) {
        this.parentEntity = table;
    }

    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE).append("protocolDistControlIndex", protocolDistControlIndex).append("protocolDistControlDataSource", protocolDistControlDataSource).append("protocolDistControlDroppedFrames", protocolDistControlDroppedFrames).append("protocolDistControlCreateTime", protocolDistControlCreateTime).append("protocolDistControlOwner", protocolDistControlOwner).append("protocolDistControlStatus", protocolDistControlStatus).append("_index", _index).toString();
    }

    public int hashCode() {
        return new HashCodeBuilder().append(protocolDistControlIndex).append(protocolDistControlDataSource).append(protocolDistControlDroppedFrames).append(protocolDistControlCreateTime).append(protocolDistControlOwner).append(protocolDistControlStatus).append(_index).toHashCode();
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
        ProtocolDistControlEntry rhs = ((ProtocolDistControlEntry) obj);
        return new EqualsBuilder().append(protocolDistControlIndex, rhs.protocolDistControlIndex).append(protocolDistControlDataSource, rhs.protocolDistControlDataSource).append(protocolDistControlDroppedFrames, rhs.protocolDistControlDroppedFrames).append(protocolDistControlCreateTime, rhs.protocolDistControlCreateTime).append(protocolDistControlOwner, rhs.protocolDistControlOwner).append(protocolDistControlStatus, rhs.protocolDistControlStatus).append(_index, rhs._index).isEquals();
    }

    public ProtocolDistControlEntry clone() {
        ProtocolDistControlEntry _copy = new ProtocolDistControlEntry();
        _copy.protocolDistControlIndex = protocolDistControlIndex;
        _copy.protocolDistControlDataSource = protocolDistControlDataSource;
        _copy.protocolDistControlDroppedFrames = protocolDistControlDroppedFrames;
        _copy.protocolDistControlCreateTime = protocolDistControlCreateTime;
        _copy.protocolDistControlOwner = protocolDistControlOwner;
        _copy.protocolDistControlStatus = protocolDistControlStatus;
        _copy._index = _index;
        _copy.parentEntity = parentEntity;
        return _copy;
    }

    private static DeviceEntityDescription createEntityDescription() {
        DeviceEntityDescription description = new DeviceEntityDescription(new OID("1.3.6.1.2.1.16.12.1.1"));
        description.addField(new DeviceEntityDescription.FieldDescription(1, "protocolDistControlIndex", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(2, "protocolDistControlDataSource", DeviceEntityDescription.FieldType.OID, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(3, "protocolDistControlDroppedFrames", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(4, "protocolDistControlCreateTime", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(5, "protocolDistControlOwner", DeviceEntityDescription.FieldType.STRING, 127));
        description.addField(new DeviceEntityDescription.FieldDescription(6, "protocolDistControlStatus", DeviceEntityDescription.FieldType.INTEGER, -1));
        return description;
    }

    public DeviceEntityDescription get_Description() {
        return _entityDescription;
    }

}
