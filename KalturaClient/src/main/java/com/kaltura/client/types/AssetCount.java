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
 * Asset count - represents a specific value of the field, its count and its sub
  groups.
 */
@SuppressWarnings("serial")
@MultiRequestBuilder.Tokenizer(AssetCount.Tokenizer.class)
public class AssetCount extends ObjectBase {
	
	public interface Tokenizer extends ObjectBase.Tokenizer {
		String value();
		String count();
		RequestBuilder.ListTokenizer<AssetsCount.Tokenizer> subs();
	}

	/**
	 * Value
	 */
	private String value;
	/**
	 * Count
	 */
	private Integer count;
	/**
	 * Sub groups
	 */
	private List<AssetsCount> subs;

	// value:
	public String getValue(){
		return this.value;
	}
	public void setValue(String value){
		this.value = value;
	}

	public void value(String multirequestToken){
		setToken("value", multirequestToken);
	}

	// count:
	public Integer getCount(){
		return this.count;
	}
	public void setCount(Integer count){
		this.count = count;
	}

	public void count(String multirequestToken){
		setToken("count", multirequestToken);
	}

	// subs:
	public List<AssetsCount> getSubs(){
		return this.subs;
	}
	public void setSubs(List<AssetsCount> subs){
		this.subs = subs;
	}


	public AssetCount() {
		super();
	}

	public AssetCount(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		value = GsonParser.parseString(jsonObject.get("value"));
		count = GsonParser.parseInt(jsonObject.get("count"));
		subs = GsonParser.parseArray(jsonObject.getAsJsonArray("subs"), AssetsCount.class);

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaAssetCount");
		kparams.add("value", this.value);
		kparams.add("count", this.count);
		kparams.add("subs", this.subs);
		return kparams;
	}


    public static final Creator<AssetCount> CREATOR = new Creator<AssetCount>() {
        @Override
        public AssetCount createFromParcel(Parcel source) {
            return new AssetCount(source);
        }

        @Override
        public AssetCount[] newArray(int size) {
            return new AssetCount[size];
        }
    };

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        super.writeToParcel(dest, flags);
        dest.writeString(this.value);
        dest.writeValue(this.count);
        if(this.subs != null) {
            dest.writeInt(this.subs.size());
            dest.writeList(this.subs);
        } else {
            dest.writeInt(-1);
        }
    }

    public AssetCount(Parcel in) {
        super(in);
        this.value = in.readString();
        this.count = (Integer)in.readValue(Integer.class.getClassLoader());
        int subsSize = in.readInt();
        if( subsSize > -1) {
            this.subs = new ArrayList<>();
            in.readList(this.subs, AssetsCount.class.getClassLoader());
        }
    }
}

