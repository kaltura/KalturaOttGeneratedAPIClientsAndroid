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
import com.kaltura.client.enums.AnnouncementRecipientsType;
import com.kaltura.client.enums.AnnouncementStatus;
import com.kaltura.client.types.ObjectBase;
import com.kaltura.client.utils.GsonParser;
import com.kaltura.client.utils.request.MultiRequestBuilder;

/**
 * This class was generated using clients-generator\exec.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

@SuppressWarnings("serial")
@MultiRequestBuilder.Tokenizer(Announcement.Tokenizer.class)
public class Announcement extends ObjectBase {
	
	public interface Tokenizer extends ObjectBase.Tokenizer {
		String name();
		String message();
		String enabled();
		String startTime();
		String timezone();
		String status();
		String recipients();
		String id();
	}

	/**  Announcement name  */
	private String name;
	/**  Announcement message  */
	private String message;
	/**  Announcement enabled  */
	private Boolean enabled;
	/**  Announcement start time  */
	private Long startTime;
	/**  Announcement time zone  */
	private String timezone;
	/**  Announcement status: NotSent=0/Sending=1/Sent=2/Aborted=3  */
	private AnnouncementStatus status;
	/**  Announcement recipients: All=0/LoggedIn=1/Guests=2/Other=3  */
	private AnnouncementRecipientsType recipients;
	/**  Announcement id  */
	private Integer id;

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

	// message:
	public String getMessage(){
		return this.message;
	}
	public void setMessage(String message){
		this.message = message;
	}

	public void message(String multirequestToken){
		setToken("message", multirequestToken);
	}

	// enabled:
	public Boolean getEnabled(){
		return this.enabled;
	}
	public void setEnabled(Boolean enabled){
		this.enabled = enabled;
	}

	public void enabled(String multirequestToken){
		setToken("enabled", multirequestToken);
	}

	// startTime:
	public Long getStartTime(){
		return this.startTime;
	}
	public void setStartTime(Long startTime){
		this.startTime = startTime;
	}

	public void startTime(String multirequestToken){
		setToken("startTime", multirequestToken);
	}

	// timezone:
	public String getTimezone(){
		return this.timezone;
	}
	public void setTimezone(String timezone){
		this.timezone = timezone;
	}

	public void timezone(String multirequestToken){
		setToken("timezone", multirequestToken);
	}

	// status:
	public AnnouncementStatus getStatus(){
		return this.status;
	}
	public void setStatus(AnnouncementStatus status){
		this.status = status;
	}

	public void status(String multirequestToken){
		setToken("status", multirequestToken);
	}

	// recipients:
	public AnnouncementRecipientsType getRecipients(){
		return this.recipients;
	}
	public void setRecipients(AnnouncementRecipientsType recipients){
		this.recipients = recipients;
	}

	public void recipients(String multirequestToken){
		setToken("recipients", multirequestToken);
	}

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


	public Announcement() {
		super();
	}

	public Announcement(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		name = GsonParser.parseString(jsonObject.get("name"));
		message = GsonParser.parseString(jsonObject.get("message"));
		enabled = GsonParser.parseBoolean(jsonObject.get("enabled"));
		startTime = GsonParser.parseLong(jsonObject.get("startTime"));
		timezone = GsonParser.parseString(jsonObject.get("timezone"));
		status = AnnouncementStatus.get(GsonParser.parseString(jsonObject.get("status")));
		recipients = AnnouncementRecipientsType.get(GsonParser.parseString(jsonObject.get("recipients")));
		id = GsonParser.parseInt(jsonObject.get("id"));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaAnnouncement");
		kparams.add("name", this.name);
		kparams.add("message", this.message);
		kparams.add("enabled", this.enabled);
		kparams.add("startTime", this.startTime);
		kparams.add("timezone", this.timezone);
		kparams.add("recipients", this.recipients);
		return kparams;
	}


    public static final Creator<Announcement> CREATOR = new Creator<Announcement>() {
        @Override
        public Announcement createFromParcel(Parcel source) {
            return new Announcement(source);
        }

        @Override
        public Announcement[] newArray(int size) {
            return new Announcement[size];
        }
    };

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        super.writeToParcel(dest, flags);
        dest.writeString(this.name);
        dest.writeString(this.message);
        dest.writeValue(this.enabled);
        dest.writeValue(this.startTime);
        dest.writeString(this.timezone);
        dest.writeInt(this.status == null ? -1 : this.status.ordinal());
        dest.writeInt(this.recipients == null ? -1 : this.recipients.ordinal());
        dest.writeValue(this.id);
    }

    public Announcement(Parcel in) {
        super(in);
        this.name = in.readString();
        this.message = in.readString();
        this.enabled = (Boolean)in.readValue(Boolean.class.getClassLoader());
        this.startTime = (Long)in.readValue(Long.class.getClassLoader());
        this.timezone = in.readString();
        int tmpStatus = in.readInt();
        this.status = tmpStatus == -1 ? null : AnnouncementStatus.values()[tmpStatus];
        int tmpRecipients = in.readInt();
        this.recipients = tmpRecipients == -1 ? null : AnnouncementRecipientsType.values()[tmpRecipients];
        this.id = (Integer)in.readValue(Integer.class.getClassLoader());
    }
}

