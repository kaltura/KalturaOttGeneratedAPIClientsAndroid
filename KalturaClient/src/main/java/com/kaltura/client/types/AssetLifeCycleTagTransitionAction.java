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
@MultiRequestBuilder.Tokenizer(AssetLifeCycleTagTransitionAction.Tokenizer.class)
public class AssetLifeCycleTagTransitionAction extends AssetLifeCycleTransitionAction {
	
	public interface Tokenizer extends AssetLifeCycleTransitionAction.Tokenizer {
		String tagIds();
	}

	/**
	 * Comma separated list of tag Ids.
	 */
	private String tagIds;

	// tagIds:
	public String getTagIds(){
		return this.tagIds;
	}
	public void setTagIds(String tagIds){
		this.tagIds = tagIds;
	}

	public void tagIds(String multirequestToken){
		setToken("tagIds", multirequestToken);
	}


	public AssetLifeCycleTagTransitionAction() {
		super();
	}

	public AssetLifeCycleTagTransitionAction(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		tagIds = GsonParser.parseString(jsonObject.get("tagIds"));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaAssetLifeCycleTagTransitionAction");
		kparams.add("tagIds", this.tagIds);
		return kparams;
	}


    public static final Creator<AssetLifeCycleTagTransitionAction> CREATOR = new Creator<AssetLifeCycleTagTransitionAction>() {
        @Override
        public AssetLifeCycleTagTransitionAction createFromParcel(Parcel source) {
            return new AssetLifeCycleTagTransitionAction(source);
        }

        @Override
        public AssetLifeCycleTagTransitionAction[] newArray(int size) {
            return new AssetLifeCycleTagTransitionAction[size];
        }
    };

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        super.writeToParcel(dest, flags);
        dest.writeString(this.tagIds);
    }

    public AssetLifeCycleTagTransitionAction(Parcel in) {
        super(in);
        this.tagIds = in.readString();
    }
}

