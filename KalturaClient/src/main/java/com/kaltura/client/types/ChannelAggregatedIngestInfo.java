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
@MultiRequestBuilder.Tokenizer(ChannelAggregatedIngestInfo.Tokenizer.class)
public class ChannelAggregatedIngestInfo extends ObjectBase {
	
	public interface Tokenizer extends ObjectBase.Tokenizer {
		String linearChannelId();
		AggregatedIngestInfo.Tokenizer aggregatedErrors();
	}

	/**
	 * The linear channel asset id
	 */
	private Long linearChannelId;
	/**
	 * Aggregated error counters
	 */
	private AggregatedIngestInfo aggregatedErrors;

	// linearChannelId:
	public Long getLinearChannelId(){
		return this.linearChannelId;
	}
	public void setLinearChannelId(Long linearChannelId){
		this.linearChannelId = linearChannelId;
	}

	public void linearChannelId(String multirequestToken){
		setToken("linearChannelId", multirequestToken);
	}

	// aggregatedErrors:
	public AggregatedIngestInfo getAggregatedErrors(){
		return this.aggregatedErrors;
	}
	public void setAggregatedErrors(AggregatedIngestInfo aggregatedErrors){
		this.aggregatedErrors = aggregatedErrors;
	}


	public ChannelAggregatedIngestInfo() {
		super();
	}

	public ChannelAggregatedIngestInfo(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		linearChannelId = GsonParser.parseLong(jsonObject.get("linearChannelId"));
		aggregatedErrors = GsonParser.parseObject(jsonObject.getAsJsonObject("aggregatedErrors"), AggregatedIngestInfo.class);

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaChannelAggregatedIngestInfo");
		kparams.add("linearChannelId", this.linearChannelId);
		kparams.add("aggregatedErrors", this.aggregatedErrors);
		return kparams;
	}


    public static final Creator<ChannelAggregatedIngestInfo> CREATOR = new Creator<ChannelAggregatedIngestInfo>() {
        @Override
        public ChannelAggregatedIngestInfo createFromParcel(Parcel source) {
            return new ChannelAggregatedIngestInfo(source);
        }

        @Override
        public ChannelAggregatedIngestInfo[] newArray(int size) {
            return new ChannelAggregatedIngestInfo[size];
        }
    };

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        super.writeToParcel(dest, flags);
        dest.writeValue(this.linearChannelId);
        dest.writeParcelable(this.aggregatedErrors, flags);
    }

    public ChannelAggregatedIngestInfo(Parcel in) {
        super(in);
        this.linearChannelId = (Long)in.readValue(Long.class.getClassLoader());
        this.aggregatedErrors = in.readParcelable(AggregatedIngestInfo.class.getClassLoader());
    }
}

