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

/**
 * Category details
 */
@SuppressWarnings("serial")
@MultiRequestBuilder.Tokenizer(OTTCategory.Tokenizer.class)
public class OTTCategory extends ObjectBase {
	
	public interface Tokenizer extends ObjectBase.Tokenizer {
		String id();
		String name();
		String parentCategoryId();
		RequestBuilder.ListTokenizer<OTTCategory.Tokenizer> childCategories();
		RequestBuilder.ListTokenizer<Channel.Tokenizer> channels();
		RequestBuilder.ListTokenizer<MediaImage.Tokenizer> images();
	}

	/**
	 * Unique identifier for the category
	 */
	private Long id;
	/**
	 * Category name
	 */
	private String name;
	/**
	 * Category parent identifier
	 */
	private Long parentCategoryId;
	/**
	 * Child categories
	 */
	private List<OTTCategory> childCategories;
	/**
	 * Category channels
	 */
	private List<Channel> channels;
	/**
	 * Category images
	 */
	private List<MediaImage> images;

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

	// parentCategoryId:
	public Long getParentCategoryId(){
		return this.parentCategoryId;
	}
	public void setParentCategoryId(Long parentCategoryId){
		this.parentCategoryId = parentCategoryId;
	}

	public void parentCategoryId(String multirequestToken){
		setToken("parentCategoryId", multirequestToken);
	}

	// childCategories:
	public List<OTTCategory> getChildCategories(){
		return this.childCategories;
	}
	public void setChildCategories(List<OTTCategory> childCategories){
		this.childCategories = childCategories;
	}

	// channels:
	public List<Channel> getChannels(){
		return this.channels;
	}
	public void setChannels(List<Channel> channels){
		this.channels = channels;
	}

	// images:
	public List<MediaImage> getImages(){
		return this.images;
	}
	public void setImages(List<MediaImage> images){
		this.images = images;
	}


	public OTTCategory() {
		super();
	}

	public OTTCategory(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		id = GsonParser.parseLong(jsonObject.get("id"));
		name = GsonParser.parseString(jsonObject.get("name"));
		parentCategoryId = GsonParser.parseLong(jsonObject.get("parentCategoryId"));
		childCategories = GsonParser.parseArray(jsonObject.getAsJsonArray("childCategories"), OTTCategory.class);
		channels = GsonParser.parseArray(jsonObject.getAsJsonArray("channels"), Channel.class);
		images = GsonParser.parseArray(jsonObject.getAsJsonArray("images"), MediaImage.class);

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaOTTCategory");
		kparams.add("name", this.name);
		kparams.add("parentCategoryId", this.parentCategoryId);
		kparams.add("childCategories", this.childCategories);
		kparams.add("channels", this.channels);
		kparams.add("images", this.images);
		return kparams;
	}


    public static final Creator<OTTCategory> CREATOR = new Creator<OTTCategory>() {
        @Override
        public OTTCategory createFromParcel(Parcel source) {
            return new OTTCategory(source);
        }

        @Override
        public OTTCategory[] newArray(int size) {
            return new OTTCategory[size];
        }
    };

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        super.writeToParcel(dest, flags);
        dest.writeValue(this.id);
        dest.writeString(this.name);
        dest.writeValue(this.parentCategoryId);
        if(this.childCategories != null) {
            dest.writeInt(this.childCategories.size());
            dest.writeList(this.childCategories);
        } else {
            dest.writeInt(-1);
        }
        if(this.channels != null) {
            dest.writeInt(this.channels.size());
            dest.writeList(this.channels);
        } else {
            dest.writeInt(-1);
        }
        if(this.images != null) {
            dest.writeInt(this.images.size());
            dest.writeList(this.images);
        } else {
            dest.writeInt(-1);
        }
    }

    public OTTCategory(Parcel in) {
        super(in);
        this.id = (Long)in.readValue(Long.class.getClassLoader());
        this.name = in.readString();
        this.parentCategoryId = (Long)in.readValue(Long.class.getClassLoader());
        int childCategoriesSize = in.readInt();
        if( childCategoriesSize > -1) {
            this.childCategories = new ArrayList<>();
            in.readList(this.childCategories, OTTCategory.class.getClassLoader());
        }
        int channelsSize = in.readInt();
        if( channelsSize > -1) {
            this.channels = new ArrayList<>();
            in.readList(this.channels, Channel.class.getClassLoader());
        }
        int imagesSize = in.readInt();
        if( imagesSize > -1) {
            this.images = new ArrayList<>();
            in.readList(this.images, MediaImage.class.getClassLoader());
        }
    }
}

