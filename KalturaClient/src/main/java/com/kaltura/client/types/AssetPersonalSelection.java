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
import com.kaltura.client.enums.AssetType;
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
 * Asset personal selection
 */
@SuppressWarnings("serial")
@MultiRequestBuilder.Tokenizer(AssetPersonalSelection.Tokenizer.class)
public class AssetPersonalSelection extends ObjectBase {
	
	public interface Tokenizer extends ObjectBase.Tokenizer {
		String assetId();
		String assetType();
		String updateDate();
	}

	/**
	 * Asset Id
	 */
	private Long assetId;
	/**
	 * Asset Type
	 */
	private AssetType assetType;
	/**
	 * Update Date
	 */
	private Long updateDate;

	// assetId:
	public Long getAssetId(){
		return this.assetId;
	}
	// assetType:
	public AssetType getAssetType(){
		return this.assetType;
	}
	// updateDate:
	public Long getUpdateDate(){
		return this.updateDate;
	}

	public AssetPersonalSelection() {
		super();
	}

	public AssetPersonalSelection(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		assetId = GsonParser.parseLong(jsonObject.get("assetId"));
		assetType = AssetType.get(GsonParser.parseString(jsonObject.get("assetType")));
		updateDate = GsonParser.parseLong(jsonObject.get("updateDate"));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaAssetPersonalSelection");
		return kparams;
	}


    public static final Creator<AssetPersonalSelection> CREATOR = new Creator<AssetPersonalSelection>() {
        @Override
        public AssetPersonalSelection createFromParcel(Parcel source) {
            return new AssetPersonalSelection(source);
        }

        @Override
        public AssetPersonalSelection[] newArray(int size) {
            return new AssetPersonalSelection[size];
        }
    };

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        super.writeToParcel(dest, flags);
        dest.writeValue(this.assetId);
        dest.writeInt(this.assetType == null ? -1 : this.assetType.ordinal());
        dest.writeValue(this.updateDate);
    }

    public AssetPersonalSelection(Parcel in) {
        super(in);
        this.assetId = (Long)in.readValue(Long.class.getClassLoader());
        int tmpAssetType = in.readInt();
        this.assetType = tmpAssetType == -1 ? null : AssetType.values()[tmpAssetType];
        this.updateDate = (Long)in.readValue(Long.class.getClassLoader());
    }
}

