
package com.btisystems.mibbler.mibs.bti7000.bti7000_13_2_0.mib_2.rmon.history.historycontrol2table;

import java.io.Serializable;
import com.btisystems.mibbler.mibs.bti7000.bti7000_13_2_0.mib_2.rmon.history.HistoryControl2Table;
import com.btisystems.mibbler.mibs.bti7000.interfaces.mib_2.rmon.history.historycontrol2table.IHistoryControl2Entry;
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

public class HistoryControl2Entry
    extends DeviceEntity
    implements Serializable, IHistoryControl2Entry, IIndexed, IVariableBindingSetter
{

    private int historyControlDroppedFrames;
    private String _index;
    private HistoryControl2Table parentEntity;
    private final static DeviceEntityDescription _entityDescription = createEntityDescription();

    public HistoryControl2Entry() {
    }

    public int getHistoryControlDroppedFrames() {
        return this.historyControlDroppedFrames;
    }

    public void setHistoryControlDroppedFrames(int historyControlDroppedFrames) {
        int oldValue = getHistoryControlDroppedFrames();
        this.historyControlDroppedFrames = historyControlDroppedFrames;
        notifyChange(1, oldValue, historyControlDroppedFrames);
    }

    public void set(VariableBinding binding) {
        switch (binding.getOid().get(10)) {
            case  1 :
                setHistoryControlDroppedFrames(binding.getVariable().toInt());
                break;
        }
    }

    public void _setIndex(OID oid) {
        byte[] _oidBytes = oid.toByteArray();
        int[] _oidInts = oid.toIntArray();
        int arrayOffset = 11;
        int _len;
        _index = new OID(_oidInts, 11, (oid.size()- 11)).toString();
    }

    public String _getIndex() {
        return _index;
    }

    public void _setTable(HistoryControl2Table table) {
        this.parentEntity = table;
    }

    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE).append("historyControlDroppedFrames", historyControlDroppedFrames).append("_index", _index).toString();
    }

    public int hashCode() {
        return new HashCodeBuilder().append(historyControlDroppedFrames).append(_index).toHashCode();
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
        HistoryControl2Entry rhs = ((HistoryControl2Entry) obj);
        return new EqualsBuilder().append(historyControlDroppedFrames, rhs.historyControlDroppedFrames).append(_index, rhs._index).isEquals();
    }

    public HistoryControl2Entry clone() {
        HistoryControl2Entry _copy = new HistoryControl2Entry();
        _copy.historyControlDroppedFrames = historyControlDroppedFrames;
        _copy._index = _index;
        _copy.parentEntity = parentEntity;
        return _copy;
    }

    private static DeviceEntityDescription createEntityDescription() {
        DeviceEntityDescription description = new DeviceEntityDescription(new OID("1.3.6.1.2.1.16.2.5.1"));
        description.addField(new DeviceEntityDescription.FieldDescription(1, "historyControlDroppedFrames", DeviceEntityDescription.FieldType.INTEGER, -1));
        return description;
    }

    public DeviceEntityDescription get_Description() {
        return _entityDescription;
    }

}
