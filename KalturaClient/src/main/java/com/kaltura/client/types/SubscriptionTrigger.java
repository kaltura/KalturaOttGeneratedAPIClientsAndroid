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
import com.kaltura.client.enums.SubscriptionTriggerType;
import com.kaltura.client.utils.GsonParser;
import com.kaltura.client.utils.request.MultiRequestBuilder;

/**
 * This class was generated using exec.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

@SuppressWarnings("serial")
@MultiRequestBuilder.Tokenizer(SubscriptionTrigger.Tokenizer.class)
public class SubscriptionTrigger extends Trigger {
	
	public interface Tokenizer extends Trigger.Tokenizer {
		String type();
		String offset();
	}

	/**
	 * Subscription trigger type
	 */
	private SubscriptionTriggerType type;
	/**
	 * Subscription trigger offset
	 */
	private Long offset;

	// type:
	public SubscriptionTriggerType getType(){
		return this.type;
	}
	public void setType(SubscriptionTriggerType type){
		this.type = type;
	}

	public void type(String multirequestToken){
		setToken("type", multirequestToken);
	}

	// offset:
	public Long getOffset(){
		return this.offset;
	}
	public void setOffset(Long offset){
		this.offset = offset;
	}

	public void offset(String multirequestToken){
		setToken("offset", multirequestToken);
	}


	public SubscriptionTrigger() {
		super();
	}

	public SubscriptionTrigger(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		type = SubscriptionTriggerType.get(GsonParser.parseString(jsonObject.get("type")));
		offset = GsonParser.parseLong(jsonObject.get("offset"));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaSubscriptionTrigger");
		kparams.add("type", this.type);
		kparams.add("offset", this.offset);
		return kparams;
	}


    public static final Creator<SubscriptionTrigger> CREATOR = new Creator<SubscriptionTrigger>() {
        @Override
        public SubscriptionTrigger createFromParcel(Parcel source) {
            return new SubscriptionTrigger(source);
        }

        @Override
        public SubscriptionTrigger[] newArray(int size) {
            return new SubscriptionTrigger[size];
        }
    };

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        super.writeToParcel(dest, flags);
        dest.writeInt(this.type == null ? -1 : this.type.ordinal());
        dest.writeValue(this.offset);
    }

    public SubscriptionTrigger(Parcel in) {
        super(in);
        int tmpType = in.readInt();
        this.type = tmpType == -1 ? null : SubscriptionTriggerType.values()[tmpType];
        this.offset = (Long)in.readValue(Long.class.getClassLoader());
    }
}

