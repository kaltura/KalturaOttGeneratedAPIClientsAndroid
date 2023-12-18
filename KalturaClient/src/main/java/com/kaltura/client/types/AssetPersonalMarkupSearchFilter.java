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
 * Asset Personal Markup search filter
 */
@SuppressWarnings("serial")
@MultiRequestBuilder.Tokenizer(AssetPersonalMarkupSearchFilter.Tokenizer.class)
public class AssetPersonalMarkupSearchFilter extends Filter {
	
	public interface Tokenizer extends Filter.Tokenizer {
		RequestBuilder.ListTokenizer<SlimAsset.Tokenizer> assetsIn();
	}

	/**
	 * all assets to search their personal markups
	 */
	private List<SlimAsset> assetsIn;

	// assetsIn:
	public List<SlimAsset> getAssetsIn(){
		return this.assetsIn;
	}
	public void setAssetsIn(List<SlimAsset> assetsIn){
		this.assetsIn = assetsIn;
	}


	public AssetPersonalMarkupSearchFilter() {
		super();
	}

	public AssetPersonalMarkupSearchFilter(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		assetsIn = GsonParser.parseArray(jsonObject.getAsJsonArray("assetsIn"), SlimAsset.class);

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaAssetPersonalMarkupSearchFilter");
		kparams.add("assetsIn", this.assetsIn);
		return kparams;
	}


    public static final Creator<AssetPersonalMarkupSearchFilter> CREATOR = new Creator<AssetPersonalMarkupSearchFilter>() {
        @Override
        public AssetPersonalMarkupSearchFilter createFromParcel(Parcel source) {
            return new AssetPersonalMarkupSearchFilter(source);
        }

        @Override
        public AssetPersonalMarkupSearchFilter[] newArray(int size) {
            return new AssetPersonalMarkupSearchFilter[size];
        }
    };

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        super.writeToParcel(dest, flags);
        if(this.assetsIn != null) {
            dest.writeInt(this.assetsIn.size());
            dest.writeList(this.assetsIn);
        } else {
            dest.writeInt(-1);
        }
    }

    public AssetPersonalMarkupSearchFilter(Parcel in) {
        super(in);
        int assetsInSize = in.readInt();
        if( assetsInSize > -1) {
            this.assetsIn = new ArrayList<>();
            in.readList(this.assetsIn, SlimAsset.class.getClassLoader());
        }
    }
}

