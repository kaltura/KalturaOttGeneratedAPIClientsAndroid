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
@MultiRequestBuilder.Tokenizer(PersonalList.Tokenizer.class)
public class PersonalList extends ObjectBase {
	
	public interface Tokenizer extends ObjectBase.Tokenizer {
		String id();
		String name();
		String createDate();
		String ksql();
		String partnerListType();
	}

	/**
	 * Id
	 */
	private Long id;
	/**
	 * Name
	 */
	private String name;
	/**
	 * Create Date
	 */
	private Long createDate;
	/**
	 * Ksql
	 */
	private String ksql;
	/**
	 * Partner List Type (optional)
	 */
	private Integer partnerListType;

	// id:
	public Long getId(){
		return this.id;
	}
	public void setId(Long id){
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

	// createDate:
	public Long getCreateDate(){
		return this.createDate;
	}
	public void setCreateDate(Long createDate){
		this.createDate = createDate;
	}

	public void createDate(String multirequestToken){
		setToken("createDate", multirequestToken);
	}

	// ksql:
	public String getKsql(){
		return this.ksql;
	}
	public void setKsql(String ksql){
		this.ksql = ksql;
	}

	public void ksql(String multirequestToken){
		setToken("ksql", multirequestToken);
	}

	// partnerListType:
	public Integer getPartnerListType(){
		return this.partnerListType;
	}
	public void setPartnerListType(Integer partnerListType){
		this.partnerListType = partnerListType;
	}

	public void partnerListType(String multirequestToken){
		setToken("partnerListType", multirequestToken);
	}


	public PersonalList() {
		super();
	}

	public PersonalList(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		id = GsonParser.parseLong(jsonObject.get("id"));
		name = GsonParser.parseString(jsonObject.get("name"));
		createDate = GsonParser.parseLong(jsonObject.get("createDate"));
		ksql = GsonParser.parseString(jsonObject.get("ksql"));
		partnerListType = GsonParser.parseInt(jsonObject.get("partnerListType"));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaPersonalList");
		kparams.add("name", this.name);
		kparams.add("ksql", this.ksql);
		kparams.add("partnerListType", this.partnerListType);
		return kparams;
	}


    public static final Creator<PersonalList> CREATOR = new Creator<PersonalList>() {
        @Override
        public PersonalList createFromParcel(Parcel source) {
            return new PersonalList(source);
        }

        @Override
        public PersonalList[] newArray(int size) {
            return new PersonalList[size];
        }
    };

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        super.writeToParcel(dest, flags);
        dest.writeValue(this.id);
        dest.writeString(this.name);
        dest.writeValue(this.createDate);
        dest.writeString(this.ksql);
        dest.writeValue(this.partnerListType);
    }

    public PersonalList(Parcel in) {
        super(in);
        this.id = (Long)in.readValue(Long.class.getClassLoader());
        this.name = in.readString();
        this.createDate = (Long)in.readValue(Long.class.getClassLoader());
        this.ksql = in.readString();
        this.partnerListType = (Integer)in.readValue(Integer.class.getClassLoader());
    }
}

