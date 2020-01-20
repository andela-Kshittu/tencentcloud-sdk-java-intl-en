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

public class VpnConnection extends AbstractModel{

    /**
    * Tunnel instance ID.
    */
    @SerializedName("VpnConnectionId")
    @Expose
    private String VpnConnectionId;

    /**
    * Tunnel name.
    */
    @SerializedName("VpnConnectionName")
    @Expose
    private String VpnConnectionName;

    /**
    * VPC instance ID.
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * The ID of the VPN gateway instance.
    */
    @SerializedName("VpnGatewayId")
    @Expose
    private String VpnGatewayId;

    /**
    * Customer gateway instance ID.
    */
    @SerializedName("CustomerGatewayId")
    @Expose
    private String CustomerGatewayId;

    /**
    * The pre-shared key.
    */
    @SerializedName("PreShareKey")
    @Expose
    private String PreShareKey;

    /**
    * Tunnel transmission protocol.
    */
    @SerializedName("VpnProto")
    @Expose
    private String VpnProto;

    /**
    * Tunnel encryption protocol.
    */
    @SerializedName("EncryptProto")
    @Expose
    private String EncryptProto;

    /**
    * Route Type.
    */
    @SerializedName("RouteType")
    @Expose
    private String RouteType;

    /**
    * Creation Time.
    */
    @SerializedName("CreatedTime")
    @Expose
    private String CreatedTime;

    /**
    * Production status of the tunnel. PENDING: Creating; AVAILABLE: Running; DELETING: Deleting.
    */
    @SerializedName("State")
    @Expose
    private String State;

    /**
    * Connection status of the tunnel. AVAILABLE: Connected.
    */
    @SerializedName("NetStatus")
    @Expose
    private String NetStatus;

    /**
    * SPD.
    */
    @SerializedName("SecurityPolicyDatabaseSet")
    @Expose
    private SecurityPolicyDatabase [] SecurityPolicyDatabaseSet;

    /**
    * IKE options.
    */
    @SerializedName("IKEOptionsSpecification")
    @Expose
    private IKEOptionsSpecification IKEOptionsSpecification;

    /**
    * IPSEC options.
    */
    @SerializedName("IPSECOptionsSpecification")
    @Expose
    private IPSECOptionsSpecification IPSECOptionsSpecification;

    /**
     * Get Tunnel instance ID. 
     * @return VpnConnectionId Tunnel instance ID.
     */
    public String getVpnConnectionId() {
        return this.VpnConnectionId;
    }

    /**
     * Set Tunnel instance ID.
     * @param VpnConnectionId Tunnel instance ID.
     */
    public void setVpnConnectionId(String VpnConnectionId) {
        this.VpnConnectionId = VpnConnectionId;
    }

    /**
     * Get Tunnel name. 
     * @return VpnConnectionName Tunnel name.
     */
    public String getVpnConnectionName() {
        return this.VpnConnectionName;
    }

    /**
     * Set Tunnel name.
     * @param VpnConnectionName Tunnel name.
     */
    public void setVpnConnectionName(String VpnConnectionName) {
        this.VpnConnectionName = VpnConnectionName;
    }

    /**
     * Get VPC instance ID. 
     * @return VpcId VPC instance ID.
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set VPC instance ID.
     * @param VpcId VPC instance ID.
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get The ID of the VPN gateway instance. 
     * @return VpnGatewayId The ID of the VPN gateway instance.
     */
    public String getVpnGatewayId() {
        return this.VpnGatewayId;
    }

    /**
     * Set The ID of the VPN gateway instance.
     * @param VpnGatewayId The ID of the VPN gateway instance.
     */
    public void setVpnGatewayId(String VpnGatewayId) {
        this.VpnGatewayId = VpnGatewayId;
    }

    /**
     * Get Customer gateway instance ID. 
     * @return CustomerGatewayId Customer gateway instance ID.
     */
    public String getCustomerGatewayId() {
        return this.CustomerGatewayId;
    }

    /**
     * Set Customer gateway instance ID.
     * @param CustomerGatewayId Customer gateway instance ID.
     */
    public void setCustomerGatewayId(String CustomerGatewayId) {
        this.CustomerGatewayId = CustomerGatewayId;
    }

    /**
     * Get The pre-shared key. 
     * @return PreShareKey The pre-shared key.
     */
    public String getPreShareKey() {
        return this.PreShareKey;
    }

    /**
     * Set The pre-shared key.
     * @param PreShareKey The pre-shared key.
     */
    public void setPreShareKey(String PreShareKey) {
        this.PreShareKey = PreShareKey;
    }

    /**
     * Get Tunnel transmission protocol. 
     * @return VpnProto Tunnel transmission protocol.
     */
    public String getVpnProto() {
        return this.VpnProto;
    }

    /**
     * Set Tunnel transmission protocol.
     * @param VpnProto Tunnel transmission protocol.
     */
    public void setVpnProto(String VpnProto) {
        this.VpnProto = VpnProto;
    }

