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
import com.kaltura.client.types.Condition;
import com.kaltura.client.utils.GsonParser;
import com.kaltura.client.utils.request.MultiRequestBuilder;

/**
 * This class was generated using exec.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

/**
 * SimpleExpression hold single condition
 */
@SuppressWarnings("serial")
@MultiRequestBuilder.Tokenizer(UserSessionCondition.Tokenizer.class)
public class UserSessionCondition extends UserSessionProfileExpression {
	
	public interface Tokenizer extends UserSessionProfileExpression.Tokenizer {
		Condition.Tokenizer condition();
	}

	/**
	 * expression
	 */
	private Condition condition;

	// condition:
	public Condition getCondition(){
		return this.condition;
	}
	public void setCondition(Condition condition){
		this.condition = condition;
	}


	public UserSessionCondition() {
		super();
	}

	public UserSessionCondition(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		condition = GsonParser.parseObject(jsonObject.getAsJsonObject("condition"), Condition.class);

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaUserSessionCondition");
		kparams.add("condition", this.condition);
		return kparams;
	}


    public static final Creator<UserSessionCondition> CREATOR = new Creator<UserSessionCondition>() {
        @Override
        public UserSessionCondition createFromParcel(Parcel source) {
            return new UserSessionCondition(source);
        }

        @Override
        public UserSessionCondition[] newArray(int size) {
            return new UserSessionCondition[size];
        }
    };

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        super.writeToParcel(dest, flags);
        dest.writeParcelable(this.condition, flags);
    }

    public UserSessionCondition(Parcel in) {
        super(in);
        this.condition = in.readParcelable(Condition.class.getClassLoader());
    }
}

