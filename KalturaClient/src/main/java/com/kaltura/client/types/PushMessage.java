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
import com.kaltura.client.types.ObjectBase;
import com.kaltura.client.utils.GsonParser;
import com.kaltura.client.utils.request.MultiRequestBuilder;

/**
 * This class was generated using exec.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

@SuppressWarnings("serial")
@MultiRequestBuilder.Tokenizer(PushMessage.Tokenizer.class)
public class PushMessage extends ObjectBase {
	
	public interface Tokenizer extends ObjectBase.Tokenizer {
		String message();
		String sound();
		String action();
		String url();
		String udid();
		String pushChannels();
	}

	/**
	 * The message that will be presented to the user.
	 */
	private String message;
	/**
	 * Optional. Can be used to change the default push sound on the user device.
	 */
	private String sound;
	/**
	 * Optional. Used to change the default action of the application when a push is
	  received.
	 */
	private String action;
	/**
	 * Optional. Used to direct the application to the relevant page.
	 */
	private String url;
	/**
	 * Device unique identifier
	 */
	private String udid;
	/**
	 * PushChannels - separated with comma
	 */
	private String pushChannels;

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

	// sound:
	public String getSound(){
		return this.sound;
	}
	public void setSound(String sound){
		this.sound = sound;
	}

	public void sound(String multirequestToken){
		setToken("sound", multirequestToken);
	}

	// action:
	public String getAction(){
		return this.action;
	}
	public void setAction(String action){
		this.action = action;
	}

	public void action(String multirequestToken){
		setToken("action", multirequestToken);
	}

	// url:
	public String getUrl(){
		return this.url;
	}
	public void setUrl(String url){
		this.url = url;
	}

	public void url(String multirequestToken){
		setToken("url", multirequestToken);
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

	// pushChannels:
	public String getPushChannels(){
		return this.pushChannels;
	}
	public void setPushChannels(String pushChannels){
		this.pushChannels = pushChannels;
	}

	public void pushChannels(String multirequestToken){
		setToken("pushChannels", multirequestToken);
	}


	public PushMessage() {
		super();
	}

	public PushMessage(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		message = GsonParser.parseString(jsonObject.get("message"));
		sound = GsonParser.parseString(jsonObject.get("sound"));
		action = GsonParser.parseString(jsonObject.get("action"));
		url = GsonParser.parseString(jsonObject.get("url"));
		udid = GsonParser.parseString(jsonObject.get("udid"));
		pushChannels = GsonParser.parseString(jsonObject.get("pushChannels"));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaPushMessage");
		kparams.add("message", this.message);
		kparams.add("sound", this.sound);
		kparams.add("action", this.action);
		kparams.add("url", this.url);
		kparams.add("udid", this.udid);
		kparams.add("pushChannels", this.pushChannels);
		return kparams;
	}


    public static final Creator<PushMessage> CREATOR = new Creator<PushMessage>() {
        @Override
        public PushMessage createFromParcel(Parcel source) {
            return new PushMessage(source);
        }

        @Override
        public PushMessage[] newArray(int size) {
            return new PushMessage[size];
        }
    };

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        super.writeToParcel(dest, flags);
        dest.writeString(this.message);
        dest.writeString(this.sound);
        dest.writeString(this.action);
        dest.writeString(this.url);
        dest.writeString(this.udid);
        dest.writeString(this.pushChannels);
    }

    public PushMessage(Parcel in) {
        super(in);
        this.message = in.readString();
        this.sound = in.readString();
        this.action = in.readString();
        this.url = in.readString();
        this.udid = in.readString();
        this.pushChannels = in.readString();
    }
}

