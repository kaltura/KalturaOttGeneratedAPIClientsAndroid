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
import com.kaltura.client.types.StringValue;
import com.kaltura.client.utils.GsonParser;
import com.kaltura.client.utils.request.MultiRequestBuilder;

/**
 * This class was generated using exec.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

/**
 * User dynamic data
 */
@SuppressWarnings("serial")
@MultiRequestBuilder.Tokenizer(OTTUserDynamicData.Tokenizer.class)
public class OTTUserDynamicData extends ObjectBase {
	
	public interface Tokenizer extends ObjectBase.Tokenizer {
		String userId();
		String key();
		StringValue.Tokenizer value();
	}

	/**
	 * User identifier
	 */
	private String userId;
	/**
	 * Key
	 */
	private String key;
	/**
	 * Value
	 */
	private StringValue value;

	// userId:
	public String getUserId(){
		return this.userId;
	}
	// key:
	public String getKey(){
		return this.key;
	}
	public void setKey(String key){
		this.key = key;
	}

	public void key(String multirequestToken){
		setToken("key", multirequestToken);
	}

	// value:
	public StringValue getValue(){
		return this.value;
	}
	public void setValue(StringValue value){
		this.value = value;
	}


	public OTTUserDynamicData() {
		super();
	}

	public OTTUserDynamicData(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		userId = GsonParser.parseString(jsonObject.get("userId"));
		key = GsonParser.parseString(jsonObject.get("key"));
		value = GsonParser.parseObject(jsonObject.getAsJsonObject("value"), StringValue.class);

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaOTTUserDynamicData");
		kparams.add("key", this.key);
		kparams.add("value", this.value);
		return kparams;
	}


    public static final Creator<OTTUserDynamicData> CREATOR = new Creator<OTTUserDynamicData>() {
        @Override
        public OTTUserDynamicData createFromParcel(Parcel source) {
            return new OTTUserDynamicData(source);
        }

        @Override
        public OTTUserDynamicData[] newArray(int size) {
            return new OTTUserDynamicData[size];
        }
    };

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        super.writeToParcel(dest, flags);
        dest.writeString(this.userId);
        dest.writeString(this.key);
        dest.writeParcelable(this.value, flags);
    }

    public OTTUserDynamicData(Parcel in) {
        super(in);
        this.userId = in.readString();
        this.key = in.readString();
        this.value = in.readParcelable(StringValue.class.getClassLoader());
    }
}

