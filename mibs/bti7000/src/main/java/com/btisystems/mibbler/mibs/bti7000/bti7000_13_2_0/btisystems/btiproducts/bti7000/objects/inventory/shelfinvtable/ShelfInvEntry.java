
package com.btisystems.mibbler.mibs.bti7000.bti7000_13_2_0.btisystems.btiproducts.bti7000.objects.inventory.shelfinvtable;

import java.io.Serializable;
import com.btisystems.mibbler.mibs.bti7000.bti7000_13_2_0.btisystems.btiproducts.bti7000.objects.inventory.ShelfInvTable;
import com.btisystems.mibbler.mibs.bti7000.interfaces.btisystems.btiproducts.bti7000.objects.inventory.shelfinvtable.IShelfInvEntry;
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

public class ShelfInvEntry
    extends DeviceEntity
    implements Serializable, IShelfInvEntry, IIndexed, IVariableBindingSetter
{

    private int shelfInvIdx;
    private String shelfInvExpectedNEName;
    private String shelfInvExpectedIPAddress;
    private int shelfInvExpectedShelfNum;
    private String shelfInvExpectedMSISerialNum;
    private String shelfInvDiscoveredNEName;
    private String shelfInvDiscoveredIPAddress;
    private int shelfInvDiscoveredShelfNum;
    private String shelfInvDiscoveredMSISerialNum;
    private int shelfInvType;
    private String shelfInvShortName;
    private String shelfInvName;
    private String shelfInvChassisPEC;
    private String shelfInvChassisCLEI;
    private String shelfInvAssemblyPEC;
    private int shelfInvRev;
    private int shelfInvConfig;
    private String shelfInvUSI;
    private String shelfInvSerialNum;
    private String shelfInvMfgDate;
    private String shelfInvMfgLoc;
    private String shelfInvTestDate;
    private String shelfInvTestLoc;
    private String _index;
    private ShelfInvTable parentEntity;
    private final static DeviceEntityDescription _entityDescription = createEntityDescription();

    public ShelfInvEntry() {
    }

    public int getShelfInvIdx() {
        return this.shelfInvIdx;
    }

    public void setShelfInvIdx(int shelfInvIdx) {
        int oldValue = getShelfInvIdx();
        this.shelfInvIdx = shelfInvIdx;
        notifyChange(1, oldValue, shelfInvIdx);
    }

    public String getShelfInvExpectedNEName() {
        return this.shelfInvExpectedNEName;
    }

    public void setShelfInvExpectedNEName(String shelfInvExpectedNEName) {
        String oldValue = getShelfInvExpectedNEName();
        this.shelfInvExpectedNEName = shelfInvExpectedNEName;
        notifyChange(2, oldValue, shelfInvExpectedNEName);
    }

    public String getShelfInvExpectedIPAddress() {
        return this.shelfInvExpectedIPAddress;
    }

    public void setShelfInvExpectedIPAddress(String shelfInvExpectedIPAddress) {
        String oldValue = getShelfInvExpectedIPAddress();
        this.shelfInvExpectedIPAddress = shelfInvExpectedIPAddress;
        notifyChange(3, oldValue, shelfInvExpectedIPAddress);
    }

    public int getShelfInvExpectedShelfNum() {
        return this.shelfInvExpectedShelfNum;
    }

    public void setShelfInvExpectedShelfNum(int shelfInvExpectedShelfNum) {
        int oldValue = getShelfInvExpectedShelfNum();
        this.shelfInvExpectedShelfNum = shelfInvExpectedShelfNum;
        notifyChange(4, oldValue, shelfInvExpectedShelfNum);
    }

    public String getShelfInvExpectedMSISerialNum() {
        return this.shelfInvExpectedMSISerialNum;
    }

    public void setShelfInvExpectedMSISerialNum(String shelfInvExpectedMSISerialNum) {
        String oldValue = getShelfInvExpectedMSISerialNum();
        this.shelfInvExpectedMSISerialNum = shelfInvExpectedMSISerialNum;
        notifyChange(5, oldValue, shelfInvExpectedMSISerialNum);
    }

    public String getShelfInvDiscoveredNEName() {
        return this.shelfInvDiscoveredNEName;
    }

    public void setShelfInvDiscoveredNEName(String shelfInvDiscoveredNEName) {
        String oldValue = getShelfInvDiscoveredNEName();
        this.shelfInvDiscoveredNEName = shelfInvDiscoveredNEName;
        notifyChange(6, oldValue, shelfInvDiscoveredNEName);
    }

    public String getShelfInvDiscoveredIPAddress() {
        return this.shelfInvDiscoveredIPAddress;
    }

    public void setShelfInvDiscoveredIPAddress(String shelfInvDiscoveredIPAddress) {
        String oldValue = getShelfInvDiscoveredIPAddress();
        this.shelfInvDiscoveredIPAddress = shelfInvDiscoveredIPAddress;
        notifyChange(7, oldValue, shelfInvDiscoveredIPAddress);
    }

    public int getShelfInvDiscoveredShelfNum() {
        return this.shelfInvDiscoveredShelfNum;
    }

    public void setShelfInvDiscoveredShelfNum(int shelfInvDiscoveredShelfNum) {
        int oldValue = getShelfInvDiscoveredShelfNum();
        this.shelfInvDiscoveredShelfNum = shelfInvDiscoveredShelfNum;
        notifyChange(8, oldValue, shelfInvDiscoveredShelfNum);
    }

    public String getShelfInvDiscoveredMSISerialNum() {
        return this.shelfInvDiscoveredMSISerialNum;
    }

    public void setShelfInvDiscoveredMSISerialNum(String shelfInvDiscoveredMSISerialNum) {
        String oldValue = getShelfInvDiscoveredMSISerialNum();
        this.shelfInvDiscoveredMSISerialNum = shelfInvDiscoveredMSISerialNum;
        notifyChange(9, oldValue, shelfInvDiscoveredMSISerialNum);
    }

    public int getShelfInvType() {
        return this.shelfInvType;
    }

    public void setShelfInvType(int shelfInvType) {
        int oldValue = getShelfInvType();
        this.shelfInvType = shelfInvType;
        notifyChange(10, oldValue, shelfInvType);
    }

    public String getShelfInvShortName() {
        return this.shelfInvShortName;
    }

    public void setShelfInvShortName(String shelfInvShortName) {
        String oldValue = getShelfInvShortName();
        this.shelfInvShortName = shelfInvShortName;
        notifyChange(11, oldValue, shelfInvShortName);
    }

    public String getShelfInvName() {
        return this.shelfInvName;
    }

    public void setShelfInvName(String shelfInvName) {
        String oldValue = getShelfInvName();
        this.shelfInvName = shelfInvName;
        notifyChange(12, oldValue, shelfInvName);
    }

    public String getShelfInvChassisPEC() {
        return this.shelfInvChassisPEC;
    }

    public void setShelfInvChassisPEC(String shelfInvChassisPEC) {
        String oldValue = getShelfInvChassisPEC();
        this.shelfInvChassisPEC = shelfInvChassisPEC;
        notifyChange(13, oldValue, shelfInvChassisPEC);
    }

    public String getShelfInvChassisCLEI() {
        return this.shelfInvChassisCLEI;
    }

    public void setShelfInvChassisCLEI(String shelfInvChassisCLEI) {
        String oldValue = getShelfInvChassisCLEI();
        this.shelfInvChassisCLEI = shelfInvChassisCLEI;
        notifyChange(14, oldValue, shelfInvChassisCLEI);
    }

    public String getShelfInvAssemblyPEC() {
        return this.shelfInvAssemblyPEC;
    }

    public void setShelfInvAssemblyPEC(String shelfInvAssemblyPEC) {
        String oldValue = getShelfInvAssemblyPEC();
        this.shelfInvAssemblyPEC = shelfInvAssemblyPEC;
        notifyChange(15, oldValue, shelfInvAssemblyPEC);
    }

    public int getShelfInvRev() {
        return this.shelfInvRev;
    }

    public void setShelfInvRev(int shelfInvRev) {
        int oldValue = getShelfInvRev();
        this.shelfInvRev = shelfInvRev;
        notifyChange(16, oldValue, shelfInvRev);
    }

    public int getShelfInvConfig() {
        return this.shelfInvConfig;
    }

    public void setShelfInvConfig(int shelfInvConfig) {
        int oldValue = getShelfInvConfig();
        this.shelfInvConfig = shelfInvConfig;
        notifyChange(17, oldValue, shelfInvConfig);
    }

    public String getShelfInvUSI() {
        return this.shelfInvUSI;
    }

    public void setShelfInvUSI(String shelfInvUSI) {
        String oldValue = getShelfInvUSI();
        this.shelfInvUSI = shelfInvUSI;
        notifyChange(18, oldValue, shelfInvUSI);
    }

    public String getShelfInvSerialNum() {
        return this.shelfInvSerialNum;
    }

    public void setShelfInvSerialNum(String shelfInvSerialNum) {
        String oldValue = getShelfInvSerialNum();
        this.shelfInvSerialNum = shelfInvSerialNum;
        notifyChange(19, oldValue, shelfInvSerialNum);
    }

    public String getShelfInvMfgDate() {
        return this.shelfInvMfgDate;
    }

    public void setShelfInvMfgDate(String shelfInvMfgDate) {
        String oldValue = getShelfInvMfgDate();
        this.shelfInvMfgDate = shelfInvMfgDate;
        notifyChange(20, oldValue, shelfInvMfgDate);
    }

    public String getShelfInvMfgLoc() {
        return this.shelfInvMfgLoc;
    }

    public void setShelfInvMfgLoc(String shelfInvMfgLoc) {
        String oldValue = getShelfInvMfgLoc();
        this.shelfInvMfgLoc = shelfInvMfgLoc;
        notifyChange(21, oldValue, shelfInvMfgLoc);
    }

    public String getShelfInvTestDate() {
        return this.shelfInvTestDate;
    }

    public void setShelfInvTestDate(String shelfInvTestDate) {
        String oldValue = getShelfInvTestDate();
        this.shelfInvTestDate = shelfInvTestDate;
        notifyChange(22, oldValue, shelfInvTestDate);
    }

    public String getShelfInvTestLoc() {
        return this.shelfInvTestLoc;
    }

    public void setShelfInvTestLoc(String shelfInvTestLoc) {
        String oldValue = getShelfInvTestLoc();
        this.shelfInvTestLoc = shelfInvTestLoc;
        notifyChange(23, oldValue, shelfInvTestLoc);
    }

    public void set(VariableBinding binding) {
        switch (binding.getOid().get(13)) {
            case  1 :
                setShelfInvIdx(binding.getVariable().toInt());
                break;
            case  2 :
                setShelfInvExpectedNEName(binding.getVariable().toString());
                break;
            case  3 :
                setShelfInvExpectedIPAddress(binding.getVariable().toString());
                break;
            case  4 :
                setShelfInvExpectedShelfNum(binding.getVariable().toInt());
                break;
            case  5 :
                setShelfInvExpectedMSISerialNum(binding.getVariable().toString());
                break;
            case  6 :
                setShelfInvDiscoveredNEName(binding.getVariable().toString());
                break;
            case  7 :
                setShelfInvDiscoveredIPAddress(binding.getVariable().toString());
                break;
            case  8 :
                setShelfInvDiscoveredShelfNum(binding.getVariable().toInt());
                break;
            case  9 :
                setShelfInvDiscoveredMSISerialNum(binding.getVariable().toString());
                break;
            case  10 :
                setShelfInvType(binding.getVariable().toInt());
                break;
            case  11 :
                setShelfInvShortName(binding.getVariable().toString());
                break;
            case  12 :
                setShelfInvName(binding.getVariable().toString());
                break;
            case  13 :
                setShelfInvChassisPEC(binding.getVariable().toString());
                break;
            case  14 :
                setShelfInvChassisCLEI(binding.getVariable().toString());
                break;
            case  15 :
                setShelfInvAssemblyPEC(binding.getVariable().toString());
                break;
            case  16 :
                setShelfInvRev(binding.getVariable().toInt());
                break;
            case  17 :
                setShelfInvConfig(binding.getVariable().toInt());
                break;
            case  18 :
                setShelfInvUSI(binding.getVariable().toString());
                break;
            case  19 :
                setShelfInvSerialNum(binding.getVariable().toString());
                break;
            case  20 :
                setShelfInvMfgDate(binding.getVariable().toString());
                break;
            case  21 :
                setShelfInvMfgLoc(binding.getVariable().toString());
                break;
            case  22 :
                setShelfInvTestDate(binding.getVariable().toString());
                break;
            case  23 :
                setShelfInvTestLoc(binding.getVariable().toString());
                break;
        }
    }

    public void _setIndex(OID oid) {
        byte[] _oidBytes = oid.toByteArray();
        int[] _oidInts = oid.toIntArray();
        int arrayOffset = 14;
        int _len;
        _index = new OID(_oidInts, 14, (oid.size()- 14)).toString();
        setShelfInvIdx(_oidInts[arrayOffset]);
        arrayOffset += 1;
    }

    public String _getIndex() {
        return _index;
    }

    public void _setTable(ShelfInvTable table) {
        this.parentEntity = table;
    }

    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE).append("shelfInvIdx", shelfInvIdx).append("shelfInvExpectedNEName", shelfInvExpectedNEName).append("shelfInvExpectedIPAddress", shelfInvExpectedIPAddress).append("shelfInvExpectedShelfNum", shelfInvExpectedShelfNum).append("shelfInvExpectedMSISerialNum", shelfInvExpectedMSISerialNum).append("shelfInvDiscoveredNEName", shelfInvDiscoveredNEName).append("shelfInvDiscoveredIPAddress", shelfInvDiscoveredIPAddress).append("shelfInvDiscoveredShelfNum", shelfInvDiscoveredShelfNum).append("shelfInvDiscoveredMSISerialNum", shelfInvDiscoveredMSISerialNum).append("shelfInvType", shelfInvType).append("shelfInvShortName", shelfInvShortName).append("shelfInvName", shelfInvName).append("shelfInvChassisPEC", shelfInvChassisPEC).append("shelfInvChassisCLEI", shelfInvChassisCLEI).append("shelfInvAssemblyPEC", shelfInvAssemblyPEC).append("shelfInvRev", shelfInvRev).append("shelfInvConfig", shelfInvConfig).append("shelfInvUSI", shelfInvUSI).append("shelfInvSerialNum", shelfInvSerialNum).append("shelfInvMfgDate", shelfInvMfgDate).append("shelfInvMfgLoc", shelfInvMfgLoc).append("shelfInvTestDate", shelfInvTestDate).append("shelfInvTestLoc", shelfInvTestLoc).append("_index", _index).toString();
    }

    public int hashCode() {
        return new HashCodeBuilder().append(shelfInvIdx).append(shelfInvExpectedNEName).append(shelfInvExpectedIPAddress).append(shelfInvExpectedShelfNum).append(shelfInvExpectedMSISerialNum).append(shelfInvDiscoveredNEName).append(shelfInvDiscoveredIPAddress).append(shelfInvDiscoveredShelfNum).append(shelfInvDiscoveredMSISerialNum).append(shelfInvType).append(shelfInvShortName).append(shelfInvName).append(shelfInvChassisPEC).append(shelfInvChassisCLEI).append(shelfInvAssemblyPEC).append(shelfInvRev).append(shelfInvConfig).append(shelfInvUSI).append(shelfInvSerialNum).append(shelfInvMfgDate).append(shelfInvMfgLoc).append(shelfInvTestDate).append(shelfInvTestLoc).append(_index).toHashCode();
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
        ShelfInvEntry rhs = ((ShelfInvEntry) obj);
        return new EqualsBuilder().append(shelfInvIdx, rhs.shelfInvIdx).append(shelfInvExpectedNEName, rhs.shelfInvExpectedNEName).append(shelfInvExpectedIPAddress, rhs.shelfInvExpectedIPAddress).append(shelfInvExpectedShelfNum, rhs.shelfInvExpectedShelfNum).append(shelfInvExpectedMSISerialNum, rhs.shelfInvExpectedMSISerialNum).append(shelfInvDiscoveredNEName, rhs.shelfInvDiscoveredNEName).append(shelfInvDiscoveredIPAddress, rhs.shelfInvDiscoveredIPAddress).append(shelfInvDiscoveredShelfNum, rhs.shelfInvDiscoveredShelfNum).append(shelfInvDiscoveredMSISerialNum, rhs.shelfInvDiscoveredMSISerialNum).append(shelfInvType, rhs.shelfInvType).append(shelfInvShortName, rhs.shelfInvShortName).append(shelfInvName, rhs.shelfInvName).append(shelfInvChassisPEC, rhs.shelfInvChassisPEC).append(shelfInvChassisCLEI, rhs.shelfInvChassisCLEI).append(shelfInvAssemblyPEC, rhs.shelfInvAssemblyPEC).append(shelfInvRev, rhs.shelfInvRev).append(shelfInvConfig, rhs.shelfInvConfig).append(shelfInvUSI, rhs.shelfInvUSI).append(shelfInvSerialNum, rhs.shelfInvSerialNum).append(shelfInvMfgDate, rhs.shelfInvMfgDate).append(shelfInvMfgLoc, rhs.shelfInvMfgLoc).append(shelfInvTestDate, rhs.shelfInvTestDate).append(shelfInvTestLoc, rhs.shelfInvTestLoc).append(_index, rhs._index).isEquals();
    }

    public ShelfInvEntry clone() {
        ShelfInvEntry _copy = new ShelfInvEntry();
        _copy.shelfInvIdx = shelfInvIdx;
        _copy.shelfInvExpectedNEName = shelfInvExpectedNEName;
        _copy.shelfInvExpectedIPAddress = shelfInvExpectedIPAddress;
        _copy.shelfInvExpectedShelfNum = shelfInvExpectedShelfNum;
        _copy.shelfInvExpectedMSISerialNum = shelfInvExpectedMSISerialNum;
        _copy.shelfInvDiscoveredNEName = shelfInvDiscoveredNEName;
        _copy.shelfInvDiscoveredIPAddress = shelfInvDiscoveredIPAddress;
        _copy.shelfInvDiscoveredShelfNum = shelfInvDiscoveredShelfNum;
        _copy.shelfInvDiscoveredMSISerialNum = shelfInvDiscoveredMSISerialNum;
        _copy.shelfInvType = shelfInvType;
        _copy.shelfInvShortName = shelfInvShortName;
        _copy.shelfInvName = shelfInvName;
        _copy.shelfInvChassisPEC = shelfInvChassisPEC;
        _copy.shelfInvChassisCLEI = shelfInvChassisCLEI;
        _copy.shelfInvAssemblyPEC = shelfInvAssemblyPEC;
        _copy.shelfInvRev = shelfInvRev;
        _copy.shelfInvConfig = shelfInvConfig;
        _copy.shelfInvUSI = shelfInvUSI;
        _copy.shelfInvSerialNum = shelfInvSerialNum;
        _copy.shelfInvMfgDate = shelfInvMfgDate;
        _copy.shelfInvMfgLoc = shelfInvMfgLoc;
        _copy.shelfInvTestDate = shelfInvTestDate;
        _copy.shelfInvTestLoc = shelfInvTestLoc;
        _copy._index = _index;
        _copy.parentEntity = parentEntity;
        return _copy;
    }

    private static DeviceEntityDescription createEntityDescription() {
        DeviceEntityDescription description = new DeviceEntityDescription(new OID("1.3.6.1.4.1.18070.2.2.1.2.1.1"));
        description.addField(new DeviceEntityDescription.FieldDescription(1, "shelfInvIdx", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(2, "shelfInvExpectedNEName", DeviceEntityDescription.FieldType.STRING, 255));
        description.addField(new DeviceEntityDescription.FieldDescription(3, "shelfInvExpectedIPAddress", DeviceEntityDescription.FieldType.STRING, 255));
        description.addField(new DeviceEntityDescription.FieldDescription(4, "shelfInvExpectedShelfNum", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(5, "shelfInvExpectedMSISerialNum", DeviceEntityDescription.FieldType.STRING, 255));
        description.addField(new DeviceEntityDescription.FieldDescription(6, "shelfInvDiscoveredNEName", DeviceEntityDescription.FieldType.STRING, 255));
        description.addField(new DeviceEntityDescription.FieldDescription(7, "shelfInvDiscoveredIPAddress", DeviceEntityDescription.FieldType.STRING, 255));
        description.addField(new DeviceEntityDescription.FieldDescription(8, "shelfInvDiscoveredShelfNum", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(9, "shelfInvDiscoveredMSISerialNum", DeviceEntityDescription.FieldType.STRING, 255));
        description.addField(new DeviceEntityDescription.FieldDescription(10, "shelfInvType", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(11, "shelfInvShortName", DeviceEntityDescription.FieldType.STRING, 255));
        description.addField(new DeviceEntityDescription.FieldDescription(12, "shelfInvName", DeviceEntityDescription.FieldType.STRING, 255));
        description.addField(new DeviceEntityDescription.FieldDescription(13, "shelfInvChassisPEC", DeviceEntityDescription.FieldType.STRING, 255));
        description.addField(new DeviceEntityDescription.FieldDescription(14, "shelfInvChassisCLEI", DeviceEntityDescription.FieldType.STRING, 255));
        description.addField(new DeviceEntityDescription.FieldDescription(15, "shelfInvAssemblyPEC", DeviceEntityDescription.FieldType.STRING, 255));
        description.addField(new DeviceEntityDescription.FieldDescription(16, "shelfInvRev", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(17, "shelfInvConfig", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(18, "shelfInvUSI", DeviceEntityDescription.FieldType.STRING, 255));
        description.addField(new DeviceEntityDescription.FieldDescription(19, "shelfInvSerialNum", DeviceEntityDescription.FieldType.STRING, 255));
        description.addField(new DeviceEntityDescription.FieldDescription(20, "shelfInvMfgDate", DeviceEntityDescription.FieldType.STRING, 255));
        description.addField(new DeviceEntityDescription.FieldDescription(21, "shelfInvMfgLoc", DeviceEntityDescription.FieldType.STRING, 255));
        description.addField(new DeviceEntityDescription.FieldDescription(22, "shelfInvTestDate", DeviceEntityDescription.FieldType.STRING, 255));
        description.addField(new DeviceEntityDescription.FieldDescription(23, "shelfInvTestLoc", DeviceEntityDescription.FieldType.STRING, 255));
        return description;
    }

    public DeviceEntityDescription get_Description() {
        return _entityDescription;
    }

}
