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
import com.kaltura.client.enums.HouseholdRestriction;
import com.kaltura.client.enums.HouseholdState;
import com.kaltura.client.types.ObjectBase;
import com.kaltura.client.utils.GsonParser;
import com.kaltura.client.utils.request.MultiRequestBuilder;

/**
 * This class was generated using exec.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

/**
 * Household details
 */
@SuppressWarnings("serial")
@MultiRequestBuilder.Tokenizer(Household.Tokenizer.class)
public class Household extends ObjectBase {
	
	public interface Tokenizer extends ObjectBase.Tokenizer {
		String id();
		String name();
		String description();
		String externalId();
		String householdLimitationsId();
		String devicesLimit();
		String usersLimit();
		String concurrentLimit();
		String regionId();
		String state();
		String isFrequencyEnabled();
		String frequencyNextDeviceAction();
		String frequencyNextUserAction();
		String restriction();
		String roleId();
	}

	/**
	 * Household identifier
	 */
	private Long id;
	/**
	 * Household name
	 */
	private String name;
	/**
	 * Household description
	 */
	private String description;
	/**
	 * Household external identifier
	 */
	private String externalId;
	/**
	 * Household limitation module identifier
	 */
	private Integer householdLimitationsId;
	/**
	 * The max number of the devices that can be added to the household
	 */
	private Integer devicesLimit;
	/**
	 * The max number of the users that can be added to the household
	 */
	private Integer usersLimit;
	/**
	 * The max number of concurrent streams in the household
	 */
	private Integer concurrentLimit;
	/**
	 * The households region identifier
	 */
	private Integer regionId;
	/**
	 * Household state
	 */
	private HouseholdState state;
	/**
	 * Is household frequency enabled
	 */
	private Boolean isFrequencyEnabled;
	/**
	 * The next time a device is allowed to be removed from the household (epoch)
	 */
	private Long frequencyNextDeviceAction;
	/**
	 * The next time a user is allowed to be removed from the household (epoch)
	 */
	private Long frequencyNextUserAction;
	/**
	 * Household restriction
	 */
	private HouseholdRestriction restriction;
	/**
	 * suspended roleId
	 */
	private Integer roleId;

	// id:
	public Long getId(){
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

	// description:
	public String getDescription(){
		return this.description;
	}
	public void setDescription(String description){
		this.description = description;
	}

	public void description(String multirequestToken){
		setToken("description", multirequestToken);
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

	// householdLimitationsId:
	public Integer getHouseholdLimitationsId(){
		return this.householdLimitationsId;
	}
	// devicesLimit:
	public Integer getDevicesLimit(){
		return this.devicesLimit;
	}
	// usersLimit:
	public Integer getUsersLimit(){
		return this.usersLimit;
	}
	// concurrentLimit:
	public Integer getConcurrentLimit(){
		return this.concurrentLimit;
	}
	// regionId:
	public Integer getRegionId(){
		return this.regionId;
	}
	public void setRegionId(Integer regionId){
		this.regionId = regionId;
	}

	public void regionId(String multirequestToken){
		setToken("regionId", multirequestToken);
	}

	// state:
	public HouseholdState getState(){
		return this.state;
	}
	// isFrequencyEnabled:
	public Boolean getIsFrequencyEnabled(){
		return this.isFrequencyEnabled;
	}
	// frequencyNextDeviceAction:
	public Long getFrequencyNextDeviceAction(){
		return this.frequencyNextDeviceAction;
	}
	// frequencyNextUserAction:
	public Long getFrequencyNextUserAction(){
		return this.frequencyNextUserAction;
	}
	// restriction:
	public HouseholdRestriction getRestriction(){
		return this.restriction;
	}
	// roleId:
	public Integer getRoleId(){
		return this.roleId;
	}

	public Household() {
		super();
	}

	public Household(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		id = GsonParser.parseLong(jsonObject.get("id"));
		name = GsonParser.parseString(jsonObject.get("name"));
		description = GsonParser.parseString(jsonObject.get("description"));
		externalId = GsonParser.parseString(jsonObject.get("externalId"));
		householdLimitationsId = GsonParser.parseInt(jsonObject.get("householdLimitationsId"));
		devicesLimit = GsonParser.parseInt(jsonObject.get("devicesLimit"));
		usersLimit = GsonParser.parseInt(jsonObject.get("usersLimit"));
		concurrentLimit = GsonParser.parseInt(jsonObject.get("concurrentLimit"));
		regionId = GsonParser.parseInt(jsonObject.get("regionId"));
		state = HouseholdState.get(GsonParser.parseString(jsonObject.get("state")));
		isFrequencyEnabled = GsonParser.parseBoolean(jsonObject.get("isFrequencyEnabled"));
		frequencyNextDeviceAction = GsonParser.parseLong(jsonObject.get("frequencyNextDeviceAction"));
		frequencyNextUserAction = GsonParser.parseLong(jsonObject.get("frequencyNextUserAction"));
		restriction = HouseholdRestriction.get(GsonParser.parseString(jsonObject.get("restriction")));
		roleId = GsonParser.parseInt(jsonObject.get("roleId"));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaHousehold");
		kparams.add("name", this.name);
		kparams.add("description", this.description);
		kparams.add("externalId", this.externalId);
		kparams.add("regionId", this.regionId);
		return kparams;
	}


    public static final Creator<Household> CREATOR = new Creator<Household>() {
        @Override
        public Household createFromParcel(Parcel source) {
            return new Household(source);
        }

        @Override
        public Household[] newArray(int size) {
            return new Household[size];
        }
    };

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        super.writeToParcel(dest, flags);
        dest.writeValue(this.id);
        dest.writeString(this.name);
        dest.writeString(this.description);
        dest.writeString(this.externalId);
        dest.writeValue(this.householdLimitationsId);
        dest.writeValue(this.devicesLimit);
        dest.writeValue(this.usersLimit);
        dest.writeValue(this.concurrentLimit);
        dest.writeValue(this.regionId);
        dest.writeInt(this.state == null ? -1 : this.state.ordinal());
        dest.writeValue(this.isFrequencyEnabled);
        dest.writeValue(this.frequencyNextDeviceAction);
        dest.writeValue(this.frequencyNextUserAction);
        dest.writeInt(this.restriction == null ? -1 : this.restriction.ordinal());
        dest.writeValue(this.roleId);
    }

    public Household(Parcel in) {
        super(in);
        this.id = (Long)in.readValue(Long.class.getClassLoader());
        this.name = in.readString();
        this.description = in.readString();
        this.externalId = in.readString();
        this.householdLimitationsId = (Integer)in.readValue(Integer.class.getClassLoader());
        this.devicesLimit = (Integer)in.readValue(Integer.class.getClassLoader());
        this.usersLimit = (Integer)in.readValue(Integer.class.getClassLoader());
        this.concurrentLimit = (Integer)in.readValue(Integer.class.getClassLoader());
        this.regionId = (Integer)in.readValue(Integer.class.getClassLoader());
        int tmpState = in.readInt();
        this.state = tmpState == -1 ? null : HouseholdState.values()[tmpState];
        this.isFrequencyEnabled = (Boolean)in.readValue(Boolean.class.getClassLoader());
        this.frequencyNextDeviceAction = (Long)in.readValue(Long.class.getClassLoader());
        this.frequencyNextUserAction = (Long)in.readValue(Long.class.getClassLoader());
        int tmpRestriction = in.readInt();
        this.restriction = tmpRestriction == -1 ? null : HouseholdRestriction.values()[tmpRestriction];
        this.roleId = (Integer)in.readValue(Integer.class.getClassLoader());
    }
}

