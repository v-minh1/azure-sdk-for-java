// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.redisenterprise.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.redisenterprise.fluent.models.DatabaseInner;
import java.io.IOException;
import java.util.List;

/**
 * The response of a list-all operation.
 */
@Fluent
public final class DatabaseList implements JsonSerializable<DatabaseList> {
    /*
     * List of databases
     */
    private List<DatabaseInner> value;

    /*
     * The URI to fetch the next page of results.
     */
    private String nextLink;

    /**
     * Creates an instance of DatabaseList class.
     */
    public DatabaseList() {
    }

    /**
     * Get the value property: List of databases.
     * 
     * @return the value value.
     */
    public List<DatabaseInner> value() {
        return this.value;
    }

    /**
     * Set the value property: List of databases.
     * 
     * @param value the value value to set.
     * @return the DatabaseList object itself.
     */
    public DatabaseList withValue(List<DatabaseInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Get the nextLink property: The URI to fetch the next page of results.
     * 
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (value() != null) {
            value().forEach(e -> e.validate());
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeArrayField("value", this.value, (writer, element) -> writer.writeJson(element));
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of DatabaseList from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of DatabaseList if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IOException If an error occurs while reading the DatabaseList.
     */
    public static DatabaseList fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            DatabaseList deserializedDatabaseList = new DatabaseList();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("value".equals(fieldName)) {
                    List<DatabaseInner> value = reader.readArray(reader1 -> DatabaseInner.fromJson(reader1));
                    deserializedDatabaseList.value = value;
                } else if ("nextLink".equals(fieldName)) {
                    deserializedDatabaseList.nextLink = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedDatabaseList;
        });
    }
}
