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
 * This class was generated using clients-generator\exec.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

@SuppressWarnings("serial")
@MultiRequestBuilder.Tokenizer(SearchAssetFilter.Tokenizer.class)
public class SearchAssetFilter extends BaseSearchAssetFilter {
	
	public interface Tokenizer extends BaseSearchAssetFilter.Tokenizer {
		String typeIn();
		String idIn();
	}

	/**
	 * (Deprecated - use KalturaBaseSearchAssetFilter.kSql)              Comma
	  separated list of asset types to search within.               Possible values: 0
	  – EPG linear programs entries; 1 - Recordings; Any media type ID (according to
	  media type IDs defined dynamically in the system).              If omitted –
	  all types should be included.
	 */
	private String typeIn;
	/**
	 * Comma separated list of EPG channel ids to search within.
	 */
	private String idIn;

	// typeIn:
	public String getTypeIn(){
		return this.typeIn;
	}
	public void setTypeIn(String typeIn){
		this.typeIn = typeIn;
	}

	public void typeIn(String multirequestToken){
		setToken("typeIn", multirequestToken);
	}

	// idIn:
	public String getIdIn(){
		return this.idIn;
	}
	public void setIdIn(String idIn){
		this.idIn = idIn;
	}

	public void idIn(String multirequestToken){
		setToken("idIn", multirequestToken);
	}


	public SearchAssetFilter() {
		super();
	}

	public SearchAssetFilter(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		typeIn = GsonParser.parseString(jsonObject.get("typeIn"));
		idIn = GsonParser.parseString(jsonObject.get("idIn"));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaSearchAssetFilter");
		kparams.add("typeIn", this.typeIn);
		kparams.add("idIn", this.idIn);
		return kparams;
	}


    public static final Creator<SearchAssetFilter> CREATOR = new Creator<SearchAssetFilter>() {
        @Override
        public SearchAssetFilter createFromParcel(Parcel source) {
            return new SearchAssetFilter(source);
        }

        @Override
        public SearchAssetFilter[] newArray(int size) {
            return new SearchAssetFilter[size];
        }
    };

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        super.writeToParcel(dest, flags);
        dest.writeString(this.typeIn);
        dest.writeString(this.idIn);
    }

    public SearchAssetFilter(Parcel in) {
        super(in);
        this.typeIn = in.readString();
        this.idIn = in.readString();
    }
}

