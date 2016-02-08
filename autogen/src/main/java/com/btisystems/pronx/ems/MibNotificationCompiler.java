/**
 *                     GNU GENERAL PUBLIC LICENSE
 *                        Version 3, 29 June 2007
 *
 *  Copyright (C) 2007 Free Software Foundation, Inc. <http://fsf.org/>
 *  Everyone is permitted to copy and distribute verbatim copies
 *  of this license document, but changing it is not allowed.
 *
 *  This program is free software: you can redistribute it and/or
 *  modify it under the terms of the GNU General Public License as published
 *  by the Free Software Foundation, either version 3 of the License, or
 *  (at your option) any later version.
 *
 *  This program is distributed in the hope that it will be useful, but WITHOUT
 *  ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 *  FOR A PARTICULAR PURPOSE. See the GNU General Public License for more details.
 */
package com.btisystems.pronx.ems;

import com.btisystems.pronx.ems.schemas.meta.notification.FieldDescription;
import com.btisystems.pronx.ems.schemas.meta.notification.FieldList;
import com.btisystems.pronx.ems.schemas.meta.notification.FieldReference;
import com.btisystems.pronx.ems.schemas.meta.notification.FieldType;
import com.btisystems.pronx.ems.schemas.meta.notification.NotificationDefinition;
import com.btisystems.pronx.ems.schemas.meta.notification.NotificationList;
import com.btisystems.pronx.ems.schemas.meta.notification.NotificationMeta;
import com.sun.codemodel.JCodeModel;
import com.sun.codemodel.JType;
import net.percederberg.mibble.Mib;
import net.percederberg.mibble.MibLoader;
import net.percederberg.mibble.MibValueSymbol;
import net.percederberg.mibble.snmp.SnmpNotificationType;
import net.percederberg.mibble.snmp.SnmpType;
import net.percederberg.mibble.value.ObjectIdentifierValue;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Compiles the notifications from a set of loaded mibs. The compiler generates
 * a Notification Registry containing a NotificationDescription for each
 * notification.
 */
public class MibNotificationCompiler extends AbstractMibCompiler {

    private final MibLoader loader;

    /**
     * Class constructor
     *
     * @param loader the loader used to load the mibs containing the
     *            notifications to be compiled
     * @param packageName the name of the package to which classes are to be
     *            added
     */
    public MibNotificationCompiler(final MibLoader loader, final String packageName) {
        super(packageName);
        this.loader = loader;
    }

    /**
     * Compile the notifications.
     *
     * @param codeModel the Java Code Model which will hold the generated code
     * @return the notification meta
     */
    public final NotificationMeta compile(final JCodeModel codeModel) {
        this.codeModel = codeModel;
        return buildNotifications();
    }

    // Build notification classes
    private NotificationMeta buildNotifications() {
        final List<MibValueSymbol> notifications = new ArrayList<>();
        for (final Mib mib : loader.getAllMibs()) {
            for (final Object symbol : mib.getAllSymbols()) {
                if (symbol instanceof MibValueSymbol
                        && ((MibValueSymbol) symbol).getType() instanceof SnmpNotificationType) {
                    notifications.add((MibValueSymbol) symbol);
                }
            }
        }
        return generateNotificationRegistry(notifications);
    }

    // Generate class with maps, mapping OIDs and names to notification
    // descriptions.
    private NotificationMeta generateNotificationRegistry(final List<MibValueSymbol> notifications) {

        final NotificationMeta notificationMeta = new NotificationMeta();

        final Map<ObjectIdentifierValue, FieldDescription> fieldMap = createFieldDescriptions(notificationMeta,
                notifications);

        final NotificationList notificationList = new NotificationList();
        notificationMeta.setNotificationList(notificationList);

        for (final MibValueSymbol notification : notifications) {

            final SnmpNotificationType notificationType = (SnmpNotificationType) notification.getType();

            // Generate: new NotificationDescription(...
            final NotificationDefinition definition = new NotificationDefinition();
            definition.setDescription(notificationType.getDescription());
            definition.setName(notification.getName());
            definition.setOid(getOidFromSymbol(notification));
            definition.setFieldReference(getFieldDescriptions(notification, fieldMap));

            notificationList.getNotificationDefinition().add(definition);
        }

        return notificationMeta;
    }

    private Map<ObjectIdentifierValue, FieldDescription> createFieldDescriptions(
            final NotificationMeta notificationMeta, final List<MibValueSymbol> notifications) {
        final FieldList fieldList = new FieldList();
        notificationMeta.setFieldList(fieldList);

        final Map<ObjectIdentifierValue, FieldDescription> fieldMap = new HashMap<>();
        for (final MibValueSymbol notification : notifications) {
            final SnmpNotificationType notificationType = (SnmpNotificationType) notification.getType();
            final List<ObjectIdentifierValue> fieldIdentifiers = getNotificationFields(notificationType);
            if (fieldIdentifiers == null || fieldIdentifiers.isEmpty()) {
                continue;
            }
            for (final ObjectIdentifierValue fieldIdentifier : fieldIdentifiers) {
                if (!fieldMap.containsKey(fieldIdentifier)) {
                    final FieldDescription description = createField(notification, fieldIdentifier);
                    if (description != null) {
                        fieldList.getFieldDescription().add(description);
                        fieldMap.put(fieldIdentifier, description);
                    }
                }
            }
        }
        return fieldMap;
    }

    private FieldDescription createField(final MibValueSymbol notification, final ObjectIdentifierValue fieldIdentifier) {
        final MibValueSymbol notificationField = getSymbolByOid(notification, fieldIdentifier);

        if (notificationField != null) {
            final FieldType fieldType = getFieldType(notificationField);
            final String oid = getOidFromSymbol(notificationField);
            final String fieldName = notificationField.getName();
            String description = "";
            if (notificationField.getType() instanceof SnmpType) {
                description = ((SnmpType) notificationField.getType()).getDescription();
            }

            return new FieldDescription().withDescription(description).withName(fieldName).withOid(oid)
                    .withType(fieldType);
        }
        return null;
    }

    private List<FieldReference> getFieldDescriptions(final MibValueSymbol notification,
            final Map<ObjectIdentifierValue, FieldDescription> fieldMap) {

        final SnmpNotificationType notificationType = (SnmpNotificationType) notification.getType();
        final List<ObjectIdentifierValue> fieldIdentifiers = getNotificationFields(notificationType);
        if (fieldIdentifiers == null || fieldIdentifiers.isEmpty()) {
            // No field descriptions.
            return null;
        }

        final List<FieldReference> fields = new ArrayList<>();

        for (final ObjectIdentifierValue fieldIdentifier : fieldIdentifiers) {
            fields.add(new FieldReference().withDescription(fieldMap.get(fieldIdentifier)));
        }
        return fields;
    }

    private FieldType getFieldType(final MibValueSymbol child) {
        final JType javaType = mapObjectTypeToJavaType(child.getType());
        if (javaType == codeModel.INT) {
            return FieldType.INTEGER;
        } else {
            return FieldType.STRING;
        }
    }
}
