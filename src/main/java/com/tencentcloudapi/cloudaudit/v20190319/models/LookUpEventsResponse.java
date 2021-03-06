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

public class LookUpEventsResponse extends AbstractModel{

    /**
    * Logset
    */
    @SerializedName("Events")
    @Expose
    private Event [] Events;

    /**
    * Whether the logset ends
    */
    @SerializedName("ListOver")
    @Expose
    private Boolean ListOver;

    /**
    * Credential for viewing more logs
    */
    @SerializedName("NextToken")
    @Expose
    private String NextToken;

    /**
    * Unique ID of the request. Each request returns a unique ID. The RequestId is required to troubleshoot issues.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Logset 
     * @return Events Logset
     */
    public Event [] getEvents() {
        return this.Events;
    }

    /**
     * Set Logset
     * @param Events Logset
     */
    public void setEvents(Event [] Events) {
        this.Events = Events;
    }

    /**
     * Get Whether the logset ends 
     * @return ListOver Whether the logset ends
     */
    public Boolean getListOver() {
        return this.ListOver;
    }

    /**
     * Set Whether the logset ends
     * @param ListOver Whether the logset ends
     */
    public void setListOver(Boolean ListOver) {
        this.ListOver = ListOver;
    }

    /**
     * Get Credential for viewing more logs 
     * @return NextToken Credential for viewing more logs
     */
    public String getNextToken() {
        return this.NextToken;
    }

    /**
     * Set Credential for viewing more logs
     * @param NextToken Credential for viewing more logs
     */
    public void setNextToken(String NextToken) {
        this.NextToken = NextToken;
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
        this.setParamArrayObj(map, prefix + "Events.", this.Events);
        this.setParamSimple(map, prefix + "ListOver", this.ListOver);
        this.setParamSimple(map, prefix + "NextToken", this.NextToken);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

