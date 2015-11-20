
package com.btisystems.mibbler.mibs.bti7000.bti7000_13_2_0.mib_2.rmon.nlmatrix.hlmatrixcontroltable;

import java.io.Serializable;
import com.btisystems.mibbler.mibs.bti7000.bti7000_13_2_0.mib_2.rmon.nlmatrix.HlMatrixControlTable;
import com.btisystems.mibbler.mibs.bti7000.interfaces.mib_2.rmon.nlmatrix.hlmatrixcontroltable.IHlMatrixControlEntry;
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

public class HlMatrixControlEntry
    extends DeviceEntity
    implements Serializable, IHlMatrixControlEntry, IIndexed, IVariableBindingSetter
{

    private int hlMatrixControlIndex;
    private String hlMatrixControlDataSource;
    private int hlMatrixControlNlDroppedFrames;
    private int hlMatrixControlNlInserts;
    private int hlMatrixControlNlDeletes;
    private int hlMatrixControlNlMaxDesiredEntries;
    private int hlMatrixControlAlDroppedFrames;
    private int hlMatrixControlAlInserts;
    private int hlMatrixControlAlDeletes;
    private int hlMatrixControlAlMaxDesiredEntries;
    private String hlMatrixControlOwner;
    private int hlMatrixControlStatus;
    private String _index;
    private HlMatrixControlTable parentEntity;
    private final static DeviceEntityDescription _entityDescription = createEntityDescription();

    public HlMatrixControlEntry() {
    }

    public int getHlMatrixControlIndex() {
        return this.hlMatrixControlIndex;
    }

    public void setHlMatrixControlIndex(int hlMatrixControlIndex) {
        int oldValue = getHlMatrixControlIndex();
        this.hlMatrixControlIndex = hlMatrixControlIndex;
        notifyChange(1, oldValue, hlMatrixControlIndex);
    }

    public String getHlMatrixControlDataSource() {
        return this.hlMatrixControlDataSource;
    }

    public void setHlMatrixControlDataSource(String hlMatrixControlDataSource) {
        String oldValue = getHlMatrixControlDataSource();
        this.hlMatrixControlDataSource = hlMatrixControlDataSource;
        notifyChange(2, oldValue, hlMatrixControlDataSource);
    }

    public int getHlMatrixControlNlDroppedFrames() {
        return this.hlMatrixControlNlDroppedFrames;
    }

    public void setHlMatrixControlNlDroppedFrames(int hlMatrixControlNlDroppedFrames) {
        int oldValue = getHlMatrixControlNlDroppedFrames();
        this.hlMatrixControlNlDroppedFrames = hlMatrixControlNlDroppedFrames;
        notifyChange(3, oldValue, hlMatrixControlNlDroppedFrames);
    }

    public int getHlMatrixControlNlInserts() {
        return this.hlMatrixControlNlInserts;
    }

    public void setHlMatrixControlNlInserts(int hlMatrixControlNlInserts) {
        int oldValue = getHlMatrixControlNlInserts();
        this.hlMatrixControlNlInserts = hlMatrixControlNlInserts;
        notifyChange(4, oldValue, hlMatrixControlNlInserts);
    }

    public int getHlMatrixControlNlDeletes() {
        return this.hlMatrixControlNlDeletes;
    }

    public void setHlMatrixControlNlDeletes(int hlMatrixControlNlDeletes) {
        int oldValue = getHlMatrixControlNlDeletes();
        this.hlMatrixControlNlDeletes = hlMatrixControlNlDeletes;
        notifyChange(5, oldValue, hlMatrixControlNlDeletes);
    }

    public int getHlMatrixControlNlMaxDesiredEntries() {
        return this.hlMatrixControlNlMaxDesiredEntries;
    }

    public void setHlMatrixControlNlMaxDesiredEntries(int hlMatrixControlNlMaxDesiredEntries) {
        int oldValue = getHlMatrixControlNlMaxDesiredEntries();
        this.hlMatrixControlNlMaxDesiredEntries = hlMatrixControlNlMaxDesiredEntries;
        notifyChange(6, oldValue, hlMatrixControlNlMaxDesiredEntries);
    }

    public int getHlMatrixControlAlDroppedFrames() {
        return this.hlMatrixControlAlDroppedFrames;
    }

    public void setHlMatrixControlAlDroppedFrames(int hlMatrixControlAlDroppedFrames) {
        int oldValue = getHlMatrixControlAlDroppedFrames();
        this.hlMatrixControlAlDroppedFrames = hlMatrixControlAlDroppedFrames;
        notifyChange(7, oldValue, hlMatrixControlAlDroppedFrames);
    }

    public int getHlMatrixControlAlInserts() {
        return this.hlMatrixControlAlInserts;
    }

    public void setHlMatrixControlAlInserts(int hlMatrixControlAlInserts) {
        int oldValue = getHlMatrixControlAlInserts();
        this.hlMatrixControlAlInserts = hlMatrixControlAlInserts;
        notifyChange(8, oldValue, hlMatrixControlAlInserts);
    }

    public int getHlMatrixControlAlDeletes() {
        return this.hlMatrixControlAlDeletes;
    }

    public void setHlMatrixControlAlDeletes(int hlMatrixControlAlDeletes) {
        int oldValue = getHlMatrixControlAlDeletes();
        this.hlMatrixControlAlDeletes = hlMatrixControlAlDeletes;
        notifyChange(9, oldValue, hlMatrixControlAlDeletes);
    }

    public int getHlMatrixControlAlMaxDesiredEntries() {
        return this.hlMatrixControlAlMaxDesiredEntries;
    }

    public void setHlMatrixControlAlMaxDesiredEntries(int hlMatrixControlAlMaxDesiredEntries) {
        int oldValue = getHlMatrixControlAlMaxDesiredEntries();
        this.hlMatrixControlAlMaxDesiredEntries = hlMatrixControlAlMaxDesiredEntries;
        notifyChange(10, oldValue, hlMatrixControlAlMaxDesiredEntries);
    }

    public String getHlMatrixControlOwner() {
        return this.hlMatrixControlOwner;
    }

    public void setHlMatrixControlOwner(String hlMatrixControlOwner) {
        String oldValue = getHlMatrixControlOwner();
        this.hlMatrixControlOwner = hlMatrixControlOwner;
        notifyChange(11, oldValue, hlMatrixControlOwner);
    }

    public int getHlMatrixControlStatus() {
        return this.hlMatrixControlStatus;
    }

    public void setHlMatrixControlStatus(int hlMatrixControlStatus) {
        int oldValue = getHlMatrixControlStatus();
        this.hlMatrixControlStatus = hlMatrixControlStatus;
        notifyChange(12, oldValue, hlMatrixControlStatus);
    }

    public void set(VariableBinding binding) {
        switch (binding.getOid().get(10)) {
            case  1 :
                setHlMatrixControlIndex(binding.getVariable().toInt());
                break;
            case  2 :
                setHlMatrixControlDataSource(binding.getVariable().toString());
                break;
            case  3 :
                setHlMatrixControlNlDroppedFrames(binding.getVariable().toInt());
                break;
            case  4 :
                setHlMatrixControlNlInserts(binding.getVariable().toInt());
                break;
            case  5 :
                setHlMatrixControlNlDeletes(binding.getVariable().toInt());
                break;
            case  6 :
                setHlMatrixControlNlMaxDesiredEntries(binding.getVariable().toInt());
                break;
            case  7 :
                setHlMatrixControlAlDroppedFrames(binding.getVariable().toInt());
                break;
            case  8 :
                setHlMatrixControlAlInserts(binding.getVariable().toInt());
                break;
            case  9 :
                setHlMatrixControlAlDeletes(binding.getVariable().toInt());
                break;
            case  10 :
                setHlMatrixControlAlMaxDesiredEntries(binding.getVariable().toInt());
                break;
            case  11 :
                setHlMatrixControlOwner(binding.getVariable().toString());
                break;
            case  12 :
                setHlMatrixControlStatus(binding.getVariable().toInt());
                break;
        }
    }

    public void _setIndex(OID oid) {
        byte[] _oidBytes = oid.toByteArray();
        int[] _oidInts = oid.toIntArray();
        int arrayOffset = 11;
        int _len;
        _index = new OID(_oidInts, 11, (oid.size()- 11)).toString();
        setHlMatrixControlIndex(_oidInts[arrayOffset]);
        arrayOffset += 1;
    }

    public String _getIndex() {
        return _index;
    }

    public void _setTable(HlMatrixControlTable table) {
        this.parentEntity = table;
    }

    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE).append("hlMatrixControlIndex", hlMatrixControlIndex).append("hlMatrixControlDataSource", hlMatrixControlDataSource).append("hlMatrixControlNlDroppedFrames", hlMatrixControlNlDroppedFrames).append("hlMatrixControlNlInserts", hlMatrixControlNlInserts).append("hlMatrixControlNlDeletes", hlMatrixControlNlDeletes).append("hlMatrixControlNlMaxDesiredEntries", hlMatrixControlNlMaxDesiredEntries).append("hlMatrixControlAlDroppedFrames", hlMatrixControlAlDroppedFrames).append("hlMatrixControlAlInserts", hlMatrixControlAlInserts).append("hlMatrixControlAlDeletes", hlMatrixControlAlDeletes).append("hlMatrixControlAlMaxDesiredEntries", hlMatrixControlAlMaxDesiredEntries).append("hlMatrixControlOwner", hlMatrixControlOwner).append("hlMatrixControlStatus", hlMatrixControlStatus).append("_index", _index).toString();
    }

    public int hashCode() {
        return new HashCodeBuilder().append(hlMatrixControlIndex).append(hlMatrixControlDataSource).append(hlMatrixControlNlDroppedFrames).append(hlMatrixControlNlInserts).append(hlMatrixControlNlDeletes).append(hlMatrixControlNlMaxDesiredEntries).append(hlMatrixControlAlDroppedFrames).append(hlMatrixControlAlInserts).append(hlMatrixControlAlDeletes).append(hlMatrixControlAlMaxDesiredEntries).append(hlMatrixControlOwner).append(hlMatrixControlStatus).append(_index).toHashCode();
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
        HlMatrixControlEntry rhs = ((HlMatrixControlEntry) obj);
        return new EqualsBuilder().append(hlMatrixControlIndex, rhs.hlMatrixControlIndex).append(hlMatrixControlDataSource, rhs.hlMatrixControlDataSource).append(hlMatrixControlNlDroppedFrames, rhs.hlMatrixControlNlDroppedFrames).append(hlMatrixControlNlInserts, rhs.hlMatrixControlNlInserts).append(hlMatrixControlNlDeletes, rhs.hlMatrixControlNlDeletes).append(hlMatrixControlNlMaxDesiredEntries, rhs.hlMatrixControlNlMaxDesiredEntries).append(hlMatrixControlAlDroppedFrames, rhs.hlMatrixControlAlDroppedFrames).append(hlMatrixControlAlInserts, rhs.hlMatrixControlAlInserts).append(hlMatrixControlAlDeletes, rhs.hlMatrixControlAlDeletes).append(hlMatrixControlAlMaxDesiredEntries, rhs.hlMatrixControlAlMaxDesiredEntries).append(hlMatrixControlOwner, rhs.hlMatrixControlOwner).append(hlMatrixControlStatus, rhs.hlMatrixControlStatus).append(_index, rhs._index).isEquals();
    }

    public HlMatrixControlEntry clone() {
        HlMatrixControlEntry _copy = new HlMatrixControlEntry();
        _copy.hlMatrixControlIndex = hlMatrixControlIndex;
        _copy.hlMatrixControlDataSource = hlMatrixControlDataSource;
        _copy.hlMatrixControlNlDroppedFrames = hlMatrixControlNlDroppedFrames;
        _copy.hlMatrixControlNlInserts = hlMatrixControlNlInserts;
        _copy.hlMatrixControlNlDeletes = hlMatrixControlNlDeletes;
        _copy.hlMatrixControlNlMaxDesiredEntries = hlMatrixControlNlMaxDesiredEntries;
        _copy.hlMatrixControlAlDroppedFrames = hlMatrixControlAlDroppedFrames;
        _copy.hlMatrixControlAlInserts = hlMatrixControlAlInserts;
        _copy.hlMatrixControlAlDeletes = hlMatrixControlAlDeletes;
        _copy.hlMatrixControlAlMaxDesiredEntries = hlMatrixControlAlMaxDesiredEntries;
        _copy.hlMatrixControlOwner = hlMatrixControlOwner;
        _copy.hlMatrixControlStatus = hlMatrixControlStatus;
        _copy._index = _index;
        _copy.parentEntity = parentEntity;
        return _copy;
    }

    private static DeviceEntityDescription createEntityDescription() {
        DeviceEntityDescription description = new DeviceEntityDescription(new OID("1.3.6.1.2.1.16.15.1.1"));
        description.addField(new DeviceEntityDescription.FieldDescription(1, "hlMatrixControlIndex", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(2, "hlMatrixControlDataSource", DeviceEntityDescription.FieldType.OID, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(3, "hlMatrixControlNlDroppedFrames", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(4, "hlMatrixControlNlInserts", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(5, "hlMatrixControlNlDeletes", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(6, "hlMatrixControlNlMaxDesiredEntries", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(7, "hlMatrixControlAlDroppedFrames", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(8, "hlMatrixControlAlInserts", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(9, "hlMatrixControlAlDeletes", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(10, "hlMatrixControlAlMaxDesiredEntries", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(11, "hlMatrixControlOwner", DeviceEntityDescription.FieldType.STRING, 127));
        description.addField(new DeviceEntityDescription.FieldDescription(12, "hlMatrixControlStatus", DeviceEntityDescription.FieldType.INTEGER, -1));
        return description;
    }

    public DeviceEntityDescription get_Description() {
        return _entityDescription;
    }

}
