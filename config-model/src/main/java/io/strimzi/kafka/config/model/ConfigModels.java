/*
 * Copyright 2019, Strimzi authors.
 * License: Apache License 2.0 (see the file LICENSE or http://apache.org/licenses/LICENSE-2.0.html).
 */
package io.strimzi.kafka.config.model;

import java.util.Map;

/**
 * Models all the broker configuration parameters for a given version of the Kafka broker.
 */
public class ConfigModels {
    private String version;
    private Map<String, ConfigModel> configs;

    /**
     * @return The version of the Kafka broker.
     */
    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    /**
     * @return A map from configuration parameter name to its model.
     */
    public Map<String, ConfigModel> getConfigs() {
        return configs;
    }

    public void setConfigs(Map<String, ConfigModel> configs) {
        this.configs = configs;
    }
}