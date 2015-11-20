
package com.btisystems.mibbler.mibs.rfc.rfc.mib_2.dot1dbridge.dot1dstp.dot1dstpporttable;

import java.io.Serializable;
import com.btisystems.mibbler.mibs.rfc.interfaces.mib_2.dot1dbridge.dot1dstp.dot1dstpporttable.IDot1dStpPortEntry;
import com.btisystems.mibbler.mibs.rfc.rfc.mib_2.dot1dbridge.dot1dstp.Dot1dStpPortTable;
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

public class Dot1dStpPortEntry
    extends DeviceEntity
    implements Serializable, IDot1dStpPortEntry, IIndexed, IVariableBindingSetter
{

    private int dot1dStpPort;
    private int dot1dStpPortPriority;
    private int dot1dStpPortState;
    private int dot1dStpPortEnable;
    private int dot1dStpPortPathCost;
    private String dot1dStpPortDesignatedRoot;
    private int dot1dStpPortDesignatedCost;
    private String dot1dStpPortDesignatedBridge;
    private String dot1dStpPortDesignatedPort;
    private int dot1dStpPortForwardTransitions;
    private int dot1dStpPortPathCost32;
    private String _index;
    private Dot1dStpPortTable parentEntity;
    private final static DeviceEntityDescription _entityDescription = createEntityDescription();

    public Dot1dStpPortEntry() {
    }

    public int getDot1dStpPort() {
        return this.dot1dStpPort;
    }

    public void setDot1dStpPort(int dot1dStpPort) {
        int oldValue = getDot1dStpPort();
        this.dot1dStpPort = dot1dStpPort;
        notifyChange(1, oldValue, dot1dStpPort);
    }

    public int getDot1dStpPortPriority() {
        return this.dot1dStpPortPriority;
    }

    public void setDot1dStpPortPriority(int dot1dStpPortPriority) {
        int oldValue = getDot1dStpPortPriority();
        this.dot1dStpPortPriority = dot1dStpPortPriority;
        notifyChange(2, oldValue, dot1dStpPortPriority);
    }

    public int getDot1dStpPortState() {
        return this.dot1dStpPortState;
    }

    public void setDot1dStpPortState(int dot1dStpPortState) {
        int oldValue = getDot1dStpPortState();
        this.dot1dStpPortState = dot1dStpPortState;
        notifyChange(3, oldValue, dot1dStpPortState);
    }

    public int getDot1dStpPortEnable() {
        return this.dot1dStpPortEnable;
    }

    public void setDot1dStpPortEnable(int dot1dStpPortEnable) {
        int oldValue = getDot1dStpPortEnable();
        this.dot1dStpPortEnable = dot1dStpPortEnable;
        notifyChange(4, oldValue, dot1dStpPortEnable);
    }

    public int getDot1dStpPortPathCost() {
        return this.dot1dStpPortPathCost;
    }

    public void setDot1dStpPortPathCost(int dot1dStpPortPathCost) {
        int oldValue = getDot1dStpPortPathCost();
        this.dot1dStpPortPathCost = dot1dStpPortPathCost;
        notifyChange(5, oldValue, dot1dStpPortPathCost);
    }

    public String getDot1dStpPortDesignatedRoot() {
        return this.dot1dStpPortDesignatedRoot;
    }

    public void setDot1dStpPortDesignatedRoot(String dot1dStpPortDesignatedRoot) {
        String oldValue = getDot1dStpPortDesignatedRoot();
        this.dot1dStpPortDesignatedRoot = dot1dStpPortDesignatedRoot;
        notifyChange(6, oldValue, dot1dStpPortDesignatedRoot);
    }

    public int getDot1dStpPortDesignatedCost() {
        return this.dot1dStpPortDesignatedCost;
    }

    public void setDot1dStpPortDesignatedCost(int dot1dStpPortDesignatedCost) {
        int oldValue = getDot1dStpPortDesignatedCost();
        this.dot1dStpPortDesignatedCost = dot1dStpPortDesignatedCost;
        notifyChange(7, oldValue, dot1dStpPortDesignatedCost);
    }

    public String getDot1dStpPortDesignatedBridge() {
        return this.dot1dStpPortDesignatedBridge;
    }

    public void setDot1dStpPortDesignatedBridge(String dot1dStpPortDesignatedBridge) {
        String oldValue = getDot1dStpPortDesignatedBridge();
        this.dot1dStpPortDesignatedBridge = dot1dStpPortDesignatedBridge;
        notifyChange(8, oldValue, dot1dStpPortDesignatedBridge);
    }

    public String getDot1dStpPortDesignatedPort() {
        return this.dot1dStpPortDesignatedPort;
    }

    public void setDot1dStpPortDesignatedPort(String dot1dStpPortDesignatedPort) {
        String oldValue = getDot1dStpPortDesignatedPort();
        this.dot1dStpPortDesignatedPort = dot1dStpPortDesignatedPort;
        notifyChange(9, oldValue, dot1dStpPortDesignatedPort);
    }

    public int getDot1dStpPortForwardTransitions() {
        return this.dot1dStpPortForwardTransitions;
    }

    public void setDot1dStpPortForwardTransitions(int dot1dStpPortForwardTransitions) {
        int oldValue = getDot1dStpPortForwardTransitions();
        this.dot1dStpPortForwardTransitions = dot1dStpPortForwardTransitions;
        notifyChange(10, oldValue, dot1dStpPortForwardTransitions);
    }

    public int getDot1dStpPortPathCost32() {
        return this.dot1dStpPortPathCost32;
    }

    public void setDot1dStpPortPathCost32(int dot1dStpPortPathCost32) {
        int oldValue = getDot1dStpPortPathCost32();
        this.dot1dStpPortPathCost32 = dot1dStpPortPathCost32;
        notifyChange(11, oldValue, dot1dStpPortPathCost32);
    }

    public void set(VariableBinding binding) {
        switch (binding.getOid().get(10)) {
            case  1 :
                setDot1dStpPort(binding.getVariable().toInt());
                break;
            case  2 :
                setDot1dStpPortPriority(binding.getVariable().toInt());
                break;
            case  3 :
                setDot1dStpPortState(binding.getVariable().toInt());
                break;
            case  4 :
                setDot1dStpPortEnable(binding.getVariable().toInt());
                break;
            case  5 :
                setDot1dStpPortPathCost(binding.getVariable().toInt());
                break;
            case  6 :
                setDot1dStpPortDesignatedRoot(binding.getVariable().toString());
                break;
            case  7 :
                setDot1dStpPortDesignatedCost(binding.getVariable().toInt());
                break;
            case  8 :
                setDot1dStpPortDesignatedBridge(binding.getVariable().toString());
                break;
            case  9 :
                setDot1dStpPortDesignatedPort(binding.getVariable().toString());
                break;
            case  10 :
                setDot1dStpPortForwardTransitions(binding.getVariable().toInt());
                break;
            case  11 :
                setDot1dStpPortPathCost32(binding.getVariable().toInt());
                break;
        }
    }

    public void _setIndex(OID oid) {
        byte[] _oidBytes = oid.toByteArray();
        int[] _oidInts = oid.toIntArray();
        int arrayOffset = 11;
        int _len;
        _index = new OID(_oidInts, 11, (oid.size()- 11)).toString();
        setDot1dStpPort(_oidInts[arrayOffset]);
        arrayOffset += 1;
    }

    public String _getIndex() {
        return _index;
    }

    public void _setTable(Dot1dStpPortTable table) {
        this.parentEntity = table;
    }

    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE).append("dot1dStpPort", dot1dStpPort).append("dot1dStpPortPriority", dot1dStpPortPriority).append("dot1dStpPortState", dot1dStpPortState).append("dot1dStpPortEnable", dot1dStpPortEnable).append("dot1dStpPortPathCost", dot1dStpPortPathCost).append("dot1dStpPortDesignatedRoot", dot1dStpPortDesignatedRoot).append("dot1dStpPortDesignatedCost", dot1dStpPortDesignatedCost).append("dot1dStpPortDesignatedBridge", dot1dStpPortDesignatedBridge).append("dot1dStpPortDesignatedPort", dot1dStpPortDesignatedPort).append("dot1dStpPortForwardTransitions", dot1dStpPortForwardTransitions).append("dot1dStpPortPathCost32", dot1dStpPortPathCost32).append("_index", _index).toString();
    }

    public int hashCode() {
        return new HashCodeBuilder().append(dot1dStpPort).append(dot1dStpPortPriority).append(dot1dStpPortState).append(dot1dStpPortEnable).append(dot1dStpPortPathCost).append(dot1dStpPortDesignatedRoot).append(dot1dStpPortDesignatedCost).append(dot1dStpPortDesignatedBridge).append(dot1dStpPortDesignatedPort).append(dot1dStpPortForwardTransitions).append(dot1dStpPortPathCost32).append(_index).toHashCode();
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
        Dot1dStpPortEntry rhs = ((Dot1dStpPortEntry) obj);
        return new EqualsBuilder().append(dot1dStpPort, rhs.dot1dStpPort).append(dot1dStpPortPriority, rhs.dot1dStpPortPriority).append(dot1dStpPortState, rhs.dot1dStpPortState).append(dot1dStpPortEnable, rhs.dot1dStpPortEnable).append(dot1dStpPortPathCost, rhs.dot1dStpPortPathCost).append(dot1dStpPortDesignatedRoot, rhs.dot1dStpPortDesignatedRoot).append(dot1dStpPortDesignatedCost, rhs.dot1dStpPortDesignatedCost).append(dot1dStpPortDesignatedBridge, rhs.dot1dStpPortDesignatedBridge).append(dot1dStpPortDesignatedPort, rhs.dot1dStpPortDesignatedPort).append(dot1dStpPortForwardTransitions, rhs.dot1dStpPortForwardTransitions).append(dot1dStpPortPathCost32, rhs.dot1dStpPortPathCost32).append(_index, rhs._index).isEquals();
    }

    public Dot1dStpPortEntry clone() {
        Dot1dStpPortEntry _copy = new Dot1dStpPortEntry();
        _copy.dot1dStpPort = dot1dStpPort;
        _copy.dot1dStpPortPriority = dot1dStpPortPriority;
        _copy.dot1dStpPortState = dot1dStpPortState;
        _copy.dot1dStpPortEnable = dot1dStpPortEnable;
        _copy.dot1dStpPortPathCost = dot1dStpPortPathCost;
        _copy.dot1dStpPortDesignatedRoot = dot1dStpPortDesignatedRoot;
        _copy.dot1dStpPortDesignatedCost = dot1dStpPortDesignatedCost;
        _copy.dot1dStpPortDesignatedBridge = dot1dStpPortDesignatedBridge;
        _copy.dot1dStpPortDesignatedPort = dot1dStpPortDesignatedPort;
        _copy.dot1dStpPortForwardTransitions = dot1dStpPortForwardTransitions;
        _copy.dot1dStpPortPathCost32 = dot1dStpPortPathCost32;
        _copy._index = _index;
        _copy.parentEntity = parentEntity;
        return _copy;
    }

    private static DeviceEntityDescription createEntityDescription() {
        DeviceEntityDescription description = new DeviceEntityDescription(new OID("1.3.6.1.2.1.17.2.15.1"));
        description.addField(new DeviceEntityDescription.FieldDescription(1, "dot1dStpPort", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(2, "dot1dStpPortPriority", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(3, "dot1dStpPortState", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(4, "dot1dStpPortEnable", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(5, "dot1dStpPortPathCost", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(6, "dot1dStpPortDesignatedRoot", DeviceEntityDescription.FieldType.STRING, 32));
        description.addField(new DeviceEntityDescription.FieldDescription(7, "dot1dStpPortDesignatedCost", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(8, "dot1dStpPortDesignatedBridge", DeviceEntityDescription.FieldType.STRING, 32));
        description.addField(new DeviceEntityDescription.FieldDescription(9, "dot1dStpPortDesignatedPort", DeviceEntityDescription.FieldType.STRING, 8));
        description.addField(new DeviceEntityDescription.FieldDescription(10, "dot1dStpPortForwardTransitions", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(11, "dot1dStpPortPathCost32", DeviceEntityDescription.FieldType.INTEGER, -1));
        return description;
    }

    public DeviceEntityDescription get_Description() {
        return _entityDescription;
    }

}
