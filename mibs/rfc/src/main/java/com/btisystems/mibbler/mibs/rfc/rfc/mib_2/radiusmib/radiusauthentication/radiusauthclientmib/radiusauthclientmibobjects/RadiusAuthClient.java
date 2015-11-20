
package com.btisystems.mibbler.mibs.rfc.rfc.mib_2.radiusmib.radiusauthentication.radiusauthclientmib.radiusauthclientmibobjects;

import java.io.Serializable;
import com.btisystems.mibbler.mibs.rfc.interfaces.mib_2.radiusmib.radiusauthentication.radiusauthclientmib.radiusauthclientmibobjects.IRadiusAuthClient;
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

public class RadiusAuthClient
    extends DeviceEntity
    implements Serializable, IRadiusAuthClient, IVariableBindingSetter
{

    private int radiusAuthClientInvalidServerAddresses;
    private String radiusAuthClientIdentifier;
    private AbstractRootEntity parentEntity;
    private final static DeviceEntityDescription _entityDescription = createEntityDescription();

    public RadiusAuthClient() {
    }

    public int getRadiusAuthClientInvalidServerAddresses() {
        return this.radiusAuthClientInvalidServerAddresses;
    }

    public void setRadiusAuthClientInvalidServerAddresses(int radiusAuthClientInvalidServerAddresses) {
        int oldValue = getRadiusAuthClientInvalidServerAddresses();
        this.radiusAuthClientInvalidServerAddresses = radiusAuthClientInvalidServerAddresses;
        notifyChange(1, oldValue, radiusAuthClientInvalidServerAddresses);
    }

    public String getRadiusAuthClientIdentifier() {
        return this.radiusAuthClientIdentifier;
    }

    public void setRadiusAuthClientIdentifier(String radiusAuthClientIdentifier) {
        String oldValue = getRadiusAuthClientIdentifier();
        this.radiusAuthClientIdentifier = radiusAuthClientIdentifier;
        notifyChange(2, oldValue, radiusAuthClientIdentifier);
    }

    public void set(VariableBinding binding) {
        switch (binding.getOid().get(11)) {
            case  1 :
                setRadiusAuthClientInvalidServerAddresses(binding.getVariable().toInt());
                break;
            case  2 :
                setRadiusAuthClientIdentifier(binding.getVariable().toString());
                break;
        }
    }

    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE).append("radiusAuthClientInvalidServerAddresses", radiusAuthClientInvalidServerAddresses).append("radiusAuthClientIdentifier", radiusAuthClientIdentifier).toString();
    }

    public int hashCode() {
        return new HashCodeBuilder().append(radiusAuthClientInvalidServerAddresses).append(radiusAuthClientIdentifier).toHashCode();
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
        RadiusAuthClient rhs = ((RadiusAuthClient) obj);
        return new EqualsBuilder().append(radiusAuthClientInvalidServerAddresses, rhs.radiusAuthClientInvalidServerAddresses).append(radiusAuthClientIdentifier, rhs.radiusAuthClientIdentifier).isEquals();
    }

    public RadiusAuthClient clone() {
        RadiusAuthClient _copy = new RadiusAuthClient();
        _copy.radiusAuthClientInvalidServerAddresses = radiusAuthClientInvalidServerAddresses;
        _copy.radiusAuthClientIdentifier = radiusAuthClientIdentifier;
        return _copy;
    }

    public void set_ParentEntity(AbstractRootEntity parent) {
        parentEntity = parent;
    }

    private static DeviceEntityDescription createEntityDescription() {
        DeviceEntityDescription description = new DeviceEntityDescription(new OID("1.3.6.1.2.1.67.1.2.1.1"));
        description.addField(new DeviceEntityDescription.FieldDescription(1, "radiusAuthClientInvalidServerAddresses", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(2, "radiusAuthClientIdentifier", DeviceEntityDescription.FieldType.STRING, 255));
        return description;
    }

    public DeviceEntityDescription get_Description() {
        return _entityDescription;
    }

}
