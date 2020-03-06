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

public class EditMediaRequest extends AbstractModel{

    /**
    * Input video type. Valid values: File, Stream.
    */
    @SerializedName("InputType")
    @Expose
    private String InputType;

    /**
    * Information of input video file, which is required if `InputType` is `File`.
    */
    @SerializedName("FileInfos")
    @Expose
    private EditMediaFileInfo [] FileInfos;

    /**
    * Input stream information, which is required if `InputType` is `Stream`.
    */
    @SerializedName("StreamInfos")
    @Expose
    private EditMediaStreamInfo [] StreamInfos;

    /**
    * Editing template ID. Valid values: 10, 20. If this parameter is left empty, template 10 will be used.
<li>10: the input with the highest resolution will be used as the benchmark;</li>
<li>20: the input with the highest bitrate will be used as the benchmark;</li>
    */
    @SerializedName("Definition")
    @Expose
    private Long Definition;

    /**
    * [Task flow template](/document/product/266/11700#.E4.BB.BB.E5.8A.A1.E6.B5.81.E6.A8.A1.E6.9D.BF) name, which should be entered if you want to perform a task flow on the generated new video.
    */
    @SerializedName("ProcedureName")
    @Expose
    private String ProcedureName;

    /**
    * Configuration of file generated after editing.
    */
    @SerializedName("OutputConfig")
    @Expose
    private EditMediaOutputConfig OutputConfig;

    /**
    * Identifies the source context which is used to pass through the user request information. The `EditMediaComplete` callback and task flow status change callback will return the value of this field. It can contain up to 1,000 characters.
    */
    @SerializedName("SessionContext")
    @Expose
    private String SessionContext;

    /**
    * ID used for task deduplication. If there was a request with the same ID in the last day, the current request will return an error. The ID can contain up to 50 characters. If this parameter is left empty or a blank string is entered, no deduplication will be performed.
    */
    @SerializedName("SessionId")
    @Expose
    private String SessionId;

    /**
    * [Subapplication](/document/product/266/14574) ID in VOD. If you need to access a resource in a subapplication, enter the subapplication ID in this field; otherwise, leave it empty.
    */
    @SerializedName("SubAppId")
    @Expose
    private Long SubAppId;

    /**
     * Get Input video type. Valid values: File, Stream. 
     * @return InputType Input video type. Valid values: File, Stream.
     */
    public String getInputType() {
        return this.InputType;
    }

    /**
     * Set Input video type. Valid values: File, Stream.
     * @param InputType Input video type. Valid values: File, Stream.
     */
    public void setInputType(String InputType) {
        this.InputType = InputType;
    }

    /**
     * Get Information of input video file, which is required if `InputType` is `File`. 
     * @return FileInfos Information of input video file, which is required if `InputType` is `File`.
     */
    public EditMediaFileInfo [] getFileInfos() {
        return this.FileInfos;
    }

    /**
     * Set Information of input video file, which is required if `InputType` is `File`.
     * @param FileInfos Information of input video file, which is required if `InputType` is `File`.
     */
    public void setFileInfos(EditMediaFileInfo [] FileInfos) {
        this.FileInfos = FileInfos;
    }

    /**
     * Get Input stream information, which is required if `InputType` is `Stream`. 
     * @return StreamInfos Input stream information, which is required if `InputType` is `Stream`.
     */
    public EditMediaStreamInfo [] getStreamInfos() {
        return this.StreamInfos;
    }

    /**
     * Set Input stream information, which is required if `InputType` is `Stream`.
     * @param StreamInfos Input stream information, which is required if `InputType` is `Stream`.
     */
    public void setStreamInfos(EditMediaStreamInfo [] StreamInfos) {
        this.StreamInfos = StreamInfos;
    }

    /**
     * Get Editing template ID. Valid values: 10, 20. If this parameter is left empty, template 10 will be used.
<li>10: the input with the highest resolution will be used as the benchmark;</li>
<li>20: the input with the highest bitrate will be used as the benchmark;</li> 
     * @return Definition Editing template ID. Valid values: 10, 20. If this parameter is left empty, template 10 will be used.
<li>10: the input with the highest resolution will be used as the benchmark;</li>
<li>20: the input with the highest bitrate will be used as the benchmark;</li>
     */
    public Long getDefinition() {
        return this.Definition;
    }

    /**
     * Set Editing template ID. Valid values: 10, 20. If this parameter is left empty, template 10 will be used.
<li>10: the input with the highest resolution will be used as the benchmark;</li>
<li>20: the input with the highest bitrate will be used as the benchmark;</li>
     * @param Definition Editing template ID. Valid values: 10, 20. If this parameter is left empty, template 10 will be used.
<li>10: the input with the highest resolution will be used as the benchmark;</li>
<li>20: the input with the highest bitrate will be used as the benchmark;</li>
     */
    public void setDefinition(Long Definition) {
        this.Definition = Definition;
    }

