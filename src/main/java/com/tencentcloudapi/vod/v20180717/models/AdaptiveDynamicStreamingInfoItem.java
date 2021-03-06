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

public class AdaptiveDynamicStreamingInfoItem extends AbstractModel{

    /**
    * Adaptive bitrate streaming specification.
    */
    @SerializedName("Definition")
    @Expose
    private Long Definition;

    /**
    * Container format. Valid values: hls, dash.
    */
    @SerializedName("Package")
    @Expose
    private String Package;

    /**
    * Encryption type.
    */
    @SerializedName("DrmType")
    @Expose
    private String DrmType;

    /**
    * Playback address.
    */
    @SerializedName("Url")
    @Expose
    private String Url;

    /**
     * Get Adaptive bitrate streaming specification. 
     * @return Definition Adaptive bitrate streaming specification.
     */
    public Long getDefinition() {
        return this.Definition;
    }

    /**
     * Set Adaptive bitrate streaming specification.
     * @param Definition Adaptive bitrate streaming specification.
     */
    public void setDefinition(Long Definition) {
        this.Definition = Definition;
    }

    /**
     * Get Container format. Valid values: hls, dash. 
     * @return Package Container format. Valid values: hls, dash.
     */
    public String getPackage() {
        return this.Package;
    }

    /**
     * Set Container format. Valid values: hls, dash.
     * @param Package Container format. Valid values: hls, dash.
     */
    public void setPackage(String Package) {
        this.Package = Package;
    }

    /**
     * Get Encryption type. 
     * @return DrmType Encryption type.
     */
    public String getDrmType() {
        return this.DrmType;
    }

    /**
     * Set Encryption type.
     * @param DrmType Encryption type.
     */
    public void setDrmType(String DrmType) {
        this.DrmType = DrmType;
    }

    /**
     * Get Playback address. 
     * @return Url Playback address.
     */
    public String getUrl() {
        return this.Url;
    }

    /**
     * Set Playback address.
     * @param Url Playback address.
     */
    public void setUrl(String Url) {
        this.Url = Url;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Definition", this.Definition);
        this.setParamSimple(map, prefix + "Package", this.Package);
        this.setParamSimple(map, prefix + "DrmType", this.DrmType);
        this.setParamSimple(map, prefix + "Url", this.Url);

    }
}

