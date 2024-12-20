// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.securityinsights.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.securityinsights.models.AutomationRulePropertyConditionSupportedOperator;
import com.azure.resourcemanager.securityinsights.models.AutomationRulePropertyConditionSupportedProperty;
import com.azure.resourcemanager.securityinsights.models.AutomationRulePropertyValuesCondition;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class AutomationRulePropertyValuesConditionTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        AutomationRulePropertyValuesCondition model = BinaryData.fromString(
            "{\"propertyName\":\"MailMessageSubject\",\"operator\":\"NotEquals\",\"propertyValues\":[\"nctagfyvrtpqpem\",\"z\",\"gkrepdqhqyhw\"]}")
            .toObject(AutomationRulePropertyValuesCondition.class);
        Assertions.assertEquals(AutomationRulePropertyConditionSupportedProperty.MAIL_MESSAGE_SUBJECT,
            model.propertyName());
        Assertions.assertEquals(AutomationRulePropertyConditionSupportedOperator.NOT_EQUALS, model.operator());
        Assertions.assertEquals("nctagfyvrtpqpem", model.propertyValues().get(0));
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        AutomationRulePropertyValuesCondition model = new AutomationRulePropertyValuesCondition()
            .withPropertyName(AutomationRulePropertyConditionSupportedProperty.MAIL_MESSAGE_SUBJECT)
            .withOperator(AutomationRulePropertyConditionSupportedOperator.NOT_EQUALS)
            .withPropertyValues(Arrays.asList("nctagfyvrtpqpem", "z", "gkrepdqhqyhw"));
        model = BinaryData.fromObject(model).toObject(AutomationRulePropertyValuesCondition.class);
        Assertions.assertEquals(AutomationRulePropertyConditionSupportedProperty.MAIL_MESSAGE_SUBJECT,
            model.propertyName());
        Assertions.assertEquals(AutomationRulePropertyConditionSupportedOperator.NOT_EQUALS, model.operator());
        Assertions.assertEquals("nctagfyvrtpqpem", model.propertyValues().get(0));
    }
}
