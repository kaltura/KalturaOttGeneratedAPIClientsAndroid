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

@SuppressWarnings("serial")
@MultiRequestBuilder.Tokenizer(DateTrigger.Tokenizer.class)
public class DateTrigger extends Trigger {
	
	public interface Tokenizer extends Trigger.Tokenizer {
		String date();
	}

	/**
	 * Trigger date
	 */
	private Long date;

	// date:
	public Long getDate(){
		return this.date;
	}
	public void setDate(Long date){
		this.date = date;
	}

	public void date(String multirequestToken){
		setToken("date", multirequestToken);
	}


	public DateTrigger() {
		super();
	}

	public DateTrigger(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		date = GsonParser.parseLong(jsonObject.get("date"));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaDateTrigger");
		kparams.add("date", this.date);
		return kparams;
	}


    public static final Creator<DateTrigger> CREATOR = new Creator<DateTrigger>() {
        @Override
        public DateTrigger createFromParcel(Parcel source) {
            return new DateTrigger(source);
        }

        @Override
        public DateTrigger[] newArray(int size) {
            return new DateTrigger[size];
        }
    };

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        super.writeToParcel(dest, flags);
        dest.writeValue(this.date);
    }

    public DateTrigger(Parcel in) {
        super(in);
        this.date = (Long)in.readValue(Long.class.getClassLoader());
    }
}
