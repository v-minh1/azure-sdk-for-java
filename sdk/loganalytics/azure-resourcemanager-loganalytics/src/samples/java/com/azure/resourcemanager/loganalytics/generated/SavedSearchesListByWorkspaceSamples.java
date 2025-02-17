// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.loganalytics.generated;

/**
 * Samples for SavedSearches ListByWorkspace.
 */
public final class SavedSearchesListByWorkspaceSamples {
    /*
     * x-ms-original-file:
     * specification/operationalinsights/resource-manager/Microsoft.OperationalInsights/stable/2020-08-01/examples/
     * SavedSearchesListByWorkspace.json
     */
    /**
     * Sample code: SavedSearchesList.
     * 
     * @param manager Entry point to LogAnalyticsManager.
     */
    public static void savedSearchesList(com.azure.resourcemanager.loganalytics.LogAnalyticsManager manager) {
        manager.savedSearches().listByWorkspaceWithResponse("TestRG", "TestWS", com.azure.core.util.Context.NONE);
    }
}