    /**
     * Get Tunnel encryption protocol. 
     * @return EncryptProto Tunnel encryption protocol.
     */
    public String getEncryptProto() {
        return this.EncryptProto;
    }

    /**
     * Set Tunnel encryption protocol.
     * @param EncryptProto Tunnel encryption protocol.
     */
    public void setEncryptProto(String EncryptProto) {
        this.EncryptProto = EncryptProto;
    }

    /**
     * Get Route Type. 
     * @return RouteType Route Type.
     */
    public String getRouteType() {
        return this.RouteType;
    }

    /**
     * Set Route Type.
     * @param RouteType Route Type.
     */
    public void setRouteType(String RouteType) {
        this.RouteType = RouteType;
    }

    /**
     * Get Creation Time. 
     * @return CreatedTime Creation Time.
     */
    public String getCreatedTime() {
        return this.CreatedTime;
    }

    /**
     * Set Creation Time.
     * @param CreatedTime Creation Time.
     */
    public void setCreatedTime(String CreatedTime) {
        this.CreatedTime = CreatedTime;
    }

    /**
     * Get Production status of the tunnel. PENDING: Creating; AVAILABLE: Running; DELETING: Deleting. 
     * @return State Production status of the tunnel. PENDING: Creating; AVAILABLE: Running; DELETING: Deleting.
     */
    public String getState() {
        return this.State;
    }

    /**
     * Set Production status of the tunnel. PENDING: Creating; AVAILABLE: Running; DELETING: Deleting.
     * @param State Production status of the tunnel. PENDING: Creating; AVAILABLE: Running; DELETING: Deleting.
     */
    public void setState(String State) {
        this.State = State;
    }

    /**
     * Get Connection status of the tunnel. AVAILABLE: Connected. 
     * @return NetStatus Connection status of the tunnel. AVAILABLE: Connected.
     */
    public String getNetStatus() {
        return this.NetStatus;
    }

    /**
     * Set Connection status of the tunnel. AVAILABLE: Connected.
     * @param NetStatus Connection status of the tunnel. AVAILABLE: Connected.
     */
    public void setNetStatus(String NetStatus) {
        this.NetStatus = NetStatus;
    }

    /**
     * Get SPD. 
     * @return SecurityPolicyDatabaseSet SPD.
     */
    public SecurityPolicyDatabase [] getSecurityPolicyDatabaseSet() {
        return this.SecurityPolicyDatabaseSet;
    }

    /**
     * Set SPD.
     * @param SecurityPolicyDatabaseSet SPD.
     */
    public void setSecurityPolicyDatabaseSet(SecurityPolicyDatabase [] SecurityPolicyDatabaseSet) {
        this.SecurityPolicyDatabaseSet = SecurityPolicyDatabaseSet;
    }

    /**
     * Get IKE options. 
     * @return IKEOptionsSpecification IKE options.
     */
    public IKEOptionsSpecification getIKEOptionsSpecification() {
        return this.IKEOptionsSpecification;
    }

    /**
     * Set IKE options.
     * @param IKEOptionsSpecification IKE options.
     */
    public void setIKEOptionsSpecification(IKEOptionsSpecification IKEOptionsSpecification) {
        this.IKEOptionsSpecification = IKEOptionsSpecification;
    }

    /**
     * Get IPSEC options. 
     * @return IPSECOptionsSpecification IPSEC options.
     */
    public IPSECOptionsSpecification getIPSECOptionsSpecification() {
        return this.IPSECOptionsSpecification;
    }

    /**
     * Set IPSEC options.
     * @param IPSECOptionsSpecification IPSEC options.
     */
    public void setIPSECOptionsSpecification(IPSECOptionsSpecification IPSECOptionsSpecification) {
        this.IPSECOptionsSpecification = IPSECOptionsSpecification;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "VpnConnectionId", this.VpnConnectionId);
        this.setParamSimple(map, prefix + "VpnConnectionName", this.VpnConnectionName);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "VpnGatewayId", this.VpnGatewayId);
        this.setParamSimple(map, prefix + "CustomerGatewayId", this.CustomerGatewayId);
        this.setParamSimple(map, prefix + "PreShareKey", this.PreShareKey);
        this.setParamSimple(map, prefix + "VpnProto", this.VpnProto);
        this.setParamSimple(map, prefix + "EncryptProto", this.EncryptProto);
        this.setParamSimple(map, prefix + "RouteType", this.RouteType);
        this.setParamSimple(map, prefix + "CreatedTime", this.CreatedTime);
        this.setParamSimple(map, prefix + "State", this.State);
        this.setParamSimple(map, prefix + "NetStatus", this.NetStatus);
        this.setParamArrayObj(map, prefix + "SecurityPolicyDatabaseSet.", this.SecurityPolicyDatabaseSet);
        this.setParamObj(map, prefix + "IKEOptionsSpecification.", this.IKEOptionsSpecification);
        this.setParamObj(map, prefix + "IPSECOptionsSpecification.", this.IPSECOptionsSpecification);

    }
}
