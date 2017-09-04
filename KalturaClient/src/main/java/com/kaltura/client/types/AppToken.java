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
import com.kaltura.client.enums.AppTokenHashType;
import com.kaltura.client.types.ObjectBase;
import com.kaltura.client.utils.GsonParser;
import com.kaltura.client.utils.request.MultiRequestBuilder;

/**
 * This class was generated using clients-generator\exec.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

/**  Application token  */
@SuppressWarnings("serial")
@MultiRequestBuilder.Tokenizer(AppToken.Tokenizer.class)
public class AppToken extends ObjectBase {
	
	public interface Tokenizer extends ObjectBase.Tokenizer {
		String id();
		String expiry();
		String partnerId();
		String sessionDuration();
		String hashType();
		String sessionPrivileges();
		String token();
		String sessionUserId();
	}

	/**  The id of the application token  */
	private String id;
	/**  Expiry time of current token (unix timestamp in seconds)  */
	private Integer expiry;
	/**  Partner identifier  */
	private Integer partnerId;
	/**  Expiry duration of KS (Kaltura Session) that created using the current token (in
	  seconds)  */
	private Integer sessionDuration;
	/**  The hash type of the token  */
	private AppTokenHashType hashType;
	/**  Comma separated privileges to be applied on KS (Kaltura Session) that created
	  using the current token  */
	private String sessionPrivileges;
	/**  The application token  */
	private String token;
	/**  User id of KS (Kaltura Session) that created using the current token  */
	private String sessionUserId;

	// id:
	public String getId(){
		return this.id;
	}
	public void setId(String id){
		this.id = id;
	}

	public void id(String multirequestToken){
		setToken("id", multirequestToken);
	}

	// expiry:
	public Integer getExpiry(){
		return this.expiry;
	}
	public void setExpiry(Integer expiry){
		this.expiry = expiry;
	}

	public void expiry(String multirequestToken){
		setToken("expiry", multirequestToken);
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

	// sessionDuration:
	public Integer getSessionDuration(){
		return this.sessionDuration;
	}
	public void setSessionDuration(Integer sessionDuration){
		this.sessionDuration = sessionDuration;
	}

	public void sessionDuration(String multirequestToken){
		setToken("sessionDuration", multirequestToken);
	}

	// hashType:
	public AppTokenHashType getHashType(){
		return this.hashType;
	}
	public void setHashType(AppTokenHashType hashType){
		this.hashType = hashType;
	}

	public void hashType(String multirequestToken){
		setToken("hashType", multirequestToken);
	}

	// sessionPrivileges:
	public String getSessionPrivileges(){
		return this.sessionPrivileges;
	}
	public void setSessionPrivileges(String sessionPrivileges){
		this.sessionPrivileges = sessionPrivileges;
	}

	public void sessionPrivileges(String multirequestToken){
		setToken("sessionPrivileges", multirequestToken);
	}

	// token:
	public String getToken(){
		return this.token;
	}
	public void setToken(String token){
		this.token = token;
	}

	public void token(String multirequestToken){
		setToken("token", multirequestToken);
	}

	// sessionUserId:
	public String getSessionUserId(){
		return this.sessionUserId;
	}
	public void setSessionUserId(String sessionUserId){
		this.sessionUserId = sessionUserId;
	}

	public void sessionUserId(String multirequestToken){
		setToken("sessionUserId", multirequestToken);
	}


	public AppToken() {
		super();
	}

	public AppToken(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		id = GsonParser.parseString(jsonObject.get("id"));
		expiry = GsonParser.parseInt(jsonObject.get("expiry"));
		partnerId = GsonParser.parseInt(jsonObject.get("partnerId"));
		sessionDuration = GsonParser.parseInt(jsonObject.get("sessionDuration"));
		hashType = AppTokenHashType.get(GsonParser.parseString(jsonObject.get("hashType")));
		sessionPrivileges = GsonParser.parseString(jsonObject.get("sessionPrivileges"));
		token = GsonParser.parseString(jsonObject.get("token"));
		sessionUserId = GsonParser.parseString(jsonObject.get("sessionUserId"));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaAppToken");
		kparams.add("expiry", this.expiry);
		kparams.add("sessionDuration", this.sessionDuration);
		kparams.add("hashType", this.hashType);
		kparams.add("sessionPrivileges", this.sessionPrivileges);
		kparams.add("sessionUserId", this.sessionUserId);
		return kparams;
	}


    public static final Creator<AppToken> CREATOR = new Creator<AppToken>() {
        @Override
        public AppToken createFromParcel(Parcel source) {
            return new AppToken(source);
        }

        @Override
        public AppToken[] newArray(int size) {
            return new AppToken[size];
        }
    };

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        super.writeToParcel(dest, flags);
        dest.writeString(this.id);
        dest.writeValue(this.expiry);
        dest.writeValue(this.partnerId);
        dest.writeValue(this.sessionDuration);
        dest.writeInt(this.hashType == null ? -1 : this.hashType.ordinal());
        dest.writeString(this.sessionPrivileges);
        dest.writeString(this.token);
        dest.writeString(this.sessionUserId);
    }

    public AppToken(Parcel in) {
        super(in);
        this.id = in.readString();
        this.expiry = (Integer)in.readValue(Integer.class.getClassLoader());
        this.partnerId = (Integer)in.readValue(Integer.class.getClassLoader());
        this.sessionDuration = (Integer)in.readValue(Integer.class.getClassLoader());
        int tmpHashType = in.readInt();
        this.hashType = tmpHashType == -1 ? null : AppTokenHashType.values()[tmpHashType];
        this.sessionPrivileges = in.readString();
        this.token = in.readString();
        this.sessionUserId = in.readString();
    }
}

