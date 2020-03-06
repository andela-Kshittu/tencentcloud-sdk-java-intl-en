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

public class DeviceNetInfo extends AbstractModel{

    /**
    * Number of TCP connections
    */
    @SerializedName("Conn")
    @Expose
    private Long [] Conn;

    /**
    * ENI inbound packets per second
    */
    @SerializedName("PackageIn")
    @Expose
    private Long [] PackageIn;

    /**
    * ENI outbound packets per second
    */
    @SerializedName("PackageOut")
    @Expose
    private Long [] PackageOut;

    /**
    * Inbound traffic in Kbps
    */
    @SerializedName("FlowIn")
    @Expose
    private Long [] FlowIn;

    /**
    * Outbound traffic in Kbps
    */
    @SerializedName("FlowOut")
    @Expose
    private Long [] FlowOut;

    /**
     * Get Number of TCP connections 
     * @return Conn Number of TCP connections
     */
    public Long [] getConn() {
        return this.Conn;
    }

    /**
     * Set Number of TCP connections
     * @param Conn Number of TCP connections
     */
    public void setConn(Long [] Conn) {
        this.Conn = Conn;
    }

    /**
     * Get ENI inbound packets per second 
     * @return PackageIn ENI inbound packets per second
     */
    public Long [] getPackageIn() {
        return this.PackageIn;
    }

    /**
     * Set ENI inbound packets per second
     * @param PackageIn ENI inbound packets per second
     */
    public void setPackageIn(Long [] PackageIn) {
        this.PackageIn = PackageIn;
    }

    /**
     * Get ENI outbound packets per second 
     * @return PackageOut ENI outbound packets per second
     */
    public Long [] getPackageOut() {
        return this.PackageOut;
    }

    /**
     * Set ENI outbound packets per second
     * @param PackageOut ENI outbound packets per second
     */
    public void setPackageOut(Long [] PackageOut) {
        this.PackageOut = PackageOut;
    }

    /**
     * Get Inbound traffic in Kbps 
     * @return FlowIn Inbound traffic in Kbps
     */
    public Long [] getFlowIn() {
        return this.FlowIn;
    }

    /**
     * Set Inbound traffic in Kbps
     * @param FlowIn Inbound traffic in Kbps
     */
    public void setFlowIn(Long [] FlowIn) {
        this.FlowIn = FlowIn;
    }

    /**
     * Get Outbound traffic in Kbps 
     * @return FlowOut Outbound traffic in Kbps
     */
    public Long [] getFlowOut() {
        return this.FlowOut;
    }

    /**
     * Set Outbound traffic in Kbps
     * @param FlowOut Outbound traffic in Kbps
     */
    public void setFlowOut(Long [] FlowOut) {
        this.FlowOut = FlowOut;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "Conn.", this.Conn);
        this.setParamArraySimple(map, prefix + "PackageIn.", this.PackageIn);
        this.setParamArraySimple(map, prefix + "PackageOut.", this.PackageOut);
        this.setParamArraySimple(map, prefix + "FlowIn.", this.FlowIn);
        this.setParamArraySimple(map, prefix + "FlowOut.", this.FlowOut);

    }
}

