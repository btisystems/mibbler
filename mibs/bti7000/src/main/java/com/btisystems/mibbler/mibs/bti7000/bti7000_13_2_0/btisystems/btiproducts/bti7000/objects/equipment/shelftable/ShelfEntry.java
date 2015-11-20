
package com.btisystems.mibbler.mibs.bti7000.bti7000_13_2_0.btisystems.btiproducts.bti7000.objects.equipment.shelftable;

import java.io.Serializable;
import com.btisystems.mibbler.mibs.bti7000.bti7000_13_2_0.btisystems.btiproducts.bti7000.objects.equipment.ShelfTable;
import com.btisystems.mibbler.mibs.bti7000.interfaces.btisystems.btiproducts.bti7000.objects.equipment.shelftable.IShelfEntry;
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

public class ShelfEntry
    extends DeviceEntity
    implements Serializable, IShelfEntry, IIndexed, IVariableBindingSetter
{

    private int shelfIdx;
    private Integer shelfProvConfig;
    private int shelfDiscConfig;
    private Integer shelfType;
    private String shelfPEC;
    private Integer shelfAdminStatus;
    private int shelfOperStatus;
    private String shelfOperStatQlfr;
    private String shelfId;
    private String shelfCustom1;
    private String shelfCustom2;
    private String shelfCustom3;
    private Integer shelfPowerFeedA;
    private Integer shelfPowerFeedB;
    private int shelfRowStatus;
    private String _index;
    private ShelfTable parentEntity;
    private final static DeviceEntityDescription _entityDescription = createEntityDescription();

    public ShelfEntry() {
    }

    public int getShelfIdx() {
        return this.shelfIdx;
    }

    public void setShelfIdx(int shelfIdx) {
        int oldValue = getShelfIdx();
        this.shelfIdx = shelfIdx;
        notifyChange(1, oldValue, shelfIdx);
    }

    public int getShelfProvConfig() {
        if (this.shelfProvConfig == null) {
            return  5;
        }
        return this.shelfProvConfig;
    }

    public boolean isShelfProvConfigDefined() {
        return (this.shelfProvConfig!= null);
    }

    public void setShelfProvConfig(int shelfProvConfig) {
        int oldValue = getShelfProvConfig();
        this.shelfProvConfig = shelfProvConfig;
        notifyChange(2, oldValue, shelfProvConfig);
    }

    public int getShelfDiscConfig() {
        return this.shelfDiscConfig;
    }

    public void setShelfDiscConfig(int shelfDiscConfig) {
        int oldValue = getShelfDiscConfig();
        this.shelfDiscConfig = shelfDiscConfig;
        notifyChange(3, oldValue, shelfDiscConfig);
    }

    public int getShelfType() {
        if (this.shelfType == null) {
            return  2;
        }
        return this.shelfType;
    }

    public boolean isShelfTypeDefined() {
        return (this.shelfType!= null);
    }

    public void setShelfType(int shelfType) {
        int oldValue = getShelfType();
        this.shelfType = shelfType;
        notifyChange(4, oldValue, shelfType);
    }

    public String getShelfPEC() {
        return this.shelfPEC;
    }

    public void setShelfPEC(String shelfPEC) {
        String oldValue = getShelfPEC();
        this.shelfPEC = shelfPEC;
        notifyChange(5, oldValue, shelfPEC);
    }

    public int getShelfAdminStatus() {
        if (this.shelfAdminStatus == null) {
            return  1;
        }
        return this.shelfAdminStatus;
    }

    public boolean isShelfAdminStatusDefined() {
        return (this.shelfAdminStatus!= null);
    }

    public void setShelfAdminStatus(int shelfAdminStatus) {
        int oldValue = getShelfAdminStatus();
        this.shelfAdminStatus = shelfAdminStatus;
        notifyChange(6, oldValue, shelfAdminStatus);
    }

    public int getShelfOperStatus() {
        return this.shelfOperStatus;
    }

    public void setShelfOperStatus(int shelfOperStatus) {
        int oldValue = getShelfOperStatus();
        this.shelfOperStatus = shelfOperStatus;
        notifyChange(7, oldValue, shelfOperStatus);
    }

    public String getShelfOperStatQlfr() {
        return this.shelfOperStatQlfr;
    }

    public void setShelfOperStatQlfr(String shelfOperStatQlfr) {
        String oldValue = getShelfOperStatQlfr();
        this.shelfOperStatQlfr = shelfOperStatQlfr;
        notifyChange(8, oldValue, shelfOperStatQlfr);
    }

    public String getShelfId() {
        if (this.shelfId == null) {
            return "";
        }
        return this.shelfId;
    }

    public boolean isShelfIdDefined() {
        return (this.shelfId!= null);
    }

    public void setShelfId(String shelfId) {
        String oldValue = getShelfId();
        this.shelfId = shelfId;
        notifyChange(9, oldValue, shelfId);
    }

    public String getShelfCustom1() {
        if (this.shelfCustom1 == null) {
            return "";
        }
        return this.shelfCustom1;
    }

    public boolean isShelfCustom1Defined() {
        return (this.shelfCustom1 != null);
    }

    public void setShelfCustom1(String shelfCustom1) {
        String oldValue = getShelfCustom1();
        this.shelfCustom1 = shelfCustom1;
        notifyChange(10, oldValue, shelfCustom1);
    }

    public String getShelfCustom2() {
        if (this.shelfCustom2 == null) {
            return "";
        }
        return this.shelfCustom2;
    }

    public boolean isShelfCustom2Defined() {
        return (this.shelfCustom2 != null);
    }

    public void setShelfCustom2(String shelfCustom2) {
        String oldValue = getShelfCustom2();
        this.shelfCustom2 = shelfCustom2;
        notifyChange(11, oldValue, shelfCustom2);
    }

    public String getShelfCustom3() {
        if (this.shelfCustom3 == null) {
            return "";
        }
        return this.shelfCustom3;
    }

    public boolean isShelfCustom3Defined() {
        return (this.shelfCustom3 != null);
    }

    public void setShelfCustom3(String shelfCustom3) {
        String oldValue = getShelfCustom3();
        this.shelfCustom3 = shelfCustom3;
        notifyChange(12, oldValue, shelfCustom3);
    }

    public int getShelfPowerFeedA() {
        if (this.shelfPowerFeedA == null) {
            return  2;
        }
        return this.shelfPowerFeedA;
    }

    public boolean isShelfPowerFeedADefined() {
        return (this.shelfPowerFeedA!= null);
    }

    public void setShelfPowerFeedA(int shelfPowerFeedA) {
        int oldValue = getShelfPowerFeedA();
        this.shelfPowerFeedA = shelfPowerFeedA;
        notifyChange(13, oldValue, shelfPowerFeedA);
    }

    public int getShelfPowerFeedB() {
        if (this.shelfPowerFeedB == null) {
            return  2;
        }
        return this.shelfPowerFeedB;
    }

    public boolean isShelfPowerFeedBDefined() {
        return (this.shelfPowerFeedB!= null);
    }

    public void setShelfPowerFeedB(int shelfPowerFeedB) {
        int oldValue = getShelfPowerFeedB();
        this.shelfPowerFeedB = shelfPowerFeedB;
        notifyChange(14, oldValue, shelfPowerFeedB);
    }

    public int getShelfRowStatus() {
        return this.shelfRowStatus;
    }

    public void setShelfRowStatus(int shelfRowStatus) {
        int oldValue = getShelfRowStatus();
        this.shelfRowStatus = shelfRowStatus;
        notifyChange(100, oldValue, shelfRowStatus);
    }

    public void set(VariableBinding binding) {
        switch (binding.getOid().get(13)) {
            case  1 :
                setShelfIdx(binding.getVariable().toInt());
                break;
            case  2 :
                setShelfProvConfig(binding.getVariable().toInt());
                break;
            case  3 :
                setShelfDiscConfig(binding.getVariable().toInt());
                break;
            case  4 :
                setShelfType(binding.getVariable().toInt());
                break;
            case  5 :
                setShelfPEC(binding.getVariable().toString());
                break;
            case  6 :
                setShelfAdminStatus(binding.getVariable().toInt());
                break;
            case  7 :
                setShelfOperStatus(binding.getVariable().toInt());
                break;
            case  8 :
                setShelfOperStatQlfr(binding.getVariable().toString());
                break;
            case  9 :
                setShelfId(binding.getVariable().toString());
                break;
            case  10 :
                setShelfCustom1(binding.getVariable().toString());
                break;
            case  11 :
                setShelfCustom2(binding.getVariable().toString());
                break;
            case  12 :
                setShelfCustom3(binding.getVariable().toString());
                break;
            case  13 :
                setShelfPowerFeedA(binding.getVariable().toInt());
                break;
            case  14 :
                setShelfPowerFeedB(binding.getVariable().toInt());
                break;
            case  100 :
                setShelfRowStatus(binding.getVariable().toInt());
                break;
        }
    }

    public void _setIndex(OID oid) {
        byte[] _oidBytes = oid.toByteArray();
        int[] _oidInts = oid.toIntArray();
        int arrayOffset = 14;
        int _len;
        _index = new OID(_oidInts, 14, (oid.size()- 14)).toString();
        setShelfIdx(_oidInts[arrayOffset]);
        arrayOffset += 1;
    }

    public String _getIndex() {
        return _index;
    }

    public void _setTable(ShelfTable table) {
        this.parentEntity = table;
    }

    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE).append("shelfIdx", shelfIdx).append("shelfProvConfig", shelfProvConfig).append("shelfDiscConfig", shelfDiscConfig).append("shelfType", shelfType).append("shelfPEC", shelfPEC).append("shelfAdminStatus", shelfAdminStatus).append("shelfOperStatus", shelfOperStatus).append("shelfOperStatQlfr", shelfOperStatQlfr).append("shelfId", shelfId).append("shelfCustom1", shelfCustom1).append("shelfCustom2", shelfCustom2).append("shelfCustom3", shelfCustom3).append("shelfPowerFeedA", shelfPowerFeedA).append("shelfPowerFeedB", shelfPowerFeedB).append("shelfRowStatus", shelfRowStatus).append("_index", _index).toString();
    }

    public int hashCode() {
        return new HashCodeBuilder().append(shelfIdx).append(shelfProvConfig).append(shelfDiscConfig).append(shelfType).append(shelfPEC).append(shelfAdminStatus).append(shelfOperStatus).append(shelfOperStatQlfr).append(shelfId).append(shelfCustom1).append(shelfCustom2).append(shelfCustom3).append(shelfPowerFeedA).append(shelfPowerFeedB).append(shelfRowStatus).append(_index).toHashCode();
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
        ShelfEntry rhs = ((ShelfEntry) obj);
        return new EqualsBuilder().append(shelfIdx, rhs.shelfIdx).append(shelfProvConfig, rhs.shelfProvConfig).append(shelfDiscConfig, rhs.shelfDiscConfig).append(shelfType, rhs.shelfType).append(shelfPEC, rhs.shelfPEC).append(shelfAdminStatus, rhs.shelfAdminStatus).append(shelfOperStatus, rhs.shelfOperStatus).append(shelfOperStatQlfr, rhs.shelfOperStatQlfr).append(shelfId, rhs.shelfId).append(shelfCustom1, rhs.shelfCustom1).append(shelfCustom2, rhs.shelfCustom2).append(shelfCustom3, rhs.shelfCustom3).append(shelfPowerFeedA, rhs.shelfPowerFeedA).append(shelfPowerFeedB, rhs.shelfPowerFeedB).append(shelfRowStatus, rhs.shelfRowStatus).append(_index, rhs._index).isEquals();
    }

    public ShelfEntry clone() {
        ShelfEntry _copy = new ShelfEntry();
        _copy.shelfIdx = shelfIdx;
        _copy.shelfProvConfig = shelfProvConfig;
        _copy.shelfDiscConfig = shelfDiscConfig;
        _copy.shelfType = shelfType;
        _copy.shelfPEC = shelfPEC;
        _copy.shelfAdminStatus = shelfAdminStatus;
        _copy.shelfOperStatus = shelfOperStatus;
        _copy.shelfOperStatQlfr = shelfOperStatQlfr;
        _copy.shelfId = shelfId;
        _copy.shelfCustom1 = shelfCustom1;
        _copy.shelfCustom2 = shelfCustom2;
        _copy.shelfCustom3 = shelfCustom3;
        _copy.shelfPowerFeedA = shelfPowerFeedA;
        _copy.shelfPowerFeedB = shelfPowerFeedB;
        _copy.shelfRowStatus = shelfRowStatus;
        _copy._index = _index;
        _copy.parentEntity = parentEntity;
        return _copy;
    }

    private static DeviceEntityDescription createEntityDescription() {
        DeviceEntityDescription description = new DeviceEntityDescription(new OID("1.3.6.1.4.1.18070.2.2.1.3.1.1"));
        description.addField(new DeviceEntityDescription.FieldDescription(1, "shelfIdx", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(2, "shelfProvConfig", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(3, "shelfDiscConfig", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(4, "shelfType", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(5, "shelfPEC", DeviceEntityDescription.FieldType.STRING, 255));
        description.addField(new DeviceEntityDescription.FieldDescription(6, "shelfAdminStatus", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(7, "shelfOperStatus", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(8, "shelfOperStatQlfr", DeviceEntityDescription.FieldType.STRING, 65));
        description.addField(new DeviceEntityDescription.FieldDescription(9, "shelfId", DeviceEntityDescription.FieldType.STRING, 255));
        description.addField(new DeviceEntityDescription.FieldDescription(10, "shelfCustom1", DeviceEntityDescription.FieldType.STRING, 255));
        description.addField(new DeviceEntityDescription.FieldDescription(11, "shelfCustom2", DeviceEntityDescription.FieldType.STRING, 255));
        description.addField(new DeviceEntityDescription.FieldDescription(12, "shelfCustom3", DeviceEntityDescription.FieldType.STRING, 255));
        description.addField(new DeviceEntityDescription.FieldDescription(13, "shelfPowerFeedA", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(14, "shelfPowerFeedB", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(100, "shelfRowStatus", DeviceEntityDescription.FieldType.INTEGER, -1));
        return description;
    }

    public DeviceEntityDescription get_Description() {
        return _entityDescription;
    }

}
