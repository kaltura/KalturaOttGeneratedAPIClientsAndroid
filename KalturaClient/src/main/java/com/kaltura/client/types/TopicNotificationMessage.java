// ===================================================================================================
//                           _  __     _ _
//                          | |/ /__ _| | |_ _  _ _ _ __ _
//                          | ' </ _` | |  _| || | '_/ _` |
//                          |_|\_\__,_|_|\__|\_,_|_| \__,_|
//
// This file is part of the Kaltura Collaborative Media Suite which allows users
// to do with audio, video, and animation what Wiki platfroms allow them to do with
// text.
//
// Copyright (C) 2006-2019  Kaltura Inc.
//
// This program is free software: you can redistribute it and/or modify
// it under the terms of the GNU Affero General Public License as
// published by the Free Software Foundation, either version 3 of the
// License, or (at your option) any later version.
//
// This program is distributed in the hope that it will be useful,
// but WITHOUT ANY WARRANTY; without even the implied warranty of
// MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
// GNU Affero General Public License for more details.
//
// You should have received a copy of the GNU Affero General Public License
// along with this program.  If not, see <http://www.gnu.org/licenses/>.
//
// @ignore
// ===================================================================================================
package com.kaltura.client.types;

import android.os.Parcel;
import com.google.gson.JsonObject;
import com.kaltura.client.Params;
import com.kaltura.client.types.ObjectBase;
import com.kaltura.client.types.Trigger;
import com.kaltura.client.utils.GsonParser;
import com.kaltura.client.utils.request.MultiRequestBuilder;
import com.kaltura.client.utils.request.RequestBuilder;
import java.util.ArrayList;
import java.util.List;

/**
 * This class was generated using exec.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

@SuppressWarnings("serial")
@MultiRequestBuilder.Tokenizer(TopicNotificationMessage.Tokenizer.class)
public class TopicNotificationMessage extends ObjectBase {
	
	public interface Tokenizer extends ObjectBase.Tokenizer {
		String id();
		String message();
		String imageUrl();
		String topicNotificationId();
		Trigger.Tokenizer trigger();
		RequestBuilder.ListTokenizer<Dispatcher.Tokenizer> dispatchers();
	}

	/**
	 * Topic notification message ID
	 */
	private Long id;
	/**
	 * Topic notification message
	 */
	private String message;
	/**
	 * Topic notification message image URL
	 */
	private String imageUrl;
	/**
	 * Topic notification ID
	 */
	private Long topicNotificationId;
	/**
	 * Topic notification message trigger
	 */
	private Trigger trigger;
	/**
	 * Topic notification message dispatchers
	 */
	private List<Dispatcher> dispatchers;

	// id:
	public Long getId(){
		return this.id;
	}
	// message:
	public String getMessage(){
		return this.message;
	}
	public void setMessage(String message){
		this.message = message;
	}

	public void message(String multirequestToken){
		setToken("message", multirequestToken);
	}

	// imageUrl:
	public String getImageUrl(){
		return this.imageUrl;
	}
	public void setImageUrl(String imageUrl){
		this.imageUrl = imageUrl;
	}

	public void imageUrl(String multirequestToken){
		setToken("imageUrl", multirequestToken);
	}

	// topicNotificationId:
	public Long getTopicNotificationId(){
		return this.topicNotificationId;
	}
	public void setTopicNotificationId(Long topicNotificationId){
		this.topicNotificationId = topicNotificationId;
	}

	public void topicNotificationId(String multirequestToken){
		setToken("topicNotificationId", multirequestToken);
	}

	// trigger:
	public Trigger getTrigger(){
		return this.trigger;
	}
	public void setTrigger(Trigger trigger){
		this.trigger = trigger;
	}

	// dispatchers:
	public List<Dispatcher> getDispatchers(){
		return this.dispatchers;
	}
	public void setDispatchers(List<Dispatcher> dispatchers){
		this.dispatchers = dispatchers;
	}


	public TopicNotificationMessage() {
		super();
	}

	public TopicNotificationMessage(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		id = GsonParser.parseLong(jsonObject.get("id"));
		message = GsonParser.parseString(jsonObject.get("message"));
		imageUrl = GsonParser.parseString(jsonObject.get("imageUrl"));
		topicNotificationId = GsonParser.parseLong(jsonObject.get("topicNotificationId"));
		trigger = GsonParser.parseObject(jsonObject.getAsJsonObject("trigger"), Trigger.class);
		dispatchers = GsonParser.parseArray(jsonObject.getAsJsonArray("dispatchers"), Dispatcher.class);

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaTopicNotificationMessage");
		kparams.add("message", this.message);
		kparams.add("imageUrl", this.imageUrl);
		kparams.add("topicNotificationId", this.topicNotificationId);
		kparams.add("trigger", this.trigger);
		kparams.add("dispatchers", this.dispatchers);
		return kparams;
	}


    public static final Creator<TopicNotificationMessage> CREATOR = new Creator<TopicNotificationMessage>() {
        @Override
        public TopicNotificationMessage createFromParcel(Parcel source) {
            return new TopicNotificationMessage(source);
        }

        @Override
        public TopicNotificationMessage[] newArray(int size) {
            return new TopicNotificationMessage[size];
        }
    };

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        super.writeToParcel(dest, flags);
        dest.writeValue(this.id);
        dest.writeString(this.message);
        dest.writeString(this.imageUrl);
        dest.writeValue(this.topicNotificationId);
        dest.writeParcelable(this.trigger, flags);
        if(this.dispatchers != null) {
            dest.writeInt(this.dispatchers.size());
            dest.writeList(this.dispatchers);
        } else {
            dest.writeInt(-1);
        }
    }

    public TopicNotificationMessage(Parcel in) {
        super(in);
        this.id = (Long)in.readValue(Long.class.getClassLoader());
        this.message = in.readString();
        this.imageUrl = in.readString();
        this.topicNotificationId = (Long)in.readValue(Long.class.getClassLoader());
        this.trigger = in.readParcelable(Trigger.class.getClassLoader());
        int dispatchersSize = in.readInt();
        if( dispatchersSize > -1) {
            this.dispatchers = new ArrayList<>();
            in.readList(this.dispatchers, Dispatcher.class.getClassLoader());
        }
    }
}

