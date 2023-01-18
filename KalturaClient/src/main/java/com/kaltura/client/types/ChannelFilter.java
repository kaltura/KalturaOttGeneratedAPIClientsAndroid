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
@MultiRequestBuilder.Tokenizer(ChannelFilter.Tokenizer.class)
public class ChannelFilter extends BaseSearchAssetFilter {
	
	public interface Tokenizer extends BaseSearchAssetFilter.Tokenizer {
		String idEqual();
		String excludeWatched();
	}

	/**
	 * Channel Id
	 */
	private Integer idEqual;
	/**
	 * Exclude watched asset.
	 */
	private Boolean excludeWatched;

	// idEqual:
	public Integer getIdEqual(){
		return this.idEqual;
	}
	public void setIdEqual(Integer idEqual){
		this.idEqual = idEqual;
	}

	public void idEqual(String multirequestToken){
		setToken("idEqual", multirequestToken);
	}

	// excludeWatched:
	public Boolean getExcludeWatched(){
		return this.excludeWatched;
	}
	public void setExcludeWatched(Boolean excludeWatched){
		this.excludeWatched = excludeWatched;
	}

	public void excludeWatched(String multirequestToken){
		setToken("excludeWatched", multirequestToken);
	}


	public ChannelFilter() {
		super();
	}

	public ChannelFilter(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		idEqual = GsonParser.parseInt(jsonObject.get("idEqual"));
		excludeWatched = GsonParser.parseBoolean(jsonObject.get("excludeWatched"));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaChannelFilter");
		kparams.add("idEqual", this.idEqual);
		kparams.add("excludeWatched", this.excludeWatched);
		return kparams;
	}


    public static final Creator<ChannelFilter> CREATOR = new Creator<ChannelFilter>() {
        @Override
        public ChannelFilter createFromParcel(Parcel source) {
            return new ChannelFilter(source);
        }

        @Override
        public ChannelFilter[] newArray(int size) {
            return new ChannelFilter[size];
        }
    };

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        super.writeToParcel(dest, flags);
        dest.writeValue(this.idEqual);
        dest.writeValue(this.excludeWatched);
    }

    public ChannelFilter(Parcel in) {
        super(in);
        this.idEqual = (Integer)in.readValue(Integer.class.getClassLoader());
        this.excludeWatched = (Boolean)in.readValue(Boolean.class.getClassLoader());
    }
}

