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
import com.kaltura.client.types.VodIngestAssetResultAggregation;
import com.kaltura.client.types.VodIngestAssetResultList;
import com.kaltura.client.utils.GsonParser;
import com.kaltura.client.utils.request.MultiRequestBuilder;

/**
 * This class was generated using exec.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

@SuppressWarnings("serial")
@MultiRequestBuilder.Tokenizer(VodIngestAssetResultResponse.Tokenizer.class)
public class VodIngestAssetResultResponse extends ObjectBase {
	
	public interface Tokenizer extends ObjectBase.Tokenizer {
		VodIngestAssetResultList.Tokenizer result();
		VodIngestAssetResultAggregation.Tokenizer aggregations();
	}

	/**
	 * Errors
	 */
	private VodIngestAssetResultList result;
	/**
	 * Aggregated counters
	 */
	private VodIngestAssetResultAggregation aggregations;

	// result:
	public VodIngestAssetResultList getResult(){
		return this.result;
	}
	public void setResult(VodIngestAssetResultList result){
		this.result = result;
	}

	// aggregations:
	public VodIngestAssetResultAggregation getAggregations(){
		return this.aggregations;
	}
	public void setAggregations(VodIngestAssetResultAggregation aggregations){
		this.aggregations = aggregations;
	}


	public VodIngestAssetResultResponse() {
		super();
	}

	public VodIngestAssetResultResponse(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		result = GsonParser.parseObject(jsonObject.getAsJsonObject("result"), VodIngestAssetResultList.class);
		aggregations = GsonParser.parseObject(jsonObject.getAsJsonObject("aggregations"), VodIngestAssetResultAggregation.class);

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaVodIngestAssetResultResponse");
		kparams.add("result", this.result);
		kparams.add("aggregations", this.aggregations);
		return kparams;
	}


    public static final Creator<VodIngestAssetResultResponse> CREATOR = new Creator<VodIngestAssetResultResponse>() {
        @Override
        public VodIngestAssetResultResponse createFromParcel(Parcel source) {
            return new VodIngestAssetResultResponse(source);
        }

        @Override
        public VodIngestAssetResultResponse[] newArray(int size) {
            return new VodIngestAssetResultResponse[size];
        }
    };

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        super.writeToParcel(dest, flags);
        dest.writeParcelable(this.result, flags);
        dest.writeParcelable(this.aggregations, flags);
    }

    public VodIngestAssetResultResponse(Parcel in) {
        super(in);
        this.result = in.readParcelable(VodIngestAssetResultList.class.getClassLoader());
        this.aggregations = in.readParcelable(VodIngestAssetResultAggregation.class.getClassLoader());
    }
}

