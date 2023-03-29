// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.newrelicobservability.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.newrelicobservability.fluent.models.OrganizationResourceInner;
import com.azure.resourcemanager.newrelicobservability.models.BillingSource;
import com.azure.resourcemanager.newrelicobservability.models.OrganizationsListResponse;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class OrganizationsListResponseTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        OrganizationsListResponse model =
            BinaryData
                .fromString(
                    "{\"value\":[{\"properties\":{\"organizationId\":\"irsoodqxhcrmnohj\",\"organizationName\":\"kwh\",\"billingSource\":\"NEWRELIC\"},\"id\":\"fiyipjxsqwpgrj\",\"name\":\"znorcj\",\"type\":\"vsnb\"},{\"properties\":{\"organizationId\":\"abnmocpcyshu\",\"organizationName\":\"afbljjgpbtoqcjmk\",\"billingSource\":\"AZURE\"},\"id\":\"bqidtqaj\",\"name\":\"yulpkudjkr\",\"type\":\"khbzhfepgzg\"},{\"properties\":{\"organizationId\":\"zloc\",\"organizationName\":\"c\",\"billingSource\":\"NEWRELIC\"},\"id\":\"rhhbcs\",\"name\":\"l\",\"type\":\"mmajtjaodx\"}],\"nextLink\":\"nbdxk\"}")
                .toObject(OrganizationsListResponse.class);
        Assertions.assertEquals("irsoodqxhcrmnohj", model.value().get(0).organizationId());
        Assertions.assertEquals("kwh", model.value().get(0).organizationName());
        Assertions.assertEquals(BillingSource.NEWRELIC, model.value().get(0).billingSource());
        Assertions.assertEquals("nbdxk", model.nextLink());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        OrganizationsListResponse model =
            new OrganizationsListResponse()
                .withValue(
                    Arrays
                        .asList(
                            new OrganizationResourceInner()
                                .withOrganizationId("irsoodqxhcrmnohj")
                                .withOrganizationName("kwh")
                                .withBillingSource(BillingSource.NEWRELIC),
                            new OrganizationResourceInner()
                                .withOrganizationId("abnmocpcyshu")
                                .withOrganizationName("afbljjgpbtoqcjmk")
                                .withBillingSource(BillingSource.AZURE),
                            new OrganizationResourceInner()
                                .withOrganizationId("zloc")
                                .withOrganizationName("c")
                                .withBillingSource(BillingSource.NEWRELIC)))
                .withNextLink("nbdxk");
        model = BinaryData.fromObject(model).toObject(OrganizationsListResponse.class);
        Assertions.assertEquals("irsoodqxhcrmnohj", model.value().get(0).organizationId());
        Assertions.assertEquals("kwh", model.value().get(0).organizationName());
        Assertions.assertEquals(BillingSource.NEWRELIC, model.value().get(0).billingSource());
        Assertions.assertEquals("nbdxk", model.nextLink());
    }
}