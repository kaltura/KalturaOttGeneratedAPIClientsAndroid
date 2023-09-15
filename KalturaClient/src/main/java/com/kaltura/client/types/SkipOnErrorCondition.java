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
import com.kaltura.client.enums.SkipOptions;
import com.kaltura.client.utils.GsonParser;
import com.kaltura.client.utils.request.MultiRequestBuilder;

/**
 * This class was generated using exec.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

/**
 * Skips current request if an error occurs according to the selected skip option
 */
@SuppressWarnings("serial")
@MultiRequestBuilder.Tokenizer(SkipOnErrorCondition.Tokenizer.class)
public class SkipOnErrorCondition extends SkipCondition {
	
	public interface Tokenizer extends SkipCondition.Tokenizer {
		String condition();
	}

	/**
	 * Indicates which error should be considered to skip the current request
	 */
	private SkipOptions condition;

	// condition:
	public SkipOptions getCondition(){
		return this.condition;
	}
	public void setCondition(SkipOptions condition){
		this.condition = condition;
	}

	public void condition(String multirequestToken){
		setToken("condition", multirequestToken);
	}


	public SkipOnErrorCondition() {
		super();
	}

	public SkipOnErrorCondition(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		condition = SkipOptions.get(GsonParser.parseString(jsonObject.get("condition")));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaSkipOnErrorCondition");
		kparams.add("condition", this.condition);
		return kparams;
	}


    public static final Creator<SkipOnErrorCondition> CREATOR = new Creator<SkipOnErrorCondition>() {
        @Override
        public SkipOnErrorCondition createFromParcel(Parcel source) {
            return new SkipOnErrorCondition(source);
        }

        @Override
        public SkipOnErrorCondition[] newArray(int size) {
            return new SkipOnErrorCondition[size];
        }
    };

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        super.writeToParcel(dest, flags);
        dest.writeInt(this.condition == null ? -1 : this.condition.ordinal());
    }

    public SkipOnErrorCondition(Parcel in) {
        super(in);
        int tmpCondition = in.readInt();
        this.condition = tmpCondition == -1 ? null : SkipOptions.values()[tmpCondition];
    }
}

