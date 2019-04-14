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
import com.kaltura.client.enums.StreamType;
import com.kaltura.client.utils.GsonParser;
import com.kaltura.client.utils.request.MultiRequestBuilder;

/**
 * This class was generated using exec.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

@SuppressWarnings("serial")
@MultiRequestBuilder.Tokenizer(LicensedUrlEpgRequest.Tokenizer.class)
public class LicensedUrlEpgRequest extends LicensedUrlMediaRequest {
	
	public interface Tokenizer extends LicensedUrlMediaRequest.Tokenizer {
		String streamType();
		String startDate();
	}

	/**
	 * The stream type to get the URL for
	 */
	private StreamType streamType;
	/**
	 * The start date of the stream (epoch)
	 */
	private Long startDate;

	// streamType:
	public StreamType getStreamType(){
		return this.streamType;
	}
	public void setStreamType(StreamType streamType){
		this.streamType = streamType;
	}

	public void streamType(String multirequestToken){
		setToken("streamType", multirequestToken);
	}

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


	public LicensedUrlEpgRequest() {
		super();
	}

	public LicensedUrlEpgRequest(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		streamType = StreamType.get(GsonParser.parseString(jsonObject.get("streamType")));
		startDate = GsonParser.parseLong(jsonObject.get("startDate"));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaLicensedUrlEpgRequest");
		kparams.add("streamType", this.streamType);
		kparams.add("startDate", this.startDate);
		return kparams;
	}


    public static final Creator<LicensedUrlEpgRequest> CREATOR = new Creator<LicensedUrlEpgRequest>() {
        @Override
        public LicensedUrlEpgRequest createFromParcel(Parcel source) {
            return new LicensedUrlEpgRequest(source);
        }

        @Override
        public LicensedUrlEpgRequest[] newArray(int size) {
            return new LicensedUrlEpgRequest[size];
        }
    };

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        super.writeToParcel(dest, flags);
        dest.writeInt(this.streamType == null ? -1 : this.streamType.ordinal());
        dest.writeValue(this.startDate);
    }

    public LicensedUrlEpgRequest(Parcel in) {
        super(in);
        int tmpStreamType = in.readInt();
        this.streamType = tmpStreamType == -1 ? null : StreamType.values()[tmpStreamType];
        this.startDate = (Long)in.readValue(Long.class.getClassLoader());
    }
}

