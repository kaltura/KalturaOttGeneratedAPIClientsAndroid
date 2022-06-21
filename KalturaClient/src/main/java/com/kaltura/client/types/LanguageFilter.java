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

/**
 * Language filter
 */
@SuppressWarnings("serial")
@MultiRequestBuilder.Tokenizer(LanguageFilter.Tokenizer.class)
public class LanguageFilter extends Filter {
	
	public interface Tokenizer extends Filter.Tokenizer {
		String codeIn();
		String excludePartner();
	}

	/**
	 * Language codes
	 */
	private String codeIn;
	/**
	 * Exclude partner
	 */
	private Boolean excludePartner;

	// codeIn:
	public String getCodeIn(){
		return this.codeIn;
	}
	public void setCodeIn(String codeIn){
		this.codeIn = codeIn;
	}

	public void codeIn(String multirequestToken){
		setToken("codeIn", multirequestToken);
	}

	// excludePartner:
	public Boolean getExcludePartner(){
		return this.excludePartner;
	}
	public void setExcludePartner(Boolean excludePartner){
		this.excludePartner = excludePartner;
	}

	public void excludePartner(String multirequestToken){
		setToken("excludePartner", multirequestToken);
	}


	public LanguageFilter() {
		super();
	}

	public LanguageFilter(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		codeIn = GsonParser.parseString(jsonObject.get("codeIn"));
		excludePartner = GsonParser.parseBoolean(jsonObject.get("excludePartner"));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaLanguageFilter");
		kparams.add("codeIn", this.codeIn);
		kparams.add("excludePartner", this.excludePartner);
		return kparams;
	}


    public static final Creator<LanguageFilter> CREATOR = new Creator<LanguageFilter>() {
        @Override
        public LanguageFilter createFromParcel(Parcel source) {
            return new LanguageFilter(source);
        }

        @Override
        public LanguageFilter[] newArray(int size) {
            return new LanguageFilter[size];
        }
    };

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        super.writeToParcel(dest, flags);
        dest.writeString(this.codeIn);
        dest.writeValue(this.excludePartner);
    }

    public LanguageFilter(Parcel in) {
        super(in);
        this.codeIn = in.readString();
        this.excludePartner = (Boolean)in.readValue(Boolean.class.getClassLoader());
    }
}

