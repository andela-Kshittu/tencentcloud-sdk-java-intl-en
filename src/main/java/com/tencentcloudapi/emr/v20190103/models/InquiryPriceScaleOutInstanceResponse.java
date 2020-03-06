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
package com.tencentcloudapi.emr.v20190103.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class InquiryPriceScaleOutInstanceResponse extends AbstractModel{

    /**
    * Original price.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("OriginalCost")
    @Expose
    private String OriginalCost;

    /**
    * Discounted price.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("DiscountCost")
    @Expose
    private String DiscountCost;

    /**
    * Time unit of scale-out. Valid values:
<li>s: seconds.</li>
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Unit")
    @Expose
    private String Unit;

    /**
    * Node specification queried for price.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("PriceSpec")
    @Expose
    private PriceResource PriceSpec;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Original price.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return OriginalCost Original price.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getOriginalCost() {
        return this.OriginalCost;
    }

    /**
     * Set Original price.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param OriginalCost Original price.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setOriginalCost(String OriginalCost) {
        this.OriginalCost = OriginalCost;
    }

    /**
     * Get Discounted price.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return DiscountCost Discounted price.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getDiscountCost() {
        return this.DiscountCost;
    }

    /**
     * Set Discounted price.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param DiscountCost Discounted price.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setDiscountCost(String DiscountCost) {
        this.DiscountCost = DiscountCost;
    }

    /**
     * Get Time unit of scale-out. Valid values:
<li>s: seconds.</li>
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return Unit Time unit of scale-out. Valid values:
<li>s: seconds.</li>
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getUnit() {
        return this.Unit;
    }

    /**
     * Set Time unit of scale-out. Valid values:
<li>s: seconds.</li>
Note: this field may return null, indicating that no valid values can be obtained.
     * @param Unit Time unit of scale-out. Valid values:
<li>s: seconds.</li>
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setUnit(String Unit) {
        this.Unit = Unit;
    }

    /**
     * Get Node specification queried for price.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return PriceSpec Node specification queried for price.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public PriceResource getPriceSpec() {
        return this.PriceSpec;
    }

    /**
     * Set Node specification queried for price.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param PriceSpec Node specification queried for price.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setPriceSpec(PriceResource PriceSpec) {
        this.PriceSpec = PriceSpec;
    }

    /**
     * Get The unique request ID, which is returned for each request. RequestId is required for locating a problem. 
     * @return RequestId The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     * @param RequestId The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "OriginalCost", this.OriginalCost);
        this.setParamSimple(map, prefix + "DiscountCost", this.DiscountCost);
        this.setParamSimple(map, prefix + "Unit", this.Unit);
        this.setParamObj(map, prefix + "PriceSpec.", this.PriceSpec);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

