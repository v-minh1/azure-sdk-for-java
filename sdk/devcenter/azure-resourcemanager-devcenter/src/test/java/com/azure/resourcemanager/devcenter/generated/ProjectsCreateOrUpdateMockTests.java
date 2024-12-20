// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.devcenter.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.core.test.http.MockHttpResponse;
import com.azure.resourcemanager.devcenter.DevCenterManager;
import com.azure.resourcemanager.devcenter.models.CatalogItemType;
import com.azure.resourcemanager.devcenter.models.ManagedServiceIdentity;
import com.azure.resourcemanager.devcenter.models.ManagedServiceIdentityType;
import com.azure.resourcemanager.devcenter.models.Project;
import com.azure.resourcemanager.devcenter.models.ProjectCatalogSettings;
import com.azure.resourcemanager.devcenter.models.UserAssignedIdentity;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;

public final class ProjectsCreateOrUpdateMockTests {
    @Test
    public void testCreateOrUpdate() throws Exception {
        String responseStr
            = "{\"properties\":{\"provisioningState\":\"Succeeded\",\"devCenterUri\":\"zddrt\",\"devCenterId\":\"doj\",\"description\":\"xv\",\"maxDevBoxesPerUser\":1550017967,\"displayName\":\"fdeesvecuijpxtx\",\"catalogSettings\":{\"catalogItemSyncTypes\":[\"EnvironmentDefinition\",\"EnvironmentDefinition\",\"EnvironmentDefinition\"]}},\"identity\":{\"principalId\":\"ad24a459-f833-4808-95ef-a7bae481e1a0\",\"tenantId\":\"bda0ae48-b3ab-4bf0-8e72-1c8d7efe5078\",\"type\":\"UserAssigned\",\"userAssignedIdentities\":{\"ibabxvititvtzeex\":{\"principalId\":\"724843d0-8cd8-4170-9d8d-de504f0d0aee\",\"clientId\":\"d18e14d7-e2f3-446f-934e-aca113d7f384\"},\"xtfglecdmdqb\":{\"principalId\":\"8e39238c-de95-4efd-ae6f-c8ff08b12a55\",\"clientId\":\"81ac274a-9702-41b6-9a2b-8a041d9fdaaa\"}}},\"location\":\"ypq\",\"tags\":{\"vodhtn\":\"fjacbslhhxudb\"},\"id\":\"irudh\",\"name\":\"m\",\"type\":\"es\"}";

        HttpClient httpClient
            = response -> Mono.just(new MockHttpResponse(response, 200, responseStr.getBytes(StandardCharsets.UTF_8)));
        DevCenterManager manager = DevCenterManager.configure()
            .withHttpClient(httpClient)
            .authenticate(tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                new AzureProfile("", "", AzureEnvironment.AZURE));

        Project response = manager.projects()
            .define("hcans")
            .withRegion("bjjidjksyxky")
            .withExistingResourceGroup("zyqdrfegcealzx")
            .withTags(mapOf("nljlageuaulx", "evblbje", "svxeizzgwklnsr", "nsmjbnkppxynen"))
            .withIdentity(
                new ManagedServiceIdentity().withType(ManagedServiceIdentityType.SYSTEM_ASSIGNED_USER_ASSIGNED)
                    .withUserAssignedIdentities(mapOf("gfmo", new UserAssignedIdentity(), "hpqgatjeaahhvj",
                        new UserAssignedIdentity(), "akz", new UserAssignedIdentity())))
            .withDevCenterId("fajuwas")
            .withDescription("daeyygux")
            .withMaxDevBoxesPerUser(346438296)
            .withDisplayName("qzhzbezkgimsi")
            .withCatalogSettings(new ProjectCatalogSettings().withCatalogItemSyncTypes(
                Arrays.asList(CatalogItemType.ENVIRONMENT_DEFINITION, CatalogItemType.ENVIRONMENT_DEFINITION)))
            .create();

        Assertions.assertEquals("ypq", response.location());
        Assertions.assertEquals("fjacbslhhxudb", response.tags().get("vodhtn"));
        Assertions.assertEquals(ManagedServiceIdentityType.USER_ASSIGNED, response.identity().type());
        Assertions.assertEquals("doj", response.devCenterId());
        Assertions.assertEquals("xv", response.description());
        Assertions.assertEquals(1550017967, response.maxDevBoxesPerUser());
        Assertions.assertEquals("fdeesvecuijpxtx", response.displayName());
        Assertions.assertEquals(CatalogItemType.ENVIRONMENT_DEFINITION,
            response.catalogSettings().catalogItemSyncTypes().get(0));
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
