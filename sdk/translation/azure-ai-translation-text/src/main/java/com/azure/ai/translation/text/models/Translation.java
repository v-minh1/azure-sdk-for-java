// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.ai.translation.text.models;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Translation result. */
@Immutable
public final class Translation {
    /*
     * A string representing the language code of the target language.
     */
    @JsonProperty(value = "to", required = true)
    private String to;

    /*
     * A string giving the translated text.
     */
    @JsonProperty(value = "text", required = true)
    private String text;

    /*
     * An object giving the translated text in the script specified by the toScript parameter.
     */
    @JsonProperty(value = "transliteration")
    private TransliteratedText transliteration;

    /*
     * Alignment information.
     */
    @JsonProperty(value = "alignment")
    private TranslatedTextAlignment alignment;

    /*
     * Sentence boundaries in the input and output texts.
     */
    @JsonProperty(value = "sentLen")
    private SentenceLength sentLen;

    /**
     * Creates an instance of Translation class.
     *
     * @param to the to value to set.
     * @param text the text value to set.
     */
    @JsonCreator
    private Translation(
            @JsonProperty(value = "to", required = true) String to,
            @JsonProperty(value = "text", required = true) String text) {
        this.to = to;
        this.text = text;
    }

    /**
     * Get the to property: A string representing the language code of the target language.
     *
     * @return the to value.
     */
    public String getTo() {
        return this.to;
    }

    /**
     * Get the text property: A string giving the translated text.
     *
     * @return the text value.
     */
    public String getText() {
        return this.text;
    }

    /**
     * Get the transliteration property: An object giving the translated text in the script specified by the toScript
     * parameter.
     *
     * @return the transliteration value.
     */
    public TransliteratedText getTransliteration() {
        return this.transliteration;
    }

    /**
     * Get the alignment property: Alignment information.
     *
     * @return the alignment value.
     */
    public TranslatedTextAlignment getAlignment() {
        return this.alignment;
    }

    /**
     * Get the sentLen property: Sentence boundaries in the input and output texts.
     *
     * @return the sentLen value.
     */
    public SentenceLength getSentLen() {
        return this.sentLen;
    }
}