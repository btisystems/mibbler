
package com.btisystems.mibbler.mibs.netsnmp.netsnmp.mib_2.scriptmib.smobjects.smextsntable;

import java.io.Serializable;
import com.btisystems.mibbler.mibs.netsnmp.interfaces.mib_2.scriptmib.smobjects.smextsntable.ISmExtsnEntry;
import com.btisystems.mibbler.mibs.netsnmp.netsnmp.mib_2.scriptmib.smobjects.SmExtsnTable;
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

public class SmExtsnEntry
    extends DeviceEntity
    implements Serializable, ISmExtsnEntry, IIndexed, IVariableBindingSetter
{

    private int smExtsnIndex;
    private String smExtsnExtension;
    private String smExtsnVersion;
    private String smExtsnVendor;
    private String smExtsnRevision;
    private String smExtsnDescr;
    private String _index;
    private SmExtsnTable parentEntity;
    private final static DeviceEntityDescription _entityDescription = createEntityDescription();

    public SmExtsnEntry() {
    }

    public int getSmExtsnIndex() {
        return this.smExtsnIndex;
    }

    public void setSmExtsnIndex(int smExtsnIndex) {
        int oldValue = getSmExtsnIndex();
        this.smExtsnIndex = smExtsnIndex;
        notifyChange(1, oldValue, smExtsnIndex);
    }

    public String getSmExtsnExtension() {
        return this.smExtsnExtension;
    }

    public void setSmExtsnExtension(String smExtsnExtension) {
        String oldValue = getSmExtsnExtension();
        this.smExtsnExtension = smExtsnExtension;
        notifyChange(2, oldValue, smExtsnExtension);
    }

    public String getSmExtsnVersion() {
        return this.smExtsnVersion;
    }

    public void setSmExtsnVersion(String smExtsnVersion) {
        String oldValue = getSmExtsnVersion();
        this.smExtsnVersion = smExtsnVersion;
        notifyChange(3, oldValue, smExtsnVersion);
    }

    public String getSmExtsnVendor() {
        return this.smExtsnVendor;
    }

    public void setSmExtsnVendor(String smExtsnVendor) {
        String oldValue = getSmExtsnVendor();
        this.smExtsnVendor = smExtsnVendor;
        notifyChange(4, oldValue, smExtsnVendor);
    }

    public String getSmExtsnRevision() {
        return this.smExtsnRevision;
    }

    public void setSmExtsnRevision(String smExtsnRevision) {
        String oldValue = getSmExtsnRevision();
        this.smExtsnRevision = smExtsnRevision;
        notifyChange(5, oldValue, smExtsnRevision);
    }

    public String getSmExtsnDescr() {
        return this.smExtsnDescr;
    }

    public void setSmExtsnDescr(String smExtsnDescr) {
        String oldValue = getSmExtsnDescr();
        this.smExtsnDescr = smExtsnDescr;
        notifyChange(6, oldValue, smExtsnDescr);
    }

    public void set(VariableBinding binding) {
        switch (binding.getOid().get(10)) {
            case  1 :
                setSmExtsnIndex(binding.getVariable().toInt());
                break;
            case  2 :
                setSmExtsnExtension(binding.getVariable().toString());
                break;
            case  3 :
                setSmExtsnVersion(binding.getVariable().toString());
                break;
            case  4 :
                setSmExtsnVendor(binding.getVariable().toString());
                break;
            case  5 :
                setSmExtsnRevision(binding.getVariable().toString());
                break;
            case  6 :
                setSmExtsnDescr(binding.getVariable().toString());
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
        setSmExtsnIndex(_oidInts[arrayOffset]);
        arrayOffset += 1;
    }

    public String _getIndex() {
        return _index;
    }

    public void _setTable(SmExtsnTable table) {
        this.parentEntity = table;
    }

    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE).append("smExtsnIndex", smExtsnIndex).append("smExtsnExtension", smExtsnExtension).append("smExtsnVersion", smExtsnVersion).append("smExtsnVendor", smExtsnVendor).append("smExtsnRevision", smExtsnRevision).append("smExtsnDescr", smExtsnDescr).append("_index", _index).toString();
    }

    public int hashCode() {
        return new HashCodeBuilder().append(smExtsnIndex).append(smExtsnExtension).append(smExtsnVersion).append(smExtsnVendor).append(smExtsnRevision).append(smExtsnDescr).append(_index).toHashCode();
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
        SmExtsnEntry rhs = ((SmExtsnEntry) obj);
        return new EqualsBuilder().append(smExtsnIndex, rhs.smExtsnIndex).append(smExtsnExtension, rhs.smExtsnExtension).append(smExtsnVersion, rhs.smExtsnVersion).append(smExtsnVendor, rhs.smExtsnVendor).append(smExtsnRevision, rhs.smExtsnRevision).append(smExtsnDescr, rhs.smExtsnDescr).append(_index, rhs._index).isEquals();
    }

    public SmExtsnEntry clone() {
        SmExtsnEntry _copy = new SmExtsnEntry();
        _copy.smExtsnIndex = smExtsnIndex;
        _copy.smExtsnExtension = smExtsnExtension;
        _copy.smExtsnVersion = smExtsnVersion;
        _copy.smExtsnVendor = smExtsnVendor;
        _copy.smExtsnRevision = smExtsnRevision;
        _copy.smExtsnDescr = smExtsnDescr;
        _copy._index = _index;
        _copy.parentEntity = parentEntity;
        return _copy;
    }

    private static DeviceEntityDescription createEntityDescription() {
        DeviceEntityDescription description = new DeviceEntityDescription(new OID("1.3.6.1.2.1.64.1.2.1"));
        description.addField(new DeviceEntityDescription.FieldDescription(1, "smExtsnIndex", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(2, "smExtsnExtension", DeviceEntityDescription.FieldType.OID, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(3, "smExtsnVersion", DeviceEntityDescription.FieldType.STRING, 765));
        description.addField(new DeviceEntityDescription.FieldDescription(4, "smExtsnVendor", DeviceEntityDescription.FieldType.OID, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(5, "smExtsnRevision", DeviceEntityDescription.FieldType.STRING, 765));
        description.addField(new DeviceEntityDescription.FieldDescription(6, "smExtsnDescr", DeviceEntityDescription.FieldType.STRING, 765));
        return description;
    }

    public DeviceEntityDescription get_Description() {
        return _entityDescription;
    }

}
