
package com.btisystems.mibbler.mibs.netsnmp.netsnmp.mib_2.scriptmib.smobjects.smscriptobjects.smcodetable;

import java.io.Serializable;
import com.btisystems.mibbler.mibs.netsnmp.interfaces.mib_2.scriptmib.smobjects.smscriptobjects.smcodetable.ISmCodeEntry;
import com.btisystems.mibbler.mibs.netsnmp.netsnmp.mib_2.scriptmib.smobjects.smscriptobjects.SmCodeTable;
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

public class SmCodeEntry
    extends DeviceEntity
    implements Serializable, ISmCodeEntry, IIndexed, IVariableBindingSetter
{

    private int smCodeIndex;
    private String smCodeText;
    private int smCodeRowStatus;
    private String _index;
    private SmCodeTable parentEntity;
    private final static DeviceEntityDescription _entityDescription = createEntityDescription();

    public SmCodeEntry() {
    }

    public int getSmCodeIndex() {
        return this.smCodeIndex;
    }

    public void setSmCodeIndex(int smCodeIndex) {
        int oldValue = getSmCodeIndex();
        this.smCodeIndex = smCodeIndex;
        notifyChange(1, oldValue, smCodeIndex);
    }

    public String getSmCodeText() {
        return this.smCodeText;
    }

    public void setSmCodeText(String smCodeText) {
        String oldValue = getSmCodeText();
        this.smCodeText = smCodeText;
        notifyChange(2, oldValue, smCodeText);
    }

    public int getSmCodeRowStatus() {
        return this.smCodeRowStatus;
    }

    public void setSmCodeRowStatus(int smCodeRowStatus) {
        int oldValue = getSmCodeRowStatus();
        this.smCodeRowStatus = smCodeRowStatus;
        notifyChange(3, oldValue, smCodeRowStatus);
    }

    public void set(VariableBinding binding) {
        switch (binding.getOid().get(11)) {
            case  1 :
                setSmCodeIndex(binding.getVariable().toInt());
                break;
            case  2 :
                setSmCodeText(binding.getVariable().toString());
                break;
            case  3 :
                setSmCodeRowStatus(binding.getVariable().toInt());
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
        _len = _oidInts[arrayOffset ++];
        arrayOffset += _len;
        setSmCodeIndex(_oidInts[arrayOffset]);
        arrayOffset += 1;
    }

    public String _getIndex() {
        return _index;
    }

    public void _setTable(SmCodeTable table) {
        this.parentEntity = table;
    }

    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE).append("smCodeIndex", smCodeIndex).append("smCodeText", smCodeText).append("smCodeRowStatus", smCodeRowStatus).append("_index", _index).toString();
    }

    public int hashCode() {
        return new HashCodeBuilder().append(smCodeIndex).append(smCodeText).append(smCodeRowStatus).append(_index).toHashCode();
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
        SmCodeEntry rhs = ((SmCodeEntry) obj);
        return new EqualsBuilder().append(smCodeIndex, rhs.smCodeIndex).append(smCodeText, rhs.smCodeText).append(smCodeRowStatus, rhs.smCodeRowStatus).append(_index, rhs._index).isEquals();
    }

    public SmCodeEntry clone() {
        SmCodeEntry _copy = new SmCodeEntry();
        _copy.smCodeIndex = smCodeIndex;
        _copy.smCodeText = smCodeText;
        _copy.smCodeRowStatus = smCodeRowStatus;
        _copy._index = _index;
        _copy.parentEntity = parentEntity;
        return _copy;
    }

    private static DeviceEntityDescription createEntityDescription() {
        DeviceEntityDescription description = new DeviceEntityDescription(new OID("1.3.6.1.2.1.64.1.3.2.1"));
        description.addField(new DeviceEntityDescription.FieldDescription(1, "smCodeIndex", DeviceEntityDescription.FieldType.UNSIGNED32, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(2, "smCodeText", DeviceEntityDescription.FieldType.STRING, 1024));
        description.addField(new DeviceEntityDescription.FieldDescription(3, "smCodeRowStatus", DeviceEntityDescription.FieldType.INTEGER, -1));
        return description;
    }

    public DeviceEntityDescription get_Description() {
        return _entityDescription;
    }

}
