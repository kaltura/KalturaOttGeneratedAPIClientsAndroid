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

/**
 * Language details
 */
@SuppressWarnings("serial")
@MultiRequestBuilder.Tokenizer(Language.Tokenizer.class)
public class Language extends ObjectBase {
	
	public interface Tokenizer extends ObjectBase.Tokenizer {
		String id();
		String name();
		String systemName();
		String code();
		String direction();
		String isDefault();
	}

	/**
	 * Identifier
	 */
	private Integer id;
	/**
	 * Language name
	 */
	private String name;
	/**
	 * Language system name
	 */
	private String systemName;
	/**
	 * Language code
	 */
	private String code;
	/**
	 * Language direction (LTR/RTL)
	 */
	private String direction;
	/**
	 * Is the default language of the account
	 */
	private Boolean isDefault;

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

	// systemName:
	public String getSystemName(){
		return this.systemName;
	}
	public void setSystemName(String systemName){
		this.systemName = systemName;
	}

	public void systemName(String multirequestToken){
		setToken("systemName", multirequestToken);
	}

	// code:
	public String getCode(){
		return this.code;
	}
	public void setCode(String code){
		this.code = code;
	}

	public void code(String multirequestToken){
		setToken("code", multirequestToken);
	}

	// direction:
	public String getDirection(){
		return this.direction;
	}
	public void setDirection(String direction){
		this.direction = direction;
	}

	public void direction(String multirequestToken){
		setToken("direction", multirequestToken);
	}

	// isDefault:
	public Boolean getIsDefault(){
		return this.isDefault;
	}
	public void setIsDefault(Boolean isDefault){
		this.isDefault = isDefault;
	}

	public void isDefault(String multirequestToken){
		setToken("isDefault", multirequestToken);
	}


	public Language() {
		super();
	}

	public Language(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		id = GsonParser.parseInt(jsonObject.get("id"));
		name = GsonParser.parseString(jsonObject.get("name"));
		systemName = GsonParser.parseString(jsonObject.get("systemName"));
		code = GsonParser.parseString(jsonObject.get("code"));
		direction = GsonParser.parseString(jsonObject.get("direction"));
		isDefault = GsonParser.parseBoolean(jsonObject.get("isDefault"));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaLanguage");
		kparams.add("id", this.id);
		kparams.add("name", this.name);
		kparams.add("systemName", this.systemName);
		kparams.add("code", this.code);
		kparams.add("direction", this.direction);
		kparams.add("isDefault", this.isDefault);
		return kparams;
	}


    public static final Creator<Language> CREATOR = new Creator<Language>() {
        @Override
        public Language createFromParcel(Parcel source) {
            return new Language(source);
        }

        @Override
        public Language[] newArray(int size) {
            return new Language[size];
        }
    };

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        super.writeToParcel(dest, flags);
        dest.writeValue(this.id);
        dest.writeString(this.name);
        dest.writeString(this.systemName);
        dest.writeString(this.code);
        dest.writeString(this.direction);
        dest.writeValue(this.isDefault);
    }

    public Language(Parcel in) {
        super(in);
        this.id = (Integer)in.readValue(Integer.class.getClassLoader());
        this.name = in.readString();
        this.systemName = in.readString();
        this.code = in.readString();
        this.direction = in.readString();
        this.isDefault = (Boolean)in.readValue(Boolean.class.getClassLoader());
    }
}

