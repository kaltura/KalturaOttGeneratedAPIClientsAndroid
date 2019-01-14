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
import com.kaltura.client.types.ObjectBase;
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
 * Discount details
 */
@SuppressWarnings("serial")
@MultiRequestBuilder.Tokenizer(DiscountDetails.Tokenizer.class)
public class DiscountDetails extends ObjectBase {
	
	public interface Tokenizer extends ObjectBase.Tokenizer {
		String id();
		String name();
		RequestBuilder.ListTokenizer<Discount.Tokenizer> multiCurrencyDiscount();
		String startDate();
		String endDate();
	}

	/**
	 * The discount ID
	 */
	private Integer id;
	/**
	 * The price code name
	 */
	private String name;
	/**
	 * Multi currency discounts for all countries and currencies
	 */
	private List<Discount> multiCurrencyDiscount;
	/**
	 * Start date represented as epoch
	 */
	private Long startDate;
	/**
	 * End date represented as epoch
	 */
	private Long endDate;

	// id:
	public Integer getId(){
		return this.id;
	}
	// name:
	public String getName(){
		return this.name;
	}
	public void setName(String name){
		this.name = name;
	}

	public void name(String multirequestToken){
		setToken("name", multirequestToken);
	}

	// multiCurrencyDiscount:
	public List<Discount> getMultiCurrencyDiscount(){
		return this.multiCurrencyDiscount;
	}
	public void setMultiCurrencyDiscount(List<Discount> multiCurrencyDiscount){
		this.multiCurrencyDiscount = multiCurrencyDiscount;
	}

	// startDate:
	public Long getStartDate(){
		return this.startDate;
	}
	public void setStartDate(Long startDate){
		this.startDate = startDate;
	}

	public void startDate(String multirequestToken){
		setToken("startDate", multirequestToken);
	}

	// endDate:
	public Long getEndDate(){
		return this.endDate;
	}
	public void setEndDate(Long endDate){
		this.endDate = endDate;
	}

	public void endDate(String multirequestToken){
		setToken("endDate", multirequestToken);
	}


	public DiscountDetails() {
		super();
	}

	public DiscountDetails(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		id = GsonParser.parseInt(jsonObject.get("id"));
		name = GsonParser.parseString(jsonObject.get("name"));
		multiCurrencyDiscount = GsonParser.parseArray(jsonObject.getAsJsonArray("multiCurrencyDiscount"), Discount.class);
		startDate = GsonParser.parseLong(jsonObject.get("startDate"));
		endDate = GsonParser.parseLong(jsonObject.get("endDate"));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaDiscountDetails");
		kparams.add("name", this.name);
		kparams.add("multiCurrencyDiscount", this.multiCurrencyDiscount);
		kparams.add("startDate", this.startDate);
		kparams.add("endDate", this.endDate);
		return kparams;
	}


    public static final Creator<DiscountDetails> CREATOR = new Creator<DiscountDetails>() {
        @Override
        public DiscountDetails createFromParcel(Parcel source) {
            return new DiscountDetails(source);
        }

        @Override
        public DiscountDetails[] newArray(int size) {
            return new DiscountDetails[size];
        }
    };

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        super.writeToParcel(dest, flags);
        dest.writeValue(this.id);
        dest.writeString(this.name);
        if(this.multiCurrencyDiscount != null) {
            dest.writeInt(this.multiCurrencyDiscount.size());
            dest.writeList(this.multiCurrencyDiscount);
        } else {
            dest.writeInt(-1);
        }
        dest.writeValue(this.startDate);
        dest.writeValue(this.endDate);
    }

    public DiscountDetails(Parcel in) {
        super(in);
        this.id = (Integer)in.readValue(Integer.class.getClassLoader());
        this.name = in.readString();
        int multiCurrencyDiscountSize = in.readInt();
        if( multiCurrencyDiscountSize > -1) {
            this.multiCurrencyDiscount = new ArrayList<>();
            in.readList(this.multiCurrencyDiscount, Discount.class.getClassLoader());
        }
        this.startDate = (Long)in.readValue(Long.class.getClassLoader());
        this.endDate = (Long)in.readValue(Long.class.getClassLoader());
    }
}

