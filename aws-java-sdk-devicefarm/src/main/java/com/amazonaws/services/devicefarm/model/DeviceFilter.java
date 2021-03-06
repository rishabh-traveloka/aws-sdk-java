/*
 * Copyright 2013-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.devicefarm.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Represents a device filter used to select a set of devices to be included in a test run. This data structure is
 * passed in as the "deviceSelectionConfiguration" parameter to ScheduleRun. For an example of the JSON request syntax,
 * see <a>ScheduleRun</a>.
 * </p>
 * <p>
 * It is also passed in as the "filters" parameter to ListDevices. For an example of the JSON request syntax, see
 * <a>ListDevices</a>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devicefarm-2015-06-23/DeviceFilter" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeviceFilter implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The aspect of a device such as platform or model used as the selection criteria in a device filter.
     * </p>
     * <p>
     * Allowed values include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * ARN: The Amazon Resource Name (ARN) of the device. For example,
     * "arn:aws:devicefarm:us-west-2::device:12345Example".
     * </p>
     * </li>
     * <li>
     * <p>
     * PLATFORM: The device platform. Valid values are "ANDROID" or "IOS".
     * </p>
     * </li>
     * <li>
     * <p>
     * OS_VERSION: The operating system version. For example, "10.3.2".
     * </p>
     * </li>
     * <li>
     * <p>
     * MODEL: The device model. For example, "iPad 5th Gen".
     * </p>
     * </li>
     * <li>
     * <p>
     * AVAILABILITY: The current availability of the device. Valid values are "AVAILABLE", "HIGHLY_AVAILABLE", "BUSY",
     * or "TEMPORARY_NOT_AVAILABLE".
     * </p>
     * </li>
     * <li>
     * <p>
     * FORM_FACTOR: The device form factor. Valid values are "PHONE" or "TABLET".
     * </p>
     * </li>
     * <li>
     * <p>
     * MANUFACTURER: The device manufacturer. For example, "Apple".
     * </p>
     * </li>
     * <li>
     * <p>
     * REMOTE_ACCESS_ENABLED: Whether the device is enabled for remote access.
     * </p>
     * </li>
     * <li>
     * <p>
     * REMOTE_DEBUG_ENABLED: Whether the device is enabled for remote debugging.
     * </p>
     * </li>
     * <li>
     * <p>
     * INSTANCE_ARN: The Amazon Resource Name (ARN) of the device instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * INSTANCE_LABELS: The label of the device instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * FLEET_TYPE: The fleet type. Valid values are "PUBLIC" or "PRIVATE".
     * </p>
     * </li>
     * </ul>
     */
    private String attribute;
    /**
     * <p>
     * The filter operator.
     * </p>
     * <ul>
     * <li>
     * <p>
     * The EQUALS operator is available for every attribute except INSTANCE_LABELS.
     * </p>
     * </li>
     * <li>
     * <p>
     * The CONTAINS operator is available for the INSTANCE_LABELS and MODEL attributes.
     * </p>
     * </li>
     * <li>
     * <p>
     * The IN and NOT_IN operators are available for the ARN, OS_VERSION, MODEL, MANUFACTURER, and INSTANCE_ARN
     * attributes.
     * </p>
     * </li>
     * <li>
     * <p>
     * The LESS_THAN, GREATER_THAN, LESS_THAN_OR_EQUALS, and GREATER_THAN_OR_EQUALS operators are also available for the
     * OS_VERSION attribute.
     * </p>
     * </li>
     * </ul>
     */
    private String operator;
    /**
     * <p>
     * An array of one or more filter values used in a device filter.
     * </p>
     * <p class="title">
     * <b>Operator Values</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * The IN and NOT operators can take a values array that has more than one element.
     * </p>
     * </li>
     * <li>
     * <p>
     * The other operators require an array with a single element.
     * </p>
     * </li>
     * </ul>
     * <p class="title">
     * <b>Attribute Values</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * The PLATFORM attribute can be set to "ANDROID" or "IOS".
     * </p>
     * </li>
     * <li>
     * <p>
     * The AVAILABILITY attribute can be set to "AVAILABLE", "HIGHLY_AVAILABLE", "BUSY", or "TEMPORARY_NOT_AVAILABLE".
     * </p>
     * </li>
     * <li>
     * <p>
     * The FORM_FACTOR attribute can be set to "PHONE" or "TABLET".
     * </p>
     * </li>
     * <li>
     * <p>
     * The FLEET_TYPE attribute can be set to "PUBLIC" or "PRIVATE".
     * </p>
     * </li>
     * </ul>
     */
    private java.util.List<String> values;

    /**
     * <p>
     * The aspect of a device such as platform or model used as the selection criteria in a device filter.
     * </p>
     * <p>
     * Allowed values include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * ARN: The Amazon Resource Name (ARN) of the device. For example,
     * "arn:aws:devicefarm:us-west-2::device:12345Example".
     * </p>
     * </li>
     * <li>
     * <p>
     * PLATFORM: The device platform. Valid values are "ANDROID" or "IOS".
     * </p>
     * </li>
     * <li>
     * <p>
     * OS_VERSION: The operating system version. For example, "10.3.2".
     * </p>
     * </li>
     * <li>
     * <p>
     * MODEL: The device model. For example, "iPad 5th Gen".
     * </p>
     * </li>
     * <li>
     * <p>
     * AVAILABILITY: The current availability of the device. Valid values are "AVAILABLE", "HIGHLY_AVAILABLE", "BUSY",
     * or "TEMPORARY_NOT_AVAILABLE".
     * </p>
     * </li>
     * <li>
     * <p>
     * FORM_FACTOR: The device form factor. Valid values are "PHONE" or "TABLET".
     * </p>
     * </li>
     * <li>
     * <p>
     * MANUFACTURER: The device manufacturer. For example, "Apple".
     * </p>
     * </li>
     * <li>
     * <p>
     * REMOTE_ACCESS_ENABLED: Whether the device is enabled for remote access.
     * </p>
     * </li>
     * <li>
     * <p>
     * REMOTE_DEBUG_ENABLED: Whether the device is enabled for remote debugging.
     * </p>
     * </li>
     * <li>
     * <p>
     * INSTANCE_ARN: The Amazon Resource Name (ARN) of the device instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * INSTANCE_LABELS: The label of the device instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * FLEET_TYPE: The fleet type. Valid values are "PUBLIC" or "PRIVATE".
     * </p>
     * </li>
     * </ul>
     * 
     * @param attribute
     *        The aspect of a device such as platform or model used as the selection criteria in a device filter.</p>
     *        <p>
     *        Allowed values include:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        ARN: The Amazon Resource Name (ARN) of the device. For example,
     *        "arn:aws:devicefarm:us-west-2::device:12345Example".
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        PLATFORM: The device platform. Valid values are "ANDROID" or "IOS".
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        OS_VERSION: The operating system version. For example, "10.3.2".
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        MODEL: The device model. For example, "iPad 5th Gen".
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        AVAILABILITY: The current availability of the device. Valid values are "AVAILABLE", "HIGHLY_AVAILABLE",
     *        "BUSY", or "TEMPORARY_NOT_AVAILABLE".
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        FORM_FACTOR: The device form factor. Valid values are "PHONE" or "TABLET".
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        MANUFACTURER: The device manufacturer. For example, "Apple".
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        REMOTE_ACCESS_ENABLED: Whether the device is enabled for remote access.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        REMOTE_DEBUG_ENABLED: Whether the device is enabled for remote debugging.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        INSTANCE_ARN: The Amazon Resource Name (ARN) of the device instance.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        INSTANCE_LABELS: The label of the device instance.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        FLEET_TYPE: The fleet type. Valid values are "PUBLIC" or "PRIVATE".
     *        </p>
     *        </li>
     * @see DeviceFilterAttribute
     */

    public void setAttribute(String attribute) {
        this.attribute = attribute;
    }

    /**
     * <p>
     * The aspect of a device such as platform or model used as the selection criteria in a device filter.
     * </p>
     * <p>
     * Allowed values include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * ARN: The Amazon Resource Name (ARN) of the device. For example,
     * "arn:aws:devicefarm:us-west-2::device:12345Example".
     * </p>
     * </li>
     * <li>
     * <p>
     * PLATFORM: The device platform. Valid values are "ANDROID" or "IOS".
     * </p>
     * </li>
     * <li>
     * <p>
     * OS_VERSION: The operating system version. For example, "10.3.2".
     * </p>
     * </li>
     * <li>
     * <p>
     * MODEL: The device model. For example, "iPad 5th Gen".
     * </p>
     * </li>
     * <li>
     * <p>
     * AVAILABILITY: The current availability of the device. Valid values are "AVAILABLE", "HIGHLY_AVAILABLE", "BUSY",
     * or "TEMPORARY_NOT_AVAILABLE".
     * </p>
     * </li>
     * <li>
     * <p>
     * FORM_FACTOR: The device form factor. Valid values are "PHONE" or "TABLET".
     * </p>
     * </li>
     * <li>
     * <p>
     * MANUFACTURER: The device manufacturer. For example, "Apple".
     * </p>
     * </li>
     * <li>
     * <p>
     * REMOTE_ACCESS_ENABLED: Whether the device is enabled for remote access.
     * </p>
     * </li>
     * <li>
     * <p>
     * REMOTE_DEBUG_ENABLED: Whether the device is enabled for remote debugging.
     * </p>
     * </li>
     * <li>
     * <p>
     * INSTANCE_ARN: The Amazon Resource Name (ARN) of the device instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * INSTANCE_LABELS: The label of the device instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * FLEET_TYPE: The fleet type. Valid values are "PUBLIC" or "PRIVATE".
     * </p>
     * </li>
     * </ul>
     * 
     * @return The aspect of a device such as platform or model used as the selection criteria in a device filter.</p>
     *         <p>
     *         Allowed values include:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         ARN: The Amazon Resource Name (ARN) of the device. For example,
     *         "arn:aws:devicefarm:us-west-2::device:12345Example".
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         PLATFORM: The device platform. Valid values are "ANDROID" or "IOS".
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         OS_VERSION: The operating system version. For example, "10.3.2".
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MODEL: The device model. For example, "iPad 5th Gen".
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         AVAILABILITY: The current availability of the device. Valid values are "AVAILABLE", "HIGHLY_AVAILABLE",
     *         "BUSY", or "TEMPORARY_NOT_AVAILABLE".
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         FORM_FACTOR: The device form factor. Valid values are "PHONE" or "TABLET".
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MANUFACTURER: The device manufacturer. For example, "Apple".
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         REMOTE_ACCESS_ENABLED: Whether the device is enabled for remote access.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         REMOTE_DEBUG_ENABLED: Whether the device is enabled for remote debugging.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INSTANCE_ARN: The Amazon Resource Name (ARN) of the device instance.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INSTANCE_LABELS: The label of the device instance.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         FLEET_TYPE: The fleet type. Valid values are "PUBLIC" or "PRIVATE".
     *         </p>
     *         </li>
     * @see DeviceFilterAttribute
     */

    public String getAttribute() {
        return this.attribute;
    }

    /**
     * <p>
     * The aspect of a device such as platform or model used as the selection criteria in a device filter.
     * </p>
     * <p>
     * Allowed values include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * ARN: The Amazon Resource Name (ARN) of the device. For example,
     * "arn:aws:devicefarm:us-west-2::device:12345Example".
     * </p>
     * </li>
     * <li>
     * <p>
     * PLATFORM: The device platform. Valid values are "ANDROID" or "IOS".
     * </p>
     * </li>
     * <li>
     * <p>
     * OS_VERSION: The operating system version. For example, "10.3.2".
     * </p>
     * </li>
     * <li>
     * <p>
     * MODEL: The device model. For example, "iPad 5th Gen".
     * </p>
     * </li>
     * <li>
     * <p>
     * AVAILABILITY: The current availability of the device. Valid values are "AVAILABLE", "HIGHLY_AVAILABLE", "BUSY",
     * or "TEMPORARY_NOT_AVAILABLE".
     * </p>
     * </li>
     * <li>
     * <p>
     * FORM_FACTOR: The device form factor. Valid values are "PHONE" or "TABLET".
     * </p>
     * </li>
     * <li>
     * <p>
     * MANUFACTURER: The device manufacturer. For example, "Apple".
     * </p>
     * </li>
     * <li>
     * <p>
     * REMOTE_ACCESS_ENABLED: Whether the device is enabled for remote access.
     * </p>
     * </li>
     * <li>
     * <p>
     * REMOTE_DEBUG_ENABLED: Whether the device is enabled for remote debugging.
     * </p>
     * </li>
     * <li>
     * <p>
     * INSTANCE_ARN: The Amazon Resource Name (ARN) of the device instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * INSTANCE_LABELS: The label of the device instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * FLEET_TYPE: The fleet type. Valid values are "PUBLIC" or "PRIVATE".
     * </p>
     * </li>
     * </ul>
     * 
     * @param attribute
     *        The aspect of a device such as platform or model used as the selection criteria in a device filter.</p>
     *        <p>
     *        Allowed values include:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        ARN: The Amazon Resource Name (ARN) of the device. For example,
     *        "arn:aws:devicefarm:us-west-2::device:12345Example".
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        PLATFORM: The device platform. Valid values are "ANDROID" or "IOS".
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        OS_VERSION: The operating system version. For example, "10.3.2".
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        MODEL: The device model. For example, "iPad 5th Gen".
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        AVAILABILITY: The current availability of the device. Valid values are "AVAILABLE", "HIGHLY_AVAILABLE",
     *        "BUSY", or "TEMPORARY_NOT_AVAILABLE".
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        FORM_FACTOR: The device form factor. Valid values are "PHONE" or "TABLET".
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        MANUFACTURER: The device manufacturer. For example, "Apple".
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        REMOTE_ACCESS_ENABLED: Whether the device is enabled for remote access.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        REMOTE_DEBUG_ENABLED: Whether the device is enabled for remote debugging.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        INSTANCE_ARN: The Amazon Resource Name (ARN) of the device instance.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        INSTANCE_LABELS: The label of the device instance.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        FLEET_TYPE: The fleet type. Valid values are "PUBLIC" or "PRIVATE".
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DeviceFilterAttribute
     */

    public DeviceFilter withAttribute(String attribute) {
        setAttribute(attribute);
        return this;
    }

    /**
     * <p>
     * The aspect of a device such as platform or model used as the selection criteria in a device filter.
     * </p>
     * <p>
     * Allowed values include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * ARN: The Amazon Resource Name (ARN) of the device. For example,
     * "arn:aws:devicefarm:us-west-2::device:12345Example".
     * </p>
     * </li>
     * <li>
     * <p>
     * PLATFORM: The device platform. Valid values are "ANDROID" or "IOS".
     * </p>
     * </li>
     * <li>
     * <p>
     * OS_VERSION: The operating system version. For example, "10.3.2".
     * </p>
     * </li>
     * <li>
     * <p>
     * MODEL: The device model. For example, "iPad 5th Gen".
     * </p>
     * </li>
     * <li>
     * <p>
     * AVAILABILITY: The current availability of the device. Valid values are "AVAILABLE", "HIGHLY_AVAILABLE", "BUSY",
     * or "TEMPORARY_NOT_AVAILABLE".
     * </p>
     * </li>
     * <li>
     * <p>
     * FORM_FACTOR: The device form factor. Valid values are "PHONE" or "TABLET".
     * </p>
     * </li>
     * <li>
     * <p>
     * MANUFACTURER: The device manufacturer. For example, "Apple".
     * </p>
     * </li>
     * <li>
     * <p>
     * REMOTE_ACCESS_ENABLED: Whether the device is enabled for remote access.
     * </p>
     * </li>
     * <li>
     * <p>
     * REMOTE_DEBUG_ENABLED: Whether the device is enabled for remote debugging.
     * </p>
     * </li>
     * <li>
     * <p>
     * INSTANCE_ARN: The Amazon Resource Name (ARN) of the device instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * INSTANCE_LABELS: The label of the device instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * FLEET_TYPE: The fleet type. Valid values are "PUBLIC" or "PRIVATE".
     * </p>
     * </li>
     * </ul>
     * 
     * @param attribute
     *        The aspect of a device such as platform or model used as the selection criteria in a device filter.</p>
     *        <p>
     *        Allowed values include:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        ARN: The Amazon Resource Name (ARN) of the device. For example,
     *        "arn:aws:devicefarm:us-west-2::device:12345Example".
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        PLATFORM: The device platform. Valid values are "ANDROID" or "IOS".
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        OS_VERSION: The operating system version. For example, "10.3.2".
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        MODEL: The device model. For example, "iPad 5th Gen".
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        AVAILABILITY: The current availability of the device. Valid values are "AVAILABLE", "HIGHLY_AVAILABLE",
     *        "BUSY", or "TEMPORARY_NOT_AVAILABLE".
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        FORM_FACTOR: The device form factor. Valid values are "PHONE" or "TABLET".
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        MANUFACTURER: The device manufacturer. For example, "Apple".
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        REMOTE_ACCESS_ENABLED: Whether the device is enabled for remote access.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        REMOTE_DEBUG_ENABLED: Whether the device is enabled for remote debugging.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        INSTANCE_ARN: The Amazon Resource Name (ARN) of the device instance.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        INSTANCE_LABELS: The label of the device instance.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        FLEET_TYPE: The fleet type. Valid values are "PUBLIC" or "PRIVATE".
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DeviceFilterAttribute
     */

    public DeviceFilter withAttribute(DeviceFilterAttribute attribute) {
        this.attribute = attribute.toString();
        return this;
    }

    /**
     * <p>
     * The filter operator.
     * </p>
     * <ul>
     * <li>
     * <p>
     * The EQUALS operator is available for every attribute except INSTANCE_LABELS.
     * </p>
     * </li>
     * <li>
     * <p>
     * The CONTAINS operator is available for the INSTANCE_LABELS and MODEL attributes.
     * </p>
     * </li>
     * <li>
     * <p>
     * The IN and NOT_IN operators are available for the ARN, OS_VERSION, MODEL, MANUFACTURER, and INSTANCE_ARN
     * attributes.
     * </p>
     * </li>
     * <li>
     * <p>
     * The LESS_THAN, GREATER_THAN, LESS_THAN_OR_EQUALS, and GREATER_THAN_OR_EQUALS operators are also available for the
     * OS_VERSION attribute.
     * </p>
     * </li>
     * </ul>
     * 
     * @param operator
     *        The filter operator.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        The EQUALS operator is available for every attribute except INSTANCE_LABELS.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        The CONTAINS operator is available for the INSTANCE_LABELS and MODEL attributes.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        The IN and NOT_IN operators are available for the ARN, OS_VERSION, MODEL, MANUFACTURER, and INSTANCE_ARN
     *        attributes.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        The LESS_THAN, GREATER_THAN, LESS_THAN_OR_EQUALS, and GREATER_THAN_OR_EQUALS operators are also available
     *        for the OS_VERSION attribute.
     *        </p>
     *        </li>
     * @see DeviceFilterOperator
     */

    public void setOperator(String operator) {
        this.operator = operator;
    }

    /**
     * <p>
     * The filter operator.
     * </p>
     * <ul>
     * <li>
     * <p>
     * The EQUALS operator is available for every attribute except INSTANCE_LABELS.
     * </p>
     * </li>
     * <li>
     * <p>
     * The CONTAINS operator is available for the INSTANCE_LABELS and MODEL attributes.
     * </p>
     * </li>
     * <li>
     * <p>
     * The IN and NOT_IN operators are available for the ARN, OS_VERSION, MODEL, MANUFACTURER, and INSTANCE_ARN
     * attributes.
     * </p>
     * </li>
     * <li>
     * <p>
     * The LESS_THAN, GREATER_THAN, LESS_THAN_OR_EQUALS, and GREATER_THAN_OR_EQUALS operators are also available for the
     * OS_VERSION attribute.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The filter operator.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         The EQUALS operator is available for every attribute except INSTANCE_LABELS.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         The CONTAINS operator is available for the INSTANCE_LABELS and MODEL attributes.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         The IN and NOT_IN operators are available for the ARN, OS_VERSION, MODEL, MANUFACTURER, and INSTANCE_ARN
     *         attributes.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         The LESS_THAN, GREATER_THAN, LESS_THAN_OR_EQUALS, and GREATER_THAN_OR_EQUALS operators are also available
     *         for the OS_VERSION attribute.
     *         </p>
     *         </li>
     * @see DeviceFilterOperator
     */

    public String getOperator() {
        return this.operator;
    }

    /**
     * <p>
     * The filter operator.
     * </p>
     * <ul>
     * <li>
     * <p>
     * The EQUALS operator is available for every attribute except INSTANCE_LABELS.
     * </p>
     * </li>
     * <li>
     * <p>
     * The CONTAINS operator is available for the INSTANCE_LABELS and MODEL attributes.
     * </p>
     * </li>
     * <li>
     * <p>
     * The IN and NOT_IN operators are available for the ARN, OS_VERSION, MODEL, MANUFACTURER, and INSTANCE_ARN
     * attributes.
     * </p>
     * </li>
     * <li>
     * <p>
     * The LESS_THAN, GREATER_THAN, LESS_THAN_OR_EQUALS, and GREATER_THAN_OR_EQUALS operators are also available for the
     * OS_VERSION attribute.
     * </p>
     * </li>
     * </ul>
     * 
     * @param operator
     *        The filter operator.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        The EQUALS operator is available for every attribute except INSTANCE_LABELS.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        The CONTAINS operator is available for the INSTANCE_LABELS and MODEL attributes.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        The IN and NOT_IN operators are available for the ARN, OS_VERSION, MODEL, MANUFACTURER, and INSTANCE_ARN
     *        attributes.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        The LESS_THAN, GREATER_THAN, LESS_THAN_OR_EQUALS, and GREATER_THAN_OR_EQUALS operators are also available
     *        for the OS_VERSION attribute.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DeviceFilterOperator
     */

    public DeviceFilter withOperator(String operator) {
        setOperator(operator);
        return this;
    }

    /**
     * <p>
     * The filter operator.
     * </p>
     * <ul>
     * <li>
     * <p>
     * The EQUALS operator is available for every attribute except INSTANCE_LABELS.
     * </p>
     * </li>
     * <li>
     * <p>
     * The CONTAINS operator is available for the INSTANCE_LABELS and MODEL attributes.
     * </p>
     * </li>
     * <li>
     * <p>
     * The IN and NOT_IN operators are available for the ARN, OS_VERSION, MODEL, MANUFACTURER, and INSTANCE_ARN
     * attributes.
     * </p>
     * </li>
     * <li>
     * <p>
     * The LESS_THAN, GREATER_THAN, LESS_THAN_OR_EQUALS, and GREATER_THAN_OR_EQUALS operators are also available for the
     * OS_VERSION attribute.
     * </p>
     * </li>
     * </ul>
     * 
     * @param operator
     *        The filter operator.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        The EQUALS operator is available for every attribute except INSTANCE_LABELS.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        The CONTAINS operator is available for the INSTANCE_LABELS and MODEL attributes.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        The IN and NOT_IN operators are available for the ARN, OS_VERSION, MODEL, MANUFACTURER, and INSTANCE_ARN
     *        attributes.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        The LESS_THAN, GREATER_THAN, LESS_THAN_OR_EQUALS, and GREATER_THAN_OR_EQUALS operators are also available
     *        for the OS_VERSION attribute.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DeviceFilterOperator
     */

    public DeviceFilter withOperator(DeviceFilterOperator operator) {
        this.operator = operator.toString();
        return this;
    }

    /**
     * <p>
     * An array of one or more filter values used in a device filter.
     * </p>
     * <p class="title">
     * <b>Operator Values</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * The IN and NOT operators can take a values array that has more than one element.
     * </p>
     * </li>
     * <li>
     * <p>
     * The other operators require an array with a single element.
     * </p>
     * </li>
     * </ul>
     * <p class="title">
     * <b>Attribute Values</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * The PLATFORM attribute can be set to "ANDROID" or "IOS".
     * </p>
     * </li>
     * <li>
     * <p>
     * The AVAILABILITY attribute can be set to "AVAILABLE", "HIGHLY_AVAILABLE", "BUSY", or "TEMPORARY_NOT_AVAILABLE".
     * </p>
     * </li>
     * <li>
     * <p>
     * The FORM_FACTOR attribute can be set to "PHONE" or "TABLET".
     * </p>
     * </li>
     * <li>
     * <p>
     * The FLEET_TYPE attribute can be set to "PUBLIC" or "PRIVATE".
     * </p>
     * </li>
     * </ul>
     * 
     * @return An array of one or more filter values used in a device filter.</p>
     *         <p class="title">
     *         <b>Operator Values</b>
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         The IN and NOT operators can take a values array that has more than one element.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         The other operators require an array with a single element.
     *         </p>
     *         </li>
     *         </ul>
     *         <p class="title">
     *         <b>Attribute Values</b>
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         The PLATFORM attribute can be set to "ANDROID" or "IOS".
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         The AVAILABILITY attribute can be set to "AVAILABLE", "HIGHLY_AVAILABLE", "BUSY", or
     *         "TEMPORARY_NOT_AVAILABLE".
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         The FORM_FACTOR attribute can be set to "PHONE" or "TABLET".
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         The FLEET_TYPE attribute can be set to "PUBLIC" or "PRIVATE".
     *         </p>
     *         </li>
     */

    public java.util.List<String> getValues() {
        return values;
    }

    /**
     * <p>
     * An array of one or more filter values used in a device filter.
     * </p>
     * <p class="title">
     * <b>Operator Values</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * The IN and NOT operators can take a values array that has more than one element.
     * </p>
     * </li>
     * <li>
     * <p>
     * The other operators require an array with a single element.
     * </p>
     * </li>
     * </ul>
     * <p class="title">
     * <b>Attribute Values</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * The PLATFORM attribute can be set to "ANDROID" or "IOS".
     * </p>
     * </li>
     * <li>
     * <p>
     * The AVAILABILITY attribute can be set to "AVAILABLE", "HIGHLY_AVAILABLE", "BUSY", or "TEMPORARY_NOT_AVAILABLE".
     * </p>
     * </li>
     * <li>
     * <p>
     * The FORM_FACTOR attribute can be set to "PHONE" or "TABLET".
     * </p>
     * </li>
     * <li>
     * <p>
     * The FLEET_TYPE attribute can be set to "PUBLIC" or "PRIVATE".
     * </p>
     * </li>
     * </ul>
     * 
     * @param values
     *        An array of one or more filter values used in a device filter.</p>
     *        <p class="title">
     *        <b>Operator Values</b>
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        The IN and NOT operators can take a values array that has more than one element.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        The other operators require an array with a single element.
     *        </p>
     *        </li>
     *        </ul>
     *        <p class="title">
     *        <b>Attribute Values</b>
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        The PLATFORM attribute can be set to "ANDROID" or "IOS".
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        The AVAILABILITY attribute can be set to "AVAILABLE", "HIGHLY_AVAILABLE", "BUSY", or
     *        "TEMPORARY_NOT_AVAILABLE".
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        The FORM_FACTOR attribute can be set to "PHONE" or "TABLET".
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        The FLEET_TYPE attribute can be set to "PUBLIC" or "PRIVATE".
     *        </p>
     *        </li>
     */

    public void setValues(java.util.Collection<String> values) {
        if (values == null) {
            this.values = null;
            return;
        }

        this.values = new java.util.ArrayList<String>(values);
    }

    /**
     * <p>
     * An array of one or more filter values used in a device filter.
     * </p>
     * <p class="title">
     * <b>Operator Values</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * The IN and NOT operators can take a values array that has more than one element.
     * </p>
     * </li>
     * <li>
     * <p>
     * The other operators require an array with a single element.
     * </p>
     * </li>
     * </ul>
     * <p class="title">
     * <b>Attribute Values</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * The PLATFORM attribute can be set to "ANDROID" or "IOS".
     * </p>
     * </li>
     * <li>
     * <p>
     * The AVAILABILITY attribute can be set to "AVAILABLE", "HIGHLY_AVAILABLE", "BUSY", or "TEMPORARY_NOT_AVAILABLE".
     * </p>
     * </li>
     * <li>
     * <p>
     * The FORM_FACTOR attribute can be set to "PHONE" or "TABLET".
     * </p>
     * </li>
     * <li>
     * <p>
     * The FLEET_TYPE attribute can be set to "PUBLIC" or "PRIVATE".
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setValues(java.util.Collection)} or {@link #withValues(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param values
     *        An array of one or more filter values used in a device filter.</p>
     *        <p class="title">
     *        <b>Operator Values</b>
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        The IN and NOT operators can take a values array that has more than one element.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        The other operators require an array with a single element.
     *        </p>
     *        </li>
     *        </ul>
     *        <p class="title">
     *        <b>Attribute Values</b>
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        The PLATFORM attribute can be set to "ANDROID" or "IOS".
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        The AVAILABILITY attribute can be set to "AVAILABLE", "HIGHLY_AVAILABLE", "BUSY", or
     *        "TEMPORARY_NOT_AVAILABLE".
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        The FORM_FACTOR attribute can be set to "PHONE" or "TABLET".
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        The FLEET_TYPE attribute can be set to "PUBLIC" or "PRIVATE".
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeviceFilter withValues(String... values) {
        if (this.values == null) {
            setValues(new java.util.ArrayList<String>(values.length));
        }
        for (String ele : values) {
            this.values.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of one or more filter values used in a device filter.
     * </p>
     * <p class="title">
     * <b>Operator Values</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * The IN and NOT operators can take a values array that has more than one element.
     * </p>
     * </li>
     * <li>
     * <p>
     * The other operators require an array with a single element.
     * </p>
     * </li>
     * </ul>
     * <p class="title">
     * <b>Attribute Values</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * The PLATFORM attribute can be set to "ANDROID" or "IOS".
     * </p>
     * </li>
     * <li>
     * <p>
     * The AVAILABILITY attribute can be set to "AVAILABLE", "HIGHLY_AVAILABLE", "BUSY", or "TEMPORARY_NOT_AVAILABLE".
     * </p>
     * </li>
     * <li>
     * <p>
     * The FORM_FACTOR attribute can be set to "PHONE" or "TABLET".
     * </p>
     * </li>
     * <li>
     * <p>
     * The FLEET_TYPE attribute can be set to "PUBLIC" or "PRIVATE".
     * </p>
     * </li>
     * </ul>
     * 
     * @param values
     *        An array of one or more filter values used in a device filter.</p>
     *        <p class="title">
     *        <b>Operator Values</b>
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        The IN and NOT operators can take a values array that has more than one element.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        The other operators require an array with a single element.
     *        </p>
     *        </li>
     *        </ul>
     *        <p class="title">
     *        <b>Attribute Values</b>
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        The PLATFORM attribute can be set to "ANDROID" or "IOS".
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        The AVAILABILITY attribute can be set to "AVAILABLE", "HIGHLY_AVAILABLE", "BUSY", or
     *        "TEMPORARY_NOT_AVAILABLE".
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        The FORM_FACTOR attribute can be set to "PHONE" or "TABLET".
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        The FLEET_TYPE attribute can be set to "PUBLIC" or "PRIVATE".
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeviceFilter withValues(java.util.Collection<String> values) {
        setValues(values);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getAttribute() != null)
            sb.append("Attribute: ").append(getAttribute()).append(",");
        if (getOperator() != null)
            sb.append("Operator: ").append(getOperator()).append(",");
        if (getValues() != null)
            sb.append("Values: ").append(getValues());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeviceFilter == false)
            return false;
        DeviceFilter other = (DeviceFilter) obj;
        if (other.getAttribute() == null ^ this.getAttribute() == null)
            return false;
        if (other.getAttribute() != null && other.getAttribute().equals(this.getAttribute()) == false)
            return false;
        if (other.getOperator() == null ^ this.getOperator() == null)
            return false;
        if (other.getOperator() != null && other.getOperator().equals(this.getOperator()) == false)
            return false;
        if (other.getValues() == null ^ this.getValues() == null)
            return false;
        if (other.getValues() != null && other.getValues().equals(this.getValues()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAttribute() == null) ? 0 : getAttribute().hashCode());
        hashCode = prime * hashCode + ((getOperator() == null) ? 0 : getOperator().hashCode());
        hashCode = prime * hashCode + ((getValues() == null) ? 0 : getValues().hashCode());
        return hashCode;
    }

    @Override
    public DeviceFilter clone() {
        try {
            return (DeviceFilter) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.devicefarm.model.transform.DeviceFilterMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
