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
import com.kaltura.client.types.Price;
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

@SuppressWarnings("serial")
@MultiRequestBuilder.Tokenizer(UnifiedPaymentRenewal.Tokenizer.class)
public class UnifiedPaymentRenewal extends ObjectBase {
	
	public interface Tokenizer extends ObjectBase.Tokenizer {
		Price.Tokenizer price();
		String date();
		String unifiedPaymentId();
		RequestBuilder.ListTokenizer<EntitlementRenewalBase.Tokenizer> entitlements();
	}

	/**
	 * Price that is going to be paid on the renewal
	 */
	private Price price;
	/**
	 * Next renewal date
	 */
	private Long date;
	/**
	 * Unified payment ID
	 */
	private Long unifiedPaymentId;
	/**
	 * List of entitlements in this unified payment renewal
	 */
	private List<EntitlementRenewalBase> entitlements;

	// price:
	public Price getPrice(){
		return this.price;
	}
	public void setPrice(Price price){
		this.price = price;
	}

	// date:
	public Long getDate(){
		return this.date;
	}
	public void setDate(Long date){
		this.date = date;
	}

	public void date(String multirequestToken){
		setToken("date", multirequestToken);
	}

	// unifiedPaymentId:
	public Long getUnifiedPaymentId(){
		return this.unifiedPaymentId;
	}
	public void setUnifiedPaymentId(Long unifiedPaymentId){
		this.unifiedPaymentId = unifiedPaymentId;
	}

	public void unifiedPaymentId(String multirequestToken){
		setToken("unifiedPaymentId", multirequestToken);
	}

	// entitlements:
	public List<EntitlementRenewalBase> getEntitlements(){
		return this.entitlements;
	}
	public void setEntitlements(List<EntitlementRenewalBase> entitlements){
		this.entitlements = entitlements;
	}


	public UnifiedPaymentRenewal() {
		super();
	}

	public UnifiedPaymentRenewal(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		price = GsonParser.parseObject(jsonObject.getAsJsonObject("price"), Price.class);
		date = GsonParser.parseLong(jsonObject.get("date"));
		unifiedPaymentId = GsonParser.parseLong(jsonObject.get("unifiedPaymentId"));
		entitlements = GsonParser.parseArray(jsonObject.getAsJsonArray("entitlements"), EntitlementRenewalBase.class);

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaUnifiedPaymentRenewal");
		kparams.add("price", this.price);
		kparams.add("date", this.date);
		kparams.add("unifiedPaymentId", this.unifiedPaymentId);
		kparams.add("entitlements", this.entitlements);
		return kparams;
	}


    public static final Creator<UnifiedPaymentRenewal> CREATOR = new Creator<UnifiedPaymentRenewal>() {
        @Override
        public UnifiedPaymentRenewal createFromParcel(Parcel source) {
            return new UnifiedPaymentRenewal(source);
        }

        @Override
        public UnifiedPaymentRenewal[] newArray(int size) {
            return new UnifiedPaymentRenewal[size];
        }
    };

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        super.writeToParcel(dest, flags);
        dest.writeParcelable(this.price, flags);
        dest.writeValue(this.date);
        dest.writeValue(this.unifiedPaymentId);
        if(this.entitlements != null) {
            dest.writeInt(this.entitlements.size());
            dest.writeList(this.entitlements);
        } else {
            dest.writeInt(-1);
        }
    }

    public UnifiedPaymentRenewal(Parcel in) {
        super(in);
        this.price = in.readParcelable(Price.class.getClassLoader());
        this.date = (Long)in.readValue(Long.class.getClassLoader());
        this.unifiedPaymentId = (Long)in.readValue(Long.class.getClassLoader());
        int entitlementsSize = in.readInt();
        if( entitlementsSize > -1) {
            this.entitlements = new ArrayList<>();
            in.readList(this.entitlements, EntitlementRenewalBase.class.getClassLoader());
        }
    }
}

