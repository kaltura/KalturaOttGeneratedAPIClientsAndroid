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
// Copyright (C) 2006-2017  Kaltura Inc.
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
import com.kaltura.client.types.MultilingualString;
import com.kaltura.client.utils.GsonParser;
import com.kaltura.client.utils.request.MultiRequestBuilder;

/**
 * This class was generated using clients-generator\exec.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

/**  Array of translated strings  */
@SuppressWarnings("serial")
@MultiRequestBuilder.Tokenizer(MultilingualStringValue.Tokenizer.class)
public class MultilingualStringValue extends Value {
	
	public interface Tokenizer extends Value.Tokenizer {
		String value();
		MultilingualString.Tokenizer multilingualValue();
	}

	/**  Value  */
	private String value;
	/**  Value  */
	private MultilingualString multilingualValue;

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

	// multilingualValue:
	public MultilingualString getMultilingualValue(){
		return this.multilingualValue;
	}
	public void setMultilingualValue(MultilingualString multilingualValue){
		this.multilingualValue = multilingualValue;
	}


	public MultilingualStringValue() {
		super();
	}

	public MultilingualStringValue(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		value = GsonParser.parseString(jsonObject.get("value"));
		multilingualValue = GsonParser.parseObject(jsonObject.getAsJsonObject("multilingualValue"), MultilingualString.class);

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaMultilingualStringValue");
		kparams.add("value", this.value);
		kparams.add("multilingualValue", this.multilingualValue);
		return kparams;
	}


    public static final Creator<MultilingualStringValue> CREATOR = new Creator<MultilingualStringValue>() {
        @Override
        public MultilingualStringValue createFromParcel(Parcel source) {
            return new MultilingualStringValue(source);
        }

        @Override
        public MultilingualStringValue[] newArray(int size) {
            return new MultilingualStringValue[size];
        }
    };

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        super.writeToParcel(dest, flags);
        dest.writeString(this.value);
        dest.writeParcelable(this.multilingualValue, flags);
    }

    public MultilingualStringValue(Parcel in) {
        super(in);
        this.value = in.readString();
        this.multilingualValue = in.readParcelable(MultilingualString.class.getClassLoader());
    }
}

