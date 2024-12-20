// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.kusto.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.kusto.models.DatabasePrincipalAssignmentCheckNameRequest;
import org.junit.jupiter.api.Assertions;

public final class DatabasePrincipalAssignmentCheckNameRequestTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        DatabasePrincipalAssignmentCheckNameRequest model = BinaryData.fromString("{\"name\":\"hfwdsjnkaljutiis\"}")
            .toObject(DatabasePrincipalAssignmentCheckNameRequest.class);
        Assertions.assertEquals("hfwdsjnkaljutiis", model.name());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        DatabasePrincipalAssignmentCheckNameRequest model
            = new DatabasePrincipalAssignmentCheckNameRequest().withName("hfwdsjnkaljutiis");
        model = BinaryData.fromObject(model).toObject(DatabasePrincipalAssignmentCheckNameRequest.class);
        Assertions.assertEquals("hfwdsjnkaljutiis", model.name());
    }
}
