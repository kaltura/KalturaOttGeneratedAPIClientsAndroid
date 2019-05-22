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
// Copyright (C) 2006-2019  Kaltura Inc.
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
@MultiRequestBuilder.Tokenizer(SubscriptionSubscribeReference.Tokenizer.class)
public class SubscriptionSubscribeReference extends SubscribeReference {
	
	public interface Tokenizer extends SubscribeReference.Tokenizer {
		String subscriptionId();
	}

	/**
	 * Subscription ID
	 */
	private Long subscriptionId;

	// subscriptionId:
	public Long getSubscriptionId(){
		return this.subscriptionId;
	}
	public void setSubscriptionId(Long subscriptionId){
		this.subscriptionId = subscriptionId;
	}

	public void subscriptionId(String multirequestToken){
		setToken("subscriptionId", multirequestToken);
	}


	public SubscriptionSubscribeReference() {
		super();
	}

	public SubscriptionSubscribeReference(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		subscriptionId = GsonParser.parseLong(jsonObject.get("subscriptionId"));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaSubscriptionSubscribeReference");
		kparams.add("subscriptionId", this.subscriptionId);
		return kparams;
	}


    public static final Creator<SubscriptionSubscribeReference> CREATOR = new Creator<SubscriptionSubscribeReference>() {
        @Override
        public SubscriptionSubscribeReference createFromParcel(Parcel source) {
            return new SubscriptionSubscribeReference(source);
        }

        @Override
        public SubscriptionSubscribeReference[] newArray(int size) {
            return new SubscriptionSubscribeReference[size];
        }
    };

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        super.writeToParcel(dest, flags);
        dest.writeValue(this.subscriptionId);
    }

    public SubscriptionSubscribeReference(Parcel in) {
        super(in);
        this.subscriptionId = (Long)in.readValue(Long.class.getClassLoader());
    }
}

