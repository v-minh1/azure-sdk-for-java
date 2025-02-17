// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.confluent.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.core.test.http.MockHttpResponse;
import com.azure.resourcemanager.confluent.ConfluentManager;
import com.azure.resourcemanager.confluent.models.AccessRoleBindingNameListSuccessResponse;
import com.azure.resourcemanager.confluent.models.ListAccessRequestModel;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;

public final class AccessListRoleBindingNameListWithResponseMockTests {
    @Test
    public void testListRoleBindingNameListWithResponse() throws Exception {
        String responseStr
            = "{\"kind\":\"tuwkffdj\",\"metadata\":{\"first\":\"ysidfvclgl\",\"last\":\"fuijtkbus\",\"prev\":\"gsfikayiansha\",\"next\":\"jtjiqx\",\"total_size\":1119516110},\"data\":[\"ttvwkpqh\"]}";

        HttpClient httpClient
            = response -> Mono.just(new MockHttpResponse(response, 200, responseStr.getBytes(StandardCharsets.UTF_8)));
        ConfluentManager manager = ConfluentManager.configure()
            .withHttpClient(httpClient)
            .authenticate(tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                new AzureProfile("", "", AzureEnvironment.AZURE));

        AccessRoleBindingNameListSuccessResponse response = manager.access()
            .listRoleBindingNameListWithResponse("kjbsah", "tdtpdelqacslmo",
                new ListAccessRequestModel()
                    .withSearchFilters(mapOf("k", "bnfxofvc", "xejw", "dirazf", "jurbuhhlkyqltqsr", "bmdujtmvcopexc")),
                com.azure.core.util.Context.NONE)
            .getValue();

        Assertions.assertEquals("tuwkffdj", response.kind());
        Assertions.assertEquals("ysidfvclgl", response.metadata().first());
        Assertions.assertEquals("fuijtkbus", response.metadata().last());
        Assertions.assertEquals("gsfikayiansha", response.metadata().prev());
        Assertions.assertEquals("jtjiqx", response.metadata().next());
        Assertions.assertEquals(1119516110, response.metadata().totalSize());
        Assertions.assertEquals("ttvwkpqh", response.data().get(0));
    }

    // Use "Map.of" if available
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
