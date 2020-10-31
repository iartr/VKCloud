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
package com.vk.sdk.api.messages.methods

import com.example.vkapi.ApiRequestBase
import com.vk.sdk.api.GsonHolder
import com.vk.sdk.api.messages.dto.MessagesGetByConversationMessageIdResponseDto
import com.vk.sdk.api.messages.responses.MessagesGetByConversationMessageIdResponse
import com.vk.sdk.api.users.dto.UsersFields
import kotlin.Boolean
import kotlin.Int
import kotlin.collections.List
import org.json.JSONObject

/**
 * Returns messages by their IDs within the conversation.
 * @param peerId Destination ID. "For user: 'User ID', e.g. '12345'. For chat: '2000000000' +
 * 'chat_id', e.g. '2000000001'. For community: '- community ID', e.g. '-12345'. " 
 * @param conversationMessageIds Conversation message IDs. 
 * @param extended Information whether the response should be extended 
 * @param fields Profile fields to return. 
 * @param groupId Group ID (for group messages with group access token) minimum 0
 */
class MessagesGetByConversationMessageId(
    private val peerId: Int,
    private val conversationMessageIds: List<Int>,
    private val extended: Boolean? = null,
    private val fields: List<UsersFields>? = null,
    private val groupId: Int? = null
) : ApiRequestBase<MessagesGetByConversationMessageIdResponseDto>(methodName =
        "messages.getByConversationMessageId") {
    init {
        addParam("peer_id", peerId)
        addParam("conversation_message_ids", conversationMessageIds)
        extended?.let { value ->
            addParam("extended", if (value) 1 else 0)
        }
        fields?.let { value ->
            addParam("fields", value)
        }
        groupId?.let { value ->
            addParam("group_id", value)
        }
    }

    override fun parse(r: JSONObject): MessagesGetByConversationMessageIdResponseDto =
            GsonHolder.gson.fromJson(r.toString(),
            MessagesGetByConversationMessageIdResponse::class.java).response
}
