// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mysqlflexibleserver.models;

import com.azure.core.annotation.Immutable;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * Represents the response properties specific to the operation.
 */
@Immutable
public class OperationProgressResponseType implements JsonSerializable<OperationProgressResponseType> {
    /*
     * Identifies the type of source operation
     */
    private ObjectType objectType = ObjectType.fromString("OperationProgressResponseType");

    /**
     * Creates an instance of OperationProgressResponseType class.
     */
    public OperationProgressResponseType() {
    }

    /**
     * Get the objectType property: Identifies the type of source operation.
     * 
     * @return the objectType value.
     */
    public ObjectType objectType() {
        return this.objectType;
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
        jsonWriter.writeStringField("objectType", this.objectType == null ? null : this.objectType.toString());
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of OperationProgressResponseType from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of OperationProgressResponseType if the JsonReader was pointing to an instance of it, or null
     * if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the OperationProgressResponseType.
     */
    public static OperationProgressResponseType fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            String discriminatorValue = null;
            try (JsonReader readerToUse = reader.bufferObject()) {
                readerToUse.nextToken(); // Prepare for reading
                while (readerToUse.nextToken() != JsonToken.END_OBJECT) {
                    String fieldName = readerToUse.getFieldName();
                    readerToUse.nextToken();
                    if ("objectType".equals(fieldName)) {
                        discriminatorValue = readerToUse.getString();
                        break;
                    } else {
                        readerToUse.skipChildren();
                    }
                }
                // Use the discriminator value to determine which subtype should be deserialized.
                if ("BackupAndExportResponse".equals(discriminatorValue)) {
                    return BackupAndExportResponseType.fromJson(readerToUse.reset());
                } else if ("ImportFromStorageResponse".equals(discriminatorValue)) {
                    return ImportFromStorageResponseType.fromJson(readerToUse.reset());
                } else {
                    return fromJsonKnownDiscriminator(readerToUse.reset());
                }
            }
        });
    }

    static OperationProgressResponseType fromJsonKnownDiscriminator(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            OperationProgressResponseType deserializedOperationProgressResponseType
                = new OperationProgressResponseType();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("objectType".equals(fieldName)) {
                    deserializedOperationProgressResponseType.objectType = ObjectType.fromString(reader.getString());
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedOperationProgressResponseType;
        });
    }
}
