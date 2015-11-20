
package com.btisystems.mibbler.mibs.netsnmp.netsnmp.mib_2.dismaneventmib.dismaneventmibobjects.mtetrigger.mtetriggerdeltatable;

import java.io.Serializable;
import com.btisystems.mibbler.mibs.netsnmp.interfaces.mib_2.dismaneventmib.dismaneventmibobjects.mtetrigger.mtetriggerdeltatable.IMteTriggerDeltaEntry;
import com.btisystems.mibbler.mibs.netsnmp.netsnmp.mib_2.dismaneventmib.dismaneventmibobjects.mtetrigger.MteTriggerDeltaTable;
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

public class MteTriggerDeltaEntry
    extends DeviceEntity
    implements Serializable, IMteTriggerDeltaEntry, IIndexed, IVariableBindingSetter
{

    private String mteTriggerDeltaDiscontinuityID;
    private Integer mteTriggerDeltaDiscontinuityIDWildcard;
    private Integer mteTriggerDeltaDiscontinuityIDType;
    private String _index;
    private MteTriggerDeltaTable parentEntity;
    private final static DeviceEntityDescription _entityDescription = createEntityDescription();

    public MteTriggerDeltaEntry() {
    }

    public String getMteTriggerDeltaDiscontinuityID() {
        return this.mteTriggerDeltaDiscontinuityID;
    }

    public void setMteTriggerDeltaDiscontinuityID(String mteTriggerDeltaDiscontinuityID) {
        String oldValue = getMteTriggerDeltaDiscontinuityID();
        this.mteTriggerDeltaDiscontinuityID = mteTriggerDeltaDiscontinuityID;
        notifyChange(1, oldValue, mteTriggerDeltaDiscontinuityID);
    }

    public int getMteTriggerDeltaDiscontinuityIDWildcard() {
        if (this.mteTriggerDeltaDiscontinuityIDWildcard == null) {
            return  2;
        }
        return this.mteTriggerDeltaDiscontinuityIDWildcard;
    }

    public boolean isMteTriggerDeltaDiscontinuityIDWildcardDefined() {
        return (this.mteTriggerDeltaDiscontinuityIDWildcard!= null);
    }

    public void setMteTriggerDeltaDiscontinuityIDWildcard(int mteTriggerDeltaDiscontinuityIDWildcard) {
        int oldValue = getMteTriggerDeltaDiscontinuityIDWildcard();
        this.mteTriggerDeltaDiscontinuityIDWildcard = mteTriggerDeltaDiscontinuityIDWildcard;
        notifyChange(2, oldValue, mteTriggerDeltaDiscontinuityIDWildcard);
    }

    public int getMteTriggerDeltaDiscontinuityIDType() {
        if (this.mteTriggerDeltaDiscontinuityIDType == null) {
            return  1;
        }
        return this.mteTriggerDeltaDiscontinuityIDType;
    }

    public boolean isMteTriggerDeltaDiscontinuityIDTypeDefined() {
        return (this.mteTriggerDeltaDiscontinuityIDType!= null);
    }

    public void setMteTriggerDeltaDiscontinuityIDType(int mteTriggerDeltaDiscontinuityIDType) {
        int oldValue = getMteTriggerDeltaDiscontinuityIDType();
        this.mteTriggerDeltaDiscontinuityIDType = mteTriggerDeltaDiscontinuityIDType;
        notifyChange(3, oldValue, mteTriggerDeltaDiscontinuityIDType);
    }

    public void set(VariableBinding binding) {
        switch (binding.getOid().get(11)) {
            case  1 :
                setMteTriggerDeltaDiscontinuityID(binding.getVariable().toString());
                break;
            case  2 :
                setMteTriggerDeltaDiscontinuityIDWildcard(binding.getVariable().toInt());
                break;
            case  3 :
                setMteTriggerDeltaDiscontinuityIDType(binding.getVariable().toInt());
                break;
        }
    }

    public void _setIndex(OID oid) {
        byte[] _oidBytes = oid.toByteArray();
        int[] _oidInts = oid.toIntArray();
        int arrayOffset = 12;
        int _len;
        _index = new OID(_oidInts, 12, (oid.size()- 12)).toString();
        _len = _oidInts[arrayOffset ++];
        arrayOffset += _len;
    }

    public String _getIndex() {
        return _index;
    }

    public void _setTable(MteTriggerDeltaTable table) {
        this.parentEntity = table;
    }

    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE).append("mteTriggerDeltaDiscontinuityID", mteTriggerDeltaDiscontinuityID).append("mteTriggerDeltaDiscontinuityIDWildcard", mteTriggerDeltaDiscontinuityIDWildcard).append("mteTriggerDeltaDiscontinuityIDType", mteTriggerDeltaDiscontinuityIDType).append("_index", _index).toString();
    }

    public int hashCode() {
        return new HashCodeBuilder().append(mteTriggerDeltaDiscontinuityID).append(mteTriggerDeltaDiscontinuityIDWildcard).append(mteTriggerDeltaDiscontinuityIDType).append(_index).toHashCode();
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
        MteTriggerDeltaEntry rhs = ((MteTriggerDeltaEntry) obj);
        return new EqualsBuilder().append(mteTriggerDeltaDiscontinuityID, rhs.mteTriggerDeltaDiscontinuityID).append(mteTriggerDeltaDiscontinuityIDWildcard, rhs.mteTriggerDeltaDiscontinuityIDWildcard).append(mteTriggerDeltaDiscontinuityIDType, rhs.mteTriggerDeltaDiscontinuityIDType).append(_index, rhs._index).isEquals();
    }

    public MteTriggerDeltaEntry clone() {
        MteTriggerDeltaEntry _copy = new MteTriggerDeltaEntry();
        _copy.mteTriggerDeltaDiscontinuityID = mteTriggerDeltaDiscontinuityID;
        _copy.mteTriggerDeltaDiscontinuityIDWildcard = mteTriggerDeltaDiscontinuityIDWildcard;
        _copy.mteTriggerDeltaDiscontinuityIDType = mteTriggerDeltaDiscontinuityIDType;
        _copy._index = _index;
        _copy.parentEntity = parentEntity;
        return _copy;
    }

    private static DeviceEntityDescription createEntityDescription() {
        DeviceEntityDescription description = new DeviceEntityDescription(new OID("1.3.6.1.2.1.88.1.2.3.1"));
        description.addField(new DeviceEntityDescription.FieldDescription(1, "mteTriggerDeltaDiscontinuityID", DeviceEntityDescription.FieldType.OID, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(2, "mteTriggerDeltaDiscontinuityIDWildcard", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(3, "mteTriggerDeltaDiscontinuityIDType", DeviceEntityDescription.FieldType.INTEGER, -1));
        return description;
    }

    public DeviceEntityDescription get_Description() {
        return _entityDescription;
    }

}
