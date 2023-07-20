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
import com.kaltura.client.types.BaseAssetOrder;
import com.kaltura.client.utils.GsonParser;
import com.kaltura.client.utils.request.MultiRequestBuilder;

/**
 * This class was generated using exec.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

@SuppressWarnings("serial")
@MultiRequestBuilder.Tokenizer(TopSubscriptionEntitledRsp.Tokenizer.class)
public class TopSubscriptionEntitledRsp extends RepresentativeSelectionPolicy {
	
	public interface Tokenizer extends RepresentativeSelectionPolicy.Tokenizer {
		BaseAssetOrder.Tokenizer orderBy();
	}

	/**
	 * order by
	 */
	private BaseAssetOrder orderBy;

	// orderBy:
	public BaseAssetOrder getOrderBy(){
		return this.orderBy;
	}
	public void setOrderBy(BaseAssetOrder orderBy){
		this.orderBy = orderBy;
	}


	public TopSubscriptionEntitledRsp() {
		super();
	}

	public TopSubscriptionEntitledRsp(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		orderBy = GsonParser.parseObject(jsonObject.getAsJsonObject("orderBy"), BaseAssetOrder.class);

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaTopSubscriptionEntitledRsp");
		kparams.add("orderBy", this.orderBy);
		return kparams;
	}


    public static final Creator<TopSubscriptionEntitledRsp> CREATOR = new Creator<TopSubscriptionEntitledRsp>() {
        @Override
        public TopSubscriptionEntitledRsp createFromParcel(Parcel source) {
            return new TopSubscriptionEntitledRsp(source);
        }

        @Override
        public TopSubscriptionEntitledRsp[] newArray(int size) {
            return new TopSubscriptionEntitledRsp[size];
        }
    };

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        super.writeToParcel(dest, flags);
        dest.writeParcelable(this.orderBy, flags);
    }

    public TopSubscriptionEntitledRsp(Parcel in) {
        super(in);
        this.orderBy = in.readParcelable(BaseAssetOrder.class.getClassLoader());
    }
}

