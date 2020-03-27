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
package com.tencentcloudapi.ckafka.v20190819.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class InstanceResponse extends AbstractModel{

    /**
    * List of eligible instances
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("InstanceList")
    @Expose
    private Instance [] InstanceList;

    /**
    * Total number of eligible results
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
     * Get List of eligible instances
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return InstanceList List of eligible instances
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public Instance [] getInstanceList() {
        return this.InstanceList;
    }

    /**
     * Set List of eligible instances
Note: this field may return null, indicating that no valid values can be obtained.
     * @param InstanceList List of eligible instances
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setInstanceList(Instance [] InstanceList) {
        this.InstanceList = InstanceList;
    }

    /**
     * Get Total number of eligible results
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return TotalCount Total number of eligible results
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set Total number of eligible results
Note: this field may return null, indicating that no valid values can be obtained.
     * @param TotalCount Total number of eligible results
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "InstanceList.", this.InstanceList);
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);

    }
}

