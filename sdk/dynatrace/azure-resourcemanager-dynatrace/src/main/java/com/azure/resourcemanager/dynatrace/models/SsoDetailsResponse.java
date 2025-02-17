// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.dynatrace.models;

import com.azure.resourcemanager.dynatrace.fluent.models.SsoDetailsResponseInner;
import java.util.List;

/**
 * An immutable client-side representation of SsoDetailsResponse.
 */
public interface SsoDetailsResponse {
    /**
     * Gets the isSsoEnabled property: Whether the SSO is enabled for this resource or not.
     * 
     * @return the isSsoEnabled value.
     */
    SsoStatus isSsoEnabled();

    /**
     * Gets the metadataUrl property: URL for Azure AD metadata.
     * 
     * @return the metadataUrl value.
     */
    String metadataUrl();

    /**
     * Gets the singleSignOnUrl property: The login URL specific to this Dynatrace Environment.
     * 
     * @return the singleSignOnUrl value.
     */
    String singleSignOnUrl();

    /**
     * Gets the aadDomains property: array of Aad(azure active directory) domains.
     * 
     * @return the aadDomains value.
     */
    List<String> aadDomains();

    /**
     * Gets the adminUsers property: Array of admin user emails.
     * 
     * @return the adminUsers value.
     */
    List<String> adminUsers();

    /**
     * Gets the inner com.azure.resourcemanager.dynatrace.fluent.models.SsoDetailsResponseInner object.
     * 
     * @return the inner object.
     */
    SsoDetailsResponseInner innerModel();
}
