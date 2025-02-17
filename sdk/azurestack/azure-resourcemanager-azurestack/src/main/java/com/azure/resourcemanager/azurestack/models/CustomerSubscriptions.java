// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.azurestack.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;

/**
 * Resource collection API of CustomerSubscriptions.
 */
public interface CustomerSubscriptions {
    /**
     * Returns a list of products.
     * 
     * @param resourceGroup Name of the resource group.
     * @param registrationName Name of the Azure Stack registration.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return pageable list of customer subscriptions as paginated response with {@link PagedIterable}.
     */
    PagedIterable<CustomerSubscription> list(String resourceGroup, String registrationName);

    /**
     * Returns a list of products.
     * 
     * @param resourceGroup Name of the resource group.
     * @param registrationName Name of the Azure Stack registration.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return pageable list of customer subscriptions as paginated response with {@link PagedIterable}.
     */
    PagedIterable<CustomerSubscription> list(String resourceGroup, String registrationName, Context context);

    /**
     * Returns the specified product.
     * 
     * @param resourceGroup Name of the resource group.
     * @param registrationName Name of the Azure Stack registration.
     * @param customerSubscriptionName Name of the product.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return customer subscription along with {@link Response}.
     */
    Response<CustomerSubscription> getWithResponse(String resourceGroup, String registrationName,
        String customerSubscriptionName, Context context);

    /**
     * Returns the specified product.
     * 
     * @param resourceGroup Name of the resource group.
     * @param registrationName Name of the Azure Stack registration.
     * @param customerSubscriptionName Name of the product.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return customer subscription.
     */
    CustomerSubscription get(String resourceGroup, String registrationName, String customerSubscriptionName);

    /**
     * Deletes a customer subscription under a registration.
     * 
     * @param resourceGroup Name of the resource group.
     * @param registrationName Name of the Azure Stack registration.
     * @param customerSubscriptionName Name of the product.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response}.
     */
    Response<Void> deleteWithResponse(String resourceGroup, String registrationName, String customerSubscriptionName,
        Context context);

    /**
     * Deletes a customer subscription under a registration.
     * 
     * @param resourceGroup Name of the resource group.
     * @param registrationName Name of the Azure Stack registration.
     * @param customerSubscriptionName Name of the product.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void delete(String resourceGroup, String registrationName, String customerSubscriptionName);

    /**
     * Returns the specified product.
     * 
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return customer subscription along with {@link Response}.
     */
    CustomerSubscription getById(String id);

    /**
     * Returns the specified product.
     * 
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return customer subscription along with {@link Response}.
     */
    Response<CustomerSubscription> getByIdWithResponse(String id, Context context);

    /**
     * Deletes a customer subscription under a registration.
     * 
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteById(String id);

    /**
     * Deletes a customer subscription under a registration.
     * 
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response}.
     */
    Response<Void> deleteByIdWithResponse(String id, Context context);

    /**
     * Begins definition for a new CustomerSubscription resource.
     * 
     * @param name resource name.
     * @return the first stage of the new CustomerSubscription definition.
     */
    CustomerSubscription.DefinitionStages.Blank define(String name);
}
