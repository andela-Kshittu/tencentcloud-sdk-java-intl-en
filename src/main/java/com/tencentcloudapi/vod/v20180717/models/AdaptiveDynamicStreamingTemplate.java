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

public class AdaptiveDynamicStreamingTemplate extends AbstractModel{

    /**
    * Unique ID of a transcoding to adaptive bitrate streaming template.
    */
    @SerializedName("Definition")
    @Expose
    private Long Definition;

    /**
    * Template type. Valid values:
<li>Preset: preset template;</li>
<li>Custom: custom template.</li>
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * Name of a transcoding to adaptive bitrate streaming template.
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Description of a transcoding to adaptive bitrate streaming template.
    */
    @SerializedName("Comment")
    @Expose
    private String Comment;

    /**
    * Container type. Valid values:
<li>hls; </li>
<li>dash.</li>
    */
    @SerializedName("PackageType")
    @Expose
    private String PackageType;

    /**
    * DRM type. Valid values:
<li>FairPlay;</li>
<li>SimpleAES;</li>
<li>Widevine.</li>
If this field is a blank string, DRM will not be performed on the video.
    */
    @SerializedName("DrmType")
    @Expose
    private String DrmType;

    /**
    * List of video track templates.
    */
    @SerializedName("VideoTrackTemplateSet")
    @Expose
    private VideoTrackTemplateInfo [] VideoTrackTemplateSet;

    /**
    * List of audio track templates.
    */
    @SerializedName("AudioTrackTemplateSet")
    @Expose
    private AudioTrackTemplateInfo [] AudioTrackTemplateSet;

    /**
    * Adaptive bitstream format. Valid value:
<li>HLS.</li>
    */
    @SerializedName("Format")
    @Expose
    private String Format;

    /**
    * Parameter information of input stream for adaptive bitrate streaming. Up to 10 streams can be input.
    */
    @SerializedName("StreamInfos")
    @Expose
    private AdaptiveStreamTemplate [] StreamInfos;

    /**
    * Whether to prohibit transcoding from low bitrate to high bitrate. Valid values:
<li>0: no,</li>
<li>1: yes.</li>
    */
    @SerializedName("DisableHigherVideoBitrate")
    @Expose
    private Long DisableHigherVideoBitrate;

    /**
    * Whether to prohibit transcoding from low resolution to high resolution. Valid values:
<li>0: no,</li>
<li>1: yes.</li>
    */
    @SerializedName("DisableHigherVideoResolution")
    @Expose
    private Long DisableHigherVideoResolution;

    /**
    * Creation time of template in [ISO date format](https://cloud.tencent.com/document/product/266/11732#I).
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * Last modified time of template in [ISO date format](https://cloud.tencent.com/document/product/266/11732#I).
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
     * Get Unique ID of a transcoding to adaptive bitrate streaming template. 
     * @return Definition Unique ID of a transcoding to adaptive bitrate streaming template.
     */
    public Long getDefinition() {
        return this.Definition;
    }

    /**
     * Set Unique ID of a transcoding to adaptive bitrate streaming template.
     * @param Definition Unique ID of a transcoding to adaptive bitrate streaming template.
     */
    public void setDefinition(Long Definition) {
        this.Definition = Definition;
    }

    /**
     * Get Template type. Valid values:
<li>Preset: preset template;</li>
<li>Custom: custom template.</li> 
     * @return Type Template type. Valid values:
<li>Preset: preset template;</li>
<li>Custom: custom template.</li>
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set Template type. Valid values:
<li>Preset: preset template;</li>
<li>Custom: custom template.</li>
     * @param Type Template type. Valid values:
<li>Preset: preset template;</li>
<li>Custom: custom template.</li>
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get Name of a transcoding to adaptive bitrate streaming template. 
     * @return Name Name of a transcoding to adaptive bitrate streaming template.
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Name of a transcoding to adaptive bitrate streaming template.
     * @param Name Name of a transcoding to adaptive bitrate streaming template.
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Description of a transcoding to adaptive bitrate streaming template. 
     * @return Comment Description of a transcoding to adaptive bitrate streaming template.
     */
    public String getComment() {
        return this.Comment;
    }

