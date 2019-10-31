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
import com.kaltura.client.enums.CouponStatus;
import com.kaltura.client.enums.TransactionType;
import com.kaltura.client.utils.GsonParser;
import com.kaltura.client.utils.request.MultiRequestBuilder;

/**
 * This class was generated using exec.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

@SuppressWarnings("serial")
@MultiRequestBuilder.Tokenizer(HouseholdCouponFilter.Tokenizer.class)
public class HouseholdCouponFilter extends CrudFilter {
	
	public interface Tokenizer extends CrudFilter.Tokenizer {
		String businessModuleTypeEqual();
		String businessModuleIdEqual();
		String couponCode();
		String status();
	}

	/**
	 * Indicates which household coupons list to return by their business module type.
	 */
	private TransactionType businessModuleTypeEqual;
	/**
	 * Indicates which household coupons list to return by their business module ID.
	 */
	private Long businessModuleIdEqual;
	/**
	 * Allow clients to inquiry if a specific coupon is part of an HH’s wallet or not
	 */
	private String couponCode;
	/**
	 * Allow clients to filter out coupons which are valid/invalid
	 */
	private CouponStatus status;

	// businessModuleTypeEqual:
	public TransactionType getBusinessModuleTypeEqual(){
		return this.businessModuleTypeEqual;
	}
	public void setBusinessModuleTypeEqual(TransactionType businessModuleTypeEqual){
		this.businessModuleTypeEqual = businessModuleTypeEqual;
	}

	public void businessModuleTypeEqual(String multirequestToken){
		setToken("businessModuleTypeEqual", multirequestToken);
	}

	// businessModuleIdEqual:
	public Long getBusinessModuleIdEqual(){
		return this.businessModuleIdEqual;
	}
	public void setBusinessModuleIdEqual(Long businessModuleIdEqual){
		this.businessModuleIdEqual = businessModuleIdEqual;
	}

	public void businessModuleIdEqual(String multirequestToken){
		setToken("businessModuleIdEqual", multirequestToken);
	}

	// couponCode:
	public String getCouponCode(){
		return this.couponCode;
	}
	public void setCouponCode(String couponCode){
		this.couponCode = couponCode;
	}

	public void couponCode(String multirequestToken){
		setToken("couponCode", multirequestToken);
	}

	// status:
	public CouponStatus getStatus(){
		return this.status;
	}
	public void setStatus(CouponStatus status){
		this.status = status;
	}

	public void status(String multirequestToken){
		setToken("status", multirequestToken);
	}


	public HouseholdCouponFilter() {
		super();
	}

	public HouseholdCouponFilter(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		businessModuleTypeEqual = TransactionType.get(GsonParser.parseString(jsonObject.get("businessModuleTypeEqual")));
		businessModuleIdEqual = GsonParser.parseLong(jsonObject.get("businessModuleIdEqual"));
		couponCode = GsonParser.parseString(jsonObject.get("couponCode"));
		status = CouponStatus.get(GsonParser.parseString(jsonObject.get("status")));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaHouseholdCouponFilter");
		kparams.add("businessModuleTypeEqual", this.businessModuleTypeEqual);
		kparams.add("businessModuleIdEqual", this.businessModuleIdEqual);
		kparams.add("couponCode", this.couponCode);
		kparams.add("status", this.status);
		return kparams;
	}


    public static final Creator<HouseholdCouponFilter> CREATOR = new Creator<HouseholdCouponFilter>() {
        @Override
        public HouseholdCouponFilter createFromParcel(Parcel source) {
            return new HouseholdCouponFilter(source);
        }

        @Override
        public HouseholdCouponFilter[] newArray(int size) {
            return new HouseholdCouponFilter[size];
        }
    };

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        super.writeToParcel(dest, flags);
        dest.writeInt(this.businessModuleTypeEqual == null ? -1 : this.businessModuleTypeEqual.ordinal());
        dest.writeValue(this.businessModuleIdEqual);
        dest.writeString(this.couponCode);
        dest.writeInt(this.status == null ? -1 : this.status.ordinal());
    }

    public HouseholdCouponFilter(Parcel in) {
        super(in);
        int tmpBusinessModuleTypeEqual = in.readInt();
        this.businessModuleTypeEqual = tmpBusinessModuleTypeEqual == -1 ? null : TransactionType.values()[tmpBusinessModuleTypeEqual];
        this.businessModuleIdEqual = (Long)in.readValue(Long.class.getClassLoader());
        this.couponCode = in.readString();
        int tmpStatus = in.readInt();
        this.status = tmpStatus == -1 ? null : CouponStatus.values()[tmpStatus];
    }
}

