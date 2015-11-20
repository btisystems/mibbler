
package com.btisystems.mibbler.mibs.bti7000.interfaces.btisystems.btiproducts.bti7000.objects.inventory.pluggableinvtable;

import com.btisystems.pronx.ems.core.model.IDeviceEntity;

public interface IPluggableInvEntry
    extends IDeviceEntity
{


    void setPluggableInvShelfIdx(int pluggableInvShelfIdx);

    int getPluggableInvShelfIdx();

    void setPluggableInvSlotTypeIdx(int pluggableInvSlotTypeIdx);

    int getPluggableInvSlotTypeIdx();

    void setPluggableInvSlotIdx(int pluggableInvSlotIdx);

    int getPluggableInvSlotIdx();

    void setPluggableInvPortIdx(int pluggableInvPortIdx);

    int getPluggableInvPortIdx();

    void setPluggableInvType(int pluggableInvType);

    int getPluggableInvType();

    void setPluggableInvPEC(String pluggableInvPEC);

    String getPluggableInvPEC();

    void setPluggableInvCLEI(String pluggableInvCLEI);

    String getPluggableInvCLEI();

    void setPluggableInvVendorName(String pluggableInvVendorName);

    String getPluggableInvVendorName();

    void setPluggableInvVendorOUI(String pluggableInvVendorOUI);

    String getPluggableInvVendorOUI();

    void setPluggableInvVendorPartNum(String pluggableInvVendorPartNum);

    String getPluggableInvVendorPartNum();

    void setPluggableInvVendorRev(String pluggableInvVendorRev);

    String getPluggableInvVendorRev();

    void setPluggableInvVendorSerialNum(String pluggableInvVendorSerialNum);

    String getPluggableInvVendorSerialNum();

    void setPluggableInvMfgDate(String pluggableInvMfgDate);

    String getPluggableInvMfgDate();

    void setPluggableInvConnectorType(int pluggableInvConnectorType);

    int getPluggableInvConnectorType();

    void setPluggableInvMinBitRate(int pluggableInvMinBitRate);

    int getPluggableInvMinBitRate();

    void setPluggableInvMaxBitRate(int pluggableInvMaxBitRate);

    int getPluggableInvMaxBitRate();

    void setPluggableInvNomBitRate(int pluggableInvNomBitRate);

    int getPluggableInvNomBitRate();

    void setPluggableInvEncoding(String pluggableInvEncoding);

    String getPluggableInvEncoding();

    void setPluggableInvWavelength(int pluggableInvWavelength);

    int getPluggableInvWavelength();

    void setPluggableInvReach(int pluggableInvReach);

    int getPluggableInvReach();

    void setPluggableInvTxFaultImpl(int pluggableInvTxFaultImpl);

    int getPluggableInvTxFaultImpl();

    void setPluggableInvLOSImpl(int pluggableInvLOSImpl);

    int getPluggableInvLOSImpl();

    void setPluggableInvDDiagImpl(int pluggableInvDDiagImpl);

    int getPluggableInvDDiagImpl();

    void setPluggableInvTxDisableImpl(int pluggableInvTxDisableImpl);

    int getPluggableInvTxDisableImpl();

    void setPluggableInvMedia(int pluggableInvMedia);

    int getPluggableInvMedia();

    void setPluggableInvUSI(String pluggableInvUSI);

    String getPluggableInvUSI();

    void setPluggableInvWavelengthMin(int pluggableInvWavelengthMin);

    int getPluggableInvWavelengthMin();

    void setPluggableInvWavelengthMax(int pluggableInvWavelengthMax);

    int getPluggableInvWavelengthMax();

    void setPluggableInvWavelengthSpacing(int pluggableInvWavelengthSpacing);

    int getPluggableInvWavelengthSpacing();

    IPluggableInvEntry clone();

}
