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
import com.kaltura.client.enums.SessionType;
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
 * Kaltura Session
 */
@SuppressWarnings("serial")
@MultiRequestBuilder.Tokenizer(Session.Tokenizer.class)
public class Session extends ObjectBase {
	
	public interface Tokenizer extends ObjectBase.Tokenizer {
		String ks();
		String sessionType();
		String partnerId();
		String userId();
		String expiry();
		String privileges();
		String udid();
		String createDate();
	}

	/**
	 * KS
	 */
	private String ks;
	/**
	 * Session type
	 */
	private SessionType sessionType;
	/**
	 * Partner identifier
	 */
	private Integer partnerId;
	/**
	 * User identifier
	 */
	private String userId;
	/**
	 * Expiry
	 */
	private Integer expiry;
	/**
	 * Privileges
	 */
	private String privileges;
	/**
	 * UDID
	 */
	private String udid;
	/**
	 * Create date
	 */
	private Integer createDate;

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

	// sessionType:
	public SessionType getSessionType(){
		return this.sessionType;
	}
	public void setSessionType(SessionType sessionType){
		this.sessionType = sessionType;
	}

	public void sessionType(String multirequestToken){
		setToken("sessionType", multirequestToken);
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

	// userId:
	public String getUserId(){
		return this.userId;
	}
	public void setUserId(String userId){
		this.userId = userId;
	}

	public void userId(String multirequestToken){
		setToken("userId", multirequestToken);
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

	// privileges:
	public String getPrivileges(){
		return this.privileges;
	}
	public void setPrivileges(String privileges){
		this.privileges = privileges;
	}

	public void privileges(String multirequestToken){
		setToken("privileges", multirequestToken);
	}

	// udid:
	public String getUdid(){
		return this.udid;
	}
	public void setUdid(String udid){
		this.udid = udid;
	}

	public void udid(String multirequestToken){
		setToken("udid", multirequestToken);
	}

	// createDate:
	public Integer getCreateDate(){
		return this.createDate;
	}
	public void setCreateDate(Integer createDate){
		this.createDate = createDate;
	}

	public void createDate(String multirequestToken){
		setToken("createDate", multirequestToken);
	}


	public Session() {
		super();
	}

	public Session(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		ks = GsonParser.parseString(jsonObject.get("ks"));
		sessionType = SessionType.get(GsonParser.parseInt(jsonObject.get("sessionType")));
		partnerId = GsonParser.parseInt(jsonObject.get("partnerId"));
		userId = GsonParser.parseString(jsonObject.get("userId"));
		expiry = GsonParser.parseInt(jsonObject.get("expiry"));
		privileges = GsonParser.parseString(jsonObject.get("privileges"));
		udid = GsonParser.parseString(jsonObject.get("udid"));
		createDate = GsonParser.parseInt(jsonObject.get("createDate"));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaSession");
		kparams.add("ks", this.ks);
		kparams.add("sessionType", this.sessionType);
		kparams.add("partnerId", this.partnerId);
		kparams.add("userId", this.userId);
		kparams.add("expiry", this.expiry);
		kparams.add("privileges", this.privileges);
		kparams.add("udid", this.udid);
		kparams.add("createDate", this.createDate);
		return kparams;
	}


    public static final Creator<Session> CREATOR = new Creator<Session>() {
        @Override
        public Session createFromParcel(Parcel source) {
            return new Session(source);
        }

        @Override
        public Session[] newArray(int size) {
            return new Session[size];
        }
    };

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        super.writeToParcel(dest, flags);
        dest.writeString(this.ks);
        dest.writeInt(this.sessionType == null ? -1 : this.sessionType.ordinal());
        dest.writeValue(this.partnerId);
        dest.writeString(this.userId);
        dest.writeValue(this.expiry);
        dest.writeString(this.privileges);
        dest.writeString(this.udid);
        dest.writeValue(this.createDate);
    }

    public Session(Parcel in) {
        super(in);
        this.ks = in.readString();
        int tmpSessionType = in.readInt();
        this.sessionType = tmpSessionType == -1 ? null : SessionType.values()[tmpSessionType];
        this.partnerId = (Integer)in.readValue(Integer.class.getClassLoader());
        this.userId = in.readString();
        this.expiry = (Integer)in.readValue(Integer.class.getClassLoader());
        this.privileges = in.readString();
        this.udid = in.readString();
        this.createDate = (Integer)in.readValue(Integer.class.getClassLoader());
    }
}

