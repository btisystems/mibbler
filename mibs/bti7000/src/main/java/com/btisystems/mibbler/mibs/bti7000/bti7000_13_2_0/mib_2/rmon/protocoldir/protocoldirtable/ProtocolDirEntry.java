
package com.btisystems.mibbler.mibs.bti7000.bti7000_13_2_0.mib_2.rmon.protocoldir.protocoldirtable;

import java.io.Serializable;
import com.btisystems.mibbler.mibs.bti7000.bti7000_13_2_0.mib_2.rmon.protocoldir.ProtocolDirTable;
import com.btisystems.mibbler.mibs.bti7000.interfaces.mib_2.rmon.protocoldir.protocoldirtable.IProtocolDirEntry;
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

public class ProtocolDirEntry
    extends DeviceEntity
    implements Serializable, IProtocolDirEntry, IIndexed, IVariableBindingSetter
{

    private String protocolDirID;
    private String protocolDirParameters;
    private int protocolDirLocalIndex;
    private String protocolDirDescr;
    private String protocolDirType;
    private int protocolDirAddressMapConfig;
    private int protocolDirHostConfig;
    private int protocolDirMatrixConfig;
    private String protocolDirOwner;
    private int protocolDirStatus;
    private String _index;
    private ProtocolDirTable parentEntity;
    private final static DeviceEntityDescription _entityDescription = createEntityDescription();

    public ProtocolDirEntry() {
    }

    public String getProtocolDirID() {
        return this.protocolDirID;
    }

    public void setProtocolDirID(String protocolDirID) {
        String oldValue = getProtocolDirID();
        this.protocolDirID = protocolDirID;
        notifyChange(1, oldValue, protocolDirID);
    }

    public String getProtocolDirParameters() {
        return this.protocolDirParameters;
    }

    public void setProtocolDirParameters(String protocolDirParameters) {
        String oldValue = getProtocolDirParameters();
        this.protocolDirParameters = protocolDirParameters;
        notifyChange(2, oldValue, protocolDirParameters);
    }

    public int getProtocolDirLocalIndex() {
        return this.protocolDirLocalIndex;
    }

    public void setProtocolDirLocalIndex(int protocolDirLocalIndex) {
        int oldValue = getProtocolDirLocalIndex();
        this.protocolDirLocalIndex = protocolDirLocalIndex;
        notifyChange(3, oldValue, protocolDirLocalIndex);
    }

    public String getProtocolDirDescr() {
        return this.protocolDirDescr;
    }

    public void setProtocolDirDescr(String protocolDirDescr) {
        String oldValue = getProtocolDirDescr();
        this.protocolDirDescr = protocolDirDescr;
        notifyChange(4, oldValue, protocolDirDescr);
    }

    public String getProtocolDirType() {
        return this.protocolDirType;
    }

    public void setProtocolDirType(String protocolDirType) {
        String oldValue = getProtocolDirType();
        this.protocolDirType = protocolDirType;
        notifyChange(5, oldValue, protocolDirType);
    }

    public int getProtocolDirAddressMapConfig() {
        return this.protocolDirAddressMapConfig;
    }

    public void setProtocolDirAddressMapConfig(int protocolDirAddressMapConfig) {
        int oldValue = getProtocolDirAddressMapConfig();
        this.protocolDirAddressMapConfig = protocolDirAddressMapConfig;
        notifyChange(6, oldValue, protocolDirAddressMapConfig);
    }

    public int getProtocolDirHostConfig() {
        return this.protocolDirHostConfig;
    }

    public void setProtocolDirHostConfig(int protocolDirHostConfig) {
        int oldValue = getProtocolDirHostConfig();
        this.protocolDirHostConfig = protocolDirHostConfig;
        notifyChange(7, oldValue, protocolDirHostConfig);
    }

    public int getProtocolDirMatrixConfig() {
        return this.protocolDirMatrixConfig;
    }

    public void setProtocolDirMatrixConfig(int protocolDirMatrixConfig) {
        int oldValue = getProtocolDirMatrixConfig();
        this.protocolDirMatrixConfig = protocolDirMatrixConfig;
        notifyChange(8, oldValue, protocolDirMatrixConfig);
    }

    public String getProtocolDirOwner() {
        return this.protocolDirOwner;
    }

    public void setProtocolDirOwner(String protocolDirOwner) {
        String oldValue = getProtocolDirOwner();
        this.protocolDirOwner = protocolDirOwner;
        notifyChange(9, oldValue, protocolDirOwner);
    }

    public int getProtocolDirStatus() {
        return this.protocolDirStatus;
    }

    public void setProtocolDirStatus(int protocolDirStatus) {
        int oldValue = getProtocolDirStatus();
        this.protocolDirStatus = protocolDirStatus;
        notifyChange(10, oldValue, protocolDirStatus);
    }

    public void set(VariableBinding binding) {
        switch (binding.getOid().get(10)) {
            case  1 :
                setProtocolDirID(binding.getVariable().toString());
                break;
            case  2 :
                setProtocolDirParameters(binding.getVariable().toString());
                break;
            case  3 :
                setProtocolDirLocalIndex(binding.getVariable().toInt());
                break;
            case  4 :
                setProtocolDirDescr(binding.getVariable().toString());
                break;
            case  5 :
                setProtocolDirType(binding.getVariable().toString());
                break;
            case  6 :
                setProtocolDirAddressMapConfig(binding.getVariable().toInt());
                break;
            case  7 :
                setProtocolDirHostConfig(binding.getVariable().toInt());
                break;
            case  8 :
                setProtocolDirMatrixConfig(binding.getVariable().toInt());
                break;
            case  9 :
                setProtocolDirOwner(binding.getVariable().toString());
                break;
            case  10 :
                setProtocolDirStatus(binding.getVariable().toInt());
                break;
        }
    }

    public void _setIndex(OID oid) {
        byte[] _oidBytes = oid.toByteArray();
        int[] _oidInts = oid.toIntArray();
        int arrayOffset = 11;
        int _len;
        _index = new OID(_oidInts, 11, (oid.size()- 11)).toString();
        _len = _oidInts[arrayOffset ++];
        setProtocolDirID(new String(_oidBytes, arrayOffset, _len));
        arrayOffset += _len;
        _len = _oidInts[arrayOffset ++];
        setProtocolDirParameters(new String(_oidBytes, arrayOffset, _len));
        arrayOffset += _len;
    }

    public String _getIndex() {
        return _index;
    }

    public void _setTable(ProtocolDirTable table) {
        this.parentEntity = table;
    }

    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE).append("protocolDirID", protocolDirID).append("protocolDirParameters", protocolDirParameters).append("protocolDirLocalIndex", protocolDirLocalIndex).append("protocolDirDescr", protocolDirDescr).append("protocolDirType", protocolDirType).append("protocolDirAddressMapConfig", protocolDirAddressMapConfig).append("protocolDirHostConfig", protocolDirHostConfig).append("protocolDirMatrixConfig", protocolDirMatrixConfig).append("protocolDirOwner", protocolDirOwner).append("protocolDirStatus", protocolDirStatus).append("_index", _index).toString();
    }

    public int hashCode() {
        return new HashCodeBuilder().append(protocolDirID).append(protocolDirParameters).append(protocolDirLocalIndex).append(protocolDirDescr).append(protocolDirType).append(protocolDirAddressMapConfig).append(protocolDirHostConfig).append(protocolDirMatrixConfig).append(protocolDirOwner).append(protocolDirStatus).append(_index).toHashCode();
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
        ProtocolDirEntry rhs = ((ProtocolDirEntry) obj);
        return new EqualsBuilder().append(protocolDirID, rhs.protocolDirID).append(protocolDirParameters, rhs.protocolDirParameters).append(protocolDirLocalIndex, rhs.protocolDirLocalIndex).append(protocolDirDescr, rhs.protocolDirDescr).append(protocolDirType, rhs.protocolDirType).append(protocolDirAddressMapConfig, rhs.protocolDirAddressMapConfig).append(protocolDirHostConfig, rhs.protocolDirHostConfig).append(protocolDirMatrixConfig, rhs.protocolDirMatrixConfig).append(protocolDirOwner, rhs.protocolDirOwner).append(protocolDirStatus, rhs.protocolDirStatus).append(_index, rhs._index).isEquals();
    }

    public ProtocolDirEntry clone() {
        ProtocolDirEntry _copy = new ProtocolDirEntry();
        _copy.protocolDirID = protocolDirID;
        _copy.protocolDirParameters = protocolDirParameters;
        _copy.protocolDirLocalIndex = protocolDirLocalIndex;
        _copy.protocolDirDescr = protocolDirDescr;
        _copy.protocolDirType = protocolDirType;
        _copy.protocolDirAddressMapConfig = protocolDirAddressMapConfig;
        _copy.protocolDirHostConfig = protocolDirHostConfig;
        _copy.protocolDirMatrixConfig = protocolDirMatrixConfig;
        _copy.protocolDirOwner = protocolDirOwner;
        _copy.protocolDirStatus = protocolDirStatus;
        _copy._index = _index;
        _copy.parentEntity = parentEntity;
        return _copy;
    }

    private static DeviceEntityDescription createEntityDescription() {
        DeviceEntityDescription description = new DeviceEntityDescription(new OID("1.3.6.1.2.1.16.11.2.1"));
        description.addField(new DeviceEntityDescription.FieldDescription(1, "protocolDirID", DeviceEntityDescription.FieldType.STRING, 128));
        description.addField(new DeviceEntityDescription.FieldDescription(2, "protocolDirParameters", DeviceEntityDescription.FieldType.STRING, 32));
        description.addField(new DeviceEntityDescription.FieldDescription(3, "protocolDirLocalIndex", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(4, "protocolDirDescr", DeviceEntityDescription.FieldType.STRING, 255));
        description.addField(new DeviceEntityDescription.FieldDescription(5, "protocolDirType", DeviceEntityDescription.FieldType.BITS, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(6, "protocolDirAddressMapConfig", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(7, "protocolDirHostConfig", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(8, "protocolDirMatrixConfig", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(9, "protocolDirOwner", DeviceEntityDescription.FieldType.STRING, 127));
        description.addField(new DeviceEntityDescription.FieldDescription(10, "protocolDirStatus", DeviceEntityDescription.FieldType.INTEGER, -1));
        return description;
    }

    public DeviceEntityDescription get_Description() {
        return _entityDescription;
    }

}
