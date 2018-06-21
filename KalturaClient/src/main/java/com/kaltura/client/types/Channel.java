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
import com.kaltura.client.types.ChannelOrder;
import com.kaltura.client.types.ObjectBase;
import com.kaltura.client.utils.GsonParser;
import com.kaltura.client.utils.request.MultiRequestBuilder;
import com.kaltura.client.utils.request.RequestBuilder;
import java.util.ArrayList;
import java.util.List;

/**
 * This class was generated using clients-generator\exec.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

/**
 * Channel details
 */
@SuppressWarnings("serial")
@MultiRequestBuilder.Tokenizer(Channel.Tokenizer.class)
public class Channel extends ObjectBase {
	
	public interface Tokenizer extends ObjectBase.Tokenizer {
		String id();
		String name();
		RequestBuilder.ListTokenizer<TranslationToken.Tokenizer> multilingualName();
		String systemName();
		String description();
		RequestBuilder.ListTokenizer<TranslationToken.Tokenizer> multilingualDescription();
		String isActive();
		ChannelOrder.Tokenizer orderBy();
		String createDate();
		String updateDate();
	}

	/**
	 * Unique identifier for the channel
	 */
	private Long id;
	/**
	 * Channel name
	 */
	private String name;
	/**
	 * Channel name
	 */
	private List<TranslationToken> multilingualName;
	/**
	 * Channel system name
	 */
	private String systemName;
	/**
	 * Channel description
	 */
	private String description;
	/**
	 * Channel description
	 */
	private List<TranslationToken> multilingualDescription;
	/**
	 * active status
	 */
	private Boolean isActive;
	/**
	 * Channel order by
	 */
	private ChannelOrder orderBy;
	/**
	 * Specifies when was the Channel was created. Date and time represented as epoch.
	 */
	private Long createDate;
	/**
	 * Specifies when was the Channel last updated. Date and time represented as epoch.
	 */
	private Long updateDate;

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

	// multilingualName:
	public List<TranslationToken> getMultilingualName(){
		return this.multilingualName;
	}
	public void setMultilingualName(List<TranslationToken> multilingualName){
		this.multilingualName = multilingualName;
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

	// description:
	public String getDescription(){
		return this.description;
	}
	public void setDescription(String description){
		this.description = description;
	}

	public void description(String multirequestToken){
		setToken("description", multirequestToken);
	}

	// multilingualDescription:
	public List<TranslationToken> getMultilingualDescription(){
		return this.multilingualDescription;
	}
	public void setMultilingualDescription(List<TranslationToken> multilingualDescription){
		this.multilingualDescription = multilingualDescription;
	}

	// isActive:
	public Boolean getIsActive(){
		return this.isActive;
	}
	public void setIsActive(Boolean isActive){
		this.isActive = isActive;
	}

	public void isActive(String multirequestToken){
		setToken("isActive", multirequestToken);
	}

	// orderBy:
	public ChannelOrder getOrderBy(){
		return this.orderBy;
	}
	public void setOrderBy(ChannelOrder orderBy){
		this.orderBy = orderBy;
	}

	// createDate:
	public Long getCreateDate(){
		return this.createDate;
	}
	// updateDate:
	public Long getUpdateDate(){
		return this.updateDate;
	}

	public Channel() {
		super();
	}

	public Channel(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		id = GsonParser.parseLong(jsonObject.get("id"));
		name = GsonParser.parseString(jsonObject.get("name"));
		multilingualName = GsonParser.parseArray(jsonObject.getAsJsonArray("multilingualName"), TranslationToken.class);
		systemName = GsonParser.parseString(jsonObject.get("systemName"));
		description = GsonParser.parseString(jsonObject.get("description"));
		multilingualDescription = GsonParser.parseArray(jsonObject.getAsJsonArray("multilingualDescription"), TranslationToken.class);
		isActive = GsonParser.parseBoolean(jsonObject.get("isActive"));
		orderBy = GsonParser.parseObject(jsonObject.getAsJsonObject("orderBy"), ChannelOrder.class);
		createDate = GsonParser.parseLong(jsonObject.get("createDate"));
		updateDate = GsonParser.parseLong(jsonObject.get("updateDate"));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaChannel");
		kparams.add("name", this.name);
		kparams.add("multilingualName", this.multilingualName);
		kparams.add("systemName", this.systemName);
		kparams.add("description", this.description);
		kparams.add("multilingualDescription", this.multilingualDescription);
		kparams.add("isActive", this.isActive);
		kparams.add("orderBy", this.orderBy);
		return kparams;
	}


    public static final Creator<Channel> CREATOR = new Creator<Channel>() {
        @Override
        public Channel createFromParcel(Parcel source) {
            return new Channel(source);
        }

        @Override
        public Channel[] newArray(int size) {
            return new Channel[size];
        }
    };

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        super.writeToParcel(dest, flags);
        dest.writeValue(this.id);
        dest.writeString(this.name);
        if(this.multilingualName != null) {
            dest.writeInt(this.multilingualName.size());
            dest.writeList(this.multilingualName);
        } else {
            dest.writeInt(-1);
        }
        dest.writeString(this.systemName);
        dest.writeString(this.description);
        if(this.multilingualDescription != null) {
            dest.writeInt(this.multilingualDescription.size());
            dest.writeList(this.multilingualDescription);
        } else {
            dest.writeInt(-1);
        }
        dest.writeValue(this.isActive);
        dest.writeParcelable(this.orderBy, flags);
        dest.writeValue(this.createDate);
        dest.writeValue(this.updateDate);
    }

    public Channel(Parcel in) {
        super(in);
        this.id = (Long)in.readValue(Long.class.getClassLoader());
        this.name = in.readString();
        int multilingualNameSize = in.readInt();
        if( multilingualNameSize > -1) {
            this.multilingualName = new ArrayList<>();
            in.readList(this.multilingualName, TranslationToken.class.getClassLoader());
        }
        this.systemName = in.readString();
        this.description = in.readString();
        int multilingualDescriptionSize = in.readInt();
        if( multilingualDescriptionSize > -1) {
            this.multilingualDescription = new ArrayList<>();
            in.readList(this.multilingualDescription, TranslationToken.class.getClassLoader());
        }
        this.isActive = (Boolean)in.readValue(Boolean.class.getClassLoader());
        this.orderBy = in.readParcelable(ChannelOrder.class.getClassLoader());
        this.createDate = (Long)in.readValue(Long.class.getClassLoader());
        this.updateDate = (Long)in.readValue(Long.class.getClassLoader());
    }
}

