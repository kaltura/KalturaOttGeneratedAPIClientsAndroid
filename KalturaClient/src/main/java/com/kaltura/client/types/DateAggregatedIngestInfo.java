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
import com.kaltura.client.types.AggregatedIngestInfo;
import com.kaltura.client.types.ObjectBase;
import com.kaltura.client.utils.GsonParser;
import com.kaltura.client.utils.request.MultiRequestBuilder;

/**
 * This class was generated using exec.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

@SuppressWarnings("serial")
@MultiRequestBuilder.Tokenizer(DateAggregatedIngestInfo.Tokenizer.class)
public class DateAggregatedIngestInfo extends ObjectBase {
	
	public interface Tokenizer extends ObjectBase.Tokenizer {
		String date();
		AggregatedIngestInfo.Tokenizer aggregatedErrors();
	}

	/**
	 * 00:00 UTC of the date in question
	 */
	private Long date;
	/**
	 * Aggregated error counters
	 */
	private AggregatedIngestInfo aggregatedErrors;

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

	// aggregatedErrors:
	public AggregatedIngestInfo getAggregatedErrors(){
		return this.aggregatedErrors;
	}
	public void setAggregatedErrors(AggregatedIngestInfo aggregatedErrors){
		this.aggregatedErrors = aggregatedErrors;
	}


	public DateAggregatedIngestInfo() {
		super();
	}

	public DateAggregatedIngestInfo(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		date = GsonParser.parseLong(jsonObject.get("date"));
		aggregatedErrors = GsonParser.parseObject(jsonObject.getAsJsonObject("aggregatedErrors"), AggregatedIngestInfo.class);

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaDateAggregatedIngestInfo");
		kparams.add("date", this.date);
		kparams.add("aggregatedErrors", this.aggregatedErrors);
		return kparams;
	}


    public static final Creator<DateAggregatedIngestInfo> CREATOR = new Creator<DateAggregatedIngestInfo>() {
        @Override
        public DateAggregatedIngestInfo createFromParcel(Parcel source) {
            return new DateAggregatedIngestInfo(source);
        }

        @Override
        public DateAggregatedIngestInfo[] newArray(int size) {
            return new DateAggregatedIngestInfo[size];
        }
    };

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        super.writeToParcel(dest, flags);
        dest.writeValue(this.date);
        dest.writeParcelable(this.aggregatedErrors, flags);
    }

    public DateAggregatedIngestInfo(Parcel in) {
        super(in);
        this.date = (Long)in.readValue(Long.class.getClassLoader());
        this.aggregatedErrors = in.readParcelable(AggregatedIngestInfo.class.getClassLoader());
    }
}

