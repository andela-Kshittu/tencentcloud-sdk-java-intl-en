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
package com.tencentcloudapi.mps.v20190612.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CosInputInfo extends AbstractModel{

    /**
    * Name of the COS bucket where a video processing object file is located, such as `TopRankVideo-125xxx88`.
    */
    @SerializedName("Bucket")
    @Expose
    private String Bucket;

    /**
    * Region of the COS bucket where a video processing object file is located, such as `ap-chongqing`.
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * Path to an input object file for video processing, such as `/movie/201907/WildAnimal.mov`.
    */
    @SerializedName("Object")
    @Expose
    private String Object;

    /**
     * Get Name of the COS bucket where a video processing object file is located, such as `TopRankVideo-125xxx88`. 
     * @return Bucket Name of the COS bucket where a video processing object file is located, such as `TopRankVideo-125xxx88`.
     */
    public String getBucket() {
        return this.Bucket;
    }

    /**
     * Set Name of the COS bucket where a video processing object file is located, such as `TopRankVideo-125xxx88`.
     * @param Bucket Name of the COS bucket where a video processing object file is located, such as `TopRankVideo-125xxx88`.
     */
    public void setBucket(String Bucket) {
        this.Bucket = Bucket;
    }

    /**
     * Get Region of the COS bucket where a video processing object file is located, such as `ap-chongqing`. 
     * @return Region Region of the COS bucket where a video processing object file is located, such as `ap-chongqing`.
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set Region of the COS bucket where a video processing object file is located, such as `ap-chongqing`.
     * @param Region Region of the COS bucket where a video processing object file is located, such as `ap-chongqing`.
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get Path to an input object file for video processing, such as `/movie/201907/WildAnimal.mov`. 
     * @return Object Path to an input object file for video processing, such as `/movie/201907/WildAnimal.mov`.
     */
    public String getObject() {
        return this.Object;
    }

    /**
     * Set Path to an input object file for video processing, such as `/movie/201907/WildAnimal.mov`.
     * @param Object Path to an input object file for video processing, such as `/movie/201907/WildAnimal.mov`.
     */
    public void setObject(String Object) {
        this.Object = Object;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Bucket", this.Bucket);
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "Object", this.Object);

    }
}

