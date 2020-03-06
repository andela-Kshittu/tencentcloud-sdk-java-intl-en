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
package com.tencentcloudapi.cloudaudit.v20190319.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ListAuditsResponse extends AbstractModel{

    /**
    * Queries the summary set of tracking sets
    */
    @SerializedName("AuditSummarys")
    @Expose
    private AuditSummary [] AuditSummarys;

    /**
    * Unique ID of the request. Each request returns a unique ID. The RequestId is required to troubleshoot issues.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Queries the summary set of tracking sets 
     * @return AuditSummarys Queries the summary set of tracking sets
     */
    public AuditSummary [] getAuditSummarys() {
        return this.AuditSummarys;
    }

    /**
     * Set Queries the summary set of tracking sets
     * @param AuditSummarys Queries the summary set of tracking sets
     */
    public void setAuditSummarys(AuditSummary [] AuditSummarys) {
        this.AuditSummarys = AuditSummarys;
    }

    /**
     * Get Unique ID of the request. Each request returns a unique ID. The RequestId is required to troubleshoot issues. 
     * @return RequestId Unique ID of the request. Each request returns a unique ID. The RequestId is required to troubleshoot issues.
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set Unique ID of the request. Each request returns a unique ID. The RequestId is required to troubleshoot issues.
     * @param RequestId Unique ID of the request. Each request returns a unique ID. The RequestId is required to troubleshoot issues.
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "AuditSummarys.", this.AuditSummarys);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

