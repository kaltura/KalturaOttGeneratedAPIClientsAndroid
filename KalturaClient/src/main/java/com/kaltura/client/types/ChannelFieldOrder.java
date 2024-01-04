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
import com.kaltura.client.enums.ChannelFieldOrderByType;
import com.kaltura.client.utils.GsonParser;
import com.kaltura.client.utils.request.MultiRequestBuilder;

/**
 * This class was generated using exec.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

@SuppressWarnings("serial")
@MultiRequestBuilder.Tokenizer(ChannelFieldOrder.Tokenizer.class)
public class ChannelFieldOrder extends BaseChannelOrder {
	
	public interface Tokenizer extends BaseChannelOrder.Tokenizer {
		String orderBy();
	}

	/**
	 * Order By
	 */
	private ChannelFieldOrderByType orderBy;

	// orderBy:
	public ChannelFieldOrderByType getOrderBy(){
		return this.orderBy;
	}
	public void setOrderBy(ChannelFieldOrderByType orderBy){
		this.orderBy = orderBy;
	}

	public void orderBy(String multirequestToken){
		setToken("orderBy", multirequestToken);
	}


	public ChannelFieldOrder() {
		super();
	}

	public ChannelFieldOrder(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		orderBy = ChannelFieldOrderByType.get(GsonParser.parseString(jsonObject.get("orderBy")));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaChannelFieldOrder");
		kparams.add("orderBy", this.orderBy);
		return kparams;
	}


    public static final Creator<ChannelFieldOrder> CREATOR = new Creator<ChannelFieldOrder>() {
        @Override
        public ChannelFieldOrder createFromParcel(Parcel source) {
            return new ChannelFieldOrder(source);
        }

        @Override
        public ChannelFieldOrder[] newArray(int size) {
            return new ChannelFieldOrder[size];
        }
    };

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        super.writeToParcel(dest, flags);
        dest.writeInt(this.orderBy == null ? -1 : this.orderBy.ordinal());
    }

    public ChannelFieldOrder(Parcel in) {
        super(in);
        int tmpOrderBy = in.readInt();
        this.orderBy = tmpOrderBy == -1 ? null : ChannelFieldOrderByType.values()[tmpOrderBy];
    }
}

