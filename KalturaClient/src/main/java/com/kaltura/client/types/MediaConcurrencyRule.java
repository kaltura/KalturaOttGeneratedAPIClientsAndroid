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
import com.kaltura.client.enums.ConcurrencyLimitationType;
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
 * Media concurrency rule
 */
@SuppressWarnings("serial")
@MultiRequestBuilder.Tokenizer(MediaConcurrencyRule.Tokenizer.class)
public class MediaConcurrencyRule extends ObjectBase {
	
	public interface Tokenizer extends ObjectBase.Tokenizer {
		String id();
		String name();
		String concurrencyLimitationType();
		String limitation();
	}

	/**
	 * Media concurrency rule  identifier
	 */
	private String id;
	/**
	 * Media concurrency rule  name
	 */
	private String name;
	/**
	 * Concurrency limitation type
	 */
	private ConcurrencyLimitationType concurrencyLimitationType;
	/**
	 * Limitation
	 */
	private Integer limitation;

	// id:
	public String getId(){
		return this.id;
	}
	public void setId(String id){
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

	// concurrencyLimitationType:
	public ConcurrencyLimitationType getConcurrencyLimitationType(){
		return this.concurrencyLimitationType;
	}
	public void setConcurrencyLimitationType(ConcurrencyLimitationType concurrencyLimitationType){
		this.concurrencyLimitationType = concurrencyLimitationType;
	}

	public void concurrencyLimitationType(String multirequestToken){
		setToken("concurrencyLimitationType", multirequestToken);
	}

	// limitation:
	public Integer getLimitation(){
		return this.limitation;
	}
	public void setLimitation(Integer limitation){
		this.limitation = limitation;
	}

	public void limitation(String multirequestToken){
		setToken("limitation", multirequestToken);
	}


	public MediaConcurrencyRule() {
		super();
	}

	public MediaConcurrencyRule(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		id = GsonParser.parseString(jsonObject.get("id"));
		name = GsonParser.parseString(jsonObject.get("name"));
		concurrencyLimitationType = ConcurrencyLimitationType.get(GsonParser.parseString(jsonObject.get("concurrencyLimitationType")));
		limitation = GsonParser.parseInt(jsonObject.get("limitation"));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaMediaConcurrencyRule");
		kparams.add("id", this.id);
		kparams.add("name", this.name);
		kparams.add("concurrencyLimitationType", this.concurrencyLimitationType);
		kparams.add("limitation", this.limitation);
		return kparams;
	}


    public static final Creator<MediaConcurrencyRule> CREATOR = new Creator<MediaConcurrencyRule>() {
        @Override
        public MediaConcurrencyRule createFromParcel(Parcel source) {
            return new MediaConcurrencyRule(source);
        }

        @Override
        public MediaConcurrencyRule[] newArray(int size) {
            return new MediaConcurrencyRule[size];
        }
    };

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        super.writeToParcel(dest, flags);
        dest.writeString(this.id);
        dest.writeString(this.name);
        dest.writeInt(this.concurrencyLimitationType == null ? -1 : this.concurrencyLimitationType.ordinal());
        dest.writeValue(this.limitation);
    }

    public MediaConcurrencyRule(Parcel in) {
        super(in);
        this.id = in.readString();
        this.name = in.readString();
        int tmpConcurrencyLimitationType = in.readInt();
        this.concurrencyLimitationType = tmpConcurrencyLimitationType == -1 ? null : ConcurrencyLimitationType.values()[tmpConcurrencyLimitationType];
        this.limitation = (Integer)in.readValue(Integer.class.getClassLoader());
    }
}
