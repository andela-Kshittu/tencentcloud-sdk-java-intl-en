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

public class ModifyLiveTranscodeTemplateRequest extends AbstractModel{

    /**
    * Template ID.
    */
    @SerializedName("TemplateId")
    @Expose
    private Long TemplateId;

    /**
    * Video encoding format:
h264/h265.
    */
    @SerializedName("Vcodec")
    @Expose
    private String Vcodec;

    /**
    * Audio encoding format:
aac/mp3.
    */
    @SerializedName("Acodec")
    @Expose
    private String Acodec;

    /**
    * Audio bitrate. Value range: 0–500. Default value: 0.
    */
    @SerializedName("AudioBitrate")
    @Expose
    private Long AudioBitrate;

    /**
    * Template description.
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * Video bitrate. Value range: 100–8,000
    */
    @SerializedName("VideoBitrate")
    @Expose
    private Long VideoBitrate;

    /**
    * Width. Value range: 0–3,000
    */
    @SerializedName("Width")
    @Expose
    private Long Width;

    /**
    * Whether to keep the video. 0: no; 1: yes. Default value: 1.
    */
    @SerializedName("NeedVideo")
    @Expose
    private Long NeedVideo;

    /**
    * Whether to keep the audio. 0: no; 1: yes. Default value: 1.
    */
    @SerializedName("NeedAudio")
    @Expose
    private Long NeedAudio;

    /**
    * Height. Value range: 0–3,000
    */
    @SerializedName("Height")
    @Expose
    private Long Height;

    /**
    * Frame rate. Value range: 0–200
    */
    @SerializedName("Fps")
    @Expose
    private Long Fps;

    /**
    * Keyframe interval in seconds. Value range: 0–50
    */
    @SerializedName("Gop")
    @Expose
    private Long Gop;

    /**
    * Rotation angle. Valid values: 0, 90, 180, 270
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
    * Whether to not exceed the original bitrate. 0: no; 1: yes. Default value: 0.
    */
    @SerializedName("BitrateToOrig")
    @Expose
    private Long BitrateToOrig;

    /**
    * Whether to not exceed the original height. 0: no; 1: yes. Default value: 0.
    */
    @SerializedName("HeightToOrig")
    @Expose
    private Long HeightToOrig;

    /**
    * Whether to not exceed the original frame rate. 0: no; 1: yes. Default value: 0.
    */
    @SerializedName("FpsToOrig")
    @Expose
    private Long FpsToOrig;

    /**
    * VideoBitrate minus TESHD bitrate. Value range: 0.1–0.5.
    */
    @SerializedName("AdaptBitratePercent")
    @Expose
    private Float AdaptBitratePercent;

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
     * Get Video encoding format:
h264/h265. 
     * @return Vcodec Video encoding format:
h264/h265.
     */
    public String getVcodec() {
        return this.Vcodec;
    }

    /**
     * Set Video encoding format:
h264/h265.
     * @param Vcodec Video encoding format:
h264/h265.
     */
    public void setVcodec(String Vcodec) {
        this.Vcodec = Vcodec;
    }

    /**
     * Get Audio encoding format:
aac/mp3. 
     * @return Acodec Audio encoding format:
aac/mp3.
     */
    public String getAcodec() {
        return this.Acodec;
    }

    /**
     * Set Audio encoding format:
aac/mp3.
     * @param Acodec Audio encoding format:
aac/mp3.
     */
    public void setAcodec(String Acodec) {
        this.Acodec = Acodec;
    }

    /**
     * Get Audio bitrate. Value range: 0–500. Default value: 0. 
     * @return AudioBitrate Audio bitrate. Value range: 0–500. Default value: 0.
     */
    public Long getAudioBitrate() {
        return this.AudioBitrate;
    }

