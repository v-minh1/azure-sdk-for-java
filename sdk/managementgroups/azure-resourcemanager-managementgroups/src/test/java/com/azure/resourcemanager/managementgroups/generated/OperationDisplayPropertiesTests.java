// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.managementgroups.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.managementgroups.models.OperationDisplayProperties;

public final class OperationDisplayPropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        OperationDisplayProperties model = BinaryData.fromString(
            "{\"provider\":\"xoblytkbl\",\"resource\":\"ewwwfbkrvrnsv\",\"operation\":\"q\",\"description\":\"hxcr\"}")
            .toObject(OperationDisplayProperties.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        OperationDisplayProperties model = new OperationDisplayProperties();
        model = BinaryData.fromObject(model).toObject(OperationDisplayProperties.class);
    }
}
