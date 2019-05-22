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
import com.kaltura.client.enums.AssetLifeCycleRuleActionType;
import com.kaltura.client.enums.AssetLifeCycleRuleTransitionType;
import com.kaltura.client.utils.GsonParser;
import com.kaltura.client.utils.request.MultiRequestBuilder;

/**
 * This class was generated using exec.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

@SuppressWarnings("serial")
@MultiRequestBuilder.Tokenizer(AssetLifeCycleTransitionAction.Tokenizer.class)
public abstract class AssetLifeCycleTransitionAction extends AssetRuleAction {
	
	public interface Tokenizer extends AssetRuleAction.Tokenizer {
		String assetLifeCycleRuleActionType();
		String assetLifeCycleRuleTransitionType();
	}

	/**
	 * Asset LifeCycle Rule Action Type
	 */
	private AssetLifeCycleRuleActionType assetLifeCycleRuleActionType;
	/**
	 * Asset LifeCycle Rule Transition Type
	 */
	private AssetLifeCycleRuleTransitionType assetLifeCycleRuleTransitionType;

	// assetLifeCycleRuleActionType:
	public AssetLifeCycleRuleActionType getAssetLifeCycleRuleActionType(){
		return this.assetLifeCycleRuleActionType;
	}
	public void setAssetLifeCycleRuleActionType(AssetLifeCycleRuleActionType assetLifeCycleRuleActionType){
		this.assetLifeCycleRuleActionType = assetLifeCycleRuleActionType;
	}

	public void assetLifeCycleRuleActionType(String multirequestToken){
		setToken("assetLifeCycleRuleActionType", multirequestToken);
	}

	// assetLifeCycleRuleTransitionType:
	public AssetLifeCycleRuleTransitionType getAssetLifeCycleRuleTransitionType(){
		return this.assetLifeCycleRuleTransitionType;
	}

	public AssetLifeCycleTransitionAction() {
		super();
	}

	public AssetLifeCycleTransitionAction(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		assetLifeCycleRuleActionType = AssetLifeCycleRuleActionType.get(GsonParser.parseString(jsonObject.get("assetLifeCycleRuleActionType")));
		assetLifeCycleRuleTransitionType = AssetLifeCycleRuleTransitionType.get(GsonParser.parseString(jsonObject.get("assetLifeCycleRuleTransitionType")));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaAssetLifeCycleTransitionAction");
		kparams.add("assetLifeCycleRuleActionType", this.assetLifeCycleRuleActionType);
		return kparams;
	}


    @Override
    public void writeToParcel(Parcel dest, int flags) {
        super.writeToParcel(dest, flags);
        dest.writeInt(this.assetLifeCycleRuleActionType == null ? -1 : this.assetLifeCycleRuleActionType.ordinal());
        dest.writeInt(this.assetLifeCycleRuleTransitionType == null ? -1 : this.assetLifeCycleRuleTransitionType.ordinal());
    }

    public AssetLifeCycleTransitionAction(Parcel in) {
        super(in);
        int tmpAssetLifeCycleRuleActionType = in.readInt();
        this.assetLifeCycleRuleActionType = tmpAssetLifeCycleRuleActionType == -1 ? null : AssetLifeCycleRuleActionType.values()[tmpAssetLifeCycleRuleActionType];
        int tmpAssetLifeCycleRuleTransitionType = in.readInt();
        this.assetLifeCycleRuleTransitionType = tmpAssetLifeCycleRuleTransitionType == -1 ? null : AssetLifeCycleRuleTransitionType.values()[tmpAssetLifeCycleRuleTransitionType];
    }
}

