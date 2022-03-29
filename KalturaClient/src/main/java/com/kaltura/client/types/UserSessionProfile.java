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
import com.kaltura.client.types.UserSessionProfileExpression;
import com.kaltura.client.utils.GsonParser;
import com.kaltura.client.utils.request.MultiRequestBuilder;

/**
 * This class was generated using exec.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

/**
 * User Session Profile
 */
@SuppressWarnings("serial")
@MultiRequestBuilder.Tokenizer(UserSessionProfile.Tokenizer.class)
public class UserSessionProfile extends ObjectBase {
	
	public interface Tokenizer extends ObjectBase.Tokenizer {
		String id();
		String name();
		UserSessionProfileExpression.Tokenizer expression();
	}

	/**
	 * The user session profile id.
	 */
	private Long id;
	/**
	 * The user session profile name for presentation.
	 */
	private String name;
	/**
	 * expression
	 */
	private UserSessionProfileExpression expression;

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

	// expression:
	public UserSessionProfileExpression getExpression(){
		return this.expression;
	}
	public void setExpression(UserSessionProfileExpression expression){
		this.expression = expression;
	}


	public UserSessionProfile() {
		super();
	}

	public UserSessionProfile(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		id = GsonParser.parseLong(jsonObject.get("id"));
		name = GsonParser.parseString(jsonObject.get("name"));
		expression = GsonParser.parseObject(jsonObject.getAsJsonObject("expression"), UserSessionProfileExpression.class);

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaUserSessionProfile");
		kparams.add("name", this.name);
		kparams.add("expression", this.expression);
		return kparams;
	}


    public static final Creator<UserSessionProfile> CREATOR = new Creator<UserSessionProfile>() {
        @Override
        public UserSessionProfile createFromParcel(Parcel source) {
            return new UserSessionProfile(source);
        }

        @Override
        public UserSessionProfile[] newArray(int size) {
            return new UserSessionProfile[size];
        }
    };

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        super.writeToParcel(dest, flags);
        dest.writeValue(this.id);
        dest.writeString(this.name);
        dest.writeParcelable(this.expression, flags);
    }

    public UserSessionProfile(Parcel in) {
        super(in);
        this.id = (Long)in.readValue(Long.class.getClassLoader());
        this.name = in.readString();
        this.expression = in.readParcelable(UserSessionProfileExpression.class.getClassLoader());
    }
}

