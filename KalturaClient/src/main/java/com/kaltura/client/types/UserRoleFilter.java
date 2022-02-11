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
import com.kaltura.client.enums.UserRoleProfile;
import com.kaltura.client.enums.UserRoleType;
import com.kaltura.client.utils.GsonParser;
import com.kaltura.client.utils.request.MultiRequestBuilder;

/**
 * This class was generated using exec.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

/**
 * User roles filter
 */
@SuppressWarnings("serial")
@MultiRequestBuilder.Tokenizer(UserRoleFilter.Tokenizer.class)
public class UserRoleFilter extends Filter {
	
	public interface Tokenizer extends Filter.Tokenizer {
		String idIn();
		String currentUserRoleIdsContains();
		String typeEqual();
		String profileEqual();
	}

	/**
	 * Comma separated roles identifiers
	 */
	private String idIn;
	/**
	 * Indicates whether the results should be filtered by userId using the current
	 */
	private Boolean currentUserRoleIdsContains;
	/**
	 * User role type
	 */
	private UserRoleType typeEqual;
	/**
	 * User role profile
	 */
	private UserRoleProfile profileEqual;

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

	// currentUserRoleIdsContains:
	public Boolean getCurrentUserRoleIdsContains(){
		return this.currentUserRoleIdsContains;
	}
	public void setCurrentUserRoleIdsContains(Boolean currentUserRoleIdsContains){
		this.currentUserRoleIdsContains = currentUserRoleIdsContains;
	}

	public void currentUserRoleIdsContains(String multirequestToken){
		setToken("currentUserRoleIdsContains", multirequestToken);
	}

	// typeEqual:
	public UserRoleType getTypeEqual(){
		return this.typeEqual;
	}
	public void setTypeEqual(UserRoleType typeEqual){
		this.typeEqual = typeEqual;
	}

	public void typeEqual(String multirequestToken){
		setToken("typeEqual", multirequestToken);
	}

	// profileEqual:
	public UserRoleProfile getProfileEqual(){
		return this.profileEqual;
	}
	public void setProfileEqual(UserRoleProfile profileEqual){
		this.profileEqual = profileEqual;
	}

	public void profileEqual(String multirequestToken){
		setToken("profileEqual", multirequestToken);
	}


	public UserRoleFilter() {
		super();
	}

	public UserRoleFilter(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		idIn = GsonParser.parseString(jsonObject.get("idIn"));
		currentUserRoleIdsContains = GsonParser.parseBoolean(jsonObject.get("currentUserRoleIdsContains"));
		typeEqual = UserRoleType.get(GsonParser.parseString(jsonObject.get("typeEqual")));
		profileEqual = UserRoleProfile.get(GsonParser.parseString(jsonObject.get("profileEqual")));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaUserRoleFilter");
		kparams.add("idIn", this.idIn);
		kparams.add("currentUserRoleIdsContains", this.currentUserRoleIdsContains);
		kparams.add("typeEqual", this.typeEqual);
		kparams.add("profileEqual", this.profileEqual);
		return kparams;
	}


    public static final Creator<UserRoleFilter> CREATOR = new Creator<UserRoleFilter>() {
        @Override
        public UserRoleFilter createFromParcel(Parcel source) {
            return new UserRoleFilter(source);
        }

        @Override
        public UserRoleFilter[] newArray(int size) {
            return new UserRoleFilter[size];
        }
    };

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        super.writeToParcel(dest, flags);
        dest.writeString(this.idIn);
        dest.writeValue(this.currentUserRoleIdsContains);
        dest.writeInt(this.typeEqual == null ? -1 : this.typeEqual.ordinal());
        dest.writeInt(this.profileEqual == null ? -1 : this.profileEqual.ordinal());
    }

    public UserRoleFilter(Parcel in) {
        super(in);
        this.idIn = in.readString();
        this.currentUserRoleIdsContains = (Boolean)in.readValue(Boolean.class.getClassLoader());
        int tmpTypeEqual = in.readInt();
        this.typeEqual = tmpTypeEqual == -1 ? null : UserRoleType.values()[tmpTypeEqual];
        int tmpProfileEqual = in.readInt();
        this.profileEqual = tmpProfileEqual == -1 ? null : UserRoleProfile.values()[tmpProfileEqual];
    }
}

