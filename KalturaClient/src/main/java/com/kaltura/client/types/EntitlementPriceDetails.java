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
import com.kaltura.client.types.ObjectBase;
import com.kaltura.client.types.Price;
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
 * Entitlement price details
 */
@SuppressWarnings("serial")
@MultiRequestBuilder.Tokenizer(EntitlementPriceDetails.Tokenizer.class)
public class EntitlementPriceDetails extends ObjectBase {
	
	public interface Tokenizer extends ObjectBase.Tokenizer {
		Price.Tokenizer fullPrice();
		RequestBuilder.ListTokenizer<EntitlementDiscountDetails.Tokenizer> discountDetails();
	}

	/**
	 * Full price
	 */
	private Price fullPrice;
	/**
	 * List of the season numbers to exclude.
	 */
	private List<EntitlementDiscountDetails> discountDetails;

	// fullPrice:
	public Price getFullPrice(){
		return this.fullPrice;
	}
	// discountDetails:
	public List<EntitlementDiscountDetails> getDiscountDetails(){
		return this.discountDetails;
	}

	public EntitlementPriceDetails() {
		super();
	}

	public EntitlementPriceDetails(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		fullPrice = GsonParser.parseObject(jsonObject.getAsJsonObject("fullPrice"), Price.class);
		discountDetails = GsonParser.parseArray(jsonObject.getAsJsonArray("discountDetails"), EntitlementDiscountDetails.class);

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaEntitlementPriceDetails");
		return kparams;
	}


    public static final Creator<EntitlementPriceDetails> CREATOR = new Creator<EntitlementPriceDetails>() {
        @Override
        public EntitlementPriceDetails createFromParcel(Parcel source) {
            return new EntitlementPriceDetails(source);
        }

        @Override
        public EntitlementPriceDetails[] newArray(int size) {
            return new EntitlementPriceDetails[size];
        }
    };

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        super.writeToParcel(dest, flags);
        dest.writeParcelable(this.fullPrice, flags);
        if(this.discountDetails != null) {
            dest.writeInt(this.discountDetails.size());
            dest.writeList(this.discountDetails);
        } else {
            dest.writeInt(-1);
        }
    }

    public EntitlementPriceDetails(Parcel in) {
        super(in);
        this.fullPrice = in.readParcelable(Price.class.getClassLoader());
        int discountDetailsSize = in.readInt();
        if( discountDetailsSize > -1) {
            this.discountDetails = new ArrayList<>();
            in.readList(this.discountDetails, EntitlementDiscountDetails.class.getClassLoader());
        }
    }
}

