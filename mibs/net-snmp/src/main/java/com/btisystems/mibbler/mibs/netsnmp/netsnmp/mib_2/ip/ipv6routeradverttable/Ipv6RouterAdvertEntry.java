
package com.btisystems.mibbler.mibs.netsnmp.netsnmp.mib_2.ip.ipv6routeradverttable;

import java.io.Serializable;
import com.btisystems.mibbler.mibs.netsnmp.interfaces.mib_2.ip.ipv6routeradverttable.IIpv6RouterAdvertEntry;
import com.btisystems.mibbler.mibs.netsnmp.netsnmp.mib_2.ip.Ipv6RouterAdvertTable;
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

public class Ipv6RouterAdvertEntry
    extends DeviceEntity
    implements Serializable, IIpv6RouterAdvertEntry, IIndexed, IVariableBindingSetter
{

    private int ipv6RouterAdvertIfIndex;
    private Integer ipv6RouterAdvertSendAdverts;
    private Integer ipv6RouterAdvertMaxInterval;
    private int ipv6RouterAdvertMinInterval;
    private Integer ipv6RouterAdvertManagedFlag;
    private Integer ipv6RouterAdvertOtherConfigFlag;
    private Integer ipv6RouterAdvertLinkMTU;
    private Integer ipv6RouterAdvertReachableTime;
    private Integer ipv6RouterAdvertRetransmitTime;
    private int ipv6RouterAdvertCurHopLimit;
    private int ipv6RouterAdvertDefaultLifetime;
    private int ipv6RouterAdvertRowStatus;
    private String _index;
    private Ipv6RouterAdvertTable parentEntity;
    private final static DeviceEntityDescription _entityDescription = createEntityDescription();

    public Ipv6RouterAdvertEntry() {
    }

    public int getIpv6RouterAdvertIfIndex() {
        return this.ipv6RouterAdvertIfIndex;
    }

    public void setIpv6RouterAdvertIfIndex(int ipv6RouterAdvertIfIndex) {
        int oldValue = getIpv6RouterAdvertIfIndex();
        this.ipv6RouterAdvertIfIndex = ipv6RouterAdvertIfIndex;
        notifyChange(1, oldValue, ipv6RouterAdvertIfIndex);
    }

    public int getIpv6RouterAdvertSendAdverts() {
        if (this.ipv6RouterAdvertSendAdverts == null) {
            return  2;
        }
        return this.ipv6RouterAdvertSendAdverts;
    }

    public boolean isIpv6RouterAdvertSendAdvertsDefined() {
        return (this.ipv6RouterAdvertSendAdverts!= null);
    }

    public void setIpv6RouterAdvertSendAdverts(int ipv6RouterAdvertSendAdverts) {
        int oldValue = getIpv6RouterAdvertSendAdverts();
        this.ipv6RouterAdvertSendAdverts = ipv6RouterAdvertSendAdverts;
        notifyChange(2, oldValue, ipv6RouterAdvertSendAdverts);
    }

    public int getIpv6RouterAdvertMaxInterval() {
        if (this.ipv6RouterAdvertMaxInterval == null) {
            return  600;
        }
        return this.ipv6RouterAdvertMaxInterval;
    }

    public boolean isIpv6RouterAdvertMaxIntervalDefined() {
        return (this.ipv6RouterAdvertMaxInterval!= null);
    }

    public void setIpv6RouterAdvertMaxInterval(int ipv6RouterAdvertMaxInterval) {
        int oldValue = getIpv6RouterAdvertMaxInterval();
        this.ipv6RouterAdvertMaxInterval = ipv6RouterAdvertMaxInterval;
        notifyChange(3, oldValue, ipv6RouterAdvertMaxInterval);
    }

    public int getIpv6RouterAdvertMinInterval() {
        return this.ipv6RouterAdvertMinInterval;
    }

    public void setIpv6RouterAdvertMinInterval(int ipv6RouterAdvertMinInterval) {
        int oldValue = getIpv6RouterAdvertMinInterval();
        this.ipv6RouterAdvertMinInterval = ipv6RouterAdvertMinInterval;
        notifyChange(4, oldValue, ipv6RouterAdvertMinInterval);
    }

    public int getIpv6RouterAdvertManagedFlag() {
        if (this.ipv6RouterAdvertManagedFlag == null) {
            return  2;
        }
        return this.ipv6RouterAdvertManagedFlag;
    }

    public boolean isIpv6RouterAdvertManagedFlagDefined() {
        return (this.ipv6RouterAdvertManagedFlag!= null);
    }

    public void setIpv6RouterAdvertManagedFlag(int ipv6RouterAdvertManagedFlag) {
        int oldValue = getIpv6RouterAdvertManagedFlag();
        this.ipv6RouterAdvertManagedFlag = ipv6RouterAdvertManagedFlag;
        notifyChange(5, oldValue, ipv6RouterAdvertManagedFlag);
    }

    public int getIpv6RouterAdvertOtherConfigFlag() {
        if (this.ipv6RouterAdvertOtherConfigFlag == null) {
            return  2;
        }
        return this.ipv6RouterAdvertOtherConfigFlag;
    }

    public boolean isIpv6RouterAdvertOtherConfigFlagDefined() {
        return (this.ipv6RouterAdvertOtherConfigFlag!= null);
    }

    public void setIpv6RouterAdvertOtherConfigFlag(int ipv6RouterAdvertOtherConfigFlag) {
        int oldValue = getIpv6RouterAdvertOtherConfigFlag();
        this.ipv6RouterAdvertOtherConfigFlag = ipv6RouterAdvertOtherConfigFlag;
        notifyChange(6, oldValue, ipv6RouterAdvertOtherConfigFlag);
    }

    public int getIpv6RouterAdvertLinkMTU() {
        if (this.ipv6RouterAdvertLinkMTU == null) {
            return  0;
        }
        return this.ipv6RouterAdvertLinkMTU;
    }

    public boolean isIpv6RouterAdvertLinkMTUDefined() {
        return (this.ipv6RouterAdvertLinkMTU!= null);
    }

    public void setIpv6RouterAdvertLinkMTU(int ipv6RouterAdvertLinkMTU) {
        int oldValue = getIpv6RouterAdvertLinkMTU();
        this.ipv6RouterAdvertLinkMTU = ipv6RouterAdvertLinkMTU;
        notifyChange(7, oldValue, ipv6RouterAdvertLinkMTU);
    }

    public int getIpv6RouterAdvertReachableTime() {
        if (this.ipv6RouterAdvertReachableTime == null) {
            return  0;
        }
        return this.ipv6RouterAdvertReachableTime;
    }

    public boolean isIpv6RouterAdvertReachableTimeDefined() {
        return (this.ipv6RouterAdvertReachableTime!= null);
    }

    public void setIpv6RouterAdvertReachableTime(int ipv6RouterAdvertReachableTime) {
        int oldValue = getIpv6RouterAdvertReachableTime();
        this.ipv6RouterAdvertReachableTime = ipv6RouterAdvertReachableTime;
        notifyChange(8, oldValue, ipv6RouterAdvertReachableTime);
    }

    public int getIpv6RouterAdvertRetransmitTime() {
        if (this.ipv6RouterAdvertRetransmitTime == null) {
            return  0;
        }
        return this.ipv6RouterAdvertRetransmitTime;
    }

    public boolean isIpv6RouterAdvertRetransmitTimeDefined() {
        return (this.ipv6RouterAdvertRetransmitTime!= null);
    }

    public void setIpv6RouterAdvertRetransmitTime(int ipv6RouterAdvertRetransmitTime) {
        int oldValue = getIpv6RouterAdvertRetransmitTime();
        this.ipv6RouterAdvertRetransmitTime = ipv6RouterAdvertRetransmitTime;
        notifyChange(9, oldValue, ipv6RouterAdvertRetransmitTime);
    }

    public int getIpv6RouterAdvertCurHopLimit() {
        return this.ipv6RouterAdvertCurHopLimit;
    }

    public void setIpv6RouterAdvertCurHopLimit(int ipv6RouterAdvertCurHopLimit) {
        int oldValue = getIpv6RouterAdvertCurHopLimit();
        this.ipv6RouterAdvertCurHopLimit = ipv6RouterAdvertCurHopLimit;
        notifyChange(10, oldValue, ipv6RouterAdvertCurHopLimit);
    }

    public int getIpv6RouterAdvertDefaultLifetime() {
        return this.ipv6RouterAdvertDefaultLifetime;
    }

    public void setIpv6RouterAdvertDefaultLifetime(int ipv6RouterAdvertDefaultLifetime) {
        int oldValue = getIpv6RouterAdvertDefaultLifetime();
        this.ipv6RouterAdvertDefaultLifetime = ipv6RouterAdvertDefaultLifetime;
        notifyChange(11, oldValue, ipv6RouterAdvertDefaultLifetime);
    }

    public int getIpv6RouterAdvertRowStatus() {
        return this.ipv6RouterAdvertRowStatus;
    }

    public void setIpv6RouterAdvertRowStatus(int ipv6RouterAdvertRowStatus) {
        int oldValue = getIpv6RouterAdvertRowStatus();
        this.ipv6RouterAdvertRowStatus = ipv6RouterAdvertRowStatus;
        notifyChange(12, oldValue, ipv6RouterAdvertRowStatus);
    }

    public void set(VariableBinding binding) {
        switch (binding.getOid().get(9)) {
            case  1 :
                setIpv6RouterAdvertIfIndex(binding.getVariable().toInt());
                break;
            case  2 :
                setIpv6RouterAdvertSendAdverts(binding.getVariable().toInt());
                break;
            case  3 :
                setIpv6RouterAdvertMaxInterval(binding.getVariable().toInt());
                break;
            case  4 :
                setIpv6RouterAdvertMinInterval(binding.getVariable().toInt());
                break;
            case  5 :
                setIpv6RouterAdvertManagedFlag(binding.getVariable().toInt());
                break;
            case  6 :
                setIpv6RouterAdvertOtherConfigFlag(binding.getVariable().toInt());
                break;
            case  7 :
                setIpv6RouterAdvertLinkMTU(binding.getVariable().toInt());
                break;
            case  8 :
                setIpv6RouterAdvertReachableTime(binding.getVariable().toInt());
                break;
            case  9 :
                setIpv6RouterAdvertRetransmitTime(binding.getVariable().toInt());
                break;
            case  10 :
                setIpv6RouterAdvertCurHopLimit(binding.getVariable().toInt());
                break;
            case  11 :
                setIpv6RouterAdvertDefaultLifetime(binding.getVariable().toInt());
                break;
            case  12 :
                setIpv6RouterAdvertRowStatus(binding.getVariable().toInt());
                break;
        }
    }

    public void _setIndex(OID oid) {
        byte[] _oidBytes = oid.toByteArray();
        int[] _oidInts = oid.toIntArray();
        int arrayOffset = 10;
        int _len;
        _index = new OID(_oidInts, 10, (oid.size()- 10)).toString();
        setIpv6RouterAdvertIfIndex(_oidInts[arrayOffset]);
        arrayOffset += 1;
    }

    public String _getIndex() {
        return _index;
    }

    public void _setTable(Ipv6RouterAdvertTable table) {
        this.parentEntity = table;
    }

    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE).append("ipv6RouterAdvertIfIndex", ipv6RouterAdvertIfIndex).append("ipv6RouterAdvertSendAdverts", ipv6RouterAdvertSendAdverts).append("ipv6RouterAdvertMaxInterval", ipv6RouterAdvertMaxInterval).append("ipv6RouterAdvertMinInterval", ipv6RouterAdvertMinInterval).append("ipv6RouterAdvertManagedFlag", ipv6RouterAdvertManagedFlag).append("ipv6RouterAdvertOtherConfigFlag", ipv6RouterAdvertOtherConfigFlag).append("ipv6RouterAdvertLinkMTU", ipv6RouterAdvertLinkMTU).append("ipv6RouterAdvertReachableTime", ipv6RouterAdvertReachableTime).append("ipv6RouterAdvertRetransmitTime", ipv6RouterAdvertRetransmitTime).append("ipv6RouterAdvertCurHopLimit", ipv6RouterAdvertCurHopLimit).append("ipv6RouterAdvertDefaultLifetime", ipv6RouterAdvertDefaultLifetime).append("ipv6RouterAdvertRowStatus", ipv6RouterAdvertRowStatus).append("_index", _index).toString();
    }

    public int hashCode() {
        return new HashCodeBuilder().append(ipv6RouterAdvertIfIndex).append(ipv6RouterAdvertSendAdverts).append(ipv6RouterAdvertMaxInterval).append(ipv6RouterAdvertMinInterval).append(ipv6RouterAdvertManagedFlag).append(ipv6RouterAdvertOtherConfigFlag).append(ipv6RouterAdvertLinkMTU).append(ipv6RouterAdvertReachableTime).append(ipv6RouterAdvertRetransmitTime).append(ipv6RouterAdvertCurHopLimit).append(ipv6RouterAdvertDefaultLifetime).append(ipv6RouterAdvertRowStatus).append(_index).toHashCode();
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
        Ipv6RouterAdvertEntry rhs = ((Ipv6RouterAdvertEntry) obj);
        return new EqualsBuilder().append(ipv6RouterAdvertIfIndex, rhs.ipv6RouterAdvertIfIndex).append(ipv6RouterAdvertSendAdverts, rhs.ipv6RouterAdvertSendAdverts).append(ipv6RouterAdvertMaxInterval, rhs.ipv6RouterAdvertMaxInterval).append(ipv6RouterAdvertMinInterval, rhs.ipv6RouterAdvertMinInterval).append(ipv6RouterAdvertManagedFlag, rhs.ipv6RouterAdvertManagedFlag).append(ipv6RouterAdvertOtherConfigFlag, rhs.ipv6RouterAdvertOtherConfigFlag).append(ipv6RouterAdvertLinkMTU, rhs.ipv6RouterAdvertLinkMTU).append(ipv6RouterAdvertReachableTime, rhs.ipv6RouterAdvertReachableTime).append(ipv6RouterAdvertRetransmitTime, rhs.ipv6RouterAdvertRetransmitTime).append(ipv6RouterAdvertCurHopLimit, rhs.ipv6RouterAdvertCurHopLimit).append(ipv6RouterAdvertDefaultLifetime, rhs.ipv6RouterAdvertDefaultLifetime).append(ipv6RouterAdvertRowStatus, rhs.ipv6RouterAdvertRowStatus).append(_index, rhs._index).isEquals();
    }

    public Ipv6RouterAdvertEntry clone() {
        Ipv6RouterAdvertEntry _copy = new Ipv6RouterAdvertEntry();
        _copy.ipv6RouterAdvertIfIndex = ipv6RouterAdvertIfIndex;
        _copy.ipv6RouterAdvertSendAdverts = ipv6RouterAdvertSendAdverts;
        _copy.ipv6RouterAdvertMaxInterval = ipv6RouterAdvertMaxInterval;
        _copy.ipv6RouterAdvertMinInterval = ipv6RouterAdvertMinInterval;
        _copy.ipv6RouterAdvertManagedFlag = ipv6RouterAdvertManagedFlag;
        _copy.ipv6RouterAdvertOtherConfigFlag = ipv6RouterAdvertOtherConfigFlag;
        _copy.ipv6RouterAdvertLinkMTU = ipv6RouterAdvertLinkMTU;
        _copy.ipv6RouterAdvertReachableTime = ipv6RouterAdvertReachableTime;
        _copy.ipv6RouterAdvertRetransmitTime = ipv6RouterAdvertRetransmitTime;
        _copy.ipv6RouterAdvertCurHopLimit = ipv6RouterAdvertCurHopLimit;
        _copy.ipv6RouterAdvertDefaultLifetime = ipv6RouterAdvertDefaultLifetime;
        _copy.ipv6RouterAdvertRowStatus = ipv6RouterAdvertRowStatus;
        _copy._index = _index;
        _copy.parentEntity = parentEntity;
        return _copy;
    }

    private static DeviceEntityDescription createEntityDescription() {
        DeviceEntityDescription description = new DeviceEntityDescription(new OID("1.3.6.1.2.1.4.39.1"));
        description.addField(new DeviceEntityDescription.FieldDescription(1, "ipv6RouterAdvertIfIndex", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(2, "ipv6RouterAdvertSendAdverts", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(3, "ipv6RouterAdvertMaxInterval", DeviceEntityDescription.FieldType.UNSIGNED32, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(4, "ipv6RouterAdvertMinInterval", DeviceEntityDescription.FieldType.UNSIGNED32, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(5, "ipv6RouterAdvertManagedFlag", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(6, "ipv6RouterAdvertOtherConfigFlag", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(7, "ipv6RouterAdvertLinkMTU", DeviceEntityDescription.FieldType.UNSIGNED32, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(8, "ipv6RouterAdvertReachableTime", DeviceEntityDescription.FieldType.UNSIGNED32, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(9, "ipv6RouterAdvertRetransmitTime", DeviceEntityDescription.FieldType.UNSIGNED32, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(10, "ipv6RouterAdvertCurHopLimit", DeviceEntityDescription.FieldType.UNSIGNED32, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(11, "ipv6RouterAdvertDefaultLifetime", DeviceEntityDescription.FieldType.UNSIGNED32, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(12, "ipv6RouterAdvertRowStatus", DeviceEntityDescription.FieldType.INTEGER, -1));
        return description;
    }

    public DeviceEntityDescription get_Description() {
        return _entityDescription;
    }

}
