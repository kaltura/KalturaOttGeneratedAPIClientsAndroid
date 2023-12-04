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
import com.kaltura.client.enums.TransactionType;
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
 * Product Markup
 */
@SuppressWarnings("serial")
@MultiRequestBuilder.Tokenizer(ProductMarkup.Tokenizer.class)
public class ProductMarkup extends ObjectBase {
	
	public interface Tokenizer extends ObjectBase.Tokenizer {
		String productId();
		String productType();
		String isEntitled();
	}

	/**
	 * Product Id
	 */
	private Long productId;
	/**
	 * Product Type
	 */
	private TransactionType productType;
	/**
	 * Is Entitled to this product
	 */
	private Boolean isEntitled;

	// productId:
	public Long getProductId(){
		return this.productId;
	}
	// productType:
	public TransactionType getProductType(){
		return this.productType;
	}
	// isEntitled:
	public Boolean getIsEntitled(){
		return this.isEntitled;
	}

	public ProductMarkup() {
		super();
	}

	public ProductMarkup(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		productId = GsonParser.parseLong(jsonObject.get("productId"));
		productType = TransactionType.get(GsonParser.parseString(jsonObject.get("productType")));
		isEntitled = GsonParser.parseBoolean(jsonObject.get("isEntitled"));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaProductMarkup");
		return kparams;
	}


    public static final Creator<ProductMarkup> CREATOR = new Creator<ProductMarkup>() {
        @Override
        public ProductMarkup createFromParcel(Parcel source) {
            return new ProductMarkup(source);
        }

        @Override
        public ProductMarkup[] newArray(int size) {
            return new ProductMarkup[size];
        }
    };

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        super.writeToParcel(dest, flags);
        dest.writeValue(this.productId);
        dest.writeInt(this.productType == null ? -1 : this.productType.ordinal());
        dest.writeValue(this.isEntitled);
    }

    public ProductMarkup(Parcel in) {
        super(in);
        this.productId = (Long)in.readValue(Long.class.getClassLoader());
        int tmpProductType = in.readInt();
        this.productType = tmpProductType == -1 ? null : TransactionType.values()[tmpProductType];
        this.isEntitled = (Boolean)in.readValue(Boolean.class.getClassLoader());
    }
}

