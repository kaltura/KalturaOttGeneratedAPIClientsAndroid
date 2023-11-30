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

@SuppressWarnings("serial")
@MultiRequestBuilder.Tokenizer(BasePartnerConfiguration.Tokenizer.class)
public class BasePartnerConfiguration extends PartnerConfiguration {
	
	public interface Tokenizer extends PartnerConfiguration.Tokenizer {
		String ksExpirationSeconds();
		String appTokenSessionMaxDurationSeconds();
		String anonymousKSExpirationSeconds();
		String refreshExpirationForPinLoginSeconds();
		String appTokenMaxExpirySeconds();
		String autoRefreshAppToken();
		String uploadTokenExpirySeconds();
		String apptokenUserValidationDisabled();
		String epgFeatureVersion();
	}

	/**
	 * KSExpirationSeconds
	 */
	private Long ksExpirationSeconds;
	/**
	 * AppTokenSessionMaxDurationSeconds
	 */
	private Integer appTokenSessionMaxDurationSeconds;
	/**
	 * AnonymousKSExpirationSeconds
	 */
	private Long anonymousKSExpirationSeconds;
	/**
	 * RefreshExpirationForPinLoginSeconds
	 */
	private Long refreshExpirationForPinLoginSeconds;
	/**
	 * AppTokenMaxExpirySeconds
	 */
	private Integer appTokenMaxExpirySeconds;
	/**
	 * AutoRefreshAppToken
	 */
	private Boolean autoRefreshAppToken;
	/**
	 * uploadTokenExpirySeconds
	 */
	private Integer uploadTokenExpirySeconds;
	/**
	 * apptokenUserValidationDisabled
	 */
	private Boolean apptokenUserValidationDisabled;
	/**
	 * epgFeatureVersion              defines the epg feature version from version 1 to
	  version 3              if not provided v2 will be used
	 */
	private Integer epgFeatureVersion;

	// ksExpirationSeconds:
	public Long getKsExpirationSeconds(){
		return this.ksExpirationSeconds;
	}
	public void setKsExpirationSeconds(Long ksExpirationSeconds){
		this.ksExpirationSeconds = ksExpirationSeconds;
	}

	public void ksExpirationSeconds(String multirequestToken){
		setToken("ksExpirationSeconds", multirequestToken);
	}

	// appTokenSessionMaxDurationSeconds:
	public Integer getAppTokenSessionMaxDurationSeconds(){
		return this.appTokenSessionMaxDurationSeconds;
	}
	public void setAppTokenSessionMaxDurationSeconds(Integer appTokenSessionMaxDurationSeconds){
		this.appTokenSessionMaxDurationSeconds = appTokenSessionMaxDurationSeconds;
	}

	public void appTokenSessionMaxDurationSeconds(String multirequestToken){
		setToken("appTokenSessionMaxDurationSeconds", multirequestToken);
	}

	// anonymousKSExpirationSeconds:
	public Long getAnonymousKSExpirationSeconds(){
		return this.anonymousKSExpirationSeconds;
	}
	public void setAnonymousKSExpirationSeconds(Long anonymousKSExpirationSeconds){
		this.anonymousKSExpirationSeconds = anonymousKSExpirationSeconds;
	}

	public void anonymousKSExpirationSeconds(String multirequestToken){
		setToken("anonymousKSExpirationSeconds", multirequestToken);
	}

	// refreshExpirationForPinLoginSeconds:
	public Long getRefreshExpirationForPinLoginSeconds(){
		return this.refreshExpirationForPinLoginSeconds;
	}
	public void setRefreshExpirationForPinLoginSeconds(Long refreshExpirationForPinLoginSeconds){
		this.refreshExpirationForPinLoginSeconds = refreshExpirationForPinLoginSeconds;
	}

	public void refreshExpirationForPinLoginSeconds(String multirequestToken){
		setToken("refreshExpirationForPinLoginSeconds", multirequestToken);
	}

	// appTokenMaxExpirySeconds:
	public Integer getAppTokenMaxExpirySeconds(){
		return this.appTokenMaxExpirySeconds;
	}
	public void setAppTokenMaxExpirySeconds(Integer appTokenMaxExpirySeconds){
		this.appTokenMaxExpirySeconds = appTokenMaxExpirySeconds;
	}

	public void appTokenMaxExpirySeconds(String multirequestToken){
		setToken("appTokenMaxExpirySeconds", multirequestToken);
	}

	// autoRefreshAppToken:
	public Boolean getAutoRefreshAppToken(){
		return this.autoRefreshAppToken;
	}
	public void setAutoRefreshAppToken(Boolean autoRefreshAppToken){
		this.autoRefreshAppToken = autoRefreshAppToken;
	}

	public void autoRefreshAppToken(String multirequestToken){
		setToken("autoRefreshAppToken", multirequestToken);
	}

	// uploadTokenExpirySeconds:
	public Integer getUploadTokenExpirySeconds(){
		return this.uploadTokenExpirySeconds;
	}
	public void setUploadTokenExpirySeconds(Integer uploadTokenExpirySeconds){
		this.uploadTokenExpirySeconds = uploadTokenExpirySeconds;
	}

