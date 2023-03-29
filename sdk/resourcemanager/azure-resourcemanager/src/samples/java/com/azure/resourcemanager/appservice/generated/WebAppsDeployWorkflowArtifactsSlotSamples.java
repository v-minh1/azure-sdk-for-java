// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated;

import com.azure.core.management.serializer.SerializerFactory;
import com.azure.core.util.serializer.SerializerEncoding;
import com.azure.resourcemanager.appservice.models.WorkflowArtifacts;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/** Samples for WebApps DeployWorkflowArtifactsSlot. */
public final class WebAppsDeployWorkflowArtifactsSlotSamples {
    /*
     * x-ms-original-file: specification/web/resource-manager/Microsoft.Web/stable/2022-09-01/examples/PostDeployWorkflowArtifactsSlot.json
     */
    /**
     * Sample code: Deploys workflow artifacts slot.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void deploysWorkflowArtifactsSlot(com.azure.resourcemanager.AzureResourceManager azure)
        throws IOException {
        azure
            .webApps()
            .manager()
            .serviceClient()
            .getWebApps()
            .deployWorkflowArtifactsSlotWithResponse(
                "testrg123",
                "testsite2",
                "testsSlot",
                new WorkflowArtifacts()
                    .withAppSettings(
                        SerializerFactory
                            .createDefaultManagementSerializerAdapter()
                            .deserialize(
                                "{\"eventHub_connectionString\":\"Endpoint=sb://example.servicebus.windows.net/;SharedAccessKeyName=RootManageSharedAccessKey;SharedAccessKey=EXAMPLE1a2b3c4d5e6fEXAMPLE=\"}",
                                Object.class,
                                SerializerEncoding.JSON))
                    .withFiles(
                        mapOf(
                            "connections.json",
                            SerializerFactory
                                .createDefaultManagementSerializerAdapter()
                                .deserialize(
                                    "{\"managedApiConnections\":{},\"serviceProviderConnections\":{\"eventHub\":{\"displayName\":\"example1\",\"parameterValues\":{\"connectionString\":\"@appsetting('eventHub_connectionString')\"},\"serviceProvider\":{\"id\":\"/serviceProviders/eventHub\"}}}}",
                                    Object.class,
                                    SerializerEncoding.JSON),
                            "test1/workflow.json",
                            SerializerFactory
                                .createDefaultManagementSerializerAdapter()
                                .deserialize(
                                    "{\"definition\":{\"$schema\":\"https://schema.management.azure.com/providers/Microsoft.Logic/schemas/2016-06-01/workflowdefinition.json#\",\"actions\":{},\"contentVersion\":\"1.0.0.0\",\"outputs\":{},\"triggers\":{\"When_events_are_available_in_Event_hub\":{\"type\":\"ServiceProvider\",\"inputs\":{\"parameters\":{\"eventHubName\":\"test123\"},\"serviceProviderConfiguration\":{\"operationId\":\"receiveEvents\",\"connectionName\":\"eventHub\",\"serviceProviderId\":\"/serviceProviders/eventHub\"}},\"splitOn\":\"@triggerOutputs()?['body']\"}}},\"kind\":\"Stateful\"}",
                                    Object.class,
                                    SerializerEncoding.JSON))),
                com.azure.core.util.Context.NONE);
    }

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