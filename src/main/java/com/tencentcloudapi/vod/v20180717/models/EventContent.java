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

public class EventContent extends AbstractModel{

    /**
    * Event handler. The caller must call `ConfirmEvents` to confirm that the message has been received, and the confirmation is valid for 30 seconds. After the confirmation expires, the event can be obtained again.
    */
    @SerializedName("EventHandle")
    @Expose
    private String EventHandle;

    /**
    * <b>Supported event type:</b>
<li>NewFileUpload: video upload completion;</li>
<li>ProcedureStateChanged: task flow status change;</li>
<li>FileDeleted: video deletion completion;</li>
<li>PullComplete: video pull for upload completion;</li>
<li>EditMediaComplete: video editing completion;</li>
<li>WechatPublishComplete: release on WeChat completion;</li>
<li>ComposeMediaComplete: media file composing completion;</li>
<li>WechatMiniProgramPublishComplete: release in WeChat Mini Program completion.</li>
<b>Event types compatible with v2017:</b>
<li>TranscodeComplete: video transcoding completion;</li>
<li>ConcatComplete: video splicing completion;</li>
<li>ClipComplete: video clipping completion;</li>
<li>CreateImageSpriteComplete: image sprite generating completion;</li>
<li>CreateSnapshotByTimeOffsetComplete: time point screencapturing completion.</li>
    */
    @SerializedName("EventType")
    @Expose
    private String EventType;

    /**
    * Video upload completion event, which is valid if the event type is `NewFileUpload`.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("FileUploadEvent")
    @Expose
    private FileUploadTask FileUploadEvent;

    /**
    * Task flow status change event, which is valid if the event type is `ProcedureStateChanged`.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ProcedureStateChangeEvent")
    @Expose
    private ProcedureTask ProcedureStateChangeEvent;

    /**
    * File deletion event, which is valid if the event type is `FileDeleted`.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("FileDeleteEvent")
    @Expose
    private FileDeleteTask FileDeleteEvent;

    /**
    * Video pull for upload completion event, which is valid if the event type is `PullComplete`.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("PullCompleteEvent")
    @Expose
    private PullUploadTask PullCompleteEvent;

    /**
    * Video editing completion event, which is valid if the event type is `EditMediaComplete`.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("EditMediaCompleteEvent")
    @Expose
    private EditMediaTask EditMediaCompleteEvent;

    /**
    * Release on WeChat completion event, which is valid if the event type is `WechatPublishComplete`.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("WechatPublishCompleteEvent")
    @Expose
    private WechatPublishTask WechatPublishCompleteEvent;

    /**
    * Video transcoding completion event, which is valid if the event type is `TranscodeComplete`.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("TranscodeCompleteEvent")
    @Expose
    private TranscodeTask2017 TranscodeCompleteEvent;

    /**
    * Video splicing completion event, which is valid if the event type is `ConcatComplete`.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ConcatCompleteEvent")
    @Expose
    private ConcatTask2017 ConcatCompleteEvent;

    /**
    * Video clipping completion event, which is valid if the event type is `ClipComplete`.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ClipCompleteEvent")
    @Expose
    private ClipTask2017 ClipCompleteEvent;

    /**
    * Image sprite generating completion event, which is valid if the event type is `CreateImageSpriteComplete`.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("CreateImageSpriteCompleteEvent")
    @Expose
    private CreateImageSpriteTask2017 CreateImageSpriteCompleteEvent;

    /**
    * Time point screencapturing completion event, which is valid when the event type is `CreateSnapshotByTimeOffsetComplete`.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("SnapshotByTimeOffsetCompleteEvent")
    @Expose
    private SnapshotByTimeOffsetTask2017 SnapshotByTimeOffsetCompleteEvent;

    /**
    * Media file composing task completion event, which is valid when the event type is `ComposeMediaComplete`.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ComposeMediaCompleteEvent")
    @Expose
    private ComposeMediaTask ComposeMediaCompleteEvent;

    /**
    * Release in WeChat Mini Program task completion event, which is valid if the event type is `WechatMiniProgramPublishComplete`.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("WechatMiniProgramPublishCompleteEvent")
    @Expose
    private WechatMiniProgramPublishTask WechatMiniProgramPublishCompleteEvent;

    /**
     * Get Event handler. The caller must call `ConfirmEvents` to confirm that the message has been received, and the confirmation is valid for 30 seconds. After the confirmation expires, the event can be obtained again. 
     * @return EventHandle Event handler. The caller must call `ConfirmEvents` to confirm that the message has been received, and the confirmation is valid for 30 seconds. After the confirmation expires, the event can be obtained again.
     */
    public String getEventHandle() {
        return this.EventHandle;
    }

