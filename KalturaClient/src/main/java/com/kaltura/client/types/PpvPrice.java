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

/**
 * PPV price details
 */
@SuppressWarnings("serial")
@MultiRequestBuilder.Tokenizer(PpvPrice.Tokenizer.class)
public class PpvPrice extends ProductPrice {
	
	public interface Tokenizer extends ProductPrice.Tokenizer {
		String fileId();
		String ppvModuleId();
		String isSubscriptionOnly();
		Price.Tokenizer fullPrice();
		String subscriptionId();
		String collectionId();
		String prePaidId();
		RequestBuilder.ListTokenizer<TranslationToken.Tokenizer> ppvDescriptions();
		String purchaseUserId();
		String purchasedMediaFileId();
		RequestBuilder.ListTokenizer<IntegerValue.Tokenizer> relatedMediaFileIds();
		String startDate();
		String endDate();
		String discountEndDate();
		String firstDeviceName();
		String isInCancelationPeriod();
		String ppvProductCode();
	}

	/**
	 * Media file identifier
	 */
	private Integer fileId;
	/**
	 * The associated PPV module identifier
	 */
	private String ppvModuleId;
	/**
	 * Denotes whether this object is available only as part of a subscription or can
	  be sold separately
	 */
	private Boolean isSubscriptionOnly;
	/**
	 * The full price of the item (with no discounts)
	 */
	private Price fullPrice;
	/**
	 * The identifier of the relevant subscription
	 */
	private String subscriptionId;
	/**
	 * The identifier of the relevant collection
	 */
	private String collectionId;
	/**
	 * The identifier of the relevant pre paid
	 */
	private String prePaidId;
	/**
	 * A list of the descriptions of the PPV module on different languages (language
	  code and translation)
	 */
	private List<TranslationToken> ppvDescriptions;
	/**
	 * If the item already purchased - the identifier of the user (in the household)
	  who purchased this item
	 */
	private String purchaseUserId;
	/**
	 * If the item already purchased - the identifier of the purchased file
	 */
	private Integer purchasedMediaFileId;
	/**
	 * Related media files identifiers (different types)
	 */
	private List<IntegerValue> relatedMediaFileIds;
	/**
	 * If the item already purchased - since when the user can start watching the item
	 */
	private Long startDate;
	/**
	 * If the item already purchased - until when the user can watch the item
	 */
	private Long endDate;
	/**
	 * Discount end date
	 */
	private Long discountEndDate;
	/**
	 * If the item already purchased and played - the name of the device on which it
	  was first played
	 */
	private String firstDeviceName;
	/**
	 * If waiver period is enabled - donates whether the user is still in the
	  cancelation window
	 */
	private Boolean isInCancelationPeriod;
	/**
	 * The PPV product code
	 */
	private String ppvProductCode;

	// fileId:
	public Integer getFileId(){
		return this.fileId;
	}
	public void setFileId(Integer fileId){
		this.fileId = fileId;
	}

	public void fileId(String multirequestToken){
		setToken("fileId", multirequestToken);
	}

	// ppvModuleId:
	public String getPpvModuleId(){
		return this.ppvModuleId;
	}
	public void setPpvModuleId(String ppvModuleId){
		this.ppvModuleId = ppvModuleId;
	}

	public void ppvModuleId(String multirequestToken){
		setToken("ppvModuleId", multirequestToken);
	}

	// isSubscriptionOnly:
	public Boolean getIsSubscriptionOnly(){
		return this.isSubscriptionOnly;
	}
	public void setIsSubscriptionOnly(Boolean isSubscriptionOnly){
		this.isSubscriptionOnly = isSubscriptionOnly;
	}

	public void isSubscriptionOnly(String multirequestToken){
		setToken("isSubscriptionOnly", multirequestToken);
	}

	// fullPrice:
	public Price getFullPrice(){
		return this.fullPrice;
	}
	public void setFullPrice(Price fullPrice){
		this.fullPrice = fullPrice;
	}

	// subscriptionId:
	public String getSubscriptionId(){
		return this.subscriptionId;
	}
	public void setSubscriptionId(String subscriptionId){
		this.subscriptionId = subscriptionId;
	}

	public void subscriptionId(String multirequestToken){
		setToken("subscriptionId", multirequestToken);
	}

	// collectionId:
	public String getCollectionId(){
		return this.collectionId;
	}
	public void setCollectionId(String collectionId){
		this.collectionId = collectionId;
	}

	public void collectionId(String multirequestToken){
		setToken("collectionId", multirequestToken);
	}

