
package com.btisystems.mibbler.mibs.netsnmp.netsnmp.mib_2.application.appltable;

import java.io.Serializable;
import com.btisystems.mibbler.mibs.netsnmp.interfaces.mib_2.application.appltable.IApplEntry;
import com.btisystems.mibbler.mibs.netsnmp.netsnmp.mib_2.application.ApplTable;
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

public class ApplEntry
    extends DeviceEntity
    implements Serializable, IApplEntry, IIndexed, IVariableBindingSetter
{

    private int applIndex;
    private String applName;
    private String applDirectoryName;
    private String applVersion;
    private int applUptime;
    private int applOperStatus;
    private int applLastChange;
    private int applInboundAssociations;
    private int applOutboundAssociations;
    private int applAccumulatedInboundAssociations;
    private int applAccumulatedOutboundAssociations;
    private int applLastInboundActivity;
    private int applLastOutboundActivity;
    private int applRejectedInboundAssociations;
    private int applFailedOutboundAssociations;
    private String applDescription;
    private String applURL;
    private String _index;
    private ApplTable parentEntity;
    private final static DeviceEntityDescription _entityDescription = createEntityDescription();

    public ApplEntry() {
    }

    public int getApplIndex() {
        return this.applIndex;
    }

    public void setApplIndex(int applIndex) {
        int oldValue = getApplIndex();
        this.applIndex = applIndex;
        notifyChange(1, oldValue, applIndex);
    }

    public String getApplName() {
        return this.applName;
    }

    public void setApplName(String applName) {
        String oldValue = getApplName();
        this.applName = applName;
        notifyChange(2, oldValue, applName);
    }

    public String getApplDirectoryName() {
        return this.applDirectoryName;
    }

    public void setApplDirectoryName(String applDirectoryName) {
        String oldValue = getApplDirectoryName();
        this.applDirectoryName = applDirectoryName;
        notifyChange(3, oldValue, applDirectoryName);
    }

    public String getApplVersion() {
        return this.applVersion;
    }

    public void setApplVersion(String applVersion) {
        String oldValue = getApplVersion();
        this.applVersion = applVersion;
        notifyChange(4, oldValue, applVersion);
    }

    public int getApplUptime() {
        return this.applUptime;
    }

    public void setApplUptime(int applUptime) {
        int oldValue = getApplUptime();
        this.applUptime = applUptime;
        notifyChange(5, oldValue, applUptime);
    }

    public int getApplOperStatus() {
        return this.applOperStatus;
    }

    public void setApplOperStatus(int applOperStatus) {
        int oldValue = getApplOperStatus();
        this.applOperStatus = applOperStatus;
        notifyChange(6, oldValue, applOperStatus);
    }

    public int getApplLastChange() {
        return this.applLastChange;
    }

    public void setApplLastChange(int applLastChange) {
        int oldValue = getApplLastChange();
        this.applLastChange = applLastChange;
        notifyChange(7, oldValue, applLastChange);
    }

    public int getApplInboundAssociations() {
        return this.applInboundAssociations;
    }

    public void setApplInboundAssociations(int applInboundAssociations) {
        int oldValue = getApplInboundAssociations();
        this.applInboundAssociations = applInboundAssociations;
        notifyChange(8, oldValue, applInboundAssociations);
    }

    public int getApplOutboundAssociations() {
        return this.applOutboundAssociations;
    }

    public void setApplOutboundAssociations(int applOutboundAssociations) {
        int oldValue = getApplOutboundAssociations();
        this.applOutboundAssociations = applOutboundAssociations;
        notifyChange(9, oldValue, applOutboundAssociations);
    }

    public int getApplAccumulatedInboundAssociations() {
        return this.applAccumulatedInboundAssociations;
    }

    public void setApplAccumulatedInboundAssociations(int applAccumulatedInboundAssociations) {
        int oldValue = getApplAccumulatedInboundAssociations();
        this.applAccumulatedInboundAssociations = applAccumulatedInboundAssociations;
        notifyChange(10, oldValue, applAccumulatedInboundAssociations);
    }

    public int getApplAccumulatedOutboundAssociations() {
        return this.applAccumulatedOutboundAssociations;
    }

    public void setApplAccumulatedOutboundAssociations(int applAccumulatedOutboundAssociations) {
        int oldValue = getApplAccumulatedOutboundAssociations();
        this.applAccumulatedOutboundAssociations = applAccumulatedOutboundAssociations;
        notifyChange(11, oldValue, applAccumulatedOutboundAssociations);
    }

    public int getApplLastInboundActivity() {
        return this.applLastInboundActivity;
    }

    public void setApplLastInboundActivity(int applLastInboundActivity) {
        int oldValue = getApplLastInboundActivity();
        this.applLastInboundActivity = applLastInboundActivity;
        notifyChange(12, oldValue, applLastInboundActivity);
    }

    public int getApplLastOutboundActivity() {
        return this.applLastOutboundActivity;
    }

    public void setApplLastOutboundActivity(int applLastOutboundActivity) {
        int oldValue = getApplLastOutboundActivity();
        this.applLastOutboundActivity = applLastOutboundActivity;
        notifyChange(13, oldValue, applLastOutboundActivity);
    }

    public int getApplRejectedInboundAssociations() {
        return this.applRejectedInboundAssociations;
    }

    public void setApplRejectedInboundAssociations(int applRejectedInboundAssociations) {
        int oldValue = getApplRejectedInboundAssociations();
        this.applRejectedInboundAssociations = applRejectedInboundAssociations;
        notifyChange(14, oldValue, applRejectedInboundAssociations);
    }

    public int getApplFailedOutboundAssociations() {
        return this.applFailedOutboundAssociations;
    }

    public void setApplFailedOutboundAssociations(int applFailedOutboundAssociations) {
        int oldValue = getApplFailedOutboundAssociations();
        this.applFailedOutboundAssociations = applFailedOutboundAssociations;
        notifyChange(15, oldValue, applFailedOutboundAssociations);
    }

    public String getApplDescription() {
        return this.applDescription;
    }

    public void setApplDescription(String applDescription) {
        String oldValue = getApplDescription();
        this.applDescription = applDescription;
        notifyChange(16, oldValue, applDescription);
    }

    public String getApplURL() {
        return this.applURL;
    }

    public void setApplURL(String applURL) {
        String oldValue = getApplURL();
        this.applURL = applURL;
        notifyChange(17, oldValue, applURL);
    }

    public void set(VariableBinding binding) {
        switch (binding.getOid().get(9)) {
            case  1 :
                setApplIndex(binding.getVariable().toInt());
                break;
            case  2 :
                setApplName(binding.getVariable().toString());
                break;
            case  3 :
                setApplDirectoryName(binding.getVariable().toString());
                break;
            case  4 :
                setApplVersion(binding.getVariable().toString());
                break;
            case  5 :
                setApplUptime(binding.getVariable().toInt());
                break;
            case  6 :
                setApplOperStatus(binding.getVariable().toInt());
                break;
            case  7 :
                setApplLastChange(binding.getVariable().toInt());
                break;
            case  8 :
                setApplInboundAssociations(binding.getVariable().toInt());
                break;
            case  9 :
                setApplOutboundAssociations(binding.getVariable().toInt());
                break;
            case  10 :
                setApplAccumulatedInboundAssociations(binding.getVariable().toInt());
                break;
            case  11 :
                setApplAccumulatedOutboundAssociations(binding.getVariable().toInt());
                break;
            case  12 :
                setApplLastInboundActivity(binding.getVariable().toInt());
                break;
            case  13 :
                setApplLastOutboundActivity(binding.getVariable().toInt());
                break;
            case  14 :
                setApplRejectedInboundAssociations(binding.getVariable().toInt());
                break;
            case  15 :
                setApplFailedOutboundAssociations(binding.getVariable().toInt());
                break;
            case  16 :
                setApplDescription(binding.getVariable().toString());
                break;
            case  17 :
                setApplURL(binding.getVariable().toString());
                break;
        }
    }

    public void _setIndex(OID oid) {
        byte[] _oidBytes = oid.toByteArray();
        int[] _oidInts = oid.toIntArray();
        int arrayOffset = 10;
        int _len;
        _index = new OID(_oidInts, 10, (oid.size()- 10)).toString();
        setApplIndex(_oidInts[arrayOffset]);
        arrayOffset += 1;
    }

    public String _getIndex() {
        return _index;
    }

    public void _setTable(ApplTable table) {
        this.parentEntity = table;
    }

    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE).append("applIndex", applIndex).append("applName", applName).append("applDirectoryName", applDirectoryName).append("applVersion", applVersion).append("applUptime", applUptime).append("applOperStatus", applOperStatus).append("applLastChange", applLastChange).append("applInboundAssociations", applInboundAssociations).append("applOutboundAssociations", applOutboundAssociations).append("applAccumulatedInboundAssociations", applAccumulatedInboundAssociations).append("applAccumulatedOutboundAssociations", applAccumulatedOutboundAssociations).append("applLastInboundActivity", applLastInboundActivity).append("applLastOutboundActivity", applLastOutboundActivity).append("applRejectedInboundAssociations", applRejectedInboundAssociations).append("applFailedOutboundAssociations", applFailedOutboundAssociations).append("applDescription", applDescription).append("applURL", applURL).append("_index", _index).toString();
    }

    public int hashCode() {
        return new HashCodeBuilder().append(applIndex).append(applName).append(applDirectoryName).append(applVersion).append(applUptime).append(applOperStatus).append(applLastChange).append(applInboundAssociations).append(applOutboundAssociations).append(applAccumulatedInboundAssociations).append(applAccumulatedOutboundAssociations).append(applLastInboundActivity).append(applLastOutboundActivity).append(applRejectedInboundAssociations).append(applFailedOutboundAssociations).append(applDescription).append(applURL).append(_index).toHashCode();
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
        ApplEntry rhs = ((ApplEntry) obj);
        return new EqualsBuilder().append(applIndex, rhs.applIndex).append(applName, rhs.applName).append(applDirectoryName, rhs.applDirectoryName).append(applVersion, rhs.applVersion).append(applUptime, rhs.applUptime).append(applOperStatus, rhs.applOperStatus).append(applLastChange, rhs.applLastChange).append(applInboundAssociations, rhs.applInboundAssociations).append(applOutboundAssociations, rhs.applOutboundAssociations).append(applAccumulatedInboundAssociations, rhs.applAccumulatedInboundAssociations).append(applAccumulatedOutboundAssociations, rhs.applAccumulatedOutboundAssociations).append(applLastInboundActivity, rhs.applLastInboundActivity).append(applLastOutboundActivity, rhs.applLastOutboundActivity).append(applRejectedInboundAssociations, rhs.applRejectedInboundAssociations).append(applFailedOutboundAssociations, rhs.applFailedOutboundAssociations).append(applDescription, rhs.applDescription).append(applURL, rhs.applURL).append(_index, rhs._index).isEquals();
    }

    public ApplEntry clone() {
        ApplEntry _copy = new ApplEntry();
        _copy.applIndex = applIndex;
        _copy.applName = applName;
        _copy.applDirectoryName = applDirectoryName;
        _copy.applVersion = applVersion;
        _copy.applUptime = applUptime;
        _copy.applOperStatus = applOperStatus;
        _copy.applLastChange = applLastChange;
        _copy.applInboundAssociations = applInboundAssociations;
        _copy.applOutboundAssociations = applOutboundAssociations;
        _copy.applAccumulatedInboundAssociations = applAccumulatedInboundAssociations;
        _copy.applAccumulatedOutboundAssociations = applAccumulatedOutboundAssociations;
        _copy.applLastInboundActivity = applLastInboundActivity;
        _copy.applLastOutboundActivity = applLastOutboundActivity;
        _copy.applRejectedInboundAssociations = applRejectedInboundAssociations;
        _copy.applFailedOutboundAssociations = applFailedOutboundAssociations;
        _copy.applDescription = applDescription;
        _copy.applURL = applURL;
        _copy._index = _index;
        _copy.parentEntity = parentEntity;
        return _copy;
    }

    private static DeviceEntityDescription createEntityDescription() {
        DeviceEntityDescription description = new DeviceEntityDescription(new OID("1.3.6.1.2.1.27.1.1"));
        description.addField(new DeviceEntityDescription.FieldDescription(1, "applIndex", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(2, "applName", DeviceEntityDescription.FieldType.STRING, 765));
        description.addField(new DeviceEntityDescription.FieldDescription(3, "applDirectoryName", DeviceEntityDescription.FieldType.STRING, 255));
        description.addField(new DeviceEntityDescription.FieldDescription(4, "applVersion", DeviceEntityDescription.FieldType.STRING, 765));
        description.addField(new DeviceEntityDescription.FieldDescription(5, "applUptime", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(6, "applOperStatus", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(7, "applLastChange", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(8, "applInboundAssociations", DeviceEntityDescription.FieldType.UNSIGNED32, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(9, "applOutboundAssociations", DeviceEntityDescription.FieldType.UNSIGNED32, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(10, "applAccumulatedInboundAssociations", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(11, "applAccumulatedOutboundAssociations", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(12, "applLastInboundActivity", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(13, "applLastOutboundActivity", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(14, "applRejectedInboundAssociations", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(15, "applFailedOutboundAssociations", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(16, "applDescription", DeviceEntityDescription.FieldType.STRING, 765));
        description.addField(new DeviceEntityDescription.FieldDescription(17, "applURL", DeviceEntityDescription.FieldType.STRING, 255));
        return description;
    }

    public DeviceEntityDescription get_Description() {
        return _entityDescription;
    }

}
