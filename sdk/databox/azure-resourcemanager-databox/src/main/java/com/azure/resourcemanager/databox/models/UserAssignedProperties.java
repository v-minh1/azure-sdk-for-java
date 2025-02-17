// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.databox.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * User assigned identity properties.
 */
@Fluent
public final class UserAssignedProperties implements JsonSerializable<UserAssignedProperties> {
    /*
     * Arm resource id for user assigned identity to be used to fetch MSI token.
     */
    private String resourceId;

    /**
     * Creates an instance of UserAssignedProperties class.
     */
    public UserAssignedProperties() {
    }

    /**
     * Get the resourceId property: Arm resource id for user assigned identity to be used to fetch MSI token.
     * 
     * @return the resourceId value.
     */
    public String resourceId() {
        return this.resourceId;
    }

    /**
     * Set the resourceId property: Arm resource id for user assigned identity to be used to fetch MSI token.
     * 
     * @param resourceId the resourceId value to set.
     * @return the UserAssignedProperties object itself.
     */
    public UserAssignedProperties withResourceId(String resourceId) {
        this.resourceId = resourceId;
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
        jsonWriter.writeStringField("resourceId", this.resourceId);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of UserAssignedProperties from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of UserAssignedProperties if the JsonReader was pointing to an instance of it, or null if it
     * was pointing to JSON null.
     * @throws IOException If an error occurs while reading the UserAssignedProperties.
     */
    public static UserAssignedProperties fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            UserAssignedProperties deserializedUserAssignedProperties = new UserAssignedProperties();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("resourceId".equals(fieldName)) {
                    deserializedUserAssignedProperties.resourceId = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedUserAssignedProperties;
        });
    }
}
