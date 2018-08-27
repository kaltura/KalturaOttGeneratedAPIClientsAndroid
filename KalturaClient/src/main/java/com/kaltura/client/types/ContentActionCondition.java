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
import com.kaltura.client.enums.ContentAction;
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
 * Segmentation condition regarding content actions
 */
@SuppressWarnings("serial")
@MultiRequestBuilder.Tokenizer(ContentActionCondition.Tokenizer.class)
public class ContentActionCondition extends ObjectBase {
	
	public interface Tokenizer extends ObjectBase.Tokenizer {
		String action();
		String length();
		String multiplier();
	}

	/**
	 * The relevant action to be examined
	 */
	private ContentAction action;
	/**
	 * Optional - if action required specific length to be considered
	 */
	private Integer length;
	/**
	 * Score multiplier - how much is a single action worth when considering the action
	 */
	private Integer multiplier;

	// action:
	public ContentAction getAction(){
		return this.action;
	}
	public void setAction(ContentAction action){
		this.action = action;
	}

	public void action(String multirequestToken){
		setToken("action", multirequestToken);
	}

	// length:
	public Integer getLength(){
		return this.length;
	}
	public void setLength(Integer length){
		this.length = length;
	}

	public void length(String multirequestToken){
		setToken("length", multirequestToken);
	}

	// multiplier:
	public Integer getMultiplier(){
		return this.multiplier;
	}
	public void setMultiplier(Integer multiplier){
		this.multiplier = multiplier;
	}

	public void multiplier(String multirequestToken){
		setToken("multiplier", multirequestToken);
	}


	public ContentActionCondition() {
		super();
	}

	public ContentActionCondition(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		action = ContentAction.get(GsonParser.parseString(jsonObject.get("action")));
		length = GsonParser.parseInt(jsonObject.get("length"));
		multiplier = GsonParser.parseInt(jsonObject.get("multiplier"));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaContentActionCondition");
		kparams.add("action", this.action);
		kparams.add("length", this.length);
		kparams.add("multiplier", this.multiplier);
		return kparams;
	}


    public static final Creator<ContentActionCondition> CREATOR = new Creator<ContentActionCondition>() {
        @Override
        public ContentActionCondition createFromParcel(Parcel source) {
            return new ContentActionCondition(source);
        }

        @Override
        public ContentActionCondition[] newArray(int size) {
            return new ContentActionCondition[size];
        }
    };

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        super.writeToParcel(dest, flags);
        dest.writeInt(this.action == null ? -1 : this.action.ordinal());
        dest.writeValue(this.length);
        dest.writeValue(this.multiplier);
    }

    public ContentActionCondition(Parcel in) {
        super(in);
        int tmpAction = in.readInt();
        this.action = tmpAction == -1 ? null : ContentAction.values()[tmpAction];
        this.length = (Integer)in.readValue(Integer.class.getClassLoader());
        this.multiplier = (Integer)in.readValue(Integer.class.getClassLoader());
    }
}

