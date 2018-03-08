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
import com.kaltura.client.types.ObjectBase;
import com.kaltura.client.utils.GsonParser;
import com.kaltura.client.utils.request.MultiRequestBuilder;
import com.kaltura.client.utils.request.RequestBuilder;
import java.util.HashMap;
import java.util.Map;

/**
 * This class was generated using clients-generator\exec.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

/**
 * C-DVR Adapter
 */
@SuppressWarnings("serial")
@MultiRequestBuilder.Tokenizer(CDVRAdapterProfile.Tokenizer.class)
public class CDVRAdapterProfile extends ObjectBase {
	
	public interface Tokenizer extends ObjectBase.Tokenizer {
		String id();
		String name();
		String isActive();
		String adapterUrl();
		RequestBuilder.MapTokenizer<StringValue.Tokenizer> settings();
		String externalIdentifier();
		String sharedSecret();
		String dynamicLinksSupport();
	}

	/**
	 * C-DVR adapter identifier
	 */
	private Integer id;
	/**
	 * C-DVR adapter name
	 */
	private String name;
	/**
	 * C-DVR adapter active status
	 */
	private Boolean isActive;
	/**
	 * C-DVR adapter adapter URL
	 */
	private String adapterUrl;
	/**
	 * C-DVR adapter extra parameters
	 */
	private Map<String, StringValue> settings;
	/**
	 * C-DVR adapter external identifier
	 */
	private String externalIdentifier;
	/**
	 * C-DVR shared secret
	 */
	private String sharedSecret;
	/**
	 * Indicates whether the C-DVR adapter supports dynamic URLs
	 */
	private Boolean dynamicLinksSupport;

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

	// isActive:
	public Boolean getIsActive(){
		return this.isActive;
	}
	public void setIsActive(Boolean isActive){
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

	// dynamicLinksSupport:
	public Boolean getDynamicLinksSupport(){
		return this.dynamicLinksSupport;
	}
	public void setDynamicLinksSupport(Boolean dynamicLinksSupport){
		this.dynamicLinksSupport = dynamicLinksSupport;
	}

	public void dynamicLinksSupport(String multirequestToken){
		setToken("dynamicLinksSupport", multirequestToken);
	}


	public CDVRAdapterProfile() {
		super();
	}

	public CDVRAdapterProfile(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		id = GsonParser.parseInt(jsonObject.get("id"));
		name = GsonParser.parseString(jsonObject.get("name"));
		isActive = GsonParser.parseBoolean(jsonObject.get("isActive"));
		adapterUrl = GsonParser.parseString(jsonObject.get("adapterUrl"));
		settings = GsonParser.parseMap(jsonObject.getAsJsonObject("settings"), StringValue.class);
		externalIdentifier = GsonParser.parseString(jsonObject.get("externalIdentifier"));
		sharedSecret = GsonParser.parseString(jsonObject.get("sharedSecret"));
		dynamicLinksSupport = GsonParser.parseBoolean(jsonObject.get("dynamicLinksSupport"));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaCDVRAdapterProfile");
		kparams.add("name", this.name);
		kparams.add("isActive", this.isActive);
		kparams.add("adapterUrl", this.adapterUrl);
		kparams.add("settings", this.settings);
		kparams.add("externalIdentifier", this.externalIdentifier);
		kparams.add("dynamicLinksSupport", this.dynamicLinksSupport);
		return kparams;
	}


    public static final Creator<CDVRAdapterProfile> CREATOR = new Creator<CDVRAdapterProfile>() {
        @Override
        public CDVRAdapterProfile createFromParcel(Parcel source) {
            return new CDVRAdapterProfile(source);
        }

        @Override
        public CDVRAdapterProfile[] newArray(int size) {
            return new CDVRAdapterProfile[size];
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
        dest.writeValue(this.dynamicLinksSupport);
    }

    public CDVRAdapterProfile(Parcel in) {
        super(in);
        this.id = (Integer)in.readValue(Integer.class.getClassLoader());
        this.name = in.readString();
        this.isActive = (Boolean)in.readValue(Boolean.class.getClassLoader());
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
        this.dynamicLinksSupport = (Boolean)in.readValue(Boolean.class.getClassLoader());
    }
}