	// prePaidId:
	public String getPrePaidId(){
		return this.prePaidId;
	}
	public void setPrePaidId(String prePaidId){
		this.prePaidId = prePaidId;
	}

	public void prePaidId(String multirequestToken){
		setToken("prePaidId", multirequestToken);
	}

	// ppvDescriptions:
	public List<TranslationToken> getPpvDescriptions(){
		return this.ppvDescriptions;
	}
	public void setPpvDescriptions(List<TranslationToken> ppvDescriptions){
		this.ppvDescriptions = ppvDescriptions;
	}

	// purchaseUserId:
	public String getPurchaseUserId(){
		return this.purchaseUserId;
	}
	public void setPurchaseUserId(String purchaseUserId){
		this.purchaseUserId = purchaseUserId;
	}

	public void purchaseUserId(String multirequestToken){
		setToken("purchaseUserId", multirequestToken);
	}

	// purchasedMediaFileId:
	public Integer getPurchasedMediaFileId(){
		return this.purchasedMediaFileId;
	}
	public void setPurchasedMediaFileId(Integer purchasedMediaFileId){
		this.purchasedMediaFileId = purchasedMediaFileId;
	}

	public void purchasedMediaFileId(String multirequestToken){
		setToken("purchasedMediaFileId", multirequestToken);
	}

	// relatedMediaFileIds:
	public List<IntegerValue> getRelatedMediaFileIds(){
		return this.relatedMediaFileIds;
	}
	public void setRelatedMediaFileIds(List<IntegerValue> relatedMediaFileIds){
		this.relatedMediaFileIds = relatedMediaFileIds;
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

	// discountEndDate:
	public Long getDiscountEndDate(){
		return this.discountEndDate;
	}
	public void setDiscountEndDate(Long discountEndDate){
		this.discountEndDate = discountEndDate;
	}

	public void discountEndDate(String multirequestToken){
		setToken("discountEndDate", multirequestToken);
	}

	// firstDeviceName:
	public String getFirstDeviceName(){
		return this.firstDeviceName;
	}
	public void setFirstDeviceName(String firstDeviceName){
		this.firstDeviceName = firstDeviceName;
	}

	public void firstDeviceName(String multirequestToken){
		setToken("firstDeviceName", multirequestToken);
	}

	// isInCancelationPeriod:
	public Boolean getIsInCancelationPeriod(){
		return this.isInCancelationPeriod;
	}
	public void setIsInCancelationPeriod(Boolean isInCancelationPeriod){
		this.isInCancelationPeriod = isInCancelationPeriod;
	}

	public void isInCancelationPeriod(String multirequestToken){
		setToken("isInCancelationPeriod", multirequestToken);
	}

	// ppvProductCode:
	public String getPpvProductCode(){
		return this.ppvProductCode;
	}
	public void setPpvProductCode(String ppvProductCode){
		this.ppvProductCode = ppvProductCode;
	}

	public void ppvProductCode(String multirequestToken){
		setToken("ppvProductCode", multirequestToken);
	}


	public PpvPrice() {
		super();
	}

	public PpvPrice(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		fileId = GsonParser.parseInt(jsonObject.get("fileId"));
		ppvModuleId = GsonParser.parseString(jsonObject.get("ppvModuleId"));
		isSubscriptionOnly = GsonParser.parseBoolean(jsonObject.get("isSubscriptionOnly"));
		fullPrice = GsonParser.parseObject(jsonObject.getAsJsonObject("fullPrice"), Price.class);
		subscriptionId = GsonParser.parseString(jsonObject.get("subscriptionId"));
		collectionId = GsonParser.parseString(jsonObject.get("collectionId"));
		prePaidId = GsonParser.parseString(jsonObject.get("prePaidId"));
		ppvDescriptions = GsonParser.parseArray(jsonObject.getAsJsonArray("ppvDescriptions"), TranslationToken.class);
		purchaseUserId = GsonParser.parseString(jsonObject.get("purchaseUserId"));
		purchasedMediaFileId = GsonParser.parseInt(jsonObject.get("purchasedMediaFileId"));
		relatedMediaFileIds = GsonParser.parseArray(jsonObject.getAsJsonArray("relatedMediaFileIds"), IntegerValue.class);
		startDate = GsonParser.parseLong(jsonObject.get("startDate"));
		endDate = GsonParser.parseLong(jsonObject.get("endDate"));
		discountEndDate = GsonParser.parseLong(jsonObject.get("discountEndDate"));
		firstDeviceName = GsonParser.parseString(jsonObject.get("firstDeviceName"));
		isInCancelationPeriod = GsonParser.parseBoolean(jsonObject.get("isInCancelationPeriod"));
		ppvProductCode = GsonParser.parseString(jsonObject.get("ppvProductCode"));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaPpvPrice");
		kparams.add("fileId", this.fileId);
		kparams.add("ppvModuleId", this.ppvModuleId);
		kparams.add("isSubscriptionOnly", this.isSubscriptionOnly);
		kparams.add("fullPrice", this.fullPrice);
		kparams.add("subscriptionId", this.subscriptionId);
		kparams.add("collectionId", this.collectionId);
		kparams.add("prePaidId", this.prePaidId);
		kparams.add("ppvDescriptions", this.ppvDescriptions);
		kparams.add("purchaseUserId", this.purchaseUserId);
		kparams.add("purchasedMediaFileId", this.purchasedMediaFileId);
		kparams.add("relatedMediaFileIds", this.relatedMediaFileIds);
		kparams.add("startDate", this.startDate);
		kparams.add("endDate", this.endDate);
		kparams.add("discountEndDate", this.discountEndDate);
		kparams.add("firstDeviceName", this.firstDeviceName);
		kparams.add("isInCancelationPeriod", this.isInCancelationPeriod);
		kparams.add("ppvProductCode", this.ppvProductCode);
		return kparams;
	}


    public static final Creator<PpvPrice> CREATOR = new Creator<PpvPrice>() {
        @Override
        public PpvPrice createFromParcel(Parcel source) {
            return new PpvPrice(source);
        }

        @Override
        public PpvPrice[] newArray(int size) {
            return new PpvPrice[size];
        }
    };

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        super.writeToParcel(dest, flags);
        dest.writeValue(this.fileId);
        dest.writeString(this.ppvModuleId);
        dest.writeValue(this.isSubscriptionOnly);
        dest.writeParcelable(this.fullPrice, flags);
        dest.writeString(this.subscriptionId);
        dest.writeString(this.collectionId);
        dest.writeString(this.prePaidId);
        if(this.ppvDescriptions != null) {
            dest.writeInt(this.ppvDescriptions.size());
            dest.writeList(this.ppvDescriptions);
        } else {
            dest.writeInt(-1);
        }
        dest.writeString(this.purchaseUserId);
        dest.writeValue(this.purchasedMediaFileId);
        if(this.relatedMediaFileIds != null) {
            dest.writeInt(this.relatedMediaFileIds.size());
            dest.writeList(this.relatedMediaFileIds);
        } else {
            dest.writeInt(-1);
        }
        dest.writeValue(this.startDate);
        dest.writeValue(this.endDate);
        dest.writeValue(this.discountEndDate);
        dest.writeString(this.firstDeviceName);
        dest.writeValue(this.isInCancelationPeriod);
        dest.writeString(this.ppvProductCode);
    }

