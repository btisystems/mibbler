
package com.btisystems.mibbler.mibs.bti7000.bti7000_13_2_0.mib_2.dot1dbridge;

import java.io.Serializable;
import com.btisystems.mibbler.mibs.bti7000.interfaces.mib_2.dot1dbridge.IDot1dStp;
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

public class Dot1dStp
    extends DeviceEntity
    implements Serializable, IDot1dStp, IVariableBindingSetter
{

    private int dot1dStpProtocolSpecification;
    private int dot1dStpPriority;
    private int dot1dStpTimeSinceTopologyChange;
    private int dot1dStpTopChanges;
    private String dot1dStpDesignatedRoot;
    private int dot1dStpRootCost;
    private int dot1dStpRootPort;
    private int dot1dStpMaxAge;
    private int dot1dStpHelloTime;
    private int dot1dStpHoldTime;
    private int dot1dStpForwardDelay;
    private int dot1dStpBridgeMaxAge;
    private int dot1dStpBridgeHelloTime;
    private int dot1dStpBridgeForwardDelay;
    private AbstractRootEntity parentEntity;
    private final static DeviceEntityDescription _entityDescription = createEntityDescription();

    public Dot1dStp() {
    }

    public int getDot1dStpProtocolSpecification() {
        return this.dot1dStpProtocolSpecification;
    }

    public void setDot1dStpProtocolSpecification(int dot1dStpProtocolSpecification) {
        int oldValue = getDot1dStpProtocolSpecification();
        this.dot1dStpProtocolSpecification = dot1dStpProtocolSpecification;
        notifyChange(1, oldValue, dot1dStpProtocolSpecification);
    }

    public int getDot1dStpPriority() {
        return this.dot1dStpPriority;
    }

    public void setDot1dStpPriority(int dot1dStpPriority) {
        int oldValue = getDot1dStpPriority();
        this.dot1dStpPriority = dot1dStpPriority;
        notifyChange(2, oldValue, dot1dStpPriority);
    }

    public int getDot1dStpTimeSinceTopologyChange() {
        return this.dot1dStpTimeSinceTopologyChange;
    }

    public void setDot1dStpTimeSinceTopologyChange(int dot1dStpTimeSinceTopologyChange) {
        int oldValue = getDot1dStpTimeSinceTopologyChange();
        this.dot1dStpTimeSinceTopologyChange = dot1dStpTimeSinceTopologyChange;
        notifyChange(3, oldValue, dot1dStpTimeSinceTopologyChange);
    }

    public int getDot1dStpTopChanges() {
        return this.dot1dStpTopChanges;
    }

    public void setDot1dStpTopChanges(int dot1dStpTopChanges) {
        int oldValue = getDot1dStpTopChanges();
        this.dot1dStpTopChanges = dot1dStpTopChanges;
        notifyChange(4, oldValue, dot1dStpTopChanges);
    }

    public String getDot1dStpDesignatedRoot() {
        return this.dot1dStpDesignatedRoot;
    }

    public void setDot1dStpDesignatedRoot(String dot1dStpDesignatedRoot) {
        String oldValue = getDot1dStpDesignatedRoot();
        this.dot1dStpDesignatedRoot = dot1dStpDesignatedRoot;
        notifyChange(5, oldValue, dot1dStpDesignatedRoot);
    }

    public int getDot1dStpRootCost() {
        return this.dot1dStpRootCost;
    }

    public void setDot1dStpRootCost(int dot1dStpRootCost) {
        int oldValue = getDot1dStpRootCost();
        this.dot1dStpRootCost = dot1dStpRootCost;
        notifyChange(6, oldValue, dot1dStpRootCost);
    }

    public int getDot1dStpRootPort() {
        return this.dot1dStpRootPort;
    }

    public void setDot1dStpRootPort(int dot1dStpRootPort) {
        int oldValue = getDot1dStpRootPort();
        this.dot1dStpRootPort = dot1dStpRootPort;
        notifyChange(7, oldValue, dot1dStpRootPort);
    }

    public int getDot1dStpMaxAge() {
        return this.dot1dStpMaxAge;
    }

    public void setDot1dStpMaxAge(int dot1dStpMaxAge) {
        int oldValue = getDot1dStpMaxAge();
        this.dot1dStpMaxAge = dot1dStpMaxAge;
        notifyChange(8, oldValue, dot1dStpMaxAge);
    }

    public int getDot1dStpHelloTime() {
        return this.dot1dStpHelloTime;
    }

    public void setDot1dStpHelloTime(int dot1dStpHelloTime) {
        int oldValue = getDot1dStpHelloTime();
        this.dot1dStpHelloTime = dot1dStpHelloTime;
        notifyChange(9, oldValue, dot1dStpHelloTime);
    }

    public int getDot1dStpHoldTime() {
        return this.dot1dStpHoldTime;
    }

    public void setDot1dStpHoldTime(int dot1dStpHoldTime) {
        int oldValue = getDot1dStpHoldTime();
        this.dot1dStpHoldTime = dot1dStpHoldTime;
        notifyChange(10, oldValue, dot1dStpHoldTime);
    }

    public int getDot1dStpForwardDelay() {
        return this.dot1dStpForwardDelay;
    }

    public void setDot1dStpForwardDelay(int dot1dStpForwardDelay) {
        int oldValue = getDot1dStpForwardDelay();
        this.dot1dStpForwardDelay = dot1dStpForwardDelay;
        notifyChange(11, oldValue, dot1dStpForwardDelay);
    }

    public int getDot1dStpBridgeMaxAge() {
        return this.dot1dStpBridgeMaxAge;
    }

    public void setDot1dStpBridgeMaxAge(int dot1dStpBridgeMaxAge) {
        int oldValue = getDot1dStpBridgeMaxAge();
        this.dot1dStpBridgeMaxAge = dot1dStpBridgeMaxAge;
        notifyChange(12, oldValue, dot1dStpBridgeMaxAge);
    }

    public int getDot1dStpBridgeHelloTime() {
        return this.dot1dStpBridgeHelloTime;
    }

    public void setDot1dStpBridgeHelloTime(int dot1dStpBridgeHelloTime) {
        int oldValue = getDot1dStpBridgeHelloTime();
        this.dot1dStpBridgeHelloTime = dot1dStpBridgeHelloTime;
        notifyChange(13, oldValue, dot1dStpBridgeHelloTime);
    }

    public int getDot1dStpBridgeForwardDelay() {
        return this.dot1dStpBridgeForwardDelay;
    }

    public void setDot1dStpBridgeForwardDelay(int dot1dStpBridgeForwardDelay) {
        int oldValue = getDot1dStpBridgeForwardDelay();
        this.dot1dStpBridgeForwardDelay = dot1dStpBridgeForwardDelay;
        notifyChange(14, oldValue, dot1dStpBridgeForwardDelay);
    }

    public void set(VariableBinding binding) {
        switch (binding.getOid().get(8)) {
            case  1 :
                setDot1dStpProtocolSpecification(binding.getVariable().toInt());
                break;
            case  2 :
                setDot1dStpPriority(binding.getVariable().toInt());
                break;
            case  3 :
                setDot1dStpTimeSinceTopologyChange(binding.getVariable().toInt());
                break;
            case  4 :
                setDot1dStpTopChanges(binding.getVariable().toInt());
                break;
            case  5 :
                setDot1dStpDesignatedRoot(binding.getVariable().toString());
                break;
            case  6 :
                setDot1dStpRootCost(binding.getVariable().toInt());
                break;
            case  7 :
                setDot1dStpRootPort(binding.getVariable().toInt());
                break;
            case  8 :
                setDot1dStpMaxAge(binding.getVariable().toInt());
                break;
            case  9 :
                setDot1dStpHelloTime(binding.getVariable().toInt());
                break;
            case  10 :
                setDot1dStpHoldTime(binding.getVariable().toInt());
                break;
            case  11 :
                setDot1dStpForwardDelay(binding.getVariable().toInt());
                break;
            case  12 :
                setDot1dStpBridgeMaxAge(binding.getVariable().toInt());
                break;
            case  13 :
                setDot1dStpBridgeHelloTime(binding.getVariable().toInt());
                break;
            case  14 :
                setDot1dStpBridgeForwardDelay(binding.getVariable().toInt());
                break;
        }
    }

    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE).append("dot1dStpProtocolSpecification", dot1dStpProtocolSpecification).append("dot1dStpPriority", dot1dStpPriority).append("dot1dStpTimeSinceTopologyChange", dot1dStpTimeSinceTopologyChange).append("dot1dStpTopChanges", dot1dStpTopChanges).append("dot1dStpDesignatedRoot", dot1dStpDesignatedRoot).append("dot1dStpRootCost", dot1dStpRootCost).append("dot1dStpRootPort", dot1dStpRootPort).append("dot1dStpMaxAge", dot1dStpMaxAge).append("dot1dStpHelloTime", dot1dStpHelloTime).append("dot1dStpHoldTime", dot1dStpHoldTime).append("dot1dStpForwardDelay", dot1dStpForwardDelay).append("dot1dStpBridgeMaxAge", dot1dStpBridgeMaxAge).append("dot1dStpBridgeHelloTime", dot1dStpBridgeHelloTime).append("dot1dStpBridgeForwardDelay", dot1dStpBridgeForwardDelay).toString();
    }

    public int hashCode() {
        return new HashCodeBuilder().append(dot1dStpProtocolSpecification).append(dot1dStpPriority).append(dot1dStpTimeSinceTopologyChange).append(dot1dStpTopChanges).append(dot1dStpDesignatedRoot).append(dot1dStpRootCost).append(dot1dStpRootPort).append(dot1dStpMaxAge).append(dot1dStpHelloTime).append(dot1dStpHoldTime).append(dot1dStpForwardDelay).append(dot1dStpBridgeMaxAge).append(dot1dStpBridgeHelloTime).append(dot1dStpBridgeForwardDelay).toHashCode();
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
        Dot1dStp rhs = ((Dot1dStp) obj);
        return new EqualsBuilder().append(dot1dStpProtocolSpecification, rhs.dot1dStpProtocolSpecification).append(dot1dStpPriority, rhs.dot1dStpPriority).append(dot1dStpTimeSinceTopologyChange, rhs.dot1dStpTimeSinceTopologyChange).append(dot1dStpTopChanges, rhs.dot1dStpTopChanges).append(dot1dStpDesignatedRoot, rhs.dot1dStpDesignatedRoot).append(dot1dStpRootCost, rhs.dot1dStpRootCost).append(dot1dStpRootPort, rhs.dot1dStpRootPort).append(dot1dStpMaxAge, rhs.dot1dStpMaxAge).append(dot1dStpHelloTime, rhs.dot1dStpHelloTime).append(dot1dStpHoldTime, rhs.dot1dStpHoldTime).append(dot1dStpForwardDelay, rhs.dot1dStpForwardDelay).append(dot1dStpBridgeMaxAge, rhs.dot1dStpBridgeMaxAge).append(dot1dStpBridgeHelloTime, rhs.dot1dStpBridgeHelloTime).append(dot1dStpBridgeForwardDelay, rhs.dot1dStpBridgeForwardDelay).isEquals();
    }

    public Dot1dStp clone() {
        Dot1dStp _copy = new Dot1dStp();
        _copy.dot1dStpProtocolSpecification = dot1dStpProtocolSpecification;
        _copy.dot1dStpPriority = dot1dStpPriority;
        _copy.dot1dStpTimeSinceTopologyChange = dot1dStpTimeSinceTopologyChange;
        _copy.dot1dStpTopChanges = dot1dStpTopChanges;
        _copy.dot1dStpDesignatedRoot = dot1dStpDesignatedRoot;
        _copy.dot1dStpRootCost = dot1dStpRootCost;
        _copy.dot1dStpRootPort = dot1dStpRootPort;
        _copy.dot1dStpMaxAge = dot1dStpMaxAge;
        _copy.dot1dStpHelloTime = dot1dStpHelloTime;
        _copy.dot1dStpHoldTime = dot1dStpHoldTime;
        _copy.dot1dStpForwardDelay = dot1dStpForwardDelay;
        _copy.dot1dStpBridgeMaxAge = dot1dStpBridgeMaxAge;
        _copy.dot1dStpBridgeHelloTime = dot1dStpBridgeHelloTime;
        _copy.dot1dStpBridgeForwardDelay = dot1dStpBridgeForwardDelay;
        return _copy;
    }

    public void set_ParentEntity(AbstractRootEntity parent) {
        parentEntity = parent;
    }

    private static DeviceEntityDescription createEntityDescription() {
        DeviceEntityDescription description = new DeviceEntityDescription(new OID("1.3.6.1.2.1.17.2"));
        description.addField(new DeviceEntityDescription.FieldDescription(1, "dot1dStpProtocolSpecification", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(2, "dot1dStpPriority", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(3, "dot1dStpTimeSinceTopologyChange", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(4, "dot1dStpTopChanges", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(5, "dot1dStpDesignatedRoot", DeviceEntityDescription.FieldType.STRING, 32));
        description.addField(new DeviceEntityDescription.FieldDescription(6, "dot1dStpRootCost", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(7, "dot1dStpRootPort", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(8, "dot1dStpMaxAge", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(9, "dot1dStpHelloTime", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(10, "dot1dStpHoldTime", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(11, "dot1dStpForwardDelay", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(12, "dot1dStpBridgeMaxAge", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(13, "dot1dStpBridgeHelloTime", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(14, "dot1dStpBridgeForwardDelay", DeviceEntityDescription.FieldType.INTEGER, -1));
        return description;
    }

    public DeviceEntityDescription get_Description() {
        return _entityDescription;
    }

}
