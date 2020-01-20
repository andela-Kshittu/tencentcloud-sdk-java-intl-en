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

public class DescribeCcnAttachedInstancesRequest extends AbstractModel{

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
    * Filter conditions:
<li>ccn-id - String - (Filter condition) The CCN instance ID.</li>
<li>instance-type - String - (Filter condition) The associated instance type.</li>
<li>instance-region - String - (Filter condition) The associated instance region.</li>
<li>instance-type - String - (Filter condition) The instance ID of the associated instance.</li>
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
    * The ID of the CCN instance
    */
    @SerializedName("CcnId")
    @Expose
    private String CcnId;

    /**
    * The order field supports `CcnId`, `InstanceType`, `InstanceId`, `InstanceName`, `InstanceRegion`, `AttachedTime`, and `State`.
    */
    @SerializedName("OrderField")
    @Expose
    private String OrderField;

    /**
    * Order methods. Ascending: `ASC`, Descending: `DESC`.
    */
    @SerializedName("OrderDirection")
    @Expose
    private String OrderDirection;

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
     * Get Filter conditions:
<li>ccn-id - String - (Filter condition) The CCN instance ID.</li>
<li>instance-type - String - (Filter condition) The associated instance type.</li>
<li>instance-region - String - (Filter condition) The associated instance region.</li>
<li>instance-type - String - (Filter condition) The instance ID of the associated instance.</li> 
     * @return Filters Filter conditions:
<li>ccn-id - String - (Filter condition) The CCN instance ID.</li>
<li>instance-type - String - (Filter condition) The associated instance type.</li>
<li>instance-region - String - (Filter condition) The associated instance region.</li>
<li>instance-type - String - (Filter condition) The instance ID of the associated instance.</li>
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set Filter conditions:
<li>ccn-id - String - (Filter condition) The CCN instance ID.</li>
<li>instance-type - String - (Filter condition) The associated instance type.</li>
<li>instance-region - String - (Filter condition) The associated instance region.</li>
<li>instance-type - String - (Filter condition) The instance ID of the associated instance.</li>
     * @param Filters Filter conditions:
<li>ccn-id - String - (Filter condition) The CCN instance ID.</li>
<li>instance-type - String - (Filter condition) The associated instance type.</li>
<li>instance-region - String - (Filter condition) The associated instance region.</li>
<li>instance-type - String - (Filter condition) The instance ID of the associated instance.</li>
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get The ID of the CCN instance 
     * @return CcnId The ID of the CCN instance
     */
    public String getCcnId() {
        return this.CcnId;
    }

    /**
     * Set The ID of the CCN instance
     * @param CcnId The ID of the CCN instance
     */
    public void setCcnId(String CcnId) {
        this.CcnId = CcnId;
    }

    /**
     * Get The order field supports `CcnId`, `InstanceType`, `InstanceId`, `InstanceName`, `InstanceRegion`, `AttachedTime`, and `State`. 
     * @return OrderField The order field supports `CcnId`, `InstanceType`, `InstanceId`, `InstanceName`, `InstanceRegion`, `AttachedTime`, and `State`.
     */
    public String getOrderField() {
        return this.OrderField;
    }

    /**
     * Set The order field supports `CcnId`, `InstanceType`, `InstanceId`, `InstanceName`, `InstanceRegion`, `AttachedTime`, and `State`.
     * @param OrderField The order field supports `CcnId`, `InstanceType`, `InstanceId`, `InstanceName`, `InstanceRegion`, `AttachedTime`, and `State`.
     */
    public void setOrderField(String OrderField) {
        this.OrderField = OrderField;
    }

    /**
     * Get Order methods. Ascending: `ASC`, Descending: `DESC`. 
     * @return OrderDirection Order methods. Ascending: `ASC`, Descending: `DESC`.
     */
    public String getOrderDirection() {
        return this.OrderDirection;
    }

    /**
     * Set Order methods. Ascending: `ASC`, Descending: `DESC`.
     * @param OrderDirection Order methods. Ascending: `ASC`, Descending: `DESC`.
     */
    public void setOrderDirection(String OrderDirection) {
        this.OrderDirection = OrderDirection;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamSimple(map, prefix + "CcnId", this.CcnId);
        this.setParamSimple(map, prefix + "OrderField", this.OrderField);
        this.setParamSimple(map, prefix + "OrderDirection", this.OrderDirection);

    }
}
