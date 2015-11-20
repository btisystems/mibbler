
package com.btisystems.mibbler.mibs.rfc.rfc.mib_2.dot1dbridge.dot1dtp.dot1dtpporttable;

import java.io.Serializable;
import com.btisystems.mibbler.mibs.rfc.interfaces.mib_2.dot1dbridge.dot1dtp.dot1dtpporttable.IDot1dTpPortEntry;
import com.btisystems.mibbler.mibs.rfc.rfc.mib_2.dot1dbridge.dot1dtp.Dot1dTpPortTable;
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

public class Dot1dTpPortEntry
    extends DeviceEntity
    implements Serializable, IDot1dTpPortEntry, IIndexed, IVariableBindingSetter
{

    private int dot1dTpPort;
    private int dot1dTpPortMaxInfo;
    private int dot1dTpPortInFrames;
    private int dot1dTpPortOutFrames;
    private int dot1dTpPortInDiscards;
    private String _index;
    private Dot1dTpPortTable parentEntity;
    private final static DeviceEntityDescription _entityDescription = createEntityDescription();

    public Dot1dTpPortEntry() {
    }

    public int getDot1dTpPort() {
        return this.dot1dTpPort;
    }

    public void setDot1dTpPort(int dot1dTpPort) {
        int oldValue = getDot1dTpPort();
        this.dot1dTpPort = dot1dTpPort;
        notifyChange(1, oldValue, dot1dTpPort);
    }

    public int getDot1dTpPortMaxInfo() {
        return this.dot1dTpPortMaxInfo;
    }

    public void setDot1dTpPortMaxInfo(int dot1dTpPortMaxInfo) {
        int oldValue = getDot1dTpPortMaxInfo();
        this.dot1dTpPortMaxInfo = dot1dTpPortMaxInfo;
        notifyChange(2, oldValue, dot1dTpPortMaxInfo);
    }

    public int getDot1dTpPortInFrames() {
        return this.dot1dTpPortInFrames;
    }

    public void setDot1dTpPortInFrames(int dot1dTpPortInFrames) {
        int oldValue = getDot1dTpPortInFrames();
        this.dot1dTpPortInFrames = dot1dTpPortInFrames;
        notifyChange(3, oldValue, dot1dTpPortInFrames);
    }

    public int getDot1dTpPortOutFrames() {
        return this.dot1dTpPortOutFrames;
    }

    public void setDot1dTpPortOutFrames(int dot1dTpPortOutFrames) {
        int oldValue = getDot1dTpPortOutFrames();
        this.dot1dTpPortOutFrames = dot1dTpPortOutFrames;
        notifyChange(4, oldValue, dot1dTpPortOutFrames);
    }

    public int getDot1dTpPortInDiscards() {
        return this.dot1dTpPortInDiscards;
    }

    public void setDot1dTpPortInDiscards(int dot1dTpPortInDiscards) {
        int oldValue = getDot1dTpPortInDiscards();
        this.dot1dTpPortInDiscards = dot1dTpPortInDiscards;
        notifyChange(5, oldValue, dot1dTpPortInDiscards);
    }

    public void set(VariableBinding binding) {
        switch (binding.getOid().get(10)) {
            case  1 :
                setDot1dTpPort(binding.getVariable().toInt());
                break;
            case  2 :
                setDot1dTpPortMaxInfo(binding.getVariable().toInt());
                break;
            case  3 :
                setDot1dTpPortInFrames(binding.getVariable().toInt());
                break;
            case  4 :
                setDot1dTpPortOutFrames(binding.getVariable().toInt());
                break;
            case  5 :
                setDot1dTpPortInDiscards(binding.getVariable().toInt());
                break;
        }
    }

    public void _setIndex(OID oid) {
        byte[] _oidBytes = oid.toByteArray();
        int[] _oidInts = oid.toIntArray();
        int arrayOffset = 11;
        int _len;
        _index = new OID(_oidInts, 11, (oid.size()- 11)).toString();
        setDot1dTpPort(_oidInts[arrayOffset]);
        arrayOffset += 1;
    }

    public String _getIndex() {
        return _index;
    }

    public void _setTable(Dot1dTpPortTable table) {
        this.parentEntity = table;
    }

    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE).append("dot1dTpPort", dot1dTpPort).append("dot1dTpPortMaxInfo", dot1dTpPortMaxInfo).append("dot1dTpPortInFrames", dot1dTpPortInFrames).append("dot1dTpPortOutFrames", dot1dTpPortOutFrames).append("dot1dTpPortInDiscards", dot1dTpPortInDiscards).append("_index", _index).toString();
    }

    public int hashCode() {
        return new HashCodeBuilder().append(dot1dTpPort).append(dot1dTpPortMaxInfo).append(dot1dTpPortInFrames).append(dot1dTpPortOutFrames).append(dot1dTpPortInDiscards).append(_index).toHashCode();
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
        Dot1dTpPortEntry rhs = ((Dot1dTpPortEntry) obj);
        return new EqualsBuilder().append(dot1dTpPort, rhs.dot1dTpPort).append(dot1dTpPortMaxInfo, rhs.dot1dTpPortMaxInfo).append(dot1dTpPortInFrames, rhs.dot1dTpPortInFrames).append(dot1dTpPortOutFrames, rhs.dot1dTpPortOutFrames).append(dot1dTpPortInDiscards, rhs.dot1dTpPortInDiscards).append(_index, rhs._index).isEquals();
    }

    public Dot1dTpPortEntry clone() {
        Dot1dTpPortEntry _copy = new Dot1dTpPortEntry();
        _copy.dot1dTpPort = dot1dTpPort;
        _copy.dot1dTpPortMaxInfo = dot1dTpPortMaxInfo;
        _copy.dot1dTpPortInFrames = dot1dTpPortInFrames;
        _copy.dot1dTpPortOutFrames = dot1dTpPortOutFrames;
        _copy.dot1dTpPortInDiscards = dot1dTpPortInDiscards;
        _copy._index = _index;
        _copy.parentEntity = parentEntity;
        return _copy;
    }

    private static DeviceEntityDescription createEntityDescription() {
        DeviceEntityDescription description = new DeviceEntityDescription(new OID("1.3.6.1.2.1.17.4.4.1"));
        description.addField(new DeviceEntityDescription.FieldDescription(1, "dot1dTpPort", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(2, "dot1dTpPortMaxInfo", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(3, "dot1dTpPortInFrames", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(4, "dot1dTpPortOutFrames", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(5, "dot1dTpPortInDiscards", DeviceEntityDescription.FieldType.INTEGER, -1));
        return description;
    }

    public DeviceEntityDescription get_Description() {
        return _entityDescription;
    }

}
