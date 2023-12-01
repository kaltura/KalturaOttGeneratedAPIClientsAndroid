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
 * Define on demand response
 */
@SuppressWarnings("serial")
@MultiRequestBuilder.Tokenizer(OnDemandResponseProfile.Tokenizer.class)
public class OnDemandResponseProfile extends DetachedResponseProfile {
	
	public interface Tokenizer extends DetachedResponseProfile.Tokenizer {
		String retrievedProperties();
	}

	/**
	 * Comma seperated properties names
	 */
	private String retrievedProperties;

	// retrievedProperties:
	public String getRetrievedProperties(){
		return this.retrievedProperties;
	}
	public void setRetrievedProperties(String retrievedProperties){
		this.retrievedProperties = retrievedProperties;
	}

	public void retrievedProperties(String multirequestToken){
		setToken("retrievedProperties", multirequestToken);
	}


	public OnDemandResponseProfile() {
		super();
	}

	public OnDemandResponseProfile(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		retrievedProperties = GsonParser.parseString(jsonObject.get("retrievedProperties"));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaOnDemandResponseProfile");
		kparams.add("retrievedProperties", this.retrievedProperties);
		return kparams;
	}


    public static final Creator<OnDemandResponseProfile> CREATOR = new Creator<OnDemandResponseProfile>() {
        @Override
        public OnDemandResponseProfile createFromParcel(Parcel source) {
            return new OnDemandResponseProfile(source);
        }

        @Override
        public OnDemandResponseProfile[] newArray(int size) {
            return new OnDemandResponseProfile[size];
        }
    };

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        super.writeToParcel(dest, flags);
        dest.writeString(this.retrievedProperties);
    }

    public OnDemandResponseProfile(Parcel in) {
        super(in);
        this.retrievedProperties = in.readString();
    }
}

