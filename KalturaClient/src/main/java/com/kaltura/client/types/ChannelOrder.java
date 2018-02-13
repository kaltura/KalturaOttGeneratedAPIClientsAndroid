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
import com.kaltura.client.enums.ChannelOrderBy;
import com.kaltura.client.types.DynamicOrderBy;
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
 * Channel order details
 */
@SuppressWarnings("serial")
@MultiRequestBuilder.Tokenizer(ChannelOrder.Tokenizer.class)
public class ChannelOrder extends ObjectBase {
	
	public interface Tokenizer extends ObjectBase.Tokenizer {
		DynamicOrderBy.Tokenizer dynamicOrderBy();
		String orderBy();
	}

	/**
	 * Channel dynamic order by (meta)
	 */
	private DynamicOrderBy dynamicOrderBy;
	/**
	 * Channel order by
	 */
	private ChannelOrderBy orderBy;

	// dynamicOrderBy:
	public DynamicOrderBy getDynamicOrderBy(){
		return this.dynamicOrderBy;
	}
	public void setDynamicOrderBy(DynamicOrderBy dynamicOrderBy){
		this.dynamicOrderBy = dynamicOrderBy;
	}

	// orderBy:
	public ChannelOrderBy getOrderBy(){
		return this.orderBy;
	}
	public void setOrderBy(ChannelOrderBy orderBy){
		this.orderBy = orderBy;
	}

	public void orderBy(String multirequestToken){
		setToken("orderBy", multirequestToken);
	}


	public ChannelOrder() {
		super();
	}

	public ChannelOrder(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		dynamicOrderBy = GsonParser.parseObject(jsonObject.getAsJsonObject("dynamicOrderBy"), DynamicOrderBy.class);
		orderBy = ChannelOrderBy.get(GsonParser.parseString(jsonObject.get("orderBy")));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaChannelOrder");
		kparams.add("dynamicOrderBy", this.dynamicOrderBy);
		kparams.add("orderBy", this.orderBy);
		return kparams;
	}


    public static final Creator<ChannelOrder> CREATOR = new Creator<ChannelOrder>() {
        @Override
        public ChannelOrder createFromParcel(Parcel source) {
            return new ChannelOrder(source);
        }

        @Override
        public ChannelOrder[] newArray(int size) {
            return new ChannelOrder[size];
        }
    };

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        super.writeToParcel(dest, flags);
        dest.writeParcelable(this.dynamicOrderBy, flags);
        dest.writeInt(this.orderBy == null ? -1 : this.orderBy.ordinal());
    }

    public ChannelOrder(Parcel in) {
        super(in);
        this.dynamicOrderBy = in.readParcelable(DynamicOrderBy.class.getClassLoader());
        int tmpOrderBy = in.readInt();
        this.orderBy = tmpOrderBy == -1 ? null : ChannelOrderBy.values()[tmpOrderBy];
    }
}

