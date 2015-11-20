
package com.btisystems.mibbler.mibs.bti7000.bti7000_13_2_0.mib_2.rmon.nlhost.hlhostcontroltable;

import java.io.Serializable;
import com.btisystems.mibbler.mibs.bti7000.bti7000_13_2_0.mib_2.rmon.nlhost.HlHostControlTable;
import com.btisystems.mibbler.mibs.bti7000.interfaces.mib_2.rmon.nlhost.hlhostcontroltable.IHlHostControlEntry;
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

public class HlHostControlEntry
    extends DeviceEntity
    implements Serializable, IHlHostControlEntry, IIndexed, IVariableBindingSetter
{

    private int hlHostControlIndex;
    private String hlHostControlDataSource;
    private int hlHostControlNlDroppedFrames;
    private int hlHostControlNlInserts;
    private int hlHostControlNlDeletes;
    private int hlHostControlNlMaxDesiredEntries;
    private int hlHostControlAlDroppedFrames;
    private int hlHostControlAlInserts;
    private int hlHostControlAlDeletes;
    private int hlHostControlAlMaxDesiredEntries;
    private String hlHostControlOwner;
    private int hlHostControlStatus;
    private String _index;
    private HlHostControlTable parentEntity;
    private final static DeviceEntityDescription _entityDescription = createEntityDescription();

    public HlHostControlEntry() {
    }

    public int getHlHostControlIndex() {
        return this.hlHostControlIndex;
    }

    public void setHlHostControlIndex(int hlHostControlIndex) {
        int oldValue = getHlHostControlIndex();
        this.hlHostControlIndex = hlHostControlIndex;
        notifyChange(1, oldValue, hlHostControlIndex);
    }

    public String getHlHostControlDataSource() {
        return this.hlHostControlDataSource;
    }

    public void setHlHostControlDataSource(String hlHostControlDataSource) {
        String oldValue = getHlHostControlDataSource();
        this.hlHostControlDataSource = hlHostControlDataSource;
        notifyChange(2, oldValue, hlHostControlDataSource);
    }

    public int getHlHostControlNlDroppedFrames() {
        return this.hlHostControlNlDroppedFrames;
    }

    public void setHlHostControlNlDroppedFrames(int hlHostControlNlDroppedFrames) {
        int oldValue = getHlHostControlNlDroppedFrames();
        this.hlHostControlNlDroppedFrames = hlHostControlNlDroppedFrames;
        notifyChange(3, oldValue, hlHostControlNlDroppedFrames);
    }

    public int getHlHostControlNlInserts() {
        return this.hlHostControlNlInserts;
    }

    public void setHlHostControlNlInserts(int hlHostControlNlInserts) {
        int oldValue = getHlHostControlNlInserts();
        this.hlHostControlNlInserts = hlHostControlNlInserts;
        notifyChange(4, oldValue, hlHostControlNlInserts);
    }

    public int getHlHostControlNlDeletes() {
        return this.hlHostControlNlDeletes;
    }

    public void setHlHostControlNlDeletes(int hlHostControlNlDeletes) {
        int oldValue = getHlHostControlNlDeletes();
        this.hlHostControlNlDeletes = hlHostControlNlDeletes;
        notifyChange(5, oldValue, hlHostControlNlDeletes);
    }

    public int getHlHostControlNlMaxDesiredEntries() {
        return this.hlHostControlNlMaxDesiredEntries;
    }

    public void setHlHostControlNlMaxDesiredEntries(int hlHostControlNlMaxDesiredEntries) {
        int oldValue = getHlHostControlNlMaxDesiredEntries();
        this.hlHostControlNlMaxDesiredEntries = hlHostControlNlMaxDesiredEntries;
        notifyChange(6, oldValue, hlHostControlNlMaxDesiredEntries);
    }

    public int getHlHostControlAlDroppedFrames() {
        return this.hlHostControlAlDroppedFrames;
    }

    public void setHlHostControlAlDroppedFrames(int hlHostControlAlDroppedFrames) {
        int oldValue = getHlHostControlAlDroppedFrames();
        this.hlHostControlAlDroppedFrames = hlHostControlAlDroppedFrames;
        notifyChange(7, oldValue, hlHostControlAlDroppedFrames);
    }

    public int getHlHostControlAlInserts() {
        return this.hlHostControlAlInserts;
    }

    public void setHlHostControlAlInserts(int hlHostControlAlInserts) {
        int oldValue = getHlHostControlAlInserts();
        this.hlHostControlAlInserts = hlHostControlAlInserts;
        notifyChange(8, oldValue, hlHostControlAlInserts);
    }

    public int getHlHostControlAlDeletes() {
        return this.hlHostControlAlDeletes;
    }

    public void setHlHostControlAlDeletes(int hlHostControlAlDeletes) {
        int oldValue = getHlHostControlAlDeletes();
        this.hlHostControlAlDeletes = hlHostControlAlDeletes;
        notifyChange(9, oldValue, hlHostControlAlDeletes);
    }

    public int getHlHostControlAlMaxDesiredEntries() {
        return this.hlHostControlAlMaxDesiredEntries;
    }

    public void setHlHostControlAlMaxDesiredEntries(int hlHostControlAlMaxDesiredEntries) {
        int oldValue = getHlHostControlAlMaxDesiredEntries();
        this.hlHostControlAlMaxDesiredEntries = hlHostControlAlMaxDesiredEntries;
        notifyChange(10, oldValue, hlHostControlAlMaxDesiredEntries);
    }

    public String getHlHostControlOwner() {
        return this.hlHostControlOwner;
    }

    public void setHlHostControlOwner(String hlHostControlOwner) {
        String oldValue = getHlHostControlOwner();
        this.hlHostControlOwner = hlHostControlOwner;
        notifyChange(11, oldValue, hlHostControlOwner);
    }

    public int getHlHostControlStatus() {
        return this.hlHostControlStatus;
    }

    public void setHlHostControlStatus(int hlHostControlStatus) {
        int oldValue = getHlHostControlStatus();
        this.hlHostControlStatus = hlHostControlStatus;
        notifyChange(12, oldValue, hlHostControlStatus);
    }

    public void set(VariableBinding binding) {
        switch (binding.getOid().get(10)) {
            case  1 :
                setHlHostControlIndex(binding.getVariable().toInt());
                break;
            case  2 :
                setHlHostControlDataSource(binding.getVariable().toString());
                break;
            case  3 :
                setHlHostControlNlDroppedFrames(binding.getVariable().toInt());
                break;
            case  4 :
                setHlHostControlNlInserts(binding.getVariable().toInt());
                break;
            case  5 :
                setHlHostControlNlDeletes(binding.getVariable().toInt());
                break;
            case  6 :
                setHlHostControlNlMaxDesiredEntries(binding.getVariable().toInt());
                break;
            case  7 :
                setHlHostControlAlDroppedFrames(binding.getVariable().toInt());
                break;
            case  8 :
                setHlHostControlAlInserts(binding.getVariable().toInt());
                break;
            case  9 :
                setHlHostControlAlDeletes(binding.getVariable().toInt());
                break;
            case  10 :
                setHlHostControlAlMaxDesiredEntries(binding.getVariable().toInt());
                break;
            case  11 :
                setHlHostControlOwner(binding.getVariable().toString());
                break;
            case  12 :
                setHlHostControlStatus(binding.getVariable().toInt());
                break;
        }
    }

    public void _setIndex(OID oid) {
        byte[] _oidBytes = oid.toByteArray();
        int[] _oidInts = oid.toIntArray();
        int arrayOffset = 11;
        int _len;
        _index = new OID(_oidInts, 11, (oid.size()- 11)).toString();
        setHlHostControlIndex(_oidInts[arrayOffset]);
        arrayOffset += 1;
    }

    public String _getIndex() {
        return _index;
    }

    public void _setTable(HlHostControlTable table) {
        this.parentEntity = table;
    }

    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE).append("hlHostControlIndex", hlHostControlIndex).append("hlHostControlDataSource", hlHostControlDataSource).append("hlHostControlNlDroppedFrames", hlHostControlNlDroppedFrames).append("hlHostControlNlInserts", hlHostControlNlInserts).append("hlHostControlNlDeletes", hlHostControlNlDeletes).append("hlHostControlNlMaxDesiredEntries", hlHostControlNlMaxDesiredEntries).append("hlHostControlAlDroppedFrames", hlHostControlAlDroppedFrames).append("hlHostControlAlInserts", hlHostControlAlInserts).append("hlHostControlAlDeletes", hlHostControlAlDeletes).append("hlHostControlAlMaxDesiredEntries", hlHostControlAlMaxDesiredEntries).append("hlHostControlOwner", hlHostControlOwner).append("hlHostControlStatus", hlHostControlStatus).append("_index", _index).toString();
    }

    public int hashCode() {
        return new HashCodeBuilder().append(hlHostControlIndex).append(hlHostControlDataSource).append(hlHostControlNlDroppedFrames).append(hlHostControlNlInserts).append(hlHostControlNlDeletes).append(hlHostControlNlMaxDesiredEntries).append(hlHostControlAlDroppedFrames).append(hlHostControlAlInserts).append(hlHostControlAlDeletes).append(hlHostControlAlMaxDesiredEntries).append(hlHostControlOwner).append(hlHostControlStatus).append(_index).toHashCode();
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
        HlHostControlEntry rhs = ((HlHostControlEntry) obj);
        return new EqualsBuilder().append(hlHostControlIndex, rhs.hlHostControlIndex).append(hlHostControlDataSource, rhs.hlHostControlDataSource).append(hlHostControlNlDroppedFrames, rhs.hlHostControlNlDroppedFrames).append(hlHostControlNlInserts, rhs.hlHostControlNlInserts).append(hlHostControlNlDeletes, rhs.hlHostControlNlDeletes).append(hlHostControlNlMaxDesiredEntries, rhs.hlHostControlNlMaxDesiredEntries).append(hlHostControlAlDroppedFrames, rhs.hlHostControlAlDroppedFrames).append(hlHostControlAlInserts, rhs.hlHostControlAlInserts).append(hlHostControlAlDeletes, rhs.hlHostControlAlDeletes).append(hlHostControlAlMaxDesiredEntries, rhs.hlHostControlAlMaxDesiredEntries).append(hlHostControlOwner, rhs.hlHostControlOwner).append(hlHostControlStatus, rhs.hlHostControlStatus).append(_index, rhs._index).isEquals();
    }

    public HlHostControlEntry clone() {
        HlHostControlEntry _copy = new HlHostControlEntry();
        _copy.hlHostControlIndex = hlHostControlIndex;
        _copy.hlHostControlDataSource = hlHostControlDataSource;
        _copy.hlHostControlNlDroppedFrames = hlHostControlNlDroppedFrames;
        _copy.hlHostControlNlInserts = hlHostControlNlInserts;
        _copy.hlHostControlNlDeletes = hlHostControlNlDeletes;
        _copy.hlHostControlNlMaxDesiredEntries = hlHostControlNlMaxDesiredEntries;
        _copy.hlHostControlAlDroppedFrames = hlHostControlAlDroppedFrames;
        _copy.hlHostControlAlInserts = hlHostControlAlInserts;
        _copy.hlHostControlAlDeletes = hlHostControlAlDeletes;
        _copy.hlHostControlAlMaxDesiredEntries = hlHostControlAlMaxDesiredEntries;
        _copy.hlHostControlOwner = hlHostControlOwner;
        _copy.hlHostControlStatus = hlHostControlStatus;
        _copy._index = _index;
        _copy.parentEntity = parentEntity;
        return _copy;
    }

    private static DeviceEntityDescription createEntityDescription() {
        DeviceEntityDescription description = new DeviceEntityDescription(new OID("1.3.6.1.2.1.16.14.1.1"));
        description.addField(new DeviceEntityDescription.FieldDescription(1, "hlHostControlIndex", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(2, "hlHostControlDataSource", DeviceEntityDescription.FieldType.OID, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(3, "hlHostControlNlDroppedFrames", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(4, "hlHostControlNlInserts", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(5, "hlHostControlNlDeletes", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(6, "hlHostControlNlMaxDesiredEntries", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(7, "hlHostControlAlDroppedFrames", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(8, "hlHostControlAlInserts", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(9, "hlHostControlAlDeletes", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(10, "hlHostControlAlMaxDesiredEntries", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(11, "hlHostControlOwner", DeviceEntityDescription.FieldType.STRING, 127));
        description.addField(new DeviceEntityDescription.FieldDescription(12, "hlHostControlStatus", DeviceEntityDescription.FieldType.INTEGER, -1));
        return description;
    }

    public DeviceEntityDescription get_Description() {
        return _entityDescription;
    }

}
