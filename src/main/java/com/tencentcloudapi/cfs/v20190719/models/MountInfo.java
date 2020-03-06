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
package com.tencentcloudapi.cfs.v20190719.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class MountInfo extends AbstractModel{

    /**
    * File system ID
    */
    @SerializedName("FileSystemId")
    @Expose
    private String FileSystemId;

    /**
    * Mount target ID
    */
    @SerializedName("MountTargetId")
    @Expose
    private String MountTargetId;

    /**
    * Mount target IP
    */
    @SerializedName("IpAddress")
    @Expose
    private String IpAddress;

    /**
    * Mount root-directory
    */
    @SerializedName("FSID")
    @Expose
    private String FSID;

    /**
    * Mount target status
    */
    @SerializedName("LifeCycleState")
    @Expose
    private String LifeCycleState;

    /**
    * Network type
    */
    @SerializedName("NetworkInterface")
    @Expose
    private String NetworkInterface;

    /**
    * VPC ID
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * VPC name
    */
    @SerializedName("VpcName")
    @Expose
    private String VpcName;

    /**
    * Subnet ID
    */
    @SerializedName("SubnetId")
    @Expose
    private String SubnetId;

    /**
    * Subnet name
    */
    @SerializedName("SubnetName")
    @Expose
    private String SubnetName;

    /**
     * Get File system ID 
     * @return FileSystemId File system ID
     */
    public String getFileSystemId() {
        return this.FileSystemId;
    }

    /**
     * Set File system ID
     * @param FileSystemId File system ID
     */
    public void setFileSystemId(String FileSystemId) {
        this.FileSystemId = FileSystemId;
    }

    /**
     * Get Mount target ID 
     * @return MountTargetId Mount target ID
     */
    public String getMountTargetId() {
        return this.MountTargetId;
    }

    /**
     * Set Mount target ID
     * @param MountTargetId Mount target ID
     */
    public void setMountTargetId(String MountTargetId) {
        this.MountTargetId = MountTargetId;
    }

    /**
     * Get Mount target IP 
     * @return IpAddress Mount target IP
     */
    public String getIpAddress() {
        return this.IpAddress;
    }

    /**
     * Set Mount target IP
     * @param IpAddress Mount target IP
     */
    public void setIpAddress(String IpAddress) {
        this.IpAddress = IpAddress;
    }

    /**
     * Get Mount root-directory 
     * @return FSID Mount root-directory
     */
    public String getFSID() {
        return this.FSID;
    }

    /**
     * Set Mount root-directory
     * @param FSID Mount root-directory
     */
    public void setFSID(String FSID) {
        this.FSID = FSID;
    }

    /**
     * Get Mount target status 
     * @return LifeCycleState Mount target status
     */
    public String getLifeCycleState() {
        return this.LifeCycleState;
    }

    /**
     * Set Mount target status
     * @param LifeCycleState Mount target status
     */
    public void setLifeCycleState(String LifeCycleState) {
        this.LifeCycleState = LifeCycleState;
    }

    /**
     * Get Network type 
     * @return NetworkInterface Network type
     */
    public String getNetworkInterface() {
        return this.NetworkInterface;
    }

    /**
     * Set Network type
     * @param NetworkInterface Network type
     */
    public void setNetworkInterface(String NetworkInterface) {
        this.NetworkInterface = NetworkInterface;
    }

    /**
     * Get VPC ID 
     * @return VpcId VPC ID
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set VPC ID
     * @param VpcId VPC ID
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get VPC name 
     * @return VpcName VPC name
     */
    public String getVpcName() {
        return this.VpcName;
    }

    /**
     * Set VPC name
     * @param VpcName VPC name
     */
    public void setVpcName(String VpcName) {
        this.VpcName = VpcName;
    }

    /**
     * Get Subnet ID 
     * @return SubnetId Subnet ID
     */
    public String getSubnetId() {
        return this.SubnetId;
    }

    /**
     * Set Subnet ID
     * @param SubnetId Subnet ID
     */
    public void setSubnetId(String SubnetId) {
        this.SubnetId = SubnetId;
    }

    /**
     * Get Subnet name 
     * @return SubnetName Subnet name
     */
    public String getSubnetName() {
        return this.SubnetName;
    }

    /**
     * Set Subnet name
     * @param SubnetName Subnet name
     */
    public void setSubnetName(String SubnetName) {
        this.SubnetName = SubnetName;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FileSystemId", this.FileSystemId);
        this.setParamSimple(map, prefix + "MountTargetId", this.MountTargetId);
        this.setParamSimple(map, prefix + "IpAddress", this.IpAddress);
        this.setParamSimple(map, prefix + "FSID", this.FSID);
        this.setParamSimple(map, prefix + "LifeCycleState", this.LifeCycleState);
        this.setParamSimple(map, prefix + "NetworkInterface", this.NetworkInterface);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "VpcName", this.VpcName);
        this.setParamSimple(map, prefix + "SubnetId", this.SubnetId);
        this.setParamSimple(map, prefix + "SubnetName", this.SubnetName);

    }
}

