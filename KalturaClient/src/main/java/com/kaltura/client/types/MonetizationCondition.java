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
import com.kaltura.client.enums.MonetizationType;
import com.kaltura.client.types.ObjectBase;
import com.kaltura.client.utils.GsonParser;
import com.kaltura.client.utils.request.MultiRequestBuilder;

/**
 * This class was generated using clients-generator\exec.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

/**
 * Defines a singular monetization condition
 */
@SuppressWarnings("serial")
@MultiRequestBuilder.Tokenizer(MonetizationCondition.Tokenizer.class)
public class MonetizationCondition extends ObjectBase {
	
	public interface Tokenizer extends ObjectBase.Tokenizer {
		String type();
		String minimumPrice();
		String multiplier();
	}

	/**
	 * Purchase type
	 */
	private MonetizationType type;
	/**
	 * Minimum price of purchase
	 */
	private Integer minimumPrice;
	/**
	 * Score multiplier
	 */
	private Integer multiplier;

	// type:
	public MonetizationType getType(){
		return this.type;
	}
	public void setType(MonetizationType type){
		this.type = type;
	}

	public void type(String multirequestToken){
		setToken("type", multirequestToken);
	}

	// minimumPrice:
	public Integer getMinimumPrice(){
		return this.minimumPrice;
	}
	public void setMinimumPrice(Integer minimumPrice){
		this.minimumPrice = minimumPrice;
	}

	public void minimumPrice(String multirequestToken){
		setToken("minimumPrice", multirequestToken);
	}

	// multiplier:
	public Integer getMultiplier(){
		return this.multiplier;
	}
	public void setMultiplier(Integer multiplier){
		this.multiplier = multiplier;
	}

	public void multiplier(String multirequestToken){
		setToken("multiplier", multirequestToken);
	}


	public MonetizationCondition() {
		super();
	}

	public MonetizationCondition(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		type = MonetizationType.get(GsonParser.parseString(jsonObject.get("type")));
		minimumPrice = GsonParser.parseInt(jsonObject.get("minimumPrice"));
		multiplier = GsonParser.parseInt(jsonObject.get("multiplier"));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaMonetizationCondition");
		kparams.add("type", this.type);
		kparams.add("minimumPrice", this.minimumPrice);
		kparams.add("multiplier", this.multiplier);
		return kparams;
	}


    public static final Creator<MonetizationCondition> CREATOR = new Creator<MonetizationCondition>() {
        @Override
        public MonetizationCondition createFromParcel(Parcel source) {
            return new MonetizationCondition(source);
        }

        @Override
        public MonetizationCondition[] newArray(int size) {
            return new MonetizationCondition[size];
        }
    };

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        super.writeToParcel(dest, flags);
        dest.writeInt(this.type == null ? -1 : this.type.ordinal());
        dest.writeValue(this.minimumPrice);
        dest.writeValue(this.multiplier);
    }

    public MonetizationCondition(Parcel in) {
        super(in);
        int tmpType = in.readInt();
        this.type = tmpType == -1 ? null : MonetizationType.values()[tmpType];
        this.minimumPrice = (Integer)in.readValue(Integer.class.getClassLoader());
        this.multiplier = (Integer)in.readValue(Integer.class.getClassLoader());
    }
}

