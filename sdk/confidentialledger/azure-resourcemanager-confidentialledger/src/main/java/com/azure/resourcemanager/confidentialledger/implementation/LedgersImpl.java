// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.confidentialledger.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.confidentialledger.fluent.LedgersClient;
import com.azure.resourcemanager.confidentialledger.fluent.models.ConfidentialLedgerInner;
import com.azure.resourcemanager.confidentialledger.models.ConfidentialLedger;
import com.azure.resourcemanager.confidentialledger.models.Ledgers;

public final class LedgersImpl implements Ledgers {
    private static final ClientLogger LOGGER = new ClientLogger(LedgersImpl.class);

    private final LedgersClient innerClient;

    private final com.azure.resourcemanager.confidentialledger.ConfidentialLedgerManager serviceManager;

    public LedgersImpl(LedgersClient innerClient,
        com.azure.resourcemanager.confidentialledger.ConfidentialLedgerManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public Response<ConfidentialLedger> getByResourceGroupWithResponse(String resourceGroupName, String ledgerName,
        Context context) {
        Response<ConfidentialLedgerInner> inner
            = this.serviceClient().getByResourceGroupWithResponse(resourceGroupName, ledgerName, context);
        if (inner != null) {
            return new SimpleResponse<>(inner.getRequest(), inner.getStatusCode(), inner.getHeaders(),
                new ConfidentialLedgerImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public ConfidentialLedger getByResourceGroup(String resourceGroupName, String ledgerName) {
        ConfidentialLedgerInner inner = this.serviceClient().getByResourceGroup(resourceGroupName, ledgerName);
        if (inner != null) {
            return new ConfidentialLedgerImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public void deleteByResourceGroup(String resourceGroupName, String ledgerName) {
        this.serviceClient().delete(resourceGroupName, ledgerName);
    }

    public void delete(String resourceGroupName, String ledgerName, Context context) {
        this.serviceClient().delete(resourceGroupName, ledgerName, context);
    }

    public PagedIterable<ConfidentialLedger> listByResourceGroup(String resourceGroupName) {
        PagedIterable<ConfidentialLedgerInner> inner = this.serviceClient().listByResourceGroup(resourceGroupName);
        return ResourceManagerUtils.mapPage(inner, inner1 -> new ConfidentialLedgerImpl(inner1, this.manager()));
    }

    public PagedIterable<ConfidentialLedger> listByResourceGroup(String resourceGroupName, String filter,
        Context context) {
        PagedIterable<ConfidentialLedgerInner> inner
            = this.serviceClient().listByResourceGroup(resourceGroupName, filter, context);
        return ResourceManagerUtils.mapPage(inner, inner1 -> new ConfidentialLedgerImpl(inner1, this.manager()));
    }

    public PagedIterable<ConfidentialLedger> list() {
        PagedIterable<ConfidentialLedgerInner> inner = this.serviceClient().list();
        return ResourceManagerUtils.mapPage(inner, inner1 -> new ConfidentialLedgerImpl(inner1, this.manager()));
    }

    public PagedIterable<ConfidentialLedger> list(String filter, Context context) {
        PagedIterable<ConfidentialLedgerInner> inner = this.serviceClient().list(filter, context);
        return ResourceManagerUtils.mapPage(inner, inner1 -> new ConfidentialLedgerImpl(inner1, this.manager()));
    }

    public ConfidentialLedger getById(String id) {
        String resourceGroupName = ResourceManagerUtils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String ledgerName = ResourceManagerUtils.getValueFromIdByName(id, "ledgers");
        if (ledgerName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'ledgers'.", id)));
        }
        return this.getByResourceGroupWithResponse(resourceGroupName, ledgerName, Context.NONE).getValue();
    }

    public Response<ConfidentialLedger> getByIdWithResponse(String id, Context context) {
        String resourceGroupName = ResourceManagerUtils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String ledgerName = ResourceManagerUtils.getValueFromIdByName(id, "ledgers");
        if (ledgerName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'ledgers'.", id)));
        }
        return this.getByResourceGroupWithResponse(resourceGroupName, ledgerName, context);
    }

    public void deleteById(String id) {
        String resourceGroupName = ResourceManagerUtils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String ledgerName = ResourceManagerUtils.getValueFromIdByName(id, "ledgers");
        if (ledgerName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'ledgers'.", id)));
        }
        this.delete(resourceGroupName, ledgerName, Context.NONE);
    }

    public void deleteByIdWithResponse(String id, Context context) {
        String resourceGroupName = ResourceManagerUtils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String ledgerName = ResourceManagerUtils.getValueFromIdByName(id, "ledgers");
        if (ledgerName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'ledgers'.", id)));
        }
        this.delete(resourceGroupName, ledgerName, context);
    }

    private LedgersClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.confidentialledger.ConfidentialLedgerManager manager() {
        return this.serviceManager;
    }

    public ConfidentialLedgerImpl define(String name) {
        return new ConfidentialLedgerImpl(name, this.manager());
    }
}
