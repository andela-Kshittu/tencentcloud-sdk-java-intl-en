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
package com.tencentcloudapi.cdn.v20180606.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class StatusCodeCache extends AbstractModel{

    /**
    * Status code cache expiration configuration switch
on: enabled
off: disabled
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Switch")
    @Expose
    private String Switch;

    /**
    * Status code cache expiration rules details
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("CacheRules")
    @Expose
    private StatusCodeCacheRule [] CacheRules;

    /**
     * Get Status code cache expiration configuration switch
on: enabled
off: disabled
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return Switch Status code cache expiration configuration switch
on: enabled
off: disabled
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getSwitch() {
        return this.Switch;
    }

    /**
     * Set Status code cache expiration configuration switch
on: enabled
off: disabled
Note: this field may return null, indicating that no valid values can be obtained.
     * @param Switch Status code cache expiration configuration switch
on: enabled
off: disabled
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setSwitch(String Switch) {
        this.Switch = Switch;
    }

    /**
     * Get Status code cache expiration rules details
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return CacheRules Status code cache expiration rules details
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public StatusCodeCacheRule [] getCacheRules() {
        return this.CacheRules;
    }

    /**
     * Set Status code cache expiration rules details
Note: this field may return null, indicating that no valid values can be obtained.
     * @param CacheRules Status code cache expiration rules details
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setCacheRules(StatusCodeCacheRule [] CacheRules) {
        this.CacheRules = CacheRules;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Switch", this.Switch);
        this.setParamArrayObj(map, prefix + "CacheRules.", this.CacheRules);

    }
}
