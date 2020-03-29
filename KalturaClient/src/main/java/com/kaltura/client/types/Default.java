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

/**
 * This class was generated using exec.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

@SuppressWarnings("serial")
@MultiRequestBuilder.Tokenizer(Default.Tokenizer.class)
public class Default extends ObjectBase {
	
	public interface Tokenizer extends ObjectBase.Tokenizer {
		String poolId();
		String region();
		String appClientId();
	}

	/**
	 * PoolId
	 */
	private String poolId;
	/**
	 * Region
	 */
	private String region;
	/**
	 * AppClientId
	 */
	private String appClientId;

	// poolId:
	public String getPoolId(){
		return this.poolId;
	}
	public void setPoolId(String poolId){
		this.poolId = poolId;
	}

	public void poolId(String multirequestToken){
		setToken("poolId", multirequestToken);
	}

	// region:
	public String getRegion(){
		return this.region;
	}
	public void setRegion(String region){
		this.region = region;
	}

	public void region(String multirequestToken){
		setToken("region", multirequestToken);
	}

	// appClientId:
	public String getAppClientId(){
		return this.appClientId;
	}
	public void setAppClientId(String appClientId){
		this.appClientId = appClientId;
	}

	public void appClientId(String multirequestToken){
		setToken("appClientId", multirequestToken);
	}


	public Default() {
		super();
	}

	public Default(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		poolId = GsonParser.parseString(jsonObject.get("poolId"));
		region = GsonParser.parseString(jsonObject.get("region"));
		appClientId = GsonParser.parseString(jsonObject.get("appClientId"));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaDefault");
		kparams.add("poolId", this.poolId);
		kparams.add("region", this.region);
		kparams.add("appClientId", this.appClientId);
		return kparams;
	}


    public static final Creator<Default> CREATOR = new Creator<Default>() {
        @Override
        public Default createFromParcel(Parcel source) {
            return new Default(source);
        }

        @Override
        public Default[] newArray(int size) {
            return new Default[size];
        }
    };

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        super.writeToParcel(dest, flags);
        dest.writeString(this.poolId);
        dest.writeString(this.region);
        dest.writeString(this.appClientId);
    }

    public Default(Parcel in) {
        super(in);
        this.poolId = in.readString();
        this.region = in.readString();
        this.appClientId = in.readString();
    }
}

