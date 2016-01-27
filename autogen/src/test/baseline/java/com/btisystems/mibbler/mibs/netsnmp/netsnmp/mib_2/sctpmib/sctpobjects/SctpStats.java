
package com.btisystems.mibbler.mibs.netsnmp.netsnmp.mib_2.sctpmib.sctpobjects;

import java.io.Serializable;
import com.btisystems.mibbler.mibs.netsnmp.interfaces.mib_2.sctpmib.sctpobjects.ISctpStats;
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

public class SctpStats
    extends DeviceEntity
    implements Serializable, ISctpStats, IVariableBindingSetter
{

    private int sctpCurrEstab;
    private int sctpActiveEstabs;
    private int sctpPassiveEstabs;
    private int sctpAborteds;
    private int sctpShutdowns;
    private int sctpOutOfBlues;
    private int sctpChecksumErrors;
    private long sctpOutCtrlChunks;
    private long sctpOutOrderChunks;
    private long sctpOutUnorderChunks;
    private long sctpInCtrlChunks;
    private long sctpInOrderChunks;
    private long sctpInUnorderChunks;
    private long sctpFragUsrMsgs;
    private long sctpReasmUsrMsgs;
    private long sctpOutSCTPPacks;
    private long sctpInSCTPPacks;
    private int sctpDiscontinuityTime;
    private AbstractRootEntity parentEntity;
    private final static DeviceEntityDescription _entityDescription = createEntityDescription();

    public SctpStats() {
    }

    public int getSctpCurrEstab() {
        return this.sctpCurrEstab;
    }

    public void setSctpCurrEstab(int sctpCurrEstab) {
        int oldValue = getSctpCurrEstab();
        this.sctpCurrEstab = sctpCurrEstab;
        notifyChange(1, oldValue, sctpCurrEstab);
    }

    public int getSctpActiveEstabs() {
        return this.sctpActiveEstabs;
    }

    public void setSctpActiveEstabs(int sctpActiveEstabs) {
        int oldValue = getSctpActiveEstabs();
        this.sctpActiveEstabs = sctpActiveEstabs;
        notifyChange(2, oldValue, sctpActiveEstabs);
    }

    public int getSctpPassiveEstabs() {
        return this.sctpPassiveEstabs;
    }

    public void setSctpPassiveEstabs(int sctpPassiveEstabs) {
        int oldValue = getSctpPassiveEstabs();
        this.sctpPassiveEstabs = sctpPassiveEstabs;
        notifyChange(3, oldValue, sctpPassiveEstabs);
    }

    public int getSctpAborteds() {
        return this.sctpAborteds;
    }

    public void setSctpAborteds(int sctpAborteds) {
        int oldValue = getSctpAborteds();
        this.sctpAborteds = sctpAborteds;
        notifyChange(4, oldValue, sctpAborteds);
    }

    public int getSctpShutdowns() {
        return this.sctpShutdowns;
    }

    public void setSctpShutdowns(int sctpShutdowns) {
        int oldValue = getSctpShutdowns();
        this.sctpShutdowns = sctpShutdowns;
        notifyChange(5, oldValue, sctpShutdowns);
    }

    public int getSctpOutOfBlues() {
        return this.sctpOutOfBlues;
    }

    public void setSctpOutOfBlues(int sctpOutOfBlues) {
        int oldValue = getSctpOutOfBlues();
        this.sctpOutOfBlues = sctpOutOfBlues;
        notifyChange(6, oldValue, sctpOutOfBlues);
    }

    public int getSctpChecksumErrors() {
        return this.sctpChecksumErrors;
    }

    public void setSctpChecksumErrors(int sctpChecksumErrors) {
        int oldValue = getSctpChecksumErrors();
        this.sctpChecksumErrors = sctpChecksumErrors;
        notifyChange(7, oldValue, sctpChecksumErrors);
    }

    public long getSctpOutCtrlChunks() {
        return this.sctpOutCtrlChunks;
    }

    public void setSctpOutCtrlChunks(long sctpOutCtrlChunks) {
        long oldValue = getSctpOutCtrlChunks();
        this.sctpOutCtrlChunks = sctpOutCtrlChunks;
        notifyChange(8, oldValue, sctpOutCtrlChunks);
    }

    public long getSctpOutOrderChunks() {
        return this.sctpOutOrderChunks;
    }

    public void setSctpOutOrderChunks(long sctpOutOrderChunks) {
        long oldValue = getSctpOutOrderChunks();
        this.sctpOutOrderChunks = sctpOutOrderChunks;
        notifyChange(9, oldValue, sctpOutOrderChunks);
    }

    public long getSctpOutUnorderChunks() {
        return this.sctpOutUnorderChunks;
    }

    public void setSctpOutUnorderChunks(long sctpOutUnorderChunks) {
        long oldValue = getSctpOutUnorderChunks();
        this.sctpOutUnorderChunks = sctpOutUnorderChunks;
        notifyChange(10, oldValue, sctpOutUnorderChunks);
    }

    public long getSctpInCtrlChunks() {
        return this.sctpInCtrlChunks;
    }

    public void setSctpInCtrlChunks(long sctpInCtrlChunks) {
        long oldValue = getSctpInCtrlChunks();
        this.sctpInCtrlChunks = sctpInCtrlChunks;
        notifyChange(11, oldValue, sctpInCtrlChunks);
    }

    public long getSctpInOrderChunks() {
        return this.sctpInOrderChunks;
    }

    public void setSctpInOrderChunks(long sctpInOrderChunks) {
        long oldValue = getSctpInOrderChunks();
        this.sctpInOrderChunks = sctpInOrderChunks;
        notifyChange(12, oldValue, sctpInOrderChunks);
    }

    public long getSctpInUnorderChunks() {
        return this.sctpInUnorderChunks;
    }

    public void setSctpInUnorderChunks(long sctpInUnorderChunks) {
        long oldValue = getSctpInUnorderChunks();
        this.sctpInUnorderChunks = sctpInUnorderChunks;
        notifyChange(13, oldValue, sctpInUnorderChunks);
    }

    public long getSctpFragUsrMsgs() {
        return this.sctpFragUsrMsgs;
    }

    public void setSctpFragUsrMsgs(long sctpFragUsrMsgs) {
        long oldValue = getSctpFragUsrMsgs();
        this.sctpFragUsrMsgs = sctpFragUsrMsgs;
        notifyChange(14, oldValue, sctpFragUsrMsgs);
    }

    public long getSctpReasmUsrMsgs() {
        return this.sctpReasmUsrMsgs;
    }

    public void setSctpReasmUsrMsgs(long sctpReasmUsrMsgs) {
        long oldValue = getSctpReasmUsrMsgs();
        this.sctpReasmUsrMsgs = sctpReasmUsrMsgs;
        notifyChange(15, oldValue, sctpReasmUsrMsgs);
    }

    public long getSctpOutSCTPPacks() {
        return this.sctpOutSCTPPacks;
    }

    public void setSctpOutSCTPPacks(long sctpOutSCTPPacks) {
        long oldValue = getSctpOutSCTPPacks();
        this.sctpOutSCTPPacks = sctpOutSCTPPacks;
        notifyChange(16, oldValue, sctpOutSCTPPacks);
    }

    public long getSctpInSCTPPacks() {
        return this.sctpInSCTPPacks;
    }

    public void setSctpInSCTPPacks(long sctpInSCTPPacks) {
        long oldValue = getSctpInSCTPPacks();
        this.sctpInSCTPPacks = sctpInSCTPPacks;
        notifyChange(17, oldValue, sctpInSCTPPacks);
    }

    public int getSctpDiscontinuityTime() {
        return this.sctpDiscontinuityTime;
    }

    public void setSctpDiscontinuityTime(int sctpDiscontinuityTime) {
        int oldValue = getSctpDiscontinuityTime();
        this.sctpDiscontinuityTime = sctpDiscontinuityTime;
        notifyChange(18, oldValue, sctpDiscontinuityTime);
    }

    public void set(VariableBinding binding) {
        switch (binding.getOid().get(9)) {
            case  1 :
                setSctpCurrEstab(binding.getVariable().toInt());
                break;
            case  2 :
                setSctpActiveEstabs(binding.getVariable().toInt());
                break;
            case  3 :
                setSctpPassiveEstabs(binding.getVariable().toInt());
                break;
            case  4 :
                setSctpAborteds(binding.getVariable().toInt());
                break;
            case  5 :
                setSctpShutdowns(binding.getVariable().toInt());
                break;
            case  6 :
                setSctpOutOfBlues(binding.getVariable().toInt());
                break;
            case  7 :
                setSctpChecksumErrors(binding.getVariable().toInt());
                break;
            case  8 :
                setSctpOutCtrlChunks(binding.getVariable().toLong());
                break;
            case  9 :
                setSctpOutOrderChunks(binding.getVariable().toLong());
                break;
            case  10 :
                setSctpOutUnorderChunks(binding.getVariable().toLong());
                break;
            case  11 :
                setSctpInCtrlChunks(binding.getVariable().toLong());
                break;
            case  12 :
                setSctpInOrderChunks(binding.getVariable().toLong());
                break;
            case  13 :
                setSctpInUnorderChunks(binding.getVariable().toLong());
                break;
            case  14 :
                setSctpFragUsrMsgs(binding.getVariable().toLong());
                break;
            case  15 :
                setSctpReasmUsrMsgs(binding.getVariable().toLong());
                break;
            case  16 :
                setSctpOutSCTPPacks(binding.getVariable().toLong());
                break;
            case  17 :
                setSctpInSCTPPacks(binding.getVariable().toLong());
                break;
            case  18 :
                setSctpDiscontinuityTime(binding.getVariable().toInt());
                break;
        }
    }

    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE).append("sctpCurrEstab", sctpCurrEstab).append("sctpActiveEstabs", sctpActiveEstabs).append("sctpPassiveEstabs", sctpPassiveEstabs).append("sctpAborteds", sctpAborteds).append("sctpShutdowns", sctpShutdowns).append("sctpOutOfBlues", sctpOutOfBlues).append("sctpChecksumErrors", sctpChecksumErrors).append("sctpOutCtrlChunks", sctpOutCtrlChunks).append("sctpOutOrderChunks", sctpOutOrderChunks).append("sctpOutUnorderChunks", sctpOutUnorderChunks).append("sctpInCtrlChunks", sctpInCtrlChunks).append("sctpInOrderChunks", sctpInOrderChunks).append("sctpInUnorderChunks", sctpInUnorderChunks).append("sctpFragUsrMsgs", sctpFragUsrMsgs).append("sctpReasmUsrMsgs", sctpReasmUsrMsgs).append("sctpOutSCTPPacks", sctpOutSCTPPacks).append("sctpInSCTPPacks", sctpInSCTPPacks).append("sctpDiscontinuityTime", sctpDiscontinuityTime).toString();
    }

    public int hashCode() {
        return new HashCodeBuilder().append(sctpCurrEstab).append(sctpActiveEstabs).append(sctpPassiveEstabs).append(sctpAborteds).append(sctpShutdowns).append(sctpOutOfBlues).append(sctpChecksumErrors).append(sctpOutCtrlChunks).append(sctpOutOrderChunks).append(sctpOutUnorderChunks).append(sctpInCtrlChunks).append(sctpInOrderChunks).append(sctpInUnorderChunks).append(sctpFragUsrMsgs).append(sctpReasmUsrMsgs).append(sctpOutSCTPPacks).append(sctpInSCTPPacks).append(sctpDiscontinuityTime).toHashCode();
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
        SctpStats rhs = ((SctpStats) obj);
        return new EqualsBuilder().append(sctpCurrEstab, rhs.sctpCurrEstab).append(sctpActiveEstabs, rhs.sctpActiveEstabs).append(sctpPassiveEstabs, rhs.sctpPassiveEstabs).append(sctpAborteds, rhs.sctpAborteds).append(sctpShutdowns, rhs.sctpShutdowns).append(sctpOutOfBlues, rhs.sctpOutOfBlues).append(sctpChecksumErrors, rhs.sctpChecksumErrors).append(sctpOutCtrlChunks, rhs.sctpOutCtrlChunks).append(sctpOutOrderChunks, rhs.sctpOutOrderChunks).append(sctpOutUnorderChunks, rhs.sctpOutUnorderChunks).append(sctpInCtrlChunks, rhs.sctpInCtrlChunks).append(sctpInOrderChunks, rhs.sctpInOrderChunks).append(sctpInUnorderChunks, rhs.sctpInUnorderChunks).append(sctpFragUsrMsgs, rhs.sctpFragUsrMsgs).append(sctpReasmUsrMsgs, rhs.sctpReasmUsrMsgs).append(sctpOutSCTPPacks, rhs.sctpOutSCTPPacks).append(sctpInSCTPPacks, rhs.sctpInSCTPPacks).append(sctpDiscontinuityTime, rhs.sctpDiscontinuityTime).isEquals();
    }

    public SctpStats clone() {
        SctpStats _copy = new SctpStats();
        _copy.sctpCurrEstab = sctpCurrEstab;
        _copy.sctpActiveEstabs = sctpActiveEstabs;
        _copy.sctpPassiveEstabs = sctpPassiveEstabs;
        _copy.sctpAborteds = sctpAborteds;
        _copy.sctpShutdowns = sctpShutdowns;
        _copy.sctpOutOfBlues = sctpOutOfBlues;
        _copy.sctpChecksumErrors = sctpChecksumErrors;
        _copy.sctpOutCtrlChunks = sctpOutCtrlChunks;
        _copy.sctpOutOrderChunks = sctpOutOrderChunks;
        _copy.sctpOutUnorderChunks = sctpOutUnorderChunks;
        _copy.sctpInCtrlChunks = sctpInCtrlChunks;
        _copy.sctpInOrderChunks = sctpInOrderChunks;
        _copy.sctpInUnorderChunks = sctpInUnorderChunks;
        _copy.sctpFragUsrMsgs = sctpFragUsrMsgs;
        _copy.sctpReasmUsrMsgs = sctpReasmUsrMsgs;
        _copy.sctpOutSCTPPacks = sctpOutSCTPPacks;
        _copy.sctpInSCTPPacks = sctpInSCTPPacks;
        _copy.sctpDiscontinuityTime = sctpDiscontinuityTime;
        return _copy;
    }

    public void set_ParentEntity(AbstractRootEntity parent) {
        parentEntity = parent;
    }

    private static DeviceEntityDescription createEntityDescription() {
        DeviceEntityDescription description = new DeviceEntityDescription(new OID("1.3.6.1.2.1.104.1.1"));
        description.addField(new DeviceEntityDescription.FieldDescription(1, "sctpCurrEstab", DeviceEntityDescription.FieldType.UNSIGNED32, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(2, "sctpActiveEstabs", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(3, "sctpPassiveEstabs", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(4, "sctpAborteds", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(5, "sctpShutdowns", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(6, "sctpOutOfBlues", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(7, "sctpChecksumErrors", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(8, "sctpOutCtrlChunks", DeviceEntityDescription.FieldType.UNSIGNED64, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(9, "sctpOutOrderChunks", DeviceEntityDescription.FieldType.UNSIGNED64, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(10, "sctpOutUnorderChunks", DeviceEntityDescription.FieldType.UNSIGNED64, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(11, "sctpInCtrlChunks", DeviceEntityDescription.FieldType.UNSIGNED64, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(12, "sctpInOrderChunks", DeviceEntityDescription.FieldType.UNSIGNED64, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(13, "sctpInUnorderChunks", DeviceEntityDescription.FieldType.UNSIGNED64, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(14, "sctpFragUsrMsgs", DeviceEntityDescription.FieldType.UNSIGNED64, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(15, "sctpReasmUsrMsgs", DeviceEntityDescription.FieldType.UNSIGNED64, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(16, "sctpOutSCTPPacks", DeviceEntityDescription.FieldType.UNSIGNED64, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(17, "sctpInSCTPPacks", DeviceEntityDescription.FieldType.UNSIGNED64, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(18, "sctpDiscontinuityTime", DeviceEntityDescription.FieldType.INTEGER, -1));
        return description;
    }

    public DeviceEntityDescription get_Description() {
        return _entityDescription;
    }

}
