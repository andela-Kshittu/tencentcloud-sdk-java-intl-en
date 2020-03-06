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

public class ComposeMediaOutput extends AbstractModel{

    /**
    * Filename of up to 64 characters.
    */
    @SerializedName("FileName")
    @Expose
    private String FileName;

    /**
    * Description, which can contain up to 128 characters.
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * Category ID, which is used to categorize the media for management. A category can be created and its ID can be obtained by using the [category creating](/document/product/266/7812) API.
<li>Default value: 0, which means "Other".</li>
    */
    @SerializedName("ClassId")
    @Expose
    private Long ClassId;

    /**
    * Expiration time of output media file in ISO 8601 format, after which the file will be deleted. Files will never expire by default. For more information, please see [Notes on ISO Date Format](https://cloud.tencent.com/document/product/266/11732#I).
    */
    @SerializedName("ExpireTime")
    @Expose
    private String ExpireTime;

    /**
    * Container. Valid values: mp4, mp3. mp3 is for audio files.
    */
    @SerializedName("Container")
    @Expose
    private String Container;

    /**
    * Information of output video.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("VideoStream")
    @Expose
    private OutputVideoStream VideoStream;

    /**
    * Information of output audio.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("AudioStream")
    @Expose
    private OutputAudioStream AudioStream;

    /**
    * Whether to remove video data. Valid values:
<li>0: retain</li>
<li>1: remove</li>
Default value: 0.
    */
    @SerializedName("RemoveVideo")
    @Expose
    private Long RemoveVideo;

    /**
    * Whether to remove audio data. Valid values:
<li>0: retain</li>
<li>1: remove</li>
Default value: 0.
    */
    @SerializedName("RemoveAudio")
    @Expose
    private Long RemoveAudio;

    /**
     * Get Filename of up to 64 characters. 
     * @return FileName Filename of up to 64 characters.
     */
    public String getFileName() {
        return this.FileName;
    }

    /**
     * Set Filename of up to 64 characters.
     * @param FileName Filename of up to 64 characters.
     */
    public void setFileName(String FileName) {
        this.FileName = FileName;
    }

    /**
     * Get Description, which can contain up to 128 characters. 
     * @return Description Description, which can contain up to 128 characters.
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set Description, which can contain up to 128 characters.
     * @param Description Description, which can contain up to 128 characters.
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get Category ID, which is used to categorize the media for management. A category can be created and its ID can be obtained by using the [category creating](/document/product/266/7812) API.
<li>Default value: 0, which means "Other".</li> 
     * @return ClassId Category ID, which is used to categorize the media for management. A category can be created and its ID can be obtained by using the [category creating](/document/product/266/7812) API.
<li>Default value: 0, which means "Other".</li>
     */
    public Long getClassId() {
        return this.ClassId;
    }

    /**
     * Set Category ID, which is used to categorize the media for management. A category can be created and its ID can be obtained by using the [category creating](/document/product/266/7812) API.
<li>Default value: 0, which means "Other".</li>
     * @param ClassId Category ID, which is used to categorize the media for management. A category can be created and its ID can be obtained by using the [category creating](/document/product/266/7812) API.
<li>Default value: 0, which means "Other".</li>
     */
    public void setClassId(Long ClassId) {
        this.ClassId = ClassId;
    }

    /**
     * Get Expiration time of output media file in ISO 8601 format, after which the file will be deleted. Files will never expire by default. For more information, please see [Notes on ISO Date Format](https://cloud.tencent.com/document/product/266/11732#I). 
     * @return ExpireTime Expiration time of output media file in ISO 8601 format, after which the file will be deleted. Files will never expire by default. For more information, please see [Notes on ISO Date Format](https://cloud.tencent.com/document/product/266/11732#I).
     */
    public String getExpireTime() {
        return this.ExpireTime;
    }

    /**
     * Set Expiration time of output media file in ISO 8601 format, after which the file will be deleted. Files will never expire by default. For more information, please see [Notes on ISO Date Format](https://cloud.tencent.com/document/product/266/11732#I).
     * @param ExpireTime Expiration time of output media file in ISO 8601 format, after which the file will be deleted. Files will never expire by default. For more information, please see [Notes on ISO Date Format](https://cloud.tencent.com/document/product/266/11732#I).
     */
    public void setExpireTime(String ExpireTime) {
        this.ExpireTime = ExpireTime;
    }

    /**
     * Get Container. Valid values: mp4, mp3. mp3 is for audio files. 
     * @return Container Container. Valid values: mp4, mp3. mp3 is for audio files.
     */
    public String getContainer() {
        return this.Container;
    }

    /**
     * Set Container. Valid values: mp4, mp3. mp3 is for audio files.
     * @param Container Container. Valid values: mp4, mp3. mp3 is for audio files.
     */
    public void setContainer(String Container) {
        this.Container = Container;
    }

    /**
     * Get Information of output video.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return VideoStream Information of output video.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public OutputVideoStream getVideoStream() {
        return this.VideoStream;
    }

    /**
     * Set Information of output video.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param VideoStream Information of output video.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setVideoStream(OutputVideoStream VideoStream) {
        this.VideoStream = VideoStream;
    }

    /**
     * Get Information of output audio.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return AudioStream Information of output audio.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public OutputAudioStream getAudioStream() {
        return this.AudioStream;
    }

    /**
     * Set Information of output audio.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param AudioStream Information of output audio.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setAudioStream(OutputAudioStream AudioStream) {
        this.AudioStream = AudioStream;
    }

    /**
     * Get Whether to remove video data. Valid values:
<li>0: retain</li>
<li>1: remove</li>
Default value: 0. 
     * @return RemoveVideo Whether to remove video data. Valid values:
<li>0: retain</li>
<li>1: remove</li>
Default value: 0.
     */
    public Long getRemoveVideo() {
        return this.RemoveVideo;
    }

    /**
     * Set Whether to remove video data. Valid values:
<li>0: retain</li>
<li>1: remove</li>
Default value: 0.
     * @param RemoveVideo Whether to remove video data. Valid values:
<li>0: retain</li>
<li>1: remove</li>
Default value: 0.
     */
    public void setRemoveVideo(Long RemoveVideo) {
        this.RemoveVideo = RemoveVideo;
    }

    /**
     * Get Whether to remove audio data. Valid values:
<li>0: retain</li>
<li>1: remove</li>
Default value: 0. 
     * @return RemoveAudio Whether to remove audio data. Valid values:
<li>0: retain</li>
<li>1: remove</li>
Default value: 0.
     */
    public Long getRemoveAudio() {
        return this.RemoveAudio;
    }

    /**
     * Set Whether to remove audio data. Valid values:
<li>0: retain</li>
<li>1: remove</li>
Default value: 0.
     * @param RemoveAudio Whether to remove audio data. Valid values:
<li>0: retain</li>
<li>1: remove</li>
Default value: 0.
     */
    public void setRemoveAudio(Long RemoveAudio) {
        this.RemoveAudio = RemoveAudio;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FileName", this.FileName);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "ClassId", this.ClassId);
        this.setParamSimple(map, prefix + "ExpireTime", this.ExpireTime);
        this.setParamSimple(map, prefix + "Container", this.Container);
        this.setParamObj(map, prefix + "VideoStream.", this.VideoStream);
        this.setParamObj(map, prefix + "AudioStream.", this.AudioStream);
        this.setParamSimple(map, prefix + "RemoveVideo", this.RemoveVideo);
        this.setParamSimple(map, prefix + "RemoveAudio", this.RemoveAudio);

    }
}

