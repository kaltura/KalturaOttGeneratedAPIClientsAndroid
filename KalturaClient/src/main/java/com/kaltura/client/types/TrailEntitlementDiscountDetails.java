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
import com.kaltura.client.utils.request.MultiRequestBuilder;

/**
 * This class was generated using exec.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

/**
 * Trail entitlement discount details
 */
@SuppressWarnings("serial")
@MultiRequestBuilder.Tokenizer(TrailEntitlementDiscountDetails.Tokenizer.class)
public class TrailEntitlementDiscountDetails extends EntitlementDiscountDetailsIdentifier {
	
	public interface Tokenizer extends EntitlementDiscountDetailsIdentifier.Tokenizer {
	}



	public TrailEntitlementDiscountDetails() {
		super();
	}

	public TrailEntitlementDiscountDetails(JsonObject jsonObject) throws APIException {
		super(jsonObject);
	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaTrailEntitlementDiscountDetails");
		return kparams;
	}


    public static final Creator<TrailEntitlementDiscountDetails> CREATOR = new Creator<TrailEntitlementDiscountDetails>() {
        @Override
        public TrailEntitlementDiscountDetails createFromParcel(Parcel source) {
            return new TrailEntitlementDiscountDetails(source);
        }

        @Override
        public TrailEntitlementDiscountDetails[] newArray(int size) {
            return new TrailEntitlementDiscountDetails[size];
        }
    };

    public TrailEntitlementDiscountDetails(Parcel in) {
        super(in);
    }
}

