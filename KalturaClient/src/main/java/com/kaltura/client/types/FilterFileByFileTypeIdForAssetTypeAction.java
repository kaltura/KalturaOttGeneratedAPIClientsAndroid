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
 * Filter file By FileType For AssetType
 */
@SuppressWarnings("serial")
@MultiRequestBuilder.Tokenizer(FilterFileByFileTypeIdForAssetTypeAction.Tokenizer.class)
public abstract class FilterFileByFileTypeIdForAssetTypeAction extends FilterFileByFileTypeIdAction {
	
	public interface Tokenizer extends FilterFileByFileTypeIdAction.Tokenizer {
		String assetTypeIn();
	}

	/**
	 * List of comma separated assetTypes
	 */
	private String assetTypeIn;

	// assetTypeIn:
	public String getAssetTypeIn(){
		return this.assetTypeIn;
	}
	public void setAssetTypeIn(String assetTypeIn){
		this.assetTypeIn = assetTypeIn;
	}

	public void assetTypeIn(String multirequestToken){
		setToken("assetTypeIn", multirequestToken);
	}


	public FilterFileByFileTypeIdForAssetTypeAction() {
		super();
	}

	public FilterFileByFileTypeIdForAssetTypeAction(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		assetTypeIn = GsonParser.parseString(jsonObject.get("assetTypeIn"));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaFilterFileByFileTypeIdForAssetTypeAction");
		kparams.add("assetTypeIn", this.assetTypeIn);
		return kparams;
	}


    @Override
    public void writeToParcel(Parcel dest, int flags) {
        super.writeToParcel(dest, flags);
        dest.writeString(this.assetTypeIn);
    }

    public FilterFileByFileTypeIdForAssetTypeAction(Parcel in) {
        super(in);
        this.assetTypeIn = in.readString();
    }
}

