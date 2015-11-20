
package com.btisystems.mibbler.mibs.bti7000.bti7000_13_2_0.btisystems.btiproducts.bti7000.objects;

import java.io.Serializable;
import com.btisystems.mibbler.mibs.bti7000.interfaces.btisystems.btiproducts.bti7000.objects.INetworkElement;
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

public class NetworkElement
    extends DeviceEntity
    implements Serializable, INetworkElement, IVariableBindingSetter
{

    private String neSWVersion;
    private int neNum;
    private int neSiteNum;
    private String neDateAndTime;
    private int neTimeZone;
    private int neAutoDST;
    private String neGateway;
    private String neSecGateway;
    private String neActiveGateway;
    private int neAutoProv;
    private String neAutoDeProv;
    private String neAutoEnabledTimer;
    private int neFPDetect;
    private int neHTAutoShutdown;
    private AbstractRootEntity parentEntity;
    private final static DeviceEntityDescription _entityDescription = createEntityDescription();

    public NetworkElement() {
    }

    public String getNeSWVersion() {
        return this.neSWVersion;
    }

    public void setNeSWVersion(String neSWVersion) {
        String oldValue = getNeSWVersion();
        this.neSWVersion = neSWVersion;
        notifyChange(1, oldValue, neSWVersion);
    }

    public int getNeNum() {
        return this.neNum;
    }

    public void setNeNum(int neNum) {
        int oldValue = getNeNum();
        this.neNum = neNum;
        notifyChange(2, oldValue, neNum);
    }

    public int getNeSiteNum() {
        return this.neSiteNum;
    }

    public void setNeSiteNum(int neSiteNum) {
        int oldValue = getNeSiteNum();
        this.neSiteNum = neSiteNum;
        notifyChange(3, oldValue, neSiteNum);
    }

    public String getNeDateAndTime() {
        return this.neDateAndTime;
    }

    public void setNeDateAndTime(String neDateAndTime) {
        String oldValue = getNeDateAndTime();
        this.neDateAndTime = neDateAndTime;
        notifyChange(4, oldValue, neDateAndTime);
    }

    public int getNeTimeZone() {
        return this.neTimeZone;
    }

    public void setNeTimeZone(int neTimeZone) {
        int oldValue = getNeTimeZone();
        this.neTimeZone = neTimeZone;
        notifyChange(5, oldValue, neTimeZone);
    }

    public int getNeAutoDST() {
        return this.neAutoDST;
    }

    public void setNeAutoDST(int neAutoDST) {
        int oldValue = getNeAutoDST();
        this.neAutoDST = neAutoDST;
        notifyChange(6, oldValue, neAutoDST);
    }

    public String getNeGateway() {
        return this.neGateway;
    }

    public void setNeGateway(String neGateway) {
        String oldValue = getNeGateway();
        this.neGateway = neGateway;
        notifyChange(7, oldValue, neGateway);
    }

    public String getNeSecGateway() {
        return this.neSecGateway;
    }

    public void setNeSecGateway(String neSecGateway) {
        String oldValue = getNeSecGateway();
        this.neSecGateway = neSecGateway;
        notifyChange(8, oldValue, neSecGateway);
    }

    public String getNeActiveGateway() {
        return this.neActiveGateway;
    }

    public void setNeActiveGateway(String neActiveGateway) {
        String oldValue = getNeActiveGateway();
        this.neActiveGateway = neActiveGateway;
        notifyChange(9, oldValue, neActiveGateway);
    }

    public int getNeAutoProv() {
        return this.neAutoProv;
    }

    public void setNeAutoProv(int neAutoProv) {
        int oldValue = getNeAutoProv();
        this.neAutoProv = neAutoProv;
        notifyChange(10, oldValue, neAutoProv);
    }

    public String getNeAutoDeProv() {
        return this.neAutoDeProv;
    }

    public void setNeAutoDeProv(String neAutoDeProv) {
        String oldValue = getNeAutoDeProv();
        this.neAutoDeProv = neAutoDeProv;
        notifyChange(11, oldValue, neAutoDeProv);
    }

    public String getNeAutoEnabledTimer() {
        return this.neAutoEnabledTimer;
    }

    public void setNeAutoEnabledTimer(String neAutoEnabledTimer) {
        String oldValue = getNeAutoEnabledTimer();
        this.neAutoEnabledTimer = neAutoEnabledTimer;
        notifyChange(12, oldValue, neAutoEnabledTimer);
    }

    public int getNeFPDetect() {
        return this.neFPDetect;
    }

    public void setNeFPDetect(int neFPDetect) {
        int oldValue = getNeFPDetect();
        this.neFPDetect = neFPDetect;
        notifyChange(14, oldValue, neFPDetect);
    }

    public int getNeHTAutoShutdown() {
        return this.neHTAutoShutdown;
    }

    public void setNeHTAutoShutdown(int neHTAutoShutdown) {
        int oldValue = getNeHTAutoShutdown();
        this.neHTAutoShutdown = neHTAutoShutdown;
        notifyChange(15, oldValue, neHTAutoShutdown);
    }

    public void set(VariableBinding binding) {
        switch (binding.getOid().get(11)) {
            case  1 :
                setNeSWVersion(binding.getVariable().toString());
                break;
            case  2 :
                setNeNum(binding.getVariable().toInt());
                break;
            case  3 :
                setNeSiteNum(binding.getVariable().toInt());
                break;
            case  4 :
                setNeDateAndTime(binding.getVariable().toString());
                break;
            case  5 :
                setNeTimeZone(binding.getVariable().toInt());
                break;
            case  6 :
                setNeAutoDST(binding.getVariable().toInt());
                break;
            case  7 :
                setNeGateway(binding.getVariable().toString());
                break;
            case  8 :
                setNeSecGateway(binding.getVariable().toString());
                break;
            case  9 :
                setNeActiveGateway(binding.getVariable().toString());
                break;
            case  10 :
                setNeAutoProv(binding.getVariable().toInt());
                break;
            case  11 :
                setNeAutoDeProv(binding.getVariable().toString());
                break;
            case  12 :
                setNeAutoEnabledTimer(binding.getVariable().toString());
                break;
            case  14 :
                setNeFPDetect(binding.getVariable().toInt());
                break;
            case  15 :
                setNeHTAutoShutdown(binding.getVariable().toInt());
                break;
        }
    }

    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE).append("neSWVersion", neSWVersion).append("neNum", neNum).append("neSiteNum", neSiteNum).append("neDateAndTime", neDateAndTime).append("neTimeZone", neTimeZone).append("neAutoDST", neAutoDST).append("neGateway", neGateway).append("neSecGateway", neSecGateway).append("neActiveGateway", neActiveGateway).append("neAutoProv", neAutoProv).append("neAutoDeProv", neAutoDeProv).append("neAutoEnabledTimer", neAutoEnabledTimer).append("neFPDetect", neFPDetect).append("neHTAutoShutdown", neHTAutoShutdown).toString();
    }

    public int hashCode() {
        return new HashCodeBuilder().append(neSWVersion).append(neNum).append(neSiteNum).append(neDateAndTime).append(neTimeZone).append(neAutoDST).append(neGateway).append(neSecGateway).append(neActiveGateway).append(neAutoProv).append(neAutoDeProv).append(neAutoEnabledTimer).append(neFPDetect).append(neHTAutoShutdown).toHashCode();
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
        NetworkElement rhs = ((NetworkElement) obj);
        return new EqualsBuilder().append(neSWVersion, rhs.neSWVersion).append(neNum, rhs.neNum).append(neSiteNum, rhs.neSiteNum).append(neDateAndTime, rhs.neDateAndTime).append(neTimeZone, rhs.neTimeZone).append(neAutoDST, rhs.neAutoDST).append(neGateway, rhs.neGateway).append(neSecGateway, rhs.neSecGateway).append(neActiveGateway, rhs.neActiveGateway).append(neAutoProv, rhs.neAutoProv).append(neAutoDeProv, rhs.neAutoDeProv).append(neAutoEnabledTimer, rhs.neAutoEnabledTimer).append(neFPDetect, rhs.neFPDetect).append(neHTAutoShutdown, rhs.neHTAutoShutdown).isEquals();
    }

    public NetworkElement clone() {
        NetworkElement _copy = new NetworkElement();
        _copy.neSWVersion = neSWVersion;
        _copy.neNum = neNum;
        _copy.neSiteNum = neSiteNum;
        _copy.neDateAndTime = neDateAndTime;
        _copy.neTimeZone = neTimeZone;
        _copy.neAutoDST = neAutoDST;
        _copy.neGateway = neGateway;
        _copy.neSecGateway = neSecGateway;
        _copy.neActiveGateway = neActiveGateway;
        _copy.neAutoProv = neAutoProv;
        _copy.neAutoDeProv = neAutoDeProv;
        _copy.neAutoEnabledTimer = neAutoEnabledTimer;
        _copy.neFPDetect = neFPDetect;
        _copy.neHTAutoShutdown = neHTAutoShutdown;
        return _copy;
    }

    public void set_ParentEntity(AbstractRootEntity parent) {
        parentEntity = parent;
    }

    private static DeviceEntityDescription createEntityDescription() {
        DeviceEntityDescription description = new DeviceEntityDescription(new OID("1.3.6.1.4.1.18070.2.2.1.1"));
        description.addField(new DeviceEntityDescription.FieldDescription(1, "neSWVersion", DeviceEntityDescription.FieldType.STRING, 255));
        description.addField(new DeviceEntityDescription.FieldDescription(2, "neNum", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(3, "neSiteNum", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(4, "neDateAndTime", DeviceEntityDescription.FieldType.DATE_AND_TIME, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(5, "neTimeZone", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(6, "neAutoDST", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(7, "neGateway", DeviceEntityDescription.FieldType.IP_ADDRESS, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(8, "neSecGateway", DeviceEntityDescription.FieldType.IP_ADDRESS, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(9, "neActiveGateway", DeviceEntityDescription.FieldType.IP_ADDRESS, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(10, "neAutoProv", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(11, "neAutoDeProv", DeviceEntityDescription.FieldType.STRING, 7));
        description.addField(new DeviceEntityDescription.FieldDescription(12, "neAutoEnabledTimer", DeviceEntityDescription.FieldType.STRING, 7));
        description.addField(new DeviceEntityDescription.FieldDescription(14, "neFPDetect", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(15, "neHTAutoShutdown", DeviceEntityDescription.FieldType.INTEGER, -1));
        return description;
    }

    public DeviceEntityDescription get_Description() {
        return _entityDescription;
    }

}
