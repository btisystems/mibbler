
package com.btisystems.mibbler.mibs.rfc.rfc.mib_2.egp.egpneightable;

import java.io.Serializable;
import com.btisystems.mibbler.mibs.rfc.interfaces.mib_2.egp.egpneightable.IEgpNeighEntry;
import com.btisystems.mibbler.mibs.rfc.rfc.mib_2.egp.EgpNeighTable;
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

public class EgpNeighEntry
    extends DeviceEntity
    implements Serializable, IEgpNeighEntry, IIndexed, IVariableBindingSetter
{

    private int egpNeighState;
    private String egpNeighAddr;
    private int egpNeighAs;
    private int egpNeighInMsgs;
    private int egpNeighInErrs;
    private int egpNeighOutMsgs;
    private int egpNeighOutErrs;
    private int egpNeighInErrMsgs;
    private int egpNeighOutErrMsgs;
    private int egpNeighStateUps;
    private int egpNeighStateDowns;
    private int egpNeighIntervalHello;
    private int egpNeighIntervalPoll;
    private int egpNeighMode;
    private int egpNeighEventTrigger;
    private String _index;
    private EgpNeighTable parentEntity;
    private final static DeviceEntityDescription _entityDescription = createEntityDescription();

    public EgpNeighEntry() {
    }

    public int getEgpNeighState() {
        return this.egpNeighState;
    }

    public void setEgpNeighState(int egpNeighState) {
        int oldValue = getEgpNeighState();
        this.egpNeighState = egpNeighState;
        notifyChange(1, oldValue, egpNeighState);
    }

    public String getEgpNeighAddr() {
        return this.egpNeighAddr;
    }

    public void setEgpNeighAddr(String egpNeighAddr) {
        String oldValue = getEgpNeighAddr();
        this.egpNeighAddr = egpNeighAddr;
        notifyChange(2, oldValue, egpNeighAddr);
    }

    public int getEgpNeighAs() {
        return this.egpNeighAs;
    }

    public void setEgpNeighAs(int egpNeighAs) {
        int oldValue = getEgpNeighAs();
        this.egpNeighAs = egpNeighAs;
        notifyChange(3, oldValue, egpNeighAs);
    }

    public int getEgpNeighInMsgs() {
        return this.egpNeighInMsgs;
    }

    public void setEgpNeighInMsgs(int egpNeighInMsgs) {
        int oldValue = getEgpNeighInMsgs();
        this.egpNeighInMsgs = egpNeighInMsgs;
        notifyChange(4, oldValue, egpNeighInMsgs);
    }

    public int getEgpNeighInErrs() {
        return this.egpNeighInErrs;
    }

    public void setEgpNeighInErrs(int egpNeighInErrs) {
        int oldValue = getEgpNeighInErrs();
        this.egpNeighInErrs = egpNeighInErrs;
        notifyChange(5, oldValue, egpNeighInErrs);
    }

    public int getEgpNeighOutMsgs() {
        return this.egpNeighOutMsgs;
    }

    public void setEgpNeighOutMsgs(int egpNeighOutMsgs) {
        int oldValue = getEgpNeighOutMsgs();
        this.egpNeighOutMsgs = egpNeighOutMsgs;
        notifyChange(6, oldValue, egpNeighOutMsgs);
    }

    public int getEgpNeighOutErrs() {
        return this.egpNeighOutErrs;
    }

    public void setEgpNeighOutErrs(int egpNeighOutErrs) {
        int oldValue = getEgpNeighOutErrs();
        this.egpNeighOutErrs = egpNeighOutErrs;
        notifyChange(7, oldValue, egpNeighOutErrs);
    }

    public int getEgpNeighInErrMsgs() {
        return this.egpNeighInErrMsgs;
    }

    public void setEgpNeighInErrMsgs(int egpNeighInErrMsgs) {
        int oldValue = getEgpNeighInErrMsgs();
        this.egpNeighInErrMsgs = egpNeighInErrMsgs;
        notifyChange(8, oldValue, egpNeighInErrMsgs);
    }

    public int getEgpNeighOutErrMsgs() {
        return this.egpNeighOutErrMsgs;
    }

    public void setEgpNeighOutErrMsgs(int egpNeighOutErrMsgs) {
        int oldValue = getEgpNeighOutErrMsgs();
        this.egpNeighOutErrMsgs = egpNeighOutErrMsgs;
        notifyChange(9, oldValue, egpNeighOutErrMsgs);
    }

    public int getEgpNeighStateUps() {
        return this.egpNeighStateUps;
    }

    public void setEgpNeighStateUps(int egpNeighStateUps) {
        int oldValue = getEgpNeighStateUps();
        this.egpNeighStateUps = egpNeighStateUps;
        notifyChange(10, oldValue, egpNeighStateUps);
    }

    public int getEgpNeighStateDowns() {
        return this.egpNeighStateDowns;
    }

    public void setEgpNeighStateDowns(int egpNeighStateDowns) {
        int oldValue = getEgpNeighStateDowns();
        this.egpNeighStateDowns = egpNeighStateDowns;
        notifyChange(11, oldValue, egpNeighStateDowns);
    }

    public int getEgpNeighIntervalHello() {
        return this.egpNeighIntervalHello;
    }

    public void setEgpNeighIntervalHello(int egpNeighIntervalHello) {
        int oldValue = getEgpNeighIntervalHello();
        this.egpNeighIntervalHello = egpNeighIntervalHello;
        notifyChange(12, oldValue, egpNeighIntervalHello);
    }

    public int getEgpNeighIntervalPoll() {
        return this.egpNeighIntervalPoll;
    }

    public void setEgpNeighIntervalPoll(int egpNeighIntervalPoll) {
        int oldValue = getEgpNeighIntervalPoll();
        this.egpNeighIntervalPoll = egpNeighIntervalPoll;
        notifyChange(13, oldValue, egpNeighIntervalPoll);
    }

    public int getEgpNeighMode() {
        return this.egpNeighMode;
    }

    public void setEgpNeighMode(int egpNeighMode) {
        int oldValue = getEgpNeighMode();
        this.egpNeighMode = egpNeighMode;
        notifyChange(14, oldValue, egpNeighMode);
    }

    public int getEgpNeighEventTrigger() {
        return this.egpNeighEventTrigger;
    }

    public void setEgpNeighEventTrigger(int egpNeighEventTrigger) {
        int oldValue = getEgpNeighEventTrigger();
        this.egpNeighEventTrigger = egpNeighEventTrigger;
        notifyChange(15, oldValue, egpNeighEventTrigger);
    }

    public void set(VariableBinding binding) {
        switch (binding.getOid().get(9)) {
            case  1 :
                setEgpNeighState(binding.getVariable().toInt());
                break;
            case  2 :
                setEgpNeighAddr(binding.getVariable().toString());
                break;
            case  3 :
                setEgpNeighAs(binding.getVariable().toInt());
                break;
            case  4 :
                setEgpNeighInMsgs(binding.getVariable().toInt());
                break;
            case  5 :
                setEgpNeighInErrs(binding.getVariable().toInt());
                break;
            case  6 :
                setEgpNeighOutMsgs(binding.getVariable().toInt());
                break;
            case  7 :
                setEgpNeighOutErrs(binding.getVariable().toInt());
                break;
            case  8 :
                setEgpNeighInErrMsgs(binding.getVariable().toInt());
                break;
            case  9 :
                setEgpNeighOutErrMsgs(binding.getVariable().toInt());
                break;
            case  10 :
                setEgpNeighStateUps(binding.getVariable().toInt());
                break;
            case  11 :
                setEgpNeighStateDowns(binding.getVariable().toInt());
                break;
            case  12 :
                setEgpNeighIntervalHello(binding.getVariable().toInt());
                break;
            case  13 :
                setEgpNeighIntervalPoll(binding.getVariable().toInt());
                break;
            case  14 :
                setEgpNeighMode(binding.getVariable().toInt());
                break;
            case  15 :
                setEgpNeighEventTrigger(binding.getVariable().toInt());
                break;
        }
    }

    public void _setIndex(OID oid) {
        byte[] _oidBytes = oid.toByteArray();
        int[] _oidInts = oid.toIntArray();
        int arrayOffset = 10;
        int _len;
        _index = new OID(_oidInts, 10, (oid.size()- 10)).toString();
        setEgpNeighAddr(new String(_oidBytes, arrayOffset, 4));
        arrayOffset += 4;
    }

    public String _getIndex() {
        return _index;
    }

    public void _setTable(EgpNeighTable table) {
        this.parentEntity = table;
    }

    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE).append("egpNeighState", egpNeighState).append("egpNeighAddr", egpNeighAddr).append("egpNeighAs", egpNeighAs).append("egpNeighInMsgs", egpNeighInMsgs).append("egpNeighInErrs", egpNeighInErrs).append("egpNeighOutMsgs", egpNeighOutMsgs).append("egpNeighOutErrs", egpNeighOutErrs).append("egpNeighInErrMsgs", egpNeighInErrMsgs).append("egpNeighOutErrMsgs", egpNeighOutErrMsgs).append("egpNeighStateUps", egpNeighStateUps).append("egpNeighStateDowns", egpNeighStateDowns).append("egpNeighIntervalHello", egpNeighIntervalHello).append("egpNeighIntervalPoll", egpNeighIntervalPoll).append("egpNeighMode", egpNeighMode).append("egpNeighEventTrigger", egpNeighEventTrigger).append("_index", _index).toString();
    }

    public int hashCode() {
        return new HashCodeBuilder().append(egpNeighState).append(egpNeighAddr).append(egpNeighAs).append(egpNeighInMsgs).append(egpNeighInErrs).append(egpNeighOutMsgs).append(egpNeighOutErrs).append(egpNeighInErrMsgs).append(egpNeighOutErrMsgs).append(egpNeighStateUps).append(egpNeighStateDowns).append(egpNeighIntervalHello).append(egpNeighIntervalPoll).append(egpNeighMode).append(egpNeighEventTrigger).append(_index).toHashCode();
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
        EgpNeighEntry rhs = ((EgpNeighEntry) obj);
        return new EqualsBuilder().append(egpNeighState, rhs.egpNeighState).append(egpNeighAddr, rhs.egpNeighAddr).append(egpNeighAs, rhs.egpNeighAs).append(egpNeighInMsgs, rhs.egpNeighInMsgs).append(egpNeighInErrs, rhs.egpNeighInErrs).append(egpNeighOutMsgs, rhs.egpNeighOutMsgs).append(egpNeighOutErrs, rhs.egpNeighOutErrs).append(egpNeighInErrMsgs, rhs.egpNeighInErrMsgs).append(egpNeighOutErrMsgs, rhs.egpNeighOutErrMsgs).append(egpNeighStateUps, rhs.egpNeighStateUps).append(egpNeighStateDowns, rhs.egpNeighStateDowns).append(egpNeighIntervalHello, rhs.egpNeighIntervalHello).append(egpNeighIntervalPoll, rhs.egpNeighIntervalPoll).append(egpNeighMode, rhs.egpNeighMode).append(egpNeighEventTrigger, rhs.egpNeighEventTrigger).append(_index, rhs._index).isEquals();
    }

    public EgpNeighEntry clone() {
        EgpNeighEntry _copy = new EgpNeighEntry();
        _copy.egpNeighState = egpNeighState;
        _copy.egpNeighAddr = egpNeighAddr;
        _copy.egpNeighAs = egpNeighAs;
        _copy.egpNeighInMsgs = egpNeighInMsgs;
        _copy.egpNeighInErrs = egpNeighInErrs;
        _copy.egpNeighOutMsgs = egpNeighOutMsgs;
        _copy.egpNeighOutErrs = egpNeighOutErrs;
        _copy.egpNeighInErrMsgs = egpNeighInErrMsgs;
        _copy.egpNeighOutErrMsgs = egpNeighOutErrMsgs;
        _copy.egpNeighStateUps = egpNeighStateUps;
        _copy.egpNeighStateDowns = egpNeighStateDowns;
        _copy.egpNeighIntervalHello = egpNeighIntervalHello;
        _copy.egpNeighIntervalPoll = egpNeighIntervalPoll;
        _copy.egpNeighMode = egpNeighMode;
        _copy.egpNeighEventTrigger = egpNeighEventTrigger;
        _copy._index = _index;
        _copy.parentEntity = parentEntity;
        return _copy;
    }

    private static DeviceEntityDescription createEntityDescription() {
        DeviceEntityDescription description = new DeviceEntityDescription(new OID("1.3.6.1.2.1.8.5.1"));
        description.addField(new DeviceEntityDescription.FieldDescription(1, "egpNeighState", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(2, "egpNeighAddr", DeviceEntityDescription.FieldType.IP_ADDRESS, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(3, "egpNeighAs", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(4, "egpNeighInMsgs", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(5, "egpNeighInErrs", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(6, "egpNeighOutMsgs", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(7, "egpNeighOutErrs", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(8, "egpNeighInErrMsgs", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(9, "egpNeighOutErrMsgs", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(10, "egpNeighStateUps", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(11, "egpNeighStateDowns", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(12, "egpNeighIntervalHello", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(13, "egpNeighIntervalPoll", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(14, "egpNeighMode", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(15, "egpNeighEventTrigger", DeviceEntityDescription.FieldType.INTEGER, -1));
        return description;
    }

    public DeviceEntityDescription get_Description() {
        return _entityDescription;
    }

}
