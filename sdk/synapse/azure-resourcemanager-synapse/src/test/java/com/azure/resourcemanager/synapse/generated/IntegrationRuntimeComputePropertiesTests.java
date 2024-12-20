// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.synapse.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.synapse.models.DataFlowComputeType;
import com.azure.resourcemanager.synapse.models.IntegrationRuntimeComputeProperties;
import com.azure.resourcemanager.synapse.models.IntegrationRuntimeDataFlowProperties;
import com.azure.resourcemanager.synapse.models.IntegrationRuntimeVNetProperties;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class IntegrationRuntimeComputePropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        IntegrationRuntimeComputeProperties model = BinaryData.fromString(
            "{\"location\":\"fmcwnosb\",\"nodeSize\":\"ehgcvkbcknjo\",\"numberOfNodes\":495627768,\"maxParallelExecutionsPerNode\":1296879245,\"dataFlowProperties\":{\"computeType\":\"MemoryOptimized\",\"coreCount\":324734057,\"timeToLive\":909857948,\"cleanup\":false,\"\":{\"txwaljglzo\":\"dataevxoqei\",\"frqulhmzyqbhd\":\"datalqwa\",\"xwmzwdfkbnrz\":\"dataafjrqpjiyrqjcrg\"}},\"vNetProperties\":{\"vNetId\":\"dltb\",\"subnet\":\"tqjfgxxsaet\",\"publicIPs\":[\"gvpyigdaqqilzdc\",\"uwjoedxnguca\"],\"subnetId\":\"pa\",\"\":{\"mkxwxdcvjwcyziak\":\"datawgilfjqqac\",\"iw\":\"dataciqchxrtuicd\",\"hzzwvywrgyngy\":\"datafmmp\",\"clamgglvlmfejdoq\":\"datagrpxncakiqaondjr\"}},\"\":{\"ayejsxtlgflwfgz\":\"datagltygxhqfgq\",\"lijjjrtvam\":\"dataiucijjcea\"}}")
            .toObject(IntegrationRuntimeComputeProperties.class);
        Assertions.assertEquals("fmcwnosb", model.location());
        Assertions.assertEquals("ehgcvkbcknjo", model.nodeSize());
        Assertions.assertEquals(495627768, model.numberOfNodes());
        Assertions.assertEquals(1296879245, model.maxParallelExecutionsPerNode());
        Assertions.assertEquals(DataFlowComputeType.MEMORY_OPTIMIZED, model.dataFlowProperties().computeType());
        Assertions.assertEquals(324734057, model.dataFlowProperties().coreCount());
        Assertions.assertEquals(909857948, model.dataFlowProperties().timeToLive());
        Assertions.assertEquals(false, model.dataFlowProperties().cleanup());
        Assertions.assertEquals("dltb", model.vNetProperties().vNetId());
        Assertions.assertEquals("tqjfgxxsaet", model.vNetProperties().subnet());
        Assertions.assertEquals("gvpyigdaqqilzdc", model.vNetProperties().publicIPs().get(0));
        Assertions.assertEquals("pa", model.vNetProperties().subnetId());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        IntegrationRuntimeComputeProperties model = new IntegrationRuntimeComputeProperties().withLocation("fmcwnosb")
            .withNodeSize("ehgcvkbcknjo")
            .withNumberOfNodes(495627768)
            .withMaxParallelExecutionsPerNode(1296879245)
            .withDataFlowProperties(
                new IntegrationRuntimeDataFlowProperties().withComputeType(DataFlowComputeType.MEMORY_OPTIMIZED)
                    .withCoreCount(324734057)
                    .withTimeToLive(909857948)
                    .withCleanup(false)
                    .withAdditionalProperties(mapOf()))
            .withVNetProperties(new IntegrationRuntimeVNetProperties().withVNetId("dltb")
                .withSubnet("tqjfgxxsaet")
                .withPublicIPs(Arrays.asList("gvpyigdaqqilzdc", "uwjoedxnguca"))
                .withSubnetId("pa")
                .withAdditionalProperties(mapOf()))
            .withAdditionalProperties(mapOf());
        model = BinaryData.fromObject(model).toObject(IntegrationRuntimeComputeProperties.class);
        Assertions.assertEquals("fmcwnosb", model.location());
        Assertions.assertEquals("ehgcvkbcknjo", model.nodeSize());
        Assertions.assertEquals(495627768, model.numberOfNodes());
        Assertions.assertEquals(1296879245, model.maxParallelExecutionsPerNode());
        Assertions.assertEquals(DataFlowComputeType.MEMORY_OPTIMIZED, model.dataFlowProperties().computeType());
        Assertions.assertEquals(324734057, model.dataFlowProperties().coreCount());
        Assertions.assertEquals(909857948, model.dataFlowProperties().timeToLive());
        Assertions.assertEquals(false, model.dataFlowProperties().cleanup());
        Assertions.assertEquals("dltb", model.vNetProperties().vNetId());
        Assertions.assertEquals("tqjfgxxsaet", model.vNetProperties().subnet());
        Assertions.assertEquals("gvpyigdaqqilzdc", model.vNetProperties().publicIPs().get(0));
        Assertions.assertEquals("pa", model.vNetProperties().subnetId());
    }

    // Use "Map.of" if available
    @SuppressWarnings("unchecked")
    private static <T> Map<String, T> mapOf(Object... inputs) {
        Map<String, T> map = new HashMap<>();
        for (int i = 0; i < inputs.length; i += 2) {
            String key = (String) inputs[i];
            T value = (T) inputs[i + 1];
            map.put(key, value);
        }
        return map;
    }
}
