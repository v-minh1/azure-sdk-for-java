// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.alertsmanagement.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.alertsmanagement.fluent.models.OperationInner;
import com.azure.resourcemanager.alertsmanagement.models.OperationDisplay;
import com.azure.resourcemanager.alertsmanagement.models.OperationsList;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class OperationsListTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        OperationsList model = BinaryData.fromString(
            "{\"nextLink\":\"ldtlwwr\",\"value\":[{\"name\":\"m\",\"display\":{\"provider\":\"vokotllxdyh\",\"resource\":\"y\",\"operation\":\"ogjltdtbnnhad\",\"description\":\"crkvcikhnv\"},\"origin\":\"mqg\"},{\"name\":\"queziky\",\"display\":{\"provider\":\"xkalla\",\"resource\":\"elwuipi\",\"operation\":\"jzkzi\",\"description\":\"vvcnayr\"},\"origin\":\"rnxxmueed\"},{\"name\":\"rdvstkwqqtch\",\"display\":{\"provider\":\"mfmtdaaygdvw\",\"resource\":\"piohgwxrtfu\",\"operation\":\"epxgyqagvr\",\"description\":\"npkukghimdblx\"},\"origin\":\"imfnjhfjx\"},{\"name\":\"szkkfoqre\",\"display\":{\"provider\":\"zi\",\"resource\":\"jawneaiv\",\"operation\":\"czelpcirel\",\"description\":\"eae\"},\"origin\":\"abfatkl\"}]}")
            .toObject(OperationsList.class);
        Assertions.assertEquals("ldtlwwr", model.nextLink());
        Assertions.assertEquals("m", model.value().get(0).name());
        Assertions.assertEquals("vokotllxdyh", model.value().get(0).display().provider());
        Assertions.assertEquals("y", model.value().get(0).display().resource());
        Assertions.assertEquals("ogjltdtbnnhad", model.value().get(0).display().operation());
        Assertions.assertEquals("crkvcikhnv", model.value().get(0).display().description());
        Assertions.assertEquals("mqg", model.value().get(0).origin());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        OperationsList model = new OperationsList().withNextLink("ldtlwwr")
            .withValue(Arrays.asList(
                new OperationInner().withName("m")
                    .withDisplay(new OperationDisplay().withProvider("vokotllxdyh")
                        .withResource("y")
                        .withOperation("ogjltdtbnnhad")
                        .withDescription("crkvcikhnv"))
                    .withOrigin("mqg"),
                new OperationInner().withName("queziky")
                    .withDisplay(new OperationDisplay().withProvider("xkalla")
                        .withResource("elwuipi")
                        .withOperation("jzkzi")
                        .withDescription("vvcnayr"))
                    .withOrigin("rnxxmueed"),
                new OperationInner().withName("rdvstkwqqtch")
                    .withDisplay(new OperationDisplay().withProvider("mfmtdaaygdvw")
                        .withResource("piohgwxrtfu")
                        .withOperation("epxgyqagvr")
                        .withDescription("npkukghimdblx"))
                    .withOrigin("imfnjhfjx"),
                new OperationInner().withName("szkkfoqre")
                    .withDisplay(new OperationDisplay().withProvider("zi")
                        .withResource("jawneaiv")
                        .withOperation("czelpcirel")
                        .withDescription("eae"))
                    .withOrigin("abfatkl")));
        model = BinaryData.fromObject(model).toObject(OperationsList.class);
        Assertions.assertEquals("ldtlwwr", model.nextLink());
        Assertions.assertEquals("m", model.value().get(0).name());
        Assertions.assertEquals("vokotllxdyh", model.value().get(0).display().provider());
        Assertions.assertEquals("y", model.value().get(0).display().resource());
        Assertions.assertEquals("ogjltdtbnnhad", model.value().get(0).display().operation());
        Assertions.assertEquals("crkvcikhnv", model.value().get(0).display().description());
        Assertions.assertEquals("mqg", model.value().get(0).origin());
    }
}
