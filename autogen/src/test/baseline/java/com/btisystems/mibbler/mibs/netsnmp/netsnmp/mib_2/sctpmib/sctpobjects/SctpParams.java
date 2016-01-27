
package com.btisystems.mibbler.mibs.netsnmp.netsnmp.mib_2.sctpmib.sctpobjects;

import java.io.Serializable;
import com.btisystems.mibbler.mibs.netsnmp.interfaces.mib_2.sctpmib.sctpobjects.ISctpParams;
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

public class SctpParams
    extends DeviceEntity
    implements Serializable, ISctpParams, IVariableBindingSetter
{

    private Integer sctpRtoAlgorithm;
    private Integer sctpRtoMin;
    private Integer sctpRtoMax;
    private Integer sctpRtoInitial;
    private int sctpMaxAssocs;
    private Integer sctpValCookieLife;
    private Integer sctpMaxInitRetr;
    private AbstractRootEntity parentEntity;
    private final static DeviceEntityDescription _entityDescription = createEntityDescription();

    public SctpParams() {
    }

    public int getSctpRtoAlgorithm() {
        if (this.sctpRtoAlgorithm == null) {
            return  2;
        }
        return this.sctpRtoAlgorithm;
    }

    public boolean isSctpRtoAlgorithmDefined() {
        return (this.sctpRtoAlgorithm!= null);
    }

    public void setSctpRtoAlgorithm(int sctpRtoAlgorithm) {
        int oldValue = getSctpRtoAlgorithm();
        this.sctpRtoAlgorithm = sctpRtoAlgorithm;
        notifyChange(1, oldValue, sctpRtoAlgorithm);
    }

    public int getSctpRtoMin() {
        if (this.sctpRtoMin == null) {
            return  1000;
        }
        return this.sctpRtoMin;
    }

    public boolean isSctpRtoMinDefined() {
        return (this.sctpRtoMin!= null);
    }

    public void setSctpRtoMin(int sctpRtoMin) {
        int oldValue = getSctpRtoMin();
        this.sctpRtoMin = sctpRtoMin;
        notifyChange(2, oldValue, sctpRtoMin);
    }

    public int getSctpRtoMax() {
        if (this.sctpRtoMax == null) {
            return  60000;
        }
        return this.sctpRtoMax;
    }

    public boolean isSctpRtoMaxDefined() {
        return (this.sctpRtoMax!= null);
    }

    public void setSctpRtoMax(int sctpRtoMax) {
        int oldValue = getSctpRtoMax();
        this.sctpRtoMax = sctpRtoMax;
        notifyChange(3, oldValue, sctpRtoMax);
    }

    public int getSctpRtoInitial() {
        if (this.sctpRtoInitial == null) {
            return  3000;
        }
        return this.sctpRtoInitial;
    }

    public boolean isSctpRtoInitialDefined() {
        return (this.sctpRtoInitial!= null);
    }

    public void setSctpRtoInitial(int sctpRtoInitial) {
        int oldValue = getSctpRtoInitial();
        this.sctpRtoInitial = sctpRtoInitial;
        notifyChange(4, oldValue, sctpRtoInitial);
    }

    public int getSctpMaxAssocs() {
        return this.sctpMaxAssocs;
    }

    public void setSctpMaxAssocs(int sctpMaxAssocs) {
        int oldValue = getSctpMaxAssocs();
        this.sctpMaxAssocs = sctpMaxAssocs;
        notifyChange(5, oldValue, sctpMaxAssocs);
    }

    public int getSctpValCookieLife() {
        if (this.sctpValCookieLife == null) {
            return  60000;
        }
        return this.sctpValCookieLife;
    }

    public boolean isSctpValCookieLifeDefined() {
        return (this.sctpValCookieLife!= null);
    }

    public void setSctpValCookieLife(int sctpValCookieLife) {
        int oldValue = getSctpValCookieLife();
        this.sctpValCookieLife = sctpValCookieLife;
        notifyChange(6, oldValue, sctpValCookieLife);
    }

    public int getSctpMaxInitRetr() {
        if (this.sctpMaxInitRetr == null) {
            return  8;
        }
        return this.sctpMaxInitRetr;
    }

    public boolean isSctpMaxInitRetrDefined() {
        return (this.sctpMaxInitRetr!= null);
    }

    public void setSctpMaxInitRetr(int sctpMaxInitRetr) {
        int oldValue = getSctpMaxInitRetr();
        this.sctpMaxInitRetr = sctpMaxInitRetr;
        notifyChange(7, oldValue, sctpMaxInitRetr);
    }

    public void set(VariableBinding binding) {
        switch (binding.getOid().get(9)) {
            case  1 :
                setSctpRtoAlgorithm(binding.getVariable().toInt());
                break;
            case  2 :
                setSctpRtoMin(binding.getVariable().toInt());
                break;
            case  3 :
                setSctpRtoMax(binding.getVariable().toInt());
                break;
            case  4 :
                setSctpRtoInitial(binding.getVariable().toInt());
                break;
            case  5 :
                setSctpMaxAssocs(binding.getVariable().toInt());
                break;
            case  6 :
                setSctpValCookieLife(binding.getVariable().toInt());
                break;
            case  7 :
                setSctpMaxInitRetr(binding.getVariable().toInt());
                break;
        }
    }

    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE).append("sctpRtoAlgorithm", sctpRtoAlgorithm).append("sctpRtoMin", sctpRtoMin).append("sctpRtoMax", sctpRtoMax).append("sctpRtoInitial", sctpRtoInitial).append("sctpMaxAssocs", sctpMaxAssocs).append("sctpValCookieLife", sctpValCookieLife).append("sctpMaxInitRetr", sctpMaxInitRetr).toString();
    }

    public int hashCode() {
        return new HashCodeBuilder().append(sctpRtoAlgorithm).append(sctpRtoMin).append(sctpRtoMax).append(sctpRtoInitial).append(sctpMaxAssocs).append(sctpValCookieLife).append(sctpMaxInitRetr).toHashCode();
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
        SctpParams rhs = ((SctpParams) obj);
        return new EqualsBuilder().append(sctpRtoAlgorithm, rhs.sctpRtoAlgorithm).append(sctpRtoMin, rhs.sctpRtoMin).append(sctpRtoMax, rhs.sctpRtoMax).append(sctpRtoInitial, rhs.sctpRtoInitial).append(sctpMaxAssocs, rhs.sctpMaxAssocs).append(sctpValCookieLife, rhs.sctpValCookieLife).append(sctpMaxInitRetr, rhs.sctpMaxInitRetr).isEquals();
    }

    public SctpParams clone() {
        SctpParams _copy = new SctpParams();
        _copy.sctpRtoAlgorithm = sctpRtoAlgorithm;
        _copy.sctpRtoMin = sctpRtoMin;
        _copy.sctpRtoMax = sctpRtoMax;
        _copy.sctpRtoInitial = sctpRtoInitial;
        _copy.sctpMaxAssocs = sctpMaxAssocs;
        _copy.sctpValCookieLife = sctpValCookieLife;
        _copy.sctpMaxInitRetr = sctpMaxInitRetr;
        return _copy;
    }

    public void set_ParentEntity(AbstractRootEntity parent) {
        parentEntity = parent;
    }

    private static DeviceEntityDescription createEntityDescription() {
        DeviceEntityDescription description = new DeviceEntityDescription(new OID("1.3.6.1.2.1.104.1.2"));
        description.addField(new DeviceEntityDescription.FieldDescription(1, "sctpRtoAlgorithm", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(2, "sctpRtoMin", DeviceEntityDescription.FieldType.UNSIGNED32, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(3, "sctpRtoMax", DeviceEntityDescription.FieldType.UNSIGNED32, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(4, "sctpRtoInitial", DeviceEntityDescription.FieldType.UNSIGNED32, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(5, "sctpMaxAssocs", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(6, "sctpValCookieLife", DeviceEntityDescription.FieldType.UNSIGNED32, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(7, "sctpMaxInitRetr", DeviceEntityDescription.FieldType.UNSIGNED32, -1));
        return description;
    }

    public DeviceEntityDescription get_Description() {
        return _entityDescription;
    }

}
