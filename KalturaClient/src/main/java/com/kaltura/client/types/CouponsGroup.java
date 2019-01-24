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
import com.kaltura.client.enums.CouponGroupType;
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
 * Coupons group details
 */
@SuppressWarnings("serial")
@MultiRequestBuilder.Tokenizer(CouponsGroup.Tokenizer.class)
public class CouponsGroup extends ObjectBase {
	
	public interface Tokenizer extends ObjectBase.Tokenizer {
		String id();
		String name();
		RequestBuilder.ListTokenizer<TranslationToken.Tokenizer> descriptions();
		String startDate();
		String endDate();
		String maxUsesNumber();
		String maxUsesNumberOnRenewableSub();
		String couponGroupType();
	}

	/**
	 * Coupon group identifier
	 */
	private String id;
	/**
	 * Coupon group name
	 */
	private String name;
	/**
	 * A list of the descriptions of the coupon group on different languages (language
	  code and translation)
	 */
	private List<TranslationToken> descriptions;
	/**
	 * The first date the coupons in this coupons group are valid
	 */
	private Long startDate;
	/**
	 * The last date the coupons in this coupons group are valid
	 */
	private Long endDate;
	/**
	 * Maximum number of uses for each coupon in the group
	 */
	private Integer maxUsesNumber;
	/**
	 * Maximum number of uses for each coupon in the group on a renewable subscription
	 */
	private Integer maxUsesNumberOnRenewableSub;
	/**
	 * Type of the coupon group
	 */
	private CouponGroupType couponGroupType;

	// id:
	public String getId(){
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

	// descriptions:
	public List<TranslationToken> getDescriptions(){
		return this.descriptions;
	}
	public void setDescriptions(List<TranslationToken> descriptions){
		this.descriptions = descriptions;
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

	// maxUsesNumber:
	public Integer getMaxUsesNumber(){
		return this.maxUsesNumber;
	}
	public void setMaxUsesNumber(Integer maxUsesNumber){
		this.maxUsesNumber = maxUsesNumber;
	}

	public void maxUsesNumber(String multirequestToken){
		setToken("maxUsesNumber", multirequestToken);
	}

	// maxUsesNumberOnRenewableSub:
	public Integer getMaxUsesNumberOnRenewableSub(){
		return this.maxUsesNumberOnRenewableSub;
	}
	public void setMaxUsesNumberOnRenewableSub(Integer maxUsesNumberOnRenewableSub){
		this.maxUsesNumberOnRenewableSub = maxUsesNumberOnRenewableSub;
	}

	public void maxUsesNumberOnRenewableSub(String multirequestToken){
		setToken("maxUsesNumberOnRenewableSub", multirequestToken);
	}

	// couponGroupType:
	public CouponGroupType getCouponGroupType(){
		return this.couponGroupType;
	}
	public void setCouponGroupType(CouponGroupType couponGroupType){
		this.couponGroupType = couponGroupType;
	}

	public void couponGroupType(String multirequestToken){
		setToken("couponGroupType", multirequestToken);
	}


	public CouponsGroup() {
		super();
	}

	public CouponsGroup(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		id = GsonParser.parseString(jsonObject.get("id"));
		name = GsonParser.parseString(jsonObject.get("name"));
		descriptions = GsonParser.parseArray(jsonObject.getAsJsonArray("descriptions"), TranslationToken.class);
		startDate = GsonParser.parseLong(jsonObject.get("startDate"));
		endDate = GsonParser.parseLong(jsonObject.get("endDate"));
		maxUsesNumber = GsonParser.parseInt(jsonObject.get("maxUsesNumber"));
		maxUsesNumberOnRenewableSub = GsonParser.parseInt(jsonObject.get("maxUsesNumberOnRenewableSub"));
		couponGroupType = CouponGroupType.get(GsonParser.parseString(jsonObject.get("couponGroupType")));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaCouponsGroup");
		kparams.add("name", this.name);
		kparams.add("descriptions", this.descriptions);
		kparams.add("startDate", this.startDate);
		kparams.add("endDate", this.endDate);
		kparams.add("maxUsesNumber", this.maxUsesNumber);
		kparams.add("maxUsesNumberOnRenewableSub", this.maxUsesNumberOnRenewableSub);
		kparams.add("couponGroupType", this.couponGroupType);
		return kparams;
	}


    public static final Creator<CouponsGroup> CREATOR = new Creator<CouponsGroup>() {
        @Override
        public CouponsGroup createFromParcel(Parcel source) {
            return new CouponsGroup(source);
        }

        @Override
        public CouponsGroup[] newArray(int size) {
            return new CouponsGroup[size];
        }
    };

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        super.writeToParcel(dest, flags);
        dest.writeString(this.id);
        dest.writeString(this.name);
        if(this.descriptions != null) {
            dest.writeInt(this.descriptions.size());
            dest.writeList(this.descriptions);
        } else {
            dest.writeInt(-1);
        }
        dest.writeValue(this.startDate);
        dest.writeValue(this.endDate);
        dest.writeValue(this.maxUsesNumber);
        dest.writeValue(this.maxUsesNumberOnRenewableSub);
        dest.writeInt(this.couponGroupType == null ? -1 : this.couponGroupType.ordinal());
    }

    public CouponsGroup(Parcel in) {
        super(in);
        this.id = in.readString();
        this.name = in.readString();
        int descriptionsSize = in.readInt();
        if( descriptionsSize > -1) {
            this.descriptions = new ArrayList<>();
            in.readList(this.descriptions, TranslationToken.class.getClassLoader());
        }
        this.startDate = (Long)in.readValue(Long.class.getClassLoader());
        this.endDate = (Long)in.readValue(Long.class.getClassLoader());
        this.maxUsesNumber = (Integer)in.readValue(Integer.class.getClassLoader());
        this.maxUsesNumberOnRenewableSub = (Integer)in.readValue(Integer.class.getClassLoader());
        int tmpCouponGroupType = in.readInt();
        this.couponGroupType = tmpCouponGroupType == -1 ? null : CouponGroupType.values()[tmpCouponGroupType];
    }
}

