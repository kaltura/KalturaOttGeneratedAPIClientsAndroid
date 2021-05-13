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
@MultiRequestBuilder.Tokenizer(RegionChannelNumber.Tokenizer.class)
public class RegionChannelNumber extends ObjectBase {
	
	public interface Tokenizer extends ObjectBase.Tokenizer {
		String regionId();
		String channelNumber();
	}

	/**
	 * The identifier of the region
	 */
	private Integer regionId;
	/**
	 * The number of channel
	 */
	private Integer channelNumber;

	// regionId:
	public Integer getRegionId(){
		return this.regionId;
	}
	public void setRegionId(Integer regionId){
		this.regionId = regionId;
	}

	public void regionId(String multirequestToken){
		setToken("regionId", multirequestToken);
	}

	// channelNumber:
	public Integer getChannelNumber(){
		return this.channelNumber;
	}
	public void setChannelNumber(Integer channelNumber){
		this.channelNumber = channelNumber;
	}

	public void channelNumber(String multirequestToken){
		setToken("channelNumber", multirequestToken);
	}


	public RegionChannelNumber() {
		super();
	}

	public RegionChannelNumber(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		regionId = GsonParser.parseInt(jsonObject.get("regionId"));
		channelNumber = GsonParser.parseInt(jsonObject.get("channelNumber"));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaRegionChannelNumber");
		kparams.add("regionId", this.regionId);
		kparams.add("channelNumber", this.channelNumber);
		return kparams;
	}


    public static final Creator<RegionChannelNumber> CREATOR = new Creator<RegionChannelNumber>() {
        @Override
        public RegionChannelNumber createFromParcel(Parcel source) {
            return new RegionChannelNumber(source);
        }

        @Override
        public RegionChannelNumber[] newArray(int size) {
            return new RegionChannelNumber[size];
        }
    };

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        super.writeToParcel(dest, flags);
        dest.writeValue(this.regionId);
        dest.writeValue(this.channelNumber);
    }

    public RegionChannelNumber(Parcel in) {
        super(in);
        this.regionId = (Integer)in.readValue(Integer.class.getClassLoader());
        this.channelNumber = (Integer)in.readValue(Integer.class.getClassLoader());
    }
}

