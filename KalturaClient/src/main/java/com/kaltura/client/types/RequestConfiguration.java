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

/**
 * This class was generated using clients-generator\exec.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

/**
 * Define client request optional configurations
 */
@SuppressWarnings("serial")
@MultiRequestBuilder.Tokenizer(RequestConfiguration.Tokenizer.class)
public class RequestConfiguration extends ObjectBase {
	
	public interface Tokenizer extends ObjectBase.Tokenizer {
		String partnerId();
		String userId();
		String language();
		String ks();
	}

	/**
	 * Impersonated partner id
	 */
	private Integer partnerId;
	/**
	 * Impersonated user id
	 */
	private Integer userId;
	/**
	 * Content language
	 */
	private String language;
	/**
	 * Kaltura API session
	 */
	private String ks;

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

	// userId:
	public Integer getUserId(){
		return this.userId;
	}
	public void setUserId(Integer userId){
		this.userId = userId;
	}

	public void userId(String multirequestToken){
		setToken("userId", multirequestToken);
	}

	// language:
	public String getLanguage(){
		return this.language;
	}
	public void setLanguage(String language){
		this.language = language;
	}

	public void language(String multirequestToken){
		setToken("language", multirequestToken);
	}

	// ks:
	public String getKs(){
		return this.ks;
	}
	public void setKs(String ks){
		this.ks = ks;
	}

	public void ks(String multirequestToken){
		setToken("ks", multirequestToken);
	}


	public RequestConfiguration() {
		super();
	}

	public RequestConfiguration(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		partnerId = GsonParser.parseInt(jsonObject.get("partnerId"));
		userId = GsonParser.parseInt(jsonObject.get("userId"));
		language = GsonParser.parseString(jsonObject.get("language"));
		ks = GsonParser.parseString(jsonObject.get("ks"));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaRequestConfiguration");
		kparams.add("partnerId", this.partnerId);
		kparams.add("userId", this.userId);
		kparams.add("language", this.language);
		kparams.add("ks", this.ks);
		return kparams;
	}


    public static final Creator<RequestConfiguration> CREATOR = new Creator<RequestConfiguration>() {
        @Override
        public RequestConfiguration createFromParcel(Parcel source) {
            return new RequestConfiguration(source);
        }

        @Override
        public RequestConfiguration[] newArray(int size) {
            return new RequestConfiguration[size];
        }
    };

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        super.writeToParcel(dest, flags);
        dest.writeValue(this.partnerId);
        dest.writeValue(this.userId);
        dest.writeString(this.language);
        dest.writeString(this.ks);
    }

    public RequestConfiguration(Parcel in) {
        super(in);
        this.partnerId = (Integer)in.readValue(Integer.class.getClassLoader());
        this.userId = (Integer)in.readValue(Integer.class.getClassLoader());
        this.language = in.readString();
        this.ks = in.readString();
    }
}

