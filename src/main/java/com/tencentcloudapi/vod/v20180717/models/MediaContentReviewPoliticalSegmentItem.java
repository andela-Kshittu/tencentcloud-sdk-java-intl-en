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

public class MediaContentReviewPoliticalSegmentItem extends AbstractModel{

    /**
    * Start time offset of a suspected segment in seconds.
    */
    @SerializedName("StartTimeOffset")
    @Expose
    private Float StartTimeOffset;

    /**
    * End time offset of a suspected segment in seconds.
    */
    @SerializedName("EndTimeOffset")
    @Expose
    private Float EndTimeOffset;

    /**
    * Score of a suspected politically sensitive segment.
    */
    @SerializedName("Confidence")
    @Expose
    private Float Confidence;

    /**
    * Suggestion for politically sensitive information detection of a suspected segment. Valid values:
<li>pass.</li>
<li>review.</li>
<li>block.</li>
    */
    @SerializedName("Suggestion")
    @Expose
    private String Suggestion;

    /**
    * Name of a politically sensitive figure or violating photo.
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Tag of politically sensitive information detection result of a suspected segment.
    */
    @SerializedName("Label")
    @Expose
    private String Label;

    /**
    * URL of a suspected image (which will not be permanently stored
 and will be deleted after `PicUrlExpireTime`).
    */
    @SerializedName("Url")
    @Expose
    private String Url;

    /**
    * Zone coordinates (at the pixel level) of a politically sensitive figure or violating photo: [x1, y1, x2, y2], i.e., the coordinates of the top-left and bottom-right corners.
    */
    @SerializedName("AreaCoordSet")
    @Expose
    private Long [] AreaCoordSet;

    /**
    * This field has been disused. Please use `PicUrlExpireTime`.
    */
    @SerializedName("PicUrlExpireTimeStamp")
    @Expose
    private Long PicUrlExpireTimeStamp;

    /**
    * Expiration time of suspected image URL in [ISO date format](https://cloud.tencent.com/document/product/266/11732#I).
    */
    @SerializedName("PicUrlExpireTime")
    @Expose
    private String PicUrlExpireTime;

    /**
     * Get Start time offset of a suspected segment in seconds. 
     * @return StartTimeOffset Start time offset of a suspected segment in seconds.
     */
    public Float getStartTimeOffset() {
        return this.StartTimeOffset;
    }

    /**
     * Set Start time offset of a suspected segment in seconds.
     * @param StartTimeOffset Start time offset of a suspected segment in seconds.
     */
    public void setStartTimeOffset(Float StartTimeOffset) {
        this.StartTimeOffset = StartTimeOffset;
    }

    /**
     * Get End time offset of a suspected segment in seconds. 
     * @return EndTimeOffset End time offset of a suspected segment in seconds.
     */
    public Float getEndTimeOffset() {
        return this.EndTimeOffset;
    }

    /**
     * Set End time offset of a suspected segment in seconds.
     * @param EndTimeOffset End time offset of a suspected segment in seconds.
     */
    public void setEndTimeOffset(Float EndTimeOffset) {
        this.EndTimeOffset = EndTimeOffset;
    }

    /**
     * Get Score of a suspected politically sensitive segment. 
     * @return Confidence Score of a suspected politically sensitive segment.
     */
    public Float getConfidence() {
        return this.Confidence;
    }

    /**
     * Set Score of a suspected politically sensitive segment.
     * @param Confidence Score of a suspected politically sensitive segment.
     */
    public void setConfidence(Float Confidence) {
        this.Confidence = Confidence;
    }

    /**
     * Get Suggestion for politically sensitive information detection of a suspected segment. Valid values:
<li>pass.</li>
<li>review.</li>
<li>block.</li> 
     * @return Suggestion Suggestion for politically sensitive information detection of a suspected segment. Valid values:
<li>pass.</li>
<li>review.</li>
<li>block.</li>
     */
    public String getSuggestion() {
        return this.Suggestion;
    }

    /**
     * Set Suggestion for politically sensitive information detection of a suspected segment. Valid values:
<li>pass.</li>
<li>review.</li>
<li>block.</li>
     * @param Suggestion Suggestion for politically sensitive information detection of a suspected segment. Valid values:
<li>pass.</li>
<li>review.</li>
<li>block.</li>
     */
    public void setSuggestion(String Suggestion) {
        this.Suggestion = Suggestion;
    }

