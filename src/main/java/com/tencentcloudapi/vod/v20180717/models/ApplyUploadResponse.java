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

public class ApplyUploadResponse extends AbstractModel{

    /**
    * Bucket, which is used as the `bucket_name` in the URL of the upload API.
    */
    @SerializedName("StorageBucket")
    @Expose
    private String StorageBucket;

    /**
    * Storage region, which is used as the `Region` in the `Host` of the upload API.
    */
    @SerializedName("StorageRegion")
    @Expose
    private String StorageRegion;

    /**
    * VOD session, which is used to confirm the `VodSessionKey` parameter of the upload API.
    */
    @SerializedName("VodSessionKey")
    @Expose
    private String VodSessionKey;

    /**
    * Media storage path, which is used as the `Key` of the stored media of the upload API.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("MediaStoragePath")
    @Expose
    private String MediaStoragePath;

    /**
    * Cover storage path, which is used as the `Key` of the stored cover of the upload API.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("CoverStoragePath")
    @Expose
    private String CoverStoragePath;

    /**
    * Temporary credential, which is used for authentication of the upload API.
    */
    @SerializedName("TempCertificate")
    @Expose
    private TempCertificate TempCertificate;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Bucket, which is used as the `bucket_name` in the URL of the upload API. 
     * @return StorageBucket Bucket, which is used as the `bucket_name` in the URL of the upload API.
     */
    public String getStorageBucket() {
        return this.StorageBucket;
    }

    /**
     * Set Bucket, which is used as the `bucket_name` in the URL of the upload API.
     * @param StorageBucket Bucket, which is used as the `bucket_name` in the URL of the upload API.
     */
    public void setStorageBucket(String StorageBucket) {
        this.StorageBucket = StorageBucket;
    }

    /**
     * Get Storage region, which is used as the `Region` in the `Host` of the upload API. 
     * @return StorageRegion Storage region, which is used as the `Region` in the `Host` of the upload API.
     */
    public String getStorageRegion() {
        return this.StorageRegion;
    }

    /**
     * Set Storage region, which is used as the `Region` in the `Host` of the upload API.
     * @param StorageRegion Storage region, which is used as the `Region` in the `Host` of the upload API.
     */
    public void setStorageRegion(String StorageRegion) {
        this.StorageRegion = StorageRegion;
    }

    /**
     * Get VOD session, which is used to confirm the `VodSessionKey` parameter of the upload API. 
     * @return VodSessionKey VOD session, which is used to confirm the `VodSessionKey` parameter of the upload API.
     */
    public String getVodSessionKey() {
        return this.VodSessionKey;
    }

    /**
     * Set VOD session, which is used to confirm the `VodSessionKey` parameter of the upload API.
     * @param VodSessionKey VOD session, which is used to confirm the `VodSessionKey` parameter of the upload API.
     */
    public void setVodSessionKey(String VodSessionKey) {
        this.VodSessionKey = VodSessionKey;
    }

    /**
     * Get Media storage path, which is used as the `Key` of the stored media of the upload API.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return MediaStoragePath Media storage path, which is used as the `Key` of the stored media of the upload API.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getMediaStoragePath() {
        return this.MediaStoragePath;
    }

    /**
     * Set Media storage path, which is used as the `Key` of the stored media of the upload API.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param MediaStoragePath Media storage path, which is used as the `Key` of the stored media of the upload API.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setMediaStoragePath(String MediaStoragePath) {
        this.MediaStoragePath = MediaStoragePath;
    }

    /**
     * Get Cover storage path, which is used as the `Key` of the stored cover of the upload API.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return CoverStoragePath Cover storage path, which is used as the `Key` of the stored cover of the upload API.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getCoverStoragePath() {
        return this.CoverStoragePath;
    }

    /**
     * Set Cover storage path, which is used as the `Key` of the stored cover of the upload API.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param CoverStoragePath Cover storage path, which is used as the `Key` of the stored cover of the upload API.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setCoverStoragePath(String CoverStoragePath) {
        this.CoverStoragePath = CoverStoragePath;
    }

    /**
     * Get Temporary credential, which is used for authentication of the upload API. 
     * @return TempCertificate Temporary credential, which is used for authentication of the upload API.
     */
    public TempCertificate getTempCertificate() {
        return this.TempCertificate;
    }

    /**
     * Set Temporary credential, which is used for authentication of the upload API.
     * @param TempCertificate Temporary credential, which is used for authentication of the upload API.
     */
    public void setTempCertificate(TempCertificate TempCertificate) {
        this.TempCertificate = TempCertificate;
    }

    /**
     * Get The unique request ID, which is returned for each request. RequestId is required for locating a problem. 
     * @return RequestId The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     * @param RequestId The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "StorageBucket", this.StorageBucket);
        this.setParamSimple(map, prefix + "StorageRegion", this.StorageRegion);
        this.setParamSimple(map, prefix + "VodSessionKey", this.VodSessionKey);
        this.setParamSimple(map, prefix + "MediaStoragePath", this.MediaStoragePath);
        this.setParamSimple(map, prefix + "CoverStoragePath", this.CoverStoragePath);
        this.setParamObj(map, prefix + "TempCertificate.", this.TempCertificate);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

