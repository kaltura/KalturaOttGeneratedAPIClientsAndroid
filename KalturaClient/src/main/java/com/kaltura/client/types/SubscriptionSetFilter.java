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
// Copyright (C) 2006-2017  Kaltura Inc.
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

@SuppressWarnings("serial")
@MultiRequestBuilder.Tokenizer(SubscriptionSetFilter.Tokenizer.class)
public class SubscriptionSetFilter extends Filter {
	
	public interface Tokenizer extends Filter.Tokenizer {
		String idIn();
		String subscriptionIdContains();
	}

	/**  Comma separated identifiers  */
	private String idIn;
	/**  Comma separated subscription identifiers  */
	private String subscriptionIdContains;

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

	// subscriptionIdContains:
	public String getSubscriptionIdContains(){
		return this.subscriptionIdContains;
	}
	public void setSubscriptionIdContains(String subscriptionIdContains){
		this.subscriptionIdContains = subscriptionIdContains;
	}

	public void subscriptionIdContains(String multirequestToken){
		setToken("subscriptionIdContains", multirequestToken);
	}


	public SubscriptionSetFilter() {
		super();
	}

	public SubscriptionSetFilter(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		idIn = GsonParser.parseString(jsonObject.get("idIn"));
		subscriptionIdContains = GsonParser.parseString(jsonObject.get("subscriptionIdContains"));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaSubscriptionSetFilter");
		kparams.add("idIn", this.idIn);
		kparams.add("subscriptionIdContains", this.subscriptionIdContains);
		return kparams;
	}


    public static final Creator<SubscriptionSetFilter> CREATOR = new Creator<SubscriptionSetFilter>() {
        @Override
        public SubscriptionSetFilter createFromParcel(Parcel source) {
            return new SubscriptionSetFilter(source);
        }

        @Override
        public SubscriptionSetFilter[] newArray(int size) {
            return new SubscriptionSetFilter[size];
        }
    };

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        super.writeToParcel(dest, flags);
        dest.writeString(this.idIn);
        dest.writeString(this.subscriptionIdContains);
    }

    public SubscriptionSetFilter(Parcel in) {
        super(in);
        this.idIn = in.readString();
        this.subscriptionIdContains = in.readString();
    }
}

