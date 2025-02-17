// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.reservations.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;

/**
 * Resource collection API of Quotas.
 */
public interface Quotas {
    /**
     * Get the current quota (service limit) and usage of a resource. You can use the response from the GET operation to
     * submit quota update request.
     * 
     * @param subscriptionId Azure subscription ID.
     * @param providerId Azure resource provider ID.
     * @param location Azure region.
     * @param resourceName The resource name for a resource provider, such as SKU name for Microsoft.Compute, Sku or
     * TotalLowPriorityCores for Microsoft.MachineLearningServices.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the current quota (service limit) and usage of a resource.
     */
    Response<CurrentQuotaLimitBase> getWithResponse(String subscriptionId, String providerId, String location,
        String resourceName, Context context);

    /**
     * Get the current quota (service limit) and usage of a resource. You can use the response from the GET operation to
     * submit quota update request.
     * 
     * @param subscriptionId Azure subscription ID.
     * @param providerId Azure resource provider ID.
     * @param location Azure region.
     * @param resourceName The resource name for a resource provider, such as SKU name for Microsoft.Compute, Sku or
     * TotalLowPriorityCores for Microsoft.MachineLearningServices.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the current quota (service limit) and usage of a resource.
     */
    CurrentQuotaLimitBase get(String subscriptionId, String providerId, String location, String resourceName);

    /**
     * Gets a list of current quotas (service limits) and usage for all resources. The response from the list quota
     * operation can be leveraged to request quota updates.
     * 
     * @param subscriptionId Azure subscription ID.
     * @param providerId Azure resource provider ID.
     * @param location Azure region.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of current quotas (service limits) and usage for all resources as paginated response with
     * {@link PagedIterable}.
     */
    PagedIterable<CurrentQuotaLimitBase> list(String subscriptionId, String providerId, String location);

    /**
     * Gets a list of current quotas (service limits) and usage for all resources. The response from the list quota
     * operation can be leveraged to request quota updates.
     * 
     * @param subscriptionId Azure subscription ID.
     * @param providerId Azure resource provider ID.
     * @param location Azure region.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of current quotas (service limits) and usage for all resources as paginated response with
     * {@link PagedIterable}.
     */
    PagedIterable<CurrentQuotaLimitBase> list(String subscriptionId, String providerId, String location,
        Context context);

    /**
     * Get the current quota (service limit) and usage of a resource. You can use the response from the GET operation to
     * submit quota update request.
     * 
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the current quota (service limit) and usage of a resource.
     */
    CurrentQuotaLimitBase getById(String id);

    /**
     * Get the current quota (service limit) and usage of a resource. You can use the response from the GET operation to
     * submit quota update request.
     * 
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the current quota (service limit) and usage of a resource.
     */
    Response<CurrentQuotaLimitBase> getByIdWithResponse(String id, Context context);

    /**
     * Begins definition for a new CurrentQuotaLimitBase resource.
     * 
     * @param name resource name.
     * @return the first stage of the new CurrentQuotaLimitBase definition.
     */
    CurrentQuotaLimitBase.DefinitionStages.Blank define(String name);
}
