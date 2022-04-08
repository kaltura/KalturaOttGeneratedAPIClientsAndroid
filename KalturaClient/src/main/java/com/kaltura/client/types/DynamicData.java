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
import com.kaltura.client.types.Value;
import com.kaltura.client.utils.GsonParser;
import com.kaltura.client.utils.request.MultiRequestBuilder;

/**
 * This class was generated using exec.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

@SuppressWarnings("serial")
@MultiRequestBuilder.Tokenizer(DynamicData.Tokenizer.class)
public class DynamicData extends ObjectBase {
	
	public interface Tokenizer extends ObjectBase.Tokenizer {
		String key();
		Value.Tokenizer value();
	}

	/**
	 * Key
	 */
	private String key;
	/**
	 * Value
	 */
	private Value value;

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
	public Value getValue(){
		return this.value;
	}
	public void setValue(Value value){
		this.value = value;
	}


	public DynamicData() {
		super();
	}

	public DynamicData(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		key = GsonParser.parseString(jsonObject.get("key"));
		value = GsonParser.parseObject(jsonObject.getAsJsonObject("value"), Value.class);

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaDynamicData");
		kparams.add("key", this.key);
		kparams.add("value", this.value);
		return kparams;
	}


    public static final Creator<DynamicData> CREATOR = new Creator<DynamicData>() {
        @Override
        public DynamicData createFromParcel(Parcel source) {
            return new DynamicData(source);
        }

        @Override
        public DynamicData[] newArray(int size) {
            return new DynamicData[size];
        }
    };

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        super.writeToParcel(dest, flags);
        dest.writeString(this.key);
        dest.writeParcelable(this.value, flags);
    }

    public DynamicData(Parcel in) {
        super(in);
        this.key = in.readString();
        this.value = in.readParcelable(Value.class.getClassLoader());
    }
}

