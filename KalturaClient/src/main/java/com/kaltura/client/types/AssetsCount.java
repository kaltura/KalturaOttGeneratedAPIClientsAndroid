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
import com.kaltura.client.types.ObjectBase;
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
 * Single aggregation objects
 */
@SuppressWarnings("serial")
@MultiRequestBuilder.Tokenizer(AssetsCount.Tokenizer.class)
public class AssetsCount extends ObjectBase {
	
	public interface Tokenizer extends ObjectBase.Tokenizer {
		String field();
		RequestBuilder.ListTokenizer<AssetCount.Tokenizer> objects();
	}

	/**
	 * Field name
	 */
	private String field;
	/**
	 * Values, their count and sub groups
	 */
	private List<AssetCount> objects;

	// field:
	public String getField(){
		return this.field;
	}
	public void setField(String field){
		this.field = field;
	}

	public void field(String multirequestToken){
		setToken("field", multirequestToken);
	}

	// objects:
	public List<AssetCount> getObjects(){
		return this.objects;
	}
	public void setObjects(List<AssetCount> objects){
		this.objects = objects;
	}


	public AssetsCount() {
		super();
	}

	public AssetsCount(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		field = GsonParser.parseString(jsonObject.get("field"));
		objects = GsonParser.parseArray(jsonObject.getAsJsonArray("objects"), AssetCount.class);

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaAssetsCount");
		kparams.add("field", this.field);
		kparams.add("objects", this.objects);
		return kparams;
	}


    public static final Creator<AssetsCount> CREATOR = new Creator<AssetsCount>() {
        @Override
        public AssetsCount createFromParcel(Parcel source) {
            return new AssetsCount(source);
        }

        @Override
        public AssetsCount[] newArray(int size) {
            return new AssetsCount[size];
        }
    };

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        super.writeToParcel(dest, flags);
        dest.writeString(this.field);
        if(this.objects != null) {
            dest.writeInt(this.objects.size());
            dest.writeList(this.objects);
        } else {
            dest.writeInt(-1);
        }
    }

    public AssetsCount(Parcel in) {
        super(in);
        this.field = in.readString();
        int objectsSize = in.readInt();
        if( objectsSize > -1) {
            this.objects = new ArrayList<>();
            in.readList(this.objects, AssetCount.class.getClassLoader());
        }
    }
}

