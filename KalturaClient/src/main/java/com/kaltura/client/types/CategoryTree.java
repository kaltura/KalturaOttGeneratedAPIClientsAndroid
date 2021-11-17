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
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
@MultiRequestBuilder.Tokenizer(CategoryTree.Tokenizer.class)
public class CategoryTree extends ObjectBase {
	
	public interface Tokenizer extends ObjectBase.Tokenizer {
		String id();
		String name();
		RequestBuilder.ListTokenizer<TranslationToken.Tokenizer> multilingualName();
		RequestBuilder.ListTokenizer<CategoryTree.Tokenizer> children();
		RequestBuilder.ListTokenizer<UnifiedChannelInfo.Tokenizer> unifiedChannels();
		RequestBuilder.MapTokenizer<StringValue.Tokenizer> dynamicData();
		RequestBuilder.ListTokenizer<Image.Tokenizer> images();
		String isActive();
		String startDateInSeconds();
		String endDateInSeconds();
		String type();
		String versionId();
		String virtualAssetId();
	}

	/**
	 * Unique identifier for the category item
	 */
	private Long id;
	/**
	 * Category name
	 */
	private String name;
	/**
	 * Category name
	 */
	private List<TranslationToken> multilingualName;
	/**
	 * List of category tree
	 */
	private List<CategoryTree> children;
	/**
	 * List of unified Channels.
	 */
	private List<UnifiedChannelInfo> unifiedChannels;
	/**
	 * Dynamic data
	 */
	private Map<String, StringValue> dynamicData;
	/**
	 * Category images
	 */
	private List<Image> images;
	/**
	 * Category active status
	 */
	private Boolean isActive;
	/**
	 * Start date in seconds
	 */
	private Long startDateInSeconds;
	/**
	 * End date in seconds
	 */
	private Long endDateInSeconds;
	/**
	 * Category type
	 */
	private String type;
	/**
	 * Unique identifier for the category version
	 */
	private Long versionId;
	/**
	 * Virtual asset id
	 */
	private Long virtualAssetId;

