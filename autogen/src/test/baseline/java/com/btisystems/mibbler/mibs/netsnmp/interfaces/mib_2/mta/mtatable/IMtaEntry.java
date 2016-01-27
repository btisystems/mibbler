
package com.btisystems.mibbler.mibs.netsnmp.interfaces.mib_2.mta.mtatable;

import com.btisystems.pronx.ems.core.model.IDeviceEntity;

public interface IMtaEntry
    extends IDeviceEntity
{


    void setMtaReceivedMessages(int mtaReceivedMessages);

    int getMtaReceivedMessages();

    void setMtaStoredMessages(int mtaStoredMessages);

    int getMtaStoredMessages();

    void setMtaTransmittedMessages(int mtaTransmittedMessages);

    int getMtaTransmittedMessages();

    void setMtaReceivedVolume(int mtaReceivedVolume);

    int getMtaReceivedVolume();

    void setMtaStoredVolume(int mtaStoredVolume);

    int getMtaStoredVolume();

    void setMtaTransmittedVolume(int mtaTransmittedVolume);

    int getMtaTransmittedVolume();

    void setMtaReceivedRecipients(int mtaReceivedRecipients);

    int getMtaReceivedRecipients();

    void setMtaStoredRecipients(int mtaStoredRecipients);

    int getMtaStoredRecipients();

    void setMtaTransmittedRecipients(int mtaTransmittedRecipients);

    int getMtaTransmittedRecipients();

    void setMtaSuccessfulConvertedMessages(int mtaSuccessfulConvertedMessages);

    int getMtaSuccessfulConvertedMessages();

    void setMtaFailedConvertedMessages(int mtaFailedConvertedMessages);

    int getMtaFailedConvertedMessages();

    void setMtaLoopsDetected(int mtaLoopsDetected);

    int getMtaLoopsDetected();

    IMtaEntry clone();

}
