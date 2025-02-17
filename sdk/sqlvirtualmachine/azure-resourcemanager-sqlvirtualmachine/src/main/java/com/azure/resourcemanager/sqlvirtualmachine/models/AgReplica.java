// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sqlvirtualmachine.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * Availability group replica configuration.
 */
@Fluent
public final class AgReplica implements JsonSerializable<AgReplica> {
    /*
     * Sql VirtualMachine Instance Id.
     */
    private String sqlVirtualMachineInstanceId;

    /*
     * Replica Role in availability group.
     */
    private Role role;

    /*
     * Replica commit mode in availability group.
     */
    private Commit commit;

    /*
     * Replica failover mode in availability group.
     */
    private Failover failover;

    /*
     * Replica readable secondary mode in availability group.
     */
    private ReadableSecondary readableSecondary;

    /**
     * Creates an instance of AgReplica class.
     */
    public AgReplica() {
    }

    /**
     * Get the sqlVirtualMachineInstanceId property: Sql VirtualMachine Instance Id.
     * 
     * @return the sqlVirtualMachineInstanceId value.
     */
    public String sqlVirtualMachineInstanceId() {
        return this.sqlVirtualMachineInstanceId;
    }

    /**
     * Set the sqlVirtualMachineInstanceId property: Sql VirtualMachine Instance Id.
     * 
     * @param sqlVirtualMachineInstanceId the sqlVirtualMachineInstanceId value to set.
     * @return the AgReplica object itself.
     */
    public AgReplica withSqlVirtualMachineInstanceId(String sqlVirtualMachineInstanceId) {
        this.sqlVirtualMachineInstanceId = sqlVirtualMachineInstanceId;
        return this;
    }

    /**
     * Get the role property: Replica Role in availability group.
     * 
     * @return the role value.
     */
    public Role role() {
        return this.role;
    }

    /**
     * Set the role property: Replica Role in availability group.
     * 
     * @param role the role value to set.
     * @return the AgReplica object itself.
     */
    public AgReplica withRole(Role role) {
        this.role = role;
        return this;
    }

    /**
     * Get the commit property: Replica commit mode in availability group.
     * 
     * @return the commit value.
     */
    public Commit commit() {
        return this.commit;
    }

    /**
     * Set the commit property: Replica commit mode in availability group.
     * 
     * @param commit the commit value to set.
     * @return the AgReplica object itself.
     */
    public AgReplica withCommit(Commit commit) {
        this.commit = commit;
        return this;
    }

    /**
     * Get the failover property: Replica failover mode in availability group.
     * 
     * @return the failover value.
     */
    public Failover failover() {
        return this.failover;
    }

    /**
     * Set the failover property: Replica failover mode in availability group.
     * 
     * @param failover the failover value to set.
     * @return the AgReplica object itself.
     */
    public AgReplica withFailover(Failover failover) {
        this.failover = failover;
        return this;
    }

    /**
     * Get the readableSecondary property: Replica readable secondary mode in availability group.
     * 
     * @return the readableSecondary value.
     */
    public ReadableSecondary readableSecondary() {
        return this.readableSecondary;
    }

    /**
     * Set the readableSecondary property: Replica readable secondary mode in availability group.
     * 
     * @param readableSecondary the readableSecondary value to set.
     * @return the AgReplica object itself.
     */
    public AgReplica withReadableSecondary(ReadableSecondary readableSecondary) {
        this.readableSecondary = readableSecondary;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("sqlVirtualMachineInstanceId", this.sqlVirtualMachineInstanceId);
        jsonWriter.writeStringField("role", this.role == null ? null : this.role.toString());
        jsonWriter.writeStringField("commit", this.commit == null ? null : this.commit.toString());
        jsonWriter.writeStringField("failover", this.failover == null ? null : this.failover.toString());
        jsonWriter.writeStringField("readableSecondary",
            this.readableSecondary == null ? null : this.readableSecondary.toString());
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of AgReplica from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of AgReplica if the JsonReader was pointing to an instance of it, or null if it was pointing
     * to JSON null.
     * @throws IOException If an error occurs while reading the AgReplica.
     */
    public static AgReplica fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            AgReplica deserializedAgReplica = new AgReplica();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("sqlVirtualMachineInstanceId".equals(fieldName)) {
                    deserializedAgReplica.sqlVirtualMachineInstanceId = reader.getString();
                } else if ("role".equals(fieldName)) {
                    deserializedAgReplica.role = Role.fromString(reader.getString());
                } else if ("commit".equals(fieldName)) {
                    deserializedAgReplica.commit = Commit.fromString(reader.getString());
                } else if ("failover".equals(fieldName)) {
                    deserializedAgReplica.failover = Failover.fromString(reader.getString());
                } else if ("readableSecondary".equals(fieldName)) {
                    deserializedAgReplica.readableSecondary = ReadableSecondary.fromString(reader.getString());
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedAgReplica;
        });
    }
}
