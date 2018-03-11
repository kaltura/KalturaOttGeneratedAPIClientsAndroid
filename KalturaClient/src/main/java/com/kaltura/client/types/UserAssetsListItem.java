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
// Copyright (C) 2006-2018  Kaltura Inc.
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
import com.kaltura.client.enums.UserAssetsListItemType;
import com.kaltura.client.enums.UserAssetsListType;
import com.kaltura.client.types.ObjectBase;
import com.kaltura.client.utils.GsonParser;
import com.kaltura.client.utils.request.MultiRequestBuilder;

/**
 * This class was generated using clients-generator\exec.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

/**
 * An item of user asset list
 */
@SuppressWarnings("serial")
@MultiRequestBuilder.Tokenizer(UserAssetsListItem.Tokenizer.class)
public class UserAssetsListItem extends ObjectBase {
	
	public interface Tokenizer extends ObjectBase.Tokenizer {
		String id();
		String orderIndex();
		String type();
		String userId();
		String listType();
	}

	/**
	 * Asset identifier
	 */
	private String id;
	/**
	 * The order index of the asset in the list
	 */
	private Integer orderIndex;
	/**
	 * The type of the asset
	 */
	private UserAssetsListItemType type;
	/**
	 * The identifier of the user who added the item to the list
	 */
	private String userId;
	/**
	 * The type of the list, all is not supported
	 */
	private UserAssetsListType listType;

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

	// orderIndex:
	public Integer getOrderIndex(){
		return this.orderIndex;
	}
	public void setOrderIndex(Integer orderIndex){
		this.orderIndex = orderIndex;
	}

	public void orderIndex(String multirequestToken){
		setToken("orderIndex", multirequestToken);
	}

	// type:
	public UserAssetsListItemType getType(){
		return this.type;
	}
	public void setType(UserAssetsListItemType type){
		this.type = type;
	}

	public void type(String multirequestToken){
		setToken("type", multirequestToken);
	}

	// userId:
	public String getUserId(){
		return this.userId;
	}
	public void setUserId(String userId){
		this.userId = userId;
	}

	public void userId(String multirequestToken){
		setToken("userId", multirequestToken);
	}

	// listType:
	public UserAssetsListType getListType(){
		return this.listType;
	}
	public void setListType(UserAssetsListType listType){
		this.listType = listType;
	}

	public void listType(String multirequestToken){
		setToken("listType", multirequestToken);
	}


	public UserAssetsListItem() {
		super();
	}

	public UserAssetsListItem(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		id = GsonParser.parseString(jsonObject.get("id"));
		orderIndex = GsonParser.parseInt(jsonObject.get("orderIndex"));
		type = UserAssetsListItemType.get(GsonParser.parseString(jsonObject.get("type")));
		userId = GsonParser.parseString(jsonObject.get("userId"));
		listType = UserAssetsListType.get(GsonParser.parseString(jsonObject.get("listType")));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaUserAssetsListItem");
		kparams.add("id", this.id);
		kparams.add("orderIndex", this.orderIndex);
		kparams.add("type", this.type);
		kparams.add("listType", this.listType);
		return kparams;
	}


    public static final Creator<UserAssetsListItem> CREATOR = new Creator<UserAssetsListItem>() {
        @Override
        public UserAssetsListItem createFromParcel(Parcel source) {
            return new UserAssetsListItem(source);
        }

        @Override
        public UserAssetsListItem[] newArray(int size) {
            return new UserAssetsListItem[size];
        }
    };

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        super.writeToParcel(dest, flags);
        dest.writeString(this.id);
        dest.writeValue(this.orderIndex);
        dest.writeInt(this.type == null ? -1 : this.type.ordinal());
        dest.writeString(this.userId);
        dest.writeInt(this.listType == null ? -1 : this.listType.ordinal());
    }

    public UserAssetsListItem(Parcel in) {
        super(in);
        this.id = in.readString();
        this.orderIndex = (Integer)in.readValue(Integer.class.getClassLoader());
        int tmpType = in.readInt();
        this.type = tmpType == -1 ? null : UserAssetsListItemType.values()[tmpType];
        this.userId = in.readString();
        int tmpListType = in.readInt();
        this.listType = tmpListType == -1 ? null : UserAssetsListType.values()[tmpListType];
    }
}

