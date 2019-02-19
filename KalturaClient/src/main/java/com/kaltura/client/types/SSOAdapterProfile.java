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
// Copyright (C) 2006-2019  Kaltura Inc.
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

/**
 * SSO adapter configuration
 */
@SuppressWarnings("serial")
@MultiRequestBuilder.Tokenizer(SSOAdapterProfile.Tokenizer.class)
public class SSOAdapterProfile extends ObjectBase {
	
	public interface Tokenizer extends ObjectBase.Tokenizer {
		String id();
		String name();
		String isActive();
		String adapterUrl();
		RequestBuilder.MapTokenizer<StringValue.Tokenizer> settings();
		String externalIdentifier();
		String sharedSecret();
	}

	/**
	 * SSO Adapter id
	 */
	private Integer id;
	/**
	 * SSO Adapter name
	 */
	private String name;
	/**
	 * SSO Adapter is active status
	 */
	private Integer isActive;
	/**
	 * SSO Adapter URL
	 */
	private String adapterUrl;
	/**
	 * SSO Adapter extra parameters
	 */
	private Map<String, StringValue> settings;
	/**
	 * SSO Adapter external identifier
	 */
	private String externalIdentifier;
	/**
	 * Shared Secret
	 */
	private String sharedSecret;

	// id:
	public Integer getId(){
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

	// isActive:
	public Integer getIsActive(){
		return this.isActive;
	}
	public void setIsActive(Integer isActive){
		this.isActive = isActive;
	}

	public void isActive(String multirequestToken){
		setToken("isActive", multirequestToken);
	}

	// adapterUrl:
	public String getAdapterUrl(){
		return this.adapterUrl;
	}
	public void setAdapterUrl(String adapterUrl){
		this.adapterUrl = adapterUrl;
	}

	public void adapterUrl(String multirequestToken){
		setToken("adapterUrl", multirequestToken);
	}

	// settings:
	public Map<String, StringValue> getSettings(){
		return this.settings;
	}
	public void setSettings(Map<String, StringValue> settings){
		this.settings = settings;
	}

	// externalIdentifier:
	public String getExternalIdentifier(){
		return this.externalIdentifier;
	}
	public void setExternalIdentifier(String externalIdentifier){
		this.externalIdentifier = externalIdentifier;
	}

	public void externalIdentifier(String multirequestToken){
		setToken("externalIdentifier", multirequestToken);
	}

	// sharedSecret:
	public String getSharedSecret(){
		return this.sharedSecret;
	}
	public void setSharedSecret(String sharedSecret){
		this.sharedSecret = sharedSecret;
	}

	public void sharedSecret(String multirequestToken){
		setToken("sharedSecret", multirequestToken);
	}


	public SSOAdapterProfile() {
		super();
	}

	public SSOAdapterProfile(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		id = GsonParser.parseInt(jsonObject.get("id"));
		name = GsonParser.parseString(jsonObject.get("name"));
		isActive = GsonParser.parseInt(jsonObject.get("isActive"));
		adapterUrl = GsonParser.parseString(jsonObject.get("adapterUrl"));
		settings = GsonParser.parseMap(jsonObject.getAsJsonObject("settings"), StringValue.class);
		externalIdentifier = GsonParser.parseString(jsonObject.get("externalIdentifier"));
		sharedSecret = GsonParser.parseString(jsonObject.get("sharedSecret"));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaSSOAdapterProfile");
		kparams.add("name", this.name);
		kparams.add("isActive", this.isActive);
		kparams.add("adapterUrl", this.adapterUrl);
		kparams.add("settings", this.settings);
		kparams.add("externalIdentifier", this.externalIdentifier);
		kparams.add("sharedSecret", this.sharedSecret);
		return kparams;
	}


    public static final Creator<SSOAdapterProfile> CREATOR = new Creator<SSOAdapterProfile>() {
        @Override
        public SSOAdapterProfile createFromParcel(Parcel source) {
            return new SSOAdapterProfile(source);
        }

        @Override
        public SSOAdapterProfile[] newArray(int size) {
            return new SSOAdapterProfile[size];
        }
    };

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        super.writeToParcel(dest, flags);
        dest.writeValue(this.id);
        dest.writeString(this.name);
        dest.writeValue(this.isActive);
        dest.writeString(this.adapterUrl);
        if(this.settings != null) {
            dest.writeInt(this.settings.size());
            for (Map.Entry<String, StringValue> entry : this.settings.entrySet()) {
                dest.writeString(entry.getKey());
                dest.writeParcelable(entry.getValue(), flags);
            }
        } else {
            dest.writeInt(-1);
        }
        dest.writeString(this.externalIdentifier);
        dest.writeString(this.sharedSecret);
    }

    public SSOAdapterProfile(Parcel in) {
        super(in);
        this.id = (Integer)in.readValue(Integer.class.getClassLoader());
        this.name = in.readString();
        this.isActive = (Integer)in.readValue(Integer.class.getClassLoader());
        this.adapterUrl = in.readString();
        int settingsSize = in.readInt();
        if( settingsSize > -1) {
            this.settings = new HashMap<>();
            for (int i = 0; i < settingsSize; i++) {
                String key = in.readString();
                StringValue value = in.readParcelable(StringValue.class.getClassLoader());
                this.settings.put(key, value);
            }
        }
        this.externalIdentifier = in.readString();
        this.sharedSecret = in.readString();
    }
}

