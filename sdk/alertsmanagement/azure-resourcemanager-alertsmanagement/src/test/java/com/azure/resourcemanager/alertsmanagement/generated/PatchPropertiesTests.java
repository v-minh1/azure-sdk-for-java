// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.alertsmanagement.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.alertsmanagement.fluent.models.PatchProperties;
import org.junit.jupiter.api.Assertions;

public final class PatchPropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        PatchProperties model = BinaryData.fromString("{\"enabled\":false}").toObject(PatchProperties.class);
        Assertions.assertEquals(false, model.enabled());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        PatchProperties model = new PatchProperties().withEnabled(false);
        model = BinaryData.fromObject(model).toObject(PatchProperties.class);
        Assertions.assertEquals(false, model.enabled());
    }
}
