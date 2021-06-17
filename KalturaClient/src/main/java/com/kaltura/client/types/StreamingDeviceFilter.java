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
import com.kaltura.client.enums.AssetType;
import com.kaltura.client.utils.GsonParser;
import com.kaltura.client.utils.request.MultiRequestBuilder;

/**
 * This class was generated using exec.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

/**
 * Filtering streaming devices
 */
@SuppressWarnings("serial")
@MultiRequestBuilder.Tokenizer(StreamingDeviceFilter.Tokenizer.class)
public class StreamingDeviceFilter extends Filter {
	
	public interface Tokenizer extends Filter.Tokenizer {
		String assetTypeEqual();
	}

	/**
	 * filter by asset type
	 */
	private AssetType assetTypeEqual;

	// assetTypeEqual:
	public AssetType getAssetTypeEqual(){
		return this.assetTypeEqual;
	}
	public void setAssetTypeEqual(AssetType assetTypeEqual){
		this.assetTypeEqual = assetTypeEqual;
	}

	public void assetTypeEqual(String multirequestToken){
		setToken("assetTypeEqual", multirequestToken);
	}


	public StreamingDeviceFilter() {
		super();
	}

	public StreamingDeviceFilter(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		assetTypeEqual = AssetType.get(GsonParser.parseString(jsonObject.get("assetTypeEqual")));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaStreamingDeviceFilter");
		kparams.add("assetTypeEqual", this.assetTypeEqual);
		return kparams;
	}


    public static final Creator<StreamingDeviceFilter> CREATOR = new Creator<StreamingDeviceFilter>() {
        @Override
        public StreamingDeviceFilter createFromParcel(Parcel source) {
            return new StreamingDeviceFilter(source);
        }

        @Override
        public StreamingDeviceFilter[] newArray(int size) {
            return new StreamingDeviceFilter[size];
        }
    };

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        super.writeToParcel(dest, flags);
        dest.writeInt(this.assetTypeEqual == null ? -1 : this.assetTypeEqual.ordinal());
    }

    public StreamingDeviceFilter(Parcel in) {
        super(in);
        int tmpAssetTypeEqual = in.readInt();
        this.assetTypeEqual = tmpAssetTypeEqual == -1 ? null : AssetType.values()[tmpAssetTypeEqual];
    }
}

