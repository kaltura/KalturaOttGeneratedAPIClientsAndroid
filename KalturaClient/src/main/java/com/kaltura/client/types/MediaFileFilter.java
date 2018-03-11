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

@SuppressWarnings("serial")
@MultiRequestBuilder.Tokenizer(MediaFileFilter.Tokenizer.class)
public class MediaFileFilter extends Filter {
	
	public interface Tokenizer extends Filter.Tokenizer {
		String assetIdEqual();
		String idEqual();
	}

	/**
	 * Asset identifier to filter by
	 */
	private Long assetIdEqual;
	/**
	 * Asset file identifier to filter by
	 */
	private Long idEqual;

	// assetIdEqual:
	public Long getAssetIdEqual(){
		return this.assetIdEqual;
	}
	public void setAssetIdEqual(Long assetIdEqual){
		this.assetIdEqual = assetIdEqual;
	}

	public void assetIdEqual(String multirequestToken){
		setToken("assetIdEqual", multirequestToken);
	}

	// idEqual:
	public Long getIdEqual(){
		return this.idEqual;
	}
	public void setIdEqual(Long idEqual){
		this.idEqual = idEqual;
	}

	public void idEqual(String multirequestToken){
		setToken("idEqual", multirequestToken);
	}


	public MediaFileFilter() {
		super();
	}

	public MediaFileFilter(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		assetIdEqual = GsonParser.parseLong(jsonObject.get("assetIdEqual"));
		idEqual = GsonParser.parseLong(jsonObject.get("idEqual"));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaMediaFileFilter");
		kparams.add("assetIdEqual", this.assetIdEqual);
		kparams.add("idEqual", this.idEqual);
		return kparams;
	}


    public static final Creator<MediaFileFilter> CREATOR = new Creator<MediaFileFilter>() {
        @Override
        public MediaFileFilter createFromParcel(Parcel source) {
            return new MediaFileFilter(source);
        }

        @Override
        public MediaFileFilter[] newArray(int size) {
            return new MediaFileFilter[size];
        }
    };

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        super.writeToParcel(dest, flags);
        dest.writeValue(this.assetIdEqual);
        dest.writeValue(this.idEqual);
    }

    public MediaFileFilter(Parcel in) {
        super(in);
        this.assetIdEqual = (Long)in.readValue(Long.class.getClassLoader());
        this.idEqual = (Long)in.readValue(Long.class.getClassLoader());
    }
}

