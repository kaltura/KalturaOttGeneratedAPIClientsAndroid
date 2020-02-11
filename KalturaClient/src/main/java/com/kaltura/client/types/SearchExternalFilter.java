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
@MultiRequestBuilder.Tokenizer(SearchExternalFilter.Tokenizer.class)
public class SearchExternalFilter extends AssetFilter {
	
	public interface Tokenizer extends AssetFilter.Tokenizer {
		String query();
		String utcOffsetEqual();
		String typeIn();
	}

	/**
	 * Query
	 */
	private String query;
	/**
	 * UtcOffsetEqual
	 */
	private Integer utcOffsetEqual;
	/**
	 * Comma separated list of asset types to search within.               Possible
	  values: 0 – EPG linear programs entries, any media type ID (according to media
	  type IDs defined dynamically in the system).              If omitted – all
	  types should be included.
	 */
	private String typeIn;

	// query:
	public String getQuery(){
		return this.query;
	}
	public void setQuery(String query){
		this.query = query;
	}

	public void query(String multirequestToken){
		setToken("query", multirequestToken);
	}

	// utcOffsetEqual:
	public Integer getUtcOffsetEqual(){
		return this.utcOffsetEqual;
	}
	public void setUtcOffsetEqual(Integer utcOffsetEqual){
		this.utcOffsetEqual = utcOffsetEqual;
	}

	public void utcOffsetEqual(String multirequestToken){
		setToken("utcOffsetEqual", multirequestToken);
	}

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


	public SearchExternalFilter() {
		super();
	}

	public SearchExternalFilter(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		query = GsonParser.parseString(jsonObject.get("query"));
		utcOffsetEqual = GsonParser.parseInt(jsonObject.get("utcOffsetEqual"));
		typeIn = GsonParser.parseString(jsonObject.get("typeIn"));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaSearchExternalFilter");
		kparams.add("query", this.query);
		kparams.add("utcOffsetEqual", this.utcOffsetEqual);
		kparams.add("typeIn", this.typeIn);
		return kparams;
	}


    public static final Creator<SearchExternalFilter> CREATOR = new Creator<SearchExternalFilter>() {
        @Override
        public SearchExternalFilter createFromParcel(Parcel source) {
            return new SearchExternalFilter(source);
        }

        @Override
        public SearchExternalFilter[] newArray(int size) {
            return new SearchExternalFilter[size];
        }
    };

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        super.writeToParcel(dest, flags);
        dest.writeString(this.query);
        dest.writeValue(this.utcOffsetEqual);
        dest.writeString(this.typeIn);
    }

    public SearchExternalFilter(Parcel in) {
        super(in);
        this.query = in.readString();
        this.utcOffsetEqual = (Integer)in.readValue(Integer.class.getClassLoader());
        this.typeIn = in.readString();
    }
}

