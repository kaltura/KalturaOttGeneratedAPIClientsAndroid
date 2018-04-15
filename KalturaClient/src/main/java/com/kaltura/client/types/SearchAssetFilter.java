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
// Copyright (C) 2006-2018  Kaltura Inc.
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
public class SearchAssetFilter extends AssetFilter {
	
	public interface Tokenizer extends AssetFilter.Tokenizer {
		String kSql();
		String typeIn();
		String idIn();
	}

	/**
	 * Search assets using dynamic criteria. Provided collection of nested expressions
	  with key, comparison operators, value, and logical conjunction.             
	  Possible keys: any Tag or Meta defined in the system and the following reserved
	  keys: start_date, end_date.               epg_id, media_id - for specific asset
	  IDs.              geo_block - only valid value is &amp;quot;true&amp;quot;: When
	  enabled, only assets that are not restriced to the user by geo-block rules will
	  return.              parental_rules - only valid value is
	  &amp;quot;true&amp;quot;: When enabled, only assets that the user
	  doesn&amp;#39;t need to provide PIN code will return.             
	  epg_channel_id – the channel identifier of the EPG program.             
	  entitled_assets - valid values: &amp;quot;free&amp;quot;,
	  &amp;quot;entitled&amp;quot;, &amp;quot;both&amp;quot;. free - gets only free to
	  watch assets. entitled - only those that the user is implicitly entitled to
	  watch.              Comparison operators: for numerical fields =, &amp;gt;,
	  &amp;gt;=, &amp;lt;, &amp;lt;=, : (in). For alpha-numerical fields =, != (not),
	  ~ (like), !~, ^ (starts with). Logical conjunction: and, or.              
	  Search values are limited to 20 characters each.              (maximum length of
	  entire filter is 2048 characters)
	 */
	private String kSql;
	/**
	 * Comma separated list of asset types to search within.               Possible
	  values: 0 – EPG linear programs entries; 1 - Recordings; Any media type ID
	  (according to media type IDs defined dynamically in the system).              If
	  omitted – all types should be included.
	 */
	private String typeIn;
	/**
	 * Comma separated list of EPG channel ids to search within.
	 */
	private String idIn;

	// kSql:
	public String getKSql(){
		return this.kSql;
	}
	public void setKSql(String kSql){
		this.kSql = kSql;
	}

	public void kSql(String multirequestToken){
		setToken("kSql", multirequestToken);
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
		kSql = GsonParser.parseString(jsonObject.get("kSql"));
		typeIn = GsonParser.parseString(jsonObject.get("typeIn"));
		idIn = GsonParser.parseString(jsonObject.get("idIn"));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaSearchAssetFilter");
		kparams.add("kSql", this.kSql);
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
        dest.writeString(this.kSql);
        dest.writeString(this.typeIn);
        dest.writeString(this.idIn);
    }

    public SearchAssetFilter(Parcel in) {
        super(in);
        this.kSql = in.readString();
        this.typeIn = in.readString();
        this.idIn = in.readString();
    }
}

