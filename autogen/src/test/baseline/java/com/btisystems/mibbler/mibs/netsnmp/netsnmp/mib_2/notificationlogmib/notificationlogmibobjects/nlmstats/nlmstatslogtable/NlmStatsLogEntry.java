
package com.btisystems.mibbler.mibs.netsnmp.netsnmp.mib_2.notificationlogmib.notificationlogmibobjects.nlmstats.nlmstatslogtable;

import java.io.Serializable;
import com.btisystems.mibbler.mibs.netsnmp.interfaces.mib_2.notificationlogmib.notificationlogmibobjects.nlmstats.nlmstatslogtable.INlmStatsLogEntry;
import com.btisystems.mibbler.mibs.netsnmp.netsnmp.mib_2.notificationlogmib.notificationlogmibobjects.nlmstats.NlmStatsLogTable;
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

public class NlmStatsLogEntry
    extends DeviceEntity
    implements Serializable, INlmStatsLogEntry, IIndexed, IVariableBindingSetter
{

    private int nlmStatsLogNotificationsLogged;
    private int nlmStatsLogNotificationsBumped;
    private String _index;
    private NlmStatsLogTable parentEntity;
    private final static DeviceEntityDescription _entityDescription = createEntityDescription();

    public NlmStatsLogEntry() {
    }

    public int getNlmStatsLogNotificationsLogged() {
        return this.nlmStatsLogNotificationsLogged;
    }

    public void setNlmStatsLogNotificationsLogged(int nlmStatsLogNotificationsLogged) {
        int oldValue = getNlmStatsLogNotificationsLogged();
        this.nlmStatsLogNotificationsLogged = nlmStatsLogNotificationsLogged;
        notifyChange(1, oldValue, nlmStatsLogNotificationsLogged);
    }

    public int getNlmStatsLogNotificationsBumped() {
        return this.nlmStatsLogNotificationsBumped;
    }

    public void setNlmStatsLogNotificationsBumped(int nlmStatsLogNotificationsBumped) {
        int oldValue = getNlmStatsLogNotificationsBumped();
        this.nlmStatsLogNotificationsBumped = nlmStatsLogNotificationsBumped;
        notifyChange(2, oldValue, nlmStatsLogNotificationsBumped);
    }

    public void set(VariableBinding binding) {
        switch (binding.getOid().get(11)) {
            case  1 :
                setNlmStatsLogNotificationsLogged(binding.getVariable().toInt());
                break;
            case  2 :
                setNlmStatsLogNotificationsBumped(binding.getVariable().toInt());
                break;
        }
    }

    public void _setIndex(OID oid) {
        byte[] _oidBytes = oid.toByteArray();
        int[] _oidInts = oid.toIntArray();
        int arrayOffset = 12;
        int _len;
        _index = new OID(_oidInts, 12, (oid.size()- 12)).toString();
    }

    public String _getIndex() {
        return _index;
    }

    public void _setTable(NlmStatsLogTable table) {
        this.parentEntity = table;
    }

    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE).append("nlmStatsLogNotificationsLogged", nlmStatsLogNotificationsLogged).append("nlmStatsLogNotificationsBumped", nlmStatsLogNotificationsBumped).append("_index", _index).toString();
    }

    public int hashCode() {
        return new HashCodeBuilder().append(nlmStatsLogNotificationsLogged).append(nlmStatsLogNotificationsBumped).append(_index).toHashCode();
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
        NlmStatsLogEntry rhs = ((NlmStatsLogEntry) obj);
        return new EqualsBuilder().append(nlmStatsLogNotificationsLogged, rhs.nlmStatsLogNotificationsLogged).append(nlmStatsLogNotificationsBumped, rhs.nlmStatsLogNotificationsBumped).append(_index, rhs._index).isEquals();
    }

    public NlmStatsLogEntry clone() {
        NlmStatsLogEntry _copy = new NlmStatsLogEntry();
        _copy.nlmStatsLogNotificationsLogged = nlmStatsLogNotificationsLogged;
        _copy.nlmStatsLogNotificationsBumped = nlmStatsLogNotificationsBumped;
        _copy._index = _index;
        _copy.parentEntity = parentEntity;
        return _copy;
    }

    private static DeviceEntityDescription createEntityDescription() {
        DeviceEntityDescription description = new DeviceEntityDescription(new OID("1.3.6.1.2.1.92.1.2.3.1"));
        description.addField(new DeviceEntityDescription.FieldDescription(1, "nlmStatsLogNotificationsLogged", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(2, "nlmStatsLogNotificationsBumped", DeviceEntityDescription.FieldType.INTEGER, -1));
        return description;
    }

    public DeviceEntityDescription get_Description() {
        return _entityDescription;
    }

}
