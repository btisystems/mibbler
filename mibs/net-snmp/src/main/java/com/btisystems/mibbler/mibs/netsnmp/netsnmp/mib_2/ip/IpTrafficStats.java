
package com.btisystems.mibbler.mibs.netsnmp.netsnmp.mib_2.ip;

import java.io.Serializable;
import com.btisystems.mibbler.mibs.netsnmp.interfaces.mib_2.ip.IIpTrafficStats;
import com.btisystems.pronx.ems.core.model.AbstractRootEntity;
import com.btisystems.pronx.ems.core.model.DeviceEntity;
import com.btisystems.pronx.ems.core.model.DeviceEntityDescription;
import com.btisystems.pronx.ems.core.model.IVariableBindingSetter;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;
import org.snmp4j.smi.OID;
import org.snmp4j.smi.VariableBinding;

public class IpTrafficStats
    extends DeviceEntity
    implements Serializable, IIpTrafficStats, IVariableBindingSetter
{

    private int ipIfStatsTableLastChange;
    private AbstractRootEntity parentEntity;
    private final static DeviceEntityDescription _entityDescription = createEntityDescription();

    public IpTrafficStats() {
    }

    public int getIpIfStatsTableLastChange() {
        return this.ipIfStatsTableLastChange;
    }

    public void setIpIfStatsTableLastChange(int ipIfStatsTableLastChange) {
        int oldValue = getIpIfStatsTableLastChange();
        this.ipIfStatsTableLastChange = ipIfStatsTableLastChange;
        notifyChange(2, oldValue, ipIfStatsTableLastChange);
    }

    public void set(VariableBinding binding) {
        switch (binding.getOid().get(8)) {
            case  2 :
                setIpIfStatsTableLastChange(binding.getVariable().toInt());
                break;
        }
    }

    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE).append("ipIfStatsTableLastChange", ipIfStatsTableLastChange).toString();
    }

    public int hashCode() {
        return new HashCodeBuilder().append(ipIfStatsTableLastChange).toHashCode();
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
        IpTrafficStats rhs = ((IpTrafficStats) obj);
        return new EqualsBuilder().append(ipIfStatsTableLastChange, rhs.ipIfStatsTableLastChange).isEquals();
    }

    public IpTrafficStats clone() {
        IpTrafficStats _copy = new IpTrafficStats();
        _copy.ipIfStatsTableLastChange = ipIfStatsTableLastChange;
        return _copy;
    }

    public void set_ParentEntity(AbstractRootEntity parent) {
        parentEntity = parent;
    }

    private static DeviceEntityDescription createEntityDescription() {
        DeviceEntityDescription description = new DeviceEntityDescription(new OID("1.3.6.1.2.1.4.31"));
        description.addField(new DeviceEntityDescription.FieldDescription(2, "ipIfStatsTableLastChange", DeviceEntityDescription.FieldType.INTEGER, -1));
        return description;
    }

    public DeviceEntityDescription get_Description() {
        return _entityDescription;
    }

}
