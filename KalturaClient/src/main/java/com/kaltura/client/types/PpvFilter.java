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
import com.kaltura.client.utils.GsonParser;
import com.kaltura.client.utils.request.MultiRequestBuilder;

/**
 * This class was generated using exec.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

/**
 * Filtering Asset Struct Metas
 */
@SuppressWarnings("serial")
@MultiRequestBuilder.Tokenizer(PpvFilter.Tokenizer.class)
public class PpvFilter extends Filter {
	
	public interface Tokenizer extends Filter.Tokenizer {
		String idIn();
		String couponGroupIdEqual();
		String alsoInactive();
		String nameContains();
		String assetUserRuleIdIn();
	}

	/**
	 * Comma separated identifiers
	 */
	private String idIn;
	/**
	 * couponGroupIdEqual
	 */
	private Integer couponGroupIdEqual;
	/**
	 * return also inactive
	 */
	private Boolean alsoInactive;
	/**
	 * A string that is included in the ppv name
	 */
	private String nameContains;
	/**
	 * comma-separated list of KalturaPpv.assetUserRuleId values.  Matching KalturaPpv
	  objects will be returned by the filter.
	 */
	private String assetUserRuleIdIn;

	// idIn:
	public String getIdIn(){
		return this.idIn;
	}
	public void setIdIn(String idIn){
		this.idIn = idIn;
	}

	public void idIn(String multirequestToken){
		setToken("idIn", multirequestToken);
	}

	// couponGroupIdEqual:
	public Integer getCouponGroupIdEqual(){
		return this.couponGroupIdEqual;
	}
	public void setCouponGroupIdEqual(Integer couponGroupIdEqual){
		this.couponGroupIdEqual = couponGroupIdEqual;
	}

	public void couponGroupIdEqual(String multirequestToken){
		setToken("couponGroupIdEqual", multirequestToken);
	}

	// alsoInactive:
	public Boolean getAlsoInactive(){
		return this.alsoInactive;
	}
	public void setAlsoInactive(Boolean alsoInactive){
		this.alsoInactive = alsoInactive;
	}

	public void alsoInactive(String multirequestToken){
		setToken("alsoInactive", multirequestToken);
	}

	// nameContains:
	public String getNameContains(){
		return this.nameContains;
	}
	public void setNameContains(String nameContains){
		this.nameContains = nameContains;
	}

	public void nameContains(String multirequestToken){
		setToken("nameContains", multirequestToken);
	}

	// assetUserRuleIdIn:
	public String getAssetUserRuleIdIn(){
		return this.assetUserRuleIdIn;
	}
	public void setAssetUserRuleIdIn(String assetUserRuleIdIn){
		this.assetUserRuleIdIn = assetUserRuleIdIn;
	}

	public void assetUserRuleIdIn(String multirequestToken){
		setToken("assetUserRuleIdIn", multirequestToken);
	}


	public PpvFilter() {
		super();
	}

	public PpvFilter(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		idIn = GsonParser.parseString(jsonObject.get("idIn"));
		couponGroupIdEqual = GsonParser.parseInt(jsonObject.get("couponGroupIdEqual"));
		alsoInactive = GsonParser.parseBoolean(jsonObject.get("alsoInactive"));
		nameContains = GsonParser.parseString(jsonObject.get("nameContains"));
		assetUserRuleIdIn = GsonParser.parseString(jsonObject.get("assetUserRuleIdIn"));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaPpvFilter");
		kparams.add("idIn", this.idIn);
		kparams.add("couponGroupIdEqual", this.couponGroupIdEqual);
		kparams.add("alsoInactive", this.alsoInactive);
		kparams.add("nameContains", this.nameContains);
		kparams.add("assetUserRuleIdIn", this.assetUserRuleIdIn);
		return kparams;
	}


    public static final Creator<PpvFilter> CREATOR = new Creator<PpvFilter>() {
        @Override
        public PpvFilter createFromParcel(Parcel source) {
            return new PpvFilter(source);
        }

        @Override
        public PpvFilter[] newArray(int size) {
            return new PpvFilter[size];
        }
    };

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        super.writeToParcel(dest, flags);
        dest.writeString(this.idIn);
        dest.writeValue(this.couponGroupIdEqual);
        dest.writeValue(this.alsoInactive);
        dest.writeString(this.nameContains);
        dest.writeString(this.assetUserRuleIdIn);
    }

    public PpvFilter(Parcel in) {
        super(in);
        this.idIn = in.readString();
        this.couponGroupIdEqual = (Integer)in.readValue(Integer.class.getClassLoader());
        this.alsoInactive = (Boolean)in.readValue(Boolean.class.getClassLoader());
        this.nameContains = in.readString();
        this.assetUserRuleIdIn = in.readString();
    }
}

