
package com.btisystems.mibbler.mibs.netsnmp.netsnmp.mib_2.dismaneventmib.dismaneventmibobjects.mtetrigger.mtetriggerexistencetable;

import java.io.Serializable;
import com.btisystems.mibbler.mibs.netsnmp.interfaces.mib_2.dismaneventmib.dismaneventmibobjects.mtetrigger.mtetriggerexistencetable.IMteTriggerExistenceEntry;
import com.btisystems.mibbler.mibs.netsnmp.netsnmp.mib_2.dismaneventmib.dismaneventmibobjects.mtetrigger.MteTriggerExistenceTable;
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

public class MteTriggerExistenceEntry
    extends DeviceEntity
    implements Serializable, IMteTriggerExistenceEntry, IIndexed, IVariableBindingSetter
{

    private String mteTriggerExistenceTest;
    private String mteTriggerExistenceStartup;
    private String mteTriggerExistenceObjectsOwner;
    private String mteTriggerExistenceObjects;
    private String mteTriggerExistenceEventOwner;
    private String mteTriggerExistenceEvent;
    private String _index;
    private MteTriggerExistenceTable parentEntity;
    private final static DeviceEntityDescription _entityDescription = createEntityDescription();

    public MteTriggerExistenceEntry() {
    }

    public String getMteTriggerExistenceTest() {
        return this.mteTriggerExistenceTest;
    }

    public void setMteTriggerExistenceTest(String mteTriggerExistenceTest) {
        String oldValue = getMteTriggerExistenceTest();
        this.mteTriggerExistenceTest = mteTriggerExistenceTest;
        notifyChange(1, oldValue, mteTriggerExistenceTest);
    }

    public String getMteTriggerExistenceStartup() {
        return this.mteTriggerExistenceStartup;
    }

    public void setMteTriggerExistenceStartup(String mteTriggerExistenceStartup) {
        String oldValue = getMteTriggerExistenceStartup();
        this.mteTriggerExistenceStartup = mteTriggerExistenceStartup;
        notifyChange(2, oldValue, mteTriggerExistenceStartup);
    }

    public String getMteTriggerExistenceObjectsOwner() {
        return this.mteTriggerExistenceObjectsOwner;
    }

    public void setMteTriggerExistenceObjectsOwner(String mteTriggerExistenceObjectsOwner) {
        String oldValue = getMteTriggerExistenceObjectsOwner();
        this.mteTriggerExistenceObjectsOwner = mteTriggerExistenceObjectsOwner;
        notifyChange(3, oldValue, mteTriggerExistenceObjectsOwner);
    }

    public String getMteTriggerExistenceObjects() {
        return this.mteTriggerExistenceObjects;
    }

    public void setMteTriggerExistenceObjects(String mteTriggerExistenceObjects) {
        String oldValue = getMteTriggerExistenceObjects();
        this.mteTriggerExistenceObjects = mteTriggerExistenceObjects;
        notifyChange(4, oldValue, mteTriggerExistenceObjects);
    }

    public String getMteTriggerExistenceEventOwner() {
        return this.mteTriggerExistenceEventOwner;
    }

    public void setMteTriggerExistenceEventOwner(String mteTriggerExistenceEventOwner) {
        String oldValue = getMteTriggerExistenceEventOwner();
        this.mteTriggerExistenceEventOwner = mteTriggerExistenceEventOwner;
        notifyChange(5, oldValue, mteTriggerExistenceEventOwner);
    }

    public String getMteTriggerExistenceEvent() {
        return this.mteTriggerExistenceEvent;
    }

    public void setMteTriggerExistenceEvent(String mteTriggerExistenceEvent) {
        String oldValue = getMteTriggerExistenceEvent();
        this.mteTriggerExistenceEvent = mteTriggerExistenceEvent;
        notifyChange(6, oldValue, mteTriggerExistenceEvent);
    }

    public void set(VariableBinding binding) {
        switch (binding.getOid().get(11)) {
            case  1 :
                setMteTriggerExistenceTest(binding.getVariable().toString());
                break;
            case  2 :
                setMteTriggerExistenceStartup(binding.getVariable().toString());
                break;
            case  3 :
                setMteTriggerExistenceObjectsOwner(binding.getVariable().toString());
                break;
            case  4 :
                setMteTriggerExistenceObjects(binding.getVariable().toString());
                break;
            case  5 :
                setMteTriggerExistenceEventOwner(binding.getVariable().toString());
                break;
            case  6 :
                setMteTriggerExistenceEvent(binding.getVariable().toString());
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

    public void _setTable(MteTriggerExistenceTable table) {
        this.parentEntity = table;
    }

    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE).append("mteTriggerExistenceTest", mteTriggerExistenceTest).append("mteTriggerExistenceStartup", mteTriggerExistenceStartup).append("mteTriggerExistenceObjectsOwner", mteTriggerExistenceObjectsOwner).append("mteTriggerExistenceObjects", mteTriggerExistenceObjects).append("mteTriggerExistenceEventOwner", mteTriggerExistenceEventOwner).append("mteTriggerExistenceEvent", mteTriggerExistenceEvent).append("_index", _index).toString();
    }

    public int hashCode() {
        return new HashCodeBuilder().append(mteTriggerExistenceTest).append(mteTriggerExistenceStartup).append(mteTriggerExistenceObjectsOwner).append(mteTriggerExistenceObjects).append(mteTriggerExistenceEventOwner).append(mteTriggerExistenceEvent).append(_index).toHashCode();
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
        MteTriggerExistenceEntry rhs = ((MteTriggerExistenceEntry) obj);
        return new EqualsBuilder().append(mteTriggerExistenceTest, rhs.mteTriggerExistenceTest).append(mteTriggerExistenceStartup, rhs.mteTriggerExistenceStartup).append(mteTriggerExistenceObjectsOwner, rhs.mteTriggerExistenceObjectsOwner).append(mteTriggerExistenceObjects, rhs.mteTriggerExistenceObjects).append(mteTriggerExistenceEventOwner, rhs.mteTriggerExistenceEventOwner).append(mteTriggerExistenceEvent, rhs.mteTriggerExistenceEvent).append(_index, rhs._index).isEquals();
    }

    public MteTriggerExistenceEntry clone() {
        MteTriggerExistenceEntry _copy = new MteTriggerExistenceEntry();
        _copy.mteTriggerExistenceTest = mteTriggerExistenceTest;
        _copy.mteTriggerExistenceStartup = mteTriggerExistenceStartup;
        _copy.mteTriggerExistenceObjectsOwner = mteTriggerExistenceObjectsOwner;
        _copy.mteTriggerExistenceObjects = mteTriggerExistenceObjects;
        _copy.mteTriggerExistenceEventOwner = mteTriggerExistenceEventOwner;
        _copy.mteTriggerExistenceEvent = mteTriggerExistenceEvent;
        _copy._index = _index;
        _copy.parentEntity = parentEntity;
        return _copy;
    }

    private static DeviceEntityDescription createEntityDescription() {
        DeviceEntityDescription description = new DeviceEntityDescription(new OID("1.3.6.1.2.1.88.1.2.4.1"));
        description.addField(new DeviceEntityDescription.FieldDescription(1, "mteTriggerExistenceTest", DeviceEntityDescription.FieldType.BITS, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(2, "mteTriggerExistenceStartup", DeviceEntityDescription.FieldType.BITS, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(3, "mteTriggerExistenceObjectsOwner", DeviceEntityDescription.FieldType.STRING, 765));
        description.addField(new DeviceEntityDescription.FieldDescription(4, "mteTriggerExistenceObjects", DeviceEntityDescription.FieldType.STRING, 765));
        description.addField(new DeviceEntityDescription.FieldDescription(5, "mteTriggerExistenceEventOwner", DeviceEntityDescription.FieldType.STRING, 765));
        description.addField(new DeviceEntityDescription.FieldDescription(6, "mteTriggerExistenceEvent", DeviceEntityDescription.FieldType.STRING, 765));
        return description;
    }

    public DeviceEntityDescription get_Description() {
        return _entityDescription;
    }

}
