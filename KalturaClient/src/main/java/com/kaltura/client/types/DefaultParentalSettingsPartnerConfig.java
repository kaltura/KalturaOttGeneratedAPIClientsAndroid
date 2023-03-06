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
@MultiRequestBuilder.Tokenizer(DefaultParentalSettingsPartnerConfig.Tokenizer.class)
public class DefaultParentalSettingsPartnerConfig extends PartnerConfiguration {
	
	public interface Tokenizer extends PartnerConfiguration.Tokenizer {
		String defaultMoviesParentalRuleId();
		String defaultTvSeriesParentalRuleId();
		String defaultParentalPin();
		String defaultPurchasePin();
		String defaultPurchaseSettings();
	}

	/**
	 * defaultTvSeriesParentalRuleId
	 */
	private Long defaultMoviesParentalRuleId;
	/**
	 * defaultTvSeriesParentalRuleId
	 */
	private Long defaultTvSeriesParentalRuleId;
	/**
	 * defaultParentalPin
	 */
	private String defaultParentalPin;
	/**
	 * defaultPurchasePin
	 */
	private String defaultPurchasePin;
	/**
	 * defaultPurchaseSettings
	 */
	private Long defaultPurchaseSettings;

	// defaultMoviesParentalRuleId:
	public Long getDefaultMoviesParentalRuleId(){
		return this.defaultMoviesParentalRuleId;
	}
	public void setDefaultMoviesParentalRuleId(Long defaultMoviesParentalRuleId){
		this.defaultMoviesParentalRuleId = defaultMoviesParentalRuleId;
	}

	public void defaultMoviesParentalRuleId(String multirequestToken){
		setToken("defaultMoviesParentalRuleId", multirequestToken);
	}

	// defaultTvSeriesParentalRuleId:
	public Long getDefaultTvSeriesParentalRuleId(){
		return this.defaultTvSeriesParentalRuleId;
	}
	public void setDefaultTvSeriesParentalRuleId(Long defaultTvSeriesParentalRuleId){
		this.defaultTvSeriesParentalRuleId = defaultTvSeriesParentalRuleId;
	}

	public void defaultTvSeriesParentalRuleId(String multirequestToken){
		setToken("defaultTvSeriesParentalRuleId", multirequestToken);
	}

	// defaultParentalPin:
	public String getDefaultParentalPin(){
		return this.defaultParentalPin;
	}
	public void setDefaultParentalPin(String defaultParentalPin){
		this.defaultParentalPin = defaultParentalPin;
	}

	public void defaultParentalPin(String multirequestToken){
		setToken("defaultParentalPin", multirequestToken);
	}

	// defaultPurchasePin:
	public String getDefaultPurchasePin(){
		return this.defaultPurchasePin;
	}
	public void setDefaultPurchasePin(String defaultPurchasePin){
		this.defaultPurchasePin = defaultPurchasePin;
	}

	public void defaultPurchasePin(String multirequestToken){
		setToken("defaultPurchasePin", multirequestToken);
	}

	// defaultPurchaseSettings:
	public Long getDefaultPurchaseSettings(){
		return this.defaultPurchaseSettings;
	}
	public void setDefaultPurchaseSettings(Long defaultPurchaseSettings){
		this.defaultPurchaseSettings = defaultPurchaseSettings;
	}

	public void defaultPurchaseSettings(String multirequestToken){
		setToken("defaultPurchaseSettings", multirequestToken);
	}


	public DefaultParentalSettingsPartnerConfig() {
		super();
	}

	public DefaultParentalSettingsPartnerConfig(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		defaultMoviesParentalRuleId = GsonParser.parseLong(jsonObject.get("defaultMoviesParentalRuleId"));
		defaultTvSeriesParentalRuleId = GsonParser.parseLong(jsonObject.get("defaultTvSeriesParentalRuleId"));
		defaultParentalPin = GsonParser.parseString(jsonObject.get("defaultParentalPin"));
		defaultPurchasePin = GsonParser.parseString(jsonObject.get("defaultPurchasePin"));
		defaultPurchaseSettings = GsonParser.parseLong(jsonObject.get("defaultPurchaseSettings"));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaDefaultParentalSettingsPartnerConfig");
		kparams.add("defaultMoviesParentalRuleId", this.defaultMoviesParentalRuleId);
		kparams.add("defaultTvSeriesParentalRuleId", this.defaultTvSeriesParentalRuleId);
		kparams.add("defaultParentalPin", this.defaultParentalPin);
		kparams.add("defaultPurchasePin", this.defaultPurchasePin);
		kparams.add("defaultPurchaseSettings", this.defaultPurchaseSettings);
		return kparams;
	}


    public static final Creator<DefaultParentalSettingsPartnerConfig> CREATOR = new Creator<DefaultParentalSettingsPartnerConfig>() {
        @Override
        public DefaultParentalSettingsPartnerConfig createFromParcel(Parcel source) {
            return new DefaultParentalSettingsPartnerConfig(source);
        }

        @Override
        public DefaultParentalSettingsPartnerConfig[] newArray(int size) {
            return new DefaultParentalSettingsPartnerConfig[size];
        }
    };

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        super.writeToParcel(dest, flags);
        dest.writeValue(this.defaultMoviesParentalRuleId);
        dest.writeValue(this.defaultTvSeriesParentalRuleId);
        dest.writeString(this.defaultParentalPin);
        dest.writeString(this.defaultPurchasePin);
        dest.writeValue(this.defaultPurchaseSettings);
    }

    public DefaultParentalSettingsPartnerConfig(Parcel in) {
        super(in);
        this.defaultMoviesParentalRuleId = (Long)in.readValue(Long.class.getClassLoader());
        this.defaultTvSeriesParentalRuleId = (Long)in.readValue(Long.class.getClassLoader());
        this.defaultParentalPin = in.readString();
        this.defaultPurchasePin = in.readString();
        this.defaultPurchaseSettings = (Long)in.readValue(Long.class.getClassLoader());
    }
}

