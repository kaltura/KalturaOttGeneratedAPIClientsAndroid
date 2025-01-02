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
import java.util.HashMap;
import java.util.Map;

/**
 * This class was generated using exec.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

@SuppressWarnings("serial")
@MultiRequestBuilder.Tokenizer(RegionalChannel.Tokenizer.class)
public class RegionalChannel extends ObjectBase {
	
	public interface Tokenizer extends ObjectBase.Tokenizer {
		String linearChannelId();
		String channelNumber();
		RequestBuilder.MapTokenizer<StringValue.Tokenizer> dynamicData();
	}

	/**
	 * The identifier of the linear media representing the channel
	 */
	private Integer linearChannelId;
	/**
	 * The number of the channel
	 */
	private Integer channelNumber;
	/**
	 * The dynamic data of a channel
	 */
	private Map<String, StringValue> dynamicData;

	// linearChannelId:
	public Integer getLinearChannelId(){
		return this.linearChannelId;
	}
	public void setLinearChannelId(Integer linearChannelId){
		this.linearChannelId = linearChannelId;
	}

	public void linearChannelId(String multirequestToken){
		setToken("linearChannelId", multirequestToken);
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

	// dynamicData:
	public Map<String, StringValue> getDynamicData(){
		return this.dynamicData;
	}
	public void setDynamicData(Map<String, StringValue> dynamicData){
		this.dynamicData = dynamicData;
	}


	public RegionalChannel() {
		super();
	}

	public RegionalChannel(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		linearChannelId = GsonParser.parseInt(jsonObject.get("linearChannelId"));
		channelNumber = GsonParser.parseInt(jsonObject.get("channelNumber"));
		dynamicData = GsonParser.parseMap(jsonObject.getAsJsonObject("dynamicData"), StringValue.class);

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaRegionalChannel");
		kparams.add("linearChannelId", this.linearChannelId);
		kparams.add("channelNumber", this.channelNumber);
		kparams.add("dynamicData", this.dynamicData);
		return kparams;
	}


    public static final Creator<RegionalChannel> CREATOR = new Creator<RegionalChannel>() {
        @Override
        public RegionalChannel createFromParcel(Parcel source) {
            return new RegionalChannel(source);
        }

        @Override
        public RegionalChannel[] newArray(int size) {
            return new RegionalChannel[size];
        }
    };

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        super.writeToParcel(dest, flags);
        dest.writeValue(this.linearChannelId);
        dest.writeValue(this.channelNumber);
        if(this.dynamicData != null) {
            dest.writeInt(this.dynamicData.size());
            for (Map.Entry<String, StringValue> entry : this.dynamicData.entrySet()) {
                dest.writeString(entry.getKey());
                dest.writeParcelable(entry.getValue(), flags);
            }
        } else {
            dest.writeInt(-1);
        }
    }

    public RegionalChannel(Parcel in) {
        super(in);
        this.linearChannelId = (Integer)in.readValue(Integer.class.getClassLoader());
        this.channelNumber = (Integer)in.readValue(Integer.class.getClassLoader());
        int dynamicDataSize = in.readInt();
        if( dynamicDataSize > -1) {
            this.dynamicData = new HashMap<>();
            for (int i = 0; i < dynamicDataSize; i++) {
                String key = in.readString();
                StringValue value = in.readParcelable(StringValue.class.getClassLoader());
                this.dynamicData.put(key, value);
            }
        }
    }
}

