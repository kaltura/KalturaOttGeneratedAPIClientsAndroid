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
// Copyright (C) 2006-2020  Kaltura Inc.
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
import com.kaltura.client.types.SubscribeReference;
import com.kaltura.client.utils.GsonParser;
import com.kaltura.client.utils.request.MultiRequestBuilder;

/**
 * This class was generated using exec.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

@SuppressWarnings("serial")
@MultiRequestBuilder.Tokenizer(TopicNotification.Tokenizer.class)
public class TopicNotification extends ObjectBase {
	
	public interface Tokenizer extends ObjectBase.Tokenizer {
		String id();
		String name();
		String description();
		SubscribeReference.Tokenizer subscribeReference();
	}

	/**
	 * Topic notification ID
	 */
	private Long id;
	/**
	 * Topic notification name
	 */
	private String name;
	/**
	 * Topic notification description
	 */
	private String description;
	/**
	 * Announcement enabled
	 */
	private SubscribeReference subscribeReference;

	// id:
	public Long getId(){
		return this.id;
	}
	// name:
	public String getName(){
		return this.name;
	}
	public void setName(String name){
		this.name = name;
	}

	public void name(String multirequestToken){
		setToken("name", multirequestToken);
	}

	// description:
	public String getDescription(){
		return this.description;
	}
	public void setDescription(String description){
		this.description = description;
	}

	public void description(String multirequestToken){
		setToken("description", multirequestToken);
	}

	// subscribeReference:
	public SubscribeReference getSubscribeReference(){
		return this.subscribeReference;
	}
	public void setSubscribeReference(SubscribeReference subscribeReference){
		this.subscribeReference = subscribeReference;
	}


	public TopicNotification() {
		super();
	}

	public TopicNotification(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		id = GsonParser.parseLong(jsonObject.get("id"));
		name = GsonParser.parseString(jsonObject.get("name"));
		description = GsonParser.parseString(jsonObject.get("description"));
		subscribeReference = GsonParser.parseObject(jsonObject.getAsJsonObject("subscribeReference"), SubscribeReference.class);

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaTopicNotification");
		kparams.add("name", this.name);
		kparams.add("description", this.description);
		kparams.add("subscribeReference", this.subscribeReference);
		return kparams;
	}


    public static final Creator<TopicNotification> CREATOR = new Creator<TopicNotification>() {
        @Override
        public TopicNotification createFromParcel(Parcel source) {
            return new TopicNotification(source);
        }

        @Override
        public TopicNotification[] newArray(int size) {
            return new TopicNotification[size];
        }
    };

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        super.writeToParcel(dest, flags);
        dest.writeValue(this.id);
        dest.writeString(this.name);
        dest.writeString(this.description);
        dest.writeParcelable(this.subscribeReference, flags);
    }

    public TopicNotification(Parcel in) {
        super(in);
        this.id = (Long)in.readValue(Long.class.getClassLoader());
        this.name = in.readString();
        this.description = in.readString();
        this.subscribeReference = in.readParcelable(SubscribeReference.class.getClassLoader());
    }
}

