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
 * An object holding all the URLs (links) to files which contain coupon codes
 */
@SuppressWarnings("serial")
@MultiRequestBuilder.Tokenizer(CouponFilesLinks.Tokenizer.class)
public class CouponFilesLinks extends ObjectBase {
	
	public interface Tokenizer extends ObjectBase.Tokenizer {
		String totalCount();
		RequestBuilder.ListTokenizer<StringValue.Tokenizer> objects();
	}

	/**
	 * Total count of coupons code files
	 */
	private Integer totalCount;
	/**
	 * A pre-signed URL pointing to a coupon codes file
	 */
	private List<StringValue> objects;

	// totalCount:
	public Integer getTotalCount(){
		return this.totalCount;
	}
	public void setTotalCount(Integer totalCount){
		this.totalCount = totalCount;
	}

	public void totalCount(String multirequestToken){
		setToken("totalCount", multirequestToken);
	}

	// objects:
	public List<StringValue> getObjects(){
		return this.objects;
	}
	public void setObjects(List<StringValue> objects){
		this.objects = objects;
	}


	public CouponFilesLinks() {
		super();
	}

	public CouponFilesLinks(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		totalCount = GsonParser.parseInt(jsonObject.get("totalCount"));
		objects = GsonParser.parseArray(jsonObject.getAsJsonArray("objects"), StringValue.class);

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaCouponFilesLinks");
		kparams.add("totalCount", this.totalCount);
		kparams.add("objects", this.objects);
		return kparams;
	}


    public static final Creator<CouponFilesLinks> CREATOR = new Creator<CouponFilesLinks>() {
        @Override
        public CouponFilesLinks createFromParcel(Parcel source) {
            return new CouponFilesLinks(source);
        }

        @Override
        public CouponFilesLinks[] newArray(int size) {
            return new CouponFilesLinks[size];
        }
    };

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        super.writeToParcel(dest, flags);
        dest.writeValue(this.totalCount);
        if(this.objects != null) {
            dest.writeInt(this.objects.size());
            dest.writeList(this.objects);
        } else {
            dest.writeInt(-1);
        }
    }

    public CouponFilesLinks(Parcel in) {
        super(in);
        this.totalCount = (Integer)in.readValue(Integer.class.getClassLoader());
        int objectsSize = in.readInt();
        if( objectsSize > -1) {
            this.objects = new ArrayList<>();
            in.readList(this.objects, StringValue.class.getClassLoader());
        }
    }
}

