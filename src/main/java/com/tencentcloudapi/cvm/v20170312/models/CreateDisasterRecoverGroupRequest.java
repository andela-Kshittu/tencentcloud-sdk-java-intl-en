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
package com.tencentcloudapi.cvm.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateDisasterRecoverGroupRequest extends AbstractModel{

    /**
    * Name of the spread placement group. The name must be 1-60 characters long and can contain both Chinese characters and English letters.
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Type of the spread placement group. Valid values: <br><li>HOST: physical machine <br><li>SW: switch <br><li>RACK: rack
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * A string used to ensure the idempotency of the request, which is generated by the user and must be unique to each request. The maximum length is 64 ASCII characters. If this parameter is not specified, the idempotency of the request cannot be guaranteed. <br>For more information, see “How to ensure idempotency”.
    */
    @SerializedName("ClientToken")
    @Expose
    private String ClientToken;

    /**
     * Get Name of the spread placement group. The name must be 1-60 characters long and can contain both Chinese characters and English letters. 
     * @return Name Name of the spread placement group. The name must be 1-60 characters long and can contain both Chinese characters and English letters.
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Name of the spread placement group. The name must be 1-60 characters long and can contain both Chinese characters and English letters.
     * @param Name Name of the spread placement group. The name must be 1-60 characters long and can contain both Chinese characters and English letters.
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Type of the spread placement group. Valid values: <br><li>HOST: physical machine <br><li>SW: switch <br><li>RACK: rack 
     * @return Type Type of the spread placement group. Valid values: <br><li>HOST: physical machine <br><li>SW: switch <br><li>RACK: rack
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set Type of the spread placement group. Valid values: <br><li>HOST: physical machine <br><li>SW: switch <br><li>RACK: rack
     * @param Type Type of the spread placement group. Valid values: <br><li>HOST: physical machine <br><li>SW: switch <br><li>RACK: rack
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get A string used to ensure the idempotency of the request, which is generated by the user and must be unique to each request. The maximum length is 64 ASCII characters. If this parameter is not specified, the idempotency of the request cannot be guaranteed. <br>For more information, see “How to ensure idempotency”. 
     * @return ClientToken A string used to ensure the idempotency of the request, which is generated by the user and must be unique to each request. The maximum length is 64 ASCII characters. If this parameter is not specified, the idempotency of the request cannot be guaranteed. <br>For more information, see “How to ensure idempotency”.
     */
    public String getClientToken() {
        return this.ClientToken;
    }

    /**
     * Set A string used to ensure the idempotency of the request, which is generated by the user and must be unique to each request. The maximum length is 64 ASCII characters. If this parameter is not specified, the idempotency of the request cannot be guaranteed. <br>For more information, see “How to ensure idempotency”.
     * @param ClientToken A string used to ensure the idempotency of the request, which is generated by the user and must be unique to each request. The maximum length is 64 ASCII characters. If this parameter is not specified, the idempotency of the request cannot be guaranteed. <br>For more information, see “How to ensure idempotency”.
     */
    public void setClientToken(String ClientToken) {
        this.ClientToken = ClientToken;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "ClientToken", this.ClientToken);

    }
}
