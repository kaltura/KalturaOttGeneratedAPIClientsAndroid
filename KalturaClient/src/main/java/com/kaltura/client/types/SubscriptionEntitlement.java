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

/**
 * KalturaSubscriptionEntitlement
 */
@SuppressWarnings("serial")
@MultiRequestBuilder.Tokenizer(SubscriptionEntitlement.Tokenizer.class)
public class SubscriptionEntitlement extends Entitlement {
	
	public interface Tokenizer extends Entitlement.Tokenizer {
		String nextRenewalDate();
		String isRenewableForPurchase();
		String isRenewable();
		String isInGracePeriod();
		String paymentGatewayId();
		String paymentMethodId();
	}

	/**
	 * The date of the next renewal (only for subscription)
	 */
	private Long nextRenewalDate;
	/**
	 * Indicates whether the subscription is renewable in this purchase (only for
	  subscription)
	 */
	private Boolean isRenewableForPurchase;
	/**
	 * Indicates whether a subscription is renewable (only for subscription)
	 */
	private Boolean isRenewable;
	/**
	 * Indicates whether the user is currently in his grace period entitlement
	 */
	private Boolean isInGracePeriod;
	/**
	 * Payment Gateway identifier
	 */
	private Integer paymentGatewayId;
	/**
	 * Payment Method identifier
	 */
	private Integer paymentMethodId;

	// nextRenewalDate:
	public Long getNextRenewalDate(){
		return this.nextRenewalDate;
	}
	public void setNextRenewalDate(Long nextRenewalDate){
		this.nextRenewalDate = nextRenewalDate;
	}

	public void nextRenewalDate(String multirequestToken){
		setToken("nextRenewalDate", multirequestToken);
	}

	// isRenewableForPurchase:
	public Boolean getIsRenewableForPurchase(){
		return this.isRenewableForPurchase;
	}
	public void setIsRenewableForPurchase(Boolean isRenewableForPurchase){
		this.isRenewableForPurchase = isRenewableForPurchase;
	}

	public void isRenewableForPurchase(String multirequestToken){
		setToken("isRenewableForPurchase", multirequestToken);
	}

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

	// isInGracePeriod:
	public Boolean getIsInGracePeriod(){
		return this.isInGracePeriod;
	}
	public void setIsInGracePeriod(Boolean isInGracePeriod){
		this.isInGracePeriod = isInGracePeriod;
	}

	public void isInGracePeriod(String multirequestToken){
		setToken("isInGracePeriod", multirequestToken);
	}

	// paymentGatewayId:
	public Integer getPaymentGatewayId(){
		return this.paymentGatewayId;
	}
	public void setPaymentGatewayId(Integer paymentGatewayId){
		this.paymentGatewayId = paymentGatewayId;
	}

	public void paymentGatewayId(String multirequestToken){
		setToken("paymentGatewayId", multirequestToken);
	}

	// paymentMethodId:
	public Integer getPaymentMethodId(){
		return this.paymentMethodId;
	}
	public void setPaymentMethodId(Integer paymentMethodId){
		this.paymentMethodId = paymentMethodId;
	}

	public void paymentMethodId(String multirequestToken){
		setToken("paymentMethodId", multirequestToken);
	}


	public SubscriptionEntitlement() {
		super();
	}

	public SubscriptionEntitlement(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		nextRenewalDate = GsonParser.parseLong(jsonObject.get("nextRenewalDate"));
		isRenewableForPurchase = GsonParser.parseBoolean(jsonObject.get("isRenewableForPurchase"));
		isRenewable = GsonParser.parseBoolean(jsonObject.get("isRenewable"));
		isInGracePeriod = GsonParser.parseBoolean(jsonObject.get("isInGracePeriod"));
		paymentGatewayId = GsonParser.parseInt(jsonObject.get("paymentGatewayId"));
		paymentMethodId = GsonParser.parseInt(jsonObject.get("paymentMethodId"));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaSubscriptionEntitlement");
		kparams.add("paymentGatewayId", this.paymentGatewayId);
		kparams.add("paymentMethodId", this.paymentMethodId);
		return kparams;
	}


    public static final Creator<SubscriptionEntitlement> CREATOR = new Creator<SubscriptionEntitlement>() {
        @Override
        public SubscriptionEntitlement createFromParcel(Parcel source) {
            return new SubscriptionEntitlement(source);
        }

        @Override
        public SubscriptionEntitlement[] newArray(int size) {
            return new SubscriptionEntitlement[size];
        }
    };

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        super.writeToParcel(dest, flags);
        dest.writeValue(this.nextRenewalDate);
        dest.writeValue(this.isRenewableForPurchase);
        dest.writeValue(this.isRenewable);
        dest.writeValue(this.isInGracePeriod);
        dest.writeValue(this.paymentGatewayId);
        dest.writeValue(this.paymentMethodId);
    }

    public SubscriptionEntitlement(Parcel in) {
        super(in);
        this.nextRenewalDate = (Long)in.readValue(Long.class.getClassLoader());
        this.isRenewableForPurchase = (Boolean)in.readValue(Boolean.class.getClassLoader());
        this.isRenewable = (Boolean)in.readValue(Boolean.class.getClassLoader());
        this.isInGracePeriod = (Boolean)in.readValue(Boolean.class.getClassLoader());
        this.paymentGatewayId = (Integer)in.readValue(Integer.class.getClassLoader());
        this.paymentMethodId = (Integer)in.readValue(Integer.class.getClassLoader());
    }
}

