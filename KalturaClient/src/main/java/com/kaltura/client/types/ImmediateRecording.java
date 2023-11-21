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
@MultiRequestBuilder.Tokenizer(ImmediateRecording.Tokenizer.class)
public class ImmediateRecording extends Recording {
	
	public interface Tokenizer extends Recording.Tokenizer {
		String endPadding();
		String absoluteStart();
		String absoluteEnd();
	}

	/**
	 * Household specific end padding of the recording
	 */
	private Integer endPadding;
	/**
	 * Household absolute start time of the immediate recording
	 */
	private Long absoluteStart;
	/**
	 * Household absolute end time of the immediate recording, empty if till end of
	  program
	 */
	private Long absoluteEnd;

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

	// absoluteStart:
	public Long getAbsoluteStart(){
		return this.absoluteStart;
	}
	// absoluteEnd:
	public Long getAbsoluteEnd(){
		return this.absoluteEnd;
	}

	public ImmediateRecording() {
		super();
	}

	public ImmediateRecording(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		endPadding = GsonParser.parseInt(jsonObject.get("endPadding"));
		absoluteStart = GsonParser.parseLong(jsonObject.get("absoluteStart"));
		absoluteEnd = GsonParser.parseLong(jsonObject.get("absoluteEnd"));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaImmediateRecording");
		kparams.add("endPadding", this.endPadding);
		return kparams;
	}


    public static final Creator<ImmediateRecording> CREATOR = new Creator<ImmediateRecording>() {
        @Override
        public ImmediateRecording createFromParcel(Parcel source) {
            return new ImmediateRecording(source);
        }

        @Override
        public ImmediateRecording[] newArray(int size) {
            return new ImmediateRecording[size];
        }
    };

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        super.writeToParcel(dest, flags);
        dest.writeValue(this.endPadding);
        dest.writeValue(this.absoluteStart);
        dest.writeValue(this.absoluteEnd);
    }

    public ImmediateRecording(Parcel in) {
        super(in);
        this.endPadding = (Integer)in.readValue(Integer.class.getClassLoader());
        this.absoluteStart = (Long)in.readValue(Long.class.getClassLoader());
        this.absoluteEnd = (Long)in.readValue(Long.class.getClassLoader());
    }
}

