// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.securityinsights.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * The insight chart query.
 */
@Fluent
public final class InsightQueryItemPropertiesDefaultTimeRange
    implements JsonSerializable<InsightQueryItemPropertiesDefaultTimeRange> {
    /*
     * The padding for the start time of the query.
     */
    private String beforeRange;

    /*
     * The padding for the end time of the query.
     */
    private String afterRange;

    /**
     * Creates an instance of InsightQueryItemPropertiesDefaultTimeRange class.
     */
    public InsightQueryItemPropertiesDefaultTimeRange() {
    }

    /**
     * Get the beforeRange property: The padding for the start time of the query.
     * 
     * @return the beforeRange value.
     */
    public String beforeRange() {
        return this.beforeRange;
    }

    /**
     * Set the beforeRange property: The padding for the start time of the query.
     * 
     * @param beforeRange the beforeRange value to set.
     * @return the InsightQueryItemPropertiesDefaultTimeRange object itself.
     */
    public InsightQueryItemPropertiesDefaultTimeRange withBeforeRange(String beforeRange) {
        this.beforeRange = beforeRange;
        return this;
    }

    /**
     * Get the afterRange property: The padding for the end time of the query.
     * 
     * @return the afterRange value.
     */
    public String afterRange() {
        return this.afterRange;
    }

    /**
     * Set the afterRange property: The padding for the end time of the query.
     * 
     * @param afterRange the afterRange value to set.
     * @return the InsightQueryItemPropertiesDefaultTimeRange object itself.
     */
    public InsightQueryItemPropertiesDefaultTimeRange withAfterRange(String afterRange) {
        this.afterRange = afterRange;
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
        jsonWriter.writeStringField("beforeRange", this.beforeRange);
        jsonWriter.writeStringField("afterRange", this.afterRange);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of InsightQueryItemPropertiesDefaultTimeRange from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of InsightQueryItemPropertiesDefaultTimeRange if the JsonReader was pointing to an instance
     * of it, or null if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the InsightQueryItemPropertiesDefaultTimeRange.
     */
    public static InsightQueryItemPropertiesDefaultTimeRange fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            InsightQueryItemPropertiesDefaultTimeRange deserializedInsightQueryItemPropertiesDefaultTimeRange
                = new InsightQueryItemPropertiesDefaultTimeRange();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("beforeRange".equals(fieldName)) {
                    deserializedInsightQueryItemPropertiesDefaultTimeRange.beforeRange = reader.getString();
                } else if ("afterRange".equals(fieldName)) {
                    deserializedInsightQueryItemPropertiesDefaultTimeRange.afterRange = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedInsightQueryItemPropertiesDefaultTimeRange;
        });
    }
}
