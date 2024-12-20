// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mysqlflexibleserver.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * Backup Settings.
 */
@Fluent
public final class BackupSettings implements JsonSerializable<BackupSettings> {
    /*
     * The name of the backup.
     */
    private String backupName;

    /*
     * Backup Format for the current backup. (CollatedFormat is INTERNAL – DO NOT USE)
     */
    private BackupFormat backupFormat;

    /**
     * Creates an instance of BackupSettings class.
     */
    public BackupSettings() {
    }

    /**
     * Get the backupName property: The name of the backup.
     * 
     * @return the backupName value.
     */
    public String backupName() {
        return this.backupName;
    }

    /**
     * Set the backupName property: The name of the backup.
     * 
     * @param backupName the backupName value to set.
     * @return the BackupSettings object itself.
     */
    public BackupSettings withBackupName(String backupName) {
        this.backupName = backupName;
        return this;
    }

    /**
     * Get the backupFormat property: Backup Format for the current backup. (CollatedFormat is INTERNAL – DO NOT USE).
     * 
     * @return the backupFormat value.
     */
    public BackupFormat backupFormat() {
        return this.backupFormat;
    }

    /**
     * Set the backupFormat property: Backup Format for the current backup. (CollatedFormat is INTERNAL – DO NOT USE).
     * 
     * @param backupFormat the backupFormat value to set.
     * @return the BackupSettings object itself.
     */
    public BackupSettings withBackupFormat(BackupFormat backupFormat) {
        this.backupFormat = backupFormat;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (backupName() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException("Missing required property backupName in model BackupSettings"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(BackupSettings.class);

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("backupName", this.backupName);
        jsonWriter.writeStringField("backupFormat", this.backupFormat == null ? null : this.backupFormat.toString());
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of BackupSettings from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of BackupSettings if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the BackupSettings.
     */
    public static BackupSettings fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            BackupSettings deserializedBackupSettings = new BackupSettings();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("backupName".equals(fieldName)) {
                    deserializedBackupSettings.backupName = reader.getString();
                } else if ("backupFormat".equals(fieldName)) {
                    deserializedBackupSettings.backupFormat = BackupFormat.fromString(reader.getString());
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedBackupSettings;
        });
    }
}
