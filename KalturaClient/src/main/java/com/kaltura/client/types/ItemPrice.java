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
import com.kaltura.client.utils.GsonParser;
import com.kaltura.client.utils.request.MultiRequestBuilder;
import com.kaltura.client.utils.request.RequestBuilder;
import java.util.ArrayList;
import java.util.List;

/**
 * This class was generated using clients-generator\exec.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

/**
 * PPV price details
 */
@SuppressWarnings("serial")
@MultiRequestBuilder.Tokenizer(ItemPrice.Tokenizer.class)
public class ItemPrice extends ProductPrice {
	
	public interface Tokenizer extends ProductPrice.Tokenizer {
		String fileId();
		RequestBuilder.ListTokenizer<PPVItemPriceDetails.Tokenizer> ppvPriceDetails();
	}

	/**
	 * Media file identifier
	 */
	private Integer fileId;
	/**
	 * PPV price details
	 */
	private List<PPVItemPriceDetails> ppvPriceDetails;

	// fileId:
	public Integer getFileId(){
		return this.fileId;
	}
	public void setFileId(Integer fileId){
		this.fileId = fileId;
	}

	public void fileId(String multirequestToken){
		setToken("fileId", multirequestToken);
	}

	// ppvPriceDetails:
	public List<PPVItemPriceDetails> getPpvPriceDetails(){
		return this.ppvPriceDetails;
	}
	public void setPpvPriceDetails(List<PPVItemPriceDetails> ppvPriceDetails){
		this.ppvPriceDetails = ppvPriceDetails;
	}


	public ItemPrice() {
		super();
	}

	public ItemPrice(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		fileId = GsonParser.parseInt(jsonObject.get("fileId"));
		ppvPriceDetails = GsonParser.parseArray(jsonObject.getAsJsonArray("ppvPriceDetails"), PPVItemPriceDetails.class);

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaItemPrice");
		kparams.add("fileId", this.fileId);
		kparams.add("ppvPriceDetails", this.ppvPriceDetails);
		return kparams;
	}


    public static final Creator<ItemPrice> CREATOR = new Creator<ItemPrice>() {
        @Override
        public ItemPrice createFromParcel(Parcel source) {
            return new ItemPrice(source);
        }

        @Override
        public ItemPrice[] newArray(int size) {
            return new ItemPrice[size];
        }
    };

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        super.writeToParcel(dest, flags);
        dest.writeValue(this.fileId);
        if(this.ppvPriceDetails != null) {
            dest.writeInt(this.ppvPriceDetails.size());
            dest.writeList(this.ppvPriceDetails);
        } else {
            dest.writeInt(-1);
        }
    }

    public ItemPrice(Parcel in) {
        super(in);
        this.fileId = (Integer)in.readValue(Integer.class.getClassLoader());
        int ppvPriceDetailsSize = in.readInt();
        if( ppvPriceDetailsSize > -1) {
            this.ppvPriceDetails = new ArrayList<>();
            in.readList(this.ppvPriceDetails, PPVItemPriceDetails.class.getClassLoader());
        }
    }
}

