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
 * User Session Profile filter
 */
@SuppressWarnings("serial")
@MultiRequestBuilder.Tokenizer(UserSessionProfileFilter.Tokenizer.class)
public class UserSessionProfileFilter extends Filter {
	
	public interface Tokenizer extends Filter.Tokenizer {
		String idEqual();
	}

	/**
	 * UserSessionProfile identifier to filter by
	 */
	private Long idEqual;

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


	public UserSessionProfileFilter() {
		super();
	}

	public UserSessionProfileFilter(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		idEqual = GsonParser.parseLong(jsonObject.get("idEqual"));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaUserSessionProfileFilter");
		kparams.add("idEqual", this.idEqual);
		return kparams;
	}


    public static final Creator<UserSessionProfileFilter> CREATOR = new Creator<UserSessionProfileFilter>() {
        @Override
        public UserSessionProfileFilter createFromParcel(Parcel source) {
            return new UserSessionProfileFilter(source);
        }

        @Override
        public UserSessionProfileFilter[] newArray(int size) {
            return new UserSessionProfileFilter[size];
        }
    };

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        super.writeToParcel(dest, flags);
        dest.writeValue(this.idEqual);
    }

    public UserSessionProfileFilter(Parcel in) {
        super(in);
        this.idEqual = (Long)in.readValue(Long.class.getClassLoader());
    }
}
