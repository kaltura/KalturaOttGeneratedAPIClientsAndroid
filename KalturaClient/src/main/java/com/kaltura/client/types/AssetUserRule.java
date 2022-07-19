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
import com.kaltura.client.utils.request.RequestBuilder;
import java.util.ArrayList;
import java.util.List;

/**
 * This class was generated using exec.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

/**
 * Asset user rule
 */
@SuppressWarnings("serial")
@MultiRequestBuilder.Tokenizer(AssetUserRule.Tokenizer.class)
public class AssetUserRule extends AssetRuleBase {
	
	public interface Tokenizer extends AssetRuleBase.Tokenizer {
		RequestBuilder.ListTokenizer<AssetConditionBase.Tokenizer> conditions();
		RequestBuilder.ListTokenizer<AssetUserRuleAction.Tokenizer> actions();
	}

	/**
	 * List of conditions for the user rule
	 */
	private List<AssetConditionBase> conditions;
	/**
	 * List of actions for the user rule
	 */
	private List<AssetUserRuleAction> actions;

	// conditions:
	public List<AssetConditionBase> getConditions(){
		return this.conditions;
	}
	public void setConditions(List<AssetConditionBase> conditions){
		this.conditions = conditions;
	}

	// actions:
	public List<AssetUserRuleAction> getActions(){
		return this.actions;
	}
	public void setActions(List<AssetUserRuleAction> actions){
		this.actions = actions;
	}


	public AssetUserRule() {
		super();
	}

	public AssetUserRule(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		conditions = GsonParser.parseArray(jsonObject.getAsJsonArray("conditions"), AssetConditionBase.class);
		actions = GsonParser.parseArray(jsonObject.getAsJsonArray("actions"), AssetUserRuleAction.class);

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaAssetUserRule");
		kparams.add("conditions", this.conditions);
		kparams.add("actions", this.actions);
		return kparams;
	}


    public static final Creator<AssetUserRule> CREATOR = new Creator<AssetUserRule>() {
        @Override
        public AssetUserRule createFromParcel(Parcel source) {
            return new AssetUserRule(source);
        }

        @Override
        public AssetUserRule[] newArray(int size) {
            return new AssetUserRule[size];
        }
    };

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        super.writeToParcel(dest, flags);
        if(this.conditions != null) {
            dest.writeInt(this.conditions.size());
            dest.writeList(this.conditions);
        } else {
            dest.writeInt(-1);
        }
        if(this.actions != null) {
            dest.writeInt(this.actions.size());
            dest.writeList(this.actions);
        } else {
            dest.writeInt(-1);
        }
    }

    public AssetUserRule(Parcel in) {
        super(in);
        int conditionsSize = in.readInt();
        if( conditionsSize > -1) {
            this.conditions = new ArrayList<>();
            in.readList(this.conditions, AssetConditionBase.class.getClassLoader());
        }
        int actionsSize = in.readInt();
        if( actionsSize > -1) {
            this.actions = new ArrayList<>();
            in.readList(this.actions, AssetUserRuleAction.class.getClassLoader());
        }
    }
}

