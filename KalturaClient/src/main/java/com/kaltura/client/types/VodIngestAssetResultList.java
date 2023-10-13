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

@SuppressWarnings("serial")
@MultiRequestBuilder.Tokenizer(VodIngestAssetResultList.Tokenizer.class)
public class VodIngestAssetResultList extends ObjectBase {
	
	public interface Tokenizer extends ObjectBase.Tokenizer {
		RequestBuilder.ListTokenizer<VodIngestAssetResult.Tokenizer> objects();
		String totalCount();
	}

	/**
	 * list of KalturaVodIngestAssetResult
	 */
	private List<VodIngestAssetResult> objects;
	/**
	 * Total items
	 */
	private Integer totalCount;

	// objects:
	public List<VodIngestAssetResult> getObjects(){
		return this.objects;
	}
	public void setObjects(List<VodIngestAssetResult> objects){
		this.objects = objects;
	}

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


	public VodIngestAssetResultList() {
		super();
	}

	public VodIngestAssetResultList(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		objects = GsonParser.parseArray(jsonObject.getAsJsonArray("objects"), VodIngestAssetResult.class);
		totalCount = GsonParser.parseInt(jsonObject.get("totalCount"));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaVodIngestAssetResultList");
		kparams.add("objects", this.objects);
		kparams.add("totalCount", this.totalCount);
		return kparams;
	}


    public static final Creator<VodIngestAssetResultList> CREATOR = new Creator<VodIngestAssetResultList>() {
        @Override
        public VodIngestAssetResultList createFromParcel(Parcel source) {
            return new VodIngestAssetResultList(source);
        }

        @Override
        public VodIngestAssetResultList[] newArray(int size) {
            return new VodIngestAssetResultList[size];
        }
    };

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        super.writeToParcel(dest, flags);
        if(this.objects != null) {
            dest.writeInt(this.objects.size());
            dest.writeList(this.objects);
        } else {
            dest.writeInt(-1);
        }
        dest.writeValue(this.totalCount);
    }

    public VodIngestAssetResultList(Parcel in) {
        super(in);
        int objectsSize = in.readInt();
        if( objectsSize > -1) {
            this.objects = new ArrayList<>();
            in.readList(this.objects, VodIngestAssetResult.class.getClassLoader());
        }
        this.totalCount = (Integer)in.readValue(Integer.class.getClassLoader());
    }
}

