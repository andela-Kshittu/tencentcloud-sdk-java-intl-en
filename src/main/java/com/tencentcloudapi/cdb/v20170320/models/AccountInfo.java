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
package com.tencentcloudapi.cdb.v20170320.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AccountInfo extends AbstractModel{

    /**
    * Account remarks
    */
    @SerializedName("Notes")
    @Expose
    private String Notes;

    /**
    * Account domain name
    */
    @SerializedName("Host")
    @Expose
    private String Host;

    /**
    * Account name
    */
    @SerializedName("User")
    @Expose
    private String User;

    /**
    * Account information modification time
    */
    @SerializedName("ModifyTime")
    @Expose
    private String ModifyTime;

    /**
    * Password modification time
    */
    @SerializedName("ModifyPasswordTime")
    @Expose
    private String ModifyPasswordTime;

    /**
    * Account creation time
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
     * Get Account remarks 
     * @return Notes Account remarks
     */
    public String getNotes() {
        return this.Notes;
    }

    /**
     * Set Account remarks
     * @param Notes Account remarks
     */
    public void setNotes(String Notes) {
        this.Notes = Notes;
    }

    /**
     * Get Account domain name 
     * @return Host Account domain name
     */
    public String getHost() {
        return this.Host;
    }

    /**
     * Set Account domain name
     * @param Host Account domain name
     */
    public void setHost(String Host) {
        this.Host = Host;
    }

    /**
     * Get Account name 
     * @return User Account name
     */
    public String getUser() {
        return this.User;
    }

    /**
     * Set Account name
     * @param User Account name
     */
    public void setUser(String User) {
        this.User = User;
    }

    /**
     * Get Account information modification time 
     * @return ModifyTime Account information modification time
     */
    public String getModifyTime() {
        return this.ModifyTime;
    }

    /**
     * Set Account information modification time
     * @param ModifyTime Account information modification time
     */
    public void setModifyTime(String ModifyTime) {
        this.ModifyTime = ModifyTime;
    }

    /**
     * Get Password modification time 
     * @return ModifyPasswordTime Password modification time
     */
    public String getModifyPasswordTime() {
        return this.ModifyPasswordTime;
    }

    /**
     * Set Password modification time
     * @param ModifyPasswordTime Password modification time
     */
    public void setModifyPasswordTime(String ModifyPasswordTime) {
        this.ModifyPasswordTime = ModifyPasswordTime;
    }

    /**
     * Get Account creation time 
     * @return CreateTime Account creation time
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set Account creation time
     * @param CreateTime Account creation time
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Notes", this.Notes);
        this.setParamSimple(map, prefix + "Host", this.Host);
        this.setParamSimple(map, prefix + "User", this.User);
        this.setParamSimple(map, prefix + "ModifyTime", this.ModifyTime);
        this.setParamSimple(map, prefix + "ModifyPasswordTime", this.ModifyPasswordTime);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);

    }
}

