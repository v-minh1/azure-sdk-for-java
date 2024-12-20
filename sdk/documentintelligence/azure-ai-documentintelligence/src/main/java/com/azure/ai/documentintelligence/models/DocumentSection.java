// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.
package com.azure.ai.documentintelligence.models;

import com.azure.core.annotation.Generated;
import com.azure.core.annotation.Immutable;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.List;

/**
 * An object representing a section in the document.
 */
@Immutable
public final class DocumentSection implements JsonSerializable<DocumentSection> {

    /*
     * Location of the section in the reading order concatenated content.
     */
    @Generated
    private final List<DocumentSpan> spans;

    /*
     * Child elements of the section.
     */
    @Generated
    private List<String> elements;

    /**
     * Creates an instance of DocumentSection class.
     *
     * @param spans the spans value to set.
     */
    @Generated
    private DocumentSection(List<DocumentSpan> spans) {
        this.spans = spans;
    }

    /**
     * Get the spans property: Location of the section in the reading order concatenated content.
     *
     * @return the spans value.
     */
    @Generated
    public List<DocumentSpan> getSpans() {
        return this.spans;
    }

    /**
     * Get the elements property: Child elements of the section.
     *
     * @return the elements value.
     */
    @Generated
    public List<String> getElements() {
        return this.elements;
    }

    /**
     * {@inheritDoc}
     */
    @Generated
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeArrayField("spans", this.spans, (writer, element) -> writer.writeJson(element));
        jsonWriter.writeArrayField("elements", this.elements, (writer, element) -> writer.writeString(element));
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of DocumentSection from the JsonReader.
     *
     * @param jsonReader The JsonReader being read.
     * @return An instance of DocumentSection if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the DocumentSection.
     */
    @Generated
    public static DocumentSection fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            List<DocumentSpan> spans = null;
            List<String> elements = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();
                if ("spans".equals(fieldName)) {
                    spans = reader.readArray(reader1 -> DocumentSpan.fromJson(reader1));
                } else if ("elements".equals(fieldName)) {
                    elements = reader.readArray(reader1 -> reader1.getString());
                } else {
                    reader.skipChildren();
                }
            }
            DocumentSection deserializedDocumentSection = new DocumentSection(spans);
            deserializedDocumentSection.elements = elements;
            return deserializedDocumentSection;
        });
    }
}
