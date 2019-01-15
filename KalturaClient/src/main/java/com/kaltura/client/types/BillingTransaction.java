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
import com.kaltura.client.enums.BillingAction;
import com.kaltura.client.enums.BillingItemsType;
import com.kaltura.client.enums.BillingPriceType;
import com.kaltura.client.enums.PaymentMethodType;
import com.kaltura.client.types.ObjectBase;
import com.kaltura.client.types.Price;
import com.kaltura.client.utils.GsonParser;
import com.kaltura.client.utils.request.MultiRequestBuilder;

/**
 * This class was generated using clients-generator\exec.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

/**
 * Billing Transaction
 */
@SuppressWarnings("serial")
@MultiRequestBuilder.Tokenizer(BillingTransaction.Tokenizer.class)
public class BillingTransaction extends ObjectBase {
	
	public interface Tokenizer extends ObjectBase.Tokenizer {
		String recieptCode();
		String purchasedItemName();
		String purchasedItemCode();
		String itemType();
		String billingAction();
		Price.Tokenizer price();
		String actionDate();
		String startDate();
		String endDate();
		String paymentMethod();
		String paymentMethodExtraDetails();
		String isRecurring();
		String billingProviderRef();
		String purchaseId();
		String remarks();
		String billingPriceType();
	}

	/**
	 * Reciept Code
	 */
	private String recieptCode;
	/**
	 * Purchased Item Name
	 */
	private String purchasedItemName;
	/**
	 * Purchased Item Code
	 */
	private String purchasedItemCode;
	/**
	 * Item Type
	 */
	private BillingItemsType itemType;
	/**
	 * Billing Action
	 */
	private BillingAction billingAction;
	/**
	 * price
	 */
	private Price price;
	/**
	 * Action Date
	 */
	private Long actionDate;
	/**
	 * Start Date
	 */
	private Long startDate;
	/**
	 * End Date
	 */
	private Long endDate;
	/**
	 * Payment Method
	 */
	private PaymentMethodType paymentMethod;
	/**
	 * Payment Method Extra Details
	 */
	private String paymentMethodExtraDetails;
	/**
	 * Is Recurring
	 */
	private Boolean isRecurring;
	/**
	 * Billing Provider Ref
	 */
	private Integer billingProviderRef;
	/**
	 * Purchase ID
	 */
	private Integer purchaseId;
	/**
	 * Remarks
	 */
	private String remarks;
	/**
	 * Billing Price Info
	 */
	private BillingPriceType billingPriceType;

	// recieptCode:
	public String getRecieptCode(){
		return this.recieptCode;
	}
	// purchasedItemName:
	public String getPurchasedItemName(){
		return this.purchasedItemName;
	}
	// purchasedItemCode:
	public String getPurchasedItemCode(){
		return this.purchasedItemCode;
	}
	// itemType:
	public BillingItemsType getItemType(){
		return this.itemType;
	}
	// billingAction:
	public BillingAction getBillingAction(){
		return this.billingAction;
	}
	// price:
	public Price getPrice(){
		return this.price;
	}
	// actionDate:
	public Long getActionDate(){
		return this.actionDate;
	}
	// startDate:
	public Long getStartDate(){
		return this.startDate;
	}
	// endDate:
	public Long getEndDate(){
		return this.endDate;
	}
	// paymentMethod:
	public PaymentMethodType getPaymentMethod(){
		return this.paymentMethod;
	}
	// paymentMethodExtraDetails:
	public String getPaymentMethodExtraDetails(){
		return this.paymentMethodExtraDetails;
	}
	// isRecurring:
	public Boolean getIsRecurring(){
		return this.isRecurring;
	}
	// billingProviderRef:
	public Integer getBillingProviderRef(){
		return this.billingProviderRef;
	}
	// purchaseId:
	public Integer getPurchaseId(){
		return this.purchaseId;
	}
	// remarks:
	public String getRemarks(){
		return this.remarks;
	}
	// billingPriceType:
	public BillingPriceType getBillingPriceType(){
		return this.billingPriceType;
	}

	public BillingTransaction() {
		super();
	}

