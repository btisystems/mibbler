
package com.btisystems.mibbler.mibs.bti7000.bti7000_13_2_0.btisystems.btiproducts.bti7000.objects;

import java.io.Serializable;
import com.btisystems.mibbler.mibs.bti7000.interfaces.btisystems.btiproducts.bti7000.objects.IAdministration;
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

public class Administration
    extends DeviceEntity
    implements Serializable, IAdministration, IVariableBindingSetter
{

    private String tl1IpLockoutAddr;
    private int latestTl1LogNum;
    private AbstractRootEntity parentEntity;
    private final static DeviceEntityDescription _entityDescription = createEntityDescription();

    public Administration() {
    }

    public String getTl1IpLockoutAddr() {
        return this.tl1IpLockoutAddr;
    }

    public void setTl1IpLockoutAddr(String tl1IpLockoutAddr) {
        String oldValue = getTl1IpLockoutAddr();
        this.tl1IpLockoutAddr = tl1IpLockoutAddr;
        notifyChange(2, oldValue, tl1IpLockoutAddr);
    }

    public int getLatestTl1LogNum() {
        return this.latestTl1LogNum;
    }

    public void setLatestTl1LogNum(int latestTl1LogNum) {
        int oldValue = getLatestTl1LogNum();
        this.latestTl1LogNum = latestTl1LogNum;
        notifyChange(4, oldValue, latestTl1LogNum);
    }

    public void set(VariableBinding binding) {
        switch (binding.getOid().get(11)) {
            case  2 :
                setTl1IpLockoutAddr(binding.getVariable().toString());
                break;
            case  4 :
                setLatestTl1LogNum(binding.getVariable().toInt());
                break;
        }
    }

    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE).append("tl1IpLockoutAddr", tl1IpLockoutAddr).append("latestTl1LogNum", latestTl1LogNum).toString();
    }

    public int hashCode() {
        return new HashCodeBuilder().append(tl1IpLockoutAddr).append(latestTl1LogNum).toHashCode();
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
        Administration rhs = ((Administration) obj);
        return new EqualsBuilder().append(tl1IpLockoutAddr, rhs.tl1IpLockoutAddr).append(latestTl1LogNum, rhs.latestTl1LogNum).isEquals();
    }

    public Administration clone() {
        Administration _copy = new Administration();
        _copy.tl1IpLockoutAddr = tl1IpLockoutAddr;
        _copy.latestTl1LogNum = latestTl1LogNum;
        return _copy;
    }

    public void set_ParentEntity(AbstractRootEntity parent) {
        parentEntity = parent;
    }

    private static DeviceEntityDescription createEntityDescription() {
        DeviceEntityDescription description = new DeviceEntityDescription(new OID("1.3.6.1.4.1.18070.2.2.1.8"));
        description.addField(new DeviceEntityDescription.FieldDescription(2, "tl1IpLockoutAddr", DeviceEntityDescription.FieldType.STRING, 255));
        description.addField(new DeviceEntityDescription.FieldDescription(4, "latestTl1LogNum", DeviceEntityDescription.FieldType.UNSIGNED32, -1));
        return description;
    }

    public DeviceEntityDescription get_Description() {
        return _entityDescription;
    }

}
