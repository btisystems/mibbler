
package com.btisystems.mibbler.mibs.netsnmp.netsnmp.mib_2.mta.mtagroupassociationtable;

import java.io.Serializable;
import com.btisystems.mibbler.mibs.netsnmp.interfaces.mib_2.mta.mtagroupassociationtable.IMtaGroupAssociationEntry;
import com.btisystems.mibbler.mibs.netsnmp.netsnmp.mib_2.mta.MtaGroupAssociationTable;
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

public class MtaGroupAssociationEntry
    extends DeviceEntity
    implements Serializable, IMtaGroupAssociationEntry, IIndexed, IVariableBindingSetter
{

    private int mtaGroupAssociationIndex;
    private String _index;
    private MtaGroupAssociationTable parentEntity;
    private final static DeviceEntityDescription _entityDescription = createEntityDescription();

    public MtaGroupAssociationEntry() {
    }

    public int getMtaGroupAssociationIndex() {
        return this.mtaGroupAssociationIndex;
    }

    public void setMtaGroupAssociationIndex(int mtaGroupAssociationIndex) {
        int oldValue = getMtaGroupAssociationIndex();
        this.mtaGroupAssociationIndex = mtaGroupAssociationIndex;
        notifyChange(1, oldValue, mtaGroupAssociationIndex);
    }

    public void set(VariableBinding binding) {
        switch (binding.getOid().get(9)) {
            case  1 :
                setMtaGroupAssociationIndex(binding.getVariable().toInt());
                break;
        }
    }

    public void _setIndex(OID oid) {
        byte[] _oidBytes = oid.toByteArray();
        int[] _oidInts = oid.toIntArray();
        int arrayOffset = 10;
        int _len;
        _index = new OID(_oidInts, 10, (oid.size()- 10)).toString();
        arrayOffset += 1;
        arrayOffset += 1;
        setMtaGroupAssociationIndex(_oidInts[arrayOffset]);
        arrayOffset += 1;
    }

    public String _getIndex() {
        return _index;
    }

    public void _setTable(MtaGroupAssociationTable table) {
        this.parentEntity = table;
    }

    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE).append("mtaGroupAssociationIndex", mtaGroupAssociationIndex).append("_index", _index).toString();
    }

    public int hashCode() {
        return new HashCodeBuilder().append(mtaGroupAssociationIndex).append(_index).toHashCode();
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
        MtaGroupAssociationEntry rhs = ((MtaGroupAssociationEntry) obj);
        return new EqualsBuilder().append(mtaGroupAssociationIndex, rhs.mtaGroupAssociationIndex).append(_index, rhs._index).isEquals();
    }

    public MtaGroupAssociationEntry clone() {
        MtaGroupAssociationEntry _copy = new MtaGroupAssociationEntry();
        _copy.mtaGroupAssociationIndex = mtaGroupAssociationIndex;
        _copy._index = _index;
        _copy.parentEntity = parentEntity;
        return _copy;
    }

    private static DeviceEntityDescription createEntityDescription() {
        DeviceEntityDescription description = new DeviceEntityDescription(new OID("1.3.6.1.2.1.28.3.1"));
        description.addField(new DeviceEntityDescription.FieldDescription(1, "mtaGroupAssociationIndex", DeviceEntityDescription.FieldType.INTEGER, -1));
        return description;
    }

    public DeviceEntityDescription get_Description() {
        return _entityDescription;
    }

}
