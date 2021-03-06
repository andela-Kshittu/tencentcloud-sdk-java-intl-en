/*
 * Copyright (c) 2017-2018 THL A29 Limited, a Tencent company. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.tencentcloudapi.vpc.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateAddressTemplateGroupRequest extends AbstractModel{

    /**
    * The name of the IP address template group.
    */
    @SerializedName("AddressTemplateGroupName")
    @Expose
    private String AddressTemplateGroupName;

    /**
    * The instance ID of the IP address template, such as `ipm-mdunqeb6`.
    */
    @SerializedName("AddressTemplateIds")
    @Expose
    private String [] AddressTemplateIds;

    /**
     * Get The name of the IP address template group. 
     * @return AddressTemplateGroupName The name of the IP address template group.
     */
    public String getAddressTemplateGroupName() {
        return this.AddressTemplateGroupName;
    }

    /**
     * Set The name of the IP address template group.
     * @param AddressTemplateGroupName The name of the IP address template group.
     */
    public void setAddressTemplateGroupName(String AddressTemplateGroupName) {
        this.AddressTemplateGroupName = AddressTemplateGroupName;
    }

    /**
     * Get The instance ID of the IP address template, such as `ipm-mdunqeb6`. 
     * @return AddressTemplateIds The instance ID of the IP address template, such as `ipm-mdunqeb6`.
     */
    public String [] getAddressTemplateIds() {
        return this.AddressTemplateIds;
    }

    /**
     * Set The instance ID of the IP address template, such as `ipm-mdunqeb6`.
     * @param AddressTemplateIds The instance ID of the IP address template, such as `ipm-mdunqeb6`.
     */
    public void setAddressTemplateIds(String [] AddressTemplateIds) {
        this.AddressTemplateIds = AddressTemplateIds;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AddressTemplateGroupName", this.AddressTemplateGroupName);
        this.setParamArraySimple(map, prefix + "AddressTemplateIds.", this.AddressTemplateIds);

    }
}

