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
package com.tencentcloudapi.scf.v20180416.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Trigger extends AbstractModel{

    /**
    * Latest modification time of the trigger
    */
    @SerializedName("ModTime")
    @Expose
    private String ModTime;

    /**
    * Trigger type
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * Detailed trigger configuration
    */
    @SerializedName("TriggerDesc")
    @Expose
    private String TriggerDesc;

    /**
    * Trigger name
    */
    @SerializedName("TriggerName")
    @Expose
    private String TriggerName;

    /**
    * Creation time of the trigger
    */
    @SerializedName("AddTime")
    @Expose
    private String AddTime;

    /**
    * Enabling switch
    */
    @SerializedName("Enable")
    @Expose
    private Long Enable;

    /**
    * Custom parameter
    */
    @SerializedName("CustomArgument")
    @Expose
    private String CustomArgument;

    /**
     * Get Latest modification time of the trigger 
     * @return ModTime Latest modification time of the trigger
     */
    public String getModTime() {
        return this.ModTime;
    }

    /**
     * Set Latest modification time of the trigger
     * @param ModTime Latest modification time of the trigger
     */
    public void setModTime(String ModTime) {
        this.ModTime = ModTime;
    }

    /**
     * Get Trigger type 
     * @return Type Trigger type
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set Trigger type
     * @param Type Trigger type
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get Detailed trigger configuration 
     * @return TriggerDesc Detailed trigger configuration
     */
    public String getTriggerDesc() {
        return this.TriggerDesc;
    }

    /**
     * Set Detailed trigger configuration
     * @param TriggerDesc Detailed trigger configuration
     */
    public void setTriggerDesc(String TriggerDesc) {
        this.TriggerDesc = TriggerDesc;
    }

    /**
     * Get Trigger name 
     * @return TriggerName Trigger name
     */
    public String getTriggerName() {
        return this.TriggerName;
    }

    /**
     * Set Trigger name
     * @param TriggerName Trigger name
     */
    public void setTriggerName(String TriggerName) {
        this.TriggerName = TriggerName;
    }

    /**
     * Get Creation time of the trigger 
     * @return AddTime Creation time of the trigger
     */
    public String getAddTime() {
        return this.AddTime;
    }

    /**
     * Set Creation time of the trigger
     * @param AddTime Creation time of the trigger
     */
    public void setAddTime(String AddTime) {
        this.AddTime = AddTime;
    }

    /**
     * Get Enabling switch 
     * @return Enable Enabling switch
     */
    public Long getEnable() {
        return this.Enable;
    }

    /**
     * Set Enabling switch
     * @param Enable Enabling switch
     */
    public void setEnable(Long Enable) {
        this.Enable = Enable;
    }

    /**
     * Get Custom parameter 
     * @return CustomArgument Custom parameter
     */
    public String getCustomArgument() {
        return this.CustomArgument;
    }

    /**
     * Set Custom parameter
     * @param CustomArgument Custom parameter
     */
    public void setCustomArgument(String CustomArgument) {
        this.CustomArgument = CustomArgument;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ModTime", this.ModTime);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "TriggerDesc", this.TriggerDesc);
        this.setParamSimple(map, prefix + "TriggerName", this.TriggerName);
        this.setParamSimple(map, prefix + "AddTime", this.AddTime);
        this.setParamSimple(map, prefix + "Enable", this.Enable);
        this.setParamSimple(map, prefix + "CustomArgument", this.CustomArgument);

    }
}

