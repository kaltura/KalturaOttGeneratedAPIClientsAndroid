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
import com.kaltura.client.enums.HouseholdSuspensionState;
import com.kaltura.client.enums.UserState;
import com.kaltura.client.types.OTTUserType;
import com.kaltura.client.utils.GsonParser;
import com.kaltura.client.utils.request.MultiRequestBuilder;
import com.kaltura.client.utils.request.RequestBuilder;
import java.util.HashMap;
import java.util.Map;

/**
 * This class was generated using exec.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

/**
 * User
 */
@SuppressWarnings("serial")
@MultiRequestBuilder.Tokenizer(OTTUser.Tokenizer.class)
public class OTTUser extends BaseOTTUser {
	
	public interface Tokenizer extends BaseOTTUser.Tokenizer {
		String householdId();
		String email();
		String address();
		String city();
		String countryId();
		String zip();
		String phone();
		String affiliateCode();
		String externalId();
		OTTUserType.Tokenizer userType();
		RequestBuilder.MapTokenizer<StringValue.Tokenizer> dynamicData();
		String isHouseholdMaster();
		String suspensionState();
		String userState();
		String roleIds();
		String createDate();
		String updateDate();
		String lastLoginDate();
		String failedLoginCount();
	}

	/**
	 * Household identifier
	 */
	private Integer householdId;
	/**
	 * Email
	 */
	private String email;
	/**
	 * Address
	 */
	private String address;
	/**
	 * City
	 */
	private String city;
	/**
	 * Country identifier
	 */
	private Integer countryId;
	/**
	 * Zip code
	 */
	private String zip;
	/**
	 * Phone
	 */
	private String phone;
	/**
	 * Affiliate code
	 */
	private String affiliateCode;
	/**
	 * External user identifier
	 */
	private String externalId;
	/**
	 * User type
	 */
	private OTTUserType userType;
	/**
	 * Dynamic data
	 */
	private Map<String, StringValue> dynamicData;
	/**
	 * Is the user the household master
	 */
	private Boolean isHouseholdMaster;
	/**
	 * Suspension state
	 */
	private HouseholdSuspensionState suspensionState;
	/**
	 * User state
	 */
	private UserState userState;
	/**
	 * Comma separated list of role Ids.
	 */
	private String roleIds;
	/**
	 * User create date
	 */
	private Long createDate;
	/**
	 * User last update date
	 */
	private Long updateDate;
	/**
	 * The date of the last successful login
	 */
	private Long lastLoginDate;
	/**
	 * The number of failed login attempts since the last successful login
	 */
	private Integer failedLoginCount;

	// householdId:
	public Integer getHouseholdId(){
		return this.householdId;
	}
	// email:
	public String getEmail(){
		return this.email;
	}
	public void setEmail(String email){
		this.email = email;
	}

	public void email(String multirequestToken){
		setToken("email", multirequestToken);
	}

	// address:
	public String getAddress(){
		return this.address;
	}
	public void setAddress(String address){
		this.address = address;
	}

	public void address(String multirequestToken){
		setToken("address", multirequestToken);
	}

	// city:
	public String getCity(){
		return this.city;
	}
	public void setCity(String city){
		this.city = city;
	}

	public void city(String multirequestToken){
		setToken("city", multirequestToken);
	}

	// countryId:
	public Integer getCountryId(){
		return this.countryId;
	}
	public void setCountryId(Integer countryId){
		this.countryId = countryId;
	}

	public void countryId(String multirequestToken){
		setToken("countryId", multirequestToken);
	}

	// zip:
	public String getZip(){
		return this.zip;
	}
	public void setZip(String zip){
		this.zip = zip;
	}

	public void zip(String multirequestToken){
		setToken("zip", multirequestToken);
	}

	// phone:
	public String getPhone(){
		return this.phone;
	}
	public void setPhone(String phone){
		this.phone = phone;
	}

	public void phone(String multirequestToken){
		setToken("phone", multirequestToken);
	}

	// affiliateCode:
	public String getAffiliateCode(){
		return this.affiliateCode;
	}
	public void setAffiliateCode(String affiliateCode){
		this.affiliateCode = affiliateCode;
	}

	public void affiliateCode(String multirequestToken){
		setToken("affiliateCode", multirequestToken);
	}

	// externalId:
	public String getExternalId(){
		return this.externalId;
	}
	public void setExternalId(String externalId){
		this.externalId = externalId;
	}

	public void externalId(String multirequestToken){
		setToken("externalId", multirequestToken);
	}

	// userType:
	public OTTUserType getUserType(){
		return this.userType;
	}
	public void setUserType(OTTUserType userType){
		this.userType = userType;
	}

	// dynamicData:
	public Map<String, StringValue> getDynamicData(){
		return this.dynamicData;
	}
	public void setDynamicData(Map<String, StringValue> dynamicData){
		this.dynamicData = dynamicData;
	}

	// isHouseholdMaster:
	public Boolean getIsHouseholdMaster(){
		return this.isHouseholdMaster;
	}
	// suspensionState:
	public HouseholdSuspensionState getSuspensionState(){
		return this.suspensionState;
	}
	// userState:
	public UserState getUserState(){
		return this.userState;
	}
	// roleIds:
	public String getRoleIds(){
		return this.roleIds;
	}
	public void setRoleIds(String roleIds){
		this.roleIds = roleIds;
	}

	public void roleIds(String multirequestToken){
		setToken("roleIds", multirequestToken);
	}

