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
 * Program asset group offer filter
 */
@SuppressWarnings("serial")
@MultiRequestBuilder.Tokenizer(ProgramAssetGroupOfferFilter.Tokenizer.class)
public class ProgramAssetGroupOfferFilter extends Filter {
	
	public interface Tokenizer extends Filter.Tokenizer {
		String alsoInactive();
		String nameContains();
	}

	/**
	 * return also inactive
	 */
	private Boolean alsoInactive;
	/**
	 * A string that is included in the PAGO name
	 */
	private String nameContains;

	// alsoInactive:
	public Boolean getAlsoInactive(){
		return this.alsoInactive;
	}
	public void setAlsoInactive(Boolean alsoInactive){
		this.alsoInactive = alsoInactive;
	}

	public void alsoInactive(String multirequestToken){
		setToken("alsoInactive", multirequestToken);
	}

	// nameContains:
	public String getNameContains(){
		return this.nameContains;
	}
	public void setNameContains(String nameContains){
		this.nameContains = nameContains;
	}

	public void nameContains(String multirequestToken){
		setToken("nameContains", multirequestToken);
	}


	public ProgramAssetGroupOfferFilter() {
		super();
	}

	public ProgramAssetGroupOfferFilter(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		alsoInactive = GsonParser.parseBoolean(jsonObject.get("alsoInactive"));
		nameContains = GsonParser.parseString(jsonObject.get("nameContains"));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaProgramAssetGroupOfferFilter");
		kparams.add("alsoInactive", this.alsoInactive);
		kparams.add("nameContains", this.nameContains);
		return kparams;
	}


    public static final Creator<ProgramAssetGroupOfferFilter> CREATOR = new Creator<ProgramAssetGroupOfferFilter>() {
        @Override
        public ProgramAssetGroupOfferFilter createFromParcel(Parcel source) {
            return new ProgramAssetGroupOfferFilter(source);
        }

        @Override
        public ProgramAssetGroupOfferFilter[] newArray(int size) {
            return new ProgramAssetGroupOfferFilter[size];
        }
    };

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        super.writeToParcel(dest, flags);
        dest.writeValue(this.alsoInactive);
        dest.writeString(this.nameContains);
    }

    public ProgramAssetGroupOfferFilter(Parcel in) {
        super(in);
        this.alsoInactive = (Boolean)in.readValue(Boolean.class.getClassLoader());
        this.nameContains = in.readString();
    }
}

