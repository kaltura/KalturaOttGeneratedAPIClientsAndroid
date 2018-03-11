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
import com.kaltura.client.enums.CompensationType;
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
 * Compensation request parameters
 */
@SuppressWarnings("serial")
@MultiRequestBuilder.Tokenizer(Compensation.Tokenizer.class)
public class Compensation extends ObjectBase {
	
	public interface Tokenizer extends ObjectBase.Tokenizer {
		String id();
		String subscriptionId();
		String compensationType();
		String amount();
		String totalRenewalIterations();
		String appliedRenewalIterations();
		String purchaseId();
	}

	/**
	 * Compensation identifier
	 */
	private Long id;
	/**
	 * Subscription identifier
	 */
	private Long subscriptionId;
	/**
	 * Compensation type
	 */
	private CompensationType compensationType;
	/**
	 * Compensation amount
	 */
	private Double amount;
	/**
	 * The number of renewals for compensation
	 */
	private Integer totalRenewalIterations;
	/**
	 * The number of renewals the compensation was already applied on
	 */
	private Integer appliedRenewalIterations;
	/**
	 * Purchase identifier
	 */
	private Integer purchaseId;

	// id:
	public Long getId(){
		return this.id;
	}
	public void setId(Long id){
		this.id = id;
	}

	public void id(String multirequestToken){
		setToken("id", multirequestToken);
	}

	// subscriptionId:
	public Long getSubscriptionId(){
		return this.subscriptionId;
	}
	public void setSubscriptionId(Long subscriptionId){
		this.subscriptionId = subscriptionId;
	}

	public void subscriptionId(String multirequestToken){
		setToken("subscriptionId", multirequestToken);
	}

	// compensationType:
	public CompensationType getCompensationType(){
		return this.compensationType;
	}
	public void setCompensationType(CompensationType compensationType){
		this.compensationType = compensationType;
	}

	public void compensationType(String multirequestToken){
		setToken("compensationType", multirequestToken);
	}

	// amount:
	public Double getAmount(){
		return this.amount;
	}
	public void setAmount(Double amount){
		this.amount = amount;
	}

	public void amount(String multirequestToken){
		setToken("amount", multirequestToken);
	}

	// totalRenewalIterations:
	public Integer getTotalRenewalIterations(){
		return this.totalRenewalIterations;
	}
	public void setTotalRenewalIterations(Integer totalRenewalIterations){
		this.totalRenewalIterations = totalRenewalIterations;
	}

	public void totalRenewalIterations(String multirequestToken){
		setToken("totalRenewalIterations", multirequestToken);
	}

	// appliedRenewalIterations:
	public Integer getAppliedRenewalIterations(){
		return this.appliedRenewalIterations;
	}
	public void setAppliedRenewalIterations(Integer appliedRenewalIterations){
		this.appliedRenewalIterations = appliedRenewalIterations;
	}

	public void appliedRenewalIterations(String multirequestToken){
		setToken("appliedRenewalIterations", multirequestToken);
	}

	// purchaseId:
	public Integer getPurchaseId(){
		return this.purchaseId;
	}
	public void setPurchaseId(Integer purchaseId){
		this.purchaseId = purchaseId;
	}

	public void purchaseId(String multirequestToken){
		setToken("purchaseId", multirequestToken);
	}


	public Compensation() {
		super();
	}

	public Compensation(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		id = GsonParser.parseLong(jsonObject.get("id"));
		subscriptionId = GsonParser.parseLong(jsonObject.get("subscriptionId"));
		compensationType = CompensationType.get(GsonParser.parseString(jsonObject.get("compensationType")));
		amount = GsonParser.parseDouble(jsonObject.get("amount"));
		totalRenewalIterations = GsonParser.parseInt(jsonObject.get("totalRenewalIterations"));
		appliedRenewalIterations = GsonParser.parseInt(jsonObject.get("appliedRenewalIterations"));
		purchaseId = GsonParser.parseInt(jsonObject.get("purchaseId"));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaCompensation");
		kparams.add("compensationType", this.compensationType);
		kparams.add("amount", this.amount);
		kparams.add("totalRenewalIterations", this.totalRenewalIterations);
		kparams.add("purchaseId", this.purchaseId);
		return kparams;
	}


    public static final Creator<Compensation> CREATOR = new Creator<Compensation>() {
        @Override
        public Compensation createFromParcel(Parcel source) {
            return new Compensation(source);
        }

        @Override
        public Compensation[] newArray(int size) {
            return new Compensation[size];
        }
    };

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        super.writeToParcel(dest, flags);
        dest.writeValue(this.id);
        dest.writeValue(this.subscriptionId);
        dest.writeInt(this.compensationType == null ? -1 : this.compensationType.ordinal());
        dest.writeValue(this.amount);
        dest.writeValue(this.totalRenewalIterations);
        dest.writeValue(this.appliedRenewalIterations);
        dest.writeValue(this.purchaseId);
    }

    public Compensation(Parcel in) {
        super(in);
        this.id = (Long)in.readValue(Long.class.getClassLoader());
        this.subscriptionId = (Long)in.readValue(Long.class.getClassLoader());
        int tmpCompensationType = in.readInt();
        this.compensationType = tmpCompensationType == -1 ? null : CompensationType.values()[tmpCompensationType];
        this.amount = (Double)in.readValue(Double.class.getClassLoader());
        this.totalRenewalIterations = (Integer)in.readValue(Integer.class.getClassLoader());
        this.appliedRenewalIterations = (Integer)in.readValue(Integer.class.getClassLoader());
        this.purchaseId = (Integer)in.readValue(Integer.class.getClassLoader());
    }
}

