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
// Copyright (C) 2006-2017  Kaltura Inc.
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
 * This class was generated using clients-generator\exec.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

/**
 * Asset info
 */
@SuppressWarnings("serial")
@MultiRequestBuilder.Tokenizer(Asset.Tokenizer.class)
public abstract class Asset extends ObjectBase {
	
	public interface Tokenizer extends ObjectBase.Tokenizer {
		String id();
		String type();
		String name();
		RequestBuilder.ListTokenizer<TranslationToken.Tokenizer> multilingualName();
		String description();
		RequestBuilder.ListTokenizer<TranslationToken.Tokenizer> multilingualDescription();
		RequestBuilder.ListTokenizer<MediaImage.Tokenizer> images();
		RequestBuilder.ListTokenizer<MediaFile.Tokenizer> mediaFiles();
		RequestBuilder.MapTokenizer<Value.Tokenizer> metas();
		RequestBuilder.MapTokenizer<MultilingualStringValueArray.Tokenizer> tags();
		String startDate();
		String endDate();
		String enableCdvr();
		String enableCatchUp();
		String enableStartOver();
		String enableTrickPlay();
		String externalId();
	}

	/**
	 * Unique identifier for the asset
	 */
	private Long id;
	/**
	 * Identifies the asset type (EPG, Recording, Movie, TV Series, etc).              
	  Possible values: 0 – EPG linear programs, 1 - Recording; or any asset type ID
	  according to the asset types IDs defined in the system.
	 */
	private Integer type;
	/**
	 * Asset name
	 */
	private String name;
	/**
	 * Asset name
	 */
	private List<TranslationToken> multilingualName;
	/**
	 * Asset description
	 */
	private String description;
	/**
	 * Asset description
	 */
	private List<TranslationToken> multilingualDescription;
	/**
	 * Collection of images details that can be used to represent this asset
	 */
	private List<MediaImage> images;
	/**
	 * Files
	 */
	private List<MediaFile> mediaFiles;
	/**
	 * Dynamic collection of key-value pairs according to the String Meta defined in
	  the system
	 */
	private Map<String, Value> metas;
	/**
	 * Dynamic collection of key-value pairs according to the Tag Types defined in the
	  system
	 */
	private Map<String, MultilingualStringValueArray> tags;
	/**
	 * Date and time represented as epoch. For VOD – since when the asset is
	  available in the catalog. For EPG/Linear – when the program is aired (can be
	  in the future).
	 */
	private Long startDate;
	/**
	 * Date and time represented as epoch. For VOD – till when the asset be available
	  in the catalog. For EPG/Linear – program end time and date
	 */
	private Long endDate;
	/**
	 * Enable cDVR
	 */
	private Boolean enableCdvr;
	/**
	 * Enable catch-up
	 */
	private Boolean enableCatchUp;
	/**
	 * Enable start over
	 */
	private Boolean enableStartOver;
	/**
	 * Enable trick-play
	 */
	private Boolean enableTrickPlay;
	/**
	 * External identifier for the media file
	 */
	private String externalId;

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

	// type:
	public Integer getType(){
		return this.type;
	}
	public void setType(Integer type){
		this.type = type;
	}

