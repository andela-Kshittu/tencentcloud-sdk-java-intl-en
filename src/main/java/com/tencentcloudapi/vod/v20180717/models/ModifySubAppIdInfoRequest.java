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
package com.tencentcloudapi.vod.v20180717.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifySubAppIdInfoRequest extends AbstractModel{

    /**
    * Subapplication ID.
    */
    @SerializedName("SubAppId")
    @Expose
    private Long SubAppId;

    /**
    * Subapplication name. Length limit: 40 characters.
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Subapplication overview. Length limit: 300 characters.
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
     * Get Subapplication ID. 
     * @return SubAppId Subapplication ID.
     */
    public Long getSubAppId() {
        return this.SubAppId;
    }

    /**
     * Set Subapplication ID.
     * @param SubAppId Subapplication ID.
     */
    public void setSubAppId(Long SubAppId) {
        this.SubAppId = SubAppId;
    }

    /**
     * Get Subapplication name. Length limit: 40 characters. 
     * @return Name Subapplication name. Length limit: 40 characters.
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Subapplication name. Length limit: 40 characters.
     * @param Name Subapplication name. Length limit: 40 characters.
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Subapplication overview. Length limit: 300 characters. 
     * @return Description Subapplication overview. Length limit: 300 characters.
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set Subapplication overview. Length limit: 300 characters.
     * @param Description Subapplication overview. Length limit: 300 characters.
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SubAppId", this.SubAppId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Description", this.Description);

    }
}

