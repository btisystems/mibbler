
package com.btisystems.mibbler.mibs.rfc.interfaces.mib_2;

import com.btisystems.pronx.ems.core.model.IDeviceEntity;

public interface ITcp
    extends IDeviceEntity
{


    void setTcpRtoAlgorithm(int tcpRtoAlgorithm);

    int getTcpRtoAlgorithm();

    void setTcpRtoMin(int tcpRtoMin);

    int getTcpRtoMin();

    void setTcpRtoMax(int tcpRtoMax);

    int getTcpRtoMax();

    void setTcpMaxConn(int tcpMaxConn);

    int getTcpMaxConn();

    void setTcpActiveOpens(int tcpActiveOpens);

    int getTcpActiveOpens();

    void setTcpPassiveOpens(int tcpPassiveOpens);

    int getTcpPassiveOpens();

    void setTcpAttemptFails(int tcpAttemptFails);

    int getTcpAttemptFails();

    void setTcpEstabResets(int tcpEstabResets);

    int getTcpEstabResets();

    void setTcpCurrEstab(int tcpCurrEstab);

    int getTcpCurrEstab();

    void setTcpInSegs(int tcpInSegs);

    int getTcpInSegs();

    void setTcpOutSegs(int tcpOutSegs);

    int getTcpOutSegs();

    void setTcpRetransSegs(int tcpRetransSegs);

    int getTcpRetransSegs();

    void setTcpInErrs(int tcpInErrs);

    int getTcpInErrs();

    void setTcpOutRsts(int tcpOutRsts);

    int getTcpOutRsts();

    ITcp clone();

}
