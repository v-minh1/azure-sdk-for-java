// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.fluent.models.HttpDatasetTypeProperties;
import com.azure.resourcemanager.datafactory.models.DatasetCompression;
import com.azure.resourcemanager.datafactory.models.DatasetStorageFormat;
import java.util.HashMap;
import java.util.Map;

public final class HttpDatasetTypePropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        HttpDatasetTypeProperties model = BinaryData.fromString(
            "{\"relativeUrl\":\"datao\",\"requestMethod\":\"dataxxxffgmcuanszee\",\"requestBody\":\"datagcgcsapvbcq\",\"additionalHeaders\":\"datausekijhm\",\"format\":{\"type\":\"DatasetStorageFormat\",\"serializer\":\"datank\",\"deserializer\":\"datavpyr\",\"\":{\"j\":\"datarlfqm\",\"vurkmjufavvln\":\"datawynbfvvc\"}},\"compression\":{\"type\":\"datasotmynklnmrz\",\"level\":\"datatvrkkfcwxizkstx\",\"\":{\"vriuvnfazxtvs\":\"datakeipxutc\",\"kqtjwrv\":\"datayyaeiivj\",\"qetxtdqiuspguzlj\":\"datawojoqf\"}}}")
            .toObject(HttpDatasetTypeProperties.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        HttpDatasetTypeProperties model = new HttpDatasetTypeProperties().withRelativeUrl("datao")
            .withRequestMethod("dataxxxffgmcuanszee")
            .withRequestBody("datagcgcsapvbcq")
            .withAdditionalHeaders("datausekijhm")
            .withFormat(new DatasetStorageFormat().withSerializer("datank")
                .withDeserializer("datavpyr")
                .withAdditionalProperties(mapOf("type", "DatasetStorageFormat")))
            .withCompression(new DatasetCompression().withType("datasotmynklnmrz")
                .withLevel("datatvrkkfcwxizkstx")
                .withAdditionalProperties(mapOf()));
        model = BinaryData.fromObject(model).toObject(HttpDatasetTypeProperties.class);
    }

    // Use "Map.of" if available
    @SuppressWarnings("unchecked")
    private static <T> Map<String, T> mapOf(Object... inputs) {
        Map<String, T> map = new HashMap<>();
        for (int i = 0; i < inputs.length; i += 2) {
            String key = (String) inputs[i];
            T value = (T) inputs[i + 1];
            map.put(key, value);
        }
        return map;
    }
}
