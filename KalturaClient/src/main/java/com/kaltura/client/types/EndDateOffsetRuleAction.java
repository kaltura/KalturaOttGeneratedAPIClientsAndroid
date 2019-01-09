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
import com.kaltura.client.utils.request.MultiRequestBuilder;

/**
 * This class was generated using clients-generator\exec.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

/**
 * End date offset action
 */
@SuppressWarnings("serial")
@MultiRequestBuilder.Tokenizer(EndDateOffsetRuleAction.Tokenizer.class)
public class EndDateOffsetRuleAction extends TimeOffsetRuleAction {
	
	public interface Tokenizer extends TimeOffsetRuleAction.Tokenizer {
	}



	public EndDateOffsetRuleAction() {
		super();
	}

	public EndDateOffsetRuleAction(JsonObject jsonObject) throws APIException {
		super(jsonObject);
	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaEndDateOffsetRuleAction");
		return kparams;
	}


    public static final Creator<EndDateOffsetRuleAction> CREATOR = new Creator<EndDateOffsetRuleAction>() {
        @Override
        public EndDateOffsetRuleAction createFromParcel(Parcel source) {
            return new EndDateOffsetRuleAction(source);
        }

        @Override
        public EndDateOffsetRuleAction[] newArray(int size) {
            return new EndDateOffsetRuleAction[size];
        }
    };

    public EndDateOffsetRuleAction(Parcel in) {
        super(in);
    }
}

