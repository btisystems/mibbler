
package com.btisystems.mibbler.mibs.netsnmp.netsnmp.mib_2.dismaneventmib.dismaneventmibobjects.mtetrigger.mtetriggerbooleantable;

import java.io.Serializable;
import com.btisystems.mibbler.mibs.netsnmp.interfaces.mib_2.dismaneventmib.dismaneventmibobjects.mtetrigger.mtetriggerbooleantable.IMteTriggerBooleanEntry;
import com.btisystems.mibbler.mibs.netsnmp.netsnmp.mib_2.dismaneventmib.dismaneventmibobjects.mtetrigger.MteTriggerBooleanTable;
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

public class MteTriggerBooleanEntry
    extends DeviceEntity
    implements Serializable, IMteTriggerBooleanEntry, IIndexed, IVariableBindingSetter
{

    private Integer mteTriggerBooleanComparison;
    private Integer mteTriggerBooleanValue;
    private Integer mteTriggerBooleanStartup;
    private String mteTriggerBooleanObjectsOwner;
    private String mteTriggerBooleanObjects;
    private String mteTriggerBooleanEventOwner;
    private String mteTriggerBooleanEvent;
    private String _index;
    private MteTriggerBooleanTable parentEntity;
    private final static DeviceEntityDescription _entityDescription = createEntityDescription();

    public MteTriggerBooleanEntry() {
    }

    public int getMteTriggerBooleanComparison() {
        if (this.mteTriggerBooleanComparison == null) {
            return  1;
        }
        return this.mteTriggerBooleanComparison;
    }

    public boolean isMteTriggerBooleanComparisonDefined() {
        return (this.mteTriggerBooleanComparison!= null);
    }

    public void setMteTriggerBooleanComparison(int mteTriggerBooleanComparison) {
        int oldValue = getMteTriggerBooleanComparison();
        this.mteTriggerBooleanComparison = mteTriggerBooleanComparison;
        notifyChange(1, oldValue, mteTriggerBooleanComparison);
    }

    public int getMteTriggerBooleanValue() {
        if (this.mteTriggerBooleanValue == null) {
            return  0;
        }
        return this.mteTriggerBooleanValue;
    }

    public boolean isMteTriggerBooleanValueDefined() {
        return (this.mteTriggerBooleanValue!= null);
    }

    public void setMteTriggerBooleanValue(int mteTriggerBooleanValue) {
        int oldValue = getMteTriggerBooleanValue();
        this.mteTriggerBooleanValue = mteTriggerBooleanValue;
        notifyChange(2, oldValue, mteTriggerBooleanValue);
    }

    public int getMteTriggerBooleanStartup() {
        if (this.mteTriggerBooleanStartup == null) {
            return  1;
        }
        return this.mteTriggerBooleanStartup;
    }

    public boolean isMteTriggerBooleanStartupDefined() {
        return (this.mteTriggerBooleanStartup!= null);
    }

    public void setMteTriggerBooleanStartup(int mteTriggerBooleanStartup) {
        int oldValue = getMteTriggerBooleanStartup();
        this.mteTriggerBooleanStartup = mteTriggerBooleanStartup;
        notifyChange(3, oldValue, mteTriggerBooleanStartup);
    }

    public String getMteTriggerBooleanObjectsOwner() {
        return this.mteTriggerBooleanObjectsOwner;
    }

    public void setMteTriggerBooleanObjectsOwner(String mteTriggerBooleanObjectsOwner) {
        String oldValue = getMteTriggerBooleanObjectsOwner();
        this.mteTriggerBooleanObjectsOwner = mteTriggerBooleanObjectsOwner;
        notifyChange(4, oldValue, mteTriggerBooleanObjectsOwner);
    }

    public String getMteTriggerBooleanObjects() {
        return this.mteTriggerBooleanObjects;
    }

    public void setMteTriggerBooleanObjects(String mteTriggerBooleanObjects) {
        String oldValue = getMteTriggerBooleanObjects();
        this.mteTriggerBooleanObjects = mteTriggerBooleanObjects;
        notifyChange(5, oldValue, mteTriggerBooleanObjects);
    }

    public String getMteTriggerBooleanEventOwner() {
        return this.mteTriggerBooleanEventOwner;
    }

    public void setMteTriggerBooleanEventOwner(String mteTriggerBooleanEventOwner) {
        String oldValue = getMteTriggerBooleanEventOwner();
        this.mteTriggerBooleanEventOwner = mteTriggerBooleanEventOwner;
        notifyChange(6, oldValue, mteTriggerBooleanEventOwner);
    }

    public String getMteTriggerBooleanEvent() {
        return this.mteTriggerBooleanEvent;
    }

    public void setMteTriggerBooleanEvent(String mteTriggerBooleanEvent) {
        String oldValue = getMteTriggerBooleanEvent();
        this.mteTriggerBooleanEvent = mteTriggerBooleanEvent;
        notifyChange(7, oldValue, mteTriggerBooleanEvent);
    }

    public void set(VariableBinding binding) {
        switch (binding.getOid().get(11)) {
            case  1 :
                setMteTriggerBooleanComparison(binding.getVariable().toInt());
                break;
            case  2 :
                setMteTriggerBooleanValue(binding.getVariable().toInt());
                break;
            case  3 :
                setMteTriggerBooleanStartup(binding.getVariable().toInt());
                break;
            case  4 :
                setMteTriggerBooleanObjectsOwner(binding.getVariable().toString());
                break;
            case  5 :
                setMteTriggerBooleanObjects(binding.getVariable().toString());
                break;
            case  6 :
                setMteTriggerBooleanEventOwner(binding.getVariable().toString());
                break;
            case  7 :
                setMteTriggerBooleanEvent(binding.getVariable().toString());
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

    public void _setTable(MteTriggerBooleanTable table) {
        this.parentEntity = table;
    }

    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE).append("mteTriggerBooleanComparison", mteTriggerBooleanComparison).append("mteTriggerBooleanValue", mteTriggerBooleanValue).append("mteTriggerBooleanStartup", mteTriggerBooleanStartup).append("mteTriggerBooleanObjectsOwner", mteTriggerBooleanObjectsOwner).append("mteTriggerBooleanObjects", mteTriggerBooleanObjects).append("mteTriggerBooleanEventOwner", mteTriggerBooleanEventOwner).append("mteTriggerBooleanEvent", mteTriggerBooleanEvent).append("_index", _index).toString();
    }

    public int hashCode() {
        return new HashCodeBuilder().append(mteTriggerBooleanComparison).append(mteTriggerBooleanValue).append(mteTriggerBooleanStartup).append(mteTriggerBooleanObjectsOwner).append(mteTriggerBooleanObjects).append(mteTriggerBooleanEventOwner).append(mteTriggerBooleanEvent).append(_index).toHashCode();
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
        MteTriggerBooleanEntry rhs = ((MteTriggerBooleanEntry) obj);
        return new EqualsBuilder().append(mteTriggerBooleanComparison, rhs.mteTriggerBooleanComparison).append(mteTriggerBooleanValue, rhs.mteTriggerBooleanValue).append(mteTriggerBooleanStartup, rhs.mteTriggerBooleanStartup).append(mteTriggerBooleanObjectsOwner, rhs.mteTriggerBooleanObjectsOwner).append(mteTriggerBooleanObjects, rhs.mteTriggerBooleanObjects).append(mteTriggerBooleanEventOwner, rhs.mteTriggerBooleanEventOwner).append(mteTriggerBooleanEvent, rhs.mteTriggerBooleanEvent).append(_index, rhs._index).isEquals();
    }

    public MteTriggerBooleanEntry clone() {
        MteTriggerBooleanEntry _copy = new MteTriggerBooleanEntry();
        _copy.mteTriggerBooleanComparison = mteTriggerBooleanComparison;
        _copy.mteTriggerBooleanValue = mteTriggerBooleanValue;
        _copy.mteTriggerBooleanStartup = mteTriggerBooleanStartup;
        _copy.mteTriggerBooleanObjectsOwner = mteTriggerBooleanObjectsOwner;
        _copy.mteTriggerBooleanObjects = mteTriggerBooleanObjects;
        _copy.mteTriggerBooleanEventOwner = mteTriggerBooleanEventOwner;
        _copy.mteTriggerBooleanEvent = mteTriggerBooleanEvent;
        _copy._index = _index;
        _copy.parentEntity = parentEntity;
        return _copy;
    }

    private static DeviceEntityDescription createEntityDescription() {
        DeviceEntityDescription description = new DeviceEntityDescription(new OID("1.3.6.1.2.1.88.1.2.5.1"));
        description.addField(new DeviceEntityDescription.FieldDescription(1, "mteTriggerBooleanComparison", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(2, "mteTriggerBooleanValue", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(3, "mteTriggerBooleanStartup", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(4, "mteTriggerBooleanObjectsOwner", DeviceEntityDescription.FieldType.STRING, 765));
        description.addField(new DeviceEntityDescription.FieldDescription(5, "mteTriggerBooleanObjects", DeviceEntityDescription.FieldType.STRING, 765));
        description.addField(new DeviceEntityDescription.FieldDescription(6, "mteTriggerBooleanEventOwner", DeviceEntityDescription.FieldType.STRING, 765));
        description.addField(new DeviceEntityDescription.FieldDescription(7, "mteTriggerBooleanEvent", DeviceEntityDescription.FieldType.STRING, 765));
        return description;
    }

    public DeviceEntityDescription get_Description() {
        return _entityDescription;
    }

}
