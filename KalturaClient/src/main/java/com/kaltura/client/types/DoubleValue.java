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
 * This class was generated using exec.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

/**
 * A string representation to return an array of doubles
 */
@SuppressWarnings("serial")
@MultiRequestBuilder.Tokenizer(DoubleValue.Tokenizer.class)
public class DoubleValue extends Value {
	
	public interface Tokenizer extends Value.Tokenizer {
		String value();
	}

	/**
	 * Value
	 */
	private Double value;

	// value:
	public Double getValue(){
		return this.value;
	}
	public void setValue(Double value){
		this.value = value;
	}

	public void value(String multirequestToken){
		setToken("value", multirequestToken);
	}


	public DoubleValue() {
		super();
	}

	public DoubleValue(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		value = GsonParser.parseDouble(jsonObject.get("value"));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaDoubleValue");
		kparams.add("value", this.value);
		return kparams;
	}


    public static final Creator<DoubleValue> CREATOR = new Creator<DoubleValue>() {
        @Override
        public DoubleValue createFromParcel(Parcel source) {
            return new DoubleValue(source);
        }

        @Override
        public DoubleValue[] newArray(int size) {
            return new DoubleValue[size];
        }
    };

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        super.writeToParcel(dest, flags);
        dest.writeValue(this.value);
    }

    public DoubleValue(Parcel in) {
        super(in);
        this.value = (Double)in.readValue(Double.class.getClassLoader());
    }
}

