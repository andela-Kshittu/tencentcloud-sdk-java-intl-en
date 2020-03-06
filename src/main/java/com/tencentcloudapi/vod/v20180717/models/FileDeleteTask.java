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

public class FileDeleteTask extends AbstractModel{

    /**
    * List of IDs of deleted files.
    */
    @SerializedName("FileIdSet")
    @Expose
    private String [] FileIdSet;

    /**
     * Get List of IDs of deleted files. 
     * @return FileIdSet List of IDs of deleted files.
     */
    public String [] getFileIdSet() {
        return this.FileIdSet;
    }

    /**
     * Set List of IDs of deleted files.
     * @param FileIdSet List of IDs of deleted files.
     */
    public void setFileIdSet(String [] FileIdSet) {
        this.FileIdSet = FileIdSet;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "FileIdSet.", this.FileIdSet);

    }
}
