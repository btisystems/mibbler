
package com.btisystems.mibbler.mibs.netsnmp.netsnmp.mib_2.transmission.dot3.dot3pausetable;

import java.io.Serializable;
import com.btisystems.mibbler.mibs.netsnmp.interfaces.mib_2.transmission.dot3.dot3pausetable.IDot3PauseEntry;
import com.btisystems.mibbler.mibs.netsnmp.netsnmp.mib_2.transmission.dot3.Dot3PauseTable;
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

public class Dot3PauseEntry
    extends DeviceEntity
    implements Serializable, IDot3PauseEntry, IIndexed, IVariableBindingSetter
{

    private int dot3PauseAdminMode;
    private int dot3PauseOperMode;
    private int dot3InPauseFrames;
    private int dot3OutPauseFrames;
    private long dot3HCInPauseFrames;
    private long dot3HCOutPauseFrames;
    private String _index;
    private Dot3PauseTable parentEntity;
    private final static DeviceEntityDescription _entityDescription = createEntityDescription();

    public Dot3PauseEntry() {
    }

    public int getDot3PauseAdminMode() {
        return this.dot3PauseAdminMode;
    }

    public void setDot3PauseAdminMode(int dot3PauseAdminMode) {
        int oldValue = getDot3PauseAdminMode();
        this.dot3PauseAdminMode = dot3PauseAdminMode;
        notifyChange(1, oldValue, dot3PauseAdminMode);
    }

    public int getDot3PauseOperMode() {
        return this.dot3PauseOperMode;
    }

    public void setDot3PauseOperMode(int dot3PauseOperMode) {
        int oldValue = getDot3PauseOperMode();
        this.dot3PauseOperMode = dot3PauseOperMode;
        notifyChange(2, oldValue, dot3PauseOperMode);
    }

    public int getDot3InPauseFrames() {
        return this.dot3InPauseFrames;
    }

    public void setDot3InPauseFrames(int dot3InPauseFrames) {
        int oldValue = getDot3InPauseFrames();
        this.dot3InPauseFrames = dot3InPauseFrames;
        notifyChange(3, oldValue, dot3InPauseFrames);
    }

    public int getDot3OutPauseFrames() {
        return this.dot3OutPauseFrames;
    }

    public void setDot3OutPauseFrames(int dot3OutPauseFrames) {
        int oldValue = getDot3OutPauseFrames();
        this.dot3OutPauseFrames = dot3OutPauseFrames;
        notifyChange(4, oldValue, dot3OutPauseFrames);
    }

    public long getDot3HCInPauseFrames() {
        return this.dot3HCInPauseFrames;
    }

    public void setDot3HCInPauseFrames(long dot3HCInPauseFrames) {
        long oldValue = getDot3HCInPauseFrames();
        this.dot3HCInPauseFrames = dot3HCInPauseFrames;
        notifyChange(5, oldValue, dot3HCInPauseFrames);
    }

    public long getDot3HCOutPauseFrames() {
        return this.dot3HCOutPauseFrames;
    }

    public void setDot3HCOutPauseFrames(long dot3HCOutPauseFrames) {
        long oldValue = getDot3HCOutPauseFrames();
        this.dot3HCOutPauseFrames = dot3HCOutPauseFrames;
        notifyChange(6, oldValue, dot3HCOutPauseFrames);
    }

    public void set(VariableBinding binding) {
        switch (binding.getOid().get(10)) {
            case  1 :
                setDot3PauseAdminMode(binding.getVariable().toInt());
                break;
            case  2 :
                setDot3PauseOperMode(binding.getVariable().toInt());
                break;
            case  3 :
                setDot3InPauseFrames(binding.getVariable().toInt());
                break;
            case  4 :
                setDot3OutPauseFrames(binding.getVariable().toInt());
                break;
            case  5 :
                setDot3HCInPauseFrames(binding.getVariable().toLong());
                break;
            case  6 :
                setDot3HCOutPauseFrames(binding.getVariable().toLong());
                break;
        }
    }

    public void _setIndex(OID oid) {
        byte[] _oidBytes = oid.toByteArray();
        int[] _oidInts = oid.toIntArray();
        int arrayOffset = 11;
        int _len;
        _index = new OID(_oidInts, 11, (oid.size()- 11)).toString();
        arrayOffset += 1;
    }

    public String _getIndex() {
        return _index;
    }

    public void _setTable(Dot3PauseTable table) {
        this.parentEntity = table;
    }

    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE).append("dot3PauseAdminMode", dot3PauseAdminMode).append("dot3PauseOperMode", dot3PauseOperMode).append("dot3InPauseFrames", dot3InPauseFrames).append("dot3OutPauseFrames", dot3OutPauseFrames).append("dot3HCInPauseFrames", dot3HCInPauseFrames).append("dot3HCOutPauseFrames", dot3HCOutPauseFrames).append("_index", _index).toString();
    }

    public int hashCode() {
        return new HashCodeBuilder().append(dot3PauseAdminMode).append(dot3PauseOperMode).append(dot3InPauseFrames).append(dot3OutPauseFrames).append(dot3HCInPauseFrames).append(dot3HCOutPauseFrames).append(_index).toHashCode();
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
        Dot3PauseEntry rhs = ((Dot3PauseEntry) obj);
        return new EqualsBuilder().append(dot3PauseAdminMode, rhs.dot3PauseAdminMode).append(dot3PauseOperMode, rhs.dot3PauseOperMode).append(dot3InPauseFrames, rhs.dot3InPauseFrames).append(dot3OutPauseFrames, rhs.dot3OutPauseFrames).append(dot3HCInPauseFrames, rhs.dot3HCInPauseFrames).append(dot3HCOutPauseFrames, rhs.dot3HCOutPauseFrames).append(_index, rhs._index).isEquals();
    }

    public Dot3PauseEntry clone() {
        Dot3PauseEntry _copy = new Dot3PauseEntry();
        _copy.dot3PauseAdminMode = dot3PauseAdminMode;
        _copy.dot3PauseOperMode = dot3PauseOperMode;
        _copy.dot3InPauseFrames = dot3InPauseFrames;
        _copy.dot3OutPauseFrames = dot3OutPauseFrames;
        _copy.dot3HCInPauseFrames = dot3HCInPauseFrames;
        _copy.dot3HCOutPauseFrames = dot3HCOutPauseFrames;
        _copy._index = _index;
        _copy.parentEntity = parentEntity;
        return _copy;
    }

    private static DeviceEntityDescription createEntityDescription() {
        DeviceEntityDescription description = new DeviceEntityDescription(new OID("1.3.6.1.2.1.10.7.10.1"));
        description.addField(new DeviceEntityDescription.FieldDescription(1, "dot3PauseAdminMode", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(2, "dot3PauseOperMode", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(3, "dot3InPauseFrames", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(4, "dot3OutPauseFrames", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(5, "dot3HCInPauseFrames", DeviceEntityDescription.FieldType.UNSIGNED64, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(6, "dot3HCOutPauseFrames", DeviceEntityDescription.FieldType.UNSIGNED64, -1));
        return description;
    }

    public DeviceEntityDescription get_Description() {
        return _entityDescription;
    }

}
