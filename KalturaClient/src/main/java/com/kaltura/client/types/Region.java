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
@MultiRequestBuilder.Tokenizer(Region.Tokenizer.class)
public class Region extends ObjectBase {
	
	public interface Tokenizer extends ObjectBase.Tokenizer {
		String id();
		String name();
		String externalId();
		String isDefault();
		RequestBuilder.ListTokenizer<RegionalChannel.Tokenizer> linearChannels();
	}

	/**
	 * Region identifier
	 */
	private Integer id;
	/**
	 * Region name
	 */
	private String name;
	/**
	 * Region external identifier
	 */
	private String externalId;
	/**
	 * Indicates whether this is the default region for the partner
	 */
	private Boolean isDefault;
	/**
	 * List of associated linear channels
	 */
	private List<RegionalChannel> linearChannels;

	// id:
	public Integer getId(){
		return this.id;
	}
	public void setId(Integer id){
		this.id = id;
	}

	public void id(String multirequestToken){
		setToken("id", multirequestToken);
	}

	// name:
	public String getName(){
		return this.name;
	}
	public void setName(String name){
		this.name = name;
	}

	public void name(String multirequestToken){
		setToken("name", multirequestToken);
	}

	// externalId:
	public String getExternalId(){
		return this.externalId;
	}
	public void setExternalId(String externalId){
		this.externalId = externalId;
	}

	public void externalId(String multirequestToken){
		setToken("externalId", multirequestToken);
	}

	// isDefault:
	public Boolean getIsDefault(){
		return this.isDefault;
	}
	public void setIsDefault(Boolean isDefault){
		this.isDefault = isDefault;
	}

	public void isDefault(String multirequestToken){
		setToken("isDefault", multirequestToken);
	}

	// linearChannels:
	public List<RegionalChannel> getLinearChannels(){
		return this.linearChannels;
	}
	public void setLinearChannels(List<RegionalChannel> linearChannels){
		this.linearChannels = linearChannels;
	}


	public Region() {
		super();
	}

	public Region(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		id = GsonParser.parseInt(jsonObject.get("id"));
		name = GsonParser.parseString(jsonObject.get("name"));
		externalId = GsonParser.parseString(jsonObject.get("externalId"));
		isDefault = GsonParser.parseBoolean(jsonObject.get("isDefault"));
		linearChannels = GsonParser.parseArray(jsonObject.getAsJsonArray("linearChannels"), RegionalChannel.class);

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaRegion");
		kparams.add("id", this.id);
		kparams.add("name", this.name);
		kparams.add("externalId", this.externalId);
		kparams.add("isDefault", this.isDefault);
		kparams.add("linearChannels", this.linearChannels);
		return kparams;
	}


    public static final Creator<Region> CREATOR = new Creator<Region>() {
        @Override
        public Region createFromParcel(Parcel source) {
            return new Region(source);
        }

        @Override
        public Region[] newArray(int size) {
            return new Region[size];
        }
    };

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        super.writeToParcel(dest, flags);
        dest.writeValue(this.id);
        dest.writeString(this.name);
        dest.writeString(this.externalId);
        dest.writeValue(this.isDefault);
        if(this.linearChannels != null) {
            dest.writeInt(this.linearChannels.size());
            dest.writeList(this.linearChannels);
        } else {
            dest.writeInt(-1);
        }
    }

    public Region(Parcel in) {
        super(in);
        this.id = (Integer)in.readValue(Integer.class.getClassLoader());
        this.name = in.readString();
        this.externalId = in.readString();
        this.isDefault = (Boolean)in.readValue(Boolean.class.getClassLoader());
        int linearChannelsSize = in.readInt();
        if( linearChannelsSize > -1) {
            this.linearChannels = new ArrayList<>();
            in.readList(this.linearChannels, RegionalChannel.class.getClassLoader());
        }
    }
}

