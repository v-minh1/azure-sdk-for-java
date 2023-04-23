// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.paloaltonetworks.ngfw.generated;

import com.azure.resourcemanager.paloaltonetworks.ngfw.fluent.models.PostRulesResourceInner;
import com.azure.resourcemanager.paloaltonetworks.ngfw.models.ActionEnum;
import com.azure.resourcemanager.paloaltonetworks.ngfw.models.BooleanEnum;
import com.azure.resourcemanager.paloaltonetworks.ngfw.models.Category;
import com.azure.resourcemanager.paloaltonetworks.ngfw.models.DecryptionRuleTypeEnum;
import com.azure.resourcemanager.paloaltonetworks.ngfw.models.DestinationAddr;
import com.azure.resourcemanager.paloaltonetworks.ngfw.models.SourceAddr;
import com.azure.resourcemanager.paloaltonetworks.ngfw.models.StateEnum;
import com.azure.resourcemanager.paloaltonetworks.ngfw.models.TagInfo;
import java.util.Arrays;

/** Samples for PostRules CreateOrUpdate. */
public final class PostRulesCreateOrUpdateSamples {
    /*
     * x-ms-original-file: specification/paloaltonetworks/resource-manager/PaloAltoNetworks.Cloudngfw/preview/2022-08-29-preview/examples/PostRules_CreateOrUpdate_MaximumSet_Gen.json
     */
    /**
     * Sample code: PostRules_CreateOrUpdate_MaximumSet_Gen.
     *
     * @param manager Entry point to PaloAltoNetworksNgfwManager.
     */
    public static void postRulesCreateOrUpdateMaximumSetGen(
        com.azure.resourcemanager.paloaltonetworks.ngfw.PaloAltoNetworksNgfwManager manager) {
        manager
            .postRules()
            .createOrUpdate(
                "lrs1",
                "1",
                new PostRulesResourceInner()
                    .withEtag("c18e6eef-ba3e-49ee-8a85-2b36c863a9d0")
                    .withRuleName("postRule1")
                    .withDescription("description of post rule")
                    .withRuleState(StateEnum.DISABLED)
                    .withSource(
                        new SourceAddr()
                            .withCidrs(Arrays.asList("1.0.0.1/10"))
                            .withCountries(Arrays.asList("India"))
                            .withFeeds(Arrays.asList("feed"))
                            .withPrefixLists(Arrays.asList("PL1")))
                    .withNegateSource(BooleanEnum.TRUE)
                    .withDestination(
                        new DestinationAddr()
                            .withCidrs(Arrays.asList("1.0.0.1/10"))
                            .withCountries(Arrays.asList("India"))
                            .withFeeds(Arrays.asList("feed"))
                            .withPrefixLists(Arrays.asList("PL1"))
                            .withFqdnLists(Arrays.asList("FQDN1")))
                    .withNegateDestination(BooleanEnum.TRUE)
                    .withApplications(Arrays.asList("app1"))
                    .withCategory(
                        new Category()
                            .withUrlCustom(Arrays.asList("https://microsoft.com"))
                            .withFeeds(Arrays.asList("feed")))
                    .withProtocol("HTTP")
                    .withProtocolPortList(Arrays.asList("80"))
                    .withInboundInspectionCertificate("cert1")
                    .withAuditComment("example comment")
                    .withActionType(ActionEnum.ALLOW)
                    .withEnableLogging(StateEnum.DISABLED)
                    .withDecryptionRuleType(DecryptionRuleTypeEnum.SSLOUTBOUND_INSPECTION)
                    .withTags(Arrays.asList(new TagInfo().withKey("fakeTokenPlaceholder").withValue("value"))),
                com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file: specification/paloaltonetworks/resource-manager/PaloAltoNetworks.Cloudngfw/preview/2022-08-29-preview/examples/PostRules_CreateOrUpdate_MinimumSet_Gen.json
     */
    /**
     * Sample code: PostRules_CreateOrUpdate_MinimumSet_Gen.
     *
     * @param manager Entry point to PaloAltoNetworksNgfwManager.
     */
    public static void postRulesCreateOrUpdateMinimumSetGen(
        com.azure.resourcemanager.paloaltonetworks.ngfw.PaloAltoNetworksNgfwManager manager) {
        manager
            .postRules()
            .createOrUpdate(
                "lrs1", "1", new PostRulesResourceInner().withRuleName("postRule1"), com.azure.core.util.Context.NONE);
    }
}