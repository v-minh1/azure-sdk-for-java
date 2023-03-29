// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.security.models.InformationProtectionKeyword;
import org.junit.jupiter.api.Assertions;

public final class InformationProtectionKeywordTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        InformationProtectionKeyword model =
            BinaryData
                .fromString(
                    "{\"pattern\":\"zlxwabmqoefkifr\",\"custom\":true,\"canBeNumeric\":true,\"excluded\":false}")
                .toObject(InformationProtectionKeyword.class);
        Assertions.assertEquals("zlxwabmqoefkifr", model.pattern());
        Assertions.assertEquals(true, model.custom());
        Assertions.assertEquals(true, model.canBeNumeric());
        Assertions.assertEquals(false, model.excluded());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        InformationProtectionKeyword model =
            new InformationProtectionKeyword()
                .withPattern("zlxwabmqoefkifr")
                .withCustom(true)
                .withCanBeNumeric(true)
                .withExcluded(false);
        model = BinaryData.fromObject(model).toObject(InformationProtectionKeyword.class);
        Assertions.assertEquals("zlxwabmqoefkifr", model.pattern());
        Assertions.assertEquals(true, model.custom());
        Assertions.assertEquals(true, model.canBeNumeric());
        Assertions.assertEquals(false, model.excluded());
    }
}