// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.communication.callautomation.implementation.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.List;

/**
 * Media streaming Subscription Object.
 */
@Fluent
public final class MediaStreamingSubscription implements JsonSerializable<MediaStreamingSubscription> {
    /*
     * Subscription Id.
     */
    private String id;

    /*
     * Media streaming subscription state.
     */
    private MediaStreamingSubscriptionState state;

    /*
     * Subscribed media streaming content types.
     */
    private List<MediaStreamingContentTypeInternal> subscribedContentTypes;

    /**
     * Creates an instance of MediaStreamingSubscription class.
     */
    public MediaStreamingSubscription() {
    }

    /**
     * Get the id property: Subscription Id.
     * 
     * @return the id value.
     */
    public String getId() {
        return this.id;
    }

    /**
     * Set the id property: Subscription Id.
     * 
     * @param id the id value to set.
     * @return the MediaStreamingSubscription object itself.
     */
    public MediaStreamingSubscription setId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Get the state property: Media streaming subscription state.
     * 
     * @return the state value.
     */
    public MediaStreamingSubscriptionState getState() {
        return this.state;
    }

    /**
     * Set the state property: Media streaming subscription state.
     * 
     * @param state the state value to set.
     * @return the MediaStreamingSubscription object itself.
     */
    public MediaStreamingSubscription setState(MediaStreamingSubscriptionState state) {
        this.state = state;
        return this;
    }

    /**
     * Get the subscribedContentTypes property: Subscribed media streaming content types.
     * 
     * @return the subscribedContentTypes value.
     */
    public List<MediaStreamingContentTypeInternal> getSubscribedContentTypes() {
        return this.subscribedContentTypes;
    }

    /**
     * Set the subscribedContentTypes property: Subscribed media streaming content types.
     * 
     * @param subscribedContentTypes the subscribedContentTypes value to set.
     * @return the MediaStreamingSubscription object itself.
     */
    public MediaStreamingSubscription
        setSubscribedContentTypes(List<MediaStreamingContentTypeInternal> subscribedContentTypes) {
        this.subscribedContentTypes = subscribedContentTypes;
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("id", this.id);
        jsonWriter.writeStringField("state", this.state == null ? null : this.state.toString());
        jsonWriter.writeArrayField("subscribedContentTypes", this.subscribedContentTypes,
            (writer, element) -> writer.writeString(element == null ? null : element.toString()));
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of MediaStreamingSubscription from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of MediaStreamingSubscription if the JsonReader was pointing to an instance of it, or null if
     * it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the MediaStreamingSubscription.
     */
    public static MediaStreamingSubscription fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            MediaStreamingSubscription deserializedMediaStreamingSubscription = new MediaStreamingSubscription();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("id".equals(fieldName)) {
                    deserializedMediaStreamingSubscription.id = reader.getString();
                } else if ("state".equals(fieldName)) {
                    deserializedMediaStreamingSubscription.state
                        = MediaStreamingSubscriptionState.fromString(reader.getString());
                } else if ("subscribedContentTypes".equals(fieldName)) {
                    List<MediaStreamingContentTypeInternal> subscribedContentTypes = reader
                        .readArray(reader1 -> MediaStreamingContentTypeInternal.fromString(reader1.getString()));
                    deserializedMediaStreamingSubscription.subscribedContentTypes = subscribedContentTypes;
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedMediaStreamingSubscription;
        });
    }
}
