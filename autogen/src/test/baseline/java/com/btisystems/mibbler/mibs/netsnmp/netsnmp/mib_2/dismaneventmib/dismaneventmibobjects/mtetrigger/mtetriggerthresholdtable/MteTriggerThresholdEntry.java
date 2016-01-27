
package com.btisystems.mibbler.mibs.netsnmp.netsnmp.mib_2.dismaneventmib.dismaneventmibobjects.mtetrigger.mtetriggerthresholdtable;

import java.io.Serializable;
import com.btisystems.mibbler.mibs.netsnmp.interfaces.mib_2.dismaneventmib.dismaneventmibobjects.mtetrigger.mtetriggerthresholdtable.IMteTriggerThresholdEntry;
import com.btisystems.mibbler.mibs.netsnmp.netsnmp.mib_2.dismaneventmib.dismaneventmibobjects.mtetrigger.MteTriggerThresholdTable;
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

public class MteTriggerThresholdEntry
    extends DeviceEntity
    implements Serializable, IMteTriggerThresholdEntry, IIndexed, IVariableBindingSetter
{

    private Integer mteTriggerThresholdStartup;
    private Integer mteTriggerThresholdRising;
    private Integer mteTriggerThresholdFalling;
    private Integer mteTriggerThresholdDeltaRising;
    private Integer mteTriggerThresholdDeltaFalling;
    private String mteTriggerThresholdObjectsOwner;
    private String mteTriggerThresholdObjects;
    private String mteTriggerThresholdRisingEventOwner;
    private String mteTriggerThresholdRisingEvent;
    private String mteTriggerThresholdFallingEventOwner;
    private String mteTriggerThresholdFallingEvent;
    private String mteTriggerThresholdDeltaRisingEventOwner;
    private String mteTriggerThresholdDeltaRisingEvent;
    private String mteTriggerThresholdDeltaFallingEventOwner;
    private String mteTriggerThresholdDeltaFallingEvent;
    private String _index;
    private MteTriggerThresholdTable parentEntity;
    private final static DeviceEntityDescription _entityDescription = createEntityDescription();

    public MteTriggerThresholdEntry() {
    }

    public int getMteTriggerThresholdStartup() {
        if (this.mteTriggerThresholdStartup == null) {
            return  3;
        }
        return this.mteTriggerThresholdStartup;
    }

    public boolean isMteTriggerThresholdStartupDefined() {
        return (this.mteTriggerThresholdStartup!= null);
    }

    public void setMteTriggerThresholdStartup(int mteTriggerThresholdStartup) {
        int oldValue = getMteTriggerThresholdStartup();
        this.mteTriggerThresholdStartup = mteTriggerThresholdStartup;
        notifyChange(1, oldValue, mteTriggerThresholdStartup);
    }

    public int getMteTriggerThresholdRising() {
        if (this.mteTriggerThresholdRising == null) {
            return  0;
        }
        return this.mteTriggerThresholdRising;
    }

    public boolean isMteTriggerThresholdRisingDefined() {
        return (this.mteTriggerThresholdRising!= null);
    }

    public void setMteTriggerThresholdRising(int mteTriggerThresholdRising) {
        int oldValue = getMteTriggerThresholdRising();
        this.mteTriggerThresholdRising = mteTriggerThresholdRising;
        notifyChange(2, oldValue, mteTriggerThresholdRising);
    }

    public int getMteTriggerThresholdFalling() {
        if (this.mteTriggerThresholdFalling == null) {
            return  0;
        }
        return this.mteTriggerThresholdFalling;
    }

    public boolean isMteTriggerThresholdFallingDefined() {
        return (this.mteTriggerThresholdFalling!= null);
    }

    public void setMteTriggerThresholdFalling(int mteTriggerThresholdFalling) {
        int oldValue = getMteTriggerThresholdFalling();
        this.mteTriggerThresholdFalling = mteTriggerThresholdFalling;
        notifyChange(3, oldValue, mteTriggerThresholdFalling);
    }

    public int getMteTriggerThresholdDeltaRising() {
        if (this.mteTriggerThresholdDeltaRising == null) {
            return  0;
        }
        return this.mteTriggerThresholdDeltaRising;
    }

    public boolean isMteTriggerThresholdDeltaRisingDefined() {
        return (this.mteTriggerThresholdDeltaRising!= null);
    }

    public void setMteTriggerThresholdDeltaRising(int mteTriggerThresholdDeltaRising) {
        int oldValue = getMteTriggerThresholdDeltaRising();
        this.mteTriggerThresholdDeltaRising = mteTriggerThresholdDeltaRising;
        notifyChange(4, oldValue, mteTriggerThresholdDeltaRising);
    }

    public int getMteTriggerThresholdDeltaFalling() {
        if (this.mteTriggerThresholdDeltaFalling == null) {
            return  0;
        }
        return this.mteTriggerThresholdDeltaFalling;
    }

    public boolean isMteTriggerThresholdDeltaFallingDefined() {
        return (this.mteTriggerThresholdDeltaFalling!= null);
    }

    public void setMteTriggerThresholdDeltaFalling(int mteTriggerThresholdDeltaFalling) {
        int oldValue = getMteTriggerThresholdDeltaFalling();
        this.mteTriggerThresholdDeltaFalling = mteTriggerThresholdDeltaFalling;
        notifyChange(5, oldValue, mteTriggerThresholdDeltaFalling);
    }

    public String getMteTriggerThresholdObjectsOwner() {
        return this.mteTriggerThresholdObjectsOwner;
    }

    public void setMteTriggerThresholdObjectsOwner(String mteTriggerThresholdObjectsOwner) {
        String oldValue = getMteTriggerThresholdObjectsOwner();
        this.mteTriggerThresholdObjectsOwner = mteTriggerThresholdObjectsOwner;
        notifyChange(6, oldValue, mteTriggerThresholdObjectsOwner);
    }

    public String getMteTriggerThresholdObjects() {
        return this.mteTriggerThresholdObjects;
    }

    public void setMteTriggerThresholdObjects(String mteTriggerThresholdObjects) {
        String oldValue = getMteTriggerThresholdObjects();
        this.mteTriggerThresholdObjects = mteTriggerThresholdObjects;
        notifyChange(7, oldValue, mteTriggerThresholdObjects);
    }

    public String getMteTriggerThresholdRisingEventOwner() {
        return this.mteTriggerThresholdRisingEventOwner;
    }

    public void setMteTriggerThresholdRisingEventOwner(String mteTriggerThresholdRisingEventOwner) {
        String oldValue = getMteTriggerThresholdRisingEventOwner();
        this.mteTriggerThresholdRisingEventOwner = mteTriggerThresholdRisingEventOwner;
        notifyChange(8, oldValue, mteTriggerThresholdRisingEventOwner);
    }

    public String getMteTriggerThresholdRisingEvent() {
        return this.mteTriggerThresholdRisingEvent;
    }

    public void setMteTriggerThresholdRisingEvent(String mteTriggerThresholdRisingEvent) {
        String oldValue = getMteTriggerThresholdRisingEvent();
        this.mteTriggerThresholdRisingEvent = mteTriggerThresholdRisingEvent;
        notifyChange(9, oldValue, mteTriggerThresholdRisingEvent);
    }

    public String getMteTriggerThresholdFallingEventOwner() {
        return this.mteTriggerThresholdFallingEventOwner;
    }

    public void setMteTriggerThresholdFallingEventOwner(String mteTriggerThresholdFallingEventOwner) {
        String oldValue = getMteTriggerThresholdFallingEventOwner();
        this.mteTriggerThresholdFallingEventOwner = mteTriggerThresholdFallingEventOwner;
        notifyChange(10, oldValue, mteTriggerThresholdFallingEventOwner);
    }

    public String getMteTriggerThresholdFallingEvent() {
        return this.mteTriggerThresholdFallingEvent;
    }

    public void setMteTriggerThresholdFallingEvent(String mteTriggerThresholdFallingEvent) {
        String oldValue = getMteTriggerThresholdFallingEvent();
        this.mteTriggerThresholdFallingEvent = mteTriggerThresholdFallingEvent;
        notifyChange(11, oldValue, mteTriggerThresholdFallingEvent);
    }

    public String getMteTriggerThresholdDeltaRisingEventOwner() {
        return this.mteTriggerThresholdDeltaRisingEventOwner;
    }

    public void setMteTriggerThresholdDeltaRisingEventOwner(String mteTriggerThresholdDeltaRisingEventOwner) {
        String oldValue = getMteTriggerThresholdDeltaRisingEventOwner();
        this.mteTriggerThresholdDeltaRisingEventOwner = mteTriggerThresholdDeltaRisingEventOwner;
        notifyChange(12, oldValue, mteTriggerThresholdDeltaRisingEventOwner);
    }

    public String getMteTriggerThresholdDeltaRisingEvent() {
        return this.mteTriggerThresholdDeltaRisingEvent;
    }

    public void setMteTriggerThresholdDeltaRisingEvent(String mteTriggerThresholdDeltaRisingEvent) {
        String oldValue = getMteTriggerThresholdDeltaRisingEvent();
        this.mteTriggerThresholdDeltaRisingEvent = mteTriggerThresholdDeltaRisingEvent;
        notifyChange(13, oldValue, mteTriggerThresholdDeltaRisingEvent);
    }

    public String getMteTriggerThresholdDeltaFallingEventOwner() {
        return this.mteTriggerThresholdDeltaFallingEventOwner;
    }

    public void setMteTriggerThresholdDeltaFallingEventOwner(String mteTriggerThresholdDeltaFallingEventOwner) {
        String oldValue = getMteTriggerThresholdDeltaFallingEventOwner();
        this.mteTriggerThresholdDeltaFallingEventOwner = mteTriggerThresholdDeltaFallingEventOwner;
        notifyChange(14, oldValue, mteTriggerThresholdDeltaFallingEventOwner);
    }

    public String getMteTriggerThresholdDeltaFallingEvent() {
        return this.mteTriggerThresholdDeltaFallingEvent;
    }

    public void setMteTriggerThresholdDeltaFallingEvent(String mteTriggerThresholdDeltaFallingEvent) {
        String oldValue = getMteTriggerThresholdDeltaFallingEvent();
        this.mteTriggerThresholdDeltaFallingEvent = mteTriggerThresholdDeltaFallingEvent;
        notifyChange(15, oldValue, mteTriggerThresholdDeltaFallingEvent);
    }

    public void set(VariableBinding binding) {
        switch (binding.getOid().get(11)) {
            case  1 :
                setMteTriggerThresholdStartup(binding.getVariable().toInt());
                break;
            case  2 :
                setMteTriggerThresholdRising(binding.getVariable().toInt());
                break;
            case  3 :
                setMteTriggerThresholdFalling(binding.getVariable().toInt());
                break;
            case  4 :
                setMteTriggerThresholdDeltaRising(binding.getVariable().toInt());
                break;
            case  5 :
                setMteTriggerThresholdDeltaFalling(binding.getVariable().toInt());
                break;
            case  6 :
                setMteTriggerThresholdObjectsOwner(binding.getVariable().toString());
                break;
            case  7 :
                setMteTriggerThresholdObjects(binding.getVariable().toString());
                break;
            case  8 :
                setMteTriggerThresholdRisingEventOwner(binding.getVariable().toString());
                break;
            case  9 :
                setMteTriggerThresholdRisingEvent(binding.getVariable().toString());
                break;
            case  10 :
                setMteTriggerThresholdFallingEventOwner(binding.getVariable().toString());
                break;
            case  11 :
                setMteTriggerThresholdFallingEvent(binding.getVariable().toString());
                break;
            case  12 :
                setMteTriggerThresholdDeltaRisingEventOwner(binding.getVariable().toString());
                break;
            case  13 :
                setMteTriggerThresholdDeltaRisingEvent(binding.getVariable().toString());
                break;
            case  14 :
                setMteTriggerThresholdDeltaFallingEventOwner(binding.getVariable().toString());
                break;
            case  15 :
                setMteTriggerThresholdDeltaFallingEvent(binding.getVariable().toString());
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

    public void _setTable(MteTriggerThresholdTable table) {
        this.parentEntity = table;
    }

    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE).append("mteTriggerThresholdStartup", mteTriggerThresholdStartup).append("mteTriggerThresholdRising", mteTriggerThresholdRising).append("mteTriggerThresholdFalling", mteTriggerThresholdFalling).append("mteTriggerThresholdDeltaRising", mteTriggerThresholdDeltaRising).append("mteTriggerThresholdDeltaFalling", mteTriggerThresholdDeltaFalling).append("mteTriggerThresholdObjectsOwner", mteTriggerThresholdObjectsOwner).append("mteTriggerThresholdObjects", mteTriggerThresholdObjects).append("mteTriggerThresholdRisingEventOwner", mteTriggerThresholdRisingEventOwner).append("mteTriggerThresholdRisingEvent", mteTriggerThresholdRisingEvent).append("mteTriggerThresholdFallingEventOwner", mteTriggerThresholdFallingEventOwner).append("mteTriggerThresholdFallingEvent", mteTriggerThresholdFallingEvent).append("mteTriggerThresholdDeltaRisingEventOwner", mteTriggerThresholdDeltaRisingEventOwner).append("mteTriggerThresholdDeltaRisingEvent", mteTriggerThresholdDeltaRisingEvent).append("mteTriggerThresholdDeltaFallingEventOwner", mteTriggerThresholdDeltaFallingEventOwner).append("mteTriggerThresholdDeltaFallingEvent", mteTriggerThresholdDeltaFallingEvent).append("_index", _index).toString();
    }

    public int hashCode() {
        return new HashCodeBuilder().append(mteTriggerThresholdStartup).append(mteTriggerThresholdRising).append(mteTriggerThresholdFalling).append(mteTriggerThresholdDeltaRising).append(mteTriggerThresholdDeltaFalling).append(mteTriggerThresholdObjectsOwner).append(mteTriggerThresholdObjects).append(mteTriggerThresholdRisingEventOwner).append(mteTriggerThresholdRisingEvent).append(mteTriggerThresholdFallingEventOwner).append(mteTriggerThresholdFallingEvent).append(mteTriggerThresholdDeltaRisingEventOwner).append(mteTriggerThresholdDeltaRisingEvent).append(mteTriggerThresholdDeltaFallingEventOwner).append(mteTriggerThresholdDeltaFallingEvent).append(_index).toHashCode();
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
        MteTriggerThresholdEntry rhs = ((MteTriggerThresholdEntry) obj);
        return new EqualsBuilder().append(mteTriggerThresholdStartup, rhs.mteTriggerThresholdStartup).append(mteTriggerThresholdRising, rhs.mteTriggerThresholdRising).append(mteTriggerThresholdFalling, rhs.mteTriggerThresholdFalling).append(mteTriggerThresholdDeltaRising, rhs.mteTriggerThresholdDeltaRising).append(mteTriggerThresholdDeltaFalling, rhs.mteTriggerThresholdDeltaFalling).append(mteTriggerThresholdObjectsOwner, rhs.mteTriggerThresholdObjectsOwner).append(mteTriggerThresholdObjects, rhs.mteTriggerThresholdObjects).append(mteTriggerThresholdRisingEventOwner, rhs.mteTriggerThresholdRisingEventOwner).append(mteTriggerThresholdRisingEvent, rhs.mteTriggerThresholdRisingEvent).append(mteTriggerThresholdFallingEventOwner, rhs.mteTriggerThresholdFallingEventOwner).append(mteTriggerThresholdFallingEvent, rhs.mteTriggerThresholdFallingEvent).append(mteTriggerThresholdDeltaRisingEventOwner, rhs.mteTriggerThresholdDeltaRisingEventOwner).append(mteTriggerThresholdDeltaRisingEvent, rhs.mteTriggerThresholdDeltaRisingEvent).append(mteTriggerThresholdDeltaFallingEventOwner, rhs.mteTriggerThresholdDeltaFallingEventOwner).append(mteTriggerThresholdDeltaFallingEvent, rhs.mteTriggerThresholdDeltaFallingEvent).append(_index, rhs._index).isEquals();
    }

    public MteTriggerThresholdEntry clone() {
        MteTriggerThresholdEntry _copy = new MteTriggerThresholdEntry();
        _copy.mteTriggerThresholdStartup = mteTriggerThresholdStartup;
        _copy.mteTriggerThresholdRising = mteTriggerThresholdRising;
        _copy.mteTriggerThresholdFalling = mteTriggerThresholdFalling;
        _copy.mteTriggerThresholdDeltaRising = mteTriggerThresholdDeltaRising;
        _copy.mteTriggerThresholdDeltaFalling = mteTriggerThresholdDeltaFalling;
        _copy.mteTriggerThresholdObjectsOwner = mteTriggerThresholdObjectsOwner;
        _copy.mteTriggerThresholdObjects = mteTriggerThresholdObjects;
        _copy.mteTriggerThresholdRisingEventOwner = mteTriggerThresholdRisingEventOwner;
        _copy.mteTriggerThresholdRisingEvent = mteTriggerThresholdRisingEvent;
        _copy.mteTriggerThresholdFallingEventOwner = mteTriggerThresholdFallingEventOwner;
        _copy.mteTriggerThresholdFallingEvent = mteTriggerThresholdFallingEvent;
        _copy.mteTriggerThresholdDeltaRisingEventOwner = mteTriggerThresholdDeltaRisingEventOwner;
        _copy.mteTriggerThresholdDeltaRisingEvent = mteTriggerThresholdDeltaRisingEvent;
        _copy.mteTriggerThresholdDeltaFallingEventOwner = mteTriggerThresholdDeltaFallingEventOwner;
        _copy.mteTriggerThresholdDeltaFallingEvent = mteTriggerThresholdDeltaFallingEvent;
        _copy._index = _index;
        _copy.parentEntity = parentEntity;
        return _copy;
    }

    private static DeviceEntityDescription createEntityDescription() {
        DeviceEntityDescription description = new DeviceEntityDescription(new OID("1.3.6.1.2.1.88.1.2.6.1"));
        description.addField(new DeviceEntityDescription.FieldDescription(1, "mteTriggerThresholdStartup", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(2, "mteTriggerThresholdRising", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(3, "mteTriggerThresholdFalling", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(4, "mteTriggerThresholdDeltaRising", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(5, "mteTriggerThresholdDeltaFalling", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(6, "mteTriggerThresholdObjectsOwner", DeviceEntityDescription.FieldType.STRING, 765));
        description.addField(new DeviceEntityDescription.FieldDescription(7, "mteTriggerThresholdObjects", DeviceEntityDescription.FieldType.STRING, 765));
        description.addField(new DeviceEntityDescription.FieldDescription(8, "mteTriggerThresholdRisingEventOwner", DeviceEntityDescription.FieldType.STRING, 765));
        description.addField(new DeviceEntityDescription.FieldDescription(9, "mteTriggerThresholdRisingEvent", DeviceEntityDescription.FieldType.STRING, 765));
        description.addField(new DeviceEntityDescription.FieldDescription(10, "mteTriggerThresholdFallingEventOwner", DeviceEntityDescription.FieldType.STRING, 765));
        description.addField(new DeviceEntityDescription.FieldDescription(11, "mteTriggerThresholdFallingEvent", DeviceEntityDescription.FieldType.STRING, 765));
        description.addField(new DeviceEntityDescription.FieldDescription(12, "mteTriggerThresholdDeltaRisingEventOwner", DeviceEntityDescription.FieldType.STRING, 765));
        description.addField(new DeviceEntityDescription.FieldDescription(13, "mteTriggerThresholdDeltaRisingEvent", DeviceEntityDescription.FieldType.STRING, 765));
        description.addField(new DeviceEntityDescription.FieldDescription(14, "mteTriggerThresholdDeltaFallingEventOwner", DeviceEntityDescription.FieldType.STRING, 765));
        description.addField(new DeviceEntityDescription.FieldDescription(15, "mteTriggerThresholdDeltaFallingEvent", DeviceEntityDescription.FieldType.STRING, 765));
        return description;
    }

    public DeviceEntityDescription get_Description() {
        return _entityDescription;
    }

}