    public PpvPrice(Parcel in) {
        super(in);
        this.fileId = (Integer)in.readValue(Integer.class.getClassLoader());
        this.ppvModuleId = in.readString();
        this.isSubscriptionOnly = (Boolean)in.readValue(Boolean.class.getClassLoader());
        this.fullPrice = in.readParcelable(Price.class.getClassLoader());
        this.subscriptionId = in.readString();
        this.collectionId = in.readString();
        this.prePaidId = in.readString();
        int ppvDescriptionsSize = in.readInt();
        if( ppvDescriptionsSize > -1) {
            this.ppvDescriptions = new ArrayList<>();
            in.readList(this.ppvDescriptions, TranslationToken.class.getClassLoader());
        }
        this.purchaseUserId = in.readString();
        this.purchasedMediaFileId = (Integer)in.readValue(Integer.class.getClassLoader());
        int relatedMediaFileIdsSize = in.readInt();
        if( relatedMediaFileIdsSize > -1) {
            this.relatedMediaFileIds = new ArrayList<>();
            in.readList(this.relatedMediaFileIds, IntegerValue.class.getClassLoader());
        }
        this.startDate = (Long)in.readValue(Long.class.getClassLoader());
        this.endDate = (Long)in.readValue(Long.class.getClassLoader());
        this.discountEndDate = (Long)in.readValue(Long.class.getClassLoader());
        this.firstDeviceName = in.readString();
        this.isInCancelationPeriod = (Boolean)in.readValue(Boolean.class.getClassLoader());
        this.ppvProductCode = in.readString();
    }
}

