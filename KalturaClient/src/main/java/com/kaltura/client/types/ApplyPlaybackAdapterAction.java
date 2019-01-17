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
@MultiRequestBuilder.Tokenizer(ApplyPlaybackAdapterAction.Tokenizer.class)
public class ApplyPlaybackAdapterAction extends AssetRuleAction {
	
	public interface Tokenizer extends AssetRuleAction.Tokenizer {
		String adapterId();
	}

	/**
	 * Playback Adapter Identifier
	 */
	private Integer adapterId;

	// adapterId:
	public Integer getAdapterId(){
		return this.adapterId;
	}
	public void setAdapterId(Integer adapterId){
		this.adapterId = adapterId;
	}

	public void adapterId(String multirequestToken){
		setToken("adapterId", multirequestToken);
	}


	public ApplyPlaybackAdapterAction() {
		super();
	}

	public ApplyPlaybackAdapterAction(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		adapterId = GsonParser.parseInt(jsonObject.get("adapterId"));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaApplyPlaybackAdapterAction");
		kparams.add("adapterId", this.adapterId);
		return kparams;
	}


    public static final Creator<ApplyPlaybackAdapterAction> CREATOR = new Creator<ApplyPlaybackAdapterAction>() {
        @Override
        public ApplyPlaybackAdapterAction createFromParcel(Parcel source) {
            return new ApplyPlaybackAdapterAction(source);
        }

        @Override
        public ApplyPlaybackAdapterAction[] newArray(int size) {
            return new ApplyPlaybackAdapterAction[size];
        }
    };

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        super.writeToParcel(dest, flags);
        dest.writeValue(this.adapterId);
    }

    public ApplyPlaybackAdapterAction(Parcel in) {
        super(in);
        this.adapterId = (Integer)in.readValue(Integer.class.getClassLoader());
    }
}

