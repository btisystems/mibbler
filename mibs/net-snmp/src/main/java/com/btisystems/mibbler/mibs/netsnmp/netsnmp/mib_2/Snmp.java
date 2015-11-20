
package com.btisystems.mibbler.mibs.netsnmp.netsnmp.mib_2;

import java.io.Serializable;
import com.btisystems.mibbler.mibs.netsnmp.interfaces.mib_2.ISnmp;
import com.btisystems.pronx.ems.core.model.AbstractRootEntity;
import com.btisystems.pronx.ems.core.model.DeviceEntity;
import com.btisystems.pronx.ems.core.model.DeviceEntityDescription;
import com.btisystems.pronx.ems.core.model.IVariableBindingSetter;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;
import org.snmp4j.smi.OID;
import org.snmp4j.smi.VariableBinding;

public class Snmp
    extends DeviceEntity
    implements Serializable, ISnmp, IVariableBindingSetter
{

    private int snmpInPkts;
    private int snmpOutPkts;
    private int snmpInBadVersions;
    private int snmpInBadCommunityNames;
    private int snmpInBadCommunityUses;
    private int snmpInASNParseErrs;
    private int snmpInTooBigs;
    private int snmpInNoSuchNames;
    private int snmpInBadValues;
    private int snmpInReadOnlys;
    private int snmpInGenErrs;
    private int snmpInTotalReqVars;
    private int snmpInTotalSetVars;
    private int snmpInGetRequests;
    private int snmpInGetNexts;
    private int snmpInSetRequests;
    private int snmpInGetResponses;
    private int snmpInTraps;
    private int snmpOutTooBigs;
    private int snmpOutNoSuchNames;
    private int snmpOutBadValues;
    private int snmpOutGenErrs;
    private int snmpOutGetRequests;
    private int snmpOutGetNexts;
    private int snmpOutSetRequests;
    private int snmpOutGetResponses;
    private int snmpOutTraps;
    private int snmpEnableAuthenTraps;
    private int snmpSilentDrops;
    private int snmpProxyDrops;
    private AbstractRootEntity parentEntity;
    private final static DeviceEntityDescription _entityDescription = createEntityDescription();

    public Snmp() {
    }

    public int getSnmpInPkts() {
        return this.snmpInPkts;
    }

    public void setSnmpInPkts(int snmpInPkts) {
        int oldValue = getSnmpInPkts();
        this.snmpInPkts = snmpInPkts;
        notifyChange(1, oldValue, snmpInPkts);
    }

    public int getSnmpOutPkts() {
        return this.snmpOutPkts;
    }

    public void setSnmpOutPkts(int snmpOutPkts) {
        int oldValue = getSnmpOutPkts();
        this.snmpOutPkts = snmpOutPkts;
        notifyChange(2, oldValue, snmpOutPkts);
    }

    public int getSnmpInBadVersions() {
        return this.snmpInBadVersions;
    }

    public void setSnmpInBadVersions(int snmpInBadVersions) {
        int oldValue = getSnmpInBadVersions();
        this.snmpInBadVersions = snmpInBadVersions;
        notifyChange(3, oldValue, snmpInBadVersions);
    }

    public int getSnmpInBadCommunityNames() {
        return this.snmpInBadCommunityNames;
    }

    public void setSnmpInBadCommunityNames(int snmpInBadCommunityNames) {
        int oldValue = getSnmpInBadCommunityNames();
        this.snmpInBadCommunityNames = snmpInBadCommunityNames;
        notifyChange(4, oldValue, snmpInBadCommunityNames);
    }

    public int getSnmpInBadCommunityUses() {
        return this.snmpInBadCommunityUses;
    }

    public void setSnmpInBadCommunityUses(int snmpInBadCommunityUses) {
        int oldValue = getSnmpInBadCommunityUses();
        this.snmpInBadCommunityUses = snmpInBadCommunityUses;
        notifyChange(5, oldValue, snmpInBadCommunityUses);
    }

    public int getSnmpInASNParseErrs() {
        return this.snmpInASNParseErrs;
    }

    public void setSnmpInASNParseErrs(int snmpInASNParseErrs) {
        int oldValue = getSnmpInASNParseErrs();
        this.snmpInASNParseErrs = snmpInASNParseErrs;
        notifyChange(6, oldValue, snmpInASNParseErrs);
    }

    public int getSnmpInTooBigs() {
        return this.snmpInTooBigs;
    }

    public void setSnmpInTooBigs(int snmpInTooBigs) {
        int oldValue = getSnmpInTooBigs();
        this.snmpInTooBigs = snmpInTooBigs;
        notifyChange(8, oldValue, snmpInTooBigs);
    }

    public int getSnmpInNoSuchNames() {
        return this.snmpInNoSuchNames;
    }

    public void setSnmpInNoSuchNames(int snmpInNoSuchNames) {
        int oldValue = getSnmpInNoSuchNames();
        this.snmpInNoSuchNames = snmpInNoSuchNames;
        notifyChange(9, oldValue, snmpInNoSuchNames);
    }

    public int getSnmpInBadValues() {
        return this.snmpInBadValues;
    }

    public void setSnmpInBadValues(int snmpInBadValues) {
        int oldValue = getSnmpInBadValues();
        this.snmpInBadValues = snmpInBadValues;
        notifyChange(10, oldValue, snmpInBadValues);
    }

    public int getSnmpInReadOnlys() {
        return this.snmpInReadOnlys;
    }

    public void setSnmpInReadOnlys(int snmpInReadOnlys) {
        int oldValue = getSnmpInReadOnlys();
        this.snmpInReadOnlys = snmpInReadOnlys;
        notifyChange(11, oldValue, snmpInReadOnlys);
    }

    public int getSnmpInGenErrs() {
        return this.snmpInGenErrs;
    }

    public void setSnmpInGenErrs(int snmpInGenErrs) {
        int oldValue = getSnmpInGenErrs();
        this.snmpInGenErrs = snmpInGenErrs;
        notifyChange(12, oldValue, snmpInGenErrs);
    }

    public int getSnmpInTotalReqVars() {
        return this.snmpInTotalReqVars;
    }

    public void setSnmpInTotalReqVars(int snmpInTotalReqVars) {
        int oldValue = getSnmpInTotalReqVars();
        this.snmpInTotalReqVars = snmpInTotalReqVars;
        notifyChange(13, oldValue, snmpInTotalReqVars);
    }

    public int getSnmpInTotalSetVars() {
        return this.snmpInTotalSetVars;
    }

    public void setSnmpInTotalSetVars(int snmpInTotalSetVars) {
        int oldValue = getSnmpInTotalSetVars();
        this.snmpInTotalSetVars = snmpInTotalSetVars;
        notifyChange(14, oldValue, snmpInTotalSetVars);
    }

    public int getSnmpInGetRequests() {
        return this.snmpInGetRequests;
    }

    public void setSnmpInGetRequests(int snmpInGetRequests) {
        int oldValue = getSnmpInGetRequests();
        this.snmpInGetRequests = snmpInGetRequests;
        notifyChange(15, oldValue, snmpInGetRequests);
    }

    public int getSnmpInGetNexts() {
        return this.snmpInGetNexts;
    }

    public void setSnmpInGetNexts(int snmpInGetNexts) {
        int oldValue = getSnmpInGetNexts();
        this.snmpInGetNexts = snmpInGetNexts;
        notifyChange(16, oldValue, snmpInGetNexts);
    }

    public int getSnmpInSetRequests() {
        return this.snmpInSetRequests;
    }

    public void setSnmpInSetRequests(int snmpInSetRequests) {
        int oldValue = getSnmpInSetRequests();
        this.snmpInSetRequests = snmpInSetRequests;
        notifyChange(17, oldValue, snmpInSetRequests);
    }

    public int getSnmpInGetResponses() {
        return this.snmpInGetResponses;
    }

    public void setSnmpInGetResponses(int snmpInGetResponses) {
        int oldValue = getSnmpInGetResponses();
        this.snmpInGetResponses = snmpInGetResponses;
        notifyChange(18, oldValue, snmpInGetResponses);
    }

    public int getSnmpInTraps() {
        return this.snmpInTraps;
    }

    public void setSnmpInTraps(int snmpInTraps) {
        int oldValue = getSnmpInTraps();
        this.snmpInTraps = snmpInTraps;
        notifyChange(19, oldValue, snmpInTraps);
    }

    public int getSnmpOutTooBigs() {
        return this.snmpOutTooBigs;
    }

    public void setSnmpOutTooBigs(int snmpOutTooBigs) {
        int oldValue = getSnmpOutTooBigs();
        this.snmpOutTooBigs = snmpOutTooBigs;
        notifyChange(20, oldValue, snmpOutTooBigs);
    }

    public int getSnmpOutNoSuchNames() {
        return this.snmpOutNoSuchNames;
    }

    public void setSnmpOutNoSuchNames(int snmpOutNoSuchNames) {
        int oldValue = getSnmpOutNoSuchNames();
        this.snmpOutNoSuchNames = snmpOutNoSuchNames;
        notifyChange(21, oldValue, snmpOutNoSuchNames);
    }

    public int getSnmpOutBadValues() {
        return this.snmpOutBadValues;
    }

    public void setSnmpOutBadValues(int snmpOutBadValues) {
        int oldValue = getSnmpOutBadValues();
        this.snmpOutBadValues = snmpOutBadValues;
        notifyChange(22, oldValue, snmpOutBadValues);
    }

    public int getSnmpOutGenErrs() {
        return this.snmpOutGenErrs;
    }

    public void setSnmpOutGenErrs(int snmpOutGenErrs) {
        int oldValue = getSnmpOutGenErrs();
        this.snmpOutGenErrs = snmpOutGenErrs;
        notifyChange(24, oldValue, snmpOutGenErrs);
    }

    public int getSnmpOutGetRequests() {
        return this.snmpOutGetRequests;
    }

    public void setSnmpOutGetRequests(int snmpOutGetRequests) {
        int oldValue = getSnmpOutGetRequests();
        this.snmpOutGetRequests = snmpOutGetRequests;
        notifyChange(25, oldValue, snmpOutGetRequests);
    }

    public int getSnmpOutGetNexts() {
        return this.snmpOutGetNexts;
    }

    public void setSnmpOutGetNexts(int snmpOutGetNexts) {
        int oldValue = getSnmpOutGetNexts();
        this.snmpOutGetNexts = snmpOutGetNexts;
        notifyChange(26, oldValue, snmpOutGetNexts);
    }

    public int getSnmpOutSetRequests() {
        return this.snmpOutSetRequests;
    }

    public void setSnmpOutSetRequests(int snmpOutSetRequests) {
        int oldValue = getSnmpOutSetRequests();
        this.snmpOutSetRequests = snmpOutSetRequests;
        notifyChange(27, oldValue, snmpOutSetRequests);
    }

    public int getSnmpOutGetResponses() {
        return this.snmpOutGetResponses;
    }

    public void setSnmpOutGetResponses(int snmpOutGetResponses) {
        int oldValue = getSnmpOutGetResponses();
        this.snmpOutGetResponses = snmpOutGetResponses;
        notifyChange(28, oldValue, snmpOutGetResponses);
    }

    public int getSnmpOutTraps() {
        return this.snmpOutTraps;
    }

    public void setSnmpOutTraps(int snmpOutTraps) {
        int oldValue = getSnmpOutTraps();
        this.snmpOutTraps = snmpOutTraps;
        notifyChange(29, oldValue, snmpOutTraps);
    }

    public int getSnmpEnableAuthenTraps() {
        return this.snmpEnableAuthenTraps;
    }

    public void setSnmpEnableAuthenTraps(int snmpEnableAuthenTraps) {
        int oldValue = getSnmpEnableAuthenTraps();
        this.snmpEnableAuthenTraps = snmpEnableAuthenTraps;
        notifyChange(30, oldValue, snmpEnableAuthenTraps);
    }

    public int getSnmpSilentDrops() {
        return this.snmpSilentDrops;
    }

    public void setSnmpSilentDrops(int snmpSilentDrops) {
        int oldValue = getSnmpSilentDrops();
        this.snmpSilentDrops = snmpSilentDrops;
        notifyChange(31, oldValue, snmpSilentDrops);
    }

    public int getSnmpProxyDrops() {
        return this.snmpProxyDrops;
    }

    public void setSnmpProxyDrops(int snmpProxyDrops) {
        int oldValue = getSnmpProxyDrops();
        this.snmpProxyDrops = snmpProxyDrops;
        notifyChange(32, oldValue, snmpProxyDrops);
    }

    public void set(VariableBinding binding) {
        switch (binding.getOid().get(7)) {
            case  1 :
                setSnmpInPkts(binding.getVariable().toInt());
                break;
            case  2 :
                setSnmpOutPkts(binding.getVariable().toInt());
                break;
            case  3 :
                setSnmpInBadVersions(binding.getVariable().toInt());
                break;
            case  4 :
                setSnmpInBadCommunityNames(binding.getVariable().toInt());
                break;
            case  5 :
                setSnmpInBadCommunityUses(binding.getVariable().toInt());
                break;
            case  6 :
                setSnmpInASNParseErrs(binding.getVariable().toInt());
                break;
            case  8 :
                setSnmpInTooBigs(binding.getVariable().toInt());
                break;
            case  9 :
                setSnmpInNoSuchNames(binding.getVariable().toInt());
                break;
            case  10 :
                setSnmpInBadValues(binding.getVariable().toInt());
                break;
            case  11 :
                setSnmpInReadOnlys(binding.getVariable().toInt());
                break;
            case  12 :
                setSnmpInGenErrs(binding.getVariable().toInt());
                break;
            case  13 :
                setSnmpInTotalReqVars(binding.getVariable().toInt());
                break;
            case  14 :
                setSnmpInTotalSetVars(binding.getVariable().toInt());
                break;
            case  15 :
                setSnmpInGetRequests(binding.getVariable().toInt());
                break;
            case  16 :
                setSnmpInGetNexts(binding.getVariable().toInt());
                break;
            case  17 :
                setSnmpInSetRequests(binding.getVariable().toInt());
                break;
            case  18 :
                setSnmpInGetResponses(binding.getVariable().toInt());
                break;
            case  19 :
                setSnmpInTraps(binding.getVariable().toInt());
                break;
            case  20 :
                setSnmpOutTooBigs(binding.getVariable().toInt());
                break;
            case  21 :
                setSnmpOutNoSuchNames(binding.getVariable().toInt());
                break;
            case  22 :
                setSnmpOutBadValues(binding.getVariable().toInt());
                break;
            case  24 :
                setSnmpOutGenErrs(binding.getVariable().toInt());
                break;
            case  25 :
                setSnmpOutGetRequests(binding.getVariable().toInt());
                break;
            case  26 :
                setSnmpOutGetNexts(binding.getVariable().toInt());
                break;
            case  27 :
                setSnmpOutSetRequests(binding.getVariable().toInt());
                break;
            case  28 :
                setSnmpOutGetResponses(binding.getVariable().toInt());
                break;
            case  29 :
                setSnmpOutTraps(binding.getVariable().toInt());
                break;
            case  30 :
                setSnmpEnableAuthenTraps(binding.getVariable().toInt());
                break;
            case  31 :
                setSnmpSilentDrops(binding.getVariable().toInt());
                break;
            case  32 :
                setSnmpProxyDrops(binding.getVariable().toInt());
                break;
        }
    }

    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE).append("snmpInPkts", snmpInPkts).append("snmpOutPkts", snmpOutPkts).append("snmpInBadVersions", snmpInBadVersions).append("snmpInBadCommunityNames", snmpInBadCommunityNames).append("snmpInBadCommunityUses", snmpInBadCommunityUses).append("snmpInASNParseErrs", snmpInASNParseErrs).append("snmpInTooBigs", snmpInTooBigs).append("snmpInNoSuchNames", snmpInNoSuchNames).append("snmpInBadValues", snmpInBadValues).append("snmpInReadOnlys", snmpInReadOnlys).append("snmpInGenErrs", snmpInGenErrs).append("snmpInTotalReqVars", snmpInTotalReqVars).append("snmpInTotalSetVars", snmpInTotalSetVars).append("snmpInGetRequests", snmpInGetRequests).append("snmpInGetNexts", snmpInGetNexts).append("snmpInSetRequests", snmpInSetRequests).append("snmpInGetResponses", snmpInGetResponses).append("snmpInTraps", snmpInTraps).append("snmpOutTooBigs", snmpOutTooBigs).append("snmpOutNoSuchNames", snmpOutNoSuchNames).append("snmpOutBadValues", snmpOutBadValues).append("snmpOutGenErrs", snmpOutGenErrs).append("snmpOutGetRequests", snmpOutGetRequests).append("snmpOutGetNexts", snmpOutGetNexts).append("snmpOutSetRequests", snmpOutSetRequests).append("snmpOutGetResponses", snmpOutGetResponses).append("snmpOutTraps", snmpOutTraps).append("snmpEnableAuthenTraps", snmpEnableAuthenTraps).append("snmpSilentDrops", snmpSilentDrops).append("snmpProxyDrops", snmpProxyDrops).toString();
    }

    public int hashCode() {
        return new HashCodeBuilder().append(snmpInPkts).append(snmpOutPkts).append(snmpInBadVersions).append(snmpInBadCommunityNames).append(snmpInBadCommunityUses).append(snmpInASNParseErrs).append(snmpInTooBigs).append(snmpInNoSuchNames).append(snmpInBadValues).append(snmpInReadOnlys).append(snmpInGenErrs).append(snmpInTotalReqVars).append(snmpInTotalSetVars).append(snmpInGetRequests).append(snmpInGetNexts).append(snmpInSetRequests).append(snmpInGetResponses).append(snmpInTraps).append(snmpOutTooBigs).append(snmpOutNoSuchNames).append(snmpOutBadValues).append(snmpOutGenErrs).append(snmpOutGetRequests).append(snmpOutGetNexts).append(snmpOutSetRequests).append(snmpOutGetResponses).append(snmpOutTraps).append(snmpEnableAuthenTraps).append(snmpSilentDrops).append(snmpProxyDrops).toHashCode();
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
        Snmp rhs = ((Snmp) obj);
        return new EqualsBuilder().append(snmpInPkts, rhs.snmpInPkts).append(snmpOutPkts, rhs.snmpOutPkts).append(snmpInBadVersions, rhs.snmpInBadVersions).append(snmpInBadCommunityNames, rhs.snmpInBadCommunityNames).append(snmpInBadCommunityUses, rhs.snmpInBadCommunityUses).append(snmpInASNParseErrs, rhs.snmpInASNParseErrs).append(snmpInTooBigs, rhs.snmpInTooBigs).append(snmpInNoSuchNames, rhs.snmpInNoSuchNames).append(snmpInBadValues, rhs.snmpInBadValues).append(snmpInReadOnlys, rhs.snmpInReadOnlys).append(snmpInGenErrs, rhs.snmpInGenErrs).append(snmpInTotalReqVars, rhs.snmpInTotalReqVars).append(snmpInTotalSetVars, rhs.snmpInTotalSetVars).append(snmpInGetRequests, rhs.snmpInGetRequests).append(snmpInGetNexts, rhs.snmpInGetNexts).append(snmpInSetRequests, rhs.snmpInSetRequests).append(snmpInGetResponses, rhs.snmpInGetResponses).append(snmpInTraps, rhs.snmpInTraps).append(snmpOutTooBigs, rhs.snmpOutTooBigs).append(snmpOutNoSuchNames, rhs.snmpOutNoSuchNames).append(snmpOutBadValues, rhs.snmpOutBadValues).append(snmpOutGenErrs, rhs.snmpOutGenErrs).append(snmpOutGetRequests, rhs.snmpOutGetRequests).append(snmpOutGetNexts, rhs.snmpOutGetNexts).append(snmpOutSetRequests, rhs.snmpOutSetRequests).append(snmpOutGetResponses, rhs.snmpOutGetResponses).append(snmpOutTraps, rhs.snmpOutTraps).append(snmpEnableAuthenTraps, rhs.snmpEnableAuthenTraps).append(snmpSilentDrops, rhs.snmpSilentDrops).append(snmpProxyDrops, rhs.snmpProxyDrops).isEquals();
    }

    public Snmp clone() {
        Snmp _copy = new Snmp();
        _copy.snmpInPkts = snmpInPkts;
        _copy.snmpOutPkts = snmpOutPkts;
        _copy.snmpInBadVersions = snmpInBadVersions;
        _copy.snmpInBadCommunityNames = snmpInBadCommunityNames;
        _copy.snmpInBadCommunityUses = snmpInBadCommunityUses;
        _copy.snmpInASNParseErrs = snmpInASNParseErrs;
        _copy.snmpInTooBigs = snmpInTooBigs;
        _copy.snmpInNoSuchNames = snmpInNoSuchNames;
        _copy.snmpInBadValues = snmpInBadValues;
        _copy.snmpInReadOnlys = snmpInReadOnlys;
        _copy.snmpInGenErrs = snmpInGenErrs;
        _copy.snmpInTotalReqVars = snmpInTotalReqVars;
        _copy.snmpInTotalSetVars = snmpInTotalSetVars;
        _copy.snmpInGetRequests = snmpInGetRequests;
        _copy.snmpInGetNexts = snmpInGetNexts;
        _copy.snmpInSetRequests = snmpInSetRequests;
        _copy.snmpInGetResponses = snmpInGetResponses;
        _copy.snmpInTraps = snmpInTraps;
        _copy.snmpOutTooBigs = snmpOutTooBigs;
        _copy.snmpOutNoSuchNames = snmpOutNoSuchNames;
        _copy.snmpOutBadValues = snmpOutBadValues;
        _copy.snmpOutGenErrs = snmpOutGenErrs;
        _copy.snmpOutGetRequests = snmpOutGetRequests;
        _copy.snmpOutGetNexts = snmpOutGetNexts;
        _copy.snmpOutSetRequests = snmpOutSetRequests;
        _copy.snmpOutGetResponses = snmpOutGetResponses;
        _copy.snmpOutTraps = snmpOutTraps;
        _copy.snmpEnableAuthenTraps = snmpEnableAuthenTraps;
        _copy.snmpSilentDrops = snmpSilentDrops;
        _copy.snmpProxyDrops = snmpProxyDrops;
        return _copy;
    }

    public void set_ParentEntity(AbstractRootEntity parent) {
        parentEntity = parent;
    }

    private static DeviceEntityDescription createEntityDescription() {
        DeviceEntityDescription description = new DeviceEntityDescription(new OID("1.3.6.1.2.1.11"));
        description.addField(new DeviceEntityDescription.FieldDescription(1, "snmpInPkts", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(2, "snmpOutPkts", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(3, "snmpInBadVersions", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(4, "snmpInBadCommunityNames", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(5, "snmpInBadCommunityUses", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(6, "snmpInASNParseErrs", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(8, "snmpInTooBigs", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(9, "snmpInNoSuchNames", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(10, "snmpInBadValues", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(11, "snmpInReadOnlys", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(12, "snmpInGenErrs", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(13, "snmpInTotalReqVars", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(14, "snmpInTotalSetVars", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(15, "snmpInGetRequests", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(16, "snmpInGetNexts", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(17, "snmpInSetRequests", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(18, "snmpInGetResponses", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(19, "snmpInTraps", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(20, "snmpOutTooBigs", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(21, "snmpOutNoSuchNames", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(22, "snmpOutBadValues", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(24, "snmpOutGenErrs", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(25, "snmpOutGetRequests", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(26, "snmpOutGetNexts", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(27, "snmpOutSetRequests", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(28, "snmpOutGetResponses", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(29, "snmpOutTraps", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(30, "snmpEnableAuthenTraps", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(31, "snmpSilentDrops", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(32, "snmpProxyDrops", DeviceEntityDescription.FieldType.INTEGER, -1));
        return description;
    }

    public DeviceEntityDescription get_Description() {
        return _entityDescription;
    }

}
