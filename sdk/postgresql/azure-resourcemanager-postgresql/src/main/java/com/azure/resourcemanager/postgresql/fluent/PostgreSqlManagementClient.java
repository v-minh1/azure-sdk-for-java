// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.postgresql.fluent;

import com.azure.core.http.HttpPipeline;
import java.time.Duration;

/**
 * The interface for PostgreSqlManagementClient class.
 */
public interface PostgreSqlManagementClient {
    /**
     * Gets The ID of the target subscription.
     * 
     * @return the subscriptionId value.
     */
    String getSubscriptionId();

    /**
     * Gets server parameter.
     * 
     * @return the endpoint value.
     */
    String getEndpoint();

    /**
     * Gets The HTTP pipeline to send requests through.
     * 
     * @return the httpPipeline value.
     */
    HttpPipeline getHttpPipeline();

    /**
     * Gets The default poll interval for long-running operation.
     * 
     * @return the defaultPollInterval value.
     */
    Duration getDefaultPollInterval();

    /**
     * Gets the ServersClient object to access its operations.
     * 
     * @return the ServersClient object.
     */
    ServersClient getServers();

    /**
     * Gets the ReplicasClient object to access its operations.
     * 
     * @return the ReplicasClient object.
     */
    ReplicasClient getReplicas();

    /**
     * Gets the FirewallRulesClient object to access its operations.
     * 
     * @return the FirewallRulesClient object.
     */
    FirewallRulesClient getFirewallRules();

    /**
     * Gets the VirtualNetworkRulesClient object to access its operations.
     * 
     * @return the VirtualNetworkRulesClient object.
     */
    VirtualNetworkRulesClient getVirtualNetworkRules();

    /**
     * Gets the DatabasesClient object to access its operations.
     * 
     * @return the DatabasesClient object.
     */
    DatabasesClient getDatabases();

    /**
     * Gets the ConfigurationsClient object to access its operations.
     * 
     * @return the ConfigurationsClient object.
     */
    ConfigurationsClient getConfigurations();

    /**
     * Gets the ServerParametersClient object to access its operations.
     * 
     * @return the ServerParametersClient object.
     */
    ServerParametersClient getServerParameters();

    /**
     * Gets the LogFilesClient object to access its operations.
     * 
     * @return the LogFilesClient object.
     */
    LogFilesClient getLogFiles();

    /**
     * Gets the ServerAdministratorsClient object to access its operations.
     * 
     * @return the ServerAdministratorsClient object.
     */
    ServerAdministratorsClient getServerAdministrators();

    /**
     * Gets the RecoverableServersClient object to access its operations.
     * 
     * @return the RecoverableServersClient object.
     */
    RecoverableServersClient getRecoverableServers();

    /**
     * Gets the ServerBasedPerformanceTiersClient object to access its operations.
     * 
     * @return the ServerBasedPerformanceTiersClient object.
     */
    ServerBasedPerformanceTiersClient getServerBasedPerformanceTiers();

    /**
     * Gets the LocationBasedPerformanceTiersClient object to access its operations.
     * 
     * @return the LocationBasedPerformanceTiersClient object.
     */
    LocationBasedPerformanceTiersClient getLocationBasedPerformanceTiers();

    /**
     * Gets the CheckNameAvailabilitiesClient object to access its operations.
     * 
     * @return the CheckNameAvailabilitiesClient object.
     */
    CheckNameAvailabilitiesClient getCheckNameAvailabilities();

    /**
     * Gets the OperationsClient object to access its operations.
     * 
     * @return the OperationsClient object.
     */
    OperationsClient getOperations();

    /**
     * Gets the ServerSecurityAlertPoliciesClient object to access its operations.
     * 
     * @return the ServerSecurityAlertPoliciesClient object.
     */
    ServerSecurityAlertPoliciesClient getServerSecurityAlertPolicies();

    /**
     * Gets the PrivateEndpointConnectionsClient object to access its operations.
     * 
     * @return the PrivateEndpointConnectionsClient object.
     */
    PrivateEndpointConnectionsClient getPrivateEndpointConnections();

    /**
     * Gets the PrivateLinkResourcesClient object to access its operations.
     * 
     * @return the PrivateLinkResourcesClient object.
     */
    PrivateLinkResourcesClient getPrivateLinkResources();

    /**
     * Gets the ServerKeysClient object to access its operations.
     * 
     * @return the ServerKeysClient object.
     */
    ServerKeysClient getServerKeys();
}
