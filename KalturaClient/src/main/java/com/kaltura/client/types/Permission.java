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
// Copyright (C) 2006-2017  Kaltura Inc.
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

@SuppressWarnings("serial")
@MultiRequestBuilder.Tokenizer(Permission.Tokenizer.class)
public class Permission extends ObjectBase {
	
	public interface Tokenizer extends ObjectBase.Tokenizer {
		String id();
		String name();
		RequestBuilder.ListTokenizer<PermissionItem.Tokenizer> permissionItems();
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
	 * List of permission items associated with the permission
	 */
	private List<PermissionItem> permissionItems;

	// id:
	public Long getId(){
		return this.id;
	}
	public void setId(Long id){
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

	// permissionItems:
	public List<PermissionItem> getPermissionItems(){
		return this.permissionItems;
	}
	public void setPermissionItems(List<PermissionItem> permissionItems){
		this.permissionItems = permissionItems;
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
		permissionItems = GsonParser.parseArray(jsonObject.getAsJsonArray("permissionItems"), PermissionItem.class);

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaPermission");
		kparams.add("name", this.name);
		kparams.add("permissionItems", this.permissionItems);
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
        if(this.permissionItems != null) {
            dest.writeInt(this.permissionItems.size());
            dest.writeList(this.permissionItems);
        } else {
            dest.writeInt(-1);
        }
    }

    public Permission(Parcel in) {
        super(in);
        this.id = (Long)in.readValue(Long.class.getClassLoader());
        this.name = in.readString();
        int permissionItemsSize = in.readInt();
        if( permissionItemsSize > -1) {
            this.permissionItems = new ArrayList<>();
            in.readList(this.permissionItems, PermissionItem.class.getClassLoader());
        }
    }
}

