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

/**
 * Playback profile
 */
@SuppressWarnings("serial")
@MultiRequestBuilder.Tokenizer(PlaybackProfile.Tokenizer.class)
public class PlaybackProfile extends ObjectBase {
	
	public interface Tokenizer extends ObjectBase.Tokenizer {
		String id();
		String name();
		String isActive();
		String adapterGrpcAddress();
		String adapterUrl();
		String settings();
		String systemName();
		String sharedSecret();
	}

	/**
	 * Playback profile identifier
	 */
	private Integer id;
	/**
	 * Playback profile name
	 */
	private String name;
	/**
	 * Playback profile active status
	 */
	private Boolean isActive;
	/**
	 * Playback profile Grpc address
	 */
	private String adapterGrpcAddress;
	/**
	 * Playback profile URL
	 */
	private String adapterUrl;
	/**
	 * Playback profile settings
	 */
	private String settings;
	/**
	 * Playback profile alias
	 */
	private String systemName;
	/**
	 * Playback adapter shared secret
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
	public Boolean getIsActive(){
		return this.isActive;
	}
	public void setIsActive(Boolean isActive){
		this.isActive = isActive;
	}

	public void isActive(String multirequestToken){
		setToken("isActive", multirequestToken);
	}

	// adapterGrpcAddress:
	public String getAdapterGrpcAddress(){
		return this.adapterGrpcAddress;
	}
	public void setAdapterGrpcAddress(String adapterGrpcAddress){
		this.adapterGrpcAddress = adapterGrpcAddress;
	}

	public void adapterGrpcAddress(String multirequestToken){
		setToken("adapterGrpcAddress", multirequestToken);
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
	public String getSettings(){
		return this.settings;
	}
	public void setSettings(String settings){
		this.settings = settings;
	}

	public void settings(String multirequestToken){
		setToken("settings", multirequestToken);
	}

	// systemName:
	public String getSystemName(){
		return this.systemName;
	}
	public void setSystemName(String systemName){
		this.systemName = systemName;
	}

	public void systemName(String multirequestToken){
		setToken("systemName", multirequestToken);
	}

	// sharedSecret:
	public String getSharedSecret(){
		return this.sharedSecret;
	}

	public PlaybackProfile() {
		super();
	}

	public PlaybackProfile(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		id = GsonParser.parseInt(jsonObject.get("id"));
		name = GsonParser.parseString(jsonObject.get("name"));
		isActive = GsonParser.parseBoolean(jsonObject.get("isActive"));
		adapterGrpcAddress = GsonParser.parseString(jsonObject.get("adapterGrpcAddress"));
		adapterUrl = GsonParser.parseString(jsonObject.get("adapterUrl"));
		settings = GsonParser.parseString(jsonObject.get("settings"));
		systemName = GsonParser.parseString(jsonObject.get("systemName"));
		sharedSecret = GsonParser.parseString(jsonObject.get("sharedSecret"));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaPlaybackProfile");
		kparams.add("name", this.name);
		kparams.add("isActive", this.isActive);
		kparams.add("adapterGrpcAddress", this.adapterGrpcAddress);
		kparams.add("adapterUrl", this.adapterUrl);
		kparams.add("settings", this.settings);
		kparams.add("systemName", this.systemName);
		return kparams;
	}


    public static final Creator<PlaybackProfile> CREATOR = new Creator<PlaybackProfile>() {
        @Override
        public PlaybackProfile createFromParcel(Parcel source) {
            return new PlaybackProfile(source);
        }

        @Override
        public PlaybackProfile[] newArray(int size) {
            return new PlaybackProfile[size];
        }
    };

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        super.writeToParcel(dest, flags);
        dest.writeValue(this.id);
        dest.writeString(this.name);
        dest.writeValue(this.isActive);
        dest.writeString(this.adapterGrpcAddress);
        dest.writeString(this.adapterUrl);
        dest.writeString(this.settings);
        dest.writeString(this.systemName);
        dest.writeString(this.sharedSecret);
    }

    public PlaybackProfile(Parcel in) {
        super(in);
        this.id = (Integer)in.readValue(Integer.class.getClassLoader());
        this.name = in.readString();
        this.isActive = (Boolean)in.readValue(Boolean.class.getClassLoader());
        this.adapterGrpcAddress = in.readString();
        this.adapterUrl = in.readString();
        this.settings = in.readString();
        this.systemName = in.readString();
        this.sharedSecret = in.readString();
    }
}

