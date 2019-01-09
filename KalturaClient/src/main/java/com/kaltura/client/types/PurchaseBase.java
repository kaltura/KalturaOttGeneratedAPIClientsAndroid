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
// Copyright (C) 2006-2019  Kaltura Inc.
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
 * This class was generated using clients-generator\exec.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

@SuppressWarnings("serial")
@MultiRequestBuilder.Tokenizer(PurchaseBase.Tokenizer.class)
public class PurchaseBase extends ObjectBase {
	
	public interface Tokenizer extends ObjectBase.Tokenizer {
		String productId();
		String contentId();
		String productType();
	}

	/**
	 * Identifier for the package from which this content is offered
	 */
	private Integer productId;
	/**
	 * Identifier for the content to purchase. Relevant only if Product type = PPV
	 */
	private Integer contentId;
	/**
	 * Package type. Possible values: PPV, Subscription, Collection
	 */
	private TransactionType productType;

	// productId:
	public Integer getProductId(){
		return this.productId;
	}
	public void setProductId(Integer productId){
		this.productId = productId;
	}

	public void productId(String multirequestToken){
		setToken("productId", multirequestToken);
	}

	// contentId:
	public Integer getContentId(){
		return this.contentId;
	}
	public void setContentId(Integer contentId){
		this.contentId = contentId;
	}

	public void contentId(String multirequestToken){
		setToken("contentId", multirequestToken);
	}

	// productType:
	public TransactionType getProductType(){
		return this.productType;
	}
	public void setProductType(TransactionType productType){
		this.productType = productType;
	}

	public void productType(String multirequestToken){
		setToken("productType", multirequestToken);
	}


	public PurchaseBase() {
		super();
	}

	public PurchaseBase(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		productId = GsonParser.parseInt(jsonObject.get("productId"));
		contentId = GsonParser.parseInt(jsonObject.get("contentId"));
		productType = TransactionType.get(GsonParser.parseString(jsonObject.get("productType")));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaPurchaseBase");
		kparams.add("productId", this.productId);
		kparams.add("contentId", this.contentId);
		kparams.add("productType", this.productType);
		return kparams;
	}


    public static final Creator<PurchaseBase> CREATOR = new Creator<PurchaseBase>() {
        @Override
        public PurchaseBase createFromParcel(Parcel source) {
            return new PurchaseBase(source);
        }

        @Override
        public PurchaseBase[] newArray(int size) {
            return new PurchaseBase[size];
        }
    };

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        super.writeToParcel(dest, flags);
        dest.writeValue(this.productId);
        dest.writeValue(this.contentId);
        dest.writeInt(this.productType == null ? -1 : this.productType.ordinal());
    }

    public PurchaseBase(Parcel in) {
        super(in);
        this.productId = (Integer)in.readValue(Integer.class.getClassLoader());
        this.contentId = (Integer)in.readValue(Integer.class.getClassLoader());
        int tmpProductType = in.readInt();
        this.productType = tmpProductType == -1 ? null : TransactionType.values()[tmpProductType];
    }
}

