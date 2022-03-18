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
 * IP V6 range condition
 */
@SuppressWarnings("serial")
@MultiRequestBuilder.Tokenizer(IpV6RangeCondition.Tokenizer.class)
public class IpV6RangeCondition extends Condition {
	
	public interface Tokenizer extends Condition.Tokenizer {
		String fromIP();
		String toIP();
	}

	/**
	 * From IP address range
	 */
	private String fromIP;
	/**
	 * TO IP address range
	 */
	private String toIP;

	// fromIP:
	public String getFromIP(){
		return this.fromIP;
	}
	public void setFromIP(String fromIP){
		this.fromIP = fromIP;
	}

	public void fromIP(String multirequestToken){
		setToken("fromIP", multirequestToken);
	}

	// toIP:
	public String getToIP(){
		return this.toIP;
	}
	public void setToIP(String toIP){
		this.toIP = toIP;
	}

	public void toIP(String multirequestToken){
		setToken("toIP", multirequestToken);
	}


	public IpV6RangeCondition() {
		super();
	}

	public IpV6RangeCondition(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		fromIP = GsonParser.parseString(jsonObject.get("fromIP"));
		toIP = GsonParser.parseString(jsonObject.get("toIP"));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaIpV6RangeCondition");
		kparams.add("fromIP", this.fromIP);
		kparams.add("toIP", this.toIP);
		return kparams;
	}


    public static final Creator<IpV6RangeCondition> CREATOR = new Creator<IpV6RangeCondition>() {
        @Override
        public IpV6RangeCondition createFromParcel(Parcel source) {
            return new IpV6RangeCondition(source);
        }

        @Override
        public IpV6RangeCondition[] newArray(int size) {
            return new IpV6RangeCondition[size];
        }
    };

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        super.writeToParcel(dest, flags);
        dest.writeString(this.fromIP);
        dest.writeString(this.toIP);
    }

    public IpV6RangeCondition(Parcel in) {
        super(in);
        this.fromIP = in.readString();
        this.toIP = in.readString();
    }
}

