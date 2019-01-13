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
 * Product Code
 */
@SuppressWarnings("serial")
@MultiRequestBuilder.Tokenizer(ProductCode.Tokenizer.class)
public class ProductCode extends ObjectBase {
	
	public interface Tokenizer extends ObjectBase.Tokenizer {
		String inappProvider();
		String code();
	}

	/**
	 * Provider Name
	 */
	private String inappProvider;
	/**
	 * Product Code
	 */
	private String code;

	// inappProvider:
	public String getInappProvider(){
		return this.inappProvider;
	}
	public void setInappProvider(String inappProvider){
		this.inappProvider = inappProvider;
	}

	public void inappProvider(String multirequestToken){
		setToken("inappProvider", multirequestToken);
	}

	// code:
	public String getCode(){
		return this.code;
	}
	public void setCode(String code){
		this.code = code;
	}

	public void code(String multirequestToken){
		setToken("code", multirequestToken);
	}


	public ProductCode() {
		super();
	}

	public ProductCode(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		inappProvider = GsonParser.parseString(jsonObject.get("inappProvider"));
		code = GsonParser.parseString(jsonObject.get("code"));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaProductCode");
		kparams.add("inappProvider", this.inappProvider);
		kparams.add("code", this.code);
		return kparams;
	}


    public static final Creator<ProductCode> CREATOR = new Creator<ProductCode>() {
        @Override
        public ProductCode createFromParcel(Parcel source) {
            return new ProductCode(source);
        }

        @Override
        public ProductCode[] newArray(int size) {
            return new ProductCode[size];
        }
    };

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        super.writeToParcel(dest, flags);
        dest.writeString(this.inappProvider);
        dest.writeString(this.code);
    }

    public ProductCode(Parcel in) {
        super(in);
        this.inappProvider = in.readString();
        this.code = in.readString();
    }
}

