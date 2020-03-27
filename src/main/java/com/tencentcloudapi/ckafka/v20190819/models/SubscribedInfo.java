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
package com.tencentcloudapi.ckafka.v20190819.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SubscribedInfo extends AbstractModel{

    /**
    * Subscribed topic name
    */
    @SerializedName("TopicName")
    @Expose
    private String TopicName;

    /**
    * Subscribed partition
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Partition")
    @Expose
    private Long [] Partition;

    /**
    * Partition offset information
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("PartitionOffset")
    @Expose
    private PartitionOffset [] PartitionOffset;

    /**
     * Get Subscribed topic name 
     * @return TopicName Subscribed topic name
     */
    public String getTopicName() {
        return this.TopicName;
    }

    /**
     * Set Subscribed topic name
     * @param TopicName Subscribed topic name
     */
    public void setTopicName(String TopicName) {
        this.TopicName = TopicName;
    }

    /**
     * Get Subscribed partition
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return Partition Subscribed partition
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public Long [] getPartition() {
        return this.Partition;
    }

    /**
     * Set Subscribed partition
Note: this field may return null, indicating that no valid values can be obtained.
     * @param Partition Subscribed partition
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setPartition(Long [] Partition) {
        this.Partition = Partition;
    }

    /**
     * Get Partition offset information
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return PartitionOffset Partition offset information
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public PartitionOffset [] getPartitionOffset() {
        return this.PartitionOffset;
    }

    /**
     * Set Partition offset information
Note: this field may return null, indicating that no valid values can be obtained.
     * @param PartitionOffset Partition offset information
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setPartitionOffset(PartitionOffset [] PartitionOffset) {
        this.PartitionOffset = PartitionOffset;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TopicName", this.TopicName);
        this.setParamArraySimple(map, prefix + "Partition.", this.Partition);
        this.setParamArrayObj(map, prefix + "PartitionOffset.", this.PartitionOffset);

    }
}

