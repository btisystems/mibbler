
package com.btisystems.mibbler.mibs.netsnmp.interfaces.mib_2.dismaneventmib.dismaneventmibobjects;

import com.btisystems.pronx.ems.core.model.IDeviceEntity;

public interface IMteResource
    extends IDeviceEntity
{


    void setMteResourceSampleMinimum(int mteResourceSampleMinimum);

    int getMteResourceSampleMinimum();

    void setMteResourceSampleInstanceMaximum(int mteResourceSampleInstanceMaximum);

    int getMteResourceSampleInstanceMaximum();

    void setMteResourceSampleInstances(int mteResourceSampleInstances);

    int getMteResourceSampleInstances();

    void setMteResourceSampleInstancesHigh(int mteResourceSampleInstancesHigh);

    int getMteResourceSampleInstancesHigh();

    void setMteResourceSampleInstanceLacks(int mteResourceSampleInstanceLacks);

    int getMteResourceSampleInstanceLacks();

    IMteResource clone();

}
