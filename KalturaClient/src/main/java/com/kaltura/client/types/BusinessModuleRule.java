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
import com.kaltura.client.utils.request.RequestBuilder;
import java.util.ArrayList;
import java.util.List;

/**
 * This class was generated using clients-generator\exec.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

/**
 * Business module rule
 */
@SuppressWarnings("serial")
@MultiRequestBuilder.Tokenizer(BusinessModuleRule.Tokenizer.class)
public class BusinessModuleRule extends Rule {
	
	public interface Tokenizer extends Rule.Tokenizer {
		RequestBuilder.ListTokenizer<Condition.Tokenizer> conditions();
		RequestBuilder.ListTokenizer<ApplyDiscountModuleAction.Tokenizer> actions();
	}

	/**
	 * List of conditions for the rule
	 */
	private List<Condition> conditions;
	/**
	 * List of actions for the rule
	 */
	private List<ApplyDiscountModuleAction> actions;

	// conditions:
	public List<Condition> getConditions(){
		return this.conditions;
	}
	public void setConditions(List<Condition> conditions){
		this.conditions = conditions;
	}

	// actions:
	public List<ApplyDiscountModuleAction> getActions(){
		return this.actions;
	}
	public void setActions(List<ApplyDiscountModuleAction> actions){
		this.actions = actions;
	}


	public BusinessModuleRule() {
		super();
	}

	public BusinessModuleRule(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		conditions = GsonParser.parseArray(jsonObject.getAsJsonArray("conditions"), Condition.class);
		actions = GsonParser.parseArray(jsonObject.getAsJsonArray("actions"), ApplyDiscountModuleAction.class);

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaBusinessModuleRule");
		kparams.add("conditions", this.conditions);
		kparams.add("actions", this.actions);
		return kparams;
	}


    public static final Creator<BusinessModuleRule> CREATOR = new Creator<BusinessModuleRule>() {
        @Override
        public BusinessModuleRule createFromParcel(Parcel source) {
            return new BusinessModuleRule(source);
        }

        @Override
        public BusinessModuleRule[] newArray(int size) {
            return new BusinessModuleRule[size];
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

    public BusinessModuleRule(Parcel in) {
        super(in);
        int conditionsSize = in.readInt();
        if( conditionsSize > -1) {
            this.conditions = new ArrayList<>();
            in.readList(this.conditions, Condition.class.getClassLoader());
        }
        int actionsSize = in.readInt();
        if( actionsSize > -1) {
            this.actions = new ArrayList<>();
            in.readList(this.actions, ApplyDiscountModuleAction.class.getClassLoader());
        }
    }
}