    /**
     * Get Name of a politically sensitive figure or violating photo. 
     * @return Name Name of a politically sensitive figure or violating photo.
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Name of a politically sensitive figure or violating photo.
     * @param Name Name of a politically sensitive figure or violating photo.
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Tag of politically sensitive information detection result of a suspected segment. 
     * @return Label Tag of politically sensitive information detection result of a suspected segment.
     */
    public String getLabel() {
        return this.Label;
    }

    /**
     * Set Tag of politically sensitive information detection result of a suspected segment.
     * @param Label Tag of politically sensitive information detection result of a suspected segment.
     */
    public void setLabel(String Label) {
        this.Label = Label;
    }

    /**
     * Get URL of a suspected image (which will not be permanently stored
 and will be deleted after `PicUrlExpireTime`). 
     * @return Url URL of a suspected image (which will not be permanently stored
 and will be deleted after `PicUrlExpireTime`).
     */
    public String getUrl() {
        return this.Url;
    }

    /**
     * Set URL of a suspected image (which will not be permanently stored
 and will be deleted after `PicUrlExpireTime`).
     * @param Url URL of a suspected image (which will not be permanently stored
 and will be deleted after `PicUrlExpireTime`).
     */
    public void setUrl(String Url) {
        this.Url = Url;
    }

    /**
     * Get Zone coordinates (at the pixel level) of a politically sensitive figure or violating photo: [x1, y1, x2, y2], i.e., the coordinates of the top-left and bottom-right corners. 
     * @return AreaCoordSet Zone coordinates (at the pixel level) of a politically sensitive figure or violating photo: [x1, y1, x2, y2], i.e., the coordinates of the top-left and bottom-right corners.
     */
    public Long [] getAreaCoordSet() {
        return this.AreaCoordSet;
    }

    /**
     * Set Zone coordinates (at the pixel level) of a politically sensitive figure or violating photo: [x1, y1, x2, y2], i.e., the coordinates of the top-left and bottom-right corners.
     * @param AreaCoordSet Zone coordinates (at the pixel level) of a politically sensitive figure or violating photo: [x1, y1, x2, y2], i.e., the coordinates of the top-left and bottom-right corners.
     */
    public void setAreaCoordSet(Long [] AreaCoordSet) {
        this.AreaCoordSet = AreaCoordSet;
    }

    /**
     * Get This field has been disused. Please use `PicUrlExpireTime`. 
     * @return PicUrlExpireTimeStamp This field has been disused. Please use `PicUrlExpireTime`.
     */
    public Long getPicUrlExpireTimeStamp() {
        return this.PicUrlExpireTimeStamp;
    }

    /**
     * Set This field has been disused. Please use `PicUrlExpireTime`.
     * @param PicUrlExpireTimeStamp This field has been disused. Please use `PicUrlExpireTime`.
     */
    public void setPicUrlExpireTimeStamp(Long PicUrlExpireTimeStamp) {
        this.PicUrlExpireTimeStamp = PicUrlExpireTimeStamp;
    }

    /**
     * Get Expiration time of suspected image URL in [ISO date format](https://cloud.tencent.com/document/product/266/11732#I). 
     * @return PicUrlExpireTime Expiration time of suspected image URL in [ISO date format](https://cloud.tencent.com/document/product/266/11732#I).
     */
    public String getPicUrlExpireTime() {
        return this.PicUrlExpireTime;
    }

    /**
     * Set Expiration time of suspected image URL in [ISO date format](https://cloud.tencent.com/document/product/266/11732#I).
     * @param PicUrlExpireTime Expiration time of suspected image URL in [ISO date format](https://cloud.tencent.com/document/product/266/11732#I).
     */
    public void setPicUrlExpireTime(String PicUrlExpireTime) {
        this.PicUrlExpireTime = PicUrlExpireTime;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "StartTimeOffset", this.StartTimeOffset);
        this.setParamSimple(map, prefix + "EndTimeOffset", this.EndTimeOffset);
        this.setParamSimple(map, prefix + "Confidence", this.Confidence);
        this.setParamSimple(map, prefix + "Suggestion", this.Suggestion);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Label", this.Label);
        this.setParamSimple(map, prefix + "Url", this.Url);
        this.setParamArraySimple(map, prefix + "AreaCoordSet.", this.AreaCoordSet);
        this.setParamSimple(map, prefix + "PicUrlExpireTimeStamp", this.PicUrlExpireTimeStamp);
        this.setParamSimple(map, prefix + "PicUrlExpireTime", this.PicUrlExpireTime);

    }
}

