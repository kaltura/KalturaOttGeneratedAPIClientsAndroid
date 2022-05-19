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
 * Permissions filter
 */
@SuppressWarnings("serial")
@MultiRequestBuilder.Tokenizer(PermissionFilter.Tokenizer.class)
public class PermissionFilter extends BasePermissionFilter {
	
	public interface Tokenizer extends BasePermissionFilter.Tokenizer {
		String currentUserPermissionsContains();
		String roleIdIn();
	}

	/**
	 * Indicates whether the results should be filtered by userId using the current
	 */
	private Boolean currentUserPermissionsContains;
	/**
	 * Return permissions by role ID
	 */
	private Long roleIdIn;

	// currentUserPermissionsContains:
	public Boolean getCurrentUserPermissionsContains(){
		return this.currentUserPermissionsContains;
	}
	public void setCurrentUserPermissionsContains(Boolean currentUserPermissionsContains){
		this.currentUserPermissionsContains = currentUserPermissionsContains;
	}

	public void currentUserPermissionsContains(String multirequestToken){
		setToken("currentUserPermissionsContains", multirequestToken);
	}

	// roleIdIn:
	public Long getRoleIdIn(){
		return this.roleIdIn;
	}
	public void setRoleIdIn(Long roleIdIn){
		this.roleIdIn = roleIdIn;
	}

	public void roleIdIn(String multirequestToken){
		setToken("roleIdIn", multirequestToken);
	}


	public PermissionFilter() {
		super();
	}

	public PermissionFilter(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		currentUserPermissionsContains = GsonParser.parseBoolean(jsonObject.get("currentUserPermissionsContains"));
		roleIdIn = GsonParser.parseLong(jsonObject.get("roleIdIn"));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaPermissionFilter");
		kparams.add("currentUserPermissionsContains", this.currentUserPermissionsContains);
		kparams.add("roleIdIn", this.roleIdIn);
		return kparams;
	}


    public static final Creator<PermissionFilter> CREATOR = new Creator<PermissionFilter>() {
        @Override
        public PermissionFilter createFromParcel(Parcel source) {
            return new PermissionFilter(source);
        }

        @Override
        public PermissionFilter[] newArray(int size) {
            return new PermissionFilter[size];
        }
    };

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        super.writeToParcel(dest, flags);
        dest.writeValue(this.currentUserPermissionsContains);
        dest.writeValue(this.roleIdIn);
    }

    public PermissionFilter(Parcel in) {
        super(in);
        this.currentUserPermissionsContains = (Boolean)in.readValue(Boolean.class.getClassLoader());
        this.roleIdIn = (Long)in.readValue(Long.class.getClassLoader());
    }
}

