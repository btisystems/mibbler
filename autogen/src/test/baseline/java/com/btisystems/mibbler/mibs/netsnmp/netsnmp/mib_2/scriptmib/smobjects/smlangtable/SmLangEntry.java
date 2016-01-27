
package com.btisystems.mibbler.mibs.netsnmp.netsnmp.mib_2.scriptmib.smobjects.smlangtable;

import java.io.Serializable;
import com.btisystems.mibbler.mibs.netsnmp.interfaces.mib_2.scriptmib.smobjects.smlangtable.ISmLangEntry;
import com.btisystems.mibbler.mibs.netsnmp.netsnmp.mib_2.scriptmib.smobjects.SmLangTable;
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

public class SmLangEntry
    extends DeviceEntity
    implements Serializable, ISmLangEntry, IIndexed, IVariableBindingSetter
{

    private int smLangIndex;
    private String smLangLanguage;
    private String smLangVersion;
    private String smLangVendor;
    private String smLangRevision;
    private String smLangDescr;
    private String _index;
    private SmLangTable parentEntity;
    private final static DeviceEntityDescription _entityDescription = createEntityDescription();

    public SmLangEntry() {
    }

    public int getSmLangIndex() {
        return this.smLangIndex;
    }

    public void setSmLangIndex(int smLangIndex) {
        int oldValue = getSmLangIndex();
        this.smLangIndex = smLangIndex;
        notifyChange(1, oldValue, smLangIndex);
    }

    public String getSmLangLanguage() {
        return this.smLangLanguage;
    }

    public void setSmLangLanguage(String smLangLanguage) {
        String oldValue = getSmLangLanguage();
        this.smLangLanguage = smLangLanguage;
        notifyChange(2, oldValue, smLangLanguage);
    }

    public String getSmLangVersion() {
        return this.smLangVersion;
    }

    public void setSmLangVersion(String smLangVersion) {
        String oldValue = getSmLangVersion();
        this.smLangVersion = smLangVersion;
        notifyChange(3, oldValue, smLangVersion);
    }

    public String getSmLangVendor() {
        return this.smLangVendor;
    }

    public void setSmLangVendor(String smLangVendor) {
        String oldValue = getSmLangVendor();
        this.smLangVendor = smLangVendor;
        notifyChange(4, oldValue, smLangVendor);
    }

    public String getSmLangRevision() {
        return this.smLangRevision;
    }

    public void setSmLangRevision(String smLangRevision) {
        String oldValue = getSmLangRevision();
        this.smLangRevision = smLangRevision;
        notifyChange(5, oldValue, smLangRevision);
    }

    public String getSmLangDescr() {
        return this.smLangDescr;
    }

    public void setSmLangDescr(String smLangDescr) {
        String oldValue = getSmLangDescr();
        this.smLangDescr = smLangDescr;
        notifyChange(6, oldValue, smLangDescr);
    }

    public void set(VariableBinding binding) {
        switch (binding.getOid().get(10)) {
            case  1 :
                setSmLangIndex(binding.getVariable().toInt());
                break;
            case  2 :
                setSmLangLanguage(binding.getVariable().toString());
                break;
            case  3 :
                setSmLangVersion(binding.getVariable().toString());
                break;
            case  4 :
                setSmLangVendor(binding.getVariable().toString());
                break;
            case  5 :
                setSmLangRevision(binding.getVariable().toString());
                break;
            case  6 :
                setSmLangDescr(binding.getVariable().toString());
                break;
        }
    }

    public void _setIndex(OID oid) {
        byte[] _oidBytes = oid.toByteArray();
        int[] _oidInts = oid.toIntArray();
        int arrayOffset = 11;
        int _len;
        _index = new OID(_oidInts, 11, (oid.size()- 11)).toString();
        setSmLangIndex(_oidInts[arrayOffset]);
        arrayOffset += 1;
    }

    public String _getIndex() {
        return _index;
    }

    public void _setTable(SmLangTable table) {
        this.parentEntity = table;
    }

    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE).append("smLangIndex", smLangIndex).append("smLangLanguage", smLangLanguage).append("smLangVersion", smLangVersion).append("smLangVendor", smLangVendor).append("smLangRevision", smLangRevision).append("smLangDescr", smLangDescr).append("_index", _index).toString();
    }

    public int hashCode() {
        return new HashCodeBuilder().append(smLangIndex).append(smLangLanguage).append(smLangVersion).append(smLangVendor).append(smLangRevision).append(smLangDescr).append(_index).toHashCode();
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
        SmLangEntry rhs = ((SmLangEntry) obj);
        return new EqualsBuilder().append(smLangIndex, rhs.smLangIndex).append(smLangLanguage, rhs.smLangLanguage).append(smLangVersion, rhs.smLangVersion).append(smLangVendor, rhs.smLangVendor).append(smLangRevision, rhs.smLangRevision).append(smLangDescr, rhs.smLangDescr).append(_index, rhs._index).isEquals();
    }

    public SmLangEntry clone() {
        SmLangEntry _copy = new SmLangEntry();
        _copy.smLangIndex = smLangIndex;
        _copy.smLangLanguage = smLangLanguage;
        _copy.smLangVersion = smLangVersion;
        _copy.smLangVendor = smLangVendor;
        _copy.smLangRevision = smLangRevision;
        _copy.smLangDescr = smLangDescr;
        _copy._index = _index;
        _copy.parentEntity = parentEntity;
        return _copy;
    }

    private static DeviceEntityDescription createEntityDescription() {
        DeviceEntityDescription description = new DeviceEntityDescription(new OID("1.3.6.1.2.1.64.1.1.1"));
        description.addField(new DeviceEntityDescription.FieldDescription(1, "smLangIndex", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(2, "smLangLanguage", DeviceEntityDescription.FieldType.OID, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(3, "smLangVersion", DeviceEntityDescription.FieldType.STRING, 765));
        description.addField(new DeviceEntityDescription.FieldDescription(4, "smLangVendor", DeviceEntityDescription.FieldType.OID, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(5, "smLangRevision", DeviceEntityDescription.FieldType.STRING, 765));
        description.addField(new DeviceEntityDescription.FieldDescription(6, "smLangDescr", DeviceEntityDescription.FieldType.STRING, 765));
        return description;
    }

    public DeviceEntityDescription get_Description() {
        return _entityDescription;
    }

}
