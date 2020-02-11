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

/**
 * Time offset action
 */
@SuppressWarnings("serial")
@MultiRequestBuilder.Tokenizer(TimeOffsetRuleAction.Tokenizer.class)
public abstract class TimeOffsetRuleAction extends AssetRuleAction {
	
	public interface Tokenizer extends AssetRuleAction.Tokenizer {
		String offset();
		String timeZone();
	}

	/**
	 * Offset in seconds
	 */
	private Integer offset;
	/**
	 * Indicates whether to add time zone offset to the time
	 */
	private Boolean timeZone;

	// offset:
	public Integer getOffset(){
		return this.offset;
	}
	public void setOffset(Integer offset){
		this.offset = offset;
	}

	public void offset(String multirequestToken){
		setToken("offset", multirequestToken);
	}

	// timeZone:
	public Boolean getTimeZone(){
		return this.timeZone;
	}
	public void setTimeZone(Boolean timeZone){
		this.timeZone = timeZone;
	}

	public void timeZone(String multirequestToken){
		setToken("timeZone", multirequestToken);
	}


	public TimeOffsetRuleAction() {
		super();
	}

	public TimeOffsetRuleAction(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		offset = GsonParser.parseInt(jsonObject.get("offset"));
		timeZone = GsonParser.parseBoolean(jsonObject.get("timeZone"));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaTimeOffsetRuleAction");
		kparams.add("offset", this.offset);
		kparams.add("timeZone", this.timeZone);
		return kparams;
	}


    @Override
    public void writeToParcel(Parcel dest, int flags) {
        super.writeToParcel(dest, flags);
        dest.writeValue(this.offset);
        dest.writeValue(this.timeZone);
    }

    public TimeOffsetRuleAction(Parcel in) {
        super(in);
        this.offset = (Integer)in.readValue(Integer.class.getClassLoader());
        this.timeZone = (Boolean)in.readValue(Boolean.class.getClassLoader());
    }
}

