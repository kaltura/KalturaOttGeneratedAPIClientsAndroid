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
// Copyright (C) 2006-2018  Kaltura Inc.
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
 * This class was generated using clients-generator\exec.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

/**
 * Asset user rule filter
 */
@SuppressWarnings("serial")
@MultiRequestBuilder.Tokenizer(AssetUserRuleFilter.Tokenizer.class)
public class AssetUserRuleFilter extends Filter {
	
	public interface Tokenizer extends Filter.Tokenizer {
		String associatedUserIdEqualCurrent();
	}

	/**
	 * Indicates if to get the asset user rule list for the associated user or for the
	  entire group
	 */
	private Boolean associatedUserIdEqualCurrent;

	// associatedUserIdEqualCurrent:
	public Boolean getAssociatedUserIdEqualCurrent(){
		return this.associatedUserIdEqualCurrent;
	}
	public void setAssociatedUserIdEqualCurrent(Boolean associatedUserIdEqualCurrent){
		this.associatedUserIdEqualCurrent = associatedUserIdEqualCurrent;
	}

	public void associatedUserIdEqualCurrent(String multirequestToken){
		setToken("associatedUserIdEqualCurrent", multirequestToken);
	}


	public AssetUserRuleFilter() {
		super();
	}

	public AssetUserRuleFilter(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		associatedUserIdEqualCurrent = GsonParser.parseBoolean(jsonObject.get("associatedUserIdEqualCurrent"));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaAssetUserRuleFilter");
		kparams.add("associatedUserIdEqualCurrent", this.associatedUserIdEqualCurrent);
		return kparams;
	}


    public static final Creator<AssetUserRuleFilter> CREATOR = new Creator<AssetUserRuleFilter>() {
        @Override
        public AssetUserRuleFilter createFromParcel(Parcel source) {
            return new AssetUserRuleFilter(source);
        }

        @Override
        public AssetUserRuleFilter[] newArray(int size) {
            return new AssetUserRuleFilter[size];
        }
    };

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        super.writeToParcel(dest, flags);
        dest.writeValue(this.associatedUserIdEqualCurrent);
    }

    public AssetUserRuleFilter(Parcel in) {
        super(in);
        this.associatedUserIdEqualCurrent = (Boolean)in.readValue(Boolean.class.getClassLoader());
    }
}

