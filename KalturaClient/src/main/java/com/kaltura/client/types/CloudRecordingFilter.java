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
 * Filtering cloud external recordings
 */
@SuppressWarnings("serial")
@MultiRequestBuilder.Tokenizer(CloudRecordingFilter.Tokenizer.class)
public class CloudRecordingFilter extends ExternalRecordingFilter {
	
	public interface Tokenizer extends ExternalRecordingFilter.Tokenizer {
		String adapterData();
	}

	/**
	 * Adapter Data
	 */
	private String adapterData;

	// adapterData:
	public String getAdapterData(){
		return this.adapterData;
	}
	public void setAdapterData(String adapterData){
		this.adapterData = adapterData;
	}

	public void adapterData(String multirequestToken){
		setToken("adapterData", multirequestToken);
	}


	public CloudRecordingFilter() {
		super();
	}

	public CloudRecordingFilter(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		adapterData = GsonParser.parseString(jsonObject.get("adapterData"));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaCloudRecordingFilter");
		kparams.add("adapterData", this.adapterData);
		return kparams;
	}


    public static final Creator<CloudRecordingFilter> CREATOR = new Creator<CloudRecordingFilter>() {
        @Override
        public CloudRecordingFilter createFromParcel(Parcel source) {
            return new CloudRecordingFilter(source);
        }

        @Override
        public CloudRecordingFilter[] newArray(int size) {
            return new CloudRecordingFilter[size];
        }
    };

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        super.writeToParcel(dest, flags);
        dest.writeString(this.adapterData);
    }

    public CloudRecordingFilter(Parcel in) {
        super(in);
        this.adapterData = in.readString();
    }
}

