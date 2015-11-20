
package com.btisystems.mibbler.mibs.netsnmp.netsnmp.mib_2.ifmib.ifmibobjects.iftesttable;

import java.io.Serializable;
import com.btisystems.mibbler.mibs.netsnmp.interfaces.mib_2.ifmib.ifmibobjects.iftesttable.IIfTestEntry;
import com.btisystems.mibbler.mibs.netsnmp.netsnmp.mib_2.ifmib.ifmibobjects.IfTestTable;
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

public class IfTestEntry
    extends DeviceEntity
    implements Serializable, IIfTestEntry, IIndexed, IVariableBindingSetter
{

    private int ifTestId;
    private int ifTestStatus;
    private String ifTestType;
    private int ifTestResult;
    private String ifTestCode;
    private String ifTestOwner;
    private String _index;
    private IfTestTable parentEntity;
    private final static DeviceEntityDescription _entityDescription = createEntityDescription();

    public IfTestEntry() {
    }

    public int getIfTestId() {
        return this.ifTestId;
    }

    public void setIfTestId(int ifTestId) {
        int oldValue = getIfTestId();
        this.ifTestId = ifTestId;
        notifyChange(1, oldValue, ifTestId);
    }

    public int getIfTestStatus() {
        return this.ifTestStatus;
    }

    public void setIfTestStatus(int ifTestStatus) {
        int oldValue = getIfTestStatus();
        this.ifTestStatus = ifTestStatus;
        notifyChange(2, oldValue, ifTestStatus);
    }

    public String getIfTestType() {
        return this.ifTestType;
    }

    public void setIfTestType(String ifTestType) {
        String oldValue = getIfTestType();
        this.ifTestType = ifTestType;
        notifyChange(3, oldValue, ifTestType);
    }

    public int getIfTestResult() {
        return this.ifTestResult;
    }

    public void setIfTestResult(int ifTestResult) {
        int oldValue = getIfTestResult();
        this.ifTestResult = ifTestResult;
        notifyChange(4, oldValue, ifTestResult);
    }

    public String getIfTestCode() {
        return this.ifTestCode;
    }

    public void setIfTestCode(String ifTestCode) {
        String oldValue = getIfTestCode();
        this.ifTestCode = ifTestCode;
        notifyChange(5, oldValue, ifTestCode);
    }

    public String getIfTestOwner() {
        return this.ifTestOwner;
    }

    public void setIfTestOwner(String ifTestOwner) {
        String oldValue = getIfTestOwner();
        this.ifTestOwner = ifTestOwner;
        notifyChange(6, oldValue, ifTestOwner);
    }

    public void set(VariableBinding binding) {
        switch (binding.getOid().get(10)) {
            case  1 :
                setIfTestId(binding.getVariable().toInt());
                break;
            case  2 :
                setIfTestStatus(binding.getVariable().toInt());
                break;
            case  3 :
                setIfTestType(binding.getVariable().toString());
                break;
            case  4 :
                setIfTestResult(binding.getVariable().toInt());
                break;
            case  5 :
                setIfTestCode(binding.getVariable().toString());
                break;
            case  6 :
                setIfTestOwner(binding.getVariable().toString());
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

    public void _setTable(IfTestTable table) {
        this.parentEntity = table;
    }

    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE).append("ifTestId", ifTestId).append("ifTestStatus", ifTestStatus).append("ifTestType", ifTestType).append("ifTestResult", ifTestResult).append("ifTestCode", ifTestCode).append("ifTestOwner", ifTestOwner).append("_index", _index).toString();
    }

    public int hashCode() {
        return new HashCodeBuilder().append(ifTestId).append(ifTestStatus).append(ifTestType).append(ifTestResult).append(ifTestCode).append(ifTestOwner).append(_index).toHashCode();
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
        IfTestEntry rhs = ((IfTestEntry) obj);
        return new EqualsBuilder().append(ifTestId, rhs.ifTestId).append(ifTestStatus, rhs.ifTestStatus).append(ifTestType, rhs.ifTestType).append(ifTestResult, rhs.ifTestResult).append(ifTestCode, rhs.ifTestCode).append(ifTestOwner, rhs.ifTestOwner).append(_index, rhs._index).isEquals();
    }

    public IfTestEntry clone() {
        IfTestEntry _copy = new IfTestEntry();
        _copy.ifTestId = ifTestId;
        _copy.ifTestStatus = ifTestStatus;
        _copy.ifTestType = ifTestType;
        _copy.ifTestResult = ifTestResult;
        _copy.ifTestCode = ifTestCode;
        _copy.ifTestOwner = ifTestOwner;
        _copy._index = _index;
        _copy.parentEntity = parentEntity;
        return _copy;
    }

    private static DeviceEntityDescription createEntityDescription() {
        DeviceEntityDescription description = new DeviceEntityDescription(new OID("1.3.6.1.2.1.31.1.3.1"));
        description.addField(new DeviceEntityDescription.FieldDescription(1, "ifTestId", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(2, "ifTestStatus", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(3, "ifTestType", DeviceEntityDescription.FieldType.OID, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(4, "ifTestResult", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(5, "ifTestCode", DeviceEntityDescription.FieldType.OID, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(6, "ifTestOwner", DeviceEntityDescription.FieldType.STRING, 255));
        return description;
    }

    public DeviceEntityDescription get_Description() {
        return _entityDescription;
    }

}
