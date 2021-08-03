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
import com.kaltura.client.utils.GsonParser;
import com.kaltura.client.utils.request.MultiRequestBuilder;

/**
 * This class was generated using exec.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

@SuppressWarnings("serial")
@MultiRequestBuilder.Tokenizer(SeriesRecordingOption.Tokenizer.class)
public class SeriesRecordingOption extends ObjectBase {
	
	public interface Tokenizer extends ObjectBase.Tokenizer {
		String minSeasonNumber();
		String minEpisodeNumber();
	}

	/**
	 * min Season Number
	 */
	private Integer minSeasonNumber;
	/**
	 * min Season Number
	 */
	private Integer minEpisodeNumber;

	// minSeasonNumber:
	public Integer getMinSeasonNumber(){
		return this.minSeasonNumber;
	}
	public void setMinSeasonNumber(Integer minSeasonNumber){
		this.minSeasonNumber = minSeasonNumber;
	}

	public void minSeasonNumber(String multirequestToken){
		setToken("minSeasonNumber", multirequestToken);
	}

	// minEpisodeNumber:
	public Integer getMinEpisodeNumber(){
		return this.minEpisodeNumber;
	}
	public void setMinEpisodeNumber(Integer minEpisodeNumber){
		this.minEpisodeNumber = minEpisodeNumber;
	}

	public void minEpisodeNumber(String multirequestToken){
		setToken("minEpisodeNumber", multirequestToken);
	}


	public SeriesRecordingOption() {
		super();
	}

	public SeriesRecordingOption(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		minSeasonNumber = GsonParser.parseInt(jsonObject.get("minSeasonNumber"));
		minEpisodeNumber = GsonParser.parseInt(jsonObject.get("minEpisodeNumber"));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaSeriesRecordingOption");
		kparams.add("minSeasonNumber", this.minSeasonNumber);
		kparams.add("minEpisodeNumber", this.minEpisodeNumber);
		return kparams;
	}


    public static final Creator<SeriesRecordingOption> CREATOR = new Creator<SeriesRecordingOption>() {
        @Override
        public SeriesRecordingOption createFromParcel(Parcel source) {
            return new SeriesRecordingOption(source);
        }

        @Override
        public SeriesRecordingOption[] newArray(int size) {
            return new SeriesRecordingOption[size];
        }
    };

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        super.writeToParcel(dest, flags);
        dest.writeValue(this.minSeasonNumber);
        dest.writeValue(this.minEpisodeNumber);
    }

    public SeriesRecordingOption(Parcel in) {
        super(in);
        this.minSeasonNumber = (Integer)in.readValue(Integer.class.getClassLoader());
        this.minEpisodeNumber = (Integer)in.readValue(Integer.class.getClassLoader());
    }
}

