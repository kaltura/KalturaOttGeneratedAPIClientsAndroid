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
// Copyright (C) 2006-2017  Kaltura Inc.
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
 * This class was generated using clients-generator\exec.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

/**  Price plan  */
@SuppressWarnings("serial")
@MultiRequestBuilder.Tokenizer(PricePlan.Tokenizer.class)
public class PricePlan extends UsageModule {
	
	public interface Tokenizer extends UsageModule.Tokenizer {
		String isRenewable();
		String renewalsNumber();
		String priceId();
		String discountId();
	}

	/**  Denotes whether or not this object can be renewed  */
	private Boolean isRenewable;
	/**  Defines the number of times the module will be renewed (for the life_cycle
	  period)  */
	private Integer renewalsNumber;
	/**  Unique identifier associated with this object&amp;#39;s price  */
	private Integer priceId;
	/**  The discount module identifier of the price plan  */
	private Long discountId;

	// isRenewable:
	public Boolean getIsRenewable(){
		return this.isRenewable;
	}
	public void setIsRenewable(Boolean isRenewable){
		this.isRenewable = isRenewable;
	}

	public void isRenewable(String multirequestToken){
		setToken("isRenewable", multirequestToken);
	}

	// renewalsNumber:
	public Integer getRenewalsNumber(){
		return this.renewalsNumber;
	}
	public void setRenewalsNumber(Integer renewalsNumber){
		this.renewalsNumber = renewalsNumber;
	}

	public void renewalsNumber(String multirequestToken){
		setToken("renewalsNumber", multirequestToken);
	}

	// priceId:
	public Integer getPriceId(){
		return this.priceId;
	}
	public void setPriceId(Integer priceId){
		this.priceId = priceId;
	}

	public void priceId(String multirequestToken){
		setToken("priceId", multirequestToken);
	}

	// discountId:
	public Long getDiscountId(){
		return this.discountId;
	}
	public void setDiscountId(Long discountId){
		this.discountId = discountId;
	}

	public void discountId(String multirequestToken){
		setToken("discountId", multirequestToken);
	}


	public PricePlan() {
		super();
	}

	public PricePlan(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		isRenewable = GsonParser.parseBoolean(jsonObject.get("isRenewable"));
		renewalsNumber = GsonParser.parseInt(jsonObject.get("renewalsNumber"));
		priceId = GsonParser.parseInt(jsonObject.get("priceId"));
		discountId = GsonParser.parseLong(jsonObject.get("discountId"));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaPricePlan");
		kparams.add("isRenewable", this.isRenewable);
		kparams.add("renewalsNumber", this.renewalsNumber);
		kparams.add("priceId", this.priceId);
		kparams.add("discountId", this.discountId);
		return kparams;
	}


    public static final Creator<PricePlan> CREATOR = new Creator<PricePlan>() {
        @Override
        public PricePlan createFromParcel(Parcel source) {
            return new PricePlan(source);
        }

        @Override
        public PricePlan[] newArray(int size) {
            return new PricePlan[size];
        }
    };

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        super.writeToParcel(dest, flags);
        dest.writeValue(this.isRenewable);
        dest.writeValue(this.renewalsNumber);
        dest.writeValue(this.priceId);
        dest.writeValue(this.discountId);
    }

    public PricePlan(Parcel in) {
        super(in);
        this.isRenewable = (Boolean)in.readValue(Boolean.class.getClassLoader());
        this.renewalsNumber = (Integer)in.readValue(Integer.class.getClassLoader());
        this.priceId = (Integer)in.readValue(Integer.class.getClassLoader());
        this.discountId = (Long)in.readValue(Long.class.getClassLoader());
    }
}

