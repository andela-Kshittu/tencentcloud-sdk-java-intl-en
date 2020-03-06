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

public class DescribeWordSamplesRequest extends AbstractModel{

    /**
    * <b>Keyword use case filter. Valid values:</b>
1. Recognition.Ocr: OCR-based content recognition;
2. Recognition.Asr: ASR-based content recognition;
3. Review.Ocr: OCR-based content audit;
4. Review.Asr: ASR-based content audit;
<b>These values can be merged as follows:</b>
5. Recognition: ASR-based and OCR-based content recognition, which is equivalent to 1+2 above;
6. Review: ASR-based and OCR-based content audit, which is equivalent to 3+4 above;
Multiple elements can be selected, and the relationship between them is "or", i.e., any keyword use case that contains any element in this field set will be deemed eligible.
    */
    @SerializedName("Usages")
    @Expose
    private String [] Usages;

    /**
    * Keyword filter. Array length limit: 100 words.
    */
    @SerializedName("Keywords")
    @Expose
    private String [] Keywords;

    /**
    * Tag filter. Array length limit: 20 words.
    */
    @SerializedName("Tags")
    @Expose
    private String [] Tags;

    /**
    * Paging offset. Default value: 0.
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * Number of returned entries. Default value: 100. Maximum value: 100.
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
     * Get <b>Keyword use case filter. Valid values:</b>
1. Recognition.Ocr: OCR-based content recognition;
2. Recognition.Asr: ASR-based content recognition;
3. Review.Ocr: OCR-based content audit;
4. Review.Asr: ASR-based content audit;
<b>These values can be merged as follows:</b>
5. Recognition: ASR-based and OCR-based content recognition, which is equivalent to 1+2 above;
6. Review: ASR-based and OCR-based content audit, which is equivalent to 3+4 above;
Multiple elements can be selected, and the relationship between them is "or", i.e., any keyword use case that contains any element in this field set will be deemed eligible. 
     * @return Usages <b>Keyword use case filter. Valid values:</b>
1. Recognition.Ocr: OCR-based content recognition;
2. Recognition.Asr: ASR-based content recognition;
3. Review.Ocr: OCR-based content audit;
4. Review.Asr: ASR-based content audit;
<b>These values can be merged as follows:</b>
5. Recognition: ASR-based and OCR-based content recognition, which is equivalent to 1+2 above;
6. Review: ASR-based and OCR-based content audit, which is equivalent to 3+4 above;
Multiple elements can be selected, and the relationship between them is "or", i.e., any keyword use case that contains any element in this field set will be deemed eligible.
     */
    public String [] getUsages() {
        return this.Usages;
    }

    /**
     * Set <b>Keyword use case filter. Valid values:</b>
1. Recognition.Ocr: OCR-based content recognition;
2. Recognition.Asr: ASR-based content recognition;
3. Review.Ocr: OCR-based content audit;
4. Review.Asr: ASR-based content audit;
<b>These values can be merged as follows:</b>
5. Recognition: ASR-based and OCR-based content recognition, which is equivalent to 1+2 above;
6. Review: ASR-based and OCR-based content audit, which is equivalent to 3+4 above;
Multiple elements can be selected, and the relationship between them is "or", i.e., any keyword use case that contains any element in this field set will be deemed eligible.
     * @param Usages <b>Keyword use case filter. Valid values:</b>
1. Recognition.Ocr: OCR-based content recognition;
2. Recognition.Asr: ASR-based content recognition;
3. Review.Ocr: OCR-based content audit;
4. Review.Asr: ASR-based content audit;
<b>These values can be merged as follows:</b>
5. Recognition: ASR-based and OCR-based content recognition, which is equivalent to 1+2 above;
6. Review: ASR-based and OCR-based content audit, which is equivalent to 3+4 above;
Multiple elements can be selected, and the relationship between them is "or", i.e., any keyword use case that contains any element in this field set will be deemed eligible.
     */
    public void setUsages(String [] Usages) {
        this.Usages = Usages;
    }

    /**
     * Get Keyword filter. Array length limit: 100 words. 
     * @return Keywords Keyword filter. Array length limit: 100 words.
     */
    public String [] getKeywords() {
        return this.Keywords;
    }

    /**
     * Set Keyword filter. Array length limit: 100 words.
     * @param Keywords Keyword filter. Array length limit: 100 words.
     */
    public void setKeywords(String [] Keywords) {
        this.Keywords = Keywords;
    }

    /**
     * Get Tag filter. Array length limit: 20 words. 
     * @return Tags Tag filter. Array length limit: 20 words.
     */
    public String [] getTags() {
        return this.Tags;
    }

    /**
     * Set Tag filter. Array length limit: 20 words.
     * @param Tags Tag filter. Array length limit: 20 words.
     */
    public void setTags(String [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get Paging offset. Default value: 0. 
     * @return Offset Paging offset. Default value: 0.
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set Paging offset. Default value: 0.
     * @param Offset Paging offset. Default value: 0.
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get Number of returned entries. Default value: 100. Maximum value: 100. 
     * @return Limit Number of returned entries. Default value: 100. Maximum value: 100.
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Number of returned entries. Default value: 100. Maximum value: 100.
     * @param Limit Number of returned entries. Default value: 100. Maximum value: 100.
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "Usages.", this.Usages);
        this.setParamArraySimple(map, prefix + "Keywords.", this.Keywords);
        this.setParamArraySimple(map, prefix + "Tags.", this.Tags);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);

    }
}

