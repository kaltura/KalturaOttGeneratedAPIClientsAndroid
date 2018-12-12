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
// Copyright (C) 2006-2018  Kaltura Inc.
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
 * Header condition
 */
@SuppressWarnings("serial")
@MultiRequestBuilder.Tokenizer(HeaderCondition.Tokenizer.class)
public class HeaderCondition extends NotCondition {
	
	public interface Tokenizer extends NotCondition.Tokenizer {
		String key();
		String value();
	}

	/**
	 * Header key
	 */
	private String key;
	/**
	 * Header value
	 */
	private String value;

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
	public String getValue(){
		return this.value;
	}
	public void setValue(String value){
		this.value = value;
	}

	public void value(String multirequestToken){
		setToken("value", multirequestToken);
	}


	public HeaderCondition() {
		super();
	}

	public HeaderCondition(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		key = GsonParser.parseString(jsonObject.get("key"));
		value = GsonParser.parseString(jsonObject.get("value"));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaHeaderCondition");
		kparams.add("key", this.key);
		kparams.add("value", this.value);
		return kparams;
	}


    public static final Creator<HeaderCondition> CREATOR = new Creator<HeaderCondition>() {
        @Override
        public HeaderCondition createFromParcel(Parcel source) {
            return new HeaderCondition(source);
        }

        @Override
        public HeaderCondition[] newArray(int size) {
            return new HeaderCondition[size];
        }
    };

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        super.writeToParcel(dest, flags);
        dest.writeString(this.key);
        dest.writeString(this.value);
    }

    public HeaderCondition(Parcel in) {
        super(in);
        this.key = in.readString();
        this.value = in.readString();
    }
}

