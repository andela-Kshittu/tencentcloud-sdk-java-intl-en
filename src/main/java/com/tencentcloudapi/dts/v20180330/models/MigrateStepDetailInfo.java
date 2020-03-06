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
package com.tencentcloudapi.dts.v20180330.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class MigrateStepDetailInfo extends AbstractModel{

    /**
    * Step number
    */
    @SerializedName("StepNo")
    @Expose
    private Long StepNo;

    /**
    * Step name
    */
    @SerializedName("StepName")
    @Expose
    private String StepName;

    /**
    * Step ID
    */
    @SerializedName("StepId")
    @Expose
    private String StepId;

    /**
    * Step status. Value range: 0 (default), 1 (succeeded), 2 (failed), 3 (in progress), 4 (not started)
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
     * Get Step number 
     * @return StepNo Step number
     */
    public Long getStepNo() {
        return this.StepNo;
    }

    /**
     * Set Step number
     * @param StepNo Step number
     */
    public void setStepNo(Long StepNo) {
        this.StepNo = StepNo;
    }

    /**
     * Get Step name 
     * @return StepName Step name
     */
    public String getStepName() {
        return this.StepName;
    }

    /**
     * Set Step name
     * @param StepName Step name
     */
    public void setStepName(String StepName) {
        this.StepName = StepName;
    }

    /**
     * Get Step ID 
     * @return StepId Step ID
     */
    public String getStepId() {
        return this.StepId;
    }

    /**
     * Set Step ID
     * @param StepId Step ID
     */
    public void setStepId(String StepId) {
        this.StepId = StepId;
    }

    /**
     * Get Step status. Value range: 0 (default), 1 (succeeded), 2 (failed), 3 (in progress), 4 (not started) 
     * @return Status Step status. Value range: 0 (default), 1 (succeeded), 2 (failed), 3 (in progress), 4 (not started)
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set Step status. Value range: 0 (default), 1 (succeeded), 2 (failed), 3 (in progress), 4 (not started)
     * @param Status Step status. Value range: 0 (default), 1 (succeeded), 2 (failed), 3 (in progress), 4 (not started)
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "StepNo", this.StepNo);
        this.setParamSimple(map, prefix + "StepName", this.StepName);
        this.setParamSimple(map, prefix + "StepId", this.StepId);
        this.setParamSimple(map, prefix + "Status", this.Status);

    }
}

