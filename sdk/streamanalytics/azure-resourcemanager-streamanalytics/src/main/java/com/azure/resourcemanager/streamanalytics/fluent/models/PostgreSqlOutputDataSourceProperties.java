// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.streamanalytics.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.streamanalytics.models.AuthenticationMode;
import com.azure.resourcemanager.streamanalytics.models.PostgreSqlDataSourceProperties;
import java.io.IOException;

/**
 * The properties that are associated with a PostgreSQL output.
 */
@Fluent
public final class PostgreSqlOutputDataSourceProperties extends PostgreSqlDataSourceProperties {
    /**
     * Creates an instance of PostgreSqlOutputDataSourceProperties class.
     */
    public PostgreSqlOutputDataSourceProperties() {
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PostgreSqlOutputDataSourceProperties withServer(String server) {
        super.withServer(server);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PostgreSqlOutputDataSourceProperties withDatabase(String database) {
        super.withDatabase(database);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PostgreSqlOutputDataSourceProperties withTable(String table) {
        super.withTable(table);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PostgreSqlOutputDataSourceProperties withUser(String user) {
        super.withUser(user);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PostgreSqlOutputDataSourceProperties withPassword(String password) {
        super.withPassword(password);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PostgreSqlOutputDataSourceProperties withMaxWriterCount(Float maxWriterCount) {
        super.withMaxWriterCount(maxWriterCount);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PostgreSqlOutputDataSourceProperties withAuthenticationMode(AuthenticationMode authenticationMode) {
        super.withAuthenticationMode(authenticationMode);
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("server", server());
        jsonWriter.writeStringField("database", database());
        jsonWriter.writeStringField("table", table());
        jsonWriter.writeStringField("user", user());
        jsonWriter.writeStringField("password", password());
        jsonWriter.writeNumberField("maxWriterCount", maxWriterCount());
        jsonWriter.writeStringField("authenticationMode",
            authenticationMode() == null ? null : authenticationMode().toString());
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of PostgreSqlOutputDataSourceProperties from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of PostgreSqlOutputDataSourceProperties if the JsonReader was pointing to an instance of it,
     * or null if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the PostgreSqlOutputDataSourceProperties.
     */
    public static PostgreSqlOutputDataSourceProperties fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            PostgreSqlOutputDataSourceProperties deserializedPostgreSqlOutputDataSourceProperties
                = new PostgreSqlOutputDataSourceProperties();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("server".equals(fieldName)) {
                    deserializedPostgreSqlOutputDataSourceProperties.withServer(reader.getString());
                } else if ("database".equals(fieldName)) {
                    deserializedPostgreSqlOutputDataSourceProperties.withDatabase(reader.getString());
                } else if ("table".equals(fieldName)) {
                    deserializedPostgreSqlOutputDataSourceProperties.withTable(reader.getString());
                } else if ("user".equals(fieldName)) {
                    deserializedPostgreSqlOutputDataSourceProperties.withUser(reader.getString());
                } else if ("password".equals(fieldName)) {
                    deserializedPostgreSqlOutputDataSourceProperties.withPassword(reader.getString());
                } else if ("maxWriterCount".equals(fieldName)) {
                    deserializedPostgreSqlOutputDataSourceProperties
                        .withMaxWriterCount(reader.getNullable(JsonReader::getFloat));
                } else if ("authenticationMode".equals(fieldName)) {
                    deserializedPostgreSqlOutputDataSourceProperties
                        .withAuthenticationMode(AuthenticationMode.fromString(reader.getString()));
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedPostgreSqlOutputDataSourceProperties;
        });
    }
}
