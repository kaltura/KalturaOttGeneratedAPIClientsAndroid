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
@MultiRequestBuilder.Tokenizer(IngestStatusEpgConfiguration.Tokenizer.class)
public class IngestStatusEpgConfiguration extends ObjectBase {
	
	public interface Tokenizer extends ObjectBase.Tokenizer {
		String isSupported();
		String retainingPeriod();
	}

	/**
	 * Defines whether partner in question enabled core ingest status service.
	 */
	private Boolean isSupported;
	/**
	 * Defines the time in seconds that the service retain information about ingest
	  status.
	 */
	private Long retainingPeriod;

	// isSupported:
	public Boolean getIsSupported(){
		return this.isSupported;
	}
	public void setIsSupported(Boolean isSupported){
		this.isSupported = isSupported;
	}

	public void isSupported(String multirequestToken){
		setToken("isSupported", multirequestToken);
	}

	// retainingPeriod:
	public Long getRetainingPeriod(){
		return this.retainingPeriod;
	}
	public void setRetainingPeriod(Long retainingPeriod){
		this.retainingPeriod = retainingPeriod;
	}

	public void retainingPeriod(String multirequestToken){
		setToken("retainingPeriod", multirequestToken);
	}


	public IngestStatusEpgConfiguration() {
		super();
	}

	public IngestStatusEpgConfiguration(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		isSupported = GsonParser.parseBoolean(jsonObject.get("isSupported"));
		retainingPeriod = GsonParser.parseLong(jsonObject.get("retainingPeriod"));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaIngestStatusEpgConfiguration");
		kparams.add("isSupported", this.isSupported);
		kparams.add("retainingPeriod", this.retainingPeriod);
		return kparams;
	}


    public static final Creator<IngestStatusEpgConfiguration> CREATOR = new Creator<IngestStatusEpgConfiguration>() {
        @Override
        public IngestStatusEpgConfiguration createFromParcel(Parcel source) {
            return new IngestStatusEpgConfiguration(source);
        }

        @Override
        public IngestStatusEpgConfiguration[] newArray(int size) {
            return new IngestStatusEpgConfiguration[size];
        }
    };

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        super.writeToParcel(dest, flags);
        dest.writeValue(this.isSupported);
        dest.writeValue(this.retainingPeriod);
    }

    public IngestStatusEpgConfiguration(Parcel in) {
        super(in);
        this.isSupported = (Boolean)in.readValue(Boolean.class.getClassLoader());
        this.retainingPeriod = (Long)in.readValue(Long.class.getClassLoader());
    }
}

