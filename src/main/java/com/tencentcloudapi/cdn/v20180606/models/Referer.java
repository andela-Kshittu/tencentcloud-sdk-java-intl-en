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

public class Referer extends AbstractModel{

    /**
    * Referer blacklist/whitelist configuration switch
on: enabled
off: disabled
    */
    @SerializedName("Switch")
    @Expose
    private String Switch;

    /**
    * Referer blacklist/whitelist configuration rule
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("RefererRules")
    @Expose
    private RefererRule [] RefererRules;

    /**
     * Get Referer blacklist/whitelist configuration switch
on: enabled
off: disabled 
     * @return Switch Referer blacklist/whitelist configuration switch
on: enabled
off: disabled
     */
    public String getSwitch() {
        return this.Switch;
    }

    /**
     * Set Referer blacklist/whitelist configuration switch
on: enabled
off: disabled
     * @param Switch Referer blacklist/whitelist configuration switch
on: enabled
off: disabled
     */
    public void setSwitch(String Switch) {
        this.Switch = Switch;
    }

    /**
     * Get Referer blacklist/whitelist configuration rule
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return RefererRules Referer blacklist/whitelist configuration rule
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public RefererRule [] getRefererRules() {
        return this.RefererRules;
    }

    /**
     * Set Referer blacklist/whitelist configuration rule
Note: this field may return null, indicating that no valid values can be obtained.
     * @param RefererRules Referer blacklist/whitelist configuration rule
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setRefererRules(RefererRule [] RefererRules) {
        this.RefererRules = RefererRules;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Switch", this.Switch);
        this.setParamArrayObj(map, prefix + "RefererRules.", this.RefererRules);

    }
}
