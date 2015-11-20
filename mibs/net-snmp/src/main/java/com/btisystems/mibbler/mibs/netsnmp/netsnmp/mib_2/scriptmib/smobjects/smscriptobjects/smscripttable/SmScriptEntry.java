
package com.btisystems.mibbler.mibs.netsnmp.netsnmp.mib_2.scriptmib.smobjects.smscriptobjects.smscripttable;

import java.io.Serializable;
import com.btisystems.mibbler.mibs.netsnmp.interfaces.mib_2.scriptmib.smobjects.smscriptobjects.smscripttable.ISmScriptEntry;
import com.btisystems.mibbler.mibs.netsnmp.netsnmp.mib_2.scriptmib.smobjects.smscriptobjects.SmScriptTable;
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

public class SmScriptEntry
    extends DeviceEntity
    implements Serializable, ISmScriptEntry, IIndexed, IVariableBindingSetter
{

    private String smScriptOwner;
    private String smScriptName;
    private String smScriptDescr;
    private int smScriptLanguage;
    private String smScriptSource;
    private Integer smScriptAdminStatus;
    private Integer smScriptOperStatus;
    private Integer smScriptStorageType;
    private int smScriptRowStatus;
    private String smScriptError;
    private String smScriptLastChange;
    private String _index;
    private SmScriptTable parentEntity;
    private final static DeviceEntityDescription _entityDescription = createEntityDescription();

    public SmScriptEntry() {
    }

    public String getSmScriptOwner() {
        return this.smScriptOwner;
    }

    public void setSmScriptOwner(String smScriptOwner) {
        String oldValue = getSmScriptOwner();
        this.smScriptOwner = smScriptOwner;
        notifyChange(1, oldValue, smScriptOwner);
    }

    public String getSmScriptName() {
        return this.smScriptName;
    }

    public void setSmScriptName(String smScriptName) {
        String oldValue = getSmScriptName();
        this.smScriptName = smScriptName;
        notifyChange(2, oldValue, smScriptName);
    }

    public String getSmScriptDescr() {
        return this.smScriptDescr;
    }

    public void setSmScriptDescr(String smScriptDescr) {
        String oldValue = getSmScriptDescr();
        this.smScriptDescr = smScriptDescr;
        notifyChange(3, oldValue, smScriptDescr);
    }

    public int getSmScriptLanguage() {
        return this.smScriptLanguage;
    }

    public void setSmScriptLanguage(int smScriptLanguage) {
        int oldValue = getSmScriptLanguage();
        this.smScriptLanguage = smScriptLanguage;
        notifyChange(4, oldValue, smScriptLanguage);
    }

    public String getSmScriptSource() {
        return this.smScriptSource;
    }

    public void setSmScriptSource(String smScriptSource) {
        String oldValue = getSmScriptSource();
        this.smScriptSource = smScriptSource;
        notifyChange(5, oldValue, smScriptSource);
    }

    public int getSmScriptAdminStatus() {
        if (this.smScriptAdminStatus == null) {
            return  2;
        }
        return this.smScriptAdminStatus;
    }

    public boolean isSmScriptAdminStatusDefined() {
        return (this.smScriptAdminStatus!= null);
    }

    public void setSmScriptAdminStatus(int smScriptAdminStatus) {
        int oldValue = getSmScriptAdminStatus();
        this.smScriptAdminStatus = smScriptAdminStatus;
        notifyChange(6, oldValue, smScriptAdminStatus);
    }

    public int getSmScriptOperStatus() {
        if (this.smScriptOperStatus == null) {
            return  2;
        }
        return this.smScriptOperStatus;
    }

    public boolean isSmScriptOperStatusDefined() {
        return (this.smScriptOperStatus!= null);
    }

    public void setSmScriptOperStatus(int smScriptOperStatus) {
        int oldValue = getSmScriptOperStatus();
        this.smScriptOperStatus = smScriptOperStatus;
        notifyChange(7, oldValue, smScriptOperStatus);
    }

    public int getSmScriptStorageType() {
        if (this.smScriptStorageType == null) {
            return  2;
        }
        return this.smScriptStorageType;
    }

    public boolean isSmScriptStorageTypeDefined() {
        return (this.smScriptStorageType!= null);
    }

    public void setSmScriptStorageType(int smScriptStorageType) {
        int oldValue = getSmScriptStorageType();
        this.smScriptStorageType = smScriptStorageType;
        notifyChange(8, oldValue, smScriptStorageType);
    }

    public int getSmScriptRowStatus() {
        return this.smScriptRowStatus;
    }

    public void setSmScriptRowStatus(int smScriptRowStatus) {
        int oldValue = getSmScriptRowStatus();
        this.smScriptRowStatus = smScriptRowStatus;
        notifyChange(9, oldValue, smScriptRowStatus);
    }

    public String getSmScriptError() {
        return this.smScriptError;
    }

    public void setSmScriptError(String smScriptError) {
        String oldValue = getSmScriptError();
        this.smScriptError = smScriptError;
        notifyChange(10, oldValue, smScriptError);
    }

    public String getSmScriptLastChange() {
        return this.smScriptLastChange;
    }

    public void setSmScriptLastChange(String smScriptLastChange) {
        String oldValue = getSmScriptLastChange();
        this.smScriptLastChange = smScriptLastChange;
        notifyChange(11, oldValue, smScriptLastChange);
    }

    public void set(VariableBinding binding) {
        switch (binding.getOid().get(11)) {
            case  1 :
                setSmScriptOwner(binding.getVariable().toString());
                break;
            case  2 :
                setSmScriptName(binding.getVariable().toString());
                break;
            case  3 :
                setSmScriptDescr(binding.getVariable().toString());
                break;
            case  4 :
                setSmScriptLanguage(binding.getVariable().toInt());
                break;
            case  5 :
                setSmScriptSource(binding.getVariable().toString());
                break;
            case  6 :
                setSmScriptAdminStatus(binding.getVariable().toInt());
                break;
            case  7 :
                setSmScriptOperStatus(binding.getVariable().toInt());
                break;
            case  8 :
                setSmScriptStorageType(binding.getVariable().toInt());
                break;
            case  9 :
                setSmScriptRowStatus(binding.getVariable().toInt());
                break;
            case  10 :
                setSmScriptError(binding.getVariable().toString());
                break;
            case  11 :
                setSmScriptLastChange(binding.getVariable().toString());
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
        setSmScriptOwner(new String(_oidBytes, arrayOffset, _len));
        arrayOffset += _len;
        _len = _oidInts[arrayOffset ++];
        setSmScriptName(new String(_oidBytes, arrayOffset, _len));
        arrayOffset += _len;
    }

    public String _getIndex() {
        return _index;
    }

    public void _setTable(SmScriptTable table) {
        this.parentEntity = table;
    }

    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE).append("smScriptOwner", smScriptOwner).append("smScriptName", smScriptName).append("smScriptDescr", smScriptDescr).append("smScriptLanguage", smScriptLanguage).append("smScriptSource", smScriptSource).append("smScriptAdminStatus", smScriptAdminStatus).append("smScriptOperStatus", smScriptOperStatus).append("smScriptStorageType", smScriptStorageType).append("smScriptRowStatus", smScriptRowStatus).append("smScriptError", smScriptError).append("smScriptLastChange", smScriptLastChange).append("_index", _index).toString();
    }

    public int hashCode() {
        return new HashCodeBuilder().append(smScriptOwner).append(smScriptName).append(smScriptDescr).append(smScriptLanguage).append(smScriptSource).append(smScriptAdminStatus).append(smScriptOperStatus).append(smScriptStorageType).append(smScriptRowStatus).append(smScriptError).append(smScriptLastChange).append(_index).toHashCode();
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
        SmScriptEntry rhs = ((SmScriptEntry) obj);
        return new EqualsBuilder().append(smScriptOwner, rhs.smScriptOwner).append(smScriptName, rhs.smScriptName).append(smScriptDescr, rhs.smScriptDescr).append(smScriptLanguage, rhs.smScriptLanguage).append(smScriptSource, rhs.smScriptSource).append(smScriptAdminStatus, rhs.smScriptAdminStatus).append(smScriptOperStatus, rhs.smScriptOperStatus).append(smScriptStorageType, rhs.smScriptStorageType).append(smScriptRowStatus, rhs.smScriptRowStatus).append(smScriptError, rhs.smScriptError).append(smScriptLastChange, rhs.smScriptLastChange).append(_index, rhs._index).isEquals();
    }

    public SmScriptEntry clone() {
        SmScriptEntry _copy = new SmScriptEntry();
        _copy.smScriptOwner = smScriptOwner;
        _copy.smScriptName = smScriptName;
        _copy.smScriptDescr = smScriptDescr;
        _copy.smScriptLanguage = smScriptLanguage;
        _copy.smScriptSource = smScriptSource;
        _copy.smScriptAdminStatus = smScriptAdminStatus;
        _copy.smScriptOperStatus = smScriptOperStatus;
        _copy.smScriptStorageType = smScriptStorageType;
        _copy.smScriptRowStatus = smScriptRowStatus;
        _copy.smScriptError = smScriptError;
        _copy.smScriptLastChange = smScriptLastChange;
        _copy._index = _index;
        _copy.parentEntity = parentEntity;
        return _copy;
    }

    private static DeviceEntityDescription createEntityDescription() {
        DeviceEntityDescription description = new DeviceEntityDescription(new OID("1.3.6.1.2.1.64.1.3.1.1"));
        description.addField(new DeviceEntityDescription.FieldDescription(1, "smScriptOwner", DeviceEntityDescription.FieldType.STRING, 765));
        description.addField(new DeviceEntityDescription.FieldDescription(2, "smScriptName", DeviceEntityDescription.FieldType.STRING, 765));
        description.addField(new DeviceEntityDescription.FieldDescription(3, "smScriptDescr", DeviceEntityDescription.FieldType.STRING, 765));
        description.addField(new DeviceEntityDescription.FieldDescription(4, "smScriptLanguage", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(5, "smScriptSource", DeviceEntityDescription.FieldType.STRING, 255));
        description.addField(new DeviceEntityDescription.FieldDescription(6, "smScriptAdminStatus", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(7, "smScriptOperStatus", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(8, "smScriptStorageType", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(9, "smScriptRowStatus", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(10, "smScriptError", DeviceEntityDescription.FieldType.STRING, 765));
        description.addField(new DeviceEntityDescription.FieldDescription(11, "smScriptLastChange", DeviceEntityDescription.FieldType.DATE_AND_TIME, -1));
        return description;
    }

    public DeviceEntityDescription get_Description() {
        return _entityDescription;
    }

}
