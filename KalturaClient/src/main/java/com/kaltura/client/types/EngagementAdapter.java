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
 * Engagement Adapter
 */
@SuppressWarnings("serial")
@MultiRequestBuilder.Tokenizer(EngagementAdapter.Tokenizer.class)
public class EngagementAdapter extends EngagementAdapterBase {
	
	public interface Tokenizer extends EngagementAdapterBase.Tokenizer {
		String isActive();
		String adapterUrl();
		String providerUrl();
		RequestBuilder.MapTokenizer<StringValue.Tokenizer> engagementAdapterSettings();
		String sharedSecret();
	}

	/**
	 * Engagement adapter active status
	 */
	private Boolean isActive;
	/**
	 * Engagement adapter adapter URL
	 */
	private String adapterUrl;
	/**
	 * Engagement provider adapter URL
	 */
	private String providerUrl;
	/**
	 * Engagement adapter extra parameters
	 */
	private Map<String, StringValue> engagementAdapterSettings;
	/**
	 * Shared Secret
	 */
	private String sharedSecret;

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

	// providerUrl:
	public String getProviderUrl(){
		return this.providerUrl;
	}
	public void setProviderUrl(String providerUrl){
		this.providerUrl = providerUrl;
	}

	public void providerUrl(String multirequestToken){
		setToken("providerUrl", multirequestToken);
	}

	// engagementAdapterSettings:
	public Map<String, StringValue> getEngagementAdapterSettings(){
		return this.engagementAdapterSettings;
	}
	public void setEngagementAdapterSettings(Map<String, StringValue> engagementAdapterSettings){
		this.engagementAdapterSettings = engagementAdapterSettings;
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


	public EngagementAdapter() {
		super();
	}

	public EngagementAdapter(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		isActive = GsonParser.parseBoolean(jsonObject.get("isActive"));
		adapterUrl = GsonParser.parseString(jsonObject.get("adapterUrl"));
		providerUrl = GsonParser.parseString(jsonObject.get("providerUrl"));
		engagementAdapterSettings = GsonParser.parseMap(jsonObject.getAsJsonObject("engagementAdapterSettings"), StringValue.class);
		sharedSecret = GsonParser.parseString(jsonObject.get("sharedSecret"));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaEngagementAdapter");
		kparams.add("isActive", this.isActive);
		kparams.add("adapterUrl", this.adapterUrl);
		kparams.add("providerUrl", this.providerUrl);
		kparams.add("engagementAdapterSettings", this.engagementAdapterSettings);
		return kparams;
	}


    public static final Creator<EngagementAdapter> CREATOR = new Creator<EngagementAdapter>() {
        @Override
        public EngagementAdapter createFromParcel(Parcel source) {
            return new EngagementAdapter(source);
        }

        @Override
        public EngagementAdapter[] newArray(int size) {
            return new EngagementAdapter[size];
        }
    };

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        super.writeToParcel(dest, flags);
        dest.writeValue(this.isActive);
        dest.writeString(this.adapterUrl);
        dest.writeString(this.providerUrl);
        if(this.engagementAdapterSettings != null) {
            dest.writeInt(this.engagementAdapterSettings.size());
            for (Map.Entry<String, StringValue> entry : this.engagementAdapterSettings.entrySet()) {
                dest.writeString(entry.getKey());
                dest.writeParcelable(entry.getValue(), flags);
            }
        } else {
            dest.writeInt(-1);
        }
        dest.writeString(this.sharedSecret);
    }

    public EngagementAdapter(Parcel in) {
        super(in);
        this.isActive = (Boolean)in.readValue(Boolean.class.getClassLoader());
        this.adapterUrl = in.readString();
        this.providerUrl = in.readString();
        int engagementAdapterSettingsSize = in.readInt();
        if( engagementAdapterSettingsSize > -1) {
            this.engagementAdapterSettings = new HashMap<>();
            for (int i = 0; i < engagementAdapterSettingsSize; i++) {
                String key = in.readString();
                StringValue value = in.readParcelable(StringValue.class.getClassLoader());
                this.engagementAdapterSettings.put(key, value);
            }
        }
        this.sharedSecret = in.readString();
    }
}