	public BillingTransaction(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		recieptCode = GsonParser.parseString(jsonObject.get("recieptCode"));
		purchasedItemName = GsonParser.parseString(jsonObject.get("purchasedItemName"));
		purchasedItemCode = GsonParser.parseString(jsonObject.get("purchasedItemCode"));
		itemType = BillingItemsType.get(GsonParser.parseString(jsonObject.get("itemType")));
		billingAction = BillingAction.get(GsonParser.parseString(jsonObject.get("billingAction")));
		price = GsonParser.parseObject(jsonObject.getAsJsonObject("price"), Price.class);
		actionDate = GsonParser.parseLong(jsonObject.get("actionDate"));
		startDate = GsonParser.parseLong(jsonObject.get("startDate"));
		endDate = GsonParser.parseLong(jsonObject.get("endDate"));
		paymentMethod = PaymentMethodType.get(GsonParser.parseString(jsonObject.get("paymentMethod")));
		paymentMethodExtraDetails = GsonParser.parseString(jsonObject.get("paymentMethodExtraDetails"));
		isRecurring = GsonParser.parseBoolean(jsonObject.get("isRecurring"));
		billingProviderRef = GsonParser.parseInt(jsonObject.get("billingProviderRef"));
		purchaseId = GsonParser.parseInt(jsonObject.get("purchaseId"));
		remarks = GsonParser.parseString(jsonObject.get("remarks"));
		billingPriceType = BillingPriceType.get(GsonParser.parseString(jsonObject.get("billingPriceType")));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaBillingTransaction");
		return kparams;
	}


    public static final Creator<BillingTransaction> CREATOR = new Creator<BillingTransaction>() {
        @Override
        public BillingTransaction createFromParcel(Parcel source) {
            return new BillingTransaction(source);
        }

        @Override
        public BillingTransaction[] newArray(int size) {
            return new BillingTransaction[size];
        }
    };

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        super.writeToParcel(dest, flags);
        dest.writeString(this.recieptCode);
        dest.writeString(this.purchasedItemName);
        dest.writeString(this.purchasedItemCode);
        dest.writeInt(this.itemType == null ? -1 : this.itemType.ordinal());
        dest.writeInt(this.billingAction == null ? -1 : this.billingAction.ordinal());
        dest.writeParcelable(this.price, flags);
        dest.writeValue(this.actionDate);
        dest.writeValue(this.startDate);
        dest.writeValue(this.endDate);
        dest.writeInt(this.paymentMethod == null ? -1 : this.paymentMethod.ordinal());
        dest.writeString(this.paymentMethodExtraDetails);
        dest.writeValue(this.isRecurring);
        dest.writeValue(this.billingProviderRef);
        dest.writeValue(this.purchaseId);
        dest.writeString(this.remarks);
        dest.writeInt(this.billingPriceType == null ? -1 : this.billingPriceType.ordinal());
    }

    public BillingTransaction(Parcel in) {
        super(in);
        this.recieptCode = in.readString();
        this.purchasedItemName = in.readString();
        this.purchasedItemCode = in.readString();
        int tmpItemType = in.readInt();
        this.itemType = tmpItemType == -1 ? null : BillingItemsType.values()[tmpItemType];
        int tmpBillingAction = in.readInt();
        this.billingAction = tmpBillingAction == -1 ? null : BillingAction.values()[tmpBillingAction];
        this.price = in.readParcelable(Price.class.getClassLoader());
        this.actionDate = (Long)in.readValue(Long.class.getClassLoader());
        this.startDate = (Long)in.readValue(Long.class.getClassLoader());
        this.endDate = (Long)in.readValue(Long.class.getClassLoader());
        int tmpPaymentMethod = in.readInt();
        this.paymentMethod = tmpPaymentMethod == -1 ? null : PaymentMethodType.values()[tmpPaymentMethod];
        this.paymentMethodExtraDetails = in.readString();
        this.isRecurring = (Boolean)in.readValue(Boolean.class.getClassLoader());
        this.billingProviderRef = (Integer)in.readValue(Integer.class.getClassLoader());
        this.purchaseId = (Integer)in.readValue(Integer.class.getClassLoader());
        this.remarks = in.readString();
        int tmpBillingPriceType = in.readInt();
        this.billingPriceType = tmpBillingPriceType == -1 ? null : BillingPriceType.values()[tmpBillingPriceType];
    }
}

