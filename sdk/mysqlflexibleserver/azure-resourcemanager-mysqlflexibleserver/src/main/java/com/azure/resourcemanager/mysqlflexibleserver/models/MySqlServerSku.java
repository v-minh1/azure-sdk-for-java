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
 * Billing information related properties of a server.
 */
@Fluent
public final class MySqlServerSku implements JsonSerializable<MySqlServerSku> {
    /*
     * The name of the sku, e.g. Standard_D32s_v3.
     */
    private String name;

    /*
     * The tier of the particular SKU, e.g. GeneralPurpose.
     */
    private ServerSkuTier tier;

    /**
     * Creates an instance of MySqlServerSku class.
     */
    public MySqlServerSku() {
    }

    /**
     * Get the name property: The name of the sku, e.g. Standard_D32s_v3.
     * 
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: The name of the sku, e.g. Standard_D32s_v3.
     * 
     * @param name the name value to set.
     * @return the MySqlServerSku object itself.
     */
    public MySqlServerSku withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the tier property: The tier of the particular SKU, e.g. GeneralPurpose.
     * 
     * @return the tier value.
     */
    public ServerSkuTier tier() {
        return this.tier;
    }

    /**
     * Set the tier property: The tier of the particular SKU, e.g. GeneralPurpose.
     * 
     * @param tier the tier value to set.
     * @return the MySqlServerSku object itself.
     */
    public MySqlServerSku withTier(ServerSkuTier tier) {
        this.tier = tier;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (name() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException("Missing required property name in model MySqlServerSku"));
        }
        if (tier() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException("Missing required property tier in model MySqlServerSku"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(MySqlServerSku.class);

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("name", this.name);
        jsonWriter.writeStringField("tier", this.tier == null ? null : this.tier.toString());
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of MySqlServerSku from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of MySqlServerSku if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the MySqlServerSku.
     */
    public static MySqlServerSku fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            MySqlServerSku deserializedMySqlServerSku = new MySqlServerSku();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("name".equals(fieldName)) {
                    deserializedMySqlServerSku.name = reader.getString();
                } else if ("tier".equals(fieldName)) {
                    deserializedMySqlServerSku.tier = ServerSkuTier.fromString(reader.getString());
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedMySqlServerSku;
        });
    }
}
