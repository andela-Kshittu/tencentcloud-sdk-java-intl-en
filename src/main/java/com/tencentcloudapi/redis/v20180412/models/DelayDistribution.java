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
package com.tencentcloudapi.redis.v20180412.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DelayDistribution extends AbstractModel{

    /**
    * Distribution ladder
    */
    @SerializedName("Ladder")
    @Expose
    private Long Ladder;

    /**
    * Size
    */
    @SerializedName("Size")
    @Expose
    private Long Size;

    /**
     * Get Distribution ladder 
     * @return Ladder Distribution ladder
     */
    public Long getLadder() {
        return this.Ladder;
    }

    /**
     * Set Distribution ladder
     * @param Ladder Distribution ladder
     */
    public void setLadder(Long Ladder) {
        this.Ladder = Ladder;
    }

    /**
     * Get Size 
     * @return Size Size
     */
    public Long getSize() {
        return this.Size;
    }

    /**
     * Set Size
     * @param Size Size
     */
    public void setSize(Long Size) {
        this.Size = Size;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Ladder", this.Ladder);
        this.setParamSimple(map, prefix + "Size", this.Size);

    }
}
