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

/**
 * This class was generated using clients-generator\exec.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

/**
 * Favorite details
 */
@SuppressWarnings("serial")
@MultiRequestBuilder.Tokenizer(Favorite.Tokenizer.class)
public class Favorite extends ObjectBase {
	
	public interface Tokenizer extends ObjectBase.Tokenizer {
		String assetId();
		String extraData();
		String createDate();
	}

	/**
	 * AssetInfo Model
	 */
	private Long assetId;
	/**
	 * Extra Value
	 */
	private String extraData;
	/**
	 * Specifies when was the favorite created. Date and time represented as epoch.
	 */
	private Long createDate;

	// assetId:
	public Long getAssetId(){
		return this.assetId;
	}
	public void setAssetId(Long assetId){
		this.assetId = assetId;
	}

	public void assetId(String multirequestToken){
		setToken("assetId", multirequestToken);
	}

	// extraData:
	public String getExtraData(){
		return this.extraData;
	}
	public void setExtraData(String extraData){
		this.extraData = extraData;
	}

	public void extraData(String multirequestToken){
		setToken("extraData", multirequestToken);
	}

	// createDate:
	public Long getCreateDate(){
		return this.createDate;
	}
	public void setCreateDate(Long createDate){
		this.createDate = createDate;
	}

	public void createDate(String multirequestToken){
		setToken("createDate", multirequestToken);
	}


	public Favorite() {
		super();
	}

	public Favorite(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		assetId = GsonParser.parseLong(jsonObject.get("assetId"));
		extraData = GsonParser.parseString(jsonObject.get("extraData"));
		createDate = GsonParser.parseLong(jsonObject.get("createDate"));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaFavorite");
		kparams.add("assetId", this.assetId);
		kparams.add("extraData", this.extraData);
		return kparams;
	}


    public static final Creator<Favorite> CREATOR = new Creator<Favorite>() {
        @Override
        public Favorite createFromParcel(Parcel source) {
            return new Favorite(source);
        }

        @Override
        public Favorite[] newArray(int size) {
            return new Favorite[size];
        }
    };

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        super.writeToParcel(dest, flags);
        dest.writeValue(this.assetId);
        dest.writeString(this.extraData);
        dest.writeValue(this.createDate);
    }

    public Favorite(Parcel in) {
        super(in);
        this.assetId = (Long)in.readValue(Long.class.getClassLoader());
        this.extraData = in.readString();
        this.createDate = (Long)in.readValue(Long.class.getClassLoader());
    }
}

