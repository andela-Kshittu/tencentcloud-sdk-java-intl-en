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

public class MediaProcessTaskAdaptiveDynamicStreamingResult extends AbstractModel{

    /**
    * Task status. Valid values: PROCESSING, SUCCESS, FAIL.
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * Error code. 0: success; other values: failure.
<li>40000: invalid input parameter. Please check it;</li>
<li>60000: invalid source file (e.g., video data is corrupted). Please check whether the source file is normal;</li>
<li>70000: internal service error. Please try again.</li>
    */
    @SerializedName("ErrCode")
    @Expose
    private Long ErrCode;

    /**
    * Error message.
    */
    @SerializedName("Message")
    @Expose
    private String Message;

    /**
    * Input of adaptive bitrate streaming task.
    */
    @SerializedName("Input")
    @Expose
    private AdaptiveDynamicStreamingTaskInput Input;

    /**
    * Output of adaptive bitrate streaming task.
    */
    @SerializedName("Output")
    @Expose
    private AdaptiveDynamicStreamingInfoItem Output;

    /**
     * Get Task status. Valid values: PROCESSING, SUCCESS, FAIL. 
     * @return Status Task status. Valid values: PROCESSING, SUCCESS, FAIL.
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set Task status. Valid values: PROCESSING, SUCCESS, FAIL.
     * @param Status Task status. Valid values: PROCESSING, SUCCESS, FAIL.
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get Error code. 0: success; other values: failure.
<li>40000: invalid input parameter. Please check it;</li>
<li>60000: invalid source file (e.g., video data is corrupted). Please check whether the source file is normal;</li>
<li>70000: internal service error. Please try again.</li> 
     * @return ErrCode Error code. 0: success; other values: failure.
<li>40000: invalid input parameter. Please check it;</li>
<li>60000: invalid source file (e.g., video data is corrupted). Please check whether the source file is normal;</li>
<li>70000: internal service error. Please try again.</li>
     */
    public Long getErrCode() {
        return this.ErrCode;
    }

    /**
     * Set Error code. 0: success; other values: failure.
<li>40000: invalid input parameter. Please check it;</li>
<li>60000: invalid source file (e.g., video data is corrupted). Please check whether the source file is normal;</li>
<li>70000: internal service error. Please try again.</li>
     * @param ErrCode Error code. 0: success; other values: failure.
<li>40000: invalid input parameter. Please check it;</li>
<li>60000: invalid source file (e.g., video data is corrupted). Please check whether the source file is normal;</li>
<li>70000: internal service error. Please try again.</li>
     */
    public void setErrCode(Long ErrCode) {
        this.ErrCode = ErrCode;
    }

    /**
     * Get Error message. 
     * @return Message Error message.
     */
    public String getMessage() {
        return this.Message;
    }

    /**
     * Set Error message.
     * @param Message Error message.
     */
    public void setMessage(String Message) {
        this.Message = Message;
    }

    /**
     * Get Input of adaptive bitrate streaming task. 
     * @return Input Input of adaptive bitrate streaming task.
     */
    public AdaptiveDynamicStreamingTaskInput getInput() {
        return this.Input;
    }

    /**
     * Set Input of adaptive bitrate streaming task.
     * @param Input Input of adaptive bitrate streaming task.
     */
    public void setInput(AdaptiveDynamicStreamingTaskInput Input) {
        this.Input = Input;
    }

    /**
     * Get Output of adaptive bitrate streaming task. 
     * @return Output Output of adaptive bitrate streaming task.
     */
    public AdaptiveDynamicStreamingInfoItem getOutput() {
        return this.Output;
    }

    /**
     * Set Output of adaptive bitrate streaming task.
     * @param Output Output of adaptive bitrate streaming task.
     */
    public void setOutput(AdaptiveDynamicStreamingInfoItem Output) {
        this.Output = Output;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "ErrCode", this.ErrCode);
        this.setParamSimple(map, prefix + "Message", this.Message);
        this.setParamObj(map, prefix + "Input.", this.Input);
        this.setParamObj(map, prefix + "Output.", this.Output);

    }
}

