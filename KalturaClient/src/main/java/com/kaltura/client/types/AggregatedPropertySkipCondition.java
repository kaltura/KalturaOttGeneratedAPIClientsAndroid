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
import com.kaltura.client.enums.AggregationType;
import com.kaltura.client.utils.GsonParser;
import com.kaltura.client.utils.request.MultiRequestBuilder;

/**
 * This class was generated using clients-generator\exec.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

/**
 * Skips current request according to aggregation condition on given property
 */
@SuppressWarnings("serial")
@MultiRequestBuilder.Tokenizer(AggregatedPropertySkipCondition.Tokenizer.class)
public class AggregatedPropertySkipCondition extends PropertySkipCondition {
	
	public interface Tokenizer extends PropertySkipCondition.Tokenizer {
		String aggregationType();
	}

	/**
	 * The aggregation type on which the condition is based on
	 */
	private AggregationType aggregationType;

	// aggregationType:
	public AggregationType getAggregationType(){
		return this.aggregationType;
	}
	public void setAggregationType(AggregationType aggregationType){
		this.aggregationType = aggregationType;
	}

	public void aggregationType(String multirequestToken){
		setToken("aggregationType", multirequestToken);
	}


	public AggregatedPropertySkipCondition() {
		super();
	}

	public AggregatedPropertySkipCondition(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		aggregationType = AggregationType.get(GsonParser.parseString(jsonObject.get("aggregationType")));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaAggregatedPropertySkipCondition");
		kparams.add("aggregationType", this.aggregationType);
		return kparams;
	}


    public static final Creator<AggregatedPropertySkipCondition> CREATOR = new Creator<AggregatedPropertySkipCondition>() {
        @Override
        public AggregatedPropertySkipCondition createFromParcel(Parcel source) {
            return new AggregatedPropertySkipCondition(source);
        }

        @Override
        public AggregatedPropertySkipCondition[] newArray(int size) {
            return new AggregatedPropertySkipCondition[size];
        }
    };

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        super.writeToParcel(dest, flags);
        dest.writeInt(this.aggregationType == null ? -1 : this.aggregationType.ordinal());
    }

    public AggregatedPropertySkipCondition(Parcel in) {
        super(in);
        int tmpAggregationType = in.readInt();
        this.aggregationType = tmpAggregationType == -1 ? null : AggregationType.values()[tmpAggregationType];
    }
}

