
package com.btisystems.mibbler.mibs.netsnmp.netsnmp.mib_2.ip.ipaddressprefixtable;

import java.io.Serializable;
import com.btisystems.mibbler.mibs.netsnmp.interfaces.mib_2.ip.ipaddressprefixtable.IIpAddressPrefixEntry;
import com.btisystems.mibbler.mibs.netsnmp.netsnmp.mib_2.ip.IpAddressPrefixTable;
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

public class IpAddressPrefixEntry
    extends DeviceEntity
    implements Serializable, IIpAddressPrefixEntry, IIndexed, IVariableBindingSetter
{

    private int ipAddressPrefixIfIndex;
    private int ipAddressPrefixType;
    private String ipAddressPrefixPrefix;
    private int ipAddressPrefixLength;
    private int ipAddressPrefixOrigin;
    private int ipAddressPrefixOnLinkFlag;
    private int ipAddressPrefixAutonomousFlag;
    private int ipAddressPrefixAdvPreferredLifetime;
    private int ipAddressPrefixAdvValidLifetime;
    private String _index;
    private IpAddressPrefixTable parentEntity;
    private final static DeviceEntityDescription _entityDescription = createEntityDescription();

    public IpAddressPrefixEntry() {
    }

    public int getIpAddressPrefixIfIndex() {
        return this.ipAddressPrefixIfIndex;
    }

    public void setIpAddressPrefixIfIndex(int ipAddressPrefixIfIndex) {
        int oldValue = getIpAddressPrefixIfIndex();
        this.ipAddressPrefixIfIndex = ipAddressPrefixIfIndex;
        notifyChange(1, oldValue, ipAddressPrefixIfIndex);
    }

    public int getIpAddressPrefixType() {
        return this.ipAddressPrefixType;
    }

    public void setIpAddressPrefixType(int ipAddressPrefixType) {
        int oldValue = getIpAddressPrefixType();
        this.ipAddressPrefixType = ipAddressPrefixType;
        notifyChange(2, oldValue, ipAddressPrefixType);
    }

    public String getIpAddressPrefixPrefix() {
        return this.ipAddressPrefixPrefix;
    }

    public void setIpAddressPrefixPrefix(String ipAddressPrefixPrefix) {
        String oldValue = getIpAddressPrefixPrefix();
        this.ipAddressPrefixPrefix = ipAddressPrefixPrefix;
        notifyChange(3, oldValue, ipAddressPrefixPrefix);
    }

    public int getIpAddressPrefixLength() {
        return this.ipAddressPrefixLength;
    }

    public void setIpAddressPrefixLength(int ipAddressPrefixLength) {
        int oldValue = getIpAddressPrefixLength();
        this.ipAddressPrefixLength = ipAddressPrefixLength;
        notifyChange(4, oldValue, ipAddressPrefixLength);
    }

    public int getIpAddressPrefixOrigin() {
        return this.ipAddressPrefixOrigin;
    }

    public void setIpAddressPrefixOrigin(int ipAddressPrefixOrigin) {
        int oldValue = getIpAddressPrefixOrigin();
        this.ipAddressPrefixOrigin = ipAddressPrefixOrigin;
        notifyChange(5, oldValue, ipAddressPrefixOrigin);
    }

    public int getIpAddressPrefixOnLinkFlag() {
        return this.ipAddressPrefixOnLinkFlag;
    }

    public void setIpAddressPrefixOnLinkFlag(int ipAddressPrefixOnLinkFlag) {
        int oldValue = getIpAddressPrefixOnLinkFlag();
        this.ipAddressPrefixOnLinkFlag = ipAddressPrefixOnLinkFlag;
        notifyChange(6, oldValue, ipAddressPrefixOnLinkFlag);
    }

    public int getIpAddressPrefixAutonomousFlag() {
        return this.ipAddressPrefixAutonomousFlag;
    }

    public void setIpAddressPrefixAutonomousFlag(int ipAddressPrefixAutonomousFlag) {
        int oldValue = getIpAddressPrefixAutonomousFlag();
        this.ipAddressPrefixAutonomousFlag = ipAddressPrefixAutonomousFlag;
        notifyChange(7, oldValue, ipAddressPrefixAutonomousFlag);
    }

    public int getIpAddressPrefixAdvPreferredLifetime() {
        return this.ipAddressPrefixAdvPreferredLifetime;
    }

    public void setIpAddressPrefixAdvPreferredLifetime(int ipAddressPrefixAdvPreferredLifetime) {
        int oldValue = getIpAddressPrefixAdvPreferredLifetime();
        this.ipAddressPrefixAdvPreferredLifetime = ipAddressPrefixAdvPreferredLifetime;
        notifyChange(8, oldValue, ipAddressPrefixAdvPreferredLifetime);
    }

    public int getIpAddressPrefixAdvValidLifetime() {
        return this.ipAddressPrefixAdvValidLifetime;
    }

    public void setIpAddressPrefixAdvValidLifetime(int ipAddressPrefixAdvValidLifetime) {
        int oldValue = getIpAddressPrefixAdvValidLifetime();
        this.ipAddressPrefixAdvValidLifetime = ipAddressPrefixAdvValidLifetime;
        notifyChange(9, oldValue, ipAddressPrefixAdvValidLifetime);
    }

    public void set(VariableBinding binding) {
        switch (binding.getOid().get(9)) {
            case  1 :
                setIpAddressPrefixIfIndex(binding.getVariable().toInt());
                break;
            case  2 :
                setIpAddressPrefixType(binding.getVariable().toInt());
                break;
            case  3 :
                setIpAddressPrefixPrefix(binding.getVariable().toString());
                break;
            case  4 :
                setIpAddressPrefixLength(binding.getVariable().toInt());
                break;
            case  5 :
                setIpAddressPrefixOrigin(binding.getVariable().toInt());
                break;
            case  6 :
                setIpAddressPrefixOnLinkFlag(binding.getVariable().toInt());
                break;
            case  7 :
                setIpAddressPrefixAutonomousFlag(binding.getVariable().toInt());
                break;
            case  8 :
                setIpAddressPrefixAdvPreferredLifetime(binding.getVariable().toInt());
                break;
            case  9 :
                setIpAddressPrefixAdvValidLifetime(binding.getVariable().toInt());
                break;
        }
    }

    public void _setIndex(OID oid) {
        byte[] _oidBytes = oid.toByteArray();
        int[] _oidInts = oid.toIntArray();
        int arrayOffset = 10;
        int _len;
        _index = new OID(_oidInts, 10, (oid.size()- 10)).toString();
        setIpAddressPrefixIfIndex(_oidInts[arrayOffset]);
        arrayOffset += 1;
        setIpAddressPrefixType(_oidInts[arrayOffset]);
        arrayOffset += 1;
        _len = _oidInts[arrayOffset ++];
        setIpAddressPrefixPrefix(_getObjectIdentifier(_oidInts, arrayOffset, _len));
        arrayOffset += _len;
        setIpAddressPrefixLength(_oidInts[arrayOffset]);
        arrayOffset += 1;
    }

    public String _getIndex() {
        return _index;
    }

    public void _setTable(IpAddressPrefixTable table) {
        this.parentEntity = table;
    }

    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE).append("ipAddressPrefixIfIndex", ipAddressPrefixIfIndex).append("ipAddressPrefixType", ipAddressPrefixType).append("ipAddressPrefixPrefix", ipAddressPrefixPrefix).append("ipAddressPrefixLength", ipAddressPrefixLength).append("ipAddressPrefixOrigin", ipAddressPrefixOrigin).append("ipAddressPrefixOnLinkFlag", ipAddressPrefixOnLinkFlag).append("ipAddressPrefixAutonomousFlag", ipAddressPrefixAutonomousFlag).append("ipAddressPrefixAdvPreferredLifetime", ipAddressPrefixAdvPreferredLifetime).append("ipAddressPrefixAdvValidLifetime", ipAddressPrefixAdvValidLifetime).append("_index", _index).toString();
    }

    public int hashCode() {
        return new HashCodeBuilder().append(ipAddressPrefixIfIndex).append(ipAddressPrefixType).append(ipAddressPrefixPrefix).append(ipAddressPrefixLength).append(ipAddressPrefixOrigin).append(ipAddressPrefixOnLinkFlag).append(ipAddressPrefixAutonomousFlag).append(ipAddressPrefixAdvPreferredLifetime).append(ipAddressPrefixAdvValidLifetime).append(_index).toHashCode();
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
        IpAddressPrefixEntry rhs = ((IpAddressPrefixEntry) obj);
        return new EqualsBuilder().append(ipAddressPrefixIfIndex, rhs.ipAddressPrefixIfIndex).append(ipAddressPrefixType, rhs.ipAddressPrefixType).append(ipAddressPrefixPrefix, rhs.ipAddressPrefixPrefix).append(ipAddressPrefixLength, rhs.ipAddressPrefixLength).append(ipAddressPrefixOrigin, rhs.ipAddressPrefixOrigin).append(ipAddressPrefixOnLinkFlag, rhs.ipAddressPrefixOnLinkFlag).append(ipAddressPrefixAutonomousFlag, rhs.ipAddressPrefixAutonomousFlag).append(ipAddressPrefixAdvPreferredLifetime, rhs.ipAddressPrefixAdvPreferredLifetime).append(ipAddressPrefixAdvValidLifetime, rhs.ipAddressPrefixAdvValidLifetime).append(_index, rhs._index).isEquals();
    }

    public IpAddressPrefixEntry clone() {
        IpAddressPrefixEntry _copy = new IpAddressPrefixEntry();
        _copy.ipAddressPrefixIfIndex = ipAddressPrefixIfIndex;
        _copy.ipAddressPrefixType = ipAddressPrefixType;
        _copy.ipAddressPrefixPrefix = ipAddressPrefixPrefix;
        _copy.ipAddressPrefixLength = ipAddressPrefixLength;
        _copy.ipAddressPrefixOrigin = ipAddressPrefixOrigin;
        _copy.ipAddressPrefixOnLinkFlag = ipAddressPrefixOnLinkFlag;
        _copy.ipAddressPrefixAutonomousFlag = ipAddressPrefixAutonomousFlag;
        _copy.ipAddressPrefixAdvPreferredLifetime = ipAddressPrefixAdvPreferredLifetime;
        _copy.ipAddressPrefixAdvValidLifetime = ipAddressPrefixAdvValidLifetime;
        _copy._index = _index;
        _copy.parentEntity = parentEntity;
        return _copy;
    }

    private static DeviceEntityDescription createEntityDescription() {
        DeviceEntityDescription description = new DeviceEntityDescription(new OID("1.3.6.1.2.1.4.32.1"));
        description.addField(new DeviceEntityDescription.FieldDescription(1, "ipAddressPrefixIfIndex", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(2, "ipAddressPrefixType", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(3, "ipAddressPrefixPrefix", DeviceEntityDescription.FieldType.STRING, 255));
        description.addField(new DeviceEntityDescription.FieldDescription(4, "ipAddressPrefixLength", DeviceEntityDescription.FieldType.UNSIGNED32, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(5, "ipAddressPrefixOrigin", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(6, "ipAddressPrefixOnLinkFlag", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(7, "ipAddressPrefixAutonomousFlag", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(8, "ipAddressPrefixAdvPreferredLifetime", DeviceEntityDescription.FieldType.UNSIGNED32, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(9, "ipAddressPrefixAdvValidLifetime", DeviceEntityDescription.FieldType.UNSIGNED32, -1));
        return description;
    }

    public DeviceEntityDescription get_Description() {
        return _entityDescription;
    }

}
