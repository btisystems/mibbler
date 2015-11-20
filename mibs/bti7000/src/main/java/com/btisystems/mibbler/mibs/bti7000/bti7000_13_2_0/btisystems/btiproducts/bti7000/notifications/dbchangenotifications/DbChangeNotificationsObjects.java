
package com.btisystems.mibbler.mibs.bti7000.bti7000_13_2_0.btisystems.btiproducts.bti7000.notifications.dbchangenotifications;

import java.io.Serializable;
import com.btisystems.mibbler.mibs.bti7000.interfaces.btisystems.btiproducts.bti7000.notifications.dbchangenotifications.IDbChangeNotificationsObjects;
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

public class DbChangeNotificationsObjects
    extends DeviceEntity
    implements Serializable, IDbChangeNotificationsObjects, IVariableBindingSetter
{

    private String dbChangeDateAndTime;
    private int dbChangeSeqNum;
    private String dbChangeOID;
    private AbstractRootEntity parentEntity;
    private final static DeviceEntityDescription _entityDescription = createEntityDescription();

    public DbChangeNotificationsObjects() {
    }

    public String getDbChangeDateAndTime() {
        return this.dbChangeDateAndTime;
    }

    public void setDbChangeDateAndTime(String dbChangeDateAndTime) {
        String oldValue = getDbChangeDateAndTime();
        this.dbChangeDateAndTime = dbChangeDateAndTime;
        notifyChange(1, oldValue, dbChangeDateAndTime);
    }

    public int getDbChangeSeqNum() {
        return this.dbChangeSeqNum;
    }

    public void setDbChangeSeqNum(int dbChangeSeqNum) {
        int oldValue = getDbChangeSeqNum();
        this.dbChangeSeqNum = dbChangeSeqNum;
        notifyChange(2, oldValue, dbChangeSeqNum);
    }

    public String getDbChangeOID() {
        return this.dbChangeOID;
    }

    public void setDbChangeOID(String dbChangeOID) {
        String oldValue = getDbChangeOID();
        this.dbChangeOID = dbChangeOID;
        notifyChange(3, oldValue, dbChangeOID);
    }

    public void set(VariableBinding binding) {
        switch (binding.getOid().get(12)) {
            case  1 :
                setDbChangeDateAndTime(binding.getVariable().toString());
                break;
            case  2 :
                setDbChangeSeqNum(binding.getVariable().toInt());
                break;
            case  3 :
                setDbChangeOID(binding.getVariable().toString());
                break;
        }
    }

    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE).append("dbChangeDateAndTime", dbChangeDateAndTime).append("dbChangeSeqNum", dbChangeSeqNum).append("dbChangeOID", dbChangeOID).toString();
    }

    public int hashCode() {
        return new HashCodeBuilder().append(dbChangeDateAndTime).append(dbChangeSeqNum).append(dbChangeOID).toHashCode();
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
        DbChangeNotificationsObjects rhs = ((DbChangeNotificationsObjects) obj);
        return new EqualsBuilder().append(dbChangeDateAndTime, rhs.dbChangeDateAndTime).append(dbChangeSeqNum, rhs.dbChangeSeqNum).append(dbChangeOID, rhs.dbChangeOID).isEquals();
    }

    public DbChangeNotificationsObjects clone() {
        DbChangeNotificationsObjects _copy = new DbChangeNotificationsObjects();
        _copy.dbChangeDateAndTime = dbChangeDateAndTime;
        _copy.dbChangeSeqNum = dbChangeSeqNum;
        _copy.dbChangeOID = dbChangeOID;
        return _copy;
    }

    public void set_ParentEntity(AbstractRootEntity parent) {
        parentEntity = parent;
    }

    private static DeviceEntityDescription createEntityDescription() {
        DeviceEntityDescription description = new DeviceEntityDescription(new OID("1.3.6.1.4.1.18070.2.2.2.3.1"));
        description.addField(new DeviceEntityDescription.FieldDescription(1, "dbChangeDateAndTime", DeviceEntityDescription.FieldType.DATE_AND_TIME, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(2, "dbChangeSeqNum", DeviceEntityDescription.FieldType.UNSIGNED32, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(3, "dbChangeOID", DeviceEntityDescription.FieldType.OID, -1));
        return description;
    }

    public DeviceEntityDescription get_Description() {
        return _entityDescription;
    }

}
