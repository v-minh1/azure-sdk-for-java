// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.managednetworkfabric.models;

import com.azure.core.util.ExpandableStringEnum;
import java.util.Collection;

/**
 * AddressFamilyType. This parameter decides whether the given ipv4 or ipv6 route policy.
 */
public final class AddressFamilyType extends ExpandableStringEnum<AddressFamilyType> {
    /**
     * Static value IPv4 for AddressFamilyType.
     */
    public static final AddressFamilyType IPV4 = fromString("IPv4");

    /**
     * Static value IPv6 for AddressFamilyType.
     */
    public static final AddressFamilyType IPV6 = fromString("IPv6");

    /**
     * Creates a new instance of AddressFamilyType value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public AddressFamilyType() {
    }

    /**
     * Creates or finds a AddressFamilyType from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding AddressFamilyType.
     */
    public static AddressFamilyType fromString(String name) {
        return fromString(name, AddressFamilyType.class);
    }

    /**
     * Gets known AddressFamilyType values.
     * 
     * @return known AddressFamilyType values.
     */
    public static Collection<AddressFamilyType> values() {
        return values(AddressFamilyType.class);
    }
}
