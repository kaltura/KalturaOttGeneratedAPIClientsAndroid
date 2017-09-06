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
import com.kaltura.client.enums.AssetType;
import com.kaltura.client.utils.GsonParser;
import com.kaltura.client.utils.request.MultiRequestBuilder;

/**
 * This class was generated using clients-generator\exec.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

/**  Filtering Assets requests  */
@SuppressWarnings("serial")
@MultiRequestBuilder.Tokenizer(BookmarkFilter.Tokenizer.class)
public class BookmarkFilter extends Filter {
	
	public interface Tokenizer extends Filter.Tokenizer {
		String assetIdIn();
		String assetTypeEqual();
	}

	/**  Comma separated list of assets identifiers  */
	private String assetIdIn;
	/**  Asset type  */
	private AssetType assetTypeEqual;

	// assetIdIn:
	public String getAssetIdIn(){
		return this.assetIdIn;
	}
	public void setAssetIdIn(String assetIdIn){
		this.assetIdIn = assetIdIn;
	}

	public void assetIdIn(String multirequestToken){
		setToken("assetIdIn", multirequestToken);
	}

	// assetTypeEqual:
	public AssetType getAssetTypeEqual(){
		return this.assetTypeEqual;
	}
	public void setAssetTypeEqual(AssetType assetTypeEqual){
		this.assetTypeEqual = assetTypeEqual;
	}

	public void assetTypeEqual(String multirequestToken){
		setToken("assetTypeEqual", multirequestToken);
	}


	public BookmarkFilter() {
		super();
	}

	public BookmarkFilter(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		assetIdIn = GsonParser.parseString(jsonObject.get("assetIdIn"));
		assetTypeEqual = AssetType.get(GsonParser.parseString(jsonObject.get("assetTypeEqual")));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaBookmarkFilter");
		kparams.add("assetIdIn", this.assetIdIn);
		kparams.add("assetTypeEqual", this.assetTypeEqual);
		return kparams;
	}


    public static final Creator<BookmarkFilter> CREATOR = new Creator<BookmarkFilter>() {
        @Override
        public BookmarkFilter createFromParcel(Parcel source) {
            return new BookmarkFilter(source);
        }

        @Override
        public BookmarkFilter[] newArray(int size) {
            return new BookmarkFilter[size];
        }
    };

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        super.writeToParcel(dest, flags);
        dest.writeString(this.assetIdIn);
        dest.writeInt(this.assetTypeEqual == null ? -1 : this.assetTypeEqual.ordinal());
    }

    public BookmarkFilter(Parcel in) {
        super(in);
        this.assetIdIn = in.readString();
        int tmpAssetTypeEqual = in.readInt();
        this.assetTypeEqual = tmpAssetTypeEqual == -1 ? null : AssetType.values()[tmpAssetTypeEqual];
    }
}

