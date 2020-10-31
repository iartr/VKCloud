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
package com.vk.sdk.api.leads.methods

import com.example.vkapi.ApiRequestBase
import com.vk.sdk.api.GsonHolder
import com.vk.sdk.api.leads.dto.LeadsLead
import com.vk.sdk.api.leads.responses.LeadsGetStatsResponse
import kotlin.Int
import kotlin.String
import org.json.JSONObject

/**
 * Returns lead stats data.
 * @param leadId Lead ID. minimum 0
 * @param secret Secret key obtained from the lead testing interface. 
 * @param dateStart Day to start stats from (YYYY_MM_DD, e.g.2011-09-17). 
 * @param dateEnd Day to finish stats (YYYY_MM_DD, e.g.2011-09-17). 
 */
class LeadsGetStats(
    private val leadId: Int,
    private val secret: String? = null,
    private val dateStart: String? = null,
    private val dateEnd: String? = null
) : ApiRequestBase<LeadsLead>(methodName = "leads.getStats") {
    init {
        addParam("lead_id", leadId)
        secret?.let { value ->
            addParam("secret", value)
        }
        dateStart?.let { value ->
            addParam("date_start", value)
        }
        dateEnd?.let { value ->
            addParam("date_end", value)
        }
    }

    override fun parse(r: JSONObject): LeadsLead = GsonHolder.gson.fromJson(r.toString(),
            LeadsGetStatsResponse::class.java).response
}
