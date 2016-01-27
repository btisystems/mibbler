
package com.btisystems.mibbler.mibs.netsnmp.netsnmp.mib_2.mta.mtatable;

import java.io.Serializable;
import com.btisystems.mibbler.mibs.netsnmp.interfaces.mib_2.mta.mtatable.IMtaEntry;
import com.btisystems.mibbler.mibs.netsnmp.netsnmp.mib_2.mta.MtaTable;
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

public class MtaEntry
    extends DeviceEntity
    implements Serializable, IMtaEntry, IIndexed, IVariableBindingSetter
{

    private int mtaReceivedMessages;
    private int mtaStoredMessages;
    private int mtaTransmittedMessages;
    private int mtaReceivedVolume;
    private int mtaStoredVolume;
    private int mtaTransmittedVolume;
    private int mtaReceivedRecipients;
    private int mtaStoredRecipients;
    private int mtaTransmittedRecipients;
    private int mtaSuccessfulConvertedMessages;
    private int mtaFailedConvertedMessages;
    private int mtaLoopsDetected;
    private String _index;
    private MtaTable parentEntity;
    private final static DeviceEntityDescription _entityDescription = createEntityDescription();

    public MtaEntry() {
    }

    public int getMtaReceivedMessages() {
        return this.mtaReceivedMessages;
    }

    public void setMtaReceivedMessages(int mtaReceivedMessages) {
        int oldValue = getMtaReceivedMessages();
        this.mtaReceivedMessages = mtaReceivedMessages;
        notifyChange(1, oldValue, mtaReceivedMessages);
    }

    public int getMtaStoredMessages() {
        return this.mtaStoredMessages;
    }

    public void setMtaStoredMessages(int mtaStoredMessages) {
        int oldValue = getMtaStoredMessages();
        this.mtaStoredMessages = mtaStoredMessages;
        notifyChange(2, oldValue, mtaStoredMessages);
    }

    public int getMtaTransmittedMessages() {
        return this.mtaTransmittedMessages;
    }

    public void setMtaTransmittedMessages(int mtaTransmittedMessages) {
        int oldValue = getMtaTransmittedMessages();
        this.mtaTransmittedMessages = mtaTransmittedMessages;
        notifyChange(3, oldValue, mtaTransmittedMessages);
    }

    public int getMtaReceivedVolume() {
        return this.mtaReceivedVolume;
    }

    public void setMtaReceivedVolume(int mtaReceivedVolume) {
        int oldValue = getMtaReceivedVolume();
        this.mtaReceivedVolume = mtaReceivedVolume;
        notifyChange(4, oldValue, mtaReceivedVolume);
    }

    public int getMtaStoredVolume() {
        return this.mtaStoredVolume;
    }

    public void setMtaStoredVolume(int mtaStoredVolume) {
        int oldValue = getMtaStoredVolume();
        this.mtaStoredVolume = mtaStoredVolume;
        notifyChange(5, oldValue, mtaStoredVolume);
    }

    public int getMtaTransmittedVolume() {
        return this.mtaTransmittedVolume;
    }

    public void setMtaTransmittedVolume(int mtaTransmittedVolume) {
        int oldValue = getMtaTransmittedVolume();
        this.mtaTransmittedVolume = mtaTransmittedVolume;
        notifyChange(6, oldValue, mtaTransmittedVolume);
    }

    public int getMtaReceivedRecipients() {
        return this.mtaReceivedRecipients;
    }

    public void setMtaReceivedRecipients(int mtaReceivedRecipients) {
        int oldValue = getMtaReceivedRecipients();
        this.mtaReceivedRecipients = mtaReceivedRecipients;
        notifyChange(7, oldValue, mtaReceivedRecipients);
    }

    public int getMtaStoredRecipients() {
        return this.mtaStoredRecipients;
    }

    public void setMtaStoredRecipients(int mtaStoredRecipients) {
        int oldValue = getMtaStoredRecipients();
        this.mtaStoredRecipients = mtaStoredRecipients;
        notifyChange(8, oldValue, mtaStoredRecipients);
    }

    public int getMtaTransmittedRecipients() {
        return this.mtaTransmittedRecipients;
    }

    public void setMtaTransmittedRecipients(int mtaTransmittedRecipients) {
        int oldValue = getMtaTransmittedRecipients();
        this.mtaTransmittedRecipients = mtaTransmittedRecipients;
        notifyChange(9, oldValue, mtaTransmittedRecipients);
    }

    public int getMtaSuccessfulConvertedMessages() {
        return this.mtaSuccessfulConvertedMessages;
    }

    public void setMtaSuccessfulConvertedMessages(int mtaSuccessfulConvertedMessages) {
        int oldValue = getMtaSuccessfulConvertedMessages();
        this.mtaSuccessfulConvertedMessages = mtaSuccessfulConvertedMessages;
        notifyChange(10, oldValue, mtaSuccessfulConvertedMessages);
    }

    public int getMtaFailedConvertedMessages() {
        return this.mtaFailedConvertedMessages;
    }

    public void setMtaFailedConvertedMessages(int mtaFailedConvertedMessages) {
        int oldValue = getMtaFailedConvertedMessages();
        this.mtaFailedConvertedMessages = mtaFailedConvertedMessages;
        notifyChange(11, oldValue, mtaFailedConvertedMessages);
    }

    public int getMtaLoopsDetected() {
        return this.mtaLoopsDetected;
    }

    public void setMtaLoopsDetected(int mtaLoopsDetected) {
        int oldValue = getMtaLoopsDetected();
        this.mtaLoopsDetected = mtaLoopsDetected;
        notifyChange(12, oldValue, mtaLoopsDetected);
    }

    public void set(VariableBinding binding) {
        switch (binding.getOid().get(9)) {
            case  1 :
                setMtaReceivedMessages(binding.getVariable().toInt());
                break;
            case  2 :
                setMtaStoredMessages(binding.getVariable().toInt());
                break;
            case  3 :
                setMtaTransmittedMessages(binding.getVariable().toInt());
                break;
            case  4 :
                setMtaReceivedVolume(binding.getVariable().toInt());
                break;
            case  5 :
                setMtaStoredVolume(binding.getVariable().toInt());
                break;
            case  6 :
                setMtaTransmittedVolume(binding.getVariable().toInt());
                break;
            case  7 :
                setMtaReceivedRecipients(binding.getVariable().toInt());
                break;
            case  8 :
                setMtaStoredRecipients(binding.getVariable().toInt());
                break;
            case  9 :
                setMtaTransmittedRecipients(binding.getVariable().toInt());
                break;
            case  10 :
                setMtaSuccessfulConvertedMessages(binding.getVariable().toInt());
                break;
            case  11 :
                setMtaFailedConvertedMessages(binding.getVariable().toInt());
                break;
            case  12 :
                setMtaLoopsDetected(binding.getVariable().toInt());
                break;
        }
    }

    public void _setIndex(OID oid) {
        byte[] _oidBytes = oid.toByteArray();
        int[] _oidInts = oid.toIntArray();
        int arrayOffset = 10;
        int _len;
        _index = new OID(_oidInts, 10, (oid.size()- 10)).toString();
        arrayOffset += 1;
    }

    public String _getIndex() {
        return _index;
    }

    public void _setTable(MtaTable table) {
        this.parentEntity = table;
    }

    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE).append("mtaReceivedMessages", mtaReceivedMessages).append("mtaStoredMessages", mtaStoredMessages).append("mtaTransmittedMessages", mtaTransmittedMessages).append("mtaReceivedVolume", mtaReceivedVolume).append("mtaStoredVolume", mtaStoredVolume).append("mtaTransmittedVolume", mtaTransmittedVolume).append("mtaReceivedRecipients", mtaReceivedRecipients).append("mtaStoredRecipients", mtaStoredRecipients).append("mtaTransmittedRecipients", mtaTransmittedRecipients).append("mtaSuccessfulConvertedMessages", mtaSuccessfulConvertedMessages).append("mtaFailedConvertedMessages", mtaFailedConvertedMessages).append("mtaLoopsDetected", mtaLoopsDetected).append("_index", _index).toString();
    }

    public int hashCode() {
        return new HashCodeBuilder().append(mtaReceivedMessages).append(mtaStoredMessages).append(mtaTransmittedMessages).append(mtaReceivedVolume).append(mtaStoredVolume).append(mtaTransmittedVolume).append(mtaReceivedRecipients).append(mtaStoredRecipients).append(mtaTransmittedRecipients).append(mtaSuccessfulConvertedMessages).append(mtaFailedConvertedMessages).append(mtaLoopsDetected).append(_index).toHashCode();
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
        MtaEntry rhs = ((MtaEntry) obj);
        return new EqualsBuilder().append(mtaReceivedMessages, rhs.mtaReceivedMessages).append(mtaStoredMessages, rhs.mtaStoredMessages).append(mtaTransmittedMessages, rhs.mtaTransmittedMessages).append(mtaReceivedVolume, rhs.mtaReceivedVolume).append(mtaStoredVolume, rhs.mtaStoredVolume).append(mtaTransmittedVolume, rhs.mtaTransmittedVolume).append(mtaReceivedRecipients, rhs.mtaReceivedRecipients).append(mtaStoredRecipients, rhs.mtaStoredRecipients).append(mtaTransmittedRecipients, rhs.mtaTransmittedRecipients).append(mtaSuccessfulConvertedMessages, rhs.mtaSuccessfulConvertedMessages).append(mtaFailedConvertedMessages, rhs.mtaFailedConvertedMessages).append(mtaLoopsDetected, rhs.mtaLoopsDetected).append(_index, rhs._index).isEquals();
    }

    public MtaEntry clone() {
        MtaEntry _copy = new MtaEntry();
        _copy.mtaReceivedMessages = mtaReceivedMessages;
        _copy.mtaStoredMessages = mtaStoredMessages;
        _copy.mtaTransmittedMessages = mtaTransmittedMessages;
        _copy.mtaReceivedVolume = mtaReceivedVolume;
        _copy.mtaStoredVolume = mtaStoredVolume;
        _copy.mtaTransmittedVolume = mtaTransmittedVolume;
        _copy.mtaReceivedRecipients = mtaReceivedRecipients;
        _copy.mtaStoredRecipients = mtaStoredRecipients;
        _copy.mtaTransmittedRecipients = mtaTransmittedRecipients;
        _copy.mtaSuccessfulConvertedMessages = mtaSuccessfulConvertedMessages;
        _copy.mtaFailedConvertedMessages = mtaFailedConvertedMessages;
        _copy.mtaLoopsDetected = mtaLoopsDetected;
        _copy._index = _index;
        _copy.parentEntity = parentEntity;
        return _copy;
    }

    private static DeviceEntityDescription createEntityDescription() {
        DeviceEntityDescription description = new DeviceEntityDescription(new OID("1.3.6.1.2.1.28.1.1"));
        description.addField(new DeviceEntityDescription.FieldDescription(1, "mtaReceivedMessages", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(2, "mtaStoredMessages", DeviceEntityDescription.FieldType.UNSIGNED32, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(3, "mtaTransmittedMessages", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(4, "mtaReceivedVolume", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(5, "mtaStoredVolume", DeviceEntityDescription.FieldType.UNSIGNED32, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(6, "mtaTransmittedVolume", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(7, "mtaReceivedRecipients", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(8, "mtaStoredRecipients", DeviceEntityDescription.FieldType.UNSIGNED32, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(9, "mtaTransmittedRecipients", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(10, "mtaSuccessfulConvertedMessages", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(11, "mtaFailedConvertedMessages", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(12, "mtaLoopsDetected", DeviceEntityDescription.FieldType.INTEGER, -1));
        return description;
    }

    public DeviceEntityDescription get_Description() {
        return _entityDescription;
    }

}
