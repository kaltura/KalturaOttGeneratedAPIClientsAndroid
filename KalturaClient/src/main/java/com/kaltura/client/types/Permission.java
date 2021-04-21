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
import com.kaltura.client.enums.PermissionType;
import com.kaltura.client.types.ObjectBase;
import com.kaltura.client.utils.GsonParser;
import com.kaltura.client.utils.request.MultiRequestBuilder;

/**
 * This class was generated using exec.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

@SuppressWarnings("serial")
@MultiRequestBuilder.Tokenizer(Permission.Tokenizer.class)
public class Permission extends ObjectBase {
	
	public interface Tokenizer extends ObjectBase.Tokenizer {
		String id();
		String name();
		String friendlyName();
		String dependsOnPermissionNames();
		String type();
	}

	/**
	 * Permission identifier
	 */
	private Long id;
	/**
	 * Permission name
	 */
	private String name;
	/**
	 * Permission friendly name
	 */
	private String friendlyName;
	/**
	 * Comma separated permissions names from type SPECIAL_FEATURE
	 */
	private String dependsOnPermissionNames;
	/**
	 * Comma separated permissions names from type SPECIAL_FEATURE
	 */
	private PermissionType type;

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

	// friendlyName:
	public String getFriendlyName(){
		return this.friendlyName;
	}
	public void setFriendlyName(String friendlyName){
		this.friendlyName = friendlyName;
	}

	public void friendlyName(String multirequestToken){
		setToken("friendlyName", multirequestToken);
	}

	// dependsOnPermissionNames:
	public String getDependsOnPermissionNames(){
		return this.dependsOnPermissionNames;
	}
	// type:
	public PermissionType getType(){
		return this.type;
	}
	public void setType(PermissionType type){
		this.type = type;
	}

	public void type(String multirequestToken){
		setToken("type", multirequestToken);
	}


	public Permission() {
		super();
	}

	public Permission(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		id = GsonParser.parseLong(jsonObject.get("id"));
		name = GsonParser.parseString(jsonObject.get("name"));
		friendlyName = GsonParser.parseString(jsonObject.get("friendlyName"));
		dependsOnPermissionNames = GsonParser.parseString(jsonObject.get("dependsOnPermissionNames"));
		type = PermissionType.get(GsonParser.parseString(jsonObject.get("type")));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaPermission");
		kparams.add("name", this.name);
		kparams.add("friendlyName", this.friendlyName);
		kparams.add("type", this.type);
		return kparams;
	}


    public static final Creator<Permission> CREATOR = new Creator<Permission>() {
        @Override
        public Permission createFromParcel(Parcel source) {
            return new Permission(source);
        }

        @Override
        public Permission[] newArray(int size) {
            return new Permission[size];
        }
    };

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        super.writeToParcel(dest, flags);
        dest.writeValue(this.id);
        dest.writeString(this.name);
        dest.writeString(this.friendlyName);
        dest.writeString(this.dependsOnPermissionNames);
        dest.writeInt(this.type == null ? -1 : this.type.ordinal());
    }

    public Permission(Parcel in) {
        super(in);
        this.id = (Long)in.readValue(Long.class.getClassLoader());
        this.name = in.readString();
        this.friendlyName = in.readString();
        this.dependsOnPermissionNames = in.readString();
        int tmpType = in.readInt();
        this.type = tmpType == -1 ? null : PermissionType.values()[tmpType];
    }
}

