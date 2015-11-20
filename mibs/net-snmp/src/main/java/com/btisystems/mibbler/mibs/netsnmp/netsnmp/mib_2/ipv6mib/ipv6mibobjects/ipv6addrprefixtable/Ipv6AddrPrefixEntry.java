
package com.btisystems.mibbler.mibs.netsnmp.netsnmp.mib_2.ipv6mib.ipv6mibobjects.ipv6addrprefixtable;

import java.io.Serializable;
import com.btisystems.mibbler.mibs.netsnmp.interfaces.mib_2.ipv6mib.ipv6mibobjects.ipv6addrprefixtable.IIpv6AddrPrefixEntry;
import com.btisystems.mibbler.mibs.netsnmp.netsnmp.mib_2.ipv6mib.ipv6mibobjects.Ipv6AddrPrefixTable;
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

public class Ipv6AddrPrefixEntry
    extends DeviceEntity
    implements Serializable, IIpv6AddrPrefixEntry, IIndexed, IVariableBindingSetter
{

    private String ipv6AddrPrefix;
    private int ipv6AddrPrefixLength;
    private int ipv6AddrPrefixOnLinkFlag;
    private int ipv6AddrPrefixAutonomousFlag;
    private int ipv6AddrPrefixAdvPreferredLifetime;
    private int ipv6AddrPrefixAdvValidLifetime;
    private String _index;
    private Ipv6AddrPrefixTable parentEntity;
    private final static DeviceEntityDescription _entityDescription = createEntityDescription();

    public Ipv6AddrPrefixEntry() {
    }

    public String getIpv6AddrPrefix() {
        return this.ipv6AddrPrefix;
    }

    public void setIpv6AddrPrefix(String ipv6AddrPrefix) {
        String oldValue = getIpv6AddrPrefix();
        this.ipv6AddrPrefix = ipv6AddrPrefix;
        notifyChange(1, oldValue, ipv6AddrPrefix);
    }

    public int getIpv6AddrPrefixLength() {
        return this.ipv6AddrPrefixLength;
    }

    public void setIpv6AddrPrefixLength(int ipv6AddrPrefixLength) {
        int oldValue = getIpv6AddrPrefixLength();
        this.ipv6AddrPrefixLength = ipv6AddrPrefixLength;
        notifyChange(2, oldValue, ipv6AddrPrefixLength);
    }

    public int getIpv6AddrPrefixOnLinkFlag() {
        return this.ipv6AddrPrefixOnLinkFlag;
    }

    public void setIpv6AddrPrefixOnLinkFlag(int ipv6AddrPrefixOnLinkFlag) {
        int oldValue = getIpv6AddrPrefixOnLinkFlag();
        this.ipv6AddrPrefixOnLinkFlag = ipv6AddrPrefixOnLinkFlag;
        notifyChange(3, oldValue, ipv6AddrPrefixOnLinkFlag);
    }

    public int getIpv6AddrPrefixAutonomousFlag() {
        return this.ipv6AddrPrefixAutonomousFlag;
    }

    public void setIpv6AddrPrefixAutonomousFlag(int ipv6AddrPrefixAutonomousFlag) {
        int oldValue = getIpv6AddrPrefixAutonomousFlag();
        this.ipv6AddrPrefixAutonomousFlag = ipv6AddrPrefixAutonomousFlag;
        notifyChange(4, oldValue, ipv6AddrPrefixAutonomousFlag);
    }

    public int getIpv6AddrPrefixAdvPreferredLifetime() {
        return this.ipv6AddrPrefixAdvPreferredLifetime;
    }

    public void setIpv6AddrPrefixAdvPreferredLifetime(int ipv6AddrPrefixAdvPreferredLifetime) {
        int oldValue = getIpv6AddrPrefixAdvPreferredLifetime();
        this.ipv6AddrPrefixAdvPreferredLifetime = ipv6AddrPrefixAdvPreferredLifetime;
        notifyChange(5, oldValue, ipv6AddrPrefixAdvPreferredLifetime);
    }

    public int getIpv6AddrPrefixAdvValidLifetime() {
        return this.ipv6AddrPrefixAdvValidLifetime;
    }

    public void setIpv6AddrPrefixAdvValidLifetime(int ipv6AddrPrefixAdvValidLifetime) {
        int oldValue = getIpv6AddrPrefixAdvValidLifetime();
        this.ipv6AddrPrefixAdvValidLifetime = ipv6AddrPrefixAdvValidLifetime;
        notifyChange(6, oldValue, ipv6AddrPrefixAdvValidLifetime);
    }

    public void set(VariableBinding binding) {
        switch (binding.getOid().get(10)) {
            case  1 :
                setIpv6AddrPrefix(binding.getVariable().toString());
                break;
            case  2 :
                setIpv6AddrPrefixLength(binding.getVariable().toInt());
                break;
            case  3 :
                setIpv6AddrPrefixOnLinkFlag(binding.getVariable().toInt());
                break;
            case  4 :
                setIpv6AddrPrefixAutonomousFlag(binding.getVariable().toInt());
                break;
            case  5 :
                setIpv6AddrPrefixAdvPreferredLifetime(binding.getVariable().toInt());
                break;
            case  6 :
                setIpv6AddrPrefixAdvValidLifetime(binding.getVariable().toInt());
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
        _len = _oidInts[arrayOffset ++];
        setIpv6AddrPrefix(new String(_oidBytes, arrayOffset, _len));
        arrayOffset += _len;
        setIpv6AddrPrefixLength(_oidInts[arrayOffset]);
        arrayOffset += 1;
    }

    public String _getIndex() {
        return _index;
    }

    public void _setTable(Ipv6AddrPrefixTable table) {
        this.parentEntity = table;
    }

    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE).append("ipv6AddrPrefix", ipv6AddrPrefix).append("ipv6AddrPrefixLength", ipv6AddrPrefixLength).append("ipv6AddrPrefixOnLinkFlag", ipv6AddrPrefixOnLinkFlag).append("ipv6AddrPrefixAutonomousFlag", ipv6AddrPrefixAutonomousFlag).append("ipv6AddrPrefixAdvPreferredLifetime", ipv6AddrPrefixAdvPreferredLifetime).append("ipv6AddrPrefixAdvValidLifetime", ipv6AddrPrefixAdvValidLifetime).append("_index", _index).toString();
    }

    public int hashCode() {
        return new HashCodeBuilder().append(ipv6AddrPrefix).append(ipv6AddrPrefixLength).append(ipv6AddrPrefixOnLinkFlag).append(ipv6AddrPrefixAutonomousFlag).append(ipv6AddrPrefixAdvPreferredLifetime).append(ipv6AddrPrefixAdvValidLifetime).append(_index).toHashCode();
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
        Ipv6AddrPrefixEntry rhs = ((Ipv6AddrPrefixEntry) obj);
        return new EqualsBuilder().append(ipv6AddrPrefix, rhs.ipv6AddrPrefix).append(ipv6AddrPrefixLength, rhs.ipv6AddrPrefixLength).append(ipv6AddrPrefixOnLinkFlag, rhs.ipv6AddrPrefixOnLinkFlag).append(ipv6AddrPrefixAutonomousFlag, rhs.ipv6AddrPrefixAutonomousFlag).append(ipv6AddrPrefixAdvPreferredLifetime, rhs.ipv6AddrPrefixAdvPreferredLifetime).append(ipv6AddrPrefixAdvValidLifetime, rhs.ipv6AddrPrefixAdvValidLifetime).append(_index, rhs._index).isEquals();
    }

    public Ipv6AddrPrefixEntry clone() {
        Ipv6AddrPrefixEntry _copy = new Ipv6AddrPrefixEntry();
        _copy.ipv6AddrPrefix = ipv6AddrPrefix;
        _copy.ipv6AddrPrefixLength = ipv6AddrPrefixLength;
        _copy.ipv6AddrPrefixOnLinkFlag = ipv6AddrPrefixOnLinkFlag;
        _copy.ipv6AddrPrefixAutonomousFlag = ipv6AddrPrefixAutonomousFlag;
        _copy.ipv6AddrPrefixAdvPreferredLifetime = ipv6AddrPrefixAdvPreferredLifetime;
        _copy.ipv6AddrPrefixAdvValidLifetime = ipv6AddrPrefixAdvValidLifetime;
        _copy._index = _index;
        _copy.parentEntity = parentEntity;
        return _copy;
    }

    private static DeviceEntityDescription createEntityDescription() {
        DeviceEntityDescription description = new DeviceEntityDescription(new OID("1.3.6.1.2.1.55.1.7.1"));
        description.addField(new DeviceEntityDescription.FieldDescription(1, "ipv6AddrPrefix", DeviceEntityDescription.FieldType.STRING, 40));
        description.addField(new DeviceEntityDescription.FieldDescription(2, "ipv6AddrPrefixLength", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(3, "ipv6AddrPrefixOnLinkFlag", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(4, "ipv6AddrPrefixAutonomousFlag", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(5, "ipv6AddrPrefixAdvPreferredLifetime", DeviceEntityDescription.FieldType.UNSIGNED32, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(6, "ipv6AddrPrefixAdvValidLifetime", DeviceEntityDescription.FieldType.UNSIGNED32, -1));
        return description;
    }

    public DeviceEntityDescription get_Description() {
        return _entityDescription;
    }

}
