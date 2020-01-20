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
package com.tencentcloudapi.live.v20180801.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TemplateInfo extends AbstractModel{

    /**
    * Video encoding format:
H.264/H.265.
    */
    @SerializedName("Vcodec")
    @Expose
    private String Vcodec;

    /**
    * Video bitrate in Kbps. Value range: 100-8,000
    */
    @SerializedName("VideoBitrate")
    @Expose
    private Long VideoBitrate;

    /**
    * Audio encoding format: AAC/MP3
AAC/MP3.
    */
    @SerializedName("Acodec")
    @Expose
    private String Acodec;

    /**
    * Audio bitrate. Value range: 0-500
    */
    @SerializedName("AudioBitrate")
    @Expose
    private Long AudioBitrate;

    /**
    * Width. Value range: 0-3,000
    */
    @SerializedName("Width")
    @Expose
    private Long Width;

    /**
    * Height. Value range: 0-3,000
    */
    @SerializedName("Height")
    @Expose
    private Long Height;

    /**
    * Frame rate. Value range: 0-200
    */
    @SerializedName("Fps")
    @Expose
    private Long Fps;

    /**
    * Keyframe interval in seconds. Value range: 1-50
    */
    @SerializedName("Gop")
    @Expose
    private Long Gop;

    /**
    * Rotation angle. Value range: 0, 90, 180, 270
    */
    @SerializedName("Rotate")
    @Expose
    private Long Rotate;

    /**
    * Encoding quality:
baseline/main/high.
    */
    @SerializedName("Profile")
    @Expose
    private String Profile;

    /**
    * Whether to not exceed the original bitrate. 0: no; 1: yes.
    */
    @SerializedName("BitrateToOrig")
    @Expose
    private Long BitrateToOrig;

    /**
    * Whether to not exceed the original height. 0: no; 1: yes.
    */
    @SerializedName("HeightToOrig")
    @Expose
    private Long HeightToOrig;

    /**
    * Whether to not exceed the original frame rate. 0: no; 1: yes.
    */
    @SerializedName("FpsToOrig")
    @Expose
    private Long FpsToOrig;

    /**
    * Whether to keep the video. 0: no; 1: yes.
    */
    @SerializedName("NeedVideo")
    @Expose
    private Long NeedVideo;

    /**
    * Whether to keep the audio. 0: no; 1: yes.
    */
    @SerializedName("NeedAudio")
    @Expose
    private Long NeedAudio;

    /**
    * Template ID.
    */
    @SerializedName("TemplateId")
    @Expose
    private Long TemplateId;

    /**
    * Template name
    */
    @SerializedName("TemplateName")
    @Expose
    private String TemplateName;

    /**
    * Template description
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * Whether it is an Ultra-fast HD template. 0: no; 1: yes. Default value: 0.
    */
    @SerializedName("AiTransCode")
    @Expose
    private Long AiTransCode;

    /**
    * VideoBitrate minus Ultra-fast HD bitrate. Value range: 0.1-0.5.
    */
    @SerializedName("AdaptBitratePercent")
    @Expose
    private Float AdaptBitratePercent;

    /**
     * Get Video encoding format:
H.264/H.265. 
     * @return Vcodec Video encoding format:
H.264/H.265.
     */
    public String getVcodec() {
        return this.Vcodec;
    }

    /**
     * Set Video encoding format:
H.264/H.265.
     * @param Vcodec Video encoding format:
H.264/H.265.
     */
    public void setVcodec(String Vcodec) {
        this.Vcodec = Vcodec;
    }

    /**
     * Get Video bitrate in Kbps. Value range: 100-8,000 
     * @return VideoBitrate Video bitrate in Kbps. Value range: 100-8,000
     */
    public Long getVideoBitrate() {
        return this.VideoBitrate;
    }

    /**
     * Set Video bitrate in Kbps. Value range: 100-8,000
     * @param VideoBitrate Video bitrate in Kbps. Value range: 100-8,000
     */
    public void setVideoBitrate(Long VideoBitrate) {
        this.VideoBitrate = VideoBitrate;
    }

    /**
     * Get Audio encoding format: AAC/MP3
AAC/MP3. 
     * @return Acodec Audio encoding format: AAC/MP3
AAC/MP3.
     */
    public String getAcodec() {
        return this.Acodec;
    }

    /**
     * Set Audio encoding format: AAC/MP3
AAC/MP3.
     * @param Acodec Audio encoding format: AAC/MP3
AAC/MP3.
     */
    public void setAcodec(String Acodec) {
        this.Acodec = Acodec;
    }

    /**
     * Get Audio bitrate. Value range: 0-500 
     * @return AudioBitrate Audio bitrate. Value range: 0-500
     */
    public Long getAudioBitrate() {
        return this.AudioBitrate;
    }

    /**
     * Set Audio bitrate. Value range: 0-500
     * @param AudioBitrate Audio bitrate. Value range: 0-500
     */
    public void setAudioBitrate(Long AudioBitrate) {
        this.AudioBitrate = AudioBitrate;
    }

    /**
     * Get Width. Value range: 0-3,000 
     * @return Width Width. Value range: 0-3,000
     */
    public Long getWidth() {
        return this.Width;
    }

    /**
     * Set Width. Value range: 0-3,000
     * @param Width Width. Value range: 0-3,000
     */
    public void setWidth(Long Width) {
        this.Width = Width;
    }

    /**
     * Get Height. Value range: 0-3,000 
     * @return Height Height. Value range: 0-3,000
     */
    public Long getHeight() {
        return this.Height;
    }

    /**
     * Set Height. Value range: 0-3,000
     * @param Height Height. Value range: 0-3,000
     */
    public void setHeight(Long Height) {
        this.Height = Height;
    }

    /**
     * Get Frame rate. Value range: 0-200 
     * @return Fps Frame rate. Value range: 0-200
     */
    public Long getFps() {
        return this.Fps;
    }

    /**
     * Set Frame rate. Value range: 0-200
     * @param Fps Frame rate. Value range: 0-200
     */
    public void setFps(Long Fps) {
        this.Fps = Fps;
    }

    /**
     * Get Keyframe interval in seconds. Value range: 1-50 
     * @return Gop Keyframe interval in seconds. Value range: 1-50
     */
    public Long getGop() {
        return this.Gop;
    }

    /**
     * Set Keyframe interval in seconds. Value range: 1-50
     * @param Gop Keyframe interval in seconds. Value range: 1-50
     */
    public void setGop(Long Gop) {
        this.Gop = Gop;
    }

    /**
     * Get Rotation angle. Value range: 0, 90, 180, 270 
     * @return Rotate Rotation angle. Value range: 0, 90, 180, 270
     */
    public Long getRotate() {
        return this.Rotate;
    }

    /**
     * Set Rotation angle. Value range: 0, 90, 180, 270
     * @param Rotate Rotation angle. Value range: 0, 90, 180, 270
     */
    public void setRotate(Long Rotate) {
        this.Rotate = Rotate;
    }

    /**
     * Get Encoding quality:
baseline/main/high. 
     * @return Profile Encoding quality:
baseline/main/high.
     */
    public String getProfile() {
        return this.Profile;
    }

    /**
     * Set Encoding quality:
baseline/main/high.
     * @param Profile Encoding quality:
baseline/main/high.
     */
    public void setProfile(String Profile) {
        this.Profile = Profile;
    }

    /**
     * Get Whether to not exceed the original bitrate. 0: no; 1: yes. 
     * @return BitrateToOrig Whether to not exceed the original bitrate. 0: no; 1: yes.
     */
    public Long getBitrateToOrig() {
        return this.BitrateToOrig;
    }

    /**
     * Set Whether to not exceed the original bitrate. 0: no; 1: yes.
     * @param BitrateToOrig Whether to not exceed the original bitrate. 0: no; 1: yes.
     */
    public void setBitrateToOrig(Long BitrateToOrig) {
        this.BitrateToOrig = BitrateToOrig;
    }

    /**
     * Get Whether to not exceed the original height. 0: no; 1: yes. 
     * @return HeightToOrig Whether to not exceed the original height. 0: no; 1: yes.
     */
    public Long getHeightToOrig() {
        return this.HeightToOrig;
    }

    /**
     * Set Whether to not exceed the original height. 0: no; 1: yes.
     * @param HeightToOrig Whether to not exceed the original height. 0: no; 1: yes.
     */
    public void setHeightToOrig(Long HeightToOrig) {
        this.HeightToOrig = HeightToOrig;
    }

    /**
     * Get Whether to not exceed the original frame rate. 0: no; 1: yes. 
     * @return FpsToOrig Whether to not exceed the original frame rate. 0: no; 1: yes.
     */
    public Long getFpsToOrig() {
        return this.FpsToOrig;
    }

    /**
     * Set Whether to not exceed the original frame rate. 0: no; 1: yes.
     * @param FpsToOrig Whether to not exceed the original frame rate. 0: no; 1: yes.
     */
    public void setFpsToOrig(Long FpsToOrig) {
        this.FpsToOrig = FpsToOrig;
    }

    /**
     * Get Whether to keep the video. 0: no; 1: yes. 
     * @return NeedVideo Whether to keep the video. 0: no; 1: yes.
     */
    public Long getNeedVideo() {
        return this.NeedVideo;
    }

    /**
     * Set Whether to keep the video. 0: no; 1: yes.
     * @param NeedVideo Whether to keep the video. 0: no; 1: yes.
     */
    public void setNeedVideo(Long NeedVideo) {
        this.NeedVideo = NeedVideo;
    }

    /**
     * Get Whether to keep the audio. 0: no; 1: yes. 
     * @return NeedAudio Whether to keep the audio. 0: no; 1: yes.
     */
    public Long getNeedAudio() {
        return this.NeedAudio;
    }

    /**
     * Set Whether to keep the audio. 0: no; 1: yes.
     * @param NeedAudio Whether to keep the audio. 0: no; 1: yes.
     */
    public void setNeedAudio(Long NeedAudio) {
        this.NeedAudio = NeedAudio;
    }

    /**
     * Get Template ID. 
     * @return TemplateId Template ID.
     */
    public Long getTemplateId() {
        return this.TemplateId;
    }

    /**
     * Set Template ID.
     * @param TemplateId Template ID.
     */
    public void setTemplateId(Long TemplateId) {
        this.TemplateId = TemplateId;
    }

    /**
     * Get Template name 
     * @return TemplateName Template name
     */
    public String getTemplateName() {
        return this.TemplateName;
    }

    /**
     * Set Template name
     * @param TemplateName Template name
     */
    public void setTemplateName(String TemplateName) {
        this.TemplateName = TemplateName;
    }

    /**
     * Get Template description 
     * @return Description Template description
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set Template description
     * @param Description Template description
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get Whether it is an Ultra-fast HD template. 0: no; 1: yes. Default value: 0. 
     * @return AiTransCode Whether it is an Ultra-fast HD template. 0: no; 1: yes. Default value: 0.
     */
    public Long getAiTransCode() {
        return this.AiTransCode;
    }

    /**
     * Set Whether it is an Ultra-fast HD template. 0: no; 1: yes. Default value: 0.
     * @param AiTransCode Whether it is an Ultra-fast HD template. 0: no; 1: yes. Default value: 0.
     */
    public void setAiTransCode(Long AiTransCode) {
        this.AiTransCode = AiTransCode;
    }

    /**
     * Get VideoBitrate minus Ultra-fast HD bitrate. Value range: 0.1-0.5. 
     * @return AdaptBitratePercent VideoBitrate minus Ultra-fast HD bitrate. Value range: 0.1-0.5.
     */
    public Float getAdaptBitratePercent() {
        return this.AdaptBitratePercent;
    }

    /**
     * Set VideoBitrate minus Ultra-fast HD bitrate. Value range: 0.1-0.5.
     * @param AdaptBitratePercent VideoBitrate minus Ultra-fast HD bitrate. Value range: 0.1-0.5.
     */
    public void setAdaptBitratePercent(Float AdaptBitratePercent) {
        this.AdaptBitratePercent = AdaptBitratePercent;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Vcodec", this.Vcodec);
        this.setParamSimple(map, prefix + "VideoBitrate", this.VideoBitrate);
        this.setParamSimple(map, prefix + "Acodec", this.Acodec);
        this.setParamSimple(map, prefix + "AudioBitrate", this.AudioBitrate);
        this.setParamSimple(map, prefix + "Width", this.Width);
        this.setParamSimple(map, prefix + "Height", this.Height);
        this.setParamSimple(map, prefix + "Fps", this.Fps);
        this.setParamSimple(map, prefix + "Gop", this.Gop);
        this.setParamSimple(map, prefix + "Rotate", this.Rotate);
        this.setParamSimple(map, prefix + "Profile", this.Profile);
        this.setParamSimple(map, prefix + "BitrateToOrig", this.BitrateToOrig);
        this.setParamSimple(map, prefix + "HeightToOrig", this.HeightToOrig);
        this.setParamSimple(map, prefix + "FpsToOrig", this.FpsToOrig);
        this.setParamSimple(map, prefix + "NeedVideo", this.NeedVideo);
        this.setParamSimple(map, prefix + "NeedAudio", this.NeedAudio);
        this.setParamSimple(map, prefix + "TemplateId", this.TemplateId);
        this.setParamSimple(map, prefix + "TemplateName", this.TemplateName);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "AiTransCode", this.AiTransCode);
        this.setParamSimple(map, prefix + "AdaptBitratePercent", this.AdaptBitratePercent);

    }
}
