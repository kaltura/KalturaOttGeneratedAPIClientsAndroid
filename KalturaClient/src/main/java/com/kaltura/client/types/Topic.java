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
import com.kaltura.client.enums.TopicAutomaticIssueNotification;
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
@MultiRequestBuilder.Tokenizer(Topic.Tokenizer.class)
public class Topic extends ObjectBase {
	
	public interface Tokenizer extends ObjectBase.Tokenizer {
		String id();
		String name();
		String subscribersAmount();
		String automaticIssueNotification();
		String lastMessageSentDateSec();
	}

	/**
	 * message id
	 */
	private String id;
	/**
	 * message
	 */
	private String name;
	/**
	 * message
	 */
	private String subscribersAmount;
	/**
	 * automaticIssueNotification
	 */
	private TopicAutomaticIssueNotification automaticIssueNotification;
	/**
	 * lastMessageSentDateSec
	 */
	private Long lastMessageSentDateSec;

	// id:
	public String getId(){
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

	// subscribersAmount:
	public String getSubscribersAmount(){
		return this.subscribersAmount;
	}
	public void setSubscribersAmount(String subscribersAmount){
		this.subscribersAmount = subscribersAmount;
	}

	public void subscribersAmount(String multirequestToken){
		setToken("subscribersAmount", multirequestToken);
	}

	// automaticIssueNotification:
	public TopicAutomaticIssueNotification getAutomaticIssueNotification(){
		return this.automaticIssueNotification;
	}
	public void setAutomaticIssueNotification(TopicAutomaticIssueNotification automaticIssueNotification){
		this.automaticIssueNotification = automaticIssueNotification;
	}

	public void automaticIssueNotification(String multirequestToken){
		setToken("automaticIssueNotification", multirequestToken);
	}

	// lastMessageSentDateSec:
	public Long getLastMessageSentDateSec(){
		return this.lastMessageSentDateSec;
	}
	public void setLastMessageSentDateSec(Long lastMessageSentDateSec){
		this.lastMessageSentDateSec = lastMessageSentDateSec;
	}

	public void lastMessageSentDateSec(String multirequestToken){
		setToken("lastMessageSentDateSec", multirequestToken);
	}


	public Topic() {
		super();
	}

	public Topic(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		id = GsonParser.parseString(jsonObject.get("id"));
		name = GsonParser.parseString(jsonObject.get("name"));
		subscribersAmount = GsonParser.parseString(jsonObject.get("subscribersAmount"));
		automaticIssueNotification = TopicAutomaticIssueNotification.get(GsonParser.parseString(jsonObject.get("automaticIssueNotification")));
		lastMessageSentDateSec = GsonParser.parseLong(jsonObject.get("lastMessageSentDateSec"));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaTopic");
		kparams.add("name", this.name);
		kparams.add("subscribersAmount", this.subscribersAmount);
		kparams.add("automaticIssueNotification", this.automaticIssueNotification);
		kparams.add("lastMessageSentDateSec", this.lastMessageSentDateSec);
		return kparams;
	}


    public static final Creator<Topic> CREATOR = new Creator<Topic>() {
        @Override
        public Topic createFromParcel(Parcel source) {
            return new Topic(source);
        }

        @Override
        public Topic[] newArray(int size) {
            return new Topic[size];
        }
    };

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        super.writeToParcel(dest, flags);
        dest.writeString(this.id);
        dest.writeString(this.name);
        dest.writeString(this.subscribersAmount);
        dest.writeInt(this.automaticIssueNotification == null ? -1 : this.automaticIssueNotification.ordinal());
        dest.writeValue(this.lastMessageSentDateSec);
    }

    public Topic(Parcel in) {
        super(in);
        this.id = in.readString();
        this.name = in.readString();
        this.subscribersAmount = in.readString();
        int tmpAutomaticIssueNotification = in.readInt();
        this.automaticIssueNotification = tmpAutomaticIssueNotification == -1 ? null : TopicAutomaticIssueNotification.values()[tmpAutomaticIssueNotification];
        this.lastMessageSentDateSec = (Long)in.readValue(Long.class.getClassLoader());
    }
}