    /**
     * Set Description of a transcoding to adaptive bitrate streaming template.
     * @param Comment Description of a transcoding to adaptive bitrate streaming template.
     */
    public void setComment(String Comment) {
        this.Comment = Comment;
    }

    /**
     * Get Container type. Valid values:
<li>hls; </li>
<li>dash.</li> 
     * @return PackageType Container type. Valid values:
<li>hls; </li>
<li>dash.</li>
     */
    public String getPackageType() {
        return this.PackageType;
    }

    /**
     * Set Container type. Valid values:
<li>hls; </li>
<li>dash.</li>
     * @param PackageType Container type. Valid values:
<li>hls; </li>
<li>dash.</li>
     */
    public void setPackageType(String PackageType) {
        this.PackageType = PackageType;
    }

    /**
     * Get DRM type. Valid values:
<li>FairPlay;</li>
<li>SimpleAES;</li>
<li>Widevine.</li>
If this field is a blank string, DRM will not be performed on the video. 
     * @return DrmType DRM type. Valid values:
<li>FairPlay;</li>
<li>SimpleAES;</li>
<li>Widevine.</li>
If this field is a blank string, DRM will not be performed on the video.
     */
    public String getDrmType() {
        return this.DrmType;
    }

    /**
     * Set DRM type. Valid values:
<li>FairPlay;</li>
<li>SimpleAES;</li>
<li>Widevine.</li>
If this field is a blank string, DRM will not be performed on the video.
     * @param DrmType DRM type. Valid values:
<li>FairPlay;</li>
<li>SimpleAES;</li>
<li>Widevine.</li>
If this field is a blank string, DRM will not be performed on the video.
     */
    public void setDrmType(String DrmType) {
        this.DrmType = DrmType;
    }

    /**
     * Get List of video track templates. 
     * @return VideoTrackTemplateSet List of video track templates.
     */
    public VideoTrackTemplateInfo [] getVideoTrackTemplateSet() {
        return this.VideoTrackTemplateSet;
    }

    /**
     * Set List of video track templates.
     * @param VideoTrackTemplateSet List of video track templates.
     */
    public void setVideoTrackTemplateSet(VideoTrackTemplateInfo [] VideoTrackTemplateSet) {
        this.VideoTrackTemplateSet = VideoTrackTemplateSet;
    }

    /**
     * Get List of audio track templates. 
     * @return AudioTrackTemplateSet List of audio track templates.
     */
    public AudioTrackTemplateInfo [] getAudioTrackTemplateSet() {
        return this.AudioTrackTemplateSet;
    }

    /**
     * Set List of audio track templates.
     * @param AudioTrackTemplateSet List of audio track templates.
     */
    public void setAudioTrackTemplateSet(AudioTrackTemplateInfo [] AudioTrackTemplateSet) {
        this.AudioTrackTemplateSet = AudioTrackTemplateSet;
    }

    /**
     * Get Adaptive bitstream format. Valid value:
<li>HLS.</li> 
     * @return Format Adaptive bitstream format. Valid value:
<li>HLS.</li>
     */
    public String getFormat() {
        return this.Format;
    }

    /**
     * Set Adaptive bitstream format. Valid value:
<li>HLS.</li>
     * @param Format Adaptive bitstream format. Valid value:
<li>HLS.</li>
     */
    public void setFormat(String Format) {
        this.Format = Format;
    }

    /**
     * Get Parameter information of input stream for adaptive bitrate streaming. Up to 10 streams can be input. 
     * @return StreamInfos Parameter information of input stream for adaptive bitrate streaming. Up to 10 streams can be input.
     */
    public AdaptiveStreamTemplate [] getStreamInfos() {
        return this.StreamInfos;
    }

