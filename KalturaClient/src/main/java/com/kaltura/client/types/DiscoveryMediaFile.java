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
 * Media file in discovery context
 */
@SuppressWarnings("serial")
@MultiRequestBuilder.Tokenizer(DiscoveryMediaFile.Tokenizer.class)
public class DiscoveryMediaFile extends MediaFile {
	
	public interface Tokenizer extends MediaFile.Tokenizer {
		String isPlaybackable();
	}

	/**
	 * show, if file could be played
	 */
	private Boolean isPlaybackable;

	// isPlaybackable:
	public Boolean getIsPlaybackable(){
		return this.isPlaybackable;
	}
	public void setIsPlaybackable(Boolean isPlaybackable){
		this.isPlaybackable = isPlaybackable;
	}

	public void isPlaybackable(String multirequestToken){
		setToken("isPlaybackable", multirequestToken);
	}


	public DiscoveryMediaFile() {
		super();
	}

	public DiscoveryMediaFile(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		isPlaybackable = GsonParser.parseBoolean(jsonObject.get("isPlaybackable"));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaDiscoveryMediaFile");
		kparams.add("isPlaybackable", this.isPlaybackable);
		return kparams;
	}


    public static final Creator<DiscoveryMediaFile> CREATOR = new Creator<DiscoveryMediaFile>() {
        @Override
        public DiscoveryMediaFile createFromParcel(Parcel source) {
            return new DiscoveryMediaFile(source);
        }

        @Override
        public DiscoveryMediaFile[] newArray(int size) {
            return new DiscoveryMediaFile[size];
        }
    };

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        super.writeToParcel(dest, flags);
        dest.writeValue(this.isPlaybackable);
    }

    public DiscoveryMediaFile(Parcel in) {
        super(in);
        this.isPlaybackable = (Boolean)in.readValue(Boolean.class.getClassLoader());
    }
}

