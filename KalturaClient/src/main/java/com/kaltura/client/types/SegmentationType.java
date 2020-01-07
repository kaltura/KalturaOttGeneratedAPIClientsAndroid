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
import com.kaltura.client.types.BaseSegmentValue;
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
 * Segmentation type - defines at least one segment
 */
@SuppressWarnings("serial")
@MultiRequestBuilder.Tokenizer(SegmentationType.Tokenizer.class)
public class SegmentationType extends ObjectBase {
	
	public interface Tokenizer extends ObjectBase.Tokenizer {
		String id();
		String name();
		String description();
		RequestBuilder.ListTokenizer<BaseSegmentCondition.Tokenizer> conditions();
		RequestBuilder.ListTokenizer<BaseSegmentAction.Tokenizer> actions();
		BaseSegmentValue.Tokenizer value();
		String createDate();
		String version();
	}

	/**
	 * Id of segmentation type
	 */
	private Long id;
	/**
	 * Name of segmentation type
	 */
	private String name;
	/**
	 * Description of segmentation type
	 */
	private String description;
	/**
	 * Segmentation conditions - can be empty
	 */
	private List<BaseSegmentCondition> conditions;
	/**
	 * Segmentation conditions - can be empty
	 */
	private List<BaseSegmentAction> actions;
	/**
	 * Segmentation values - can be empty (so only one segment will be created)
	 */
	private BaseSegmentValue value;
	/**
	 * Create date of segmentation type
	 */
	private Long createDate;
	/**
	 * Segmentation type version
	 */
	private Long version;

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

	// conditions:
	public List<BaseSegmentCondition> getConditions(){
		return this.conditions;
	}
	public void setConditions(List<BaseSegmentCondition> conditions){
		this.conditions = conditions;
	}

	// actions:
	public List<BaseSegmentAction> getActions(){
		return this.actions;
	}
	public void setActions(List<BaseSegmentAction> actions){
		this.actions = actions;
	}

	// value:
	public BaseSegmentValue getValue(){
		return this.value;
	}
	public void setValue(BaseSegmentValue value){
		this.value = value;
	}

	// createDate:
	public Long getCreateDate(){
		return this.createDate;
	}
	// version:
	public Long getVersion(){
		return this.version;
	}

	public SegmentationType() {
		super();
	}

	public SegmentationType(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		id = GsonParser.parseLong(jsonObject.get("id"));
		name = GsonParser.parseString(jsonObject.get("name"));
		description = GsonParser.parseString(jsonObject.get("description"));
		conditions = GsonParser.parseArray(jsonObject.getAsJsonArray("conditions"), BaseSegmentCondition.class);
		actions = GsonParser.parseArray(jsonObject.getAsJsonArray("actions"), BaseSegmentAction.class);
		value = GsonParser.parseObject(jsonObject.getAsJsonObject("value"), BaseSegmentValue.class);
		createDate = GsonParser.parseLong(jsonObject.get("createDate"));
		version = GsonParser.parseLong(jsonObject.get("version"));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaSegmentationType");
		kparams.add("name", this.name);
		kparams.add("description", this.description);
		kparams.add("conditions", this.conditions);
		kparams.add("actions", this.actions);
		kparams.add("value", this.value);
		return kparams;
	}


    public static final Creator<SegmentationType> CREATOR = new Creator<SegmentationType>() {
        @Override
        public SegmentationType createFromParcel(Parcel source) {
            return new SegmentationType(source);
        }

        @Override
        public SegmentationType[] newArray(int size) {
            return new SegmentationType[size];
        }
    };

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        super.writeToParcel(dest, flags);
        dest.writeValue(this.id);
        dest.writeString(this.name);
        dest.writeString(this.description);
        if(this.conditions != null) {
            dest.writeInt(this.conditions.size());
            dest.writeList(this.conditions);
        } else {
            dest.writeInt(-1);
        }
        if(this.actions != null) {
            dest.writeInt(this.actions.size());
            dest.writeList(this.actions);
        } else {
            dest.writeInt(-1);
        }
        dest.writeParcelable(this.value, flags);
        dest.writeValue(this.createDate);
        dest.writeValue(this.version);
    }

    public SegmentationType(Parcel in) {
        super(in);
        this.id = (Long)in.readValue(Long.class.getClassLoader());
        this.name = in.readString();
        this.description = in.readString();
        int conditionsSize = in.readInt();
        if( conditionsSize > -1) {
            this.conditions = new ArrayList<>();
            in.readList(this.conditions, BaseSegmentCondition.class.getClassLoader());
        }
        int actionsSize = in.readInt();
        if( actionsSize > -1) {
            this.actions = new ArrayList<>();
            in.readList(this.actions, BaseSegmentAction.class.getClassLoader());
        }
        this.value = in.readParcelable(BaseSegmentValue.class.getClassLoader());
        this.createDate = (Long)in.readValue(Long.class.getClassLoader());
        this.version = (Long)in.readValue(Long.class.getClassLoader());
    }
}

