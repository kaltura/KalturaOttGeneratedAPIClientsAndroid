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

@SuppressWarnings("serial")
@MultiRequestBuilder.Tokenizer(SubscriptionDependencySetFilter.Tokenizer.class)
public class SubscriptionDependencySetFilter extends SubscriptionSetFilter {
	
	public interface Tokenizer extends SubscriptionSetFilter.Tokenizer {
		String baseSubscriptionIdIn();
	}

	/**
	 * Comma separated identifiers
	 */
	private String baseSubscriptionIdIn;

	// baseSubscriptionIdIn:
	public String getBaseSubscriptionIdIn(){
		return this.baseSubscriptionIdIn;
	}
	public void setBaseSubscriptionIdIn(String baseSubscriptionIdIn){
		this.baseSubscriptionIdIn = baseSubscriptionIdIn;
	}

	public void baseSubscriptionIdIn(String multirequestToken){
		setToken("baseSubscriptionIdIn", multirequestToken);
	}


	public SubscriptionDependencySetFilter() {
		super();
	}

	public SubscriptionDependencySetFilter(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		baseSubscriptionIdIn = GsonParser.parseString(jsonObject.get("baseSubscriptionIdIn"));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaSubscriptionDependencySetFilter");
		kparams.add("baseSubscriptionIdIn", this.baseSubscriptionIdIn);
		return kparams;
	}


    public static final Creator<SubscriptionDependencySetFilter> CREATOR = new Creator<SubscriptionDependencySetFilter>() {
        @Override
        public SubscriptionDependencySetFilter createFromParcel(Parcel source) {
            return new SubscriptionDependencySetFilter(source);
        }

        @Override
        public SubscriptionDependencySetFilter[] newArray(int size) {
            return new SubscriptionDependencySetFilter[size];
        }
    };

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        super.writeToParcel(dest, flags);
        dest.writeString(this.baseSubscriptionIdIn);
    }

    public SubscriptionDependencySetFilter(Parcel in) {
        super(in);
        this.baseSubscriptionIdIn = in.readString();
    }
}

