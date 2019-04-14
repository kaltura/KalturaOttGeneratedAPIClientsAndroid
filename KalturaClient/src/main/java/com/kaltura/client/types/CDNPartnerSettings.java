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
@MultiRequestBuilder.Tokenizer(CDNPartnerSettings.Tokenizer.class)
public class CDNPartnerSettings extends ObjectBase {
	
	public interface Tokenizer extends ObjectBase.Tokenizer {
		String defaultAdapterId();
		String defaultRecordingAdapterId();
	}

	/**
	 * Default CDN adapter identifier
	 */
	private Integer defaultAdapterId;
	/**
	 * Default recording CDN adapter identifier
	 */
	private Integer defaultRecordingAdapterId;

	// defaultAdapterId:
	public Integer getDefaultAdapterId(){
		return this.defaultAdapterId;
	}
	public void setDefaultAdapterId(Integer defaultAdapterId){
		this.defaultAdapterId = defaultAdapterId;
	}

	public void defaultAdapterId(String multirequestToken){
		setToken("defaultAdapterId", multirequestToken);
	}

	// defaultRecordingAdapterId:
	public Integer getDefaultRecordingAdapterId(){
		return this.defaultRecordingAdapterId;
	}
	public void setDefaultRecordingAdapterId(Integer defaultRecordingAdapterId){
		this.defaultRecordingAdapterId = defaultRecordingAdapterId;
	}

	public void defaultRecordingAdapterId(String multirequestToken){
		setToken("defaultRecordingAdapterId", multirequestToken);
	}


	public CDNPartnerSettings() {
		super();
	}

	public CDNPartnerSettings(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		defaultAdapterId = GsonParser.parseInt(jsonObject.get("defaultAdapterId"));
		defaultRecordingAdapterId = GsonParser.parseInt(jsonObject.get("defaultRecordingAdapterId"));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaCDNPartnerSettings");
		kparams.add("defaultAdapterId", this.defaultAdapterId);
		kparams.add("defaultRecordingAdapterId", this.defaultRecordingAdapterId);
		return kparams;
	}


    public static final Creator<CDNPartnerSettings> CREATOR = new Creator<CDNPartnerSettings>() {
        @Override
        public CDNPartnerSettings createFromParcel(Parcel source) {
            return new CDNPartnerSettings(source);
        }

        @Override
        public CDNPartnerSettings[] newArray(int size) {
            return new CDNPartnerSettings[size];
        }
    };

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        super.writeToParcel(dest, flags);
        dest.writeValue(this.defaultAdapterId);
        dest.writeValue(this.defaultRecordingAdapterId);
    }

    public CDNPartnerSettings(Parcel in) {
        super(in);
        this.defaultAdapterId = (Integer)in.readValue(Integer.class.getClassLoader());
        this.defaultRecordingAdapterId = (Integer)in.readValue(Integer.class.getClassLoader());
    }
}