    /**
     * Set Audio bitrate. Value range: 0–500. Default value: 0.
     * @param AudioBitrate Audio bitrate. Value range: 0–500. Default value: 0.
     */
    public void setAudioBitrate(Long AudioBitrate) {
        this.AudioBitrate = AudioBitrate;
    }

    /**
     * Get Template description. 
     * @return Description Template description.
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set Template description.
     * @param Description Template description.
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get Video bitrate. Value range: 100–8,000 
     * @return VideoBitrate Video bitrate. Value range: 100–8,000
     */
    public Long getVideoBitrate() {
        return this.VideoBitrate;
    }

    /**
     * Set Video bitrate. Value range: 100–8,000
     * @param VideoBitrate Video bitrate. Value range: 100–8,000
     */
    public void setVideoBitrate(Long VideoBitrate) {
        this.VideoBitrate = VideoBitrate;
    }

    /**
     * Get Width. Value range: 0–3,000 
     * @return Width Width. Value range: 0–3,000
     */
    public Long getWidth() {
        return this.Width;
    }

    /**
     * Set Width. Value range: 0–3,000
     * @param Width Width. Value range: 0–3,000
     */
    public void setWidth(Long Width) {
        this.Width = Width;
    }

    /**
     * Get Whether to keep the video. 0: no; 1: yes. Default value: 1. 
     * @return NeedVideo Whether to keep the video. 0: no; 1: yes. Default value: 1.
     */
    public Long getNeedVideo() {
        return this.NeedVideo;
    }

    /**
     * Set Whether to keep the video. 0: no; 1: yes. Default value: 1.
     * @param NeedVideo Whether to keep the video. 0: no; 1: yes. Default value: 1.
     */
    public void setNeedVideo(Long NeedVideo) {
        this.NeedVideo = NeedVideo;
    }

    /**
     * Get Whether to keep the audio. 0: no; 1: yes. Default value: 1. 
     * @return NeedAudio Whether to keep the audio. 0: no; 1: yes. Default value: 1.
     */
    public Long getNeedAudio() {
        return this.NeedAudio;
    }

    /**
     * Set Whether to keep the audio. 0: no; 1: yes. Default value: 1.
     * @param NeedAudio Whether to keep the audio. 0: no; 1: yes. Default value: 1.
     */
    public void setNeedAudio(Long NeedAudio) {
        this.NeedAudio = NeedAudio;
    }

    /**
     * Get Height. Value range: 0–3,000 
     * @return Height Height. Value range: 0–3,000
     */
    public Long getHeight() {
        return this.Height;
    }

    /**
     * Set Height. Value range: 0–3,000
     * @param Height Height. Value range: 0–3,000
     */
    public void setHeight(Long Height) {
        this.Height = Height;
    }

    /**
     * Get Frame rate. Value range: 0–200 
     * @return Fps Frame rate. Value range: 0–200
     */
    public Long getFps() {
        return this.Fps;
    }

    /**
     * Set Frame rate. Value range: 0–200
     * @param Fps Frame rate. Value range: 0–200
     */
    public void setFps(Long Fps) {
        this.Fps = Fps;
    }

    /**
     * Get Keyframe interval in seconds. Value range: 0–50 
     * @return Gop Keyframe interval in seconds. Value range: 0–50
     */
    public Long getGop() {
        return this.Gop;
    }

    /**
     * Set Keyframe interval in seconds. Value range: 0–50
     * @param Gop Keyframe interval in seconds. Value range: 0–50
     */
    public void setGop(Long Gop) {
        this.Gop = Gop;
    }

    /**
     * Get Rotation angle. Valid values: 0, 90, 180, 270 
     * @return Rotate Rotation angle. Valid values: 0, 90, 180, 270
     */
    public Long getRotate() {
        return this.Rotate;
    }

