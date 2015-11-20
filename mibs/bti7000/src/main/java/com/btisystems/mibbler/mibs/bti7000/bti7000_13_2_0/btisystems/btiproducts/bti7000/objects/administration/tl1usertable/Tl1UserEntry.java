
package com.btisystems.mibbler.mibs.bti7000.bti7000_13_2_0.btisystems.btiproducts.bti7000.objects.administration.tl1usertable;

import java.io.Serializable;
import com.btisystems.mibbler.mibs.bti7000.bti7000_13_2_0.btisystems.btiproducts.bti7000.objects.administration.Tl1UserTable;
import com.btisystems.mibbler.mibs.bti7000.interfaces.btisystems.btiproducts.bti7000.objects.administration.tl1usertable.ITl1UserEntry;
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

public class Tl1UserEntry
    extends DeviceEntity
    implements Serializable, ITl1UserEntry, IIndexed, IVariableBindingSetter
{

    private String tl1UserIdx;
    private String _index;
    private Tl1UserTable parentEntity;
    private final static DeviceEntityDescription _entityDescription = createEntityDescription();

    public Tl1UserEntry() {
    }

    public String getTl1UserIdx() {
        return this.tl1UserIdx;
    }

    public void setTl1UserIdx(String tl1UserIdx) {
        String oldValue = getTl1UserIdx();
        this.tl1UserIdx = tl1UserIdx;
        notifyChange(1, oldValue, tl1UserIdx);
    }

    public void set(VariableBinding binding) {
        switch (binding.getOid().get(13)) {
            case  1 :
                setTl1UserIdx(binding.getVariable().toString());
                break;
        }
    }

    public void _setIndex(OID oid) {
        byte[] _oidBytes = oid.toByteArray();
        int[] _oidInts = oid.toIntArray();
        int arrayOffset = 14;
        int _len;
        _index = new OID(_oidInts, 14, (oid.size()- 14)).toString();
        _len = _oidInts[arrayOffset ++];
        setTl1UserIdx(new String(_oidBytes, arrayOffset, _len));
        arrayOffset += _len;
    }

    public String _getIndex() {
        return _index;
    }

    public void _setTable(Tl1UserTable table) {
        this.parentEntity = table;
    }

    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE).append("tl1UserIdx", tl1UserIdx).append("_index", _index).toString();
    }

    public int hashCode() {
        return new HashCodeBuilder().append(tl1UserIdx).append(_index).toHashCode();
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
        Tl1UserEntry rhs = ((Tl1UserEntry) obj);
        return new EqualsBuilder().append(tl1UserIdx, rhs.tl1UserIdx).append(_index, rhs._index).isEquals();
    }

    public Tl1UserEntry clone() {
        Tl1UserEntry _copy = new Tl1UserEntry();
        _copy.tl1UserIdx = tl1UserIdx;
        _copy._index = _index;
        _copy.parentEntity = parentEntity;
        return _copy;
    }

    private static DeviceEntityDescription createEntityDescription() {
        DeviceEntityDescription description = new DeviceEntityDescription(new OID("1.3.6.1.4.1.18070.2.2.1.8.1.1"));
        description.addField(new DeviceEntityDescription.FieldDescription(1, "tl1UserIdx", DeviceEntityDescription.FieldType.STRING, 255));
        return description;
    }

    public DeviceEntityDescription get_Description() {
        return _entityDescription;
    }

}
