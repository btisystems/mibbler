
package com.btisystems.mibbler.mibs.netsnmp.netsnmp.mib_2.application.assoctable;

import java.io.Serializable;
import com.btisystems.mibbler.mibs.netsnmp.interfaces.mib_2.application.assoctable.IAssocEntry;
import com.btisystems.mibbler.mibs.netsnmp.netsnmp.mib_2.application.AssocTable;
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

public class AssocEntry
    extends DeviceEntity
    implements Serializable, IAssocEntry, IIndexed, IVariableBindingSetter
{

    private int assocIndex;
    private String assocRemoteApplication;
    private String assocApplicationProtocol;
    private int assocApplicationType;
    private int assocDuration;
    private String _index;
    private AssocTable parentEntity;
    private final static DeviceEntityDescription _entityDescription = createEntityDescription();

    public AssocEntry() {
    }

    public int getAssocIndex() {
        return this.assocIndex;
    }

    public void setAssocIndex(int assocIndex) {
        int oldValue = getAssocIndex();
        this.assocIndex = assocIndex;
        notifyChange(1, oldValue, assocIndex);
    }

    public String getAssocRemoteApplication() {
        return this.assocRemoteApplication;
    }

    public void setAssocRemoteApplication(String assocRemoteApplication) {
        String oldValue = getAssocRemoteApplication();
        this.assocRemoteApplication = assocRemoteApplication;
        notifyChange(2, oldValue, assocRemoteApplication);
    }

    public String getAssocApplicationProtocol() {
        return this.assocApplicationProtocol;
    }

    public void setAssocApplicationProtocol(String assocApplicationProtocol) {
        String oldValue = getAssocApplicationProtocol();
        this.assocApplicationProtocol = assocApplicationProtocol;
        notifyChange(3, oldValue, assocApplicationProtocol);
    }

    public int getAssocApplicationType() {
        return this.assocApplicationType;
    }

    public void setAssocApplicationType(int assocApplicationType) {
        int oldValue = getAssocApplicationType();
        this.assocApplicationType = assocApplicationType;
        notifyChange(4, oldValue, assocApplicationType);
    }

    public int getAssocDuration() {
        return this.assocDuration;
    }

    public void setAssocDuration(int assocDuration) {
        int oldValue = getAssocDuration();
        this.assocDuration = assocDuration;
        notifyChange(5, oldValue, assocDuration);
    }

    public void set(VariableBinding binding) {
        switch (binding.getOid().get(9)) {
            case  1 :
                setAssocIndex(binding.getVariable().toInt());
                break;
            case  2 :
                setAssocRemoteApplication(binding.getVariable().toString());
                break;
            case  3 :
                setAssocApplicationProtocol(binding.getVariable().toString());
                break;
            case  4 :
                setAssocApplicationType(binding.getVariable().toInt());
                break;
            case  5 :
                setAssocDuration(binding.getVariable().toInt());
                break;
        }
    }

    public void _setIndex(OID oid) {
        byte[] _oidBytes = oid.toByteArray();
        int[] _oidInts = oid.toIntArray();
        int arrayOffset = 10;
        int _len;
        _index = new OID(_oidInts, 10, (oid.size()- 10)).toString();
        arrayOffset += 1;
        setAssocIndex(_oidInts[arrayOffset]);
        arrayOffset += 1;
    }

    public String _getIndex() {
        return _index;
    }

    public void _setTable(AssocTable table) {
        this.parentEntity = table;
    }

    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE).append("assocIndex", assocIndex).append("assocRemoteApplication", assocRemoteApplication).append("assocApplicationProtocol", assocApplicationProtocol).append("assocApplicationType", assocApplicationType).append("assocDuration", assocDuration).append("_index", _index).toString();
    }

    public int hashCode() {
        return new HashCodeBuilder().append(assocIndex).append(assocRemoteApplication).append(assocApplicationProtocol).append(assocApplicationType).append(assocDuration).append(_index).toHashCode();
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
        AssocEntry rhs = ((AssocEntry) obj);
        return new EqualsBuilder().append(assocIndex, rhs.assocIndex).append(assocRemoteApplication, rhs.assocRemoteApplication).append(assocApplicationProtocol, rhs.assocApplicationProtocol).append(assocApplicationType, rhs.assocApplicationType).append(assocDuration, rhs.assocDuration).append(_index, rhs._index).isEquals();
    }

    public AssocEntry clone() {
        AssocEntry _copy = new AssocEntry();
        _copy.assocIndex = assocIndex;
        _copy.assocRemoteApplication = assocRemoteApplication;
        _copy.assocApplicationProtocol = assocApplicationProtocol;
        _copy.assocApplicationType = assocApplicationType;
        _copy.assocDuration = assocDuration;
        _copy._index = _index;
        _copy.parentEntity = parentEntity;
        return _copy;
    }

    private static DeviceEntityDescription createEntityDescription() {
        DeviceEntityDescription description = new DeviceEntityDescription(new OID("1.3.6.1.2.1.27.2.1"));
        description.addField(new DeviceEntityDescription.FieldDescription(1, "assocIndex", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(2, "assocRemoteApplication", DeviceEntityDescription.FieldType.STRING, 765));
        description.addField(new DeviceEntityDescription.FieldDescription(3, "assocApplicationProtocol", DeviceEntityDescription.FieldType.OID, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(4, "assocApplicationType", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(5, "assocDuration", DeviceEntityDescription.FieldType.INTEGER, -1));
        return description;
    }

    public DeviceEntityDescription get_Description() {
        return _entityDescription;
    }

}
