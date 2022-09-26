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
import com.kaltura.client.enums.AdsPolicy;
import com.kaltura.client.types.CouponsGroup;
import com.kaltura.client.types.DiscountModule;
import com.kaltura.client.types.ObjectBase;
import com.kaltura.client.types.PriceDetails;
import com.kaltura.client.types.UsageModule;
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
 * PPV details
 */
@SuppressWarnings("serial")
@MultiRequestBuilder.Tokenizer(Ppv.Tokenizer.class)
public class Ppv extends ObjectBase {
	
	public interface Tokenizer extends ObjectBase.Tokenizer {
		String id();
		String name();
		PriceDetails.Tokenizer price();
		String priceDetailsId();
		RequestBuilder.ListTokenizer<IntegerValue.Tokenizer> fileTypes();
		String fileTypesIds();
		DiscountModule.Tokenizer discountModule();
		String discountId();
		CouponsGroup.Tokenizer couponsGroup();
		String couponsGroupId();
		RequestBuilder.ListTokenizer<TranslationToken.Tokenizer> descriptions();
		String productCode();
		String isSubscriptionOnly();
		String firstDeviceLimitation();
		UsageModule.Tokenizer usageModule();
		String usageModuleId();
		String adsPolicy();
		String isActive();
		String updateDate();
		String createDate();
		String virtualAssetId();
	}

	/**
	 * PPV identifier
	 */
	private String id;
	/**
	 * the name for the ppv
	 */
	private String name;
	/**
	 * This property will deprecated soon. Please use PriceId instead of it.
	 */
	private PriceDetails price;
	/**
	 * The price if of the ppv
	 */
	private Integer priceDetailsId;
	/**
	 * This property will deprecated soon. Please use fileTypesIds instead of it.
	 */
	private List<IntegerValue> fileTypes;
	/**
	 * Comma separated file types identifiers that are supported in this subscription
	 */
	private String fileTypesIds;
	/**
	 * This property will deprecated soon. Please use DiscountId instead of it.
	 */
	private DiscountModule discountModule;
	/**
	 * The discount id for the ppv
	 */
	private Long discountId;
	/**
	 * This property will deprecated soon. Please use CouponsGroupId instead of it.
	 */
	private CouponsGroup couponsGroup;
	/**
	 * Coupons group id for the ppv
	 */
	private Long couponsGroupId;
	/**
	 * A list of the descriptions of the ppv on different languages (language code and
	  translation)
	 */
	private List<TranslationToken> descriptions;
	/**
	 * Product code for the ppv
	 */
	private String productCode;
	/**
	 * Indicates whether or not this ppv can be purchased standalone or only as part of
	  a subscription
	 */
	private Boolean isSubscriptionOnly;
	/**
	 * Indicates whether or not this ppv can be consumed only on the first device
	 */
	private Boolean firstDeviceLimitation;
	/**
	 * This property will deprecated soon. Please use UsageModuleId instead of it.
	 */
	private UsageModule usageModule;
	/**
	 * PPV usage module Id
	 */
	private Long usageModuleId;
	/**
	 * adsPolicy
	 */
	private AdsPolicy adsPolicy;
	/**
	 * Is active ppv
	 */
	private Boolean isActive;
	/**
	 * Specifies when was the ppv last updated. Date and time represented as epoch.
	 */
	private Long updateDate;
	/**
	 * Specifies when was the ppv created. Date and time represented as epoch.
	 */
	private Long createDate;
	/**
	 * Virtual asset id
	 */
	private Long virtualAssetId;

	// id:
	public String getId(){
		return this.id;
	}
	public void setId(String id){
		this.id = id;
	}

