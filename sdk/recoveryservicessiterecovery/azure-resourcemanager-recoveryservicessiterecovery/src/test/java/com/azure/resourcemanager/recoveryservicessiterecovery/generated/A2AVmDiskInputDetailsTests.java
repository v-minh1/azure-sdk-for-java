// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicessiterecovery.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.recoveryservicessiterecovery.models.A2AVmDiskInputDetails;
import org.junit.jupiter.api.Assertions;

public final class A2AVmDiskInputDetailsTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        A2AVmDiskInputDetails model = BinaryData.fromString(
            "{\"diskUri\":\"qdx\",\"recoveryAzureStorageAccountId\":\"urnpnuhzafccnuh\",\"primaryStagingAzureStorageAccountId\":\"i\"}")
            .toObject(A2AVmDiskInputDetails.class);
        Assertions.assertEquals("qdx", model.diskUri());
        Assertions.assertEquals("urnpnuhzafccnuh", model.recoveryAzureStorageAccountId());
        Assertions.assertEquals("i", model.primaryStagingAzureStorageAccountId());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        A2AVmDiskInputDetails model = new A2AVmDiskInputDetails().withDiskUri("qdx")
            .withRecoveryAzureStorageAccountId("urnpnuhzafccnuh")
            .withPrimaryStagingAzureStorageAccountId("i");
        model = BinaryData.fromObject(model).toObject(A2AVmDiskInputDetails.class);
        Assertions.assertEquals("qdx", model.diskUri());
        Assertions.assertEquals("urnpnuhzafccnuh", model.recoveryAzureStorageAccountId());
        Assertions.assertEquals("i", model.primaryStagingAzureStorageAccountId());
    }
}