    /**
     * Set Event handler. The caller must call `ConfirmEvents` to confirm that the message has been received, and the confirmation is valid for 30 seconds. After the confirmation expires, the event can be obtained again.
     * @param EventHandle Event handler. The caller must call `ConfirmEvents` to confirm that the message has been received, and the confirmation is valid for 30 seconds. After the confirmation expires, the event can be obtained again.
     */
    public void setEventHandle(String EventHandle) {
        this.EventHandle = EventHandle;
    }

    /**
     * Get <b>Supported event type:</b>
<li>NewFileUpload: video upload completion;</li>
<li>ProcedureStateChanged: task flow status change;</li>
<li>FileDeleted: video deletion completion;</li>
<li>PullComplete: video pull for upload completion;</li>
<li>EditMediaComplete: video editing completion;</li>
<li>WechatPublishComplete: release on WeChat completion;</li>
<li>ComposeMediaComplete: media file composing completion;</li>
<li>WechatMiniProgramPublishComplete: release in WeChat Mini Program completion.</li>
<b>Event types compatible with v2017:</b>
<li>TranscodeComplete: video transcoding completion;</li>
<li>ConcatComplete: video splicing completion;</li>
<li>ClipComplete: video clipping completion;</li>
<li>CreateImageSpriteComplete: image sprite generating completion;</li>
<li>CreateSnapshotByTimeOffsetComplete: time point screencapturing completion.</li> 
     * @return EventType <b>Supported event type:</b>
<li>NewFileUpload: video upload completion;</li>
<li>ProcedureStateChanged: task flow status change;</li>
<li>FileDeleted: video deletion completion;</li>
<li>PullComplete: video pull for upload completion;</li>
<li>EditMediaComplete: video editing completion;</li>
<li>WechatPublishComplete: release on WeChat completion;</li>
<li>ComposeMediaComplete: media file composing completion;</li>
<li>WechatMiniProgramPublishComplete: release in WeChat Mini Program completion.</li>
<b>Event types compatible with v2017:</b>
<li>TranscodeComplete: video transcoding completion;</li>
<li>ConcatComplete: video splicing completion;</li>
<li>ClipComplete: video clipping completion;</li>
<li>CreateImageSpriteComplete: image sprite generating completion;</li>
<li>CreateSnapshotByTimeOffsetComplete: time point screencapturing completion.</li>
     */
    public String getEventType() {
        return this.EventType;
    }

    /**
     * Set <b>Supported event type:</b>
<li>NewFileUpload: video upload completion;</li>
<li>ProcedureStateChanged: task flow status change;</li>
<li>FileDeleted: video deletion completion;</li>
<li>PullComplete: video pull for upload completion;</li>
<li>EditMediaComplete: video editing completion;</li>
<li>WechatPublishComplete: release on WeChat completion;</li>
<li>ComposeMediaComplete: media file composing completion;</li>
<li>WechatMiniProgramPublishComplete: release in WeChat Mini Program completion.</li>
<b>Event types compatible with v2017:</b>
<li>TranscodeComplete: video transcoding completion;</li>
<li>ConcatComplete: video splicing completion;</li>
<li>ClipComplete: video clipping completion;</li>
<li>CreateImageSpriteComplete: image sprite generating completion;</li>
<li>CreateSnapshotByTimeOffsetComplete: time point screencapturing completion.</li>
     * @param EventType <b>Supported event type:</b>
<li>NewFileUpload: video upload completion;</li>
<li>ProcedureStateChanged: task flow status change;</li>
<li>FileDeleted: video deletion completion;</li>
<li>PullComplete: video pull for upload completion;</li>
<li>EditMediaComplete: video editing completion;</li>
<li>WechatPublishComplete: release on WeChat completion;</li>
<li>ComposeMediaComplete: media file composing completion;</li>
<li>WechatMiniProgramPublishComplete: release in WeChat Mini Program completion.</li>
<b>Event types compatible with v2017:</b>
<li>TranscodeComplete: video transcoding completion;</li>
<li>ConcatComplete: video splicing completion;</li>
<li>ClipComplete: video clipping completion;</li>
<li>CreateImageSpriteComplete: image sprite generating completion;</li>
<li>CreateSnapshotByTimeOffsetComplete: time point screencapturing completion.</li>
     */
    public void setEventType(String EventType) {
        this.EventType = EventType;
    }

