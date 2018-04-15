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
import com.kaltura.client.enums.OTTAssetType;
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
@MultiRequestBuilder.Tokenizer(MessageTemplate.Tokenizer.class)
public class MessageTemplate extends ObjectBase {
	
	public interface Tokenizer extends ObjectBase.Tokenizer {
		String message();
		String dateFormat();
		String assetType();
		String sound();
		String action();
		String url();
	}

	/**
	 * The message template with placeholders
	 */
	private String message;
	/**
	 * Default date format for the date &amp;amp; time entries used in the template
	 */
	private String dateFormat;
	/**
	 * Template type. Possible values: Series
	 */
	private OTTAssetType assetType;
	/**
	 * Sound file name to play upon message arrival to the device (if supported by
	  target device)
	 */
	private String sound;
	/**
	 * an optional action
	 */
	private String action;
	/**
	 * URL template for deep linking. Example - /app/location/{mediaId}
	 */
	private String url;

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

	// dateFormat:
	public String getDateFormat(){
		return this.dateFormat;
	}
	public void setDateFormat(String dateFormat){
		this.dateFormat = dateFormat;
	}

	public void dateFormat(String multirequestToken){
		setToken("dateFormat", multirequestToken);
	}

	// assetType:
	public OTTAssetType getAssetType(){
		return this.assetType;
	}
	public void setAssetType(OTTAssetType assetType){
		this.assetType = assetType;
	}

	public void assetType(String multirequestToken){
		setToken("assetType", multirequestToken);
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


	public MessageTemplate() {
		super();
	}

	public MessageTemplate(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		message = GsonParser.parseString(jsonObject.get("message"));
		dateFormat = GsonParser.parseString(jsonObject.get("dateFormat"));
		assetType = OTTAssetType.get(GsonParser.parseInt(jsonObject.get("assetType")));
		sound = GsonParser.parseString(jsonObject.get("sound"));
		action = GsonParser.parseString(jsonObject.get("action"));
		url = GsonParser.parseString(jsonObject.get("url"));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaMessageTemplate");
		kparams.add("message", this.message);
		kparams.add("dateFormat", this.dateFormat);
		kparams.add("assetType", this.assetType);
		kparams.add("sound", this.sound);
		kparams.add("action", this.action);
		kparams.add("url", this.url);
		return kparams;
	}


    public static final Creator<MessageTemplate> CREATOR = new Creator<MessageTemplate>() {
        @Override
        public MessageTemplate createFromParcel(Parcel source) {
            return new MessageTemplate(source);
        }

        @Override
        public MessageTemplate[] newArray(int size) {
            return new MessageTemplate[size];
        }
    };

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        super.writeToParcel(dest, flags);
        dest.writeString(this.message);
        dest.writeString(this.dateFormat);
        dest.writeInt(this.assetType == null ? -1 : this.assetType.ordinal());
        dest.writeString(this.sound);
        dest.writeString(this.action);
        dest.writeString(this.url);
    }

    public MessageTemplate(Parcel in) {
        super(in);
        this.message = in.readString();
        this.dateFormat = in.readString();
        int tmpAssetType = in.readInt();
        this.assetType = tmpAssetType == -1 ? null : OTTAssetType.values()[tmpAssetType];
        this.sound = in.readString();
        this.action = in.readString();
        this.url = in.readString();
    }
}

