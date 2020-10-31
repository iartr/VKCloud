/**
 * The MIT License (MIT)
 *
 * Copyright (c) 2019 vk.com
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
*/
// *********************************************************************
// THIS FILE IS AUTO GENERATED!
// DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING.
// *********************************************************************
package com.example.vkapi.docs.methods

import com.vk.sdk.api.GsonHolder
import com.vk.sdk.api.docs.dto.DocsGetType
import com.example.vkapi.docs.responses.DocsGetResponse
import com.example.vkapi.ApiRequestBase
import kotlin.Boolean
import kotlin.Int
import org.json.JSONObject

/**
 * Returns detailed information about user or community documents.
 * @param count Number of documents to return. By default, all documents. minimum 0
 * @param offset Offset needed to return a specific subset of documents. minimum 0
 * @param type  default 0 minimum 0
 * @param ownerId ID of the user or community that owns the documents. Use a negative value to
 * designate a community ID. 
 * @param returnTags  default false
 */
class DocsGet(
    private val count: Int? = null,
    private val offset: Int? = null,
    private val type: DocsGetType? = null,
    private val ownerId: Int? = null,
    private val returnTags: Boolean? = null
) : ApiRequestBase<DocsGetResponse>(methodName = "docs.get") {
    init {
        count?.let { value ->
            addParam("count", value)
        }
        offset?.let { value ->
            addParam("offset", value)
        }
        type?.let { value ->
            addParam("type", value.value)
        }
        ownerId?.let { value ->
            addParam("owner_id", value)
        }
        returnTags?.let { value ->
            addParam("return_tags", if (value) 1 else 0)
        }
    }

    override fun parse(r: JSONObject): DocsGetResponse {
//        return GsonBuilder().create().fromJson(r.toString(), DocsGetResponse::class.java)
        return GsonHolder.gson.fromJson(r.toString(), DocsGetResponse::class.java)
    }
}
