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
import com.kaltura.client.enums.DeviceBrandType;
import com.kaltura.client.types.ObjectBase;
import com.kaltura.client.utils.GsonParser;
import com.kaltura.client.utils.request.MultiRequestBuilder;

/**
 * This class was generated using exec.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

/**
 * Device brand details
 */
@SuppressWarnings("serial")
@MultiRequestBuilder.Tokenizer(DeviceBrand.Tokenizer.class)
public class DeviceBrand extends ObjectBase {
	
	public interface Tokenizer extends ObjectBase.Tokenizer {
		String id();
		String name();
		String deviceFamilyId();
		String type();
	}

	/**
	 * Device brand identifier
	 */
	private Long id;
	/**
	 * Device brand name
	 */
	private String name;
	/**
	 * Device family identifier
	 */
	private Long deviceFamilyId;
	/**
	 * Type of device family.               if this device family belongs only to this
	  group,               otherwise.
	 */
	private DeviceBrandType type;

	// id:
	public Long getId(){
		return this.id;
	}
	public void setId(Long id){
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

	// deviceFamilyId:
	public Long getDeviceFamilyId(){
		return this.deviceFamilyId;
	}
	public void setDeviceFamilyId(Long deviceFamilyId){
		this.deviceFamilyId = deviceFamilyId;
	}

	public void deviceFamilyId(String multirequestToken){
		setToken("deviceFamilyId", multirequestToken);
	}

	// type:
	public DeviceBrandType getType(){
		return this.type;
	}

	public DeviceBrand() {
		super();
	}

	public DeviceBrand(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		id = GsonParser.parseLong(jsonObject.get("id"));
		name = GsonParser.parseString(jsonObject.get("name"));
		deviceFamilyId = GsonParser.parseLong(jsonObject.get("deviceFamilyId"));
		type = DeviceBrandType.get(GsonParser.parseString(jsonObject.get("type")));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaDeviceBrand");
		kparams.add("id", this.id);
		kparams.add("name", this.name);
		kparams.add("deviceFamilyId", this.deviceFamilyId);
		return kparams;
	}


    public static final Creator<DeviceBrand> CREATOR = new Creator<DeviceBrand>() {
        @Override
        public DeviceBrand createFromParcel(Parcel source) {
            return new DeviceBrand(source);
        }

        @Override
        public DeviceBrand[] newArray(int size) {
            return new DeviceBrand[size];
        }
    };

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        super.writeToParcel(dest, flags);
        dest.writeValue(this.id);
        dest.writeString(this.name);
        dest.writeValue(this.deviceFamilyId);
        dest.writeInt(this.type == null ? -1 : this.type.ordinal());
    }

    public DeviceBrand(Parcel in) {
        super(in);
        this.id = (Long)in.readValue(Long.class.getClassLoader());
        this.name = in.readString();
        this.deviceFamilyId = (Long)in.readValue(Long.class.getClassLoader());
        int tmpType = in.readInt();
        this.type = tmpType == -1 ? null : DeviceBrandType.values()[tmpType];
    }
}

