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
import com.kaltura.client.enums.DurationUnit;
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
 * representation of duration time unit and value
 */
@SuppressWarnings("serial")
@MultiRequestBuilder.Tokenizer(Duration.Tokenizer.class)
public class Duration extends ObjectBase {
	
	public interface Tokenizer extends ObjectBase.Tokenizer {
		String unit();
		String value();
	}

	/**
	 * duration unit
	 */
	private DurationUnit unit;
	/**
	 * duration value
	 */
	private Integer value;

	// unit:
	public DurationUnit getUnit(){
		return this.unit;
	}
	public void setUnit(DurationUnit unit){
		this.unit = unit;
	}

	public void unit(String multirequestToken){
		setToken("unit", multirequestToken);
	}

	// value:
	public Integer getValue(){
		return this.value;
	}
	public void setValue(Integer value){
		this.value = value;
	}

	public void value(String multirequestToken){
		setToken("value", multirequestToken);
	}


	public Duration() {
		super();
	}

	public Duration(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		unit = DurationUnit.get(GsonParser.parseString(jsonObject.get("unit")));
		value = GsonParser.parseInt(jsonObject.get("value"));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaDuration");
		kparams.add("unit", this.unit);
		kparams.add("value", this.value);
		return kparams;
	}


    public static final Creator<Duration> CREATOR = new Creator<Duration>() {
        @Override
        public Duration createFromParcel(Parcel source) {
            return new Duration(source);
        }

        @Override
        public Duration[] newArray(int size) {
            return new Duration[size];
        }
    };

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        super.writeToParcel(dest, flags);
        dest.writeInt(this.unit == null ? -1 : this.unit.ordinal());
        dest.writeValue(this.value);
    }

    public Duration(Parcel in) {
        super(in);
        int tmpUnit = in.readInt();
        this.unit = tmpUnit == -1 ? null : DurationUnit.values()[tmpUnit];
        this.value = (Integer)in.readValue(Integer.class.getClassLoader());
    }
}