	public void uploadTokenExpirySeconds(String multirequestToken){
		setToken("uploadTokenExpirySeconds", multirequestToken);
	}

	// apptokenUserValidationDisabled:
	public Boolean getApptokenUserValidationDisabled(){
		return this.apptokenUserValidationDisabled;
	}
	public void setApptokenUserValidationDisabled(Boolean apptokenUserValidationDisabled){
		this.apptokenUserValidationDisabled = apptokenUserValidationDisabled;
	}

	public void apptokenUserValidationDisabled(String multirequestToken){
		setToken("apptokenUserValidationDisabled", multirequestToken);
	}

	// epgFeatureVersion:
	public Integer getEpgFeatureVersion(){
		return this.epgFeatureVersion;
	}
	public void setEpgFeatureVersion(Integer epgFeatureVersion){
		this.epgFeatureVersion = epgFeatureVersion;
	}

	public void epgFeatureVersion(String multirequestToken){
		setToken("epgFeatureVersion", multirequestToken);
	}


	public BasePartnerConfiguration() {
		super();
	}

	public BasePartnerConfiguration(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		ksExpirationSeconds = GsonParser.parseLong(jsonObject.get("ksExpirationSeconds"));
		appTokenSessionMaxDurationSeconds = GsonParser.parseInt(jsonObject.get("appTokenSessionMaxDurationSeconds"));
		anonymousKSExpirationSeconds = GsonParser.parseLong(jsonObject.get("anonymousKSExpirationSeconds"));
		refreshExpirationForPinLoginSeconds = GsonParser.parseLong(jsonObject.get("refreshExpirationForPinLoginSeconds"));
		appTokenMaxExpirySeconds = GsonParser.parseInt(jsonObject.get("appTokenMaxExpirySeconds"));
		autoRefreshAppToken = GsonParser.parseBoolean(jsonObject.get("autoRefreshAppToken"));
		uploadTokenExpirySeconds = GsonParser.parseInt(jsonObject.get("uploadTokenExpirySeconds"));
		apptokenUserValidationDisabled = GsonParser.parseBoolean(jsonObject.get("apptokenUserValidationDisabled"));
		epgFeatureVersion = GsonParser.parseInt(jsonObject.get("epgFeatureVersion"));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaBasePartnerConfiguration");
		kparams.add("ksExpirationSeconds", this.ksExpirationSeconds);
		kparams.add("appTokenSessionMaxDurationSeconds", this.appTokenSessionMaxDurationSeconds);
		kparams.add("anonymousKSExpirationSeconds", this.anonymousKSExpirationSeconds);
		kparams.add("refreshExpirationForPinLoginSeconds", this.refreshExpirationForPinLoginSeconds);
		kparams.add("appTokenMaxExpirySeconds", this.appTokenMaxExpirySeconds);
		kparams.add("autoRefreshAppToken", this.autoRefreshAppToken);
		kparams.add("uploadTokenExpirySeconds", this.uploadTokenExpirySeconds);
		kparams.add("apptokenUserValidationDisabled", this.apptokenUserValidationDisabled);
		kparams.add("epgFeatureVersion", this.epgFeatureVersion);
		return kparams;
	}


    public static final Creator<BasePartnerConfiguration> CREATOR = new Creator<BasePartnerConfiguration>() {
        @Override
        public BasePartnerConfiguration createFromParcel(Parcel source) {
            return new BasePartnerConfiguration(source);
        }

        @Override
        public BasePartnerConfiguration[] newArray(int size) {
            return new BasePartnerConfiguration[size];
        }
    };

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        super.writeToParcel(dest, flags);
        dest.writeValue(this.ksExpirationSeconds);
        dest.writeValue(this.appTokenSessionMaxDurationSeconds);
        dest.writeValue(this.anonymousKSExpirationSeconds);
        dest.writeValue(this.refreshExpirationForPinLoginSeconds);
        dest.writeValue(this.appTokenMaxExpirySeconds);
        dest.writeValue(this.autoRefreshAppToken);
        dest.writeValue(this.uploadTokenExpirySeconds);
        dest.writeValue(this.apptokenUserValidationDisabled);
        dest.writeValue(this.epgFeatureVersion);
    }

    public BasePartnerConfiguration(Parcel in) {
        super(in);
        this.ksExpirationSeconds = (Long)in.readValue(Long.class.getClassLoader());
        this.appTokenSessionMaxDurationSeconds = (Integer)in.readValue(Integer.class.getClassLoader());
        this.anonymousKSExpirationSeconds = (Long)in.readValue(Long.class.getClassLoader());
        this.refreshExpirationForPinLoginSeconds = (Long)in.readValue(Long.class.getClassLoader());
        this.appTokenMaxExpirySeconds = (Integer)in.readValue(Integer.class.getClassLoader());
        this.autoRefreshAppToken = (Boolean)in.readValue(Boolean.class.getClassLoader());
        this.uploadTokenExpirySeconds = (Integer)in.readValue(Integer.class.getClassLoader());
        this.apptokenUserValidationDisabled = (Boolean)in.readValue(Boolean.class.getClassLoader());
        this.epgFeatureVersion = (Integer)in.readValue(Integer.class.getClassLoader());
    }
}

