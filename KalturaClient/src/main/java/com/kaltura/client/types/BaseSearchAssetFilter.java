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

@SuppressWarnings("serial")
@MultiRequestBuilder.Tokenizer(BaseSearchAssetFilter.Tokenizer.class)
public abstract class BaseSearchAssetFilter extends AssetFilter {
	
	public interface Tokenizer extends AssetFilter.Tokenizer {
		RequestBuilder.ListTokenizer<AssetGroupBy.Tokenizer> groupBy();
	}

	/**  groupBy  */
	private List<AssetGroupBy> groupBy;

	// groupBy:
	public List<AssetGroupBy> getGroupBy(){
		return this.groupBy;
	}
	public void setGroupBy(List<AssetGroupBy> groupBy){
		this.groupBy = groupBy;
	}


	public BaseSearchAssetFilter() {
		super();
	}

	public BaseSearchAssetFilter(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		groupBy = GsonParser.parseArray(jsonObject.getAsJsonArray("groupBy"), AssetGroupBy.class);

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaBaseSearchAssetFilter");
		kparams.add("groupBy", this.groupBy);
		return kparams;
	}


    @Override
    public void writeToParcel(Parcel dest, int flags) {
        super.writeToParcel(dest, flags);
        if(this.groupBy != null) {
            dest.writeInt(this.groupBy.size());
            dest.writeList(this.groupBy);
        } else {
            dest.writeInt(-1);
        }
    }

    public BaseSearchAssetFilter(Parcel in) {
        super(in);
        int groupBySize = in.readInt();
        if( groupBySize > -1) {
            this.groupBy = new ArrayList<>();
            in.readList(this.groupBy, AssetGroupBy.class.getClassLoader());
        }
    }
}

