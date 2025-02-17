// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicessiterecovery.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.recoveryservicessiterecovery.models.DiskAccountType;
import com.azure.resourcemanager.recoveryservicessiterecovery.models.InMageRcmDiskInput;
import com.azure.resourcemanager.recoveryservicessiterecovery.models.InMageRcmDisksDefaultInput;
import com.azure.resourcemanager.recoveryservicessiterecovery.models.InMageRcmEnableProtectionInput;
import com.azure.resourcemanager.recoveryservicessiterecovery.models.LicenseType;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class InMageRcmEnableProtectionInputTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        InMageRcmEnableProtectionInput model = BinaryData.fromString(
            "{\"instanceType\":\"InMageRcm\",\"fabricDiscoveryMachineId\":\"llukkreh\",\"disksToInclude\":[{\"diskId\":\"mjodu\",\"logStorageAccountId\":\"fvulxfaryr\",\"diskType\":\"Standard_LRS\",\"diskEncryptionSetId\":\"gdezvjqwahoy\"},{\"diskId\":\"yaxqvjweiwtczkd\",\"logStorageAccountId\":\"nvovbooqbmdqrxy\",\"diskType\":\"StandardSSD_LRS\",\"diskEncryptionSetId\":\"et\"},{\"diskId\":\"cflwtjdtlr\",\"logStorageAccountId\":\"e\",\"diskType\":\"Premium_LRS\",\"diskEncryptionSetId\":\"y\"}],\"disksDefault\":{\"logStorageAccountId\":\"uxdtzcq\",\"diskType\":\"Standard_LRS\",\"diskEncryptionSetId\":\"dudgcozzomeh\"},\"targetResourceGroupId\":\"lantolamlb\",\"targetNetworkId\":\"uxkqllczipvwdt\",\"testNetworkId\":\"kzdqiqdlratrkwxo\",\"targetSubnetName\":\"wxsuy\",\"testSubnetName\":\"nhrfgslgl\",\"targetVmName\":\"ry\",\"targetVmSize\":\"zihuioaeo\",\"licenseType\":\"NoLicenseType\",\"targetAvailabilitySetId\":\"tfeyvk\",\"targetAvailabilityZone\":\"gdd\",\"targetProximityPlacementGroupId\":\"hdccxb\",\"targetBootDiagnosticsStorageAccountId\":\"uqutkzwtjww\",\"runAsAccountId\":\"zytijcx\",\"processServerId\":\"nondegjdyd\",\"multiVmGroupName\":\"kkkbjuckcatuqbh\"}")
            .toObject(InMageRcmEnableProtectionInput.class);
        Assertions.assertEquals("llukkreh", model.fabricDiscoveryMachineId());
        Assertions.assertEquals("mjodu", model.disksToInclude().get(0).diskId());
        Assertions.assertEquals("fvulxfaryr", model.disksToInclude().get(0).logStorageAccountId());
        Assertions.assertEquals(DiskAccountType.STANDARD_LRS, model.disksToInclude().get(0).diskType());
        Assertions.assertEquals("gdezvjqwahoy", model.disksToInclude().get(0).diskEncryptionSetId());
        Assertions.assertEquals("uxdtzcq", model.disksDefault().logStorageAccountId());
        Assertions.assertEquals(DiskAccountType.STANDARD_LRS, model.disksDefault().diskType());
        Assertions.assertEquals("dudgcozzomeh", model.disksDefault().diskEncryptionSetId());
        Assertions.assertEquals("lantolamlb", model.targetResourceGroupId());
        Assertions.assertEquals("uxkqllczipvwdt", model.targetNetworkId());
        Assertions.assertEquals("kzdqiqdlratrkwxo", model.testNetworkId());
        Assertions.assertEquals("wxsuy", model.targetSubnetName());
        Assertions.assertEquals("nhrfgslgl", model.testSubnetName());
        Assertions.assertEquals("ry", model.targetVmName());
        Assertions.assertEquals("zihuioaeo", model.targetVmSize());
        Assertions.assertEquals(LicenseType.NO_LICENSE_TYPE, model.licenseType());
        Assertions.assertEquals("tfeyvk", model.targetAvailabilitySetId());
        Assertions.assertEquals("gdd", model.targetAvailabilityZone());
        Assertions.assertEquals("hdccxb", model.targetProximityPlacementGroupId());
        Assertions.assertEquals("uqutkzwtjww", model.targetBootDiagnosticsStorageAccountId());
        Assertions.assertEquals("zytijcx", model.runAsAccountId());
        Assertions.assertEquals("nondegjdyd", model.processServerId());
        Assertions.assertEquals("kkkbjuckcatuqbh", model.multiVmGroupName());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        InMageRcmEnableProtectionInput model
            = new InMageRcmEnableProtectionInput().withFabricDiscoveryMachineId("llukkreh")
                .withDisksToInclude(Arrays.asList(
                    new InMageRcmDiskInput().withDiskId("mjodu")
                        .withLogStorageAccountId("fvulxfaryr")
                        .withDiskType(DiskAccountType.STANDARD_LRS)
                        .withDiskEncryptionSetId("gdezvjqwahoy"),
                    new InMageRcmDiskInput().withDiskId("yaxqvjweiwtczkd")
                        .withLogStorageAccountId("nvovbooqbmdqrxy")
                        .withDiskType(DiskAccountType.STANDARD_SSD_LRS)
                        .withDiskEncryptionSetId("et"),
                    new InMageRcmDiskInput().withDiskId("cflwtjdtlr")
                        .withLogStorageAccountId("e")
                        .withDiskType(DiskAccountType.PREMIUM_LRS)
                        .withDiskEncryptionSetId("y")))
                .withDisksDefault(new InMageRcmDisksDefaultInput().withLogStorageAccountId("uxdtzcq")
                    .withDiskType(DiskAccountType.STANDARD_LRS)
                    .withDiskEncryptionSetId("dudgcozzomeh"))
                .withTargetResourceGroupId("lantolamlb")
                .withTargetNetworkId("uxkqllczipvwdt")
                .withTestNetworkId("kzdqiqdlratrkwxo")
                .withTargetSubnetName("wxsuy")
                .withTestSubnetName("nhrfgslgl")
                .withTargetVmName("ry")
                .withTargetVmSize("zihuioaeo")
                .withLicenseType(LicenseType.NO_LICENSE_TYPE)
                .withTargetAvailabilitySetId("tfeyvk")
                .withTargetAvailabilityZone("gdd")
                .withTargetProximityPlacementGroupId("hdccxb")
                .withTargetBootDiagnosticsStorageAccountId("uqutkzwtjww")
                .withRunAsAccountId("zytijcx")
                .withProcessServerId("nondegjdyd")
                .withMultiVmGroupName("kkkbjuckcatuqbh");
        model = BinaryData.fromObject(model).toObject(InMageRcmEnableProtectionInput.class);
        Assertions.assertEquals("llukkreh", model.fabricDiscoveryMachineId());
        Assertions.assertEquals("mjodu", model.disksToInclude().get(0).diskId());
        Assertions.assertEquals("fvulxfaryr", model.disksToInclude().get(0).logStorageAccountId());
        Assertions.assertEquals(DiskAccountType.STANDARD_LRS, model.disksToInclude().get(0).diskType());
        Assertions.assertEquals("gdezvjqwahoy", model.disksToInclude().get(0).diskEncryptionSetId());
        Assertions.assertEquals("uxdtzcq", model.disksDefault().logStorageAccountId());
        Assertions.assertEquals(DiskAccountType.STANDARD_LRS, model.disksDefault().diskType());
        Assertions.assertEquals("dudgcozzomeh", model.disksDefault().diskEncryptionSetId());
        Assertions.assertEquals("lantolamlb", model.targetResourceGroupId());
        Assertions.assertEquals("uxkqllczipvwdt", model.targetNetworkId());
        Assertions.assertEquals("kzdqiqdlratrkwxo", model.testNetworkId());
        Assertions.assertEquals("wxsuy", model.targetSubnetName());
        Assertions.assertEquals("nhrfgslgl", model.testSubnetName());
        Assertions.assertEquals("ry", model.targetVmName());
        Assertions.assertEquals("zihuioaeo", model.targetVmSize());
        Assertions.assertEquals(LicenseType.NO_LICENSE_TYPE, model.licenseType());
        Assertions.assertEquals("tfeyvk", model.targetAvailabilitySetId());
        Assertions.assertEquals("gdd", model.targetAvailabilityZone());
        Assertions.assertEquals("hdccxb", model.targetProximityPlacementGroupId());
        Assertions.assertEquals("uqutkzwtjww", model.targetBootDiagnosticsStorageAccountId());
        Assertions.assertEquals("zytijcx", model.runAsAccountId());
        Assertions.assertEquals("nondegjdyd", model.processServerId());
        Assertions.assertEquals("kkkbjuckcatuqbh", model.multiVmGroupName());
    }
}
