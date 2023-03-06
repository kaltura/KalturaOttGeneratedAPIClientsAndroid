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
@MultiRequestBuilder.Tokenizer(RegionChannelNumberMultiLcns.Tokenizer.class)
public class RegionChannelNumberMultiLcns extends RegionChannelNumber {
	
	public interface Tokenizer extends RegionChannelNumber.Tokenizer {
		String lcns();
	}

	/**
	 * Linear channel numbers
	 */
	private String lcns;

	// lcns:
	public String getLcns(){
		return this.lcns;
	}
	public void setLcns(String lcns){
		this.lcns = lcns;
	}

	public void lcns(String multirequestToken){
		setToken("lcns", multirequestToken);
	}


	public RegionChannelNumberMultiLcns() {
		super();
	}

	public RegionChannelNumberMultiLcns(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		lcns = GsonParser.parseString(jsonObject.get("lcns"));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaRegionChannelNumberMultiLcns");
		kparams.add("lcns", this.lcns);
		return kparams;
	}


    public static final Creator<RegionChannelNumberMultiLcns> CREATOR = new Creator<RegionChannelNumberMultiLcns>() {
        @Override
        public RegionChannelNumberMultiLcns createFromParcel(Parcel source) {
            return new RegionChannelNumberMultiLcns(source);
        }

        @Override
        public RegionChannelNumberMultiLcns[] newArray(int size) {
            return new RegionChannelNumberMultiLcns[size];
        }
    };

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        super.writeToParcel(dest, flags);
        dest.writeString(this.lcns);
    }

    public RegionChannelNumberMultiLcns(Parcel in) {
        super(in);
        this.lcns = in.readString();
    }
}

