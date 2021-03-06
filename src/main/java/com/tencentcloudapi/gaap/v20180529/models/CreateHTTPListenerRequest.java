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
package com.tencentcloudapi.gaap.v20180529.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateHTTPListenerRequest extends AbstractModel{

    /**
    * Listener name
    */
    @SerializedName("ListenerName")
    @Expose
    private String ListenerName;

    /**
    * Listener port, which is based on the listeners of same transport layer protocol (TCP or UDP). The port must be unique.
    */
    @SerializedName("Port")
    @Expose
    private Long Port;

    /**
    * Connection ID
    */
    @SerializedName("ProxyId")
    @Expose
    private String ProxyId;

    /**
     * Get Listener name 
     * @return ListenerName Listener name
     */
    public String getListenerName() {
        return this.ListenerName;
    }

    /**
     * Set Listener name
     * @param ListenerName Listener name
     */
    public void setListenerName(String ListenerName) {
        this.ListenerName = ListenerName;
    }

    /**
     * Get Listener port, which is based on the listeners of same transport layer protocol (TCP or UDP). The port must be unique. 
     * @return Port Listener port, which is based on the listeners of same transport layer protocol (TCP or UDP). The port must be unique.
     */
    public Long getPort() {
        return this.Port;
    }

    /**
     * Set Listener port, which is based on the listeners of same transport layer protocol (TCP or UDP). The port must be unique.
     * @param Port Listener port, which is based on the listeners of same transport layer protocol (TCP or UDP). The port must be unique.
     */
    public void setPort(Long Port) {
        this.Port = Port;
    }

    /**
     * Get Connection ID 
     * @return ProxyId Connection ID
     */
    public String getProxyId() {
        return this.ProxyId;
    }

    /**
     * Set Connection ID
     * @param ProxyId Connection ID
     */
    public void setProxyId(String ProxyId) {
        this.ProxyId = ProxyId;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ListenerName", this.ListenerName);
        this.setParamSimple(map, prefix + "Port", this.Port);
        this.setParamSimple(map, prefix + "ProxyId", this.ProxyId);

    }
}

