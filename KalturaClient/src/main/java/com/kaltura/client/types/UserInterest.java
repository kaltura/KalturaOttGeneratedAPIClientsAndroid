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
import com.kaltura.client.types.UserInterestTopic;
import com.kaltura.client.utils.GsonParser;
import com.kaltura.client.utils.request.MultiRequestBuilder;

/**
 * This class was generated using clients-generator\exec.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

/**
 * User Interest
 */
@SuppressWarnings("serial")
@MultiRequestBuilder.Tokenizer(UserInterest.Tokenizer.class)
public class UserInterest extends ObjectBase {
	
	public interface Tokenizer extends ObjectBase.Tokenizer {
		String id();
		UserInterestTopic.Tokenizer topic();
	}

	/**
	 * Identifier
	 */
	private String id;
	/**
	 * Topic
	 */
	private UserInterestTopic topic;

	// id:
	public String getId(){
		return this.id;
	}
	public void setId(String id){
		this.id = id;
	}

	public void id(String multirequestToken){
		setToken("id", multirequestToken);
	}

	// topic:
	public UserInterestTopic getTopic(){
		return this.topic;
	}
	public void setTopic(UserInterestTopic topic){
		this.topic = topic;
	}


	public UserInterest() {
		super();
	}

	public UserInterest(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		id = GsonParser.parseString(jsonObject.get("id"));
		topic = GsonParser.parseObject(jsonObject.getAsJsonObject("topic"), UserInterestTopic.class);

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaUserInterest");
		kparams.add("id", this.id);
		kparams.add("topic", this.topic);
		return kparams;
	}


    public static final Creator<UserInterest> CREATOR = new Creator<UserInterest>() {
        @Override
        public UserInterest createFromParcel(Parcel source) {
            return new UserInterest(source);
        }

        @Override
        public UserInterest[] newArray(int size) {
            return new UserInterest[size];
        }
    };

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        super.writeToParcel(dest, flags);
        dest.writeString(this.id);
        dest.writeParcelable(this.topic, flags);
    }

    public UserInterest(Parcel in) {
        super(in);
        this.id = in.readString();
        this.topic = in.readParcelable(UserInterestTopic.class.getClassLoader());
    }
}