    /**
     * Set Rotation angle. Valid values: 0, 90, 180, 270
     * @param Rotate Rotation angle. Valid values: 0, 90, 180, 270
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
     * Get Whether to not exceed the original bitrate. 0: no; 1: yes. Default value: 0. 
     * @return BitrateToOrig Whether to not exceed the original bitrate. 0: no; 1: yes. Default value: 0.
     */
    public Long getBitrateToOrig() {
        return this.BitrateToOrig;
    }

    /**
     * Set Whether to not exceed the original bitrate. 0: no; 1: yes. Default value: 0.
     * @param BitrateToOrig Whether to not exceed the original bitrate. 0: no; 1: yes. Default value: 0.
     */
    public void setBitrateToOrig(Long BitrateToOrig) {
        this.BitrateToOrig = BitrateToOrig;
    }

    /**
     * Get Whether to not exceed the original height. 0: no; 1: yes. Default value: 0. 
     * @return HeightToOrig Whether to not exceed the original height. 0: no; 1: yes. Default value: 0.
     */
    public Long getHeightToOrig() {
        return this.HeightToOrig;
    }

    /**
     * Set Whether to not exceed the original height. 0: no; 1: yes. Default value: 0.
     * @param HeightToOrig Whether to not exceed the original height. 0: no; 1: yes. Default value: 0.
     */
    public void setHeightToOrig(Long HeightToOrig) {
        this.HeightToOrig = HeightToOrig;
    }

    /**
     * Get Whether to not exceed the original frame rate. 0: no; 1: yes. Default value: 0. 
     * @return FpsToOrig Whether to not exceed the original frame rate. 0: no; 1: yes. Default value: 0.
     */
    public Long getFpsToOrig() {
        return this.FpsToOrig;
    }

    /**
     * Set Whether to not exceed the original frame rate. 0: no; 1: yes. Default value: 0.
     * @param FpsToOrig Whether to not exceed the original frame rate. 0: no; 1: yes. Default value: 0.
     */
    public void setFpsToOrig(Long FpsToOrig) {
        this.FpsToOrig = FpsToOrig;
    }

    /**
     * Get VideoBitrate minus TESHD bitrate. Value range: 0.1–0.5. 
     * @return AdaptBitratePercent VideoBitrate minus TESHD bitrate. Value range: 0.1–0.5.
     */
    public Float getAdaptBitratePercent() {
        return this.AdaptBitratePercent;
    }

    /**
     * Set VideoBitrate minus TESHD bitrate. Value range: 0.1–0.5.
     * @param AdaptBitratePercent VideoBitrate minus TESHD bitrate. Value range: 0.1–0.5.
     */
    public void setAdaptBitratePercent(Float AdaptBitratePercent) {
        this.AdaptBitratePercent = AdaptBitratePercent;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TemplateId", this.TemplateId);
        this.setParamSimple(map, prefix + "Vcodec", this.Vcodec);
        this.setParamSimple(map, prefix + "Acodec", this.Acodec);
        this.setParamSimple(map, prefix + "AudioBitrate", this.AudioBitrate);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "VideoBitrate", this.VideoBitrate);
        this.setParamSimple(map, prefix + "Width", this.Width);
        this.setParamSimple(map, prefix + "NeedVideo", this.NeedVideo);
        this.setParamSimple(map, prefix + "NeedAudio", this.NeedAudio);
        this.setParamSimple(map, prefix + "Height", this.Height);
        this.setParamSimple(map, prefix + "Fps", this.Fps);
        this.setParamSimple(map, prefix + "Gop", this.Gop);
        this.setParamSimple(map, prefix + "Rotate", this.Rotate);
        this.setParamSimple(map, prefix + "Profile", this.Profile);
        this.setParamSimple(map, prefix + "BitrateToOrig", this.BitrateToOrig);
        this.setParamSimple(map, prefix + "HeightToOrig", this.HeightToOrig);
        this.setParamSimple(map, prefix + "FpsToOrig", this.FpsToOrig);
        this.setParamSimple(map, prefix + "AdaptBitratePercent", this.AdaptBitratePercent);

    }
}

