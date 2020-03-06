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
package com.tencentcloudapi.dcdb.v20180411.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeDBLogFilesRequest extends AbstractModel{

    /**
    * Instance ID in the format of dcdbt-ow7t8lmc.
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Shard ID in the format of shard-7noic7tv
    */
    @SerializedName("ShardId")
    @Expose
    private String ShardId;

    /**
    * Requested log type. Valid values: 1 (binlog); 2 (cold backup); 3 (errlog); 4 (slowlog).
    */
    @SerializedName("Type")
    @Expose
    private Long Type;

    /**
     * Get Instance ID in the format of dcdbt-ow7t8lmc. 
     * @return InstanceId Instance ID in the format of dcdbt-ow7t8lmc.
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Instance ID in the format of dcdbt-ow7t8lmc.
     * @param InstanceId Instance ID in the format of dcdbt-ow7t8lmc.
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get Shard ID in the format of shard-7noic7tv 
     * @return ShardId Shard ID in the format of shard-7noic7tv
     */
    public String getShardId() {
        return this.ShardId;
    }

    /**
     * Set Shard ID in the format of shard-7noic7tv
     * @param ShardId Shard ID in the format of shard-7noic7tv
     */
    public void setShardId(String ShardId) {
        this.ShardId = ShardId;
    }

    /**
     * Get Requested log type. Valid values: 1 (binlog); 2 (cold backup); 3 (errlog); 4 (slowlog). 
     * @return Type Requested log type. Valid values: 1 (binlog); 2 (cold backup); 3 (errlog); 4 (slowlog).
     */
    public Long getType() {
        return this.Type;
    }

    /**
     * Set Requested log type. Valid values: 1 (binlog); 2 (cold backup); 3 (errlog); 4 (slowlog).
     * @param Type Requested log type. Valid values: 1 (binlog); 2 (cold backup); 3 (errlog); 4 (slowlog).
     */
    public void setType(Long Type) {
        this.Type = Type;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "ShardId", this.ShardId);
        this.setParamSimple(map, prefix + "Type", this.Type);

    }
}

