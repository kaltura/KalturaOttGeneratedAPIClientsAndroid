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
import com.kaltura.client.enums.ManualCollectionAssetType;
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
@MultiRequestBuilder.Tokenizer(ManualCollectionAsset.Tokenizer.class)
public class ManualCollectionAsset extends ObjectBase {
	
	public interface Tokenizer extends ObjectBase.Tokenizer {
		String id();
		String type();
	}

	/**
	 * Internal identifier of the asset
	 */
	private String id;
	/**
	 * The type of the asset. Possible values: media, epg
	 */
	private ManualCollectionAssetType type;

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

	// type:
	public ManualCollectionAssetType getType(){
		return this.type;
	}
	public void setType(ManualCollectionAssetType type){
		this.type = type;
	}

	public void type(String multirequestToken){
		setToken("type", multirequestToken);
	}


	public ManualCollectionAsset() {
		super();
	}

	public ManualCollectionAsset(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		id = GsonParser.parseString(jsonObject.get("id"));
		type = ManualCollectionAssetType.get(GsonParser.parseString(jsonObject.get("type")));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaManualCollectionAsset");
		kparams.add("id", this.id);
		kparams.add("type", this.type);
		return kparams;
	}


    public static final Creator<ManualCollectionAsset> CREATOR = new Creator<ManualCollectionAsset>() {
        @Override
        public ManualCollectionAsset createFromParcel(Parcel source) {
            return new ManualCollectionAsset(source);
        }

        @Override
        public ManualCollectionAsset[] newArray(int size) {
            return new ManualCollectionAsset[size];
        }
    };

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        super.writeToParcel(dest, flags);
        dest.writeString(this.id);
        dest.writeInt(this.type == null ? -1 : this.type.ordinal());
    }

    public ManualCollectionAsset(Parcel in) {
        super(in);
        this.id = in.readString();
        int tmpType = in.readInt();
        this.type = tmpType == -1 ? null : ManualCollectionAssetType.values()[tmpType];
    }
}
