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
 * Device Information
 */
@SuppressWarnings("serial")
@MultiRequestBuilder.Tokenizer(DeviceReferenceData.Tokenizer.class)
public class DeviceReferenceData extends CrudObject {
	
	public interface Tokenizer extends CrudObject.Tokenizer {
		String id();
		String name();
		String status();
	}

	/**
	 * id
	 */
	private Long id;
	/**
	 * Name
	 */
	private String name;
	/**
	 * Status
	 */
	private Boolean status;

	// id:
	public Long getId(){
		return this.id;
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

	// status:
	public Boolean getStatus(){
		return this.status;
	}
	public void setStatus(Boolean status){
		this.status = status;
	}

	public void status(String multirequestToken){
		setToken("status", multirequestToken);
	}


	public DeviceReferenceData() {
		super();
	}

	public DeviceReferenceData(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		id = GsonParser.parseLong(jsonObject.get("id"));
		name = GsonParser.parseString(jsonObject.get("name"));
		status = GsonParser.parseBoolean(jsonObject.get("status"));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaDeviceReferenceData");
		kparams.add("name", this.name);
		kparams.add("status", this.status);
		return kparams;
	}


    public static final Creator<DeviceReferenceData> CREATOR = new Creator<DeviceReferenceData>() {
        @Override
        public DeviceReferenceData createFromParcel(Parcel source) {
            return new DeviceReferenceData(source);
        }

        @Override
        public DeviceReferenceData[] newArray(int size) {
            return new DeviceReferenceData[size];
        }
    };

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        super.writeToParcel(dest, flags);
        dest.writeValue(this.id);
        dest.writeString(this.name);
        dest.writeValue(this.status);
    }

    public DeviceReferenceData(Parcel in) {
        super(in);
        this.id = (Long)in.readValue(Long.class.getClassLoader());
        this.name = in.readString();
        this.status = (Boolean)in.readValue(Boolean.class.getClassLoader());
    }
}

