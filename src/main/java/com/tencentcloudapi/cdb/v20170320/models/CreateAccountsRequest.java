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

public class CreateAccountsRequest extends AbstractModel{

    /**
    * Instance ID in the format of cdb-c1nl9rpv. It is the same as the instance ID displayed on the TencentDB Console page.
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * TencentDB account.
    */
    @SerializedName("Accounts")
    @Expose
    private Account [] Accounts;

    /**
    * Password of the new account
    */
    @SerializedName("Password")
    @Expose
    private String Password;

    /**
    * Remarks
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
     * Get Instance ID in the format of cdb-c1nl9rpv. It is the same as the instance ID displayed on the TencentDB Console page. 
     * @return InstanceId Instance ID in the format of cdb-c1nl9rpv. It is the same as the instance ID displayed on the TencentDB Console page.
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Instance ID in the format of cdb-c1nl9rpv. It is the same as the instance ID displayed on the TencentDB Console page.
     * @param InstanceId Instance ID in the format of cdb-c1nl9rpv. It is the same as the instance ID displayed on the TencentDB Console page.
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get TencentDB account. 
     * @return Accounts TencentDB account.
     */
    public Account [] getAccounts() {
        return this.Accounts;
    }

    /**
     * Set TencentDB account.
     * @param Accounts TencentDB account.
     */
    public void setAccounts(Account [] Accounts) {
        this.Accounts = Accounts;
    }

    /**
     * Get Password of the new account 
     * @return Password Password of the new account
     */
    public String getPassword() {
        return this.Password;
    }

    /**
     * Set Password of the new account
     * @param Password Password of the new account
     */
    public void setPassword(String Password) {
        this.Password = Password;
    }

    /**
     * Get Remarks 
     * @return Description Remarks
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set Remarks
     * @param Description Remarks
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamArrayObj(map, prefix + "Accounts.", this.Accounts);
        this.setParamSimple(map, prefix + "Password", this.Password);
        this.setParamSimple(map, prefix + "Description", this.Description);

    }
}

