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

/**
 * This class was generated using exec.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

/**
 * Login response
 */
@SuppressWarnings("serial")
@MultiRequestBuilder.Tokenizer(LoginSession.Tokenizer.class)
public class LoginSession extends ObjectBase {
	
	public interface Tokenizer extends ObjectBase.Tokenizer {
		String ks();
		String expiration();
	}

	/**
	 * Access token in a KS format
	 */
	private String ks;
	/**
	 * Expiration
	 */
	private Long expiration;

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

	// expiration:
	public Long getExpiration(){
		return this.expiration;
	}
	public void setExpiration(Long expiration){
		this.expiration = expiration;
	}

	public void expiration(String multirequestToken){
		setToken("expiration", multirequestToken);
	}


	public LoginSession() {
		super();
	}

	public LoginSession(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		ks = GsonParser.parseString(jsonObject.get("ks"));
		expiration = GsonParser.parseLong(jsonObject.get("expiration"));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaLoginSession");
		kparams.add("ks", this.ks);
		kparams.add("expiration", this.expiration);
		return kparams;
	}


    public static final Creator<LoginSession> CREATOR = new Creator<LoginSession>() {
        @Override
        public LoginSession createFromParcel(Parcel source) {
            return new LoginSession(source);
        }

        @Override
        public LoginSession[] newArray(int size) {
            return new LoginSession[size];
        }
    };

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        super.writeToParcel(dest, flags);
        dest.writeString(this.ks);
        dest.writeValue(this.expiration);
    }

    public LoginSession(Parcel in) {
        super(in);
        this.ks = in.readString();
        this.expiration = (Long)in.readValue(Long.class.getClassLoader());
    }
}

