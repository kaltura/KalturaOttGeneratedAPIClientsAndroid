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

/**
 * Report filter
 */
@SuppressWarnings("serial")
@MultiRequestBuilder.Tokenizer(DeviceReportFilter.Tokenizer.class)
public class DeviceReportFilter extends ReportFilter {
	
	public interface Tokenizer extends ReportFilter.Tokenizer {
		String lastAccessDateGreaterThanOrEqual();
	}

	/**
	 * Filter device configuration later than specific date
	 */
	private Long lastAccessDateGreaterThanOrEqual;

	// lastAccessDateGreaterThanOrEqual:
	public Long getLastAccessDateGreaterThanOrEqual(){
		return this.lastAccessDateGreaterThanOrEqual;
	}
	public void setLastAccessDateGreaterThanOrEqual(Long lastAccessDateGreaterThanOrEqual){
		this.lastAccessDateGreaterThanOrEqual = lastAccessDateGreaterThanOrEqual;
	}

	public void lastAccessDateGreaterThanOrEqual(String multirequestToken){
		setToken("lastAccessDateGreaterThanOrEqual", multirequestToken);
	}


	public DeviceReportFilter() {
		super();
	}

	public DeviceReportFilter(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		lastAccessDateGreaterThanOrEqual = GsonParser.parseLong(jsonObject.get("lastAccessDateGreaterThanOrEqual"));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaDeviceReportFilter");
		kparams.add("lastAccessDateGreaterThanOrEqual", this.lastAccessDateGreaterThanOrEqual);
		return kparams;
	}


    public static final Creator<DeviceReportFilter> CREATOR = new Creator<DeviceReportFilter>() {
        @Override
        public DeviceReportFilter createFromParcel(Parcel source) {
            return new DeviceReportFilter(source);
        }

        @Override
        public DeviceReportFilter[] newArray(int size) {
            return new DeviceReportFilter[size];
        }
    };

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        super.writeToParcel(dest, flags);
        dest.writeValue(this.lastAccessDateGreaterThanOrEqual);
    }

    public DeviceReportFilter(Parcel in) {
        super(in);
        this.lastAccessDateGreaterThanOrEqual = (Long)in.readValue(Long.class.getClassLoader());
    }
}

