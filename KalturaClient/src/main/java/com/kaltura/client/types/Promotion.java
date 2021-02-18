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
import com.kaltura.client.types.ObjectBase;
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
 * Promotion
 */
@SuppressWarnings("serial")
@MultiRequestBuilder.Tokenizer(Promotion.Tokenizer.class)
public class Promotion extends ObjectBase {
	
	public interface Tokenizer extends ObjectBase.Tokenizer {
		String discountModuleId();
		RequestBuilder.ListTokenizer<Condition.Tokenizer> conditions();
		String numberOfRecurring();
	}

	/**
	 * The discount module id that is promoted to the user
	 */
	private Long discountModuleId;
	/**
	 * These conditions define the Promotion that applies on
	 */
	private List<Condition> conditions;
	/**
	 * the numer of recurring for this promotion
	 */
	private Integer numberOfRecurring;

	// discountModuleId:
	public Long getDiscountModuleId(){
		return this.discountModuleId;
	}
	public void setDiscountModuleId(Long discountModuleId){
		this.discountModuleId = discountModuleId;
	}

	public void discountModuleId(String multirequestToken){
		setToken("discountModuleId", multirequestToken);
	}

	// conditions:
	public List<Condition> getConditions(){
		return this.conditions;
	}
	public void setConditions(List<Condition> conditions){
		this.conditions = conditions;
	}

	// numberOfRecurring:
	public Integer getNumberOfRecurring(){
		return this.numberOfRecurring;
	}
	public void setNumberOfRecurring(Integer numberOfRecurring){
		this.numberOfRecurring = numberOfRecurring;
	}

	public void numberOfRecurring(String multirequestToken){
		setToken("numberOfRecurring", multirequestToken);
	}


	public Promotion() {
		super();
	}

	public Promotion(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		discountModuleId = GsonParser.parseLong(jsonObject.get("discountModuleId"));
		conditions = GsonParser.parseArray(jsonObject.getAsJsonArray("conditions"), Condition.class);
		numberOfRecurring = GsonParser.parseInt(jsonObject.get("numberOfRecurring"));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaPromotion");
		kparams.add("discountModuleId", this.discountModuleId);
		kparams.add("conditions", this.conditions);
		kparams.add("numberOfRecurring", this.numberOfRecurring);
		return kparams;
	}


    public static final Creator<Promotion> CREATOR = new Creator<Promotion>() {
        @Override
        public Promotion createFromParcel(Parcel source) {
            return new Promotion(source);
        }

        @Override
        public Promotion[] newArray(int size) {
            return new Promotion[size];
        }
    };

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        super.writeToParcel(dest, flags);
        dest.writeValue(this.discountModuleId);
        if(this.conditions != null) {
            dest.writeInt(this.conditions.size());
            dest.writeList(this.conditions);
        } else {
            dest.writeInt(-1);
        }
        dest.writeValue(this.numberOfRecurring);
    }

    public Promotion(Parcel in) {
        super(in);
        this.discountModuleId = (Long)in.readValue(Long.class.getClassLoader());
        int conditionsSize = in.readInt();
        if( conditionsSize > -1) {
            this.conditions = new ArrayList<>();
            in.readList(this.conditions, Condition.class.getClassLoader());
        }
        this.numberOfRecurring = (Integer)in.readValue(Integer.class.getClassLoader());
    }
}
