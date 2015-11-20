
package com.btisystems.mibbler.mibs.bti7000.bti7000_13_2_0.mib_2.dot1dbridge;

import java.io.Serializable;
import com.btisystems.mibbler.mibs.bti7000.interfaces.mib_2.dot1dbridge.IDot1dTp;
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

public class Dot1dTp
    extends DeviceEntity
    implements Serializable, IDot1dTp, IVariableBindingSetter
{

    private int dot1dTpLearnedEntryDiscards;
    private int dot1dTpAgingTime;
    private AbstractRootEntity parentEntity;
    private final static DeviceEntityDescription _entityDescription = createEntityDescription();

    public Dot1dTp() {
    }

    public int getDot1dTpLearnedEntryDiscards() {
        return this.dot1dTpLearnedEntryDiscards;
    }

    public void setDot1dTpLearnedEntryDiscards(int dot1dTpLearnedEntryDiscards) {
        int oldValue = getDot1dTpLearnedEntryDiscards();
        this.dot1dTpLearnedEntryDiscards = dot1dTpLearnedEntryDiscards;
        notifyChange(1, oldValue, dot1dTpLearnedEntryDiscards);
    }

    public int getDot1dTpAgingTime() {
        return this.dot1dTpAgingTime;
    }

    public void setDot1dTpAgingTime(int dot1dTpAgingTime) {
        int oldValue = getDot1dTpAgingTime();
        this.dot1dTpAgingTime = dot1dTpAgingTime;
        notifyChange(2, oldValue, dot1dTpAgingTime);
    }

    public void set(VariableBinding binding) {
        switch (binding.getOid().get(8)) {
            case  1 :
                setDot1dTpLearnedEntryDiscards(binding.getVariable().toInt());
                break;
            case  2 :
                setDot1dTpAgingTime(binding.getVariable().toInt());
                break;
        }
    }

    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE).append("dot1dTpLearnedEntryDiscards", dot1dTpLearnedEntryDiscards).append("dot1dTpAgingTime", dot1dTpAgingTime).toString();
    }

    public int hashCode() {
        return new HashCodeBuilder().append(dot1dTpLearnedEntryDiscards).append(dot1dTpAgingTime).toHashCode();
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
        Dot1dTp rhs = ((Dot1dTp) obj);
        return new EqualsBuilder().append(dot1dTpLearnedEntryDiscards, rhs.dot1dTpLearnedEntryDiscards).append(dot1dTpAgingTime, rhs.dot1dTpAgingTime).isEquals();
    }

    public Dot1dTp clone() {
        Dot1dTp _copy = new Dot1dTp();
        _copy.dot1dTpLearnedEntryDiscards = dot1dTpLearnedEntryDiscards;
        _copy.dot1dTpAgingTime = dot1dTpAgingTime;
        return _copy;
    }

    public void set_ParentEntity(AbstractRootEntity parent) {
        parentEntity = parent;
    }

    private static DeviceEntityDescription createEntityDescription() {
        DeviceEntityDescription description = new DeviceEntityDescription(new OID("1.3.6.1.2.1.17.4"));
        description.addField(new DeviceEntityDescription.FieldDescription(1, "dot1dTpLearnedEntryDiscards", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(2, "dot1dTpAgingTime", DeviceEntityDescription.FieldType.INTEGER, -1));
        return description;
    }

    public DeviceEntityDescription get_Description() {
        return _entityDescription;
    }

}
