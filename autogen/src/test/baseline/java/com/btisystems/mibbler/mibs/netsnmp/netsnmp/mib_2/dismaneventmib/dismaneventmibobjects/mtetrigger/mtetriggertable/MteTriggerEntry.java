
package com.btisystems.mibbler.mibs.netsnmp.netsnmp.mib_2.dismaneventmib.dismaneventmibobjects.mtetrigger.mtetriggertable;

import java.io.Serializable;
import com.btisystems.mibbler.mibs.netsnmp.interfaces.mib_2.dismaneventmib.dismaneventmibobjects.mtetrigger.mtetriggertable.IMteTriggerEntry;
import com.btisystems.mibbler.mibs.netsnmp.netsnmp.mib_2.dismaneventmib.dismaneventmibobjects.mtetrigger.MteTriggerTable;
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

public class MteTriggerEntry
    extends DeviceEntity
    implements Serializable, IMteTriggerEntry, IIndexed, IVariableBindingSetter
{

    private String mteOwner;
    private String mteTriggerName;
    private String mteTriggerComment;
    private String mteTriggerTest;
    private Integer mteTriggerSampleType;
    private String mteTriggerValueID;
    private Integer mteTriggerValueIDWildcard;
    private String mteTriggerTargetTag;
    private String mteTriggerContextName;
    private Integer mteTriggerContextNameWildcard;
    private Integer mteTriggerFrequency;
    private String mteTriggerObjectsOwner;
    private String mteTriggerObjects;
    private Integer mteTriggerEnabled;
    private int mteTriggerEntryStatus;
    private String _index;
    private MteTriggerTable parentEntity;
    private final static DeviceEntityDescription _entityDescription = createEntityDescription();

    public MteTriggerEntry() {
    }

    public String getMteOwner() {
        return this.mteOwner;
    }

    public void setMteOwner(String mteOwner) {
        String oldValue = getMteOwner();
        this.mteOwner = mteOwner;
        notifyChange(1, oldValue, mteOwner);
    }

    public String getMteTriggerName() {
        return this.mteTriggerName;
    }

    public void setMteTriggerName(String mteTriggerName) {
        String oldValue = getMteTriggerName();
        this.mteTriggerName = mteTriggerName;
        notifyChange(2, oldValue, mteTriggerName);
    }

    public String getMteTriggerComment() {
        return this.mteTriggerComment;
    }

    public void setMteTriggerComment(String mteTriggerComment) {
        String oldValue = getMteTriggerComment();
        this.mteTriggerComment = mteTriggerComment;
        notifyChange(3, oldValue, mteTriggerComment);
    }

    public String getMteTriggerTest() {
        return this.mteTriggerTest;
    }

    public void setMteTriggerTest(String mteTriggerTest) {
        String oldValue = getMteTriggerTest();
        this.mteTriggerTest = mteTriggerTest;
        notifyChange(4, oldValue, mteTriggerTest);
    }

    public int getMteTriggerSampleType() {
        if (this.mteTriggerSampleType == null) {
            return  1;
        }
        return this.mteTriggerSampleType;
    }

    public boolean isMteTriggerSampleTypeDefined() {
        return (this.mteTriggerSampleType!= null);
    }

    public void setMteTriggerSampleType(int mteTriggerSampleType) {
        int oldValue = getMteTriggerSampleType();
        this.mteTriggerSampleType = mteTriggerSampleType;
        notifyChange(5, oldValue, mteTriggerSampleType);
    }

    public String getMteTriggerValueID() {
        return this.mteTriggerValueID;
    }

    public void setMteTriggerValueID(String mteTriggerValueID) {
        String oldValue = getMteTriggerValueID();
        this.mteTriggerValueID = mteTriggerValueID;
        notifyChange(6, oldValue, mteTriggerValueID);
    }

    public int getMteTriggerValueIDWildcard() {
        if (this.mteTriggerValueIDWildcard == null) {
            return  2;
        }
        return this.mteTriggerValueIDWildcard;
    }

    public boolean isMteTriggerValueIDWildcardDefined() {
        return (this.mteTriggerValueIDWildcard!= null);
    }

    public void setMteTriggerValueIDWildcard(int mteTriggerValueIDWildcard) {
        int oldValue = getMteTriggerValueIDWildcard();
        this.mteTriggerValueIDWildcard = mteTriggerValueIDWildcard;
        notifyChange(7, oldValue, mteTriggerValueIDWildcard);
    }

    public String getMteTriggerTargetTag() {
        return this.mteTriggerTargetTag;
    }

    public void setMteTriggerTargetTag(String mteTriggerTargetTag) {
        String oldValue = getMteTriggerTargetTag();
        this.mteTriggerTargetTag = mteTriggerTargetTag;
        notifyChange(8, oldValue, mteTriggerTargetTag);
    }

    public String getMteTriggerContextName() {
        return this.mteTriggerContextName;
    }

    public void setMteTriggerContextName(String mteTriggerContextName) {
        String oldValue = getMteTriggerContextName();
        this.mteTriggerContextName = mteTriggerContextName;
        notifyChange(9, oldValue, mteTriggerContextName);
    }

    public int getMteTriggerContextNameWildcard() {
        if (this.mteTriggerContextNameWildcard == null) {
            return  2;
        }
        return this.mteTriggerContextNameWildcard;
    }

    public boolean isMteTriggerContextNameWildcardDefined() {
        return (this.mteTriggerContextNameWildcard!= null);
    }

    public void setMteTriggerContextNameWildcard(int mteTriggerContextNameWildcard) {
        int oldValue = getMteTriggerContextNameWildcard();
        this.mteTriggerContextNameWildcard = mteTriggerContextNameWildcard;
        notifyChange(10, oldValue, mteTriggerContextNameWildcard);
    }

    public int getMteTriggerFrequency() {
        if (this.mteTriggerFrequency == null) {
            return  600;
        }
        return this.mteTriggerFrequency;
    }

    public boolean isMteTriggerFrequencyDefined() {
        return (this.mteTriggerFrequency!= null);
    }

    public void setMteTriggerFrequency(int mteTriggerFrequency) {
        int oldValue = getMteTriggerFrequency();
        this.mteTriggerFrequency = mteTriggerFrequency;
        notifyChange(11, oldValue, mteTriggerFrequency);
    }

    public String getMteTriggerObjectsOwner() {
        return this.mteTriggerObjectsOwner;
    }

    public void setMteTriggerObjectsOwner(String mteTriggerObjectsOwner) {
        String oldValue = getMteTriggerObjectsOwner();
        this.mteTriggerObjectsOwner = mteTriggerObjectsOwner;
        notifyChange(12, oldValue, mteTriggerObjectsOwner);
    }

    public String getMteTriggerObjects() {
        return this.mteTriggerObjects;
    }

    public void setMteTriggerObjects(String mteTriggerObjects) {
        String oldValue = getMteTriggerObjects();
        this.mteTriggerObjects = mteTriggerObjects;
        notifyChange(13, oldValue, mteTriggerObjects);
    }

    public int getMteTriggerEnabled() {
        if (this.mteTriggerEnabled == null) {
            return  2;
        }
        return this.mteTriggerEnabled;
    }

    public boolean isMteTriggerEnabledDefined() {
        return (this.mteTriggerEnabled!= null);
    }

    public void setMteTriggerEnabled(int mteTriggerEnabled) {
        int oldValue = getMteTriggerEnabled();
        this.mteTriggerEnabled = mteTriggerEnabled;
        notifyChange(14, oldValue, mteTriggerEnabled);
    }

    public int getMteTriggerEntryStatus() {
        return this.mteTriggerEntryStatus;
    }

    public void setMteTriggerEntryStatus(int mteTriggerEntryStatus) {
        int oldValue = getMteTriggerEntryStatus();
        this.mteTriggerEntryStatus = mteTriggerEntryStatus;
        notifyChange(15, oldValue, mteTriggerEntryStatus);
    }

    public void set(VariableBinding binding) {
        switch (binding.getOid().get(11)) {
            case  1 :
                setMteOwner(binding.getVariable().toString());
                break;
            case  2 :
                setMteTriggerName(binding.getVariable().toString());
                break;
            case  3 :
                setMteTriggerComment(binding.getVariable().toString());
                break;
            case  4 :
                setMteTriggerTest(binding.getVariable().toString());
                break;
            case  5 :
                setMteTriggerSampleType(binding.getVariable().toInt());
                break;
            case  6 :
                setMteTriggerValueID(binding.getVariable().toString());
                break;
            case  7 :
                setMteTriggerValueIDWildcard(binding.getVariable().toInt());
                break;
            case  8 :
                setMteTriggerTargetTag(binding.getVariable().toString());
                break;
            case  9 :
                setMteTriggerContextName(binding.getVariable().toString());
                break;
            case  10 :
                setMteTriggerContextNameWildcard(binding.getVariable().toInt());
                break;
            case  11 :
                setMteTriggerFrequency(binding.getVariable().toInt());
                break;
            case  12 :
                setMteTriggerObjectsOwner(binding.getVariable().toString());
                break;
            case  13 :
                setMteTriggerObjects(binding.getVariable().toString());
                break;
            case  14 :
                setMteTriggerEnabled(binding.getVariable().toInt());
                break;
            case  15 :
                setMteTriggerEntryStatus(binding.getVariable().toInt());
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
        setMteOwner(new String(_oidBytes, arrayOffset, _len));
        arrayOffset += _len;
        _len = (_oidBytes.length-arrayOffset);
        setMteTriggerName(new String(_oidBytes, arrayOffset, _len));
    }

    public String _getIndex() {
        return _index;
    }

    public void _setTable(MteTriggerTable table) {
        this.parentEntity = table;
    }

    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE).append("mteOwner", mteOwner).append("mteTriggerName", mteTriggerName).append("mteTriggerComment", mteTriggerComment).append("mteTriggerTest", mteTriggerTest).append("mteTriggerSampleType", mteTriggerSampleType).append("mteTriggerValueID", mteTriggerValueID).append("mteTriggerValueIDWildcard", mteTriggerValueIDWildcard).append("mteTriggerTargetTag", mteTriggerTargetTag).append("mteTriggerContextName", mteTriggerContextName).append("mteTriggerContextNameWildcard", mteTriggerContextNameWildcard).append("mteTriggerFrequency", mteTriggerFrequency).append("mteTriggerObjectsOwner", mteTriggerObjectsOwner).append("mteTriggerObjects", mteTriggerObjects).append("mteTriggerEnabled", mteTriggerEnabled).append("mteTriggerEntryStatus", mteTriggerEntryStatus).append("_index", _index).toString();
    }

    public int hashCode() {
        return new HashCodeBuilder().append(mteOwner).append(mteTriggerName).append(mteTriggerComment).append(mteTriggerTest).append(mteTriggerSampleType).append(mteTriggerValueID).append(mteTriggerValueIDWildcard).append(mteTriggerTargetTag).append(mteTriggerContextName).append(mteTriggerContextNameWildcard).append(mteTriggerFrequency).append(mteTriggerObjectsOwner).append(mteTriggerObjects).append(mteTriggerEnabled).append(mteTriggerEntryStatus).append(_index).toHashCode();
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
        MteTriggerEntry rhs = ((MteTriggerEntry) obj);
        return new EqualsBuilder().append(mteOwner, rhs.mteOwner).append(mteTriggerName, rhs.mteTriggerName).append(mteTriggerComment, rhs.mteTriggerComment).append(mteTriggerTest, rhs.mteTriggerTest).append(mteTriggerSampleType, rhs.mteTriggerSampleType).append(mteTriggerValueID, rhs.mteTriggerValueID).append(mteTriggerValueIDWildcard, rhs.mteTriggerValueIDWildcard).append(mteTriggerTargetTag, rhs.mteTriggerTargetTag).append(mteTriggerContextName, rhs.mteTriggerContextName).append(mteTriggerContextNameWildcard, rhs.mteTriggerContextNameWildcard).append(mteTriggerFrequency, rhs.mteTriggerFrequency).append(mteTriggerObjectsOwner, rhs.mteTriggerObjectsOwner).append(mteTriggerObjects, rhs.mteTriggerObjects).append(mteTriggerEnabled, rhs.mteTriggerEnabled).append(mteTriggerEntryStatus, rhs.mteTriggerEntryStatus).append(_index, rhs._index).isEquals();
    }

    public MteTriggerEntry clone() {
        MteTriggerEntry _copy = new MteTriggerEntry();
        _copy.mteOwner = mteOwner;
        _copy.mteTriggerName = mteTriggerName;
        _copy.mteTriggerComment = mteTriggerComment;
        _copy.mteTriggerTest = mteTriggerTest;
        _copy.mteTriggerSampleType = mteTriggerSampleType;
        _copy.mteTriggerValueID = mteTriggerValueID;
        _copy.mteTriggerValueIDWildcard = mteTriggerValueIDWildcard;
        _copy.mteTriggerTargetTag = mteTriggerTargetTag;
        _copy.mteTriggerContextName = mteTriggerContextName;
        _copy.mteTriggerContextNameWildcard = mteTriggerContextNameWildcard;
        _copy.mteTriggerFrequency = mteTriggerFrequency;
        _copy.mteTriggerObjectsOwner = mteTriggerObjectsOwner;
        _copy.mteTriggerObjects = mteTriggerObjects;
        _copy.mteTriggerEnabled = mteTriggerEnabled;
        _copy.mteTriggerEntryStatus = mteTriggerEntryStatus;
        _copy._index = _index;
        _copy.parentEntity = parentEntity;
        return _copy;
    }

    private static DeviceEntityDescription createEntityDescription() {
        DeviceEntityDescription description = new DeviceEntityDescription(new OID("1.3.6.1.2.1.88.1.2.2.1"));
        description.addField(new DeviceEntityDescription.FieldDescription(1, "mteOwner", DeviceEntityDescription.FieldType.STRING, 765));
        description.addField(new DeviceEntityDescription.FieldDescription(2, "mteTriggerName", DeviceEntityDescription.FieldType.STRING, 765));
        description.addField(new DeviceEntityDescription.FieldDescription(3, "mteTriggerComment", DeviceEntityDescription.FieldType.STRING, 765));
        description.addField(new DeviceEntityDescription.FieldDescription(4, "mteTriggerTest", DeviceEntityDescription.FieldType.BITS, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(5, "mteTriggerSampleType", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(6, "mteTriggerValueID", DeviceEntityDescription.FieldType.OID, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(7, "mteTriggerValueIDWildcard", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(8, "mteTriggerTargetTag", DeviceEntityDescription.FieldType.STRING, 765));
        description.addField(new DeviceEntityDescription.FieldDescription(9, "mteTriggerContextName", DeviceEntityDescription.FieldType.STRING, 765));
        description.addField(new DeviceEntityDescription.FieldDescription(10, "mteTriggerContextNameWildcard", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(11, "mteTriggerFrequency", DeviceEntityDescription.FieldType.UNSIGNED32, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(12, "mteTriggerObjectsOwner", DeviceEntityDescription.FieldType.STRING, 765));
        description.addField(new DeviceEntityDescription.FieldDescription(13, "mteTriggerObjects", DeviceEntityDescription.FieldType.STRING, 765));
        description.addField(new DeviceEntityDescription.FieldDescription(14, "mteTriggerEnabled", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(15, "mteTriggerEntryStatus", DeviceEntityDescription.FieldType.INTEGER, -1));
        return description;
    }

    public DeviceEntityDescription get_Description() {
        return _entityDescription;
    }

}
