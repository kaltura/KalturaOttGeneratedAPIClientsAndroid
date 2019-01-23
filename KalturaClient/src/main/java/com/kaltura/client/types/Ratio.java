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
// Copyright (C) 2006-2019  Kaltura Inc.
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
 * This class was generated using clients-generator\exec.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

@SuppressWarnings("serial")
@MultiRequestBuilder.Tokenizer(Ratio.Tokenizer.class)
public class Ratio extends ObjectBase {
	
	public interface Tokenizer extends ObjectBase.Tokenizer {
		String id();
		String name();
		String height();
		String width();
		String precisionPrecentage();
	}

	/**
	 * ID
	 */
	private Long id;
	/**
	 * Name
	 */
	private String name;
	/**
	 * Height
	 */
	private Integer height;
	/**
	 * Width
	 */
	private Integer width;
	/**
	 * Accepted error margin precentage of an image uploaded for this ratio            
	   0 - no validation, everything accepted
	 */
	private Integer precisionPrecentage;

	// id:
	public Long getId(){
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

	// height:
	public Integer getHeight(){
		return this.height;
	}
	public void setHeight(Integer height){
		this.height = height;
	}

	public void height(String multirequestToken){
		setToken("height", multirequestToken);
	}

	// width:
	public Integer getWidth(){
		return this.width;
	}
	public void setWidth(Integer width){
		this.width = width;
	}

	public void width(String multirequestToken){
		setToken("width", multirequestToken);
	}

	// precisionPrecentage:
	public Integer getPrecisionPrecentage(){
		return this.precisionPrecentage;
	}
	public void setPrecisionPrecentage(Integer precisionPrecentage){
		this.precisionPrecentage = precisionPrecentage;
	}

	public void precisionPrecentage(String multirequestToken){
		setToken("precisionPrecentage", multirequestToken);
	}


	public Ratio() {
		super();
	}

	public Ratio(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		id = GsonParser.parseLong(jsonObject.get("id"));
		name = GsonParser.parseString(jsonObject.get("name"));
		height = GsonParser.parseInt(jsonObject.get("height"));
		width = GsonParser.parseInt(jsonObject.get("width"));
		precisionPrecentage = GsonParser.parseInt(jsonObject.get("precisionPrecentage"));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaRatio");
		kparams.add("name", this.name);
		kparams.add("height", this.height);
		kparams.add("width", this.width);
		kparams.add("precisionPrecentage", this.precisionPrecentage);
		return kparams;
	}


    public static final Creator<Ratio> CREATOR = new Creator<Ratio>() {
        @Override
        public Ratio createFromParcel(Parcel source) {
            return new Ratio(source);
        }

        @Override
        public Ratio[] newArray(int size) {
            return new Ratio[size];
        }
    };

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        super.writeToParcel(dest, flags);
        dest.writeValue(this.id);
        dest.writeString(this.name);
        dest.writeValue(this.height);
        dest.writeValue(this.width);
        dest.writeValue(this.precisionPrecentage);
    }

    public Ratio(Parcel in) {
        super(in);
        this.id = (Long)in.readValue(Long.class.getClassLoader());
        this.name = in.readString();
        this.height = (Integer)in.readValue(Integer.class.getClassLoader());
        this.width = (Integer)in.readValue(Integer.class.getClassLoader());
        this.precisionPrecentage = (Integer)in.readValue(Integer.class.getClassLoader());
    }
}

