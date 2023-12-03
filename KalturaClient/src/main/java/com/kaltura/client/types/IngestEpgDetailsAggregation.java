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
import com.kaltura.client.utils.request.RequestBuilder;
import java.util.ArrayList;
import java.util.List;

/**
 * This class was generated using exec.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

@SuppressWarnings("serial")
@MultiRequestBuilder.Tokenizer(IngestEpgDetailsAggregation.Tokenizer.class)
public class IngestEpgDetailsAggregation extends ObjectBase {
	
	public interface Tokenizer extends ObjectBase.Tokenizer {
		RequestBuilder.ListTokenizer<ChannelAggregatedIngestInfo.Tokenizer> linearChannels();
		RequestBuilder.ListTokenizer<DateAggregatedIngestInfo.Tokenizer> dates();
		AggregatedIngestInfo.Tokenizer all();
	}

	/**
	 * Array of aggregated information per channel that included in the ingest job in
	  question
	 */
	private List<ChannelAggregatedIngestInfo> linearChannels;
	/**
	 * Array of aggregated information per date that included in the ingest job in
	  question
	 */
	private List<DateAggregatedIngestInfo> dates;
	/**
	 * All aggregated counters
	 */
	private AggregatedIngestInfo all;

	// linearChannels:
	public List<ChannelAggregatedIngestInfo> getLinearChannels(){
		return this.linearChannels;
	}
	public void setLinearChannels(List<ChannelAggregatedIngestInfo> linearChannels){
		this.linearChannels = linearChannels;
	}

	// dates:
	public List<DateAggregatedIngestInfo> getDates(){
		return this.dates;
	}
	public void setDates(List<DateAggregatedIngestInfo> dates){
		this.dates = dates;
	}

	// all:
	public AggregatedIngestInfo getAll(){
		return this.all;
	}
	public void setAll(AggregatedIngestInfo all){
		this.all = all;
	}


	public IngestEpgDetailsAggregation() {
		super();
	}

	public IngestEpgDetailsAggregation(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		linearChannels = GsonParser.parseArray(jsonObject.getAsJsonArray("linearChannels"), ChannelAggregatedIngestInfo.class);
		dates = GsonParser.parseArray(jsonObject.getAsJsonArray("dates"), DateAggregatedIngestInfo.class);
		all = GsonParser.parseObject(jsonObject.getAsJsonObject("all"), AggregatedIngestInfo.class);

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaIngestEpgDetailsAggregation");
		kparams.add("linearChannels", this.linearChannels);
		kparams.add("dates", this.dates);
		kparams.add("all", this.all);
		return kparams;
	}


    public static final Creator<IngestEpgDetailsAggregation> CREATOR = new Creator<IngestEpgDetailsAggregation>() {
        @Override
        public IngestEpgDetailsAggregation createFromParcel(Parcel source) {
            return new IngestEpgDetailsAggregation(source);
        }

        @Override
        public IngestEpgDetailsAggregation[] newArray(int size) {
            return new IngestEpgDetailsAggregation[size];
        }
    };

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        super.writeToParcel(dest, flags);
        if(this.linearChannels != null) {
            dest.writeInt(this.linearChannels.size());
            dest.writeList(this.linearChannels);
        } else {
            dest.writeInt(-1);
        }
        if(this.dates != null) {
            dest.writeInt(this.dates.size());
            dest.writeList(this.dates);
        } else {
            dest.writeInt(-1);
        }
        dest.writeParcelable(this.all, flags);
    }

    public IngestEpgDetailsAggregation(Parcel in) {
        super(in);
        int linearChannelsSize = in.readInt();
        if( linearChannelsSize > -1) {
            this.linearChannels = new ArrayList<>();
            in.readList(this.linearChannels, ChannelAggregatedIngestInfo.class.getClassLoader());
        }
        int datesSize = in.readInt();
        if( datesSize > -1) {
            this.dates = new ArrayList<>();
            in.readList(this.dates, DateAggregatedIngestInfo.class.getClassLoader());
        }
        this.all = in.readParcelable(AggregatedIngestInfo.class.getClassLoader());
    }
}

