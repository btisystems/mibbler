
package com.btisystems.mibbler.mibs.bti7000.bti7000_13_2_0.btisystems.btiproducts.bti7000.notifications;

import java.io.Serializable;
import com.btisystems.mibbler.mibs.bti7000.interfaces.btisystems.btiproducts.bti7000.notifications.INotificationObjects;
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

public class NotificationObjects
    extends DeviceEntity
    implements Serializable, INotificationObjects, IVariableBindingSetter
{

    private int trapSeqNum;
    private AbstractRootEntity parentEntity;
    private final static DeviceEntityDescription _entityDescription = createEntityDescription();

    public NotificationObjects() {
    }

    public int getTrapSeqNum() {
        return this.trapSeqNum;
    }

    public void setTrapSeqNum(int trapSeqNum) {
        int oldValue = getTrapSeqNum();
        this.trapSeqNum = trapSeqNum;
        notifyChange(1, oldValue, trapSeqNum);
    }

    public void set(VariableBinding binding) {
        switch (binding.getOid().get(11)) {
            case  1 :
                setTrapSeqNum(binding.getVariable().toInt());
                break;
        }
    }

    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE).append("trapSeqNum", trapSeqNum).toString();
    }

    public int hashCode() {
        return new HashCodeBuilder().append(trapSeqNum).toHashCode();
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
        NotificationObjects rhs = ((NotificationObjects) obj);
        return new EqualsBuilder().append(trapSeqNum, rhs.trapSeqNum).isEquals();
    }

    public NotificationObjects clone() {
        NotificationObjects _copy = new NotificationObjects();
        _copy.trapSeqNum = trapSeqNum;
        return _copy;
    }

    public void set_ParentEntity(AbstractRootEntity parent) {
        parentEntity = parent;
    }

    private static DeviceEntityDescription createEntityDescription() {
        DeviceEntityDescription description = new DeviceEntityDescription(new OID("1.3.6.1.4.1.18070.2.2.2.4"));
        description.addField(new DeviceEntityDescription.FieldDescription(1, "trapSeqNum", DeviceEntityDescription.FieldType.UNSIGNED32, -1));
        return description;
    }

    public DeviceEntityDescription get_Description() {
        return _entityDescription;
    }

}
