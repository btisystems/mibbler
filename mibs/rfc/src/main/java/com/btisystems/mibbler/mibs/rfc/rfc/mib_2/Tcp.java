
package com.btisystems.mibbler.mibs.rfc.rfc.mib_2;

import java.io.Serializable;
import com.btisystems.mibbler.mibs.rfc.interfaces.mib_2.ITcp;
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

public class Tcp
    extends DeviceEntity
    implements Serializable, ITcp, IVariableBindingSetter
{

    private int tcpRtoAlgorithm;
    private int tcpRtoMin;
    private int tcpRtoMax;
    private int tcpMaxConn;
    private int tcpActiveOpens;
    private int tcpPassiveOpens;
    private int tcpAttemptFails;
    private int tcpEstabResets;
    private int tcpCurrEstab;
    private int tcpInSegs;
    private int tcpOutSegs;
    private int tcpRetransSegs;
    private int tcpInErrs;
    private int tcpOutRsts;
    private AbstractRootEntity parentEntity;
    private final static DeviceEntityDescription _entityDescription = createEntityDescription();

    public Tcp() {
    }

    public int getTcpRtoAlgorithm() {
        return this.tcpRtoAlgorithm;
    }

    public void setTcpRtoAlgorithm(int tcpRtoAlgorithm) {
        int oldValue = getTcpRtoAlgorithm();
        this.tcpRtoAlgorithm = tcpRtoAlgorithm;
        notifyChange(1, oldValue, tcpRtoAlgorithm);
    }

    public int getTcpRtoMin() {
        return this.tcpRtoMin;
    }

    public void setTcpRtoMin(int tcpRtoMin) {
        int oldValue = getTcpRtoMin();
        this.tcpRtoMin = tcpRtoMin;
        notifyChange(2, oldValue, tcpRtoMin);
    }

    public int getTcpRtoMax() {
        return this.tcpRtoMax;
    }

    public void setTcpRtoMax(int tcpRtoMax) {
        int oldValue = getTcpRtoMax();
        this.tcpRtoMax = tcpRtoMax;
        notifyChange(3, oldValue, tcpRtoMax);
    }

    public int getTcpMaxConn() {
        return this.tcpMaxConn;
    }

    public void setTcpMaxConn(int tcpMaxConn) {
        int oldValue = getTcpMaxConn();
        this.tcpMaxConn = tcpMaxConn;
        notifyChange(4, oldValue, tcpMaxConn);
    }

    public int getTcpActiveOpens() {
        return this.tcpActiveOpens;
    }

    public void setTcpActiveOpens(int tcpActiveOpens) {
        int oldValue = getTcpActiveOpens();
        this.tcpActiveOpens = tcpActiveOpens;
        notifyChange(5, oldValue, tcpActiveOpens);
    }

    public int getTcpPassiveOpens() {
        return this.tcpPassiveOpens;
    }

    public void setTcpPassiveOpens(int tcpPassiveOpens) {
        int oldValue = getTcpPassiveOpens();
        this.tcpPassiveOpens = tcpPassiveOpens;
        notifyChange(6, oldValue, tcpPassiveOpens);
    }

    public int getTcpAttemptFails() {
        return this.tcpAttemptFails;
    }

    public void setTcpAttemptFails(int tcpAttemptFails) {
        int oldValue = getTcpAttemptFails();
        this.tcpAttemptFails = tcpAttemptFails;
        notifyChange(7, oldValue, tcpAttemptFails);
    }

    public int getTcpEstabResets() {
        return this.tcpEstabResets;
    }

    public void setTcpEstabResets(int tcpEstabResets) {
        int oldValue = getTcpEstabResets();
        this.tcpEstabResets = tcpEstabResets;
        notifyChange(8, oldValue, tcpEstabResets);
    }

    public int getTcpCurrEstab() {
        return this.tcpCurrEstab;
    }

    public void setTcpCurrEstab(int tcpCurrEstab) {
        int oldValue = getTcpCurrEstab();
        this.tcpCurrEstab = tcpCurrEstab;
        notifyChange(9, oldValue, tcpCurrEstab);
    }

    public int getTcpInSegs() {
        return this.tcpInSegs;
    }

    public void setTcpInSegs(int tcpInSegs) {
        int oldValue = getTcpInSegs();
        this.tcpInSegs = tcpInSegs;
        notifyChange(10, oldValue, tcpInSegs);
    }

    public int getTcpOutSegs() {
        return this.tcpOutSegs;
    }

    public void setTcpOutSegs(int tcpOutSegs) {
        int oldValue = getTcpOutSegs();
        this.tcpOutSegs = tcpOutSegs;
        notifyChange(11, oldValue, tcpOutSegs);
    }

    public int getTcpRetransSegs() {
        return this.tcpRetransSegs;
    }

    public void setTcpRetransSegs(int tcpRetransSegs) {
        int oldValue = getTcpRetransSegs();
        this.tcpRetransSegs = tcpRetransSegs;
        notifyChange(12, oldValue, tcpRetransSegs);
    }

    public int getTcpInErrs() {
        return this.tcpInErrs;
    }

    public void setTcpInErrs(int tcpInErrs) {
        int oldValue = getTcpInErrs();
        this.tcpInErrs = tcpInErrs;
        notifyChange(14, oldValue, tcpInErrs);
    }

    public int getTcpOutRsts() {
        return this.tcpOutRsts;
    }

    public void setTcpOutRsts(int tcpOutRsts) {
        int oldValue = getTcpOutRsts();
        this.tcpOutRsts = tcpOutRsts;
        notifyChange(15, oldValue, tcpOutRsts);
    }

    public void set(VariableBinding binding) {
        switch (binding.getOid().get(7)) {
            case  1 :
                setTcpRtoAlgorithm(binding.getVariable().toInt());
                break;
            case  2 :
                setTcpRtoMin(binding.getVariable().toInt());
                break;
            case  3 :
                setTcpRtoMax(binding.getVariable().toInt());
                break;
            case  4 :
                setTcpMaxConn(binding.getVariable().toInt());
                break;
            case  5 :
                setTcpActiveOpens(binding.getVariable().toInt());
                break;
            case  6 :
                setTcpPassiveOpens(binding.getVariable().toInt());
                break;
            case  7 :
                setTcpAttemptFails(binding.getVariable().toInt());
                break;
            case  8 :
                setTcpEstabResets(binding.getVariable().toInt());
                break;
            case  9 :
                setTcpCurrEstab(binding.getVariable().toInt());
                break;
            case  10 :
                setTcpInSegs(binding.getVariable().toInt());
                break;
            case  11 :
                setTcpOutSegs(binding.getVariable().toInt());
                break;
            case  12 :
                setTcpRetransSegs(binding.getVariable().toInt());
                break;
            case  14 :
                setTcpInErrs(binding.getVariable().toInt());
                break;
            case  15 :
                setTcpOutRsts(binding.getVariable().toInt());
                break;
        }
    }

    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE).append("tcpRtoAlgorithm", tcpRtoAlgorithm).append("tcpRtoMin", tcpRtoMin).append("tcpRtoMax", tcpRtoMax).append("tcpMaxConn", tcpMaxConn).append("tcpActiveOpens", tcpActiveOpens).append("tcpPassiveOpens", tcpPassiveOpens).append("tcpAttemptFails", tcpAttemptFails).append("tcpEstabResets", tcpEstabResets).append("tcpCurrEstab", tcpCurrEstab).append("tcpInSegs", tcpInSegs).append("tcpOutSegs", tcpOutSegs).append("tcpRetransSegs", tcpRetransSegs).append("tcpInErrs", tcpInErrs).append("tcpOutRsts", tcpOutRsts).toString();
    }

    public int hashCode() {
        return new HashCodeBuilder().append(tcpRtoAlgorithm).append(tcpRtoMin).append(tcpRtoMax).append(tcpMaxConn).append(tcpActiveOpens).append(tcpPassiveOpens).append(tcpAttemptFails).append(tcpEstabResets).append(tcpCurrEstab).append(tcpInSegs).append(tcpOutSegs).append(tcpRetransSegs).append(tcpInErrs).append(tcpOutRsts).toHashCode();
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
        Tcp rhs = ((Tcp) obj);
        return new EqualsBuilder().append(tcpRtoAlgorithm, rhs.tcpRtoAlgorithm).append(tcpRtoMin, rhs.tcpRtoMin).append(tcpRtoMax, rhs.tcpRtoMax).append(tcpMaxConn, rhs.tcpMaxConn).append(tcpActiveOpens, rhs.tcpActiveOpens).append(tcpPassiveOpens, rhs.tcpPassiveOpens).append(tcpAttemptFails, rhs.tcpAttemptFails).append(tcpEstabResets, rhs.tcpEstabResets).append(tcpCurrEstab, rhs.tcpCurrEstab).append(tcpInSegs, rhs.tcpInSegs).append(tcpOutSegs, rhs.tcpOutSegs).append(tcpRetransSegs, rhs.tcpRetransSegs).append(tcpInErrs, rhs.tcpInErrs).append(tcpOutRsts, rhs.tcpOutRsts).isEquals();
    }

    public Tcp clone() {
        Tcp _copy = new Tcp();
        _copy.tcpRtoAlgorithm = tcpRtoAlgorithm;
        _copy.tcpRtoMin = tcpRtoMin;
        _copy.tcpRtoMax = tcpRtoMax;
        _copy.tcpMaxConn = tcpMaxConn;
        _copy.tcpActiveOpens = tcpActiveOpens;
        _copy.tcpPassiveOpens = tcpPassiveOpens;
        _copy.tcpAttemptFails = tcpAttemptFails;
        _copy.tcpEstabResets = tcpEstabResets;
        _copy.tcpCurrEstab = tcpCurrEstab;
        _copy.tcpInSegs = tcpInSegs;
        _copy.tcpOutSegs = tcpOutSegs;
        _copy.tcpRetransSegs = tcpRetransSegs;
        _copy.tcpInErrs = tcpInErrs;
        _copy.tcpOutRsts = tcpOutRsts;
        return _copy;
    }

    public void set_ParentEntity(AbstractRootEntity parent) {
        parentEntity = parent;
    }

    private static DeviceEntityDescription createEntityDescription() {
        DeviceEntityDescription description = new DeviceEntityDescription(new OID("1.3.6.1.2.1.6"));
        description.addField(new DeviceEntityDescription.FieldDescription(1, "tcpRtoAlgorithm", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(2, "tcpRtoMin", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(3, "tcpRtoMax", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(4, "tcpMaxConn", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(5, "tcpActiveOpens", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(6, "tcpPassiveOpens", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(7, "tcpAttemptFails", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(8, "tcpEstabResets", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(9, "tcpCurrEstab", DeviceEntityDescription.FieldType.UNSIGNED32, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(10, "tcpInSegs", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(11, "tcpOutSegs", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(12, "tcpRetransSegs", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(14, "tcpInErrs", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(15, "tcpOutRsts", DeviceEntityDescription.FieldType.INTEGER, -1));
        return description;
    }

    public DeviceEntityDescription get_Description() {
        return _entityDescription;
    }

}
