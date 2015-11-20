
package com.btisystems.mibbler.mibs.rfc.rfc.mib_2.radiusmib.radiusaccounting.radiusaccclientmib.radiusaccclientmibobjects;

import java.io.Serializable;
import com.btisystems.mibbler.mibs.rfc.interfaces.mib_2.radiusmib.radiusaccounting.radiusaccclientmib.radiusaccclientmibobjects.IRadiusAccClient;
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

public class RadiusAccClient
    extends DeviceEntity
    implements Serializable, IRadiusAccClient, IVariableBindingSetter
{

    private int radiusAccClientInvalidServerAddresses;
    private String radiusAccClientIdentifier;
    private AbstractRootEntity parentEntity;
    private final static DeviceEntityDescription _entityDescription = createEntityDescription();

    public RadiusAccClient() {
    }

    public int getRadiusAccClientInvalidServerAddresses() {
        return this.radiusAccClientInvalidServerAddresses;
    }

    public void setRadiusAccClientInvalidServerAddresses(int radiusAccClientInvalidServerAddresses) {
        int oldValue = getRadiusAccClientInvalidServerAddresses();
        this.radiusAccClientInvalidServerAddresses = radiusAccClientInvalidServerAddresses;
        notifyChange(1, oldValue, radiusAccClientInvalidServerAddresses);
    }

    public String getRadiusAccClientIdentifier() {
        return this.radiusAccClientIdentifier;
    }

    public void setRadiusAccClientIdentifier(String radiusAccClientIdentifier) {
        String oldValue = getRadiusAccClientIdentifier();
        this.radiusAccClientIdentifier = radiusAccClientIdentifier;
        notifyChange(2, oldValue, radiusAccClientIdentifier);
    }

    public void set(VariableBinding binding) {
        switch (binding.getOid().get(11)) {
            case  1 :
                setRadiusAccClientInvalidServerAddresses(binding.getVariable().toInt());
                break;
            case  2 :
                setRadiusAccClientIdentifier(binding.getVariable().toString());
                break;
        }
    }

    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE).append("radiusAccClientInvalidServerAddresses", radiusAccClientInvalidServerAddresses).append("radiusAccClientIdentifier", radiusAccClientIdentifier).toString();
    }

    public int hashCode() {
        return new HashCodeBuilder().append(radiusAccClientInvalidServerAddresses).append(radiusAccClientIdentifier).toHashCode();
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
        RadiusAccClient rhs = ((RadiusAccClient) obj);
        return new EqualsBuilder().append(radiusAccClientInvalidServerAddresses, rhs.radiusAccClientInvalidServerAddresses).append(radiusAccClientIdentifier, rhs.radiusAccClientIdentifier).isEquals();
    }

    public RadiusAccClient clone() {
        RadiusAccClient _copy = new RadiusAccClient();
        _copy.radiusAccClientInvalidServerAddresses = radiusAccClientInvalidServerAddresses;
        _copy.radiusAccClientIdentifier = radiusAccClientIdentifier;
        return _copy;
    }

    public void set_ParentEntity(AbstractRootEntity parent) {
        parentEntity = parent;
    }

    private static DeviceEntityDescription createEntityDescription() {
        DeviceEntityDescription description = new DeviceEntityDescription(new OID("1.3.6.1.2.1.67.2.2.1.1"));
        description.addField(new DeviceEntityDescription.FieldDescription(1, "radiusAccClientInvalidServerAddresses", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(2, "radiusAccClientIdentifier", DeviceEntityDescription.FieldType.STRING, 255));
        return description;
    }

    public DeviceEntityDescription get_Description() {
        return _entityDescription;
    }

}
