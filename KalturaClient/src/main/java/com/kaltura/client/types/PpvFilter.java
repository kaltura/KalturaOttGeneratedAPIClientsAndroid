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
 * Filtering Asset Struct Metas
 */
@SuppressWarnings("serial")
@MultiRequestBuilder.Tokenizer(PpvFilter.Tokenizer.class)
public class PpvFilter extends Filter {
	
	public interface Tokenizer extends Filter.Tokenizer {
		String idIn();
		String couponGroupIdEqual();
	}

	/**
	 * Comma separated identifiers
	 */
	private String idIn;
	/**
	 * couponGroupIdEqual
	 */
	private Integer couponGroupIdEqual;

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

	// couponGroupIdEqual:
	public Integer getCouponGroupIdEqual(){
		return this.couponGroupIdEqual;
	}
	public void setCouponGroupIdEqual(Integer couponGroupIdEqual){
		this.couponGroupIdEqual = couponGroupIdEqual;
	}

	public void couponGroupIdEqual(String multirequestToken){
		setToken("couponGroupIdEqual", multirequestToken);
	}


	public PpvFilter() {
		super();
	}

	public PpvFilter(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		idIn = GsonParser.parseString(jsonObject.get("idIn"));
		couponGroupIdEqual = GsonParser.parseInt(jsonObject.get("couponGroupIdEqual"));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaPpvFilter");
		kparams.add("idIn", this.idIn);
		kparams.add("couponGroupIdEqual", this.couponGroupIdEqual);
		return kparams;
	}


    public static final Creator<PpvFilter> CREATOR = new Creator<PpvFilter>() {
        @Override
        public PpvFilter createFromParcel(Parcel source) {
            return new PpvFilter(source);
        }

        @Override
        public PpvFilter[] newArray(int size) {
            return new PpvFilter[size];
        }
    };

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        super.writeToParcel(dest, flags);
        dest.writeString(this.idIn);
        dest.writeValue(this.couponGroupIdEqual);
    }

    public PpvFilter(Parcel in) {
        super(in);
        this.idIn = in.readString();
        this.couponGroupIdEqual = (Integer)in.readValue(Integer.class.getClassLoader());
    }
}

