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
import com.kaltura.client.types.ObjectBase;
import com.kaltura.client.utils.GsonParser;
import com.kaltura.client.utils.request.MultiRequestBuilder;

/**
 * This class was generated using clients-generator\exec.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

@SuppressWarnings("serial")
@MultiRequestBuilder.Tokenizer(ConfigurationGroupDevice.Tokenizer.class)
public class ConfigurationGroupDevice extends ObjectBase {
	
	public interface Tokenizer extends ObjectBase.Tokenizer {
		String configurationGroupId();
		String partnerId();
		String udid();
	}

	/**  Configuration group id  */
	private String configurationGroupId;
	/**  Partner id  */
	private Integer partnerId;
	/**  Device UDID  */
	private String udid;

	// configurationGroupId:
	public String getConfigurationGroupId(){
		return this.configurationGroupId;
	}
	public void setConfigurationGroupId(String configurationGroupId){
		this.configurationGroupId = configurationGroupId;
	}

	public void configurationGroupId(String multirequestToken){
		setToken("configurationGroupId", multirequestToken);
	}

	// partnerId:
	public Integer getPartnerId(){
		return this.partnerId;
	}
	public void setPartnerId(Integer partnerId){
		this.partnerId = partnerId;
	}

	public void partnerId(String multirequestToken){
		setToken("partnerId", multirequestToken);
	}

	// udid:
	public String getUdid(){
		return this.udid;
	}
	public void setUdid(String udid){
		this.udid = udid;
	}

	public void udid(String multirequestToken){
		setToken("udid", multirequestToken);
	}


	public ConfigurationGroupDevice() {
		super();
	}

	public ConfigurationGroupDevice(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		configurationGroupId = GsonParser.parseString(jsonObject.get("configurationGroupId"));
		partnerId = GsonParser.parseInt(jsonObject.get("partnerId"));
		udid = GsonParser.parseString(jsonObject.get("udid"));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaConfigurationGroupDevice");
		kparams.add("configurationGroupId", this.configurationGroupId);
		kparams.add("udid", this.udid);
		return kparams;
	}


    public static final Creator<ConfigurationGroupDevice> CREATOR = new Creator<ConfigurationGroupDevice>() {
        @Override
        public ConfigurationGroupDevice createFromParcel(Parcel source) {
            return new ConfigurationGroupDevice(source);
        }

        @Override
        public ConfigurationGroupDevice[] newArray(int size) {
            return new ConfigurationGroupDevice[size];
        }
    };

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        super.writeToParcel(dest, flags);
        dest.writeString(this.configurationGroupId);
        dest.writeValue(this.partnerId);
        dest.writeString(this.udid);
    }

    public ConfigurationGroupDevice(Parcel in) {
        super(in);
        this.configurationGroupId = in.readString();
        this.partnerId = (Integer)in.readValue(Integer.class.getClassLoader());
        this.udid = in.readString();
    }
}

