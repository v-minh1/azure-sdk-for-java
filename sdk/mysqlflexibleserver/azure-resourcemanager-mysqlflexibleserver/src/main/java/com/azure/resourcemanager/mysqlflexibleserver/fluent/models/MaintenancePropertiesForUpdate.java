// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mysqlflexibleserver.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.CoreUtils;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;

/**
 * The properties of a maintenance update parameter.
 */
@Fluent
public final class MaintenancePropertiesForUpdate implements JsonSerializable<MaintenancePropertiesForUpdate> {
    /*
     * The start time for a maintenance.
     */
    private OffsetDateTime maintenanceStartTime;

    /**
     * Creates an instance of MaintenancePropertiesForUpdate class.
     */
    public MaintenancePropertiesForUpdate() {
    }

    /**
     * Get the maintenanceStartTime property: The start time for a maintenance.
     * 
     * @return the maintenanceStartTime value.
     */
    public OffsetDateTime maintenanceStartTime() {
        return this.maintenanceStartTime;
    }

    /**
     * Set the maintenanceStartTime property: The start time for a maintenance.
     * 
     * @param maintenanceStartTime the maintenanceStartTime value to set.
     * @return the MaintenancePropertiesForUpdate object itself.
     */
    public MaintenancePropertiesForUpdate withMaintenanceStartTime(OffsetDateTime maintenanceStartTime) {
        this.maintenanceStartTime = maintenanceStartTime;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("maintenanceStartTime",
            this.maintenanceStartTime == null
                ? null
                : DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(this.maintenanceStartTime));
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of MaintenancePropertiesForUpdate from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of MaintenancePropertiesForUpdate if the JsonReader was pointing to an instance of it, or
     * null if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the MaintenancePropertiesForUpdate.
     */
    public static MaintenancePropertiesForUpdate fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            MaintenancePropertiesForUpdate deserializedMaintenancePropertiesForUpdate
                = new MaintenancePropertiesForUpdate();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("maintenanceStartTime".equals(fieldName)) {
                    deserializedMaintenancePropertiesForUpdate.maintenanceStartTime = reader
                        .getNullable(nonNullReader -> CoreUtils.parseBestOffsetDateTime(nonNullReader.getString()));
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedMaintenancePropertiesForUpdate;
        });
    }
}
