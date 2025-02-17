// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.quantum.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * Information about pricing dimension.
 */
@Fluent
public final class PricingDimension implements JsonSerializable<PricingDimension> {
    /*
     * Unique id of this pricing dimension.
     */
    private String id;

    /*
     * The display name of this pricing dimension.
     */
    private String name;

    /**
     * Creates an instance of PricingDimension class.
     */
    public PricingDimension() {
    }

    /**
     * Get the id property: Unique id of this pricing dimension.
     * 
     * @return the id value.
     */
    public String id() {
        return this.id;
    }

    /**
     * Set the id property: Unique id of this pricing dimension.
     * 
     * @param id the id value to set.
     * @return the PricingDimension object itself.
     */
    public PricingDimension withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Get the name property: The display name of this pricing dimension.
     * 
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: The display name of this pricing dimension.
     * 
     * @param name the name value to set.
     * @return the PricingDimension object itself.
     */
    public PricingDimension withName(String name) {
        this.name = name;
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
        jsonWriter.writeStringField("id", this.id);
        jsonWriter.writeStringField("name", this.name);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of PricingDimension from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of PricingDimension if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IOException If an error occurs while reading the PricingDimension.
     */
    public static PricingDimension fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            PricingDimension deserializedPricingDimension = new PricingDimension();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("id".equals(fieldName)) {
                    deserializedPricingDimension.id = reader.getString();
                } else if ("name".equals(fieldName)) {
                    deserializedPricingDimension.name = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedPricingDimension;
        });
    }
}