    /**
     * Set Parameter information of input stream for adaptive bitrate streaming. Up to 10 streams can be input.
     * @param StreamInfos Parameter information of input stream for adaptive bitrate streaming. Up to 10 streams can be input.
     */
    public void setStreamInfos(AdaptiveStreamTemplate [] StreamInfos) {
        this.StreamInfos = StreamInfos;
    }

    /**
     * Get Whether to prohibit transcoding from low bitrate to high bitrate. Valid values:
<li>0: no,</li>
<li>1: yes.</li> 
     * @return DisableHigherVideoBitrate Whether to prohibit transcoding from low bitrate to high bitrate. Valid values:
<li>0: no,</li>
<li>1: yes.</li>
     */
    public Long getDisableHigherVideoBitrate() {
        return this.DisableHigherVideoBitrate;
    }

    /**
     * Set Whether to prohibit transcoding from low bitrate to high bitrate. Valid values:
<li>0: no,</li>
<li>1: yes.</li>
     * @param DisableHigherVideoBitrate Whether to prohibit transcoding from low bitrate to high bitrate. Valid values:
<li>0: no,</li>
<li>1: yes.</li>
     */
    public void setDisableHigherVideoBitrate(Long DisableHigherVideoBitrate) {
        this.DisableHigherVideoBitrate = DisableHigherVideoBitrate;
    }

    /**
     * Get Whether to prohibit transcoding from low resolution to high resolution. Valid values:
<li>0: no,</li>
<li>1: yes.</li> 
     * @return DisableHigherVideoResolution Whether to prohibit transcoding from low resolution to high resolution. Valid values:
<li>0: no,</li>
<li>1: yes.</li>
     */
    public Long getDisableHigherVideoResolution() {
        return this.DisableHigherVideoResolution;
    }

    /**
     * Set Whether to prohibit transcoding from low resolution to high resolution. Valid values:
<li>0: no,</li>
<li>1: yes.</li>
     * @param DisableHigherVideoResolution Whether to prohibit transcoding from low resolution to high resolution. Valid values:
<li>0: no,</li>
<li>1: yes.</li>
     */
    public void setDisableHigherVideoResolution(Long DisableHigherVideoResolution) {
        this.DisableHigherVideoResolution = DisableHigherVideoResolution;
    }

    /**
     * Get Creation time of template in [ISO date format](https://cloud.tencent.com/document/product/266/11732#I). 
     * @return CreateTime Creation time of template in [ISO date format](https://cloud.tencent.com/document/product/266/11732#I).
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set Creation time of template in [ISO date format](https://cloud.tencent.com/document/product/266/11732#I).
     * @param CreateTime Creation time of template in [ISO date format](https://cloud.tencent.com/document/product/266/11732#I).
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get Last modified time of template in [ISO date format](https://cloud.tencent.com/document/product/266/11732#I). 
     * @return UpdateTime Last modified time of template in [ISO date format](https://cloud.tencent.com/document/product/266/11732#I).
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set Last modified time of template in [ISO date format](https://cloud.tencent.com/document/product/266/11732#I).
     * @param UpdateTime Last modified time of template in [ISO date format](https://cloud.tencent.com/document/product/266/11732#I).
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Definition", this.Definition);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Comment", this.Comment);
        this.setParamSimple(map, prefix + "PackageType", this.PackageType);
        this.setParamSimple(map, prefix + "DrmType", this.DrmType);
        this.setParamArrayObj(map, prefix + "VideoTrackTemplateSet.", this.VideoTrackTemplateSet);
        this.setParamArrayObj(map, prefix + "AudioTrackTemplateSet.", this.AudioTrackTemplateSet);
        this.setParamSimple(map, prefix + "Format", this.Format);
        this.setParamArrayObj(map, prefix + "StreamInfos.", this.StreamInfos);
        this.setParamSimple(map, prefix + "DisableHigherVideoBitrate", this.DisableHigherVideoBitrate);
        this.setParamSimple(map, prefix + "DisableHigherVideoResolution", this.DisableHigherVideoResolution);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);

    }
}

