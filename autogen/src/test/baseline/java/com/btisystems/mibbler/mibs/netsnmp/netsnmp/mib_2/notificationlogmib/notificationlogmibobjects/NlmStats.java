
package com.btisystems.mibbler.mibs.netsnmp.netsnmp.mib_2.notificationlogmib.notificationlogmibobjects;

import java.io.Serializable;
import com.btisystems.mibbler.mibs.netsnmp.interfaces.mib_2.notificationlogmib.notificationlogmibobjects.INlmStats;
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

public class NlmStats
    extends DeviceEntity
    implements Serializable, INlmStats, IVariableBindingSetter
{

    private int nlmStatsGlobalNotificationsLogged;
    private int nlmStatsGlobalNotificationsBumped;
    private AbstractRootEntity parentEntity;
    private final static DeviceEntityDescription _entityDescription = createEntityDescription();

    public NlmStats() {
    }

    public int getNlmStatsGlobalNotificationsLogged() {
        return this.nlmStatsGlobalNotificationsLogged;
    }

    public void setNlmStatsGlobalNotificationsLogged(int nlmStatsGlobalNotificationsLogged) {
        int oldValue = getNlmStatsGlobalNotificationsLogged();
        this.nlmStatsGlobalNotificationsLogged = nlmStatsGlobalNotificationsLogged;
        notifyChange(1, oldValue, nlmStatsGlobalNotificationsLogged);
    }

    public int getNlmStatsGlobalNotificationsBumped() {
        return this.nlmStatsGlobalNotificationsBumped;
    }

    public void setNlmStatsGlobalNotificationsBumped(int nlmStatsGlobalNotificationsBumped) {
        int oldValue = getNlmStatsGlobalNotificationsBumped();
        this.nlmStatsGlobalNotificationsBumped = nlmStatsGlobalNotificationsBumped;
        notifyChange(2, oldValue, nlmStatsGlobalNotificationsBumped);
    }

    public void set(VariableBinding binding) {
        switch (binding.getOid().get(9)) {
            case  1 :
                setNlmStatsGlobalNotificationsLogged(binding.getVariable().toInt());
                break;
            case  2 :
                setNlmStatsGlobalNotificationsBumped(binding.getVariable().toInt());
                break;
        }
    }

    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE).append("nlmStatsGlobalNotificationsLogged", nlmStatsGlobalNotificationsLogged).append("nlmStatsGlobalNotificationsBumped", nlmStatsGlobalNotificationsBumped).toString();
    }

    public int hashCode() {
        return new HashCodeBuilder().append(nlmStatsGlobalNotificationsLogged).append(nlmStatsGlobalNotificationsBumped).toHashCode();
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
        NlmStats rhs = ((NlmStats) obj);
        return new EqualsBuilder().append(nlmStatsGlobalNotificationsLogged, rhs.nlmStatsGlobalNotificationsLogged).append(nlmStatsGlobalNotificationsBumped, rhs.nlmStatsGlobalNotificationsBumped).isEquals();
    }

    public NlmStats clone() {
        NlmStats _copy = new NlmStats();
        _copy.nlmStatsGlobalNotificationsLogged = nlmStatsGlobalNotificationsLogged;
        _copy.nlmStatsGlobalNotificationsBumped = nlmStatsGlobalNotificationsBumped;
        return _copy;
    }

    public void set_ParentEntity(AbstractRootEntity parent) {
        parentEntity = parent;
    }

    private static DeviceEntityDescription createEntityDescription() {
        DeviceEntityDescription description = new DeviceEntityDescription(new OID("1.3.6.1.2.1.92.1.2"));
        description.addField(new DeviceEntityDescription.FieldDescription(1, "nlmStatsGlobalNotificationsLogged", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(2, "nlmStatsGlobalNotificationsBumped", DeviceEntityDescription.FieldType.INTEGER, -1));
        return description;
    }

    public DeviceEntityDescription get_Description() {
        return _entityDescription;
    }

}
