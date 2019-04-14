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
import com.kaltura.client.enums.MetaDataType;
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

/**
 * Asset meta
 */
@SuppressWarnings("serial")
@MultiRequestBuilder.Tokenizer(Meta.Tokenizer.class)
public class Meta extends ObjectBase {
	
	public interface Tokenizer extends ObjectBase.Tokenizer {
		String id();
		String name();
		RequestBuilder.ListTokenizer<TranslationToken.Tokenizer> multilingualName();
		String systemName();
		String dataType();
		String multipleValue();
		String isProtected();
		String helpText();
		String features();
		String parentId();
		String createDate();
		String updateDate();
	}

	/**
	 * Meta id
	 */
	private String id;
	/**
	 * Meta name for the partner
	 */
	private String name;
	/**
	 * Meta name for the partner
	 */
	private List<TranslationToken> multilingualName;
	/**
	 * Meta system name for the partner
	 */
	private String systemName;
	/**
	 * Meta data type
	 */
	private MetaDataType dataType;
	/**
	 * Does the meta contain multiple values
	 */
	private Boolean multipleValue;
	/**
	 * Is the meta protected by the system
	 */
	private Boolean isProtected;
	/**
	 * The help text of the meta to be displayed on the UI.
	 */
	private String helpText;
	/**
	 * List of supported features
	 */
	private String features;
	/**
	 * Parent meta id
	 */
	private String parentId;
	/**
	 * Specifies when was the meta created. Date and time represented as epoch.
	 */
	private Long createDate;
	/**
	 * Specifies when was the meta last updated. Date and time represented as epoch.
	 */
	private Long updateDate;

	// id:
	public String getId(){
		return this.id;
	}
	// name:
	public String getName(){
		return this.name;
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

	// dataType:
	public MetaDataType getDataType(){
		return this.dataType;
	}
	public void setDataType(MetaDataType dataType){
		this.dataType = dataType;
	}

	public void dataType(String multirequestToken){
		setToken("dataType", multirequestToken);
	}

	// multipleValue:
	public Boolean getMultipleValue(){
		return this.multipleValue;
	}
	public void setMultipleValue(Boolean multipleValue){
		this.multipleValue = multipleValue;
	}

	public void multipleValue(String multirequestToken){
		setToken("multipleValue", multirequestToken);
	}

	// isProtected:
	public Boolean getIsProtected(){
		return this.isProtected;
	}
	public void setIsProtected(Boolean isProtected){
		this.isProtected = isProtected;
	}

	public void isProtected(String multirequestToken){
		setToken("isProtected", multirequestToken);
	}

	// helpText:
	public String getHelpText(){
		return this.helpText;
	}
	public void setHelpText(String helpText){
		this.helpText = helpText;
	}

	public void helpText(String multirequestToken){
		setToken("helpText", multirequestToken);
	}

	// features:
	public String getFeatures(){
		return this.features;
	}
	public void setFeatures(String features){
		this.features = features;
	}

	public void features(String multirequestToken){
		setToken("features", multirequestToken);
	}

	// parentId:
	public String getParentId(){
		return this.parentId;
	}
	public void setParentId(String parentId){
		this.parentId = parentId;
	}

	public void parentId(String multirequestToken){
		setToken("parentId", multirequestToken);
	}

	// createDate:
	public Long getCreateDate(){
		return this.createDate;
	}
	// updateDate:
	public Long getUpdateDate(){
		return this.updateDate;
	}

	public Meta() {
		super();
	}

	public Meta(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		id = GsonParser.parseString(jsonObject.get("id"));
		name = GsonParser.parseString(jsonObject.get("name"));
		multilingualName = GsonParser.parseArray(jsonObject.getAsJsonArray("multilingualName"), TranslationToken.class);
		systemName = GsonParser.parseString(jsonObject.get("systemName"));
		dataType = MetaDataType.get(GsonParser.parseString(jsonObject.get("dataType")));
		multipleValue = GsonParser.parseBoolean(jsonObject.get("multipleValue"));
		isProtected = GsonParser.parseBoolean(jsonObject.get("isProtected"));
		helpText = GsonParser.parseString(jsonObject.get("helpText"));
		features = GsonParser.parseString(jsonObject.get("features"));
		parentId = GsonParser.parseString(jsonObject.get("parentId"));
		createDate = GsonParser.parseLong(jsonObject.get("createDate"));
		updateDate = GsonParser.parseLong(jsonObject.get("updateDate"));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaMeta");
		kparams.add("multilingualName", this.multilingualName);
		kparams.add("systemName", this.systemName);
		kparams.add("dataType", this.dataType);
		kparams.add("multipleValue", this.multipleValue);
		kparams.add("isProtected", this.isProtected);
		kparams.add("helpText", this.helpText);
		kparams.add("features", this.features);
		kparams.add("parentId", this.parentId);
		return kparams;
	}


    public static final Creator<Meta> CREATOR = new Creator<Meta>() {
        @Override
        public Meta createFromParcel(Parcel source) {
            return new Meta(source);
        }

        @Override
        public Meta[] newArray(int size) {
            return new Meta[size];
        }
    };

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        super.writeToParcel(dest, flags);
        dest.writeString(this.id);
        dest.writeString(this.name);
        if(this.multilingualName != null) {
            dest.writeInt(this.multilingualName.size());
            dest.writeList(this.multilingualName);
        } else {
            dest.writeInt(-1);
        }
        dest.writeString(this.systemName);
        dest.writeInt(this.dataType == null ? -1 : this.dataType.ordinal());
        dest.writeValue(this.multipleValue);
        dest.writeValue(this.isProtected);
        dest.writeString(this.helpText);
        dest.writeString(this.features);
        dest.writeString(this.parentId);
        dest.writeValue(this.createDate);
        dest.writeValue(this.updateDate);
    }

    public Meta(Parcel in) {
        super(in);
        this.id = in.readString();
        this.name = in.readString();
        int multilingualNameSize = in.readInt();
        if( multilingualNameSize > -1) {
            this.multilingualName = new ArrayList<>();
            in.readList(this.multilingualName, TranslationToken.class.getClassLoader());
        }
        this.systemName = in.readString();
        int tmpDataType = in.readInt();
        this.dataType = tmpDataType == -1 ? null : MetaDataType.values()[tmpDataType];
        this.multipleValue = (Boolean)in.readValue(Boolean.class.getClassLoader());
        this.isProtected = (Boolean)in.readValue(Boolean.class.getClassLoader());
        this.helpText = in.readString();
        this.features = in.readString();
        this.parentId = in.readString();
        this.createDate = (Long)in.readValue(Long.class.getClassLoader());
        this.updateDate = (Long)in.readValue(Long.class.getClassLoader());
    }
}