	public void type(String multirequestToken){
		setToken("type", multirequestToken);
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

	// images:
	public List<MediaImage> getImages(){
		return this.images;
	}
	public void setImages(List<MediaImage> images){
		this.images = images;
	}

	// mediaFiles:
	public List<MediaFile> getMediaFiles(){
		return this.mediaFiles;
	}
	public void setMediaFiles(List<MediaFile> mediaFiles){
		this.mediaFiles = mediaFiles;
	}

	// metas:
	public Map<String, Value> getMetas(){
		return this.metas;
	}
	public void setMetas(Map<String, Value> metas){
		this.metas = metas;
	}

	// tags:
	public Map<String, MultilingualStringValueArray> getTags(){
		return this.tags;
	}
	public void setTags(Map<String, MultilingualStringValueArray> tags){
		this.tags = tags;
	}

	// startDate:
	public Long getStartDate(){
		return this.startDate;
	}
	public void setStartDate(Long startDate){
		this.startDate = startDate;
	}

	public void startDate(String multirequestToken){
		setToken("startDate", multirequestToken);
	}

	// endDate:
	public Long getEndDate(){
		return this.endDate;
	}
	public void setEndDate(Long endDate){
		this.endDate = endDate;
	}

	public void endDate(String multirequestToken){
		setToken("endDate", multirequestToken);
	}

	// enableCdvr:
	public Boolean getEnableCdvr(){
		return this.enableCdvr;
	}
	public void setEnableCdvr(Boolean enableCdvr){
		this.enableCdvr = enableCdvr;
	}

	public void enableCdvr(String multirequestToken){
		setToken("enableCdvr", multirequestToken);
	}

	// enableCatchUp:
	public Boolean getEnableCatchUp(){
		return this.enableCatchUp;
	}
	public void setEnableCatchUp(Boolean enableCatchUp){
		this.enableCatchUp = enableCatchUp;
	}

	public void enableCatchUp(String multirequestToken){
		setToken("enableCatchUp", multirequestToken);
	}

	// enableStartOver:
	public Boolean getEnableStartOver(){
		return this.enableStartOver;
	}
	public void setEnableStartOver(Boolean enableStartOver){
		this.enableStartOver = enableStartOver;
	}

	public void enableStartOver(String multirequestToken){
		setToken("enableStartOver", multirequestToken);
	}

	// enableTrickPlay:
	public Boolean getEnableTrickPlay(){
		return this.enableTrickPlay;
	}
	public void setEnableTrickPlay(Boolean enableTrickPlay){
		this.enableTrickPlay = enableTrickPlay;
	}

	public void enableTrickPlay(String multirequestToken){
		setToken("enableTrickPlay", multirequestToken);
	}

	// externalId:
	public String getExternalId(){
		return this.externalId;
	}
	public void setExternalId(String externalId){
		this.externalId = externalId;
	}

	public void externalId(String multirequestToken){
		setToken("externalId", multirequestToken);
	}


	public Asset() {
		super();
	}

	public Asset(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		id = GsonParser.parseLong(jsonObject.get("id"));
		type = GsonParser.parseInt(jsonObject.get("type"));
		name = GsonParser.parseString(jsonObject.get("name"));
		multilingualName = GsonParser.parseArray(jsonObject.getAsJsonArray("multilingualName"), TranslationToken.class);
		description = GsonParser.parseString(jsonObject.get("description"));
		multilingualDescription = GsonParser.parseArray(jsonObject.getAsJsonArray("multilingualDescription"), TranslationToken.class);
		images = GsonParser.parseArray(jsonObject.getAsJsonArray("images"), MediaImage.class);
		mediaFiles = GsonParser.parseArray(jsonObject.getAsJsonArray("mediaFiles"), MediaFile.class);
		metas = GsonParser.parseMap(jsonObject.getAsJsonObject("metas"), Value.class);
		tags = GsonParser.parseMap(jsonObject.getAsJsonObject("tags"), MultilingualStringValueArray.class);
		startDate = GsonParser.parseLong(jsonObject.get("startDate"));
		endDate = GsonParser.parseLong(jsonObject.get("endDate"));
		enableCdvr = GsonParser.parseBoolean(jsonObject.get("enableCdvr"));
		enableCatchUp = GsonParser.parseBoolean(jsonObject.get("enableCatchUp"));
		enableStartOver = GsonParser.parseBoolean(jsonObject.get("enableStartOver"));
		enableTrickPlay = GsonParser.parseBoolean(jsonObject.get("enableTrickPlay"));
		externalId = GsonParser.parseString(jsonObject.get("externalId"));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaAsset");
		kparams.add("type", this.type);
		kparams.add("name", this.name);
		kparams.add("multilingualName", this.multilingualName);
		kparams.add("description", this.description);
		kparams.add("multilingualDescription", this.multilingualDescription);
		kparams.add("images", this.images);
		kparams.add("mediaFiles", this.mediaFiles);
		kparams.add("metas", this.metas);
		kparams.add("tags", this.tags);
		kparams.add("startDate", this.startDate);
		kparams.add("endDate", this.endDate);
		kparams.add("enableCdvr", this.enableCdvr);
		kparams.add("enableCatchUp", this.enableCatchUp);
		kparams.add("enableStartOver", this.enableStartOver);
		kparams.add("enableTrickPlay", this.enableTrickPlay);
		kparams.add("externalId", this.externalId);
		return kparams;
	}


    @Override
    public void writeToParcel(Parcel dest, int flags) {
        super.writeToParcel(dest, flags);
        dest.writeValue(this.id);
        dest.writeValue(this.type);
        dest.writeString(this.name);
        if(this.multilingualName != null) {
            dest.writeInt(this.multilingualName.size());
            dest.writeList(this.multilingualName);
        } else {
            dest.writeInt(-1);
        }
        dest.writeString(this.description);
        if(this.multilingualDescription != null) {
            dest.writeInt(this.multilingualDescription.size());
            dest.writeList(this.multilingualDescription);
        } else {
            dest.writeInt(-1);
        }
        if(this.images != null) {
            dest.writeInt(this.images.size());
            dest.writeList(this.images);
        } else {
            dest.writeInt(-1);
        }
        if(this.mediaFiles != null) {
            dest.writeInt(this.mediaFiles.size());
            dest.writeList(this.mediaFiles);
        } else {
            dest.writeInt(-1);
        }
        if(this.metas != null) {
            dest.writeInt(this.metas.size());
            for (Map.Entry<String, Value> entry : this.metas.entrySet()) {
                dest.writeString(entry.getKey());
                dest.writeParcelable(entry.getValue(), flags);
            }
        } else {
            dest.writeInt(-1);
        }
        if(this.tags != null) {
            dest.writeInt(this.tags.size());
            for (Map.Entry<String, MultilingualStringValueArray> entry : this.tags.entrySet()) {
                dest.writeString(entry.getKey());
                dest.writeParcelable(entry.getValue(), flags);
            }
        } else {
            dest.writeInt(-1);
        }
        dest.writeValue(this.startDate);
        dest.writeValue(this.endDate);
        dest.writeValue(this.enableCdvr);
        dest.writeValue(this.enableCatchUp);
        dest.writeValue(this.enableStartOver);
        dest.writeValue(this.enableTrickPlay);
        dest.writeString(this.externalId);
    }

    public Asset(Parcel in) {
        super(in);
        this.id = (Long)in.readValue(Long.class.getClassLoader());
        this.type = (Integer)in.readValue(Integer.class.getClassLoader());
        this.name = in.readString();
        int multilingualNameSize = in.readInt();
        if( multilingualNameSize > -1) {
            this.multilingualName = new ArrayList<>();
            in.readList(this.multilingualName, TranslationToken.class.getClassLoader());
        }
        this.description = in.readString();
        int multilingualDescriptionSize = in.readInt();
        if( multilingualDescriptionSize > -1) {
            this.multilingualDescription = new ArrayList<>();
            in.readList(this.multilingualDescription, TranslationToken.class.getClassLoader());
        }
        int imagesSize = in.readInt();
        if( imagesSize > -1) {
            this.images = new ArrayList<>();
            in.readList(this.images, MediaImage.class.getClassLoader());
        }
        int mediaFilesSize = in.readInt();
        if( mediaFilesSize > -1) {
            this.mediaFiles = new ArrayList<>();
            in.readList(this.mediaFiles, MediaFile.class.getClassLoader());
        }
        int metasSize = in.readInt();
        if( metasSize > -1) {
            this.metas = new HashMap<>();
            for (int i = 0; i < metasSize; i++) {
                String key = in.readString();
                Value value = in.readParcelable(Value.class.getClassLoader());
                this.metas.put(key, value);
            }
        }
        int tagsSize = in.readInt();
        if( tagsSize > -1) {
            this.tags = new HashMap<>();
            for (int i = 0; i < tagsSize; i++) {
                String key = in.readString();
                MultilingualStringValueArray value = in.readParcelable(MultilingualStringValueArray.class.getClassLoader());
                this.tags.put(key, value);
            }
        }
        this.startDate = (Long)in.readValue(Long.class.getClassLoader());
        this.endDate = (Long)in.readValue(Long.class.getClassLoader());
        this.enableCdvr = (Boolean)in.readValue(Boolean.class.getClassLoader());
        this.enableCatchUp = (Boolean)in.readValue(Boolean.class.getClassLoader());
        this.enableStartOver = (Boolean)in.readValue(Boolean.class.getClassLoader());
        this.enableTrickPlay = (Boolean)in.readValue(Boolean.class.getClassLoader());
        this.externalId = in.readString();
    }
}

