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

public class ServiceTemplateSpecification extends AbstractModel{

    /**
    * Protocol port ID, such as `ppm-f5n1f8da`.
    */
    @SerializedName("ServiceId")
    @Expose
    private String ServiceId;

    /**
    * Protocol port group ID, such as `ppmg-f5n1f8da`.
    */
    @SerializedName("ServiceGroupId")
    @Expose
    private String ServiceGroupId;

    /**
     * Get Protocol port ID, such as `ppm-f5n1f8da`. 
     * @return ServiceId Protocol port ID, such as `ppm-f5n1f8da`.
     */
    public String getServiceId() {
        return this.ServiceId;
    }

    /**
     * Set Protocol port ID, such as `ppm-f5n1f8da`.
     * @param ServiceId Protocol port ID, such as `ppm-f5n1f8da`.
     */
    public void setServiceId(String ServiceId) {
        this.ServiceId = ServiceId;
    }

    /**
     * Get Protocol port group ID, such as `ppmg-f5n1f8da`. 
     * @return ServiceGroupId Protocol port group ID, such as `ppmg-f5n1f8da`.
     */
    public String getServiceGroupId() {
        return this.ServiceGroupId;
    }

    /**
     * Set Protocol port group ID, such as `ppmg-f5n1f8da`.
     * @param ServiceGroupId Protocol port group ID, such as `ppmg-f5n1f8da`.
     */
    public void setServiceGroupId(String ServiceGroupId) {
        this.ServiceGroupId = ServiceGroupId;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ServiceId", this.ServiceId);
        this.setParamSimple(map, prefix + "ServiceGroupId", this.ServiceGroupId);

    }
}

