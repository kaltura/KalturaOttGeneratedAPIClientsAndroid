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
import com.kaltura.client.utils.GsonParser;
import com.kaltura.client.utils.request.MultiRequestBuilder;

/**
 * This class was generated using exec.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

@SuppressWarnings("serial")
@MultiRequestBuilder.Tokenizer(SeriesReminderFilter.Tokenizer.class)
public class SeriesReminderFilter extends ReminderFilter {
	
	public interface Tokenizer extends ReminderFilter.Tokenizer {
		String seriesIdIn();
		String epgChannelIdEqual();
	}

	/**
	 * Comma separated series IDs
	 */
	private String seriesIdIn;
	/**
	 * EPG channel ID
	 */
	private Long epgChannelIdEqual;

	// seriesIdIn:
	public String getSeriesIdIn(){
		return this.seriesIdIn;
	}
	public void setSeriesIdIn(String seriesIdIn){
		this.seriesIdIn = seriesIdIn;
	}

	public void seriesIdIn(String multirequestToken){
		setToken("seriesIdIn", multirequestToken);
	}

	// epgChannelIdEqual:
	public Long getEpgChannelIdEqual(){
		return this.epgChannelIdEqual;
	}
	public void setEpgChannelIdEqual(Long epgChannelIdEqual){
		this.epgChannelIdEqual = epgChannelIdEqual;
	}

	public void epgChannelIdEqual(String multirequestToken){
		setToken("epgChannelIdEqual", multirequestToken);
	}


	public SeriesReminderFilter() {
		super();
	}

	public SeriesReminderFilter(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		seriesIdIn = GsonParser.parseString(jsonObject.get("seriesIdIn"));
		epgChannelIdEqual = GsonParser.parseLong(jsonObject.get("epgChannelIdEqual"));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaSeriesReminderFilter");
		kparams.add("seriesIdIn", this.seriesIdIn);
		kparams.add("epgChannelIdEqual", this.epgChannelIdEqual);
		return kparams;
	}


    public static final Creator<SeriesReminderFilter> CREATOR = new Creator<SeriesReminderFilter>() {
        @Override
        public SeriesReminderFilter createFromParcel(Parcel source) {
            return new SeriesReminderFilter(source);
        }

        @Override
        public SeriesReminderFilter[] newArray(int size) {
            return new SeriesReminderFilter[size];
        }
    };

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        super.writeToParcel(dest, flags);
        dest.writeString(this.seriesIdIn);
        dest.writeValue(this.epgChannelIdEqual);
    }

    public SeriesReminderFilter(Parcel in) {
        super(in);
        this.seriesIdIn = in.readString();
        this.epgChannelIdEqual = (Long)in.readValue(Long.class.getClassLoader());
    }
}

