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

public class DescribeLiveForbidStreamListResponse extends AbstractModel{

    /**
    * Total number of eligible ones.
    */
    @SerializedName("TotalNum")
    @Expose
    private Long TotalNum;

    /**
    * Total number of pages.
    */
    @SerializedName("TotalPage")
    @Expose
    private Long TotalPage;

    /**
    * Page number.
    */
    @SerializedName("PageNum")
    @Expose
    private Long PageNum;

    /**
    * Number of entries displayed per page.
    */
    @SerializedName("PageSize")
    @Expose
    private Long PageSize;

    /**
    * List of forbidden streams.
    */
    @SerializedName("ForbidStreamList")
    @Expose
    private ForbidStreamInfo [] ForbidStreamList;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Total number of eligible ones. 
     * @return TotalNum Total number of eligible ones.
     */
    public Long getTotalNum() {
        return this.TotalNum;
    }

    /**
     * Set Total number of eligible ones.
     * @param TotalNum Total number of eligible ones.
     */
    public void setTotalNum(Long TotalNum) {
        this.TotalNum = TotalNum;
    }

    /**
     * Get Total number of pages. 
     * @return TotalPage Total number of pages.
     */
    public Long getTotalPage() {
        return this.TotalPage;
    }

    /**
     * Set Total number of pages.
     * @param TotalPage Total number of pages.
     */
    public void setTotalPage(Long TotalPage) {
        this.TotalPage = TotalPage;
    }

    /**
     * Get Page number. 
     * @return PageNum Page number.
     */
    public Long getPageNum() {
        return this.PageNum;
    }

    /**
     * Set Page number.
     * @param PageNum Page number.
     */
    public void setPageNum(Long PageNum) {
        this.PageNum = PageNum;
    }

    /**
     * Get Number of entries displayed per page. 
     * @return PageSize Number of entries displayed per page.
     */
    public Long getPageSize() {
        return this.PageSize;
    }

    /**
     * Set Number of entries displayed per page.
     * @param PageSize Number of entries displayed per page.
     */
    public void setPageSize(Long PageSize) {
        this.PageSize = PageSize;
    }

    /**
     * Get List of forbidden streams. 
     * @return ForbidStreamList List of forbidden streams.
     */
    public ForbidStreamInfo [] getForbidStreamList() {
        return this.ForbidStreamList;
    }

    /**
     * Set List of forbidden streams.
     * @param ForbidStreamList List of forbidden streams.
     */
    public void setForbidStreamList(ForbidStreamInfo [] ForbidStreamList) {
        this.ForbidStreamList = ForbidStreamList;
    }

    /**
     * Get The unique request ID, which is returned for each request. RequestId is required for locating a problem. 
     * @return RequestId The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     * @param RequestId The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TotalNum", this.TotalNum);
        this.setParamSimple(map, prefix + "TotalPage", this.TotalPage);
        this.setParamSimple(map, prefix + "PageNum", this.PageNum);
        this.setParamSimple(map, prefix + "PageSize", this.PageSize);
        this.setParamArrayObj(map, prefix + "ForbidStreamList.", this.ForbidStreamList);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}