	// id:
	public Long getId(){
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

	// children:
	public List<CategoryTree> getChildren(){
		return this.children;
	}
	// unifiedChannels:
	public List<UnifiedChannelInfo> getUnifiedChannels(){
		return this.unifiedChannels;
	}
	public void setUnifiedChannels(List<UnifiedChannelInfo> unifiedChannels){
		this.unifiedChannels = unifiedChannels;
	}

	// dynamicData:
	public Map<String, StringValue> getDynamicData(){
		return this.dynamicData;
	}
	public void setDynamicData(Map<String, StringValue> dynamicData){
		this.dynamicData = dynamicData;
	}

	// images:
	public List<Image> getImages(){
		return this.images;
	}
	public void setImages(List<Image> images){
		this.images = images;
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

	// startDateInSeconds:
	public Long getStartDateInSeconds(){
		return this.startDateInSeconds;
	}
	public void setStartDateInSeconds(Long startDateInSeconds){
		this.startDateInSeconds = startDateInSeconds;
	}

	public void startDateInSeconds(String multirequestToken){
		setToken("startDateInSeconds", multirequestToken);
	}

	// endDateInSeconds:
	public Long getEndDateInSeconds(){
		return this.endDateInSeconds;
	}
	public void setEndDateInSeconds(Long endDateInSeconds){
		this.endDateInSeconds = endDateInSeconds;
	}

	public void endDateInSeconds(String multirequestToken){
		setToken("endDateInSeconds", multirequestToken);
	}

	// type:
	public String getType(){
		return this.type;
	}
	public void setType(String type){
		this.type = type;
	}

	public void type(String multirequestToken){
		setToken("type", multirequestToken);
	}

	// versionId:
	public Long getVersionId(){
		return this.versionId;
	}
	// virtualAssetId:
	public Long getVirtualAssetId(){
		return this.virtualAssetId;
	}

	public CategoryTree() {
		super();
	}

	public CategoryTree(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		id = GsonParser.parseLong(jsonObject.get("id"));
		name = GsonParser.parseString(jsonObject.get("name"));
		multilingualName = GsonParser.parseArray(jsonObject.getAsJsonArray("multilingualName"), TranslationToken.class);
		children = GsonParser.parseArray(jsonObject.getAsJsonArray("children"), CategoryTree.class);
		unifiedChannels = GsonParser.parseArray(jsonObject.getAsJsonArray("unifiedChannels"), UnifiedChannelInfo.class);
		dynamicData = GsonParser.parseMap(jsonObject.getAsJsonObject("dynamicData"), StringValue.class);
		images = GsonParser.parseArray(jsonObject.getAsJsonArray("images"), Image.class);
		isActive = GsonParser.parseBoolean(jsonObject.get("isActive"));
		startDateInSeconds = GsonParser.parseLong(jsonObject.get("startDateInSeconds"));
		endDateInSeconds = GsonParser.parseLong(jsonObject.get("endDateInSeconds"));
		type = GsonParser.parseString(jsonObject.get("type"));
		versionId = GsonParser.parseLong(jsonObject.get("versionId"));
		virtualAssetId = GsonParser.parseLong(jsonObject.get("virtualAssetId"));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaCategoryTree");
		kparams.add("multilingualName", this.multilingualName);
		kparams.add("unifiedChannels", this.unifiedChannels);
		kparams.add("dynamicData", this.dynamicData);
		kparams.add("images", this.images);
		kparams.add("isActive", this.isActive);
		kparams.add("startDateInSeconds", this.startDateInSeconds);
		kparams.add("endDateInSeconds", this.endDateInSeconds);
		kparams.add("type", this.type);
		return kparams;
	}


    public static final Creator<CategoryTree> CREATOR = new Creator<CategoryTree>() {
        @Override
        public CategoryTree createFromParcel(Parcel source) {
            return new CategoryTree(source);
        }

        @Override
        public CategoryTree[] newArray(int size) {
            return new CategoryTree[size];
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
        if(this.children != null) {
            dest.writeInt(this.children.size());
            dest.writeList(this.children);
        } else {
            dest.writeInt(-1);
        }
        if(this.unifiedChannels != null) {
            dest.writeInt(this.unifiedChannels.size());
            dest.writeList(this.unifiedChannels);
        } else {
            dest.writeInt(-1);
        }
        if(this.dynamicData != null) {
            dest.writeInt(this.dynamicData.size());
            for (Map.Entry<String, StringValue> entry : this.dynamicData.entrySet()) {
                dest.writeString(entry.getKey());
                dest.writeParcelable(entry.getValue(), flags);
            }
        } else {
            dest.writeInt(-1);
        }
        if(this.images != null) {
            dest.writeInt(this.images.size());
            dest.writeList(this.images);
        } else {
            dest.writeInt(-1);
        }
        dest.writeValue(this.isActive);
        dest.writeValue(this.startDateInSeconds);
        dest.writeValue(this.endDateInSeconds);
        dest.writeString(this.type);
        dest.writeValue(this.versionId);
        dest.writeValue(this.virtualAssetId);
    }

    public CategoryTree(Parcel in) {
        super(in);
        this.id = (Long)in.readValue(Long.class.getClassLoader());
        this.name = in.readString();
        int multilingualNameSize = in.readInt();
        if( multilingualNameSize > -1) {
            this.multilingualName = new ArrayList<>();
            in.readList(this.multilingualName, TranslationToken.class.getClassLoader());
        }
        int childrenSize = in.readInt();
        if( childrenSize > -1) {
            this.children = new ArrayList<>();
            in.readList(this.children, CategoryTree.class.getClassLoader());
        }
        int unifiedChannelsSize = in.readInt();
        if( unifiedChannelsSize > -1) {
            this.unifiedChannels = new ArrayList<>();
            in.readList(this.unifiedChannels, UnifiedChannelInfo.class.getClassLoader());
        }
        int dynamicDataSize = in.readInt();
        if( dynamicDataSize > -1) {
            this.dynamicData = new HashMap<>();
            for (int i = 0; i < dynamicDataSize; i++) {
                String key = in.readString();
                StringValue value = in.readParcelable(StringValue.class.getClassLoader());
                this.dynamicData.put(key, value);
            }
        }
        int imagesSize = in.readInt();
        if( imagesSize > -1) {
            this.images = new ArrayList<>();
            in.readList(this.images, Image.class.getClassLoader());
        }
        this.isActive = (Boolean)in.readValue(Boolean.class.getClassLoader());
        this.startDateInSeconds = (Long)in.readValue(Long.class.getClassLoader());
        this.endDateInSeconds = (Long)in.readValue(Long.class.getClassLoader());
        this.type = in.readString();
        this.versionId = (Long)in.readValue(Long.class.getClassLoader());
        this.virtualAssetId = (Long)in.readValue(Long.class.getClassLoader());
    }
}

