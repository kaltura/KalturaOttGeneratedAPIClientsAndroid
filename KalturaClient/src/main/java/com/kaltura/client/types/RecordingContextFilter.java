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
// Copyright (C) 2006-2017  Kaltura Inc.
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
 * This class was generated using clients-generator\exec.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

/**
 * Filtering assets
 */
@SuppressWarnings("serial")
@MultiRequestBuilder.Tokenizer(RecordingContextFilter.Tokenizer.class)
public class RecordingContextFilter extends Filter {
	
	public interface Tokenizer extends Filter.Tokenizer {
		String assetIdIn();
	}

	/**
	 * Comma separated asset ids
	 */
	private String assetIdIn;

	// assetIdIn:
	public String getAssetIdIn(){
		return this.assetIdIn;
	}
	public void setAssetIdIn(String assetIdIn){
		this.assetIdIn = assetIdIn;
	}

	public void assetIdIn(String multirequestToken){
		setToken("assetIdIn", multirequestToken);
	}


	public RecordingContextFilter() {
		super();
	}

	public RecordingContextFilter(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		assetIdIn = GsonParser.parseString(jsonObject.get("assetIdIn"));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaRecordingContextFilter");
		kparams.add("assetIdIn", this.assetIdIn);
		return kparams;
	}


    public static final Creator<RecordingContextFilter> CREATOR = new Creator<RecordingContextFilter>() {
        @Override
        public RecordingContextFilter createFromParcel(Parcel source) {
            return new RecordingContextFilter(source);
        }

        @Override
        public RecordingContextFilter[] newArray(int size) {
            return new RecordingContextFilter[size];
        }
    };

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        super.writeToParcel(dest, flags);
        dest.writeString(this.assetIdIn);
    }

    public RecordingContextFilter(Parcel in) {
        super(in);
        this.assetIdIn = in.readString();
    }
}

