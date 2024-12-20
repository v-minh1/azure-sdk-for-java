// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mysqlflexibleserver.models;

import com.azure.core.util.ExpandableStringEnum;
import java.util.Collection;

/**
 * Specifies the state of the Advanced Threat Protection, whether it is enabled or disabled on the server.
 */
public final class AdvancedThreatProtectionState extends ExpandableStringEnum<AdvancedThreatProtectionState> {
    /**
     * Static value Enabled for AdvancedThreatProtectionState.
     */
    public static final AdvancedThreatProtectionState ENABLED = fromString("Enabled");

    /**
     * Static value Disabled for AdvancedThreatProtectionState.
     */
    public static final AdvancedThreatProtectionState DISABLED = fromString("Disabled");

    /**
     * Creates a new instance of AdvancedThreatProtectionState value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public AdvancedThreatProtectionState() {
    }

    /**
     * Creates or finds a AdvancedThreatProtectionState from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding AdvancedThreatProtectionState.
     */
    public static AdvancedThreatProtectionState fromString(String name) {
        return fromString(name, AdvancedThreatProtectionState.class);
    }

    /**
     * Gets known AdvancedThreatProtectionState values.
     * 
     * @return known AdvancedThreatProtectionState values.
     */
    public static Collection<AdvancedThreatProtectionState> values() {
        return values(AdvancedThreatProtectionState.class);
    }
}
