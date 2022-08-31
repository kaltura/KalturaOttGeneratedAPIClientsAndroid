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
 * Filter for user segments
 */
@SuppressWarnings("serial")
@MultiRequestBuilder.Tokenizer(UserSegmentFilter.Tokenizer.class)
public class UserSegmentFilter extends Filter {
	
	public interface Tokenizer extends Filter.Tokenizer {
		String userIdEqual();
	}

	/**
	 * User ID
	 */
	private String userIdEqual;

	// userIdEqual:
	public String getUserIdEqual(){
		return this.userIdEqual;
	}
	public void setUserIdEqual(String userIdEqual){
		this.userIdEqual = userIdEqual;
	}

	public void userIdEqual(String multirequestToken){
		setToken("userIdEqual", multirequestToken);
	}


	public UserSegmentFilter() {
		super();
	}

	public UserSegmentFilter(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		userIdEqual = GsonParser.parseString(jsonObject.get("userIdEqual"));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaUserSegmentFilter");
		kparams.add("userIdEqual", this.userIdEqual);
		return kparams;
	}


    public static final Creator<UserSegmentFilter> CREATOR = new Creator<UserSegmentFilter>() {
        @Override
        public UserSegmentFilter createFromParcel(Parcel source) {
            return new UserSegmentFilter(source);
        }

        @Override
        public UserSegmentFilter[] newArray(int size) {
            return new UserSegmentFilter[size];
        }
    };

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        super.writeToParcel(dest, flags);
        dest.writeString(this.userIdEqual);
    }

    public UserSegmentFilter(Parcel in) {
        super(in);
        this.userIdEqual = in.readString();
    }
}

