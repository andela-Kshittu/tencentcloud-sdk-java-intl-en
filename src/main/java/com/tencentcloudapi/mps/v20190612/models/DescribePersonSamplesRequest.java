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
package com.tencentcloudapi.mps.v20190612.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribePersonSamplesRequest extends AbstractModel{

    /**
    * Pulled figure type. Valid values:
<li>UserDefine: Custom figure library;</li>
<li>Default: Default figure library.</li>

Default value: UserDefine (the custom figure library will be pulled.)
Note: The default figure library can be pulled only through "figure name" or "figure ID + figure name", and only one face image will be returned.
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * Figure ID. Array length limit: 100.
    */
    @SerializedName("PersonIds")
    @Expose
    private String [] PersonIds;

    /**
    * Figure name. Array length limit: 20.
    */
    @SerializedName("Names")
    @Expose
    private String [] Names;

    /**
    * Figure tag. Array length limit: 20.
    */
    @SerializedName("Tags")
    @Expose
    private String [] Tags;

    /**
    * Paging offset. Default value: 0.
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * Number of returned entries. Default value: 100. Maximum value: 100.
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
     * Get Pulled figure type. Valid values:
<li>UserDefine: Custom figure library;</li>
<li>Default: Default figure library.</li>

Default value: UserDefine (the custom figure library will be pulled.)
Note: The default figure library can be pulled only through "figure name" or "figure ID + figure name", and only one face image will be returned. 
     * @return Type Pulled figure type. Valid values:
<li>UserDefine: Custom figure library;</li>
<li>Default: Default figure library.</li>

Default value: UserDefine (the custom figure library will be pulled.)
Note: The default figure library can be pulled only through "figure name" or "figure ID + figure name", and only one face image will be returned.
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set Pulled figure type. Valid values:
<li>UserDefine: Custom figure library;</li>
<li>Default: Default figure library.</li>

Default value: UserDefine (the custom figure library will be pulled.)
Note: The default figure library can be pulled only through "figure name" or "figure ID + figure name", and only one face image will be returned.
     * @param Type Pulled figure type. Valid values:
<li>UserDefine: Custom figure library;</li>
<li>Default: Default figure library.</li>

Default value: UserDefine (the custom figure library will be pulled.)
Note: The default figure library can be pulled only through "figure name" or "figure ID + figure name", and only one face image will be returned.
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get Figure ID. Array length limit: 100. 
     * @return PersonIds Figure ID. Array length limit: 100.
     */
    public String [] getPersonIds() {
        return this.PersonIds;
    }

    /**
     * Set Figure ID. Array length limit: 100.
     * @param PersonIds Figure ID. Array length limit: 100.
     */
    public void setPersonIds(String [] PersonIds) {
        this.PersonIds = PersonIds;
    }

    /**
     * Get Figure name. Array length limit: 20. 
     * @return Names Figure name. Array length limit: 20.
     */
    public String [] getNames() {
        return this.Names;
    }

    /**
     * Set Figure name. Array length limit: 20.
     * @param Names Figure name. Array length limit: 20.
     */
    public void setNames(String [] Names) {
        this.Names = Names;
    }

    /**
     * Get Figure tag. Array length limit: 20. 
     * @return Tags Figure tag. Array length limit: 20.
     */
    public String [] getTags() {
        return this.Tags;
    }

    /**
     * Set Figure tag. Array length limit: 20.
     * @param Tags Figure tag. Array length limit: 20.
     */
    public void setTags(String [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get Paging offset. Default value: 0. 
     * @return Offset Paging offset. Default value: 0.
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set Paging offset. Default value: 0.
     * @param Offset Paging offset. Default value: 0.
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get Number of returned entries. Default value: 100. Maximum value: 100. 
     * @return Limit Number of returned entries. Default value: 100. Maximum value: 100.
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Number of returned entries. Default value: 100. Maximum value: 100.
     * @param Limit Number of returned entries. Default value: 100. Maximum value: 100.
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamArraySimple(map, prefix + "PersonIds.", this.PersonIds);
        this.setParamArraySimple(map, prefix + "Names.", this.Names);
        this.setParamArraySimple(map, prefix + "Tags.", this.Tags);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);

    }
}

