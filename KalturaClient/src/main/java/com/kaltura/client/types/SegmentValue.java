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

/**
 * Specific segment value
 */
@SuppressWarnings("serial")
@MultiRequestBuilder.Tokenizer(SegmentValue.Tokenizer.class)
public class SegmentValue extends ObjectBase {
	
	public interface Tokenizer extends ObjectBase.Tokenizer {
		String id();
		String systematicName();
		String name();
		String value();
	}

	/**
	 * Id of segment
	 */
	private Long id;
	/**
	 * Systematic name of segment
	 */
	private String systematicName;
	/**
	 * Name of segment
	 */
	private String name;
	/**
	 * The value of the segment
	 */
	private String value;

	// id:
	public Long getId(){
		return this.id;
	}
	// systematicName:
	public String getSystematicName(){
		return this.systematicName;
	}
	public void setSystematicName(String systematicName){
		this.systematicName = systematicName;
	}

	public void systematicName(String multirequestToken){
		setToken("systematicName", multirequestToken);
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

	// value:
	public String getValue(){
		return this.value;
	}
	public void setValue(String value){
		this.value = value;
	}

	public void value(String multirequestToken){
		setToken("value", multirequestToken);
	}


	public SegmentValue() {
		super();
	}

	public SegmentValue(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		id = GsonParser.parseLong(jsonObject.get("id"));
		systematicName = GsonParser.parseString(jsonObject.get("systematicName"));
		name = GsonParser.parseString(jsonObject.get("name"));
		value = GsonParser.parseString(jsonObject.get("value"));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaSegmentValue");
		kparams.add("systematicName", this.systematicName);
		kparams.add("name", this.name);
		kparams.add("value", this.value);
		return kparams;
	}


    public static final Creator<SegmentValue> CREATOR = new Creator<SegmentValue>() {
        @Override
        public SegmentValue createFromParcel(Parcel source) {
            return new SegmentValue(source);
        }

        @Override
        public SegmentValue[] newArray(int size) {
            return new SegmentValue[size];
        }
    };

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        super.writeToParcel(dest, flags);
        dest.writeValue(this.id);
        dest.writeString(this.systematicName);
        dest.writeString(this.name);
        dest.writeString(this.value);
    }

    public SegmentValue(Parcel in) {
        super(in);
        this.id = (Long)in.readValue(Long.class.getClassLoader());
        this.systematicName = in.readString();
        this.name = in.readString();
        this.value = in.readString();
    }
}

