// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mysqlflexibleserver.generated;

/**
 * Samples for LocationBasedCapabilitySet Get.
 */
public final class LocationBasedCapabilitySetGetSamples {
    /*
     * x-ms-original-file:
     * specification/mysql/resource-manager/Microsoft.DBforMySQL/ServiceOperations/stable/2023-12-30/examples/
     * CapabilitySetByLocation.json
     */
    /**
     * Sample code: CapabilityResult.
     * 
     * @param manager Entry point to MySqlManager.
     */
    public static void capabilityResult(com.azure.resourcemanager.mysqlflexibleserver.MySqlManager manager) {
        manager.locationBasedCapabilitySets().getWithResponse("WestUS", "default", com.azure.core.util.Context.NONE);
    }
}
