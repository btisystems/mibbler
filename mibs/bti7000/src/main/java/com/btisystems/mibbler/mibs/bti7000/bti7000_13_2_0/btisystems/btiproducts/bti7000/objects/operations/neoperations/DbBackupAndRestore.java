
package com.btisystems.mibbler.mibs.bti7000.bti7000_13_2_0.btisystems.btiproducts.bti7000.objects.operations.neoperations;

import java.io.Serializable;
import com.btisystems.mibbler.mibs.bti7000.interfaces.btisystems.btiproducts.bti7000.objects.operations.neoperations.IDbBackupAndRestore;
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

public class DbBackupAndRestore
    extends DeviceEntity
    implements Serializable, IDbBackupAndRestore, IVariableBindingSetter
{

    private int dbBackupAndRestoreCmd;
    private int dbBackupAndRestoreType;
    private String dbBackupAndRestoreAddress;
    private String dbBackupAndRestorePath;
    private String dbBackupAndRestoreFtpUser;
    private String dbBackupAndRestoreFtpPswd;
    private int dbBackupAndRestoreCheckAlm;
    private int dbBackupAndRestoreCheckSysName;
    private String dbBackupAndRestoreInvokeFilename;
    private String dbBackupAndRestoreFilename;
    private int dbBackupAndRestoreResult;
    private AbstractRootEntity parentEntity;
    private final static DeviceEntityDescription _entityDescription = createEntityDescription();

    public DbBackupAndRestore() {
    }

    public int getDbBackupAndRestoreCmd() {
        return this.dbBackupAndRestoreCmd;
    }

    public void setDbBackupAndRestoreCmd(int dbBackupAndRestoreCmd) {
        int oldValue = getDbBackupAndRestoreCmd();
        this.dbBackupAndRestoreCmd = dbBackupAndRestoreCmd;
        notifyChange(1, oldValue, dbBackupAndRestoreCmd);
    }

    public int getDbBackupAndRestoreType() {
        return this.dbBackupAndRestoreType;
    }

    public void setDbBackupAndRestoreType(int dbBackupAndRestoreType) {
        int oldValue = getDbBackupAndRestoreType();
        this.dbBackupAndRestoreType = dbBackupAndRestoreType;
        notifyChange(2, oldValue, dbBackupAndRestoreType);
    }

    public String getDbBackupAndRestoreAddress() {
        return this.dbBackupAndRestoreAddress;
    }

    public void setDbBackupAndRestoreAddress(String dbBackupAndRestoreAddress) {
        String oldValue = getDbBackupAndRestoreAddress();
        this.dbBackupAndRestoreAddress = dbBackupAndRestoreAddress;
        notifyChange(3, oldValue, dbBackupAndRestoreAddress);
    }

    public String getDbBackupAndRestorePath() {
        return this.dbBackupAndRestorePath;
    }

    public void setDbBackupAndRestorePath(String dbBackupAndRestorePath) {
        String oldValue = getDbBackupAndRestorePath();
        this.dbBackupAndRestorePath = dbBackupAndRestorePath;
        notifyChange(4, oldValue, dbBackupAndRestorePath);
    }

    public String getDbBackupAndRestoreFtpUser() {
        return this.dbBackupAndRestoreFtpUser;
    }

    public void setDbBackupAndRestoreFtpUser(String dbBackupAndRestoreFtpUser) {
        String oldValue = getDbBackupAndRestoreFtpUser();
        this.dbBackupAndRestoreFtpUser = dbBackupAndRestoreFtpUser;
        notifyChange(5, oldValue, dbBackupAndRestoreFtpUser);
    }

    public String getDbBackupAndRestoreFtpPswd() {
        return this.dbBackupAndRestoreFtpPswd;
    }

    public void setDbBackupAndRestoreFtpPswd(String dbBackupAndRestoreFtpPswd) {
        String oldValue = getDbBackupAndRestoreFtpPswd();
        this.dbBackupAndRestoreFtpPswd = dbBackupAndRestoreFtpPswd;
        notifyChange(6, oldValue, dbBackupAndRestoreFtpPswd);
    }

    public int getDbBackupAndRestoreCheckAlm() {
        return this.dbBackupAndRestoreCheckAlm;
    }

    public void setDbBackupAndRestoreCheckAlm(int dbBackupAndRestoreCheckAlm) {
        int oldValue = getDbBackupAndRestoreCheckAlm();
        this.dbBackupAndRestoreCheckAlm = dbBackupAndRestoreCheckAlm;
        notifyChange(7, oldValue, dbBackupAndRestoreCheckAlm);
    }

    public int getDbBackupAndRestoreCheckSysName() {
        return this.dbBackupAndRestoreCheckSysName;
    }

    public void setDbBackupAndRestoreCheckSysName(int dbBackupAndRestoreCheckSysName) {
        int oldValue = getDbBackupAndRestoreCheckSysName();
        this.dbBackupAndRestoreCheckSysName = dbBackupAndRestoreCheckSysName;
        notifyChange(8, oldValue, dbBackupAndRestoreCheckSysName);
    }

    public String getDbBackupAndRestoreInvokeFilename() {
        return this.dbBackupAndRestoreInvokeFilename;
    }

    public void setDbBackupAndRestoreInvokeFilename(String dbBackupAndRestoreInvokeFilename) {
        String oldValue = getDbBackupAndRestoreInvokeFilename();
        this.dbBackupAndRestoreInvokeFilename = dbBackupAndRestoreInvokeFilename;
        notifyChange(9, oldValue, dbBackupAndRestoreInvokeFilename);
    }

    public String getDbBackupAndRestoreFilename() {
        return this.dbBackupAndRestoreFilename;
    }

    public void setDbBackupAndRestoreFilename(String dbBackupAndRestoreFilename) {
        String oldValue = getDbBackupAndRestoreFilename();
        this.dbBackupAndRestoreFilename = dbBackupAndRestoreFilename;
        notifyChange(10, oldValue, dbBackupAndRestoreFilename);
    }

    public int getDbBackupAndRestoreResult() {
        return this.dbBackupAndRestoreResult;
    }

    public void setDbBackupAndRestoreResult(int dbBackupAndRestoreResult) {
        int oldValue = getDbBackupAndRestoreResult();
        this.dbBackupAndRestoreResult = dbBackupAndRestoreResult;
        notifyChange(11, oldValue, dbBackupAndRestoreResult);
    }

    public void set(VariableBinding binding) {
        switch (binding.getOid().get(13)) {
            case  1 :
                setDbBackupAndRestoreCmd(binding.getVariable().toInt());
                break;
            case  2 :
                setDbBackupAndRestoreType(binding.getVariable().toInt());
                break;
            case  3 :
                setDbBackupAndRestoreAddress(binding.getVariable().toString());
                break;
            case  4 :
                setDbBackupAndRestorePath(binding.getVariable().toString());
                break;
            case  5 :
                setDbBackupAndRestoreFtpUser(binding.getVariable().toString());
                break;
            case  6 :
                setDbBackupAndRestoreFtpPswd(binding.getVariable().toString());
                break;
            case  7 :
                setDbBackupAndRestoreCheckAlm(binding.getVariable().toInt());
                break;
            case  8 :
                setDbBackupAndRestoreCheckSysName(binding.getVariable().toInt());
                break;
            case  9 :
                setDbBackupAndRestoreInvokeFilename(binding.getVariable().toString());
                break;
            case  10 :
                setDbBackupAndRestoreFilename(binding.getVariable().toString());
                break;
            case  11 :
                setDbBackupAndRestoreResult(binding.getVariable().toInt());
                break;
        }
    }

    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE).append("dbBackupAndRestoreCmd", dbBackupAndRestoreCmd).append("dbBackupAndRestoreType", dbBackupAndRestoreType).append("dbBackupAndRestoreAddress", dbBackupAndRestoreAddress).append("dbBackupAndRestorePath", dbBackupAndRestorePath).append("dbBackupAndRestoreFtpUser", dbBackupAndRestoreFtpUser).append("dbBackupAndRestoreFtpPswd", dbBackupAndRestoreFtpPswd).append("dbBackupAndRestoreCheckAlm", dbBackupAndRestoreCheckAlm).append("dbBackupAndRestoreCheckSysName", dbBackupAndRestoreCheckSysName).append("dbBackupAndRestoreInvokeFilename", dbBackupAndRestoreInvokeFilename).append("dbBackupAndRestoreFilename", dbBackupAndRestoreFilename).append("dbBackupAndRestoreResult", dbBackupAndRestoreResult).toString();
    }

    public int hashCode() {
        return new HashCodeBuilder().append(dbBackupAndRestoreCmd).append(dbBackupAndRestoreType).append(dbBackupAndRestoreAddress).append(dbBackupAndRestorePath).append(dbBackupAndRestoreFtpUser).append(dbBackupAndRestoreFtpPswd).append(dbBackupAndRestoreCheckAlm).append(dbBackupAndRestoreCheckSysName).append(dbBackupAndRestoreInvokeFilename).append(dbBackupAndRestoreFilename).append(dbBackupAndRestoreResult).toHashCode();
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
        DbBackupAndRestore rhs = ((DbBackupAndRestore) obj);
        return new EqualsBuilder().append(dbBackupAndRestoreCmd, rhs.dbBackupAndRestoreCmd).append(dbBackupAndRestoreType, rhs.dbBackupAndRestoreType).append(dbBackupAndRestoreAddress, rhs.dbBackupAndRestoreAddress).append(dbBackupAndRestorePath, rhs.dbBackupAndRestorePath).append(dbBackupAndRestoreFtpUser, rhs.dbBackupAndRestoreFtpUser).append(dbBackupAndRestoreFtpPswd, rhs.dbBackupAndRestoreFtpPswd).append(dbBackupAndRestoreCheckAlm, rhs.dbBackupAndRestoreCheckAlm).append(dbBackupAndRestoreCheckSysName, rhs.dbBackupAndRestoreCheckSysName).append(dbBackupAndRestoreInvokeFilename, rhs.dbBackupAndRestoreInvokeFilename).append(dbBackupAndRestoreFilename, rhs.dbBackupAndRestoreFilename).append(dbBackupAndRestoreResult, rhs.dbBackupAndRestoreResult).isEquals();
    }

    public DbBackupAndRestore clone() {
        DbBackupAndRestore _copy = new DbBackupAndRestore();
        _copy.dbBackupAndRestoreCmd = dbBackupAndRestoreCmd;
        _copy.dbBackupAndRestoreType = dbBackupAndRestoreType;
        _copy.dbBackupAndRestoreAddress = dbBackupAndRestoreAddress;
        _copy.dbBackupAndRestorePath = dbBackupAndRestorePath;
        _copy.dbBackupAndRestoreFtpUser = dbBackupAndRestoreFtpUser;
        _copy.dbBackupAndRestoreFtpPswd = dbBackupAndRestoreFtpPswd;
        _copy.dbBackupAndRestoreCheckAlm = dbBackupAndRestoreCheckAlm;
        _copy.dbBackupAndRestoreCheckSysName = dbBackupAndRestoreCheckSysName;
        _copy.dbBackupAndRestoreInvokeFilename = dbBackupAndRestoreInvokeFilename;
        _copy.dbBackupAndRestoreFilename = dbBackupAndRestoreFilename;
        _copy.dbBackupAndRestoreResult = dbBackupAndRestoreResult;
        return _copy;
    }

    public void set_ParentEntity(AbstractRootEntity parent) {
        parentEntity = parent;
    }

    private static DeviceEntityDescription createEntityDescription() {
        DeviceEntityDescription description = new DeviceEntityDescription(new OID("1.3.6.1.4.1.18070.2.2.1.11.1.1"));
        description.addField(new DeviceEntityDescription.FieldDescription(1, "dbBackupAndRestoreCmd", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(2, "dbBackupAndRestoreType", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(3, "dbBackupAndRestoreAddress", DeviceEntityDescription.FieldType.IP_ADDRESS, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(4, "dbBackupAndRestorePath", DeviceEntityDescription.FieldType.STRING, 255));
        description.addField(new DeviceEntityDescription.FieldDescription(5, "dbBackupAndRestoreFtpUser", DeviceEntityDescription.FieldType.STRING, 255));
        description.addField(new DeviceEntityDescription.FieldDescription(6, "dbBackupAndRestoreFtpPswd", DeviceEntityDescription.FieldType.STRING, 255));
        description.addField(new DeviceEntityDescription.FieldDescription(7, "dbBackupAndRestoreCheckAlm", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(8, "dbBackupAndRestoreCheckSysName", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(9, "dbBackupAndRestoreInvokeFilename", DeviceEntityDescription.FieldType.STRING, 255));
        description.addField(new DeviceEntityDescription.FieldDescription(10, "dbBackupAndRestoreFilename", DeviceEntityDescription.FieldType.STRING, 255));
        description.addField(new DeviceEntityDescription.FieldDescription(11, "dbBackupAndRestoreResult", DeviceEntityDescription.FieldType.INTEGER, -1));
        return description;
    }

    public DeviceEntityDescription get_Description() {
        return _entityDescription;
    }

}
