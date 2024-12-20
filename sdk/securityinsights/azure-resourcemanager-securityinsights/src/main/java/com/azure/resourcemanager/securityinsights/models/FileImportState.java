// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.securityinsights.models;

import com.azure.core.util.ExpandableStringEnum;
import java.util.Collection;

/**
 * The state of the file import.
 */
public final class FileImportState extends ExpandableStringEnum<FileImportState> {
    /**
     * Static value FatalError for FileImportState.
     */
    public static final FileImportState FATAL_ERROR = fromString("FatalError");

    /**
     * Static value Ingested for FileImportState.
     */
    public static final FileImportState INGESTED = fromString("Ingested");

    /**
     * Static value IngestedWithErrors for FileImportState.
     */
    public static final FileImportState INGESTED_WITH_ERRORS = fromString("IngestedWithErrors");

    /**
     * Static value InProgress for FileImportState.
     */
    public static final FileImportState IN_PROGRESS = fromString("InProgress");

    /**
     * Static value Invalid for FileImportState.
     */
    public static final FileImportState INVALID = fromString("Invalid");

    /**
     * Static value WaitingForUpload for FileImportState.
     */
    public static final FileImportState WAITING_FOR_UPLOAD = fromString("WaitingForUpload");

    /**
     * Static value Unspecified for FileImportState.
     */
    public static final FileImportState UNSPECIFIED = fromString("Unspecified");

    /**
     * Creates a new instance of FileImportState value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public FileImportState() {
    }

    /**
     * Creates or finds a FileImportState from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding FileImportState.
     */
    public static FileImportState fromString(String name) {
        return fromString(name, FileImportState.class);
    }

    /**
     * Gets known FileImportState values.
     * 
     * @return known FileImportState values.
     */
    public static Collection<FileImportState> values() {
        return values(FileImportState.class);
    }
}
