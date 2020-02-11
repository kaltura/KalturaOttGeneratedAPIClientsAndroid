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
 * Asset Condition
 */
@SuppressWarnings("serial")
@MultiRequestBuilder.Tokenizer(AssetCondition.Tokenizer.class)
public class AssetCondition extends Condition {
	
	public interface Tokenizer extends Condition.Tokenizer {
		String ksql();
	}

	/**
	 * KSQL
	 */
	private String ksql;

	// ksql:
	public String getKsql(){
		return this.ksql;
	}
	public void setKsql(String ksql){
		this.ksql = ksql;
	}

	public void ksql(String multirequestToken){
		setToken("ksql", multirequestToken);
	}


	public AssetCondition() {
		super();
	}

	public AssetCondition(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		ksql = GsonParser.parseString(jsonObject.get("ksql"));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaAssetCondition");
		kparams.add("ksql", this.ksql);
		return kparams;
	}


    public static final Creator<AssetCondition> CREATOR = new Creator<AssetCondition>() {
        @Override
        public AssetCondition createFromParcel(Parcel source) {
            return new AssetCondition(source);
        }

        @Override
        public AssetCondition[] newArray(int size) {
            return new AssetCondition[size];
        }
    };

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        super.writeToParcel(dest, flags);
        dest.writeString(this.ksql);
    }

    public AssetCondition(Parcel in) {
        super(in);
        this.ksql = in.readString();
    }
}

