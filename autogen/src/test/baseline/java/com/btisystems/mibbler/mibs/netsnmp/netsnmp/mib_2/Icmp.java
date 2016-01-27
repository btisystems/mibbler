
package com.btisystems.mibbler.mibs.netsnmp.netsnmp.mib_2;

import java.io.Serializable;
import com.btisystems.mibbler.mibs.netsnmp.interfaces.mib_2.IIcmp;
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

public class Icmp
    extends DeviceEntity
    implements Serializable, IIcmp, IVariableBindingSetter
{

    private int icmpInMsgs;
    private int icmpInErrors;
    private int icmpInDestUnreachs;
    private int icmpInTimeExcds;
    private int icmpInParmProbs;
    private int icmpInSrcQuenchs;
    private int icmpInRedirects;
    private int icmpInEchos;
    private int icmpInEchoReps;
    private int icmpInTimestamps;
    private int icmpInTimestampReps;
    private int icmpInAddrMasks;
    private int icmpInAddrMaskReps;
    private int icmpOutMsgs;
    private int icmpOutErrors;
    private int icmpOutDestUnreachs;
    private int icmpOutTimeExcds;
    private int icmpOutParmProbs;
    private int icmpOutSrcQuenchs;
    private int icmpOutRedirects;
    private int icmpOutEchos;
    private int icmpOutEchoReps;
    private int icmpOutTimestamps;
    private int icmpOutTimestampReps;
    private int icmpOutAddrMasks;
    private int icmpOutAddrMaskReps;
    private AbstractRootEntity parentEntity;
    private final static DeviceEntityDescription _entityDescription = createEntityDescription();

    public Icmp() {
    }

    public int getIcmpInMsgs() {
        return this.icmpInMsgs;
    }

    public void setIcmpInMsgs(int icmpInMsgs) {
        int oldValue = getIcmpInMsgs();
        this.icmpInMsgs = icmpInMsgs;
        notifyChange(1, oldValue, icmpInMsgs);
    }

    public int getIcmpInErrors() {
        return this.icmpInErrors;
    }

    public void setIcmpInErrors(int icmpInErrors) {
        int oldValue = getIcmpInErrors();
        this.icmpInErrors = icmpInErrors;
        notifyChange(2, oldValue, icmpInErrors);
    }

    public int getIcmpInDestUnreachs() {
        return this.icmpInDestUnreachs;
    }

    public void setIcmpInDestUnreachs(int icmpInDestUnreachs) {
        int oldValue = getIcmpInDestUnreachs();
        this.icmpInDestUnreachs = icmpInDestUnreachs;
        notifyChange(3, oldValue, icmpInDestUnreachs);
    }

    public int getIcmpInTimeExcds() {
        return this.icmpInTimeExcds;
    }

    public void setIcmpInTimeExcds(int icmpInTimeExcds) {
        int oldValue = getIcmpInTimeExcds();
        this.icmpInTimeExcds = icmpInTimeExcds;
        notifyChange(4, oldValue, icmpInTimeExcds);
    }

    public int getIcmpInParmProbs() {
        return this.icmpInParmProbs;
    }

    public void setIcmpInParmProbs(int icmpInParmProbs) {
        int oldValue = getIcmpInParmProbs();
        this.icmpInParmProbs = icmpInParmProbs;
        notifyChange(5, oldValue, icmpInParmProbs);
    }

    public int getIcmpInSrcQuenchs() {
        return this.icmpInSrcQuenchs;
    }

    public void setIcmpInSrcQuenchs(int icmpInSrcQuenchs) {
        int oldValue = getIcmpInSrcQuenchs();
        this.icmpInSrcQuenchs = icmpInSrcQuenchs;
        notifyChange(6, oldValue, icmpInSrcQuenchs);
    }

    public int getIcmpInRedirects() {
        return this.icmpInRedirects;
    }

    public void setIcmpInRedirects(int icmpInRedirects) {
        int oldValue = getIcmpInRedirects();
        this.icmpInRedirects = icmpInRedirects;
        notifyChange(7, oldValue, icmpInRedirects);
    }

    public int getIcmpInEchos() {
        return this.icmpInEchos;
    }

    public void setIcmpInEchos(int icmpInEchos) {
        int oldValue = getIcmpInEchos();
        this.icmpInEchos = icmpInEchos;
        notifyChange(8, oldValue, icmpInEchos);
    }

    public int getIcmpInEchoReps() {
        return this.icmpInEchoReps;
    }

    public void setIcmpInEchoReps(int icmpInEchoReps) {
        int oldValue = getIcmpInEchoReps();
        this.icmpInEchoReps = icmpInEchoReps;
        notifyChange(9, oldValue, icmpInEchoReps);
    }

    public int getIcmpInTimestamps() {
        return this.icmpInTimestamps;
    }

    public void setIcmpInTimestamps(int icmpInTimestamps) {
        int oldValue = getIcmpInTimestamps();
        this.icmpInTimestamps = icmpInTimestamps;
        notifyChange(10, oldValue, icmpInTimestamps);
    }

    public int getIcmpInTimestampReps() {
        return this.icmpInTimestampReps;
    }

    public void setIcmpInTimestampReps(int icmpInTimestampReps) {
        int oldValue = getIcmpInTimestampReps();
        this.icmpInTimestampReps = icmpInTimestampReps;
        notifyChange(11, oldValue, icmpInTimestampReps);
    }

    public int getIcmpInAddrMasks() {
        return this.icmpInAddrMasks;
    }

    public void setIcmpInAddrMasks(int icmpInAddrMasks) {
        int oldValue = getIcmpInAddrMasks();
        this.icmpInAddrMasks = icmpInAddrMasks;
        notifyChange(12, oldValue, icmpInAddrMasks);
    }

    public int getIcmpInAddrMaskReps() {
        return this.icmpInAddrMaskReps;
    }

    public void setIcmpInAddrMaskReps(int icmpInAddrMaskReps) {
        int oldValue = getIcmpInAddrMaskReps();
        this.icmpInAddrMaskReps = icmpInAddrMaskReps;
        notifyChange(13, oldValue, icmpInAddrMaskReps);
    }

    public int getIcmpOutMsgs() {
        return this.icmpOutMsgs;
    }

    public void setIcmpOutMsgs(int icmpOutMsgs) {
        int oldValue = getIcmpOutMsgs();
        this.icmpOutMsgs = icmpOutMsgs;
        notifyChange(14, oldValue, icmpOutMsgs);
    }

    public int getIcmpOutErrors() {
        return this.icmpOutErrors;
    }

    public void setIcmpOutErrors(int icmpOutErrors) {
        int oldValue = getIcmpOutErrors();
        this.icmpOutErrors = icmpOutErrors;
        notifyChange(15, oldValue, icmpOutErrors);
    }

    public int getIcmpOutDestUnreachs() {
        return this.icmpOutDestUnreachs;
    }

    public void setIcmpOutDestUnreachs(int icmpOutDestUnreachs) {
        int oldValue = getIcmpOutDestUnreachs();
        this.icmpOutDestUnreachs = icmpOutDestUnreachs;
        notifyChange(16, oldValue, icmpOutDestUnreachs);
    }

    public int getIcmpOutTimeExcds() {
        return this.icmpOutTimeExcds;
    }

    public void setIcmpOutTimeExcds(int icmpOutTimeExcds) {
        int oldValue = getIcmpOutTimeExcds();
        this.icmpOutTimeExcds = icmpOutTimeExcds;
        notifyChange(17, oldValue, icmpOutTimeExcds);
    }

    public int getIcmpOutParmProbs() {
        return this.icmpOutParmProbs;
    }

    public void setIcmpOutParmProbs(int icmpOutParmProbs) {
        int oldValue = getIcmpOutParmProbs();
        this.icmpOutParmProbs = icmpOutParmProbs;
        notifyChange(18, oldValue, icmpOutParmProbs);
    }

    public int getIcmpOutSrcQuenchs() {
        return this.icmpOutSrcQuenchs;
    }

    public void setIcmpOutSrcQuenchs(int icmpOutSrcQuenchs) {
        int oldValue = getIcmpOutSrcQuenchs();
        this.icmpOutSrcQuenchs = icmpOutSrcQuenchs;
        notifyChange(19, oldValue, icmpOutSrcQuenchs);
    }

    public int getIcmpOutRedirects() {
        return this.icmpOutRedirects;
    }

    public void setIcmpOutRedirects(int icmpOutRedirects) {
        int oldValue = getIcmpOutRedirects();
        this.icmpOutRedirects = icmpOutRedirects;
        notifyChange(20, oldValue, icmpOutRedirects);
    }

    public int getIcmpOutEchos() {
        return this.icmpOutEchos;
    }

    public void setIcmpOutEchos(int icmpOutEchos) {
        int oldValue = getIcmpOutEchos();
        this.icmpOutEchos = icmpOutEchos;
        notifyChange(21, oldValue, icmpOutEchos);
    }

    public int getIcmpOutEchoReps() {
        return this.icmpOutEchoReps;
    }

    public void setIcmpOutEchoReps(int icmpOutEchoReps) {
        int oldValue = getIcmpOutEchoReps();
        this.icmpOutEchoReps = icmpOutEchoReps;
        notifyChange(22, oldValue, icmpOutEchoReps);
    }

    public int getIcmpOutTimestamps() {
        return this.icmpOutTimestamps;
    }

    public void setIcmpOutTimestamps(int icmpOutTimestamps) {
        int oldValue = getIcmpOutTimestamps();
        this.icmpOutTimestamps = icmpOutTimestamps;
        notifyChange(23, oldValue, icmpOutTimestamps);
    }

    public int getIcmpOutTimestampReps() {
        return this.icmpOutTimestampReps;
    }

    public void setIcmpOutTimestampReps(int icmpOutTimestampReps) {
        int oldValue = getIcmpOutTimestampReps();
        this.icmpOutTimestampReps = icmpOutTimestampReps;
        notifyChange(24, oldValue, icmpOutTimestampReps);
    }

    public int getIcmpOutAddrMasks() {
        return this.icmpOutAddrMasks;
    }

    public void setIcmpOutAddrMasks(int icmpOutAddrMasks) {
        int oldValue = getIcmpOutAddrMasks();
        this.icmpOutAddrMasks = icmpOutAddrMasks;
        notifyChange(25, oldValue, icmpOutAddrMasks);
    }

    public int getIcmpOutAddrMaskReps() {
        return this.icmpOutAddrMaskReps;
    }

    public void setIcmpOutAddrMaskReps(int icmpOutAddrMaskReps) {
        int oldValue = getIcmpOutAddrMaskReps();
        this.icmpOutAddrMaskReps = icmpOutAddrMaskReps;
        notifyChange(26, oldValue, icmpOutAddrMaskReps);
    }

    public void set(VariableBinding binding) {
        switch (binding.getOid().get(7)) {
            case  1 :
                setIcmpInMsgs(binding.getVariable().toInt());
                break;
            case  2 :
                setIcmpInErrors(binding.getVariable().toInt());
                break;
            case  3 :
                setIcmpInDestUnreachs(binding.getVariable().toInt());
                break;
            case  4 :
                setIcmpInTimeExcds(binding.getVariable().toInt());
                break;
            case  5 :
                setIcmpInParmProbs(binding.getVariable().toInt());
                break;
            case  6 :
                setIcmpInSrcQuenchs(binding.getVariable().toInt());
                break;
            case  7 :
                setIcmpInRedirects(binding.getVariable().toInt());
                break;
            case  8 :
                setIcmpInEchos(binding.getVariable().toInt());
                break;
            case  9 :
                setIcmpInEchoReps(binding.getVariable().toInt());
                break;
            case  10 :
                setIcmpInTimestamps(binding.getVariable().toInt());
                break;
            case  11 :
                setIcmpInTimestampReps(binding.getVariable().toInt());
                break;
            case  12 :
                setIcmpInAddrMasks(binding.getVariable().toInt());
                break;
            case  13 :
                setIcmpInAddrMaskReps(binding.getVariable().toInt());
                break;
            case  14 :
                setIcmpOutMsgs(binding.getVariable().toInt());
                break;
            case  15 :
                setIcmpOutErrors(binding.getVariable().toInt());
                break;
            case  16 :
                setIcmpOutDestUnreachs(binding.getVariable().toInt());
                break;
            case  17 :
                setIcmpOutTimeExcds(binding.getVariable().toInt());
                break;
            case  18 :
                setIcmpOutParmProbs(binding.getVariable().toInt());
                break;
            case  19 :
                setIcmpOutSrcQuenchs(binding.getVariable().toInt());
                break;
            case  20 :
                setIcmpOutRedirects(binding.getVariable().toInt());
                break;
            case  21 :
                setIcmpOutEchos(binding.getVariable().toInt());
                break;
            case  22 :
                setIcmpOutEchoReps(binding.getVariable().toInt());
                break;
            case  23 :
                setIcmpOutTimestamps(binding.getVariable().toInt());
                break;
            case  24 :
                setIcmpOutTimestampReps(binding.getVariable().toInt());
                break;
            case  25 :
                setIcmpOutAddrMasks(binding.getVariable().toInt());
                break;
            case  26 :
                setIcmpOutAddrMaskReps(binding.getVariable().toInt());
                break;
        }
    }

    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE).append("icmpInMsgs", icmpInMsgs).append("icmpInErrors", icmpInErrors).append("icmpInDestUnreachs", icmpInDestUnreachs).append("icmpInTimeExcds", icmpInTimeExcds).append("icmpInParmProbs", icmpInParmProbs).append("icmpInSrcQuenchs", icmpInSrcQuenchs).append("icmpInRedirects", icmpInRedirects).append("icmpInEchos", icmpInEchos).append("icmpInEchoReps", icmpInEchoReps).append("icmpInTimestamps", icmpInTimestamps).append("icmpInTimestampReps", icmpInTimestampReps).append("icmpInAddrMasks", icmpInAddrMasks).append("icmpInAddrMaskReps", icmpInAddrMaskReps).append("icmpOutMsgs", icmpOutMsgs).append("icmpOutErrors", icmpOutErrors).append("icmpOutDestUnreachs", icmpOutDestUnreachs).append("icmpOutTimeExcds", icmpOutTimeExcds).append("icmpOutParmProbs", icmpOutParmProbs).append("icmpOutSrcQuenchs", icmpOutSrcQuenchs).append("icmpOutRedirects", icmpOutRedirects).append("icmpOutEchos", icmpOutEchos).append("icmpOutEchoReps", icmpOutEchoReps).append("icmpOutTimestamps", icmpOutTimestamps).append("icmpOutTimestampReps", icmpOutTimestampReps).append("icmpOutAddrMasks", icmpOutAddrMasks).append("icmpOutAddrMaskReps", icmpOutAddrMaskReps).toString();
    }

    public int hashCode() {
        return new HashCodeBuilder().append(icmpInMsgs).append(icmpInErrors).append(icmpInDestUnreachs).append(icmpInTimeExcds).append(icmpInParmProbs).append(icmpInSrcQuenchs).append(icmpInRedirects).append(icmpInEchos).append(icmpInEchoReps).append(icmpInTimestamps).append(icmpInTimestampReps).append(icmpInAddrMasks).append(icmpInAddrMaskReps).append(icmpOutMsgs).append(icmpOutErrors).append(icmpOutDestUnreachs).append(icmpOutTimeExcds).append(icmpOutParmProbs).append(icmpOutSrcQuenchs).append(icmpOutRedirects).append(icmpOutEchos).append(icmpOutEchoReps).append(icmpOutTimestamps).append(icmpOutTimestampReps).append(icmpOutAddrMasks).append(icmpOutAddrMaskReps).toHashCode();
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
        Icmp rhs = ((Icmp) obj);
        return new EqualsBuilder().append(icmpInMsgs, rhs.icmpInMsgs).append(icmpInErrors, rhs.icmpInErrors).append(icmpInDestUnreachs, rhs.icmpInDestUnreachs).append(icmpInTimeExcds, rhs.icmpInTimeExcds).append(icmpInParmProbs, rhs.icmpInParmProbs).append(icmpInSrcQuenchs, rhs.icmpInSrcQuenchs).append(icmpInRedirects, rhs.icmpInRedirects).append(icmpInEchos, rhs.icmpInEchos).append(icmpInEchoReps, rhs.icmpInEchoReps).append(icmpInTimestamps, rhs.icmpInTimestamps).append(icmpInTimestampReps, rhs.icmpInTimestampReps).append(icmpInAddrMasks, rhs.icmpInAddrMasks).append(icmpInAddrMaskReps, rhs.icmpInAddrMaskReps).append(icmpOutMsgs, rhs.icmpOutMsgs).append(icmpOutErrors, rhs.icmpOutErrors).append(icmpOutDestUnreachs, rhs.icmpOutDestUnreachs).append(icmpOutTimeExcds, rhs.icmpOutTimeExcds).append(icmpOutParmProbs, rhs.icmpOutParmProbs).append(icmpOutSrcQuenchs, rhs.icmpOutSrcQuenchs).append(icmpOutRedirects, rhs.icmpOutRedirects).append(icmpOutEchos, rhs.icmpOutEchos).append(icmpOutEchoReps, rhs.icmpOutEchoReps).append(icmpOutTimestamps, rhs.icmpOutTimestamps).append(icmpOutTimestampReps, rhs.icmpOutTimestampReps).append(icmpOutAddrMasks, rhs.icmpOutAddrMasks).append(icmpOutAddrMaskReps, rhs.icmpOutAddrMaskReps).isEquals();
    }

    public Icmp clone() {
        Icmp _copy = new Icmp();
        _copy.icmpInMsgs = icmpInMsgs;
        _copy.icmpInErrors = icmpInErrors;
        _copy.icmpInDestUnreachs = icmpInDestUnreachs;
        _copy.icmpInTimeExcds = icmpInTimeExcds;
        _copy.icmpInParmProbs = icmpInParmProbs;
        _copy.icmpInSrcQuenchs = icmpInSrcQuenchs;
        _copy.icmpInRedirects = icmpInRedirects;
        _copy.icmpInEchos = icmpInEchos;
        _copy.icmpInEchoReps = icmpInEchoReps;
        _copy.icmpInTimestamps = icmpInTimestamps;
        _copy.icmpInTimestampReps = icmpInTimestampReps;
        _copy.icmpInAddrMasks = icmpInAddrMasks;
        _copy.icmpInAddrMaskReps = icmpInAddrMaskReps;
        _copy.icmpOutMsgs = icmpOutMsgs;
        _copy.icmpOutErrors = icmpOutErrors;
        _copy.icmpOutDestUnreachs = icmpOutDestUnreachs;
        _copy.icmpOutTimeExcds = icmpOutTimeExcds;
        _copy.icmpOutParmProbs = icmpOutParmProbs;
        _copy.icmpOutSrcQuenchs = icmpOutSrcQuenchs;
        _copy.icmpOutRedirects = icmpOutRedirects;
        _copy.icmpOutEchos = icmpOutEchos;
        _copy.icmpOutEchoReps = icmpOutEchoReps;
        _copy.icmpOutTimestamps = icmpOutTimestamps;
        _copy.icmpOutTimestampReps = icmpOutTimestampReps;
        _copy.icmpOutAddrMasks = icmpOutAddrMasks;
        _copy.icmpOutAddrMaskReps = icmpOutAddrMaskReps;
        return _copy;
    }

    public void set_ParentEntity(AbstractRootEntity parent) {
        parentEntity = parent;
    }

    private static DeviceEntityDescription createEntityDescription() {
        DeviceEntityDescription description = new DeviceEntityDescription(new OID("1.3.6.1.2.1.5"));
        description.addField(new DeviceEntityDescription.FieldDescription(1, "icmpInMsgs", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(2, "icmpInErrors", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(3, "icmpInDestUnreachs", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(4, "icmpInTimeExcds", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(5, "icmpInParmProbs", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(6, "icmpInSrcQuenchs", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(7, "icmpInRedirects", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(8, "icmpInEchos", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(9, "icmpInEchoReps", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(10, "icmpInTimestamps", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(11, "icmpInTimestampReps", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(12, "icmpInAddrMasks", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(13, "icmpInAddrMaskReps", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(14, "icmpOutMsgs", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(15, "icmpOutErrors", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(16, "icmpOutDestUnreachs", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(17, "icmpOutTimeExcds", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(18, "icmpOutParmProbs", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(19, "icmpOutSrcQuenchs", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(20, "icmpOutRedirects", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(21, "icmpOutEchos", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(22, "icmpOutEchoReps", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(23, "icmpOutTimestamps", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(24, "icmpOutTimestampReps", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(25, "icmpOutAddrMasks", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(26, "icmpOutAddrMaskReps", DeviceEntityDescription.FieldType.INTEGER, -1));
        return description;
    }

    public DeviceEntityDescription get_Description() {
        return _entityDescription;
    }

}
