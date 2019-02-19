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
 * Date condition
 */
@SuppressWarnings("serial")
@MultiRequestBuilder.Tokenizer(DateCondition.Tokenizer.class)
public class DateCondition extends NotCondition {
	
	public interface Tokenizer extends NotCondition.Tokenizer {
		String startDate();
		String endDate();
	}

	/**
	 * Start date
	 */
	private Long startDate;
	/**
	 * End date
	 */
	private Long endDate;

	// startDate:
	public Long getStartDate(){
		return this.startDate;
	}
	public void setStartDate(Long startDate){
		this.startDate = startDate;
	}

	public void startDate(String multirequestToken){
		setToken("startDate", multirequestToken);
	}

	// endDate:
	public Long getEndDate(){
		return this.endDate;
	}
	public void setEndDate(Long endDate){
		this.endDate = endDate;
	}

	public void endDate(String multirequestToken){
		setToken("endDate", multirequestToken);
	}


	public DateCondition() {
		super();
	}

	public DateCondition(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		startDate = GsonParser.parseLong(jsonObject.get("startDate"));
		endDate = GsonParser.parseLong(jsonObject.get("endDate"));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaDateCondition");
		kparams.add("startDate", this.startDate);
		kparams.add("endDate", this.endDate);
		return kparams;
	}


    public static final Creator<DateCondition> CREATOR = new Creator<DateCondition>() {
        @Override
        public DateCondition createFromParcel(Parcel source) {
            return new DateCondition(source);
        }

        @Override
        public DateCondition[] newArray(int size) {
            return new DateCondition[size];
        }
    };

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        super.writeToParcel(dest, flags);
        dest.writeValue(this.startDate);
        dest.writeValue(this.endDate);
    }

    public DateCondition(Parcel in) {
        super(in);
        this.startDate = (Long)in.readValue(Long.class.getClassLoader());
        this.endDate = (Long)in.readValue(Long.class.getClassLoader());
    }
}

