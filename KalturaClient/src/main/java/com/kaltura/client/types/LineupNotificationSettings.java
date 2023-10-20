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
@MultiRequestBuilder.Tokenizer(LineupNotificationSettings.Tokenizer.class)
public class LineupNotificationSettings extends ObjectBase {
	
	public interface Tokenizer extends ObjectBase.Tokenizer {
		String enabled();
	}

	/**
	 * if lineup notifications are enabled.
	 */
	private Boolean enabled;

	// enabled:
	public Boolean getEnabled(){
		return this.enabled;
	}
	public void setEnabled(Boolean enabled){
		this.enabled = enabled;
	}

	public void enabled(String multirequestToken){
		setToken("enabled", multirequestToken);
	}


	public LineupNotificationSettings() {
		super();
	}

	public LineupNotificationSettings(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		enabled = GsonParser.parseBoolean(jsonObject.get("enabled"));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaLineupNotificationSettings");
		kparams.add("enabled", this.enabled);
		return kparams;
	}


    public static final Creator<LineupNotificationSettings> CREATOR = new Creator<LineupNotificationSettings>() {
        @Override
        public LineupNotificationSettings createFromParcel(Parcel source) {
            return new LineupNotificationSettings(source);
        }

        @Override
        public LineupNotificationSettings[] newArray(int size) {
            return new LineupNotificationSettings[size];
        }
    };

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        super.writeToParcel(dest, flags);
        dest.writeValue(this.enabled);
    }

    public LineupNotificationSettings(Parcel in) {
        super(in);
        this.enabled = (Boolean)in.readValue(Boolean.class.getClassLoader());
    }
}

