
package com.btisystems.mibbler.mibs.rfc.rfc.mib_2.ifmib.ifmibobjects.ifxtable;

import java.io.Serializable;
import com.btisystems.mibbler.mibs.rfc.interfaces.mib_2.ifmib.ifmibobjects.ifxtable.IIfXEntry;
import com.btisystems.mibbler.mibs.rfc.rfc.mib_2.ifmib.ifmibobjects.IfXTable;
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

public class IfXEntry
    extends DeviceEntity
    implements Serializable, IIfXEntry, IIndexed, IVariableBindingSetter
{

    private String ifName;
    private int ifInMulticastPkts;
    private int ifInBroadcastPkts;
    private int ifOutMulticastPkts;
    private int ifOutBroadcastPkts;
    private long ifHCInOctets;
    private long ifHCInUcastPkts;
    private long ifHCInMulticastPkts;
    private long ifHCInBroadcastPkts;
    private long ifHCOutOctets;
    private long ifHCOutUcastPkts;
    private long ifHCOutMulticastPkts;
    private long ifHCOutBroadcastPkts;
    private int ifLinkUpDownTrapEnable;
    private int ifHighSpeed;
    private int ifPromiscuousMode;
    private int ifConnectorPresent;
    private String ifAlias;
    private int ifCounterDiscontinuityTime;
    private String _index;
    private IfXTable parentEntity;
    private final static DeviceEntityDescription _entityDescription = createEntityDescription();

    public IfXEntry() {
    }

    public String getIfName() {
        return this.ifName;
    }

    public void setIfName(String ifName) {
        String oldValue = getIfName();
        this.ifName = ifName;
        notifyChange(1, oldValue, ifName);
    }

    public int getIfInMulticastPkts() {
        return this.ifInMulticastPkts;
    }

    public void setIfInMulticastPkts(int ifInMulticastPkts) {
        int oldValue = getIfInMulticastPkts();
        this.ifInMulticastPkts = ifInMulticastPkts;
        notifyChange(2, oldValue, ifInMulticastPkts);
    }

    public int getIfInBroadcastPkts() {
        return this.ifInBroadcastPkts;
    }

    public void setIfInBroadcastPkts(int ifInBroadcastPkts) {
        int oldValue = getIfInBroadcastPkts();
        this.ifInBroadcastPkts = ifInBroadcastPkts;
        notifyChange(3, oldValue, ifInBroadcastPkts);
    }

    public int getIfOutMulticastPkts() {
        return this.ifOutMulticastPkts;
    }

    public void setIfOutMulticastPkts(int ifOutMulticastPkts) {
        int oldValue = getIfOutMulticastPkts();
        this.ifOutMulticastPkts = ifOutMulticastPkts;
        notifyChange(4, oldValue, ifOutMulticastPkts);
    }

    public int getIfOutBroadcastPkts() {
        return this.ifOutBroadcastPkts;
    }

    public void setIfOutBroadcastPkts(int ifOutBroadcastPkts) {
        int oldValue = getIfOutBroadcastPkts();
        this.ifOutBroadcastPkts = ifOutBroadcastPkts;
        notifyChange(5, oldValue, ifOutBroadcastPkts);
    }

    public long getIfHCInOctets() {
        return this.ifHCInOctets;
    }

    public void setIfHCInOctets(long ifHCInOctets) {
        long oldValue = getIfHCInOctets();
        this.ifHCInOctets = ifHCInOctets;
        notifyChange(6, oldValue, ifHCInOctets);
    }

    public long getIfHCInUcastPkts() {
        return this.ifHCInUcastPkts;
    }

    public void setIfHCInUcastPkts(long ifHCInUcastPkts) {
        long oldValue = getIfHCInUcastPkts();
        this.ifHCInUcastPkts = ifHCInUcastPkts;
        notifyChange(7, oldValue, ifHCInUcastPkts);
    }

    public long getIfHCInMulticastPkts() {
        return this.ifHCInMulticastPkts;
    }

    public void setIfHCInMulticastPkts(long ifHCInMulticastPkts) {
        long oldValue = getIfHCInMulticastPkts();
        this.ifHCInMulticastPkts = ifHCInMulticastPkts;
        notifyChange(8, oldValue, ifHCInMulticastPkts);
    }

    public long getIfHCInBroadcastPkts() {
        return this.ifHCInBroadcastPkts;
    }

    public void setIfHCInBroadcastPkts(long ifHCInBroadcastPkts) {
        long oldValue = getIfHCInBroadcastPkts();
        this.ifHCInBroadcastPkts = ifHCInBroadcastPkts;
        notifyChange(9, oldValue, ifHCInBroadcastPkts);
    }

    public long getIfHCOutOctets() {
        return this.ifHCOutOctets;
    }

    public void setIfHCOutOctets(long ifHCOutOctets) {
        long oldValue = getIfHCOutOctets();
        this.ifHCOutOctets = ifHCOutOctets;
        notifyChange(10, oldValue, ifHCOutOctets);
    }

    public long getIfHCOutUcastPkts() {
        return this.ifHCOutUcastPkts;
    }

    public void setIfHCOutUcastPkts(long ifHCOutUcastPkts) {
        long oldValue = getIfHCOutUcastPkts();
        this.ifHCOutUcastPkts = ifHCOutUcastPkts;
        notifyChange(11, oldValue, ifHCOutUcastPkts);
    }

    public long getIfHCOutMulticastPkts() {
        return this.ifHCOutMulticastPkts;
    }

    public void setIfHCOutMulticastPkts(long ifHCOutMulticastPkts) {
        long oldValue = getIfHCOutMulticastPkts();
        this.ifHCOutMulticastPkts = ifHCOutMulticastPkts;
        notifyChange(12, oldValue, ifHCOutMulticastPkts);
    }

    public long getIfHCOutBroadcastPkts() {
        return this.ifHCOutBroadcastPkts;
    }

    public void setIfHCOutBroadcastPkts(long ifHCOutBroadcastPkts) {
        long oldValue = getIfHCOutBroadcastPkts();
        this.ifHCOutBroadcastPkts = ifHCOutBroadcastPkts;
        notifyChange(13, oldValue, ifHCOutBroadcastPkts);
    }

    public int getIfLinkUpDownTrapEnable() {
        return this.ifLinkUpDownTrapEnable;
    }

    public void setIfLinkUpDownTrapEnable(int ifLinkUpDownTrapEnable) {
        int oldValue = getIfLinkUpDownTrapEnable();
        this.ifLinkUpDownTrapEnable = ifLinkUpDownTrapEnable;
        notifyChange(14, oldValue, ifLinkUpDownTrapEnable);
    }

    public int getIfHighSpeed() {
        return this.ifHighSpeed;
    }

    public void setIfHighSpeed(int ifHighSpeed) {
        int oldValue = getIfHighSpeed();
        this.ifHighSpeed = ifHighSpeed;
        notifyChange(15, oldValue, ifHighSpeed);
    }

    public int getIfPromiscuousMode() {
        return this.ifPromiscuousMode;
    }

    public void setIfPromiscuousMode(int ifPromiscuousMode) {
        int oldValue = getIfPromiscuousMode();
        this.ifPromiscuousMode = ifPromiscuousMode;
        notifyChange(16, oldValue, ifPromiscuousMode);
    }

    public int getIfConnectorPresent() {
        return this.ifConnectorPresent;
    }

    public void setIfConnectorPresent(int ifConnectorPresent) {
        int oldValue = getIfConnectorPresent();
        this.ifConnectorPresent = ifConnectorPresent;
        notifyChange(17, oldValue, ifConnectorPresent);
    }

    public String getIfAlias() {
        return this.ifAlias;
    }

    public void setIfAlias(String ifAlias) {
        String oldValue = getIfAlias();
        this.ifAlias = ifAlias;
        notifyChange(18, oldValue, ifAlias);
    }

    public int getIfCounterDiscontinuityTime() {
        return this.ifCounterDiscontinuityTime;
    }

    public void setIfCounterDiscontinuityTime(int ifCounterDiscontinuityTime) {
        int oldValue = getIfCounterDiscontinuityTime();
        this.ifCounterDiscontinuityTime = ifCounterDiscontinuityTime;
        notifyChange(19, oldValue, ifCounterDiscontinuityTime);
    }

    public void set(VariableBinding binding) {
        switch (binding.getOid().get(10)) {
            case  1 :
                setIfName(binding.getVariable().toString());
                break;
            case  2 :
                setIfInMulticastPkts(binding.getVariable().toInt());
                break;
            case  3 :
                setIfInBroadcastPkts(binding.getVariable().toInt());
                break;
            case  4 :
                setIfOutMulticastPkts(binding.getVariable().toInt());
                break;
            case  5 :
                setIfOutBroadcastPkts(binding.getVariable().toInt());
                break;
            case  6 :
                setIfHCInOctets(binding.getVariable().toLong());
                break;
            case  7 :
                setIfHCInUcastPkts(binding.getVariable().toLong());
                break;
            case  8 :
                setIfHCInMulticastPkts(binding.getVariable().toLong());
                break;
            case  9 :
                setIfHCInBroadcastPkts(binding.getVariable().toLong());
                break;
            case  10 :
                setIfHCOutOctets(binding.getVariable().toLong());
                break;
            case  11 :
                setIfHCOutUcastPkts(binding.getVariable().toLong());
                break;
            case  12 :
                setIfHCOutMulticastPkts(binding.getVariable().toLong());
                break;
            case  13 :
                setIfHCOutBroadcastPkts(binding.getVariable().toLong());
                break;
            case  14 :
                setIfLinkUpDownTrapEnable(binding.getVariable().toInt());
                break;
            case  15 :
                setIfHighSpeed(binding.getVariable().toInt());
                break;
            case  16 :
                setIfPromiscuousMode(binding.getVariable().toInt());
                break;
            case  17 :
                setIfConnectorPresent(binding.getVariable().toInt());
                break;
            case  18 :
                setIfAlias(binding.getVariable().toString());
                break;
            case  19 :
                setIfCounterDiscontinuityTime(binding.getVariable().toInt());
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

    public void _setTable(IfXTable table) {
        this.parentEntity = table;
    }

    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE).append("ifName", ifName).append("ifInMulticastPkts", ifInMulticastPkts).append("ifInBroadcastPkts", ifInBroadcastPkts).append("ifOutMulticastPkts", ifOutMulticastPkts).append("ifOutBroadcastPkts", ifOutBroadcastPkts).append("ifHCInOctets", ifHCInOctets).append("ifHCInUcastPkts", ifHCInUcastPkts).append("ifHCInMulticastPkts", ifHCInMulticastPkts).append("ifHCInBroadcastPkts", ifHCInBroadcastPkts).append("ifHCOutOctets", ifHCOutOctets).append("ifHCOutUcastPkts", ifHCOutUcastPkts).append("ifHCOutMulticastPkts", ifHCOutMulticastPkts).append("ifHCOutBroadcastPkts", ifHCOutBroadcastPkts).append("ifLinkUpDownTrapEnable", ifLinkUpDownTrapEnable).append("ifHighSpeed", ifHighSpeed).append("ifPromiscuousMode", ifPromiscuousMode).append("ifConnectorPresent", ifConnectorPresent).append("ifAlias", ifAlias).append("ifCounterDiscontinuityTime", ifCounterDiscontinuityTime).append("_index", _index).toString();
    }

    public int hashCode() {
        return new HashCodeBuilder().append(ifName).append(ifInMulticastPkts).append(ifInBroadcastPkts).append(ifOutMulticastPkts).append(ifOutBroadcastPkts).append(ifHCInOctets).append(ifHCInUcastPkts).append(ifHCInMulticastPkts).append(ifHCInBroadcastPkts).append(ifHCOutOctets).append(ifHCOutUcastPkts).append(ifHCOutMulticastPkts).append(ifHCOutBroadcastPkts).append(ifLinkUpDownTrapEnable).append(ifHighSpeed).append(ifPromiscuousMode).append(ifConnectorPresent).append(ifAlias).append(ifCounterDiscontinuityTime).append(_index).toHashCode();
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
        IfXEntry rhs = ((IfXEntry) obj);
        return new EqualsBuilder().append(ifName, rhs.ifName).append(ifInMulticastPkts, rhs.ifInMulticastPkts).append(ifInBroadcastPkts, rhs.ifInBroadcastPkts).append(ifOutMulticastPkts, rhs.ifOutMulticastPkts).append(ifOutBroadcastPkts, rhs.ifOutBroadcastPkts).append(ifHCInOctets, rhs.ifHCInOctets).append(ifHCInUcastPkts, rhs.ifHCInUcastPkts).append(ifHCInMulticastPkts, rhs.ifHCInMulticastPkts).append(ifHCInBroadcastPkts, rhs.ifHCInBroadcastPkts).append(ifHCOutOctets, rhs.ifHCOutOctets).append(ifHCOutUcastPkts, rhs.ifHCOutUcastPkts).append(ifHCOutMulticastPkts, rhs.ifHCOutMulticastPkts).append(ifHCOutBroadcastPkts, rhs.ifHCOutBroadcastPkts).append(ifLinkUpDownTrapEnable, rhs.ifLinkUpDownTrapEnable).append(ifHighSpeed, rhs.ifHighSpeed).append(ifPromiscuousMode, rhs.ifPromiscuousMode).append(ifConnectorPresent, rhs.ifConnectorPresent).append(ifAlias, rhs.ifAlias).append(ifCounterDiscontinuityTime, rhs.ifCounterDiscontinuityTime).append(_index, rhs._index).isEquals();
    }

    public IfXEntry clone() {
        IfXEntry _copy = new IfXEntry();
        _copy.ifName = ifName;
        _copy.ifInMulticastPkts = ifInMulticastPkts;
        _copy.ifInBroadcastPkts = ifInBroadcastPkts;
        _copy.ifOutMulticastPkts = ifOutMulticastPkts;
        _copy.ifOutBroadcastPkts = ifOutBroadcastPkts;
        _copy.ifHCInOctets = ifHCInOctets;
        _copy.ifHCInUcastPkts = ifHCInUcastPkts;
        _copy.ifHCInMulticastPkts = ifHCInMulticastPkts;
        _copy.ifHCInBroadcastPkts = ifHCInBroadcastPkts;
        _copy.ifHCOutOctets = ifHCOutOctets;
        _copy.ifHCOutUcastPkts = ifHCOutUcastPkts;
        _copy.ifHCOutMulticastPkts = ifHCOutMulticastPkts;
        _copy.ifHCOutBroadcastPkts = ifHCOutBroadcastPkts;
        _copy.ifLinkUpDownTrapEnable = ifLinkUpDownTrapEnable;
        _copy.ifHighSpeed = ifHighSpeed;
        _copy.ifPromiscuousMode = ifPromiscuousMode;
        _copy.ifConnectorPresent = ifConnectorPresent;
        _copy.ifAlias = ifAlias;
        _copy.ifCounterDiscontinuityTime = ifCounterDiscontinuityTime;
        _copy._index = _index;
        _copy.parentEntity = parentEntity;
        return _copy;
    }

    private static DeviceEntityDescription createEntityDescription() {
        DeviceEntityDescription description = new DeviceEntityDescription(new OID("1.3.6.1.2.1.31.1.1.1"));
        description.addField(new DeviceEntityDescription.FieldDescription(1, "ifName", DeviceEntityDescription.FieldType.STRING, 255));
        description.addField(new DeviceEntityDescription.FieldDescription(2, "ifInMulticastPkts", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(3, "ifInBroadcastPkts", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(4, "ifOutMulticastPkts", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(5, "ifOutBroadcastPkts", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(6, "ifHCInOctets", DeviceEntityDescription.FieldType.UNSIGNED64, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(7, "ifHCInUcastPkts", DeviceEntityDescription.FieldType.UNSIGNED64, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(8, "ifHCInMulticastPkts", DeviceEntityDescription.FieldType.UNSIGNED64, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(9, "ifHCInBroadcastPkts", DeviceEntityDescription.FieldType.UNSIGNED64, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(10, "ifHCOutOctets", DeviceEntityDescription.FieldType.UNSIGNED64, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(11, "ifHCOutUcastPkts", DeviceEntityDescription.FieldType.UNSIGNED64, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(12, "ifHCOutMulticastPkts", DeviceEntityDescription.FieldType.UNSIGNED64, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(13, "ifHCOutBroadcastPkts", DeviceEntityDescription.FieldType.UNSIGNED64, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(14, "ifLinkUpDownTrapEnable", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(15, "ifHighSpeed", DeviceEntityDescription.FieldType.UNSIGNED32, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(16, "ifPromiscuousMode", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(17, "ifConnectorPresent", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(18, "ifAlias", DeviceEntityDescription.FieldType.STRING, 255));
        description.addField(new DeviceEntityDescription.FieldDescription(19, "ifCounterDiscontinuityTime", DeviceEntityDescription.FieldType.INTEGER, -1));
        return description;
    }

    public DeviceEntityDescription get_Description() {
        return _entityDescription;
    }

}