	// createDate:
	public Long getCreateDate(){
		return this.createDate;
	}
	// updateDate:
	public Long getUpdateDate(){
		return this.updateDate;
	}
	// lastLoginDate:
	public Long getLastLoginDate(){
		return this.lastLoginDate;
	}
	// failedLoginCount:
	public Integer getFailedLoginCount(){
		return this.failedLoginCount;
	}

	public OTTUser() {
		super();
	}

	public OTTUser(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		householdId = GsonParser.parseInt(jsonObject.get("householdId"));
		email = GsonParser.parseString(jsonObject.get("email"));
		address = GsonParser.parseString(jsonObject.get("address"));
		city = GsonParser.parseString(jsonObject.get("city"));
		countryId = GsonParser.parseInt(jsonObject.get("countryId"));
		zip = GsonParser.parseString(jsonObject.get("zip"));
		phone = GsonParser.parseString(jsonObject.get("phone"));
		affiliateCode = GsonParser.parseString(jsonObject.get("affiliateCode"));
		externalId = GsonParser.parseString(jsonObject.get("externalId"));
		userType = GsonParser.parseObject(jsonObject.getAsJsonObject("userType"), OTTUserType.class);
		dynamicData = GsonParser.parseMap(jsonObject.getAsJsonObject("dynamicData"), StringValue.class);
		isHouseholdMaster = GsonParser.parseBoolean(jsonObject.get("isHouseholdMaster"));
		suspensionState = HouseholdSuspensionState.get(GsonParser.parseString(jsonObject.get("suspensionState")));
		userState = UserState.get(GsonParser.parseString(jsonObject.get("userState")));
		roleIds = GsonParser.parseString(jsonObject.get("roleIds"));
		createDate = GsonParser.parseLong(jsonObject.get("createDate"));
		updateDate = GsonParser.parseLong(jsonObject.get("updateDate"));
		lastLoginDate = GsonParser.parseLong(jsonObject.get("lastLoginDate"));
		failedLoginCount = GsonParser.parseInt(jsonObject.get("failedLoginCount"));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaOTTUser");
		kparams.add("email", this.email);
		kparams.add("address", this.address);
		kparams.add("city", this.city);
		kparams.add("countryId", this.countryId);
		kparams.add("zip", this.zip);
		kparams.add("phone", this.phone);
		kparams.add("affiliateCode", this.affiliateCode);
		kparams.add("externalId", this.externalId);
		kparams.add("userType", this.userType);
		kparams.add("dynamicData", this.dynamicData);
		kparams.add("roleIds", this.roleIds);
		return kparams;
	}


    public static final Creator<OTTUser> CREATOR = new Creator<OTTUser>() {
        @Override
        public OTTUser createFromParcel(Parcel source) {
            return new OTTUser(source);
        }

        @Override
        public OTTUser[] newArray(int size) {
            return new OTTUser[size];
        }
    };

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        super.writeToParcel(dest, flags);
        dest.writeValue(this.householdId);
        dest.writeString(this.email);
        dest.writeString(this.address);
        dest.writeString(this.city);
        dest.writeValue(this.countryId);
        dest.writeString(this.zip);
        dest.writeString(this.phone);
        dest.writeString(this.affiliateCode);
        dest.writeString(this.externalId);
        dest.writeParcelable(this.userType, flags);
        if(this.dynamicData != null) {
            dest.writeInt(this.dynamicData.size());
            for (Map.Entry<String, StringValue> entry : this.dynamicData.entrySet()) {
                dest.writeString(entry.getKey());
                dest.writeParcelable(entry.getValue(), flags);
            }
        } else {
            dest.writeInt(-1);
        }
        dest.writeValue(this.isHouseholdMaster);
        dest.writeInt(this.suspensionState == null ? -1 : this.suspensionState.ordinal());
        dest.writeInt(this.userState == null ? -1 : this.userState.ordinal());
        dest.writeString(this.roleIds);
        dest.writeValue(this.createDate);
        dest.writeValue(this.updateDate);
        dest.writeValue(this.lastLoginDate);
        dest.writeValue(this.failedLoginCount);
    }

    public OTTUser(Parcel in) {
        super(in);
        this.householdId = (Integer)in.readValue(Integer.class.getClassLoader());
        this.email = in.readString();
        this.address = in.readString();
        this.city = in.readString();
        this.countryId = (Integer)in.readValue(Integer.class.getClassLoader());
        this.zip = in.readString();
        this.phone = in.readString();
        this.affiliateCode = in.readString();
        this.externalId = in.readString();
        this.userType = in.readParcelable(OTTUserType.class.getClassLoader());
        int dynamicDataSize = in.readInt();
        if( dynamicDataSize > -1) {
            this.dynamicData = new HashMap<>();
            for (int i = 0; i < dynamicDataSize; i++) {
                String key = in.readString();
                StringValue value = in.readParcelable(StringValue.class.getClassLoader());
                this.dynamicData.put(key, value);
            }
        }
        this.isHouseholdMaster = (Boolean)in.readValue(Boolean.class.getClassLoader());
        int tmpSuspensionState = in.readInt();
        this.suspensionState = tmpSuspensionState == -1 ? null : HouseholdSuspensionState.values()[tmpSuspensionState];
        int tmpUserState = in.readInt();
        this.userState = tmpUserState == -1 ? null : UserState.values()[tmpUserState];
        this.roleIds = in.readString();
        this.createDate = (Long)in.readValue(Long.class.getClassLoader());
        this.updateDate = (Long)in.readValue(Long.class.getClassLoader());
        this.lastLoginDate = (Long)in.readValue(Long.class.getClassLoader());
        this.failedLoginCount = (Integer)in.readValue(Integer.class.getClassLoader());
    }
}

