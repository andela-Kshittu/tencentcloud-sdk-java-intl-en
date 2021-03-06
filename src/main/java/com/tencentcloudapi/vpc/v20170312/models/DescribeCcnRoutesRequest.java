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

public class DescribeCcnRoutesRequest extends AbstractModel{

    /**
    * The CCN instance ID, such as `ccn-gree226l`.
    */
    @SerializedName("CcnId")
    @Expose
    private String CcnId;

    /**
    * The unique ID of the CCN routing policy, such as `ccnr-f49l6u0z`.
    */
    @SerializedName("RouteIds")
    @Expose
    private String [] RouteIds;

    /**
    * Filter condition. `RouteIds` and `Filters` cannot be specified at the same time.
<li>route-id - String - (Filter condition) Routing policy ID.</li>
<li>cidr-block - String - (Filter condition) Destination port.</li>
<li>instance-type - String - (Filter condition) The next hop type.</li>
<li>instance-region - String - (Filter condition) The next hop region.</li>
<li>instance-type - String - (Filter condition) The instance ID of the next hop.</li>
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
    * Offset
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * The returned quantity
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
     * Get The CCN instance ID, such as `ccn-gree226l`. 
     * @return CcnId The CCN instance ID, such as `ccn-gree226l`.
     */
    public String getCcnId() {
        return this.CcnId;
    }

    /**
     * Set The CCN instance ID, such as `ccn-gree226l`.
     * @param CcnId The CCN instance ID, such as `ccn-gree226l`.
     */
    public void setCcnId(String CcnId) {
        this.CcnId = CcnId;
    }

    /**
     * Get The unique ID of the CCN routing policy, such as `ccnr-f49l6u0z`. 
     * @return RouteIds The unique ID of the CCN routing policy, such as `ccnr-f49l6u0z`.
     */
    public String [] getRouteIds() {
        return this.RouteIds;
    }

    /**
     * Set The unique ID of the CCN routing policy, such as `ccnr-f49l6u0z`.
     * @param RouteIds The unique ID of the CCN routing policy, such as `ccnr-f49l6u0z`.
     */
    public void setRouteIds(String [] RouteIds) {
        this.RouteIds = RouteIds;
    }

    /**
     * Get Filter condition. `RouteIds` and `Filters` cannot be specified at the same time.
<li>route-id - String - (Filter condition) Routing policy ID.</li>
<li>cidr-block - String - (Filter condition) Destination port.</li>
<li>instance-type - String - (Filter condition) The next hop type.</li>
<li>instance-region - String - (Filter condition) The next hop region.</li>
<li>instance-type - String - (Filter condition) The instance ID of the next hop.</li> 
     * @return Filters Filter condition. `RouteIds` and `Filters` cannot be specified at the same time.
<li>route-id - String - (Filter condition) Routing policy ID.</li>
<li>cidr-block - String - (Filter condition) Destination port.</li>
<li>instance-type - String - (Filter condition) The next hop type.</li>
<li>instance-region - String - (Filter condition) The next hop region.</li>
<li>instance-type - String - (Filter condition) The instance ID of the next hop.</li>
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set Filter condition. `RouteIds` and `Filters` cannot be specified at the same time.
<li>route-id - String - (Filter condition) Routing policy ID.</li>
<li>cidr-block - String - (Filter condition) Destination port.</li>
<li>instance-type - String - (Filter condition) The next hop type.</li>
<li>instance-region - String - (Filter condition) The next hop region.</li>
<li>instance-type - String - (Filter condition) The instance ID of the next hop.</li>
     * @param Filters Filter condition. `RouteIds` and `Filters` cannot be specified at the same time.
<li>route-id - String - (Filter condition) Routing policy ID.</li>
<li>cidr-block - String - (Filter condition) Destination port.</li>
<li>instance-type - String - (Filter condition) The next hop type.</li>
<li>instance-region - String - (Filter condition) The next hop region.</li>
<li>instance-type - String - (Filter condition) The instance ID of the next hop.</li>
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get Offset 
     * @return Offset Offset
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set Offset
     * @param Offset Offset
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get The returned quantity 
     * @return Limit The returned quantity
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set The returned quantity
     * @param Limit The returned quantity
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CcnId", this.CcnId);
        this.setParamArraySimple(map, prefix + "RouteIds.", this.RouteIds);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);

    }
}

