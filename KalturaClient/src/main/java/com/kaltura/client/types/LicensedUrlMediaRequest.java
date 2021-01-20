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
@MultiRequestBuilder.Tokenizer(LicensedUrlMediaRequest.Tokenizer.class)
public class LicensedUrlMediaRequest extends LicensedUrlBaseRequest {
	
	public interface Tokenizer extends LicensedUrlBaseRequest.Tokenizer {
		String contentId();
		String baseUrl();
	}

	/**
	 * Identifier of the content to get the link for (file identifier)
	 */
	private Integer contentId;
	/**
	 * Base URL for the licensed URLs
	 */
	private String baseUrl;

	// contentId:
	public Integer getContentId(){
		return this.contentId;
	}
	public void setContentId(Integer contentId){
		this.contentId = contentId;
	}

	public void contentId(String multirequestToken){
		setToken("contentId", multirequestToken);
	}

	// baseUrl:
	public String getBaseUrl(){
		return this.baseUrl;
	}
	public void setBaseUrl(String baseUrl){
		this.baseUrl = baseUrl;
	}

	public void baseUrl(String multirequestToken){
		setToken("baseUrl", multirequestToken);
	}


	public LicensedUrlMediaRequest() {
		super();
	}

	public LicensedUrlMediaRequest(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		contentId = GsonParser.parseInt(jsonObject.get("contentId"));
		baseUrl = GsonParser.parseString(jsonObject.get("baseUrl"));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaLicensedUrlMediaRequest");
		kparams.add("contentId", this.contentId);
		kparams.add("baseUrl", this.baseUrl);
		return kparams;
	}


    public static final Creator<LicensedUrlMediaRequest> CREATOR = new Creator<LicensedUrlMediaRequest>() {
        @Override
        public LicensedUrlMediaRequest createFromParcel(Parcel source) {
            return new LicensedUrlMediaRequest(source);
        }

        @Override
        public LicensedUrlMediaRequest[] newArray(int size) {
            return new LicensedUrlMediaRequest[size];
        }
    };

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        super.writeToParcel(dest, flags);
        dest.writeValue(this.contentId);
        dest.writeString(this.baseUrl);
    }

    public LicensedUrlMediaRequest(Parcel in) {
        super(in);
        this.contentId = (Integer)in.readValue(Integer.class.getClassLoader());
        this.baseUrl = in.readString();
    }
}

