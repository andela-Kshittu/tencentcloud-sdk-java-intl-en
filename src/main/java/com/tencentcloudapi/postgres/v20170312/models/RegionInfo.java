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
package com.tencentcloudapi.postgres.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RegionInfo extends AbstractModel{

    /**
    * Region abbreviation
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * Region name
    */
    @SerializedName("RegionName")
    @Expose
    private String RegionName;

    /**
    * Region number
    */
    @SerializedName("RegionId")
    @Expose
    private Long RegionId;

    /**
    * Availability status. UNAVAILABLE: unavailable, AVAILABLE: available
    */
    @SerializedName("RegionState")
    @Expose
    private String RegionState;

    /**
     * Get Region abbreviation 
     * @return Region Region abbreviation
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set Region abbreviation
     * @param Region Region abbreviation
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get Region name 
     * @return RegionName Region name
     */
    public String getRegionName() {
        return this.RegionName;
    }

    /**
     * Set Region name
     * @param RegionName Region name
     */
    public void setRegionName(String RegionName) {
        this.RegionName = RegionName;
    }

    /**
     * Get Region number 
     * @return RegionId Region number
     */
    public Long getRegionId() {
        return this.RegionId;
    }

    /**
     * Set Region number
     * @param RegionId Region number
     */
    public void setRegionId(Long RegionId) {
        this.RegionId = RegionId;
    }

    /**
     * Get Availability status. UNAVAILABLE: unavailable, AVAILABLE: available 
     * @return RegionState Availability status. UNAVAILABLE: unavailable, AVAILABLE: available
     */
    public String getRegionState() {
        return this.RegionState;
    }

    /**
     * Set Availability status. UNAVAILABLE: unavailable, AVAILABLE: available
     * @param RegionState Availability status. UNAVAILABLE: unavailable, AVAILABLE: available
     */
    public void setRegionState(String RegionState) {
        this.RegionState = RegionState;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "RegionName", this.RegionName);
        this.setParamSimple(map, prefix + "RegionId", this.RegionId);
        this.setParamSimple(map, prefix + "RegionState", this.RegionState);

    }
}
