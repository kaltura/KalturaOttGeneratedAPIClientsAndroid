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
import com.kaltura.client.types.ObjectBase;
import com.kaltura.client.utils.GsonParser;
import com.kaltura.client.utils.request.MultiRequestBuilder;

/**
 * This class was generated using exec.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

@SuppressWarnings("serial")
@MultiRequestBuilder.Tokenizer(PersonalActivityCleanupConfiguration.Tokenizer.class)
public class PersonalActivityCleanupConfiguration extends ObjectBase {
	
	public interface Tokenizer extends ObjectBase.Tokenizer {
		String retentionPeriodDays();
	}

	/**
	 * Retention Period Days
	 */
	private Long retentionPeriodDays;

	// retentionPeriodDays:
	public Long getRetentionPeriodDays(){
		return this.retentionPeriodDays;
	}
	public void setRetentionPeriodDays(Long retentionPeriodDays){
		this.retentionPeriodDays = retentionPeriodDays;
	}

	public void retentionPeriodDays(String multirequestToken){
		setToken("retentionPeriodDays", multirequestToken);
	}


	public PersonalActivityCleanupConfiguration() {
		super();
	}

	public PersonalActivityCleanupConfiguration(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		retentionPeriodDays = GsonParser.parseLong(jsonObject.get("retentionPeriodDays"));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaPersonalActivityCleanupConfiguration");
		kparams.add("retentionPeriodDays", this.retentionPeriodDays);
		return kparams;
	}


    public static final Creator<PersonalActivityCleanupConfiguration> CREATOR = new Creator<PersonalActivityCleanupConfiguration>() {
        @Override
        public PersonalActivityCleanupConfiguration createFromParcel(Parcel source) {
            return new PersonalActivityCleanupConfiguration(source);
        }

        @Override
        public PersonalActivityCleanupConfiguration[] newArray(int size) {
            return new PersonalActivityCleanupConfiguration[size];
        }
    };

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        super.writeToParcel(dest, flags);
        dest.writeValue(this.retentionPeriodDays);
    }

    public PersonalActivityCleanupConfiguration(Parcel in) {
        super(in);
        this.retentionPeriodDays = (Long)in.readValue(Long.class.getClassLoader());
    }
}