	public void id(String multirequestToken){
		setToken("id", multirequestToken);
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

	// price:
	public PriceDetails getPrice(){
		return this.price;
	}
	// priceDetailsId:
	public Integer getPriceDetailsId(){
		return this.priceDetailsId;
	}
	public void setPriceDetailsId(Integer priceDetailsId){
		this.priceDetailsId = priceDetailsId;
	}

	public void priceDetailsId(String multirequestToken){
		setToken("priceDetailsId", multirequestToken);
	}

	// fileTypes:
	public List<IntegerValue> getFileTypes(){
		return this.fileTypes;
	}
	// fileTypesIds:
	public String getFileTypesIds(){
		return this.fileTypesIds;
	}
	public void setFileTypesIds(String fileTypesIds){
		this.fileTypesIds = fileTypesIds;
	}

	public void fileTypesIds(String multirequestToken){
		setToken("fileTypesIds", multirequestToken);
	}

	// discountModule:
	public DiscountModule getDiscountModule(){
		return this.discountModule;
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

	// couponsGroup:
	public CouponsGroup getCouponsGroup(){
		return this.couponsGroup;
	}
	// couponsGroupId:
	public Long getCouponsGroupId(){
		return this.couponsGroupId;
	}
	public void setCouponsGroupId(Long couponsGroupId){
		this.couponsGroupId = couponsGroupId;
	}

	public void couponsGroupId(String multirequestToken){
		setToken("couponsGroupId", multirequestToken);
	}

	// descriptions:
	public List<TranslationToken> getDescriptions(){
		return this.descriptions;
	}
	public void setDescriptions(List<TranslationToken> descriptions){
		this.descriptions = descriptions;
	}

	// productCode:
	public String getProductCode(){
		return this.productCode;
	}
	public void setProductCode(String productCode){
		this.productCode = productCode;
	}

	public void productCode(String multirequestToken){
		setToken("productCode", multirequestToken);
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

	// firstDeviceLimitation:
	public Boolean getFirstDeviceLimitation(){
		return this.firstDeviceLimitation;
	}
	public void setFirstDeviceLimitation(Boolean firstDeviceLimitation){
		this.firstDeviceLimitation = firstDeviceLimitation;
	}

	public void firstDeviceLimitation(String multirequestToken){
		setToken("firstDeviceLimitation", multirequestToken);
	}

	// usageModule:
	public UsageModule getUsageModule(){
		return this.usageModule;
	}
	// usageModuleId:
	public Long getUsageModuleId(){
		return this.usageModuleId;
	}
	public void setUsageModuleId(Long usageModuleId){
		this.usageModuleId = usageModuleId;
	}

	public void usageModuleId(String multirequestToken){
		setToken("usageModuleId", multirequestToken);
	}

	// adsPolicy:
	public AdsPolicy getAdsPolicy(){
		return this.adsPolicy;
	}
	public void setAdsPolicy(AdsPolicy adsPolicy){
		this.adsPolicy = adsPolicy;
	}

	public void adsPolicy(String multirequestToken){
		setToken("adsPolicy", multirequestToken);
	}

	// isActive:
	public Boolean getIsActive(){
		return this.isActive;
	}
	public void setIsActive(Boolean isActive){
		this.isActive = isActive;
	}

	public void isActive(String multirequestToken){
		setToken("isActive", multirequestToken);
	}

	// updateDate:
	public Long getUpdateDate(){
		return this.updateDate;
	}
	// createDate:
	public Long getCreateDate(){
		return this.createDate;
	}
	// virtualAssetId:
	public Long getVirtualAssetId(){
		return this.virtualAssetId;
	}

	public Ppv() {
		super();
	}

	public Ppv(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		id = GsonParser.parseString(jsonObject.get("id"));
		name = GsonParser.parseString(jsonObject.get("name"));
		price = GsonParser.parseObject(jsonObject.getAsJsonObject("price"), PriceDetails.class);
		priceDetailsId = GsonParser.parseInt(jsonObject.get("priceDetailsId"));
		fileTypes = GsonParser.parseArray(jsonObject.getAsJsonArray("fileTypes"), IntegerValue.class);
		fileTypesIds = GsonParser.parseString(jsonObject.get("fileTypesIds"));
		discountModule = GsonParser.parseObject(jsonObject.getAsJsonObject("discountModule"), DiscountModule.class);
		discountId = GsonParser.parseLong(jsonObject.get("discountId"));
		couponsGroup = GsonParser.parseObject(jsonObject.getAsJsonObject("couponsGroup"), CouponsGroup.class);
		couponsGroupId = GsonParser.parseLong(jsonObject.get("couponsGroupId"));
		descriptions = GsonParser.parseArray(jsonObject.getAsJsonArray("descriptions"), TranslationToken.class);
		productCode = GsonParser.parseString(jsonObject.get("productCode"));
		isSubscriptionOnly = GsonParser.parseBoolean(jsonObject.get("isSubscriptionOnly"));
		firstDeviceLimitation = GsonParser.parseBoolean(jsonObject.get("firstDeviceLimitation"));
		usageModule = GsonParser.parseObject(jsonObject.getAsJsonObject("usageModule"), UsageModule.class);
		usageModuleId = GsonParser.parseLong(jsonObject.get("usageModuleId"));
		adsPolicy = AdsPolicy.get(GsonParser.parseString(jsonObject.get("adsPolicy")));
		isActive = GsonParser.parseBoolean(jsonObject.get("isActive"));
		updateDate = GsonParser.parseLong(jsonObject.get("updateDate"));
		createDate = GsonParser.parseLong(jsonObject.get("createDate"));
		virtualAssetId = GsonParser.parseLong(jsonObject.get("virtualAssetId"));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaPpv");
		kparams.add("id", this.id);
		kparams.add("name", this.name);
		kparams.add("priceDetailsId", this.priceDetailsId);
		kparams.add("fileTypesIds", this.fileTypesIds);
		kparams.add("discountId", this.discountId);
		kparams.add("couponsGroupId", this.couponsGroupId);
		kparams.add("descriptions", this.descriptions);
		kparams.add("productCode", this.productCode);
		kparams.add("isSubscriptionOnly", this.isSubscriptionOnly);
		kparams.add("firstDeviceLimitation", this.firstDeviceLimitation);
		kparams.add("usageModuleId", this.usageModuleId);
		kparams.add("adsPolicy", this.adsPolicy);
		kparams.add("isActive", this.isActive);
		return kparams;
	}


    public static final Creator<Ppv> CREATOR = new Creator<Ppv>() {
        @Override
        public Ppv createFromParcel(Parcel source) {
            return new Ppv(source);
        }

        @Override
        public Ppv[] newArray(int size) {
            return new Ppv[size];
        }
    };

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        super.writeToParcel(dest, flags);
        dest.writeString(this.id);
        dest.writeString(this.name);
        dest.writeParcelable(this.price, flags);
        dest.writeValue(this.priceDetailsId);
        if(this.fileTypes != null) {
            dest.writeInt(this.fileTypes.size());
            dest.writeList(this.fileTypes);
        } else {
            dest.writeInt(-1);
        }
        dest.writeString(this.fileTypesIds);
        dest.writeParcelable(this.discountModule, flags);
        dest.writeValue(this.discountId);
        dest.writeParcelable(this.couponsGroup, flags);
        dest.writeValue(this.couponsGroupId);
        if(this.descriptions != null) {
            dest.writeInt(this.descriptions.size());
            dest.writeList(this.descriptions);
        } else {
            dest.writeInt(-1);
        }
        dest.writeString(this.productCode);
        dest.writeValue(this.isSubscriptionOnly);
        dest.writeValue(this.firstDeviceLimitation);
        dest.writeParcelable(this.usageModule, flags);
        dest.writeValue(this.usageModuleId);
        dest.writeInt(this.adsPolicy == null ? -1 : this.adsPolicy.ordinal());
        dest.writeValue(this.isActive);
        dest.writeValue(this.updateDate);
        dest.writeValue(this.createDate);
        dest.writeValue(this.virtualAssetId);
    }

    public Ppv(Parcel in) {
        super(in);
        this.id = in.readString();
        this.name = in.readString();
        this.price = in.readParcelable(PriceDetails.class.getClassLoader());
        this.priceDetailsId = (Integer)in.readValue(Integer.class.getClassLoader());
        int fileTypesSize = in.readInt();
        if( fileTypesSize > -1) {
            this.fileTypes = new ArrayList<>();
            in.readList(this.fileTypes, IntegerValue.class.getClassLoader());
        }
        this.fileTypesIds = in.readString();
        this.discountModule = in.readParcelable(DiscountModule.class.getClassLoader());
        this.discountId = (Long)in.readValue(Long.class.getClassLoader());
        this.couponsGroup = in.readParcelable(CouponsGroup.class.getClassLoader());
        this.couponsGroupId = (Long)in.readValue(Long.class.getClassLoader());
        int descriptionsSize = in.readInt();
        if( descriptionsSize > -1) {
            this.descriptions = new ArrayList<>();
            in.readList(this.descriptions, TranslationToken.class.getClassLoader());
        }
        this.productCode = in.readString();
        this.isSubscriptionOnly = (Boolean)in.readValue(Boolean.class.getClassLoader());
        this.firstDeviceLimitation = (Boolean)in.readValue(Boolean.class.getClassLoader());
        this.usageModule = in.readParcelable(UsageModule.class.getClassLoader());
        this.usageModuleId = (Long)in.readValue(Long.class.getClassLoader());
        int tmpAdsPolicy = in.readInt();
        this.adsPolicy = tmpAdsPolicy == -1 ? null : AdsPolicy.values()[tmpAdsPolicy];
        this.isActive = (Boolean)in.readValue(Boolean.class.getClassLoader());
        this.updateDate = (Long)in.readValue(Long.class.getClassLoader());
        this.createDate = (Long)in.readValue(Long.class.getClassLoader());
        this.virtualAssetId = (Long)in.readValue(Long.class.getClassLoader());
    }
}

