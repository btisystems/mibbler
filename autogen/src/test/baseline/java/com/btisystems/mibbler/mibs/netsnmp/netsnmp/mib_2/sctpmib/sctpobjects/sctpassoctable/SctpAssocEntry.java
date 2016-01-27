
package com.btisystems.mibbler.mibs.netsnmp.netsnmp.mib_2.sctpmib.sctpobjects.sctpassoctable;

import java.io.Serializable;
import com.btisystems.mibbler.mibs.netsnmp.interfaces.mib_2.sctpmib.sctpobjects.sctpassoctable.ISctpAssocEntry;
import com.btisystems.mibbler.mibs.netsnmp.netsnmp.mib_2.sctpmib.sctpobjects.SctpAssocTable;
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

public class SctpAssocEntry
    extends DeviceEntity
    implements Serializable, ISctpAssocEntry, IIndexed, IVariableBindingSetter
{

    private int sctpAssocId;
    private String sctpAssocRemHostName;
    private int sctpAssocLocalPort;
    private int sctpAssocRemPort;
    private int sctpAssocRemPrimAddrType;
    private String sctpAssocRemPrimAddr;
    private Integer sctpAssocHeartBeatInterval;
    private int sctpAssocState;
    private int sctpAssocInStreams;
    private int sctpAssocOutStreams;
    private Integer sctpAssocMaxRetr;
    private int sctpAssocPrimProcess;
    private int sctpAssocT1expireds;
    private int sctpAssocT2expireds;
    private int sctpAssocRtxChunks;
    private int sctpAssocStartTime;
    private int sctpAssocDiscontinuityTime;
    private String _index;
    private SctpAssocTable parentEntity;
    private final static DeviceEntityDescription _entityDescription = createEntityDescription();

    public SctpAssocEntry() {
    }

    public int getSctpAssocId() {
        return this.sctpAssocId;
    }

    public void setSctpAssocId(int sctpAssocId) {
        int oldValue = getSctpAssocId();
        this.sctpAssocId = sctpAssocId;
        notifyChange(1, oldValue, sctpAssocId);
    }

    public String getSctpAssocRemHostName() {
        return this.sctpAssocRemHostName;
    }

    public void setSctpAssocRemHostName(String sctpAssocRemHostName) {
        String oldValue = getSctpAssocRemHostName();
        this.sctpAssocRemHostName = sctpAssocRemHostName;
        notifyChange(2, oldValue, sctpAssocRemHostName);
    }

    public int getSctpAssocLocalPort() {
        return this.sctpAssocLocalPort;
    }

    public void setSctpAssocLocalPort(int sctpAssocLocalPort) {
        int oldValue = getSctpAssocLocalPort();
        this.sctpAssocLocalPort = sctpAssocLocalPort;
        notifyChange(3, oldValue, sctpAssocLocalPort);
    }

    public int getSctpAssocRemPort() {
        return this.sctpAssocRemPort;
    }

    public void setSctpAssocRemPort(int sctpAssocRemPort) {
        int oldValue = getSctpAssocRemPort();
        this.sctpAssocRemPort = sctpAssocRemPort;
        notifyChange(4, oldValue, sctpAssocRemPort);
    }

    public int getSctpAssocRemPrimAddrType() {
        return this.sctpAssocRemPrimAddrType;
    }

    public void setSctpAssocRemPrimAddrType(int sctpAssocRemPrimAddrType) {
        int oldValue = getSctpAssocRemPrimAddrType();
        this.sctpAssocRemPrimAddrType = sctpAssocRemPrimAddrType;
        notifyChange(5, oldValue, sctpAssocRemPrimAddrType);
    }

    public String getSctpAssocRemPrimAddr() {
        return this.sctpAssocRemPrimAddr;
    }

    public void setSctpAssocRemPrimAddr(String sctpAssocRemPrimAddr) {
        String oldValue = getSctpAssocRemPrimAddr();
        this.sctpAssocRemPrimAddr = sctpAssocRemPrimAddr;
        notifyChange(6, oldValue, sctpAssocRemPrimAddr);
    }

    public int getSctpAssocHeartBeatInterval() {
        if (this.sctpAssocHeartBeatInterval == null) {
            return  30000;
        }
        return this.sctpAssocHeartBeatInterval;
    }

    public boolean isSctpAssocHeartBeatIntervalDefined() {
        return (this.sctpAssocHeartBeatInterval!= null);
    }

    public void setSctpAssocHeartBeatInterval(int sctpAssocHeartBeatInterval) {
        int oldValue = getSctpAssocHeartBeatInterval();
        this.sctpAssocHeartBeatInterval = sctpAssocHeartBeatInterval;
        notifyChange(7, oldValue, sctpAssocHeartBeatInterval);
    }

    public int getSctpAssocState() {
        return this.sctpAssocState;
    }

    public void setSctpAssocState(int sctpAssocState) {
        int oldValue = getSctpAssocState();
        this.sctpAssocState = sctpAssocState;
        notifyChange(8, oldValue, sctpAssocState);
    }

    public int getSctpAssocInStreams() {
        return this.sctpAssocInStreams;
    }

    public void setSctpAssocInStreams(int sctpAssocInStreams) {
        int oldValue = getSctpAssocInStreams();
        this.sctpAssocInStreams = sctpAssocInStreams;
        notifyChange(9, oldValue, sctpAssocInStreams);
    }

    public int getSctpAssocOutStreams() {
        return this.sctpAssocOutStreams;
    }

    public void setSctpAssocOutStreams(int sctpAssocOutStreams) {
        int oldValue = getSctpAssocOutStreams();
        this.sctpAssocOutStreams = sctpAssocOutStreams;
        notifyChange(10, oldValue, sctpAssocOutStreams);
    }

    public int getSctpAssocMaxRetr() {
        if (this.sctpAssocMaxRetr == null) {
            return  10;
        }
        return this.sctpAssocMaxRetr;
    }

    public boolean isSctpAssocMaxRetrDefined() {
        return (this.sctpAssocMaxRetr!= null);
    }

    public void setSctpAssocMaxRetr(int sctpAssocMaxRetr) {
        int oldValue = getSctpAssocMaxRetr();
        this.sctpAssocMaxRetr = sctpAssocMaxRetr;
        notifyChange(11, oldValue, sctpAssocMaxRetr);
    }

    public int getSctpAssocPrimProcess() {
        return this.sctpAssocPrimProcess;
    }

    public void setSctpAssocPrimProcess(int sctpAssocPrimProcess) {
        int oldValue = getSctpAssocPrimProcess();
        this.sctpAssocPrimProcess = sctpAssocPrimProcess;
        notifyChange(12, oldValue, sctpAssocPrimProcess);
    }

    public int getSctpAssocT1expireds() {
        return this.sctpAssocT1expireds;
    }

    public void setSctpAssocT1expireds(int sctpAssocT1expireds) {
        int oldValue = getSctpAssocT1expireds();
        this.sctpAssocT1expireds = sctpAssocT1expireds;
        notifyChange(13, oldValue, sctpAssocT1expireds);
    }

    public int getSctpAssocT2expireds() {
        return this.sctpAssocT2expireds;
    }

    public void setSctpAssocT2expireds(int sctpAssocT2expireds) {
        int oldValue = getSctpAssocT2expireds();
        this.sctpAssocT2expireds = sctpAssocT2expireds;
        notifyChange(14, oldValue, sctpAssocT2expireds);
    }

    public int getSctpAssocRtxChunks() {
        return this.sctpAssocRtxChunks;
    }

    public void setSctpAssocRtxChunks(int sctpAssocRtxChunks) {
        int oldValue = getSctpAssocRtxChunks();
        this.sctpAssocRtxChunks = sctpAssocRtxChunks;
        notifyChange(15, oldValue, sctpAssocRtxChunks);
    }

    public int getSctpAssocStartTime() {
        return this.sctpAssocStartTime;
    }

    public void setSctpAssocStartTime(int sctpAssocStartTime) {
        int oldValue = getSctpAssocStartTime();
        this.sctpAssocStartTime = sctpAssocStartTime;
        notifyChange(16, oldValue, sctpAssocStartTime);
    }

    public int getSctpAssocDiscontinuityTime() {
        return this.sctpAssocDiscontinuityTime;
    }

    public void setSctpAssocDiscontinuityTime(int sctpAssocDiscontinuityTime) {
        int oldValue = getSctpAssocDiscontinuityTime();
        this.sctpAssocDiscontinuityTime = sctpAssocDiscontinuityTime;
        notifyChange(17, oldValue, sctpAssocDiscontinuityTime);
    }

    public void set(VariableBinding binding) {
        switch (binding.getOid().get(10)) {
            case  1 :
                setSctpAssocId(binding.getVariable().toInt());
                break;
            case  2 :
                setSctpAssocRemHostName(binding.getVariable().toString());
                break;
            case  3 :
                setSctpAssocLocalPort(binding.getVariable().toInt());
                break;
            case  4 :
                setSctpAssocRemPort(binding.getVariable().toInt());
                break;
            case  5 :
                setSctpAssocRemPrimAddrType(binding.getVariable().toInt());
                break;
            case  6 :
                setSctpAssocRemPrimAddr(binding.getVariable().toString());
                break;
            case  7 :
                setSctpAssocHeartBeatInterval(binding.getVariable().toInt());
                break;
            case  8 :
                setSctpAssocState(binding.getVariable().toInt());
                break;
            case  9 :
                setSctpAssocInStreams(binding.getVariable().toInt());
                break;
            case  10 :
                setSctpAssocOutStreams(binding.getVariable().toInt());
                break;
            case  11 :
                setSctpAssocMaxRetr(binding.getVariable().toInt());
                break;
            case  12 :
                setSctpAssocPrimProcess(binding.getVariable().toInt());
                break;
            case  13 :
                setSctpAssocT1expireds(binding.getVariable().toInt());
                break;
            case  14 :
                setSctpAssocT2expireds(binding.getVariable().toInt());
                break;
            case  15 :
                setSctpAssocRtxChunks(binding.getVariable().toInt());
                break;
            case  16 :
                setSctpAssocStartTime(binding.getVariable().toInt());
                break;
            case  17 :
                setSctpAssocDiscontinuityTime(binding.getVariable().toInt());
                break;
        }
    }

    public void _setIndex(OID oid) {
        byte[] _oidBytes = oid.toByteArray();
        int[] _oidInts = oid.toIntArray();
        int arrayOffset = 11;
        int _len;
        _index = new OID(_oidInts, 11, (oid.size()- 11)).toString();
        setSctpAssocId(_oidInts[arrayOffset]);
        arrayOffset += 1;
    }

    public String _getIndex() {
        return _index;
    }

    public void _setTable(SctpAssocTable table) {
        this.parentEntity = table;
    }

    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE).append("sctpAssocId", sctpAssocId).append("sctpAssocRemHostName", sctpAssocRemHostName).append("sctpAssocLocalPort", sctpAssocLocalPort).append("sctpAssocRemPort", sctpAssocRemPort).append("sctpAssocRemPrimAddrType", sctpAssocRemPrimAddrType).append("sctpAssocRemPrimAddr", sctpAssocRemPrimAddr).append("sctpAssocHeartBeatInterval", sctpAssocHeartBeatInterval).append("sctpAssocState", sctpAssocState).append("sctpAssocInStreams", sctpAssocInStreams).append("sctpAssocOutStreams", sctpAssocOutStreams).append("sctpAssocMaxRetr", sctpAssocMaxRetr).append("sctpAssocPrimProcess", sctpAssocPrimProcess).append("sctpAssocT1expireds", sctpAssocT1expireds).append("sctpAssocT2expireds", sctpAssocT2expireds).append("sctpAssocRtxChunks", sctpAssocRtxChunks).append("sctpAssocStartTime", sctpAssocStartTime).append("sctpAssocDiscontinuityTime", sctpAssocDiscontinuityTime).append("_index", _index).toString();
    }

    public int hashCode() {
        return new HashCodeBuilder().append(sctpAssocId).append(sctpAssocRemHostName).append(sctpAssocLocalPort).append(sctpAssocRemPort).append(sctpAssocRemPrimAddrType).append(sctpAssocRemPrimAddr).append(sctpAssocHeartBeatInterval).append(sctpAssocState).append(sctpAssocInStreams).append(sctpAssocOutStreams).append(sctpAssocMaxRetr).append(sctpAssocPrimProcess).append(sctpAssocT1expireds).append(sctpAssocT2expireds).append(sctpAssocRtxChunks).append(sctpAssocStartTime).append(sctpAssocDiscontinuityTime).append(_index).toHashCode();
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
        SctpAssocEntry rhs = ((SctpAssocEntry) obj);
        return new EqualsBuilder().append(sctpAssocId, rhs.sctpAssocId).append(sctpAssocRemHostName, rhs.sctpAssocRemHostName).append(sctpAssocLocalPort, rhs.sctpAssocLocalPort).append(sctpAssocRemPort, rhs.sctpAssocRemPort).append(sctpAssocRemPrimAddrType, rhs.sctpAssocRemPrimAddrType).append(sctpAssocRemPrimAddr, rhs.sctpAssocRemPrimAddr).append(sctpAssocHeartBeatInterval, rhs.sctpAssocHeartBeatInterval).append(sctpAssocState, rhs.sctpAssocState).append(sctpAssocInStreams, rhs.sctpAssocInStreams).append(sctpAssocOutStreams, rhs.sctpAssocOutStreams).append(sctpAssocMaxRetr, rhs.sctpAssocMaxRetr).append(sctpAssocPrimProcess, rhs.sctpAssocPrimProcess).append(sctpAssocT1expireds, rhs.sctpAssocT1expireds).append(sctpAssocT2expireds, rhs.sctpAssocT2expireds).append(sctpAssocRtxChunks, rhs.sctpAssocRtxChunks).append(sctpAssocStartTime, rhs.sctpAssocStartTime).append(sctpAssocDiscontinuityTime, rhs.sctpAssocDiscontinuityTime).append(_index, rhs._index).isEquals();
    }

    public SctpAssocEntry clone() {
        SctpAssocEntry _copy = new SctpAssocEntry();
        _copy.sctpAssocId = sctpAssocId;
        _copy.sctpAssocRemHostName = sctpAssocRemHostName;
        _copy.sctpAssocLocalPort = sctpAssocLocalPort;
        _copy.sctpAssocRemPort = sctpAssocRemPort;
        _copy.sctpAssocRemPrimAddrType = sctpAssocRemPrimAddrType;
        _copy.sctpAssocRemPrimAddr = sctpAssocRemPrimAddr;
        _copy.sctpAssocHeartBeatInterval = sctpAssocHeartBeatInterval;
        _copy.sctpAssocState = sctpAssocState;
        _copy.sctpAssocInStreams = sctpAssocInStreams;
        _copy.sctpAssocOutStreams = sctpAssocOutStreams;
        _copy.sctpAssocMaxRetr = sctpAssocMaxRetr;
        _copy.sctpAssocPrimProcess = sctpAssocPrimProcess;
        _copy.sctpAssocT1expireds = sctpAssocT1expireds;
        _copy.sctpAssocT2expireds = sctpAssocT2expireds;
        _copy.sctpAssocRtxChunks = sctpAssocRtxChunks;
        _copy.sctpAssocStartTime = sctpAssocStartTime;
        _copy.sctpAssocDiscontinuityTime = sctpAssocDiscontinuityTime;
        _copy._index = _index;
        _copy.parentEntity = parentEntity;
        return _copy;
    }

    private static DeviceEntityDescription createEntityDescription() {
        DeviceEntityDescription description = new DeviceEntityDescription(new OID("1.3.6.1.2.1.104.1.3.1"));
        description.addField(new DeviceEntityDescription.FieldDescription(1, "sctpAssocId", DeviceEntityDescription.FieldType.UNSIGNED32, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(2, "sctpAssocRemHostName", DeviceEntityDescription.FieldType.STRING, 255));
        description.addField(new DeviceEntityDescription.FieldDescription(3, "sctpAssocLocalPort", DeviceEntityDescription.FieldType.UNSIGNED32, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(4, "sctpAssocRemPort", DeviceEntityDescription.FieldType.UNSIGNED32, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(5, "sctpAssocRemPrimAddrType", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(6, "sctpAssocRemPrimAddr", DeviceEntityDescription.FieldType.STRING, 255));
        description.addField(new DeviceEntityDescription.FieldDescription(7, "sctpAssocHeartBeatInterval", DeviceEntityDescription.FieldType.UNSIGNED32, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(8, "sctpAssocState", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(9, "sctpAssocInStreams", DeviceEntityDescription.FieldType.UNSIGNED32, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(10, "sctpAssocOutStreams", DeviceEntityDescription.FieldType.UNSIGNED32, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(11, "sctpAssocMaxRetr", DeviceEntityDescription.FieldType.UNSIGNED32, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(12, "sctpAssocPrimProcess", DeviceEntityDescription.FieldType.UNSIGNED32, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(13, "sctpAssocT1expireds", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(14, "sctpAssocT2expireds", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(15, "sctpAssocRtxChunks", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(16, "sctpAssocStartTime", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(17, "sctpAssocDiscontinuityTime", DeviceEntityDescription.FieldType.INTEGER, -1));
        return description;
    }

    public DeviceEntityDescription get_Description() {
        return _entityDescription;
    }

}
