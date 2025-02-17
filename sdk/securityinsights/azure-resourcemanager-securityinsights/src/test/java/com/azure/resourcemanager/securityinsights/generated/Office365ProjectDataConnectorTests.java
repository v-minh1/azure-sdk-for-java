// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.securityinsights.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.securityinsights.models.DataTypeState;
import com.azure.resourcemanager.securityinsights.models.Office365ProjectConnectorDataTypes;
import com.azure.resourcemanager.securityinsights.models.Office365ProjectConnectorDataTypesLogs;
import com.azure.resourcemanager.securityinsights.models.Office365ProjectDataConnector;
import org.junit.jupiter.api.Assertions;

public final class Office365ProjectDataConnectorTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        Office365ProjectDataConnector model = BinaryData.fromString(
            "{\"kind\":\"Office365Project\",\"properties\":{\"dataTypes\":{\"logs\":{\"state\":\"Enabled\"}},\"tenantId\":\"jew\"},\"etag\":\"hwkxjjmztnl\",\"id\":\"oodtm\",\"name\":\"ecdh\",\"type\":\"yswcrptveajczx\"}")
            .toObject(Office365ProjectDataConnector.class);
        Assertions.assertEquals("hwkxjjmztnl", model.etag());
        Assertions.assertEquals(DataTypeState.ENABLED, model.dataTypes().logs().state());
        Assertions.assertEquals("jew", model.tenantId());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        Office365ProjectDataConnector model = new Office365ProjectDataConnector().withEtag("hwkxjjmztnl")
            .withDataTypes(new Office365ProjectConnectorDataTypes()
                .withLogs(new Office365ProjectConnectorDataTypesLogs().withState(DataTypeState.ENABLED)))
            .withTenantId("jew");
        model = BinaryData.fromObject(model).toObject(Office365ProjectDataConnector.class);
        Assertions.assertEquals("hwkxjjmztnl", model.etag());
        Assertions.assertEquals(DataTypeState.ENABLED, model.dataTypes().logs().state());
        Assertions.assertEquals("jew", model.tenantId());
    }
}
