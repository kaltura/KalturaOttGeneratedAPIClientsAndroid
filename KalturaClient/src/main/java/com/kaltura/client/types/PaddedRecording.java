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
@MultiRequestBuilder.Tokenizer(PaddedRecording.Tokenizer.class)
public class PaddedRecording extends Recording {
	
	public interface Tokenizer extends Recording.Tokenizer {
		String startPadding();
		String endPadding();
		String startPaddingIsPersonal();
		String endPaddingIsPersonal();
	}

	/**
	 * Household specific start padding of the recording
	 */
	private Integer startPadding;
	/**
	 * Household specific end padding of the recording
	 */
	private Integer endPadding;
	/**
	 * Indicates whether startPadding value is personal padding (counts towards HH
	  quota) or system padding (does not count towards HH quota).
	 */
	private Boolean startPaddingIsPersonal;
	/**
	 * Indicates whether endPadding value is personal padding (counts towards HH quota)
	  or system padding (does not count towards HH quota).
	 */
	private Boolean endPaddingIsPersonal;

	// startPadding:
	public Integer getStartPadding(){
		return this.startPadding;
	}
	public void setStartPadding(Integer startPadding){
		this.startPadding = startPadding;
	}

	public void startPadding(String multirequestToken){
		setToken("startPadding", multirequestToken);
	}

	// endPadding:
	public Integer getEndPadding(){
		return this.endPadding;
	}
	public void setEndPadding(Integer endPadding){
		this.endPadding = endPadding;
	}

	public void endPadding(String multirequestToken){
		setToken("endPadding", multirequestToken);
	}

	// startPaddingIsPersonal:
	public Boolean getStartPaddingIsPersonal(){
		return this.startPaddingIsPersonal;
	}
	// endPaddingIsPersonal:
	public Boolean getEndPaddingIsPersonal(){
		return this.endPaddingIsPersonal;
	}

	public PaddedRecording() {
		super();
	}

	public PaddedRecording(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		startPadding = GsonParser.parseInt(jsonObject.get("startPadding"));
		endPadding = GsonParser.parseInt(jsonObject.get("endPadding"));
		startPaddingIsPersonal = GsonParser.parseBoolean(jsonObject.get("startPaddingIsPersonal"));
		endPaddingIsPersonal = GsonParser.parseBoolean(jsonObject.get("endPaddingIsPersonal"));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaPaddedRecording");
		kparams.add("startPadding", this.startPadding);
		kparams.add("endPadding", this.endPadding);
		return kparams;
	}


    public static final Creator<PaddedRecording> CREATOR = new Creator<PaddedRecording>() {
        @Override
        public PaddedRecording createFromParcel(Parcel source) {
            return new PaddedRecording(source);
        }

        @Override
        public PaddedRecording[] newArray(int size) {
            return new PaddedRecording[size];
        }
    };

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        super.writeToParcel(dest, flags);
        dest.writeValue(this.startPadding);
        dest.writeValue(this.endPadding);
        dest.writeValue(this.startPaddingIsPersonal);
        dest.writeValue(this.endPaddingIsPersonal);
    }

    public PaddedRecording(Parcel in) {
        super(in);
        this.startPadding = (Integer)in.readValue(Integer.class.getClassLoader());
        this.endPadding = (Integer)in.readValue(Integer.class.getClassLoader());
        this.startPaddingIsPersonal = (Boolean)in.readValue(Boolean.class.getClassLoader());
        this.endPaddingIsPersonal = (Boolean)in.readValue(Boolean.class.getClassLoader());
    }
}

