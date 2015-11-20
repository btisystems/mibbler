
package com.btisystems.mibbler.mibs.rfc.rfc.mib_2.rmon;

import java.io.Serializable;
import com.btisystems.mibbler.mibs.rfc.interfaces.mib_2.rmon.IProbeConfig;
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

public class ProbeConfig
    extends DeviceEntity
    implements Serializable, IProbeConfig, IVariableBindingSetter
{

    private String probeCapabilities;
    private String probeSoftwareRev;
    private String probeHardwareRev;
    private String probeDateTime;
    private int probeResetControl;
    private String probeDownloadFile;
    private String probeDownloadTFTPServer;
    private int probeDownloadAction;
    private int probeDownloadStatus;
    private String netDefaultGateway;
    private AbstractRootEntity parentEntity;
    private final static DeviceEntityDescription _entityDescription = createEntityDescription();

    public ProbeConfig() {
    }

    public String getProbeCapabilities() {
        return this.probeCapabilities;
    }

    public void setProbeCapabilities(String probeCapabilities) {
        String oldValue = getProbeCapabilities();
        this.probeCapabilities = probeCapabilities;
        notifyChange(1, oldValue, probeCapabilities);
    }

    public String getProbeSoftwareRev() {
        return this.probeSoftwareRev;
    }

    public void setProbeSoftwareRev(String probeSoftwareRev) {
        String oldValue = getProbeSoftwareRev();
        this.probeSoftwareRev = probeSoftwareRev;
        notifyChange(2, oldValue, probeSoftwareRev);
    }

    public String getProbeHardwareRev() {
        return this.probeHardwareRev;
    }

    public void setProbeHardwareRev(String probeHardwareRev) {
        String oldValue = getProbeHardwareRev();
        this.probeHardwareRev = probeHardwareRev;
        notifyChange(3, oldValue, probeHardwareRev);
    }

    public String getProbeDateTime() {
        return this.probeDateTime;
    }

    public void setProbeDateTime(String probeDateTime) {
        String oldValue = getProbeDateTime();
        this.probeDateTime = probeDateTime;
        notifyChange(4, oldValue, probeDateTime);
    }

    public int getProbeResetControl() {
        return this.probeResetControl;
    }

    public void setProbeResetControl(int probeResetControl) {
        int oldValue = getProbeResetControl();
        this.probeResetControl = probeResetControl;
        notifyChange(5, oldValue, probeResetControl);
    }

    public String getProbeDownloadFile() {
        return this.probeDownloadFile;
    }

    public void setProbeDownloadFile(String probeDownloadFile) {
        String oldValue = getProbeDownloadFile();
        this.probeDownloadFile = probeDownloadFile;
        notifyChange(6, oldValue, probeDownloadFile);
    }

    public String getProbeDownloadTFTPServer() {
        return this.probeDownloadTFTPServer;
    }

    public void setProbeDownloadTFTPServer(String probeDownloadTFTPServer) {
        String oldValue = getProbeDownloadTFTPServer();
        this.probeDownloadTFTPServer = probeDownloadTFTPServer;
        notifyChange(7, oldValue, probeDownloadTFTPServer);
    }

    public int getProbeDownloadAction() {
        return this.probeDownloadAction;
    }

    public void setProbeDownloadAction(int probeDownloadAction) {
        int oldValue = getProbeDownloadAction();
        this.probeDownloadAction = probeDownloadAction;
        notifyChange(8, oldValue, probeDownloadAction);
    }

    public int getProbeDownloadStatus() {
        return this.probeDownloadStatus;
    }

    public void setProbeDownloadStatus(int probeDownloadStatus) {
        int oldValue = getProbeDownloadStatus();
        this.probeDownloadStatus = probeDownloadStatus;
        notifyChange(9, oldValue, probeDownloadStatus);
    }

    public String getNetDefaultGateway() {
        return this.netDefaultGateway;
    }

    public void setNetDefaultGateway(String netDefaultGateway) {
        String oldValue = getNetDefaultGateway();
        this.netDefaultGateway = netDefaultGateway;
        notifyChange(12, oldValue, netDefaultGateway);
    }

    public void set(VariableBinding binding) {
        switch (binding.getOid().get(8)) {
            case  1 :
                setProbeCapabilities(binding.getVariable().toString());
                break;
            case  2 :
                setProbeSoftwareRev(binding.getVariable().toString());
                break;
            case  3 :
                setProbeHardwareRev(binding.getVariable().toString());
                break;
            case  4 :
                setProbeDateTime(binding.getVariable().toString());
                break;
            case  5 :
                setProbeResetControl(binding.getVariable().toInt());
                break;
            case  6 :
                setProbeDownloadFile(binding.getVariable().toString());
                break;
            case  7 :
                setProbeDownloadTFTPServer(binding.getVariable().toString());
                break;
            case  8 :
                setProbeDownloadAction(binding.getVariable().toInt());
                break;
            case  9 :
                setProbeDownloadStatus(binding.getVariable().toInt());
                break;
            case  12 :
                setNetDefaultGateway(binding.getVariable().toString());
                break;
        }
    }

    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE).append("probeCapabilities", probeCapabilities).append("probeSoftwareRev", probeSoftwareRev).append("probeHardwareRev", probeHardwareRev).append("probeDateTime", probeDateTime).append("probeResetControl", probeResetControl).append("probeDownloadFile", probeDownloadFile).append("probeDownloadTFTPServer", probeDownloadTFTPServer).append("probeDownloadAction", probeDownloadAction).append("probeDownloadStatus", probeDownloadStatus).append("netDefaultGateway", netDefaultGateway).toString();
    }

    public int hashCode() {
        return new HashCodeBuilder().append(probeCapabilities).append(probeSoftwareRev).append(probeHardwareRev).append(probeDateTime).append(probeResetControl).append(probeDownloadFile).append(probeDownloadTFTPServer).append(probeDownloadAction).append(probeDownloadStatus).append(netDefaultGateway).toHashCode();
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
        ProbeConfig rhs = ((ProbeConfig) obj);
        return new EqualsBuilder().append(probeCapabilities, rhs.probeCapabilities).append(probeSoftwareRev, rhs.probeSoftwareRev).append(probeHardwareRev, rhs.probeHardwareRev).append(probeDateTime, rhs.probeDateTime).append(probeResetControl, rhs.probeResetControl).append(probeDownloadFile, rhs.probeDownloadFile).append(probeDownloadTFTPServer, rhs.probeDownloadTFTPServer).append(probeDownloadAction, rhs.probeDownloadAction).append(probeDownloadStatus, rhs.probeDownloadStatus).append(netDefaultGateway, rhs.netDefaultGateway).isEquals();
    }

    public ProbeConfig clone() {
        ProbeConfig _copy = new ProbeConfig();
        _copy.probeCapabilities = probeCapabilities;
        _copy.probeSoftwareRev = probeSoftwareRev;
        _copy.probeHardwareRev = probeHardwareRev;
        _copy.probeDateTime = probeDateTime;
        _copy.probeResetControl = probeResetControl;
        _copy.probeDownloadFile = probeDownloadFile;
        _copy.probeDownloadTFTPServer = probeDownloadTFTPServer;
        _copy.probeDownloadAction = probeDownloadAction;
        _copy.probeDownloadStatus = probeDownloadStatus;
        _copy.netDefaultGateway = netDefaultGateway;
        return _copy;
    }

    public void set_ParentEntity(AbstractRootEntity parent) {
        parentEntity = parent;
    }

    private static DeviceEntityDescription createEntityDescription() {
        DeviceEntityDescription description = new DeviceEntityDescription(new OID("1.3.6.1.2.1.16.19"));
        description.addField(new DeviceEntityDescription.FieldDescription(1, "probeCapabilities", DeviceEntityDescription.FieldType.BITS, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(2, "probeSoftwareRev", DeviceEntityDescription.FieldType.STRING, 255));
        description.addField(new DeviceEntityDescription.FieldDescription(3, "probeHardwareRev", DeviceEntityDescription.FieldType.STRING, 255));
        description.addField(new DeviceEntityDescription.FieldDescription(4, "probeDateTime", DeviceEntityDescription.FieldType.STRING, 44));
        description.addField(new DeviceEntityDescription.FieldDescription(5, "probeResetControl", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(6, "probeDownloadFile", DeviceEntityDescription.FieldType.STRING, 255));
        description.addField(new DeviceEntityDescription.FieldDescription(7, "probeDownloadTFTPServer", DeviceEntityDescription.FieldType.IP_ADDRESS, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(8, "probeDownloadAction", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(9, "probeDownloadStatus", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(12, "netDefaultGateway", DeviceEntityDescription.FieldType.IP_ADDRESS, -1));
        return description;
    }

    public DeviceEntityDescription get_Description() {
        return _entityDescription;
    }

}
