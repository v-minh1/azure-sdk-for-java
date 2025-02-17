// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datamigration.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datamigration.models.MigrationReportResult;

public final class MigrationReportResultTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        MigrationReportResult model = BinaryData.fromString("{\"id\":\"ywjhhgdnhx\",\"reportUrl\":\"ivfomiloxgg\"}")
            .toObject(MigrationReportResult.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        MigrationReportResult model = new MigrationReportResult();
        model = BinaryData.fromObject(model).toObject(MigrationReportResult.class);
    }
}