    /**
     * Get [Task flow template](/document/product/266/11700#.E4.BB.BB.E5.8A.A1.E6.B5.81.E6.A8.A1.E6.9D.BF) name, which should be entered if you want to perform a task flow on the generated new video. 
     * @return ProcedureName [Task flow template](/document/product/266/11700#.E4.BB.BB.E5.8A.A1.E6.B5.81.E6.A8.A1.E6.9D.BF) name, which should be entered if you want to perform a task flow on the generated new video.
     */
    public String getProcedureName() {
        return this.ProcedureName;
    }

    /**
     * Set [Task flow template](/document/product/266/11700#.E4.BB.BB.E5.8A.A1.E6.B5.81.E6.A8.A1.E6.9D.BF) name, which should be entered if you want to perform a task flow on the generated new video.
     * @param ProcedureName [Task flow template](/document/product/266/11700#.E4.BB.BB.E5.8A.A1.E6.B5.81.E6.A8.A1.E6.9D.BF) name, which should be entered if you want to perform a task flow on the generated new video.
     */
    public void setProcedureName(String ProcedureName) {
        this.ProcedureName = ProcedureName;
    }

    /**
     * Get Configuration of file generated after editing. 
     * @return OutputConfig Configuration of file generated after editing.
     */
    public EditMediaOutputConfig getOutputConfig() {
        return this.OutputConfig;
    }

    /**
     * Set Configuration of file generated after editing.
     * @param OutputConfig Configuration of file generated after editing.
     */
    public void setOutputConfig(EditMediaOutputConfig OutputConfig) {
        this.OutputConfig = OutputConfig;
    }

    /**
     * Get Identifies the source context which is used to pass through the user request information. The `EditMediaComplete` callback and task flow status change callback will return the value of this field. It can contain up to 1,000 characters. 
     * @return SessionContext Identifies the source context which is used to pass through the user request information. The `EditMediaComplete` callback and task flow status change callback will return the value of this field. It can contain up to 1,000 characters.
     */
    public String getSessionContext() {
        return this.SessionContext;
    }

    /**
     * Set Identifies the source context which is used to pass through the user request information. The `EditMediaComplete` callback and task flow status change callback will return the value of this field. It can contain up to 1,000 characters.
     * @param SessionContext Identifies the source context which is used to pass through the user request information. The `EditMediaComplete` callback and task flow status change callback will return the value of this field. It can contain up to 1,000 characters.
     */
    public void setSessionContext(String SessionContext) {
        this.SessionContext = SessionContext;
    }

    /**
     * Get ID used for task deduplication. If there was a request with the same ID in the last day, the current request will return an error. The ID can contain up to 50 characters. If this parameter is left empty or a blank string is entered, no deduplication will be performed. 
     * @return SessionId ID used for task deduplication. If there was a request with the same ID in the last day, the current request will return an error. The ID can contain up to 50 characters. If this parameter is left empty or a blank string is entered, no deduplication will be performed.
     */
    public String getSessionId() {
        return this.SessionId;
    }

    /**
     * Set ID used for task deduplication. If there was a request with the same ID in the last day, the current request will return an error. The ID can contain up to 50 characters. If this parameter is left empty or a blank string is entered, no deduplication will be performed.
     * @param SessionId ID used for task deduplication. If there was a request with the same ID in the last day, the current request will return an error. The ID can contain up to 50 characters. If this parameter is left empty or a blank string is entered, no deduplication will be performed.
     */
    public void setSessionId(String SessionId) {
        this.SessionId = SessionId;
    }

    /**
     * Get [Subapplication](/document/product/266/14574) ID in VOD. If you need to access a resource in a subapplication, enter the subapplication ID in this field; otherwise, leave it empty. 
     * @return SubAppId [Subapplication](/document/product/266/14574) ID in VOD. If you need to access a resource in a subapplication, enter the subapplication ID in this field; otherwise, leave it empty.
     */
    public Long getSubAppId() {
        return this.SubAppId;
    }

    /**
     * Set [Subapplication](/document/product/266/14574) ID in VOD. If you need to access a resource in a subapplication, enter the subapplication ID in this field; otherwise, leave it empty.
     * @param SubAppId [Subapplication](/document/product/266/14574) ID in VOD. If you need to access a resource in a subapplication, enter the subapplication ID in this field; otherwise, leave it empty.
     */
    public void setSubAppId(Long SubAppId) {
        this.SubAppId = SubAppId;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InputType", this.InputType);
        this.setParamArrayObj(map, prefix + "FileInfos.", this.FileInfos);
        this.setParamArrayObj(map, prefix + "StreamInfos.", this.StreamInfos);
        this.setParamSimple(map, prefix + "Definition", this.Definition);
        this.setParamSimple(map, prefix + "ProcedureName", this.ProcedureName);
        this.setParamObj(map, prefix + "OutputConfig.", this.OutputConfig);
        this.setParamSimple(map, prefix + "SessionContext", this.SessionContext);
        this.setParamSimple(map, prefix + "SessionId", this.SessionId);
        this.setParamSimple(map, prefix + "SubAppId", this.SubAppId);

    }
}
