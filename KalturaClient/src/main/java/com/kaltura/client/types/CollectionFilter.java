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
import com.kaltura.client.utils.GsonParser;
import com.kaltura.client.utils.request.MultiRequestBuilder;

/**
 * This class was generated using exec.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

/**
 * Collection Filter
 */
@SuppressWarnings("serial")
@MultiRequestBuilder.Tokenizer(CollectionFilter.Tokenizer.class)
public class CollectionFilter extends Filter {
	
	public interface Tokenizer extends Filter.Tokenizer {
		String collectionIdIn();
		String mediaFileIdEqual();
		String couponGroupIdEqual();
	}

	/**
	 * Comma separated collection IDs
	 */
	private String collectionIdIn;
	/**
	 * Media-file ID to get the subscriptions by
	 */
	private Integer mediaFileIdEqual;
	/**
	 * couponGroupIdEqual
	 */
	private Integer couponGroupIdEqual;

	// collectionIdIn:
	public String getCollectionIdIn(){
		return this.collectionIdIn;
	}
	public void setCollectionIdIn(String collectionIdIn){
		this.collectionIdIn = collectionIdIn;
	}

	public void collectionIdIn(String multirequestToken){
		setToken("collectionIdIn", multirequestToken);
	}

	// mediaFileIdEqual:
	public Integer getMediaFileIdEqual(){
		return this.mediaFileIdEqual;
	}
	public void setMediaFileIdEqual(Integer mediaFileIdEqual){
		this.mediaFileIdEqual = mediaFileIdEqual;
	}

	public void mediaFileIdEqual(String multirequestToken){
		setToken("mediaFileIdEqual", multirequestToken);
	}

	// couponGroupIdEqual:
	public Integer getCouponGroupIdEqual(){
		return this.couponGroupIdEqual;
	}
	public void setCouponGroupIdEqual(Integer couponGroupIdEqual){
		this.couponGroupIdEqual = couponGroupIdEqual;
	}

	public void couponGroupIdEqual(String multirequestToken){
		setToken("couponGroupIdEqual", multirequestToken);
	}


	public CollectionFilter() {
		super();
	}

	public CollectionFilter(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		collectionIdIn = GsonParser.parseString(jsonObject.get("collectionIdIn"));
		mediaFileIdEqual = GsonParser.parseInt(jsonObject.get("mediaFileIdEqual"));
		couponGroupIdEqual = GsonParser.parseInt(jsonObject.get("couponGroupIdEqual"));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaCollectionFilter");
		kparams.add("collectionIdIn", this.collectionIdIn);
		kparams.add("mediaFileIdEqual", this.mediaFileIdEqual);
		kparams.add("couponGroupIdEqual", this.couponGroupIdEqual);
		return kparams;
	}


    public static final Creator<CollectionFilter> CREATOR = new Creator<CollectionFilter>() {
        @Override
        public CollectionFilter createFromParcel(Parcel source) {
            return new CollectionFilter(source);
        }

        @Override
        public CollectionFilter[] newArray(int size) {
            return new CollectionFilter[size];
        }
    };

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        super.writeToParcel(dest, flags);
        dest.writeString(this.collectionIdIn);
        dest.writeValue(this.mediaFileIdEqual);
        dest.writeValue(this.couponGroupIdEqual);
    }

    public CollectionFilter(Parcel in) {
        super(in);
        this.collectionIdIn = in.readString();
        this.mediaFileIdEqual = (Integer)in.readValue(Integer.class.getClassLoader());
        this.couponGroupIdEqual = (Integer)in.readValue(Integer.class.getClassLoader());
    }
}

