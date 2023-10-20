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
 * TVM geo rule
 */
@SuppressWarnings("serial")
@MultiRequestBuilder.Tokenizer(TvmDeviceRule.Tokenizer.class)
public class TvmDeviceRule extends TvmRule {
	
	public interface Tokenizer extends TvmRule.Tokenizer {
		String deviceBrandIds();
	}

	/**
	 * Comma separated list of country Ids.
	 */
	private String deviceBrandIds;

	// deviceBrandIds:
	public String getDeviceBrandIds(){
		return this.deviceBrandIds;
	}
	public void setDeviceBrandIds(String deviceBrandIds){
		this.deviceBrandIds = deviceBrandIds;
	}

	public void deviceBrandIds(String multirequestToken){
		setToken("deviceBrandIds", multirequestToken);
	}


	public TvmDeviceRule() {
		super();
	}

	public TvmDeviceRule(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		deviceBrandIds = GsonParser.parseString(jsonObject.get("deviceBrandIds"));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaTvmDeviceRule");
		kparams.add("deviceBrandIds", this.deviceBrandIds);
		return kparams;
	}


    public static final Creator<TvmDeviceRule> CREATOR = new Creator<TvmDeviceRule>() {
        @Override
        public TvmDeviceRule createFromParcel(Parcel source) {
            return new TvmDeviceRule(source);
        }

        @Override
        public TvmDeviceRule[] newArray(int size) {
            return new TvmDeviceRule[size];
        }
    };

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        super.writeToParcel(dest, flags);
        dest.writeString(this.deviceBrandIds);
    }

    public TvmDeviceRule(Parcel in) {
        super(in);
        this.deviceBrandIds = in.readString();
    }
}

