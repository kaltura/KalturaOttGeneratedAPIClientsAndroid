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
import com.kaltura.client.utils.request.RequestBuilder;
import java.util.HashMap;
import java.util.Map;

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
		RequestBuilder.MapTokenizer<StringValue.Tokenizer> adapterData();
	}

	/**
	 * Adapter Data
	 */
	private Map<String, StringValue> adapterData;

	// adapterData:
	public Map<String, StringValue> getAdapterData(){
		return this.adapterData;
	}
	public void setAdapterData(Map<String, StringValue> adapterData){
		this.adapterData = adapterData;
	}


	public CloudRecordingFilter() {
		super();
	}

	public CloudRecordingFilter(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		adapterData = GsonParser.parseMap(jsonObject.getAsJsonObject("adapterData"), StringValue.class);

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
        if(this.adapterData != null) {
            dest.writeInt(this.adapterData.size());
            for (Map.Entry<String, StringValue> entry : this.adapterData.entrySet()) {
                dest.writeString(entry.getKey());
                dest.writeParcelable(entry.getValue(), flags);
            }
        } else {
            dest.writeInt(-1);
        }
    }

    public CloudRecordingFilter(Parcel in) {
        super(in);
        int adapterDataSize = in.readInt();
        if( adapterDataSize > -1) {
            this.adapterData = new HashMap<>();
            for (int i = 0; i < adapterDataSize; i++) {
                String key = in.readString();
                StringValue value = in.readParcelable(StringValue.class.getClassLoader());
                this.adapterData.put(key, value);
            }
        }
    }
}

