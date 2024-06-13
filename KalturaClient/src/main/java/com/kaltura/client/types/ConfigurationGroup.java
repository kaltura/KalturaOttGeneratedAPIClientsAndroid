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
import com.kaltura.client.utils.request.RequestBuilder;
import java.util.ArrayList;
import java.util.List;

/**
 * This class was generated using exec.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

@SuppressWarnings("serial")
@MultiRequestBuilder.Tokenizer(ConfigurationGroup.Tokenizer.class)
public class ConfigurationGroup extends ObjectBase {
	
	public interface Tokenizer extends ObjectBase.Tokenizer {
		String id();
		String name();
		String partnerId();
		String isDefault();
		RequestBuilder.ListTokenizer<StringValue.Tokenizer> tags();
		String numberOfDevices();
		RequestBuilder.ListTokenizer<ConfigurationIdentifier.Tokenizer> configurationIdentifiers();
	}

	/**
	 * Configuration group identifier
	 */
	private String id;
	/**
	 * Configuration group name
	 */
	private String name;
	/**
	 * Partner id
	 */
	private Integer partnerId;
	/**
	 * Is default
	 */
	private Boolean isDefault;
	/**
	 * tags
	 */
	private List<StringValue> tags;
	/**
	 * Number of devices
	 */
	private Long numberOfDevices;
	/**
	 * Configuration identifiers
	 */
	private List<ConfigurationIdentifier> configurationIdentifiers;

	// id:
	public String getId(){
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

	// partnerId:
	public Integer getPartnerId(){
		return this.partnerId;
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

	// tags:
	public List<StringValue> getTags(){
		return this.tags;
	}
	// numberOfDevices:
	public Long getNumberOfDevices(){
		return this.numberOfDevices;
	}
	// configurationIdentifiers:
	public List<ConfigurationIdentifier> getConfigurationIdentifiers(){
		return this.configurationIdentifiers;
	}

	public ConfigurationGroup() {
		super();
	}

	public ConfigurationGroup(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		id = GsonParser.parseString(jsonObject.get("id"));
		name = GsonParser.parseString(jsonObject.get("name"));
		partnerId = GsonParser.parseInt(jsonObject.get("partnerId"));
		isDefault = GsonParser.parseBoolean(jsonObject.get("isDefault"));
		tags = GsonParser.parseArray(jsonObject.getAsJsonArray("tags"), StringValue.class);
		numberOfDevices = GsonParser.parseLong(jsonObject.get("numberOfDevices"));
		configurationIdentifiers = GsonParser.parseArray(jsonObject.getAsJsonArray("configurationIdentifiers"), ConfigurationIdentifier.class);

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaConfigurationGroup");
		kparams.add("name", this.name);
		kparams.add("isDefault", this.isDefault);
		return kparams;
	}


    public static final Creator<ConfigurationGroup> CREATOR = new Creator<ConfigurationGroup>() {
        @Override
        public ConfigurationGroup createFromParcel(Parcel source) {
            return new ConfigurationGroup(source);
        }

        @Override
        public ConfigurationGroup[] newArray(int size) {
            return new ConfigurationGroup[size];
        }
    };

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        super.writeToParcel(dest, flags);
        dest.writeString(this.id);
        dest.writeString(this.name);
        dest.writeValue(this.partnerId);
        dest.writeValue(this.isDefault);
        if(this.tags != null) {
            dest.writeInt(this.tags.size());
            dest.writeList(this.tags);
        } else {
            dest.writeInt(-1);
        }
        dest.writeValue(this.numberOfDevices);
        if(this.configurationIdentifiers != null) {
            dest.writeInt(this.configurationIdentifiers.size());
            dest.writeList(this.configurationIdentifiers);
        } else {
            dest.writeInt(-1);
        }
    }

    public ConfigurationGroup(Parcel in) {
        super(in);
        this.id = in.readString();
        this.name = in.readString();
        this.partnerId = (Integer)in.readValue(Integer.class.getClassLoader());
        this.isDefault = (Boolean)in.readValue(Boolean.class.getClassLoader());
        int tagsSize = in.readInt();
        if( tagsSize > -1) {
            this.tags = new ArrayList<>();
            in.readList(this.tags, StringValue.class.getClassLoader());
        }
        this.numberOfDevices = (Long)in.readValue(Long.class.getClassLoader());
        int configurationIdentifiersSize = in.readInt();
        if( configurationIdentifiersSize > -1) {
            this.configurationIdentifiers = new ArrayList<>();
            in.readList(this.configurationIdentifiers, ConfigurationIdentifier.class.getClassLoader());
        }
    }
}

