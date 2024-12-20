// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.synapse.generated;

/**
 * Samples for AzureADOnlyAuthentications List.
 */
public final class AzureADOnlyAuthenticationsListSamples {
    /*
     * x-ms-original-file:
     * specification/synapse/resource-manager/Microsoft.Synapse/stable/2021-06-01/examples/ListAzureADOnlyAuthentication
     * .json
     */
    /**
     * Sample code: Get a list of Azure Active Directory Only Authentication property.
     * 
     * @param manager Entry point to SynapseManager.
     */
    public static void getAListOfAzureActiveDirectoryOnlyAuthenticationProperty(
        com.azure.resourcemanager.synapse.SynapseManager manager) {
        manager.azureADOnlyAuthentications().list("workspace-6852", "workspace-2080", com.azure.core.util.Context.NONE);
    }
}
