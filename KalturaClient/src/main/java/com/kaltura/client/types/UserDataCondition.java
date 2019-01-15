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
import com.kaltura.client.utils.GsonParser;
import com.kaltura.client.utils.request.MultiRequestBuilder;

/**
 * This class was generated using clients-generator\exec.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

/**
 * User data condition for segmentation
 */
@SuppressWarnings("serial")
@MultiRequestBuilder.Tokenizer(UserDataCondition.Tokenizer.class)
public class UserDataCondition extends BaseSegmentCondition {
	
	public interface Tokenizer extends BaseSegmentCondition.Tokenizer {
		String field();
		String value();
	}

	/**
	 * Field name
	 */
	private String field;
	/**
	 * Value
	 */
	private String value;

	// field:
	public String getField(){
		return this.field;
	}
	public void setField(String field){
		this.field = field;
	}

	public void field(String multirequestToken){
		setToken("field", multirequestToken);
	}

	// value:
	public String getValue(){
		return this.value;
	}
	public void setValue(String value){
		this.value = value;
	}

	public void value(String multirequestToken){
		setToken("value", multirequestToken);
	}


	public UserDataCondition() {
		super();
	}

	public UserDataCondition(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		field = GsonParser.parseString(jsonObject.get("field"));
		value = GsonParser.parseString(jsonObject.get("value"));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaUserDataCondition");
		kparams.add("field", this.field);
		kparams.add("value", this.value);
		return kparams;
	}


    public static final Creator<UserDataCondition> CREATOR = new Creator<UserDataCondition>() {
        @Override
        public UserDataCondition createFromParcel(Parcel source) {
            return new UserDataCondition(source);
        }

        @Override
        public UserDataCondition[] newArray(int size) {
            return new UserDataCondition[size];
        }
    };

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        super.writeToParcel(dest, flags);
        dest.writeString(this.field);
        dest.writeString(this.value);
    }

    public UserDataCondition(Parcel in) {
        super(in);
        this.field = in.readString();
        this.value = in.readString();
    }
}

