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
import com.kaltura.client.utils.GsonParser;
import com.kaltura.client.utils.request.MultiRequestBuilder;

/**
 * This class was generated using exec.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

/**
 * This log entry records an event related to a user&amp;#39;s interaction with the
  Kaltura TV Platform (KTP). The event may be initiated directly by the user or by
  the platform itself in response to user activity.
 */
@SuppressWarnings("serial")
@MultiRequestBuilder.Tokenizer(UserLog.Tokenizer.class)
public class UserLog extends ObjectBase {
	
	public interface Tokenizer extends ObjectBase.Tokenizer {
		String id();
		String createDate();
		String userId();
		String message();
	}

	/**
	 * UserLog entry unique identifier
	 */
	private Long id;
	/**
	 * The log created date in epoch
	 */
	private Long createDate;
	/**
	 * A valid user unique identifier
	 */
	private Integer userId;
	/**
	 * Log message
	 */
	private String message;

	// id:
	public Long getId(){
		return this.id;
	}
	// createDate:
	public Long getCreateDate(){
		return this.createDate;
	}
	// userId:
	public Integer getUserId(){
		return this.userId;
	}
	// message:
	public String getMessage(){
		return this.message;
	}

	public UserLog() {
		super();
	}

	public UserLog(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		id = GsonParser.parseLong(jsonObject.get("id"));
		createDate = GsonParser.parseLong(jsonObject.get("createDate"));
		userId = GsonParser.parseInt(jsonObject.get("userId"));
		message = GsonParser.parseString(jsonObject.get("message"));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaUserLog");
		return kparams;
	}


    public static final Creator<UserLog> CREATOR = new Creator<UserLog>() {
        @Override
        public UserLog createFromParcel(Parcel source) {
            return new UserLog(source);
        }

        @Override
        public UserLog[] newArray(int size) {
            return new UserLog[size];
        }
    };

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        super.writeToParcel(dest, flags);
        dest.writeValue(this.id);
        dest.writeValue(this.createDate);
        dest.writeValue(this.userId);
        dest.writeString(this.message);
    }

    public UserLog(Parcel in) {
        super(in);
        this.id = (Long)in.readValue(Long.class.getClassLoader());
        this.createDate = (Long)in.readValue(Long.class.getClassLoader());
        this.userId = (Integer)in.readValue(Integer.class.getClassLoader());
        this.message = in.readString();
    }
}