    /**
     * Get Video upload completion event, which is valid if the event type is `NewFileUpload`.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return FileUploadEvent Video upload completion event, which is valid if the event type is `NewFileUpload`.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public FileUploadTask getFileUploadEvent() {
        return this.FileUploadEvent;
    }

    /**
     * Set Video upload completion event, which is valid if the event type is `NewFileUpload`.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param FileUploadEvent Video upload completion event, which is valid if the event type is `NewFileUpload`.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setFileUploadEvent(FileUploadTask FileUploadEvent) {
        this.FileUploadEvent = FileUploadEvent;
    }

    /**
     * Get Task flow status change event, which is valid if the event type is `ProcedureStateChanged`.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return ProcedureStateChangeEvent Task flow status change event, which is valid if the event type is `ProcedureStateChanged`.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public ProcedureTask getProcedureStateChangeEvent() {
        return this.ProcedureStateChangeEvent;
    }

    /**
     * Set Task flow status change event, which is valid if the event type is `ProcedureStateChanged`.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param ProcedureStateChangeEvent Task flow status change event, which is valid if the event type is `ProcedureStateChanged`.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setProcedureStateChangeEvent(ProcedureTask ProcedureStateChangeEvent) {
        this.ProcedureStateChangeEvent = ProcedureStateChangeEvent;
    }

    /**
     * Get File deletion event, which is valid if the event type is `FileDeleted`.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return FileDeleteEvent File deletion event, which is valid if the event type is `FileDeleted`.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public FileDeleteTask getFileDeleteEvent() {
        return this.FileDeleteEvent;
    }

    /**
     * Set File deletion event, which is valid if the event type is `FileDeleted`.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param FileDeleteEvent File deletion event, which is valid if the event type is `FileDeleted`.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setFileDeleteEvent(FileDeleteTask FileDeleteEvent) {
        this.FileDeleteEvent = FileDeleteEvent;
    }

    /**
     * Get Video pull for upload completion event, which is valid if the event type is `PullComplete`.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return PullCompleteEvent Video pull for upload completion event, which is valid if the event type is `PullComplete`.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public PullUploadTask getPullCompleteEvent() {
        return this.PullCompleteEvent;
    }

    /**
     * Set Video pull for upload completion event, which is valid if the event type is `PullComplete`.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param PullCompleteEvent Video pull for upload completion event, which is valid if the event type is `PullComplete`.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setPullCompleteEvent(PullUploadTask PullCompleteEvent) {
        this.PullCompleteEvent = PullCompleteEvent;
    }

    /**
     * Get Video editing completion event, which is valid if the event type is `EditMediaComplete`.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return EditMediaCompleteEvent Video editing completion event, which is valid if the event type is `EditMediaComplete`.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public EditMediaTask getEditMediaCompleteEvent() {
        return this.EditMediaCompleteEvent;
    }

    /**
     * Set Video editing completion event, which is valid if the event type is `EditMediaComplete`.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param EditMediaCompleteEvent Video editing completion event, which is valid if the event type is `EditMediaComplete`.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setEditMediaCompleteEvent(EditMediaTask EditMediaCompleteEvent) {
        this.EditMediaCompleteEvent = EditMediaCompleteEvent;
    }

    /**
     * Get Release on WeChat completion event, which is valid if the event type is `WechatPublishComplete`.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return WechatPublishCompleteEvent Release on WeChat completion event, which is valid if the event type is `WechatPublishComplete`.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public WechatPublishTask getWechatPublishCompleteEvent() {
        return this.WechatPublishCompleteEvent;
    }

    /**
     * Set Release on WeChat completion event, which is valid if the event type is `WechatPublishComplete`.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param WechatPublishCompleteEvent Release on WeChat completion event, which is valid if the event type is `WechatPublishComplete`.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setWechatPublishCompleteEvent(WechatPublishTask WechatPublishCompleteEvent) {
        this.WechatPublishCompleteEvent = WechatPublishCompleteEvent;
    }

    /**
     * Get Video transcoding completion event, which is valid if the event type is `TranscodeComplete`.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return TranscodeCompleteEvent Video transcoding completion event, which is valid if the event type is `TranscodeComplete`.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public TranscodeTask2017 getTranscodeCompleteEvent() {
        return this.TranscodeCompleteEvent;
    }

    /**
     * Set Video transcoding completion event, which is valid if the event type is `TranscodeComplete`.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param TranscodeCompleteEvent Video transcoding completion event, which is valid if the event type is `TranscodeComplete`.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setTranscodeCompleteEvent(TranscodeTask2017 TranscodeCompleteEvent) {
        this.TranscodeCompleteEvent = TranscodeCompleteEvent;
    }

    /**
     * Get Video splicing completion event, which is valid if the event type is `ConcatComplete`.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return ConcatCompleteEvent Video splicing completion event, which is valid if the event type is `ConcatComplete`.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public ConcatTask2017 getConcatCompleteEvent() {
        return this.ConcatCompleteEvent;
    }

    /**
     * Set Video splicing completion event, which is valid if the event type is `ConcatComplete`.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param ConcatCompleteEvent Video splicing completion event, which is valid if the event type is `ConcatComplete`.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setConcatCompleteEvent(ConcatTask2017 ConcatCompleteEvent) {
        this.ConcatCompleteEvent = ConcatCompleteEvent;
    }

    /**
     * Get Video clipping completion event, which is valid if the event type is `ClipComplete`.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return ClipCompleteEvent Video clipping completion event, which is valid if the event type is `ClipComplete`.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public ClipTask2017 getClipCompleteEvent() {
        return this.ClipCompleteEvent;
    }

    /**
     * Set Video clipping completion event, which is valid if the event type is `ClipComplete`.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param ClipCompleteEvent Video clipping completion event, which is valid if the event type is `ClipComplete`.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setClipCompleteEvent(ClipTask2017 ClipCompleteEvent) {
        this.ClipCompleteEvent = ClipCompleteEvent;
    }

    /**
     * Get Image sprite generating completion event, which is valid if the event type is `CreateImageSpriteComplete`.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return CreateImageSpriteCompleteEvent Image sprite generating completion event, which is valid if the event type is `CreateImageSpriteComplete`.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public CreateImageSpriteTask2017 getCreateImageSpriteCompleteEvent() {
        return this.CreateImageSpriteCompleteEvent;
    }

    /**
     * Set Image sprite generating completion event, which is valid if the event type is `CreateImageSpriteComplete`.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param CreateImageSpriteCompleteEvent Image sprite generating completion event, which is valid if the event type is `CreateImageSpriteComplete`.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setCreateImageSpriteCompleteEvent(CreateImageSpriteTask2017 CreateImageSpriteCompleteEvent) {
        this.CreateImageSpriteCompleteEvent = CreateImageSpriteCompleteEvent;
    }

    /**
     * Get Time point screencapturing completion event, which is valid when the event type is `CreateSnapshotByTimeOffsetComplete`.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return SnapshotByTimeOffsetCompleteEvent Time point screencapturing completion event, which is valid when the event type is `CreateSnapshotByTimeOffsetComplete`.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public SnapshotByTimeOffsetTask2017 getSnapshotByTimeOffsetCompleteEvent() {
        return this.SnapshotByTimeOffsetCompleteEvent;
    }

    /**
     * Set Time point screencapturing completion event, which is valid when the event type is `CreateSnapshotByTimeOffsetComplete`.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param SnapshotByTimeOffsetCompleteEvent Time point screencapturing completion event, which is valid when the event type is `CreateSnapshotByTimeOffsetComplete`.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setSnapshotByTimeOffsetCompleteEvent(SnapshotByTimeOffsetTask2017 SnapshotByTimeOffsetCompleteEvent) {
        this.SnapshotByTimeOffsetCompleteEvent = SnapshotByTimeOffsetCompleteEvent;
    }

    /**
     * Get Media file composing task completion event, which is valid when the event type is `ComposeMediaComplete`.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return ComposeMediaCompleteEvent Media file composing task completion event, which is valid when the event type is `ComposeMediaComplete`.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public ComposeMediaTask getComposeMediaCompleteEvent() {
        return this.ComposeMediaCompleteEvent;
    }

    /**
     * Set Media file composing task completion event, which is valid when the event type is `ComposeMediaComplete`.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param ComposeMediaCompleteEvent Media file composing task completion event, which is valid when the event type is `ComposeMediaComplete`.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setComposeMediaCompleteEvent(ComposeMediaTask ComposeMediaCompleteEvent) {
        this.ComposeMediaCompleteEvent = ComposeMediaCompleteEvent;
    }

    /**
     * Get Release in WeChat Mini Program task completion event, which is valid if the event type is `WechatMiniProgramPublishComplete`.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return WechatMiniProgramPublishCompleteEvent Release in WeChat Mini Program task completion event, which is valid if the event type is `WechatMiniProgramPublishComplete`.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public WechatMiniProgramPublishTask getWechatMiniProgramPublishCompleteEvent() {
        return this.WechatMiniProgramPublishCompleteEvent;
    }

    /**
     * Set Release in WeChat Mini Program task completion event, which is valid if the event type is `WechatMiniProgramPublishComplete`.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param WechatMiniProgramPublishCompleteEvent Release in WeChat Mini Program task completion event, which is valid if the event type is `WechatMiniProgramPublishComplete`.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setWechatMiniProgramPublishCompleteEvent(WechatMiniProgramPublishTask WechatMiniProgramPublishCompleteEvent) {
        this.WechatMiniProgramPublishCompleteEvent = WechatMiniProgramPublishCompleteEvent;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "EventHandle", this.EventHandle);
        this.setParamSimple(map, prefix + "EventType", this.EventType);
        this.setParamObj(map, prefix + "FileUploadEvent.", this.FileUploadEvent);
        this.setParamObj(map, prefix + "ProcedureStateChangeEvent.", this.ProcedureStateChangeEvent);
        this.setParamObj(map, prefix + "FileDeleteEvent.", this.FileDeleteEvent);
        this.setParamObj(map, prefix + "PullCompleteEvent.", this.PullCompleteEvent);
        this.setParamObj(map, prefix + "EditMediaCompleteEvent.", this.EditMediaCompleteEvent);
        this.setParamObj(map, prefix + "WechatPublishCompleteEvent.", this.WechatPublishCompleteEvent);
        this.setParamObj(map, prefix + "TranscodeCompleteEvent.", this.TranscodeCompleteEvent);
        this.setParamObj(map, prefix + "ConcatCompleteEvent.", this.ConcatCompleteEvent);
        this.setParamObj(map, prefix + "ClipCompleteEvent.", this.ClipCompleteEvent);
        this.setParamObj(map, prefix + "CreateImageSpriteCompleteEvent.", this.CreateImageSpriteCompleteEvent);
        this.setParamObj(map, prefix + "SnapshotByTimeOffsetCompleteEvent.", this.SnapshotByTimeOffsetCompleteEvent);
        this.setParamObj(map, prefix + "ComposeMediaCompleteEvent.", this.ComposeMediaCompleteEvent);
        this.setParamObj(map, prefix + "WechatMiniProgramPublishCompleteEvent.", this.WechatMiniProgramPublishCompleteEvent);

    }
}
