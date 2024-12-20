// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.media.videoanalyzer.edge.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * Class representing the H264 Configuration.
 */
@Fluent
public final class H264Configuration implements JsonSerializable<H264Configuration> {
    /*
     * Group of Video frames length.
     */
    private Float govLength;

    /*
     * The H264 Profile
     */
    private H264Profile profile;

    /**
     * Creates an instance of H264Configuration class.
     */
    public H264Configuration() {
    }

    /**
     * Get the govLength property: Group of Video frames length.
     * 
     * @return the govLength value.
     */
    public Float getGovLength() {
        return this.govLength;
    }

    /**
     * Set the govLength property: Group of Video frames length.
     * 
     * @param govLength the govLength value to set.
     * @return the H264Configuration object itself.
     */
    public H264Configuration setGovLength(Float govLength) {
        this.govLength = govLength;
        return this;
    }

    /**
     * Get the profile property: The H264 Profile.
     * 
     * @return the profile value.
     */
    public H264Profile getProfile() {
        return this.profile;
    }

    /**
     * Set the profile property: The H264 Profile.
     * 
     * @param profile the profile value to set.
     * @return the H264Configuration object itself.
     */
    public H264Configuration setProfile(H264Profile profile) {
        this.profile = profile;
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeNumberField("govLength", this.govLength);
        jsonWriter.writeStringField("profile", this.profile == null ? null : this.profile.toString());
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of H264Configuration from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of H264Configuration if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IOException If an error occurs while reading the H264Configuration.
     */
    public static H264Configuration fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            H264Configuration deserializedH264Configuration = new H264Configuration();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("govLength".equals(fieldName)) {
                    deserializedH264Configuration.govLength = reader.getNullable(JsonReader::getFloat);
                } else if ("profile".equals(fieldName)) {
                    deserializedH264Configuration.profile = H264Profile.fromString(reader.getString());
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedH264Configuration;
        });
    }
}
