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
import com.kaltura.client.utils.request.RequestBuilder;
import java.util.ArrayList;
import java.util.List;

/**
 * This class was generated using exec.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

/**
 * Asset Personal Markup
 */
@SuppressWarnings("serial")
@MultiRequestBuilder.Tokenizer(AssetPersonalMarkup.Tokenizer.class)
public class AssetPersonalMarkup extends ObjectBase {
	
	public interface Tokenizer extends ObjectBase.Tokenizer {
		String assetId();
		String assetType();
		RequestBuilder.ListTokenizer<ProductMarkup.Tokenizer> products();
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
	 * all related asset&amp;#39;s Product Markups
	 */
	private List<ProductMarkup> products;

	// assetId:
	public Long getAssetId(){
		return this.assetId;
	}
	// assetType:
	public AssetType getAssetType(){
		return this.assetType;
	}
	// products:
	public List<ProductMarkup> getProducts(){
		return this.products;
	}
	public void setProducts(List<ProductMarkup> products){
		this.products = products;
	}


	public AssetPersonalMarkup() {
		super();
	}

	public AssetPersonalMarkup(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		assetId = GsonParser.parseLong(jsonObject.get("assetId"));
		assetType = AssetType.get(GsonParser.parseString(jsonObject.get("assetType")));
		products = GsonParser.parseArray(jsonObject.getAsJsonArray("products"), ProductMarkup.class);

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaAssetPersonalMarkup");
		kparams.add("products", this.products);
		return kparams;
	}


    public static final Creator<AssetPersonalMarkup> CREATOR = new Creator<AssetPersonalMarkup>() {
        @Override
        public AssetPersonalMarkup createFromParcel(Parcel source) {
            return new AssetPersonalMarkup(source);
        }

        @Override
        public AssetPersonalMarkup[] newArray(int size) {
            return new AssetPersonalMarkup[size];
        }
    };

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        super.writeToParcel(dest, flags);
        dest.writeValue(this.assetId);
        dest.writeInt(this.assetType == null ? -1 : this.assetType.ordinal());
        if(this.products != null) {
            dest.writeInt(this.products.size());
            dest.writeList(this.products);
        } else {
            dest.writeInt(-1);
        }
    }

    public AssetPersonalMarkup(Parcel in) {
        super(in);
        this.assetId = (Long)in.readValue(Long.class.getClassLoader());
        int tmpAssetType = in.readInt();
        this.assetType = tmpAssetType == -1 ? null : AssetType.values()[tmpAssetType];
        int productsSize = in.readInt();
        if( productsSize > -1) {
            this.products = new ArrayList<>();
            in.readList(this.products, ProductMarkup.class.getClassLoader());
        }
    }
}

