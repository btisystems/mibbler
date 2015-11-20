
package com.btisystems.mibbler.mibs.bti7000.interfaces.mib_2;

import com.btisystems.pronx.ems.core.model.IDeviceEntity;

public interface ISnmp
    extends IDeviceEntity
{


    void setSnmpInPkts(int snmpInPkts);

    int getSnmpInPkts();

    void setSnmpOutPkts(int snmpOutPkts);

    int getSnmpOutPkts();

    void setSnmpInBadVersions(int snmpInBadVersions);

    int getSnmpInBadVersions();

    void setSnmpInBadCommunityNames(int snmpInBadCommunityNames);

    int getSnmpInBadCommunityNames();

    void setSnmpInBadCommunityUses(int snmpInBadCommunityUses);

    int getSnmpInBadCommunityUses();

    void setSnmpInASNParseErrs(int snmpInASNParseErrs);

    int getSnmpInASNParseErrs();

    void setSnmpInASNParseErrs1(int snmpInASNParseErrs1);

    int getSnmpInASNParseErrs1();

    void setSnmpInTooBigs(int snmpInTooBigs);

    int getSnmpInTooBigs();

    void setSnmpInNoSuchNames(int snmpInNoSuchNames);

    int getSnmpInNoSuchNames();

    void setSnmpInBadValues(int snmpInBadValues);

    int getSnmpInBadValues();

    void setSnmpInReadOnlys(int snmpInReadOnlys);

    int getSnmpInReadOnlys();

    void setSnmpInGenErrs(int snmpInGenErrs);

    int getSnmpInGenErrs();

    void setSnmpInTotalReqVars(int snmpInTotalReqVars);

    int getSnmpInTotalReqVars();

    void setSnmpInTotalSetVars(int snmpInTotalSetVars);

    int getSnmpInTotalSetVars();

    void setSnmpInGetRequests(int snmpInGetRequests);

    int getSnmpInGetRequests();

    void setSnmpInGetNexts(int snmpInGetNexts);

    int getSnmpInGetNexts();

    void setSnmpInSetRequests(int snmpInSetRequests);

    int getSnmpInSetRequests();

    void setSnmpInGetResponses(int snmpInGetResponses);

    int getSnmpInGetResponses();

    void setSnmpInTraps(int snmpInTraps);

    int getSnmpInTraps();

    void setSnmpOutTooBigs(int snmpOutTooBigs);

    int getSnmpOutTooBigs();

    void setSnmpOutNoSuchNames(int snmpOutNoSuchNames);

    int getSnmpOutNoSuchNames();

    void setSnmpOutBadValues(int snmpOutBadValues);

    int getSnmpOutBadValues();

    void setSnmpOutBadValues1(int snmpOutBadValues1);

    int getSnmpOutBadValues1();

    void setSnmpOutGenErrs(int snmpOutGenErrs);

    int getSnmpOutGenErrs();

    void setSnmpOutGetRequests(int snmpOutGetRequests);

    int getSnmpOutGetRequests();

    void setSnmpOutGetNexts(int snmpOutGetNexts);

    int getSnmpOutGetNexts();

    void setSnmpOutSetRequests(int snmpOutSetRequests);

    int getSnmpOutSetRequests();

    void setSnmpOutGetResponses(int snmpOutGetResponses);

    int getSnmpOutGetResponses();

    void setSnmpOutTraps(int snmpOutTraps);

    int getSnmpOutTraps();

    void setSnmpEnableAuthenTraps(int snmpEnableAuthenTraps);

    int getSnmpEnableAuthenTraps();

    void setSnmpSilentDrops(int snmpSilentDrops);

    int getSnmpSilentDrops();

    void setSnmpProxyDrops(int snmpProxyDrops);

    int getSnmpProxyDrops();

    ISnmp clone();

}
