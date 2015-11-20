
package com.btisystems.mibbler.mibs.bti7000.bti7000_13_2_0.btisystems.btiproducts.bti7000.objects.operations.neoperations;

import java.io.Serializable;
import com.btisystems.mibbler.mibs.bti7000.interfaces.btisystems.btiproducts.bti7000.objects.operations.neoperations.ISwUpgrade;
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

public class SwUpgrade
    extends DeviceEntity
    implements Serializable, ISwUpgrade, IVariableBindingSetter
{

    private int swUpgradeCmd;
    private String swUpgradeAddress;
    private String swUpgradePath;
    private String swUpgradeFtpUser;
    private String swUpgradeFtpPswd;
    private String swUpgradeInvokeRelNum;
    private int swUpgradeCheckAlm;
    private String swUpgradeActiveRelNum;
    private String swUpgradeInactiveRelNum;
    private int swUpgradeFileTransferType;
    private AbstractRootEntity parentEntity;
    private final static DeviceEntityDescription _entityDescription = createEntityDescription();

    public SwUpgrade() {
    }

    public int getSwUpgradeCmd() {
        return this.swUpgradeCmd;
    }

    public void setSwUpgradeCmd(int swUpgradeCmd) {
        int oldValue = getSwUpgradeCmd();
        this.swUpgradeCmd = swUpgradeCmd;
        notifyChange(1, oldValue, swUpgradeCmd);
    }

    public String getSwUpgradeAddress() {
        return this.swUpgradeAddress;
    }

    public void setSwUpgradeAddress(String swUpgradeAddress) {
        String oldValue = getSwUpgradeAddress();
        this.swUpgradeAddress = swUpgradeAddress;
        notifyChange(2, oldValue, swUpgradeAddress);
    }

    public String getSwUpgradePath() {
        return this.swUpgradePath;
    }

    public void setSwUpgradePath(String swUpgradePath) {
        String oldValue = getSwUpgradePath();
        this.swUpgradePath = swUpgradePath;
        notifyChange(3, oldValue, swUpgradePath);
    }

    public String getSwUpgradeFtpUser() {
        return this.swUpgradeFtpUser;
    }

    public void setSwUpgradeFtpUser(String swUpgradeFtpUser) {
        String oldValue = getSwUpgradeFtpUser();
        this.swUpgradeFtpUser = swUpgradeFtpUser;
        notifyChange(4, oldValue, swUpgradeFtpUser);
    }

    public String getSwUpgradeFtpPswd() {
        return this.swUpgradeFtpPswd;
    }

    public void setSwUpgradeFtpPswd(String swUpgradeFtpPswd) {
        String oldValue = getSwUpgradeFtpPswd();
        this.swUpgradeFtpPswd = swUpgradeFtpPswd;
        notifyChange(5, oldValue, swUpgradeFtpPswd);
    }

    public String getSwUpgradeInvokeRelNum() {
        return this.swUpgradeInvokeRelNum;
    }

    public void setSwUpgradeInvokeRelNum(String swUpgradeInvokeRelNum) {
        String oldValue = getSwUpgradeInvokeRelNum();
        this.swUpgradeInvokeRelNum = swUpgradeInvokeRelNum;
        notifyChange(6, oldValue, swUpgradeInvokeRelNum);
    }

    public int getSwUpgradeCheckAlm() {
        return this.swUpgradeCheckAlm;
    }

    public void setSwUpgradeCheckAlm(int swUpgradeCheckAlm) {
        int oldValue = getSwUpgradeCheckAlm();
        this.swUpgradeCheckAlm = swUpgradeCheckAlm;
        notifyChange(7, oldValue, swUpgradeCheckAlm);
    }

    public String getSwUpgradeActiveRelNum() {
        return this.swUpgradeActiveRelNum;
    }

    public void setSwUpgradeActiveRelNum(String swUpgradeActiveRelNum) {
        String oldValue = getSwUpgradeActiveRelNum();
        this.swUpgradeActiveRelNum = swUpgradeActiveRelNum;
        notifyChange(8, oldValue, swUpgradeActiveRelNum);
    }

    public String getSwUpgradeInactiveRelNum() {
        return this.swUpgradeInactiveRelNum;
    }

    public void setSwUpgradeInactiveRelNum(String swUpgradeInactiveRelNum) {
        String oldValue = getSwUpgradeInactiveRelNum();
        this.swUpgradeInactiveRelNum = swUpgradeInactiveRelNum;
        notifyChange(9, oldValue, swUpgradeInactiveRelNum);
    }

    public int getSwUpgradeFileTransferType() {
        return this.swUpgradeFileTransferType;
    }

    public void setSwUpgradeFileTransferType(int swUpgradeFileTransferType) {
        int oldValue = getSwUpgradeFileTransferType();
        this.swUpgradeFileTransferType = swUpgradeFileTransferType;
        notifyChange(10, oldValue, swUpgradeFileTransferType);
    }

    public void set(VariableBinding binding) {
        switch (binding.getOid().get(13)) {
            case  1 :
                setSwUpgradeCmd(binding.getVariable().toInt());
                break;
            case  2 :
                setSwUpgradeAddress(binding.getVariable().toString());
                break;
            case  3 :
                setSwUpgradePath(binding.getVariable().toString());
                break;
            case  4 :
                setSwUpgradeFtpUser(binding.getVariable().toString());
                break;
            case  5 :
                setSwUpgradeFtpPswd(binding.getVariable().toString());
                break;
            case  6 :
                setSwUpgradeInvokeRelNum(binding.getVariable().toString());
                break;
            case  7 :
                setSwUpgradeCheckAlm(binding.getVariable().toInt());
                break;
            case  8 :
                setSwUpgradeActiveRelNum(binding.getVariable().toString());
                break;
            case  9 :
                setSwUpgradeInactiveRelNum(binding.getVariable().toString());
                break;
            case  10 :
                setSwUpgradeFileTransferType(binding.getVariable().toInt());
                break;
        }
    }

    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE).append("swUpgradeCmd", swUpgradeCmd).append("swUpgradeAddress", swUpgradeAddress).append("swUpgradePath", swUpgradePath).append("swUpgradeFtpUser", swUpgradeFtpUser).append("swUpgradeFtpPswd", swUpgradeFtpPswd).append("swUpgradeInvokeRelNum", swUpgradeInvokeRelNum).append("swUpgradeCheckAlm", swUpgradeCheckAlm).append("swUpgradeActiveRelNum", swUpgradeActiveRelNum).append("swUpgradeInactiveRelNum", swUpgradeInactiveRelNum).append("swUpgradeFileTransferType", swUpgradeFileTransferType).toString();
    }

    public int hashCode() {
        return new HashCodeBuilder().append(swUpgradeCmd).append(swUpgradeAddress).append(swUpgradePath).append(swUpgradeFtpUser).append(swUpgradeFtpPswd).append(swUpgradeInvokeRelNum).append(swUpgradeCheckAlm).append(swUpgradeActiveRelNum).append(swUpgradeInactiveRelNum).append(swUpgradeFileTransferType).toHashCode();
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
        SwUpgrade rhs = ((SwUpgrade) obj);
        return new EqualsBuilder().append(swUpgradeCmd, rhs.swUpgradeCmd).append(swUpgradeAddress, rhs.swUpgradeAddress).append(swUpgradePath, rhs.swUpgradePath).append(swUpgradeFtpUser, rhs.swUpgradeFtpUser).append(swUpgradeFtpPswd, rhs.swUpgradeFtpPswd).append(swUpgradeInvokeRelNum, rhs.swUpgradeInvokeRelNum).append(swUpgradeCheckAlm, rhs.swUpgradeCheckAlm).append(swUpgradeActiveRelNum, rhs.swUpgradeActiveRelNum).append(swUpgradeInactiveRelNum, rhs.swUpgradeInactiveRelNum).append(swUpgradeFileTransferType, rhs.swUpgradeFileTransferType).isEquals();
    }

    public SwUpgrade clone() {
        SwUpgrade _copy = new SwUpgrade();
        _copy.swUpgradeCmd = swUpgradeCmd;
        _copy.swUpgradeAddress = swUpgradeAddress;
        _copy.swUpgradePath = swUpgradePath;
        _copy.swUpgradeFtpUser = swUpgradeFtpUser;
        _copy.swUpgradeFtpPswd = swUpgradeFtpPswd;
        _copy.swUpgradeInvokeRelNum = swUpgradeInvokeRelNum;
        _copy.swUpgradeCheckAlm = swUpgradeCheckAlm;
        _copy.swUpgradeActiveRelNum = swUpgradeActiveRelNum;
        _copy.swUpgradeInactiveRelNum = swUpgradeInactiveRelNum;
        _copy.swUpgradeFileTransferType = swUpgradeFileTransferType;
        return _copy;
    }

    public void set_ParentEntity(AbstractRootEntity parent) {
        parentEntity = parent;
    }

    private static DeviceEntityDescription createEntityDescription() {
        DeviceEntityDescription description = new DeviceEntityDescription(new OID("1.3.6.1.4.1.18070.2.2.1.11.1.2"));
        description.addField(new DeviceEntityDescription.FieldDescription(1, "swUpgradeCmd", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(2, "swUpgradeAddress", DeviceEntityDescription.FieldType.IP_ADDRESS, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(3, "swUpgradePath", DeviceEntityDescription.FieldType.STRING, 255));
        description.addField(new DeviceEntityDescription.FieldDescription(4, "swUpgradeFtpUser", DeviceEntityDescription.FieldType.STRING, 255));
        description.addField(new DeviceEntityDescription.FieldDescription(5, "swUpgradeFtpPswd", DeviceEntityDescription.FieldType.STRING, 255));
        description.addField(new DeviceEntityDescription.FieldDescription(6, "swUpgradeInvokeRelNum", DeviceEntityDescription.FieldType.STRING, 255));
        description.addField(new DeviceEntityDescription.FieldDescription(7, "swUpgradeCheckAlm", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(8, "swUpgradeActiveRelNum", DeviceEntityDescription.FieldType.STRING, 255));
        description.addField(new DeviceEntityDescription.FieldDescription(9, "swUpgradeInactiveRelNum", DeviceEntityDescription.FieldType.STRING, 255));
        description.addField(new DeviceEntityDescription.FieldDescription(10, "swUpgradeFileTransferType", DeviceEntityDescription.FieldType.INTEGER, -1));
        return description;
    }

    public DeviceEntityDescription get_Description() {
        return _entityDescription;
    }

}
