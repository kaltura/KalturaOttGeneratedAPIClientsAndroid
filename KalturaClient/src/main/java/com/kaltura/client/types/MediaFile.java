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
import com.kaltura.client.types.BusinessModuleDetails;
import com.kaltura.client.utils.GsonParser;
import com.kaltura.client.utils.request.MultiRequestBuilder;

/**
 * This class was generated using exec.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

/**
 * Media file details
 */
@SuppressWarnings("serial")
@MultiRequestBuilder.Tokenizer(MediaFile.Tokenizer.class)
public class MediaFile extends AssetFile {
	
	public interface Tokenizer extends AssetFile.Tokenizer {
		String assetId();
		String id();
		String type();
		String typeId();
		String altUrl();
		String duration();
		String externalId();
		String altExternalId();
		String fileSize();
		String additionalData();
		String altStreamingCode();
		String alternativeCdnAdapaterProfileId();
		String endDate();
		String startDate();
		String externalStoreId();
		String isDefaultLanguage();
		String language();
		String orderNum();
		String outputProtecationLevel();
		String cdnAdapaterProfileId();
		String status();
		String catalogEndDate();
		String opl();
		BusinessModuleDetails.Tokenizer businessModuleDetails();
		String labels();
	}

	/**
	 * Unique identifier for the asset
	 */
	private Integer assetId;
	/**
	 * File unique identifier
	 */
	private Integer id;
	/**
	 * Deprecated - Device types as defined in the system
	 */
	private String type;
	/**
	 * Device types identifier as defined in the system
	 */
	private Integer typeId;
	/**
	 * URL of the media file to be played
	 */
	private String altUrl;
	/**
	 * Duration of the media file
	 */
	private Long duration;
	/**
	 * External identifier for the media file
	 */
	private String externalId;
	/**
	 * Alternative external identifier for the media file
	 */
	private String altExternalId;
	/**
	 * File size
	 */
	private Long fileSize;
	/**
	 * Additional Data
	 */
	private String additionalData;
	/**
	 * Alternative streaming code
	 */
	private String altStreamingCode;
	/**
	 * Alternative cdn adapter profile identifier
	 */
	private Long alternativeCdnAdapaterProfileId;
	/**
	 * EndDate
	 */
	private Long endDate;
	/**
	 * StartDate
	 */
	private Long startDate;
	/**
	 * ExternalStoreId
	 */
	private String externalStoreId;
	/**
	 * IsDefaultLanguage
	 */
	private Boolean isDefaultLanguage;
	/**
	 * Language
	 */
	private String language;
	/**
	 * OrderNum
	 */
	private Integer orderNum;
	/**
	 * OutputProtecationLevel
	 */
	private String outputProtecationLevel;
	/**
	 * cdn adapter profile identifier
	 */
	private Long cdnAdapaterProfileId;
	/**
	 * The media file status
	 */
	private Boolean status;
	/**
	 * Catalog end date
	 */
	private Long catalogEndDate;
	/**
	 * OPL
	 */
	private String opl;
	/**
	 * businessModuleDetails
	 */
	private BusinessModuleDetails businessModuleDetails;
	/**
	 * Labels associated with the media file
	 */
	private String labels;

	// assetId:
	public Integer getAssetId(){
		return this.assetId;
	}
	public void setAssetId(Integer assetId){
		this.assetId = assetId;
	}

	public void assetId(String multirequestToken){
		setToken("assetId", multirequestToken);
	}

	// id:
	public Integer getId(){
		return this.id;
	}
	// type:
	public String getType(){
		return this.type;
	}
	// typeId:
	public Integer getTypeId(){
		return this.typeId;
	}
	public void setTypeId(Integer typeId){
		this.typeId = typeId;
	}

	public void typeId(String multirequestToken){
		setToken("typeId", multirequestToken);
	}

	// altUrl:
	public String getAltUrl(){
		return this.altUrl;
	}
	public void setAltUrl(String altUrl){
		this.altUrl = altUrl;
	}

	public void altUrl(String multirequestToken){
		setToken("altUrl", multirequestToken);
	}

	// duration:
	public Long getDuration(){
		return this.duration;
	}
	public void setDuration(Long duration){
		this.duration = duration;
	}

	public void duration(String multirequestToken){
		setToken("duration", multirequestToken);
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

	// altExternalId:
	public String getAltExternalId(){
		return this.altExternalId;
	}
	public void setAltExternalId(String altExternalId){
		this.altExternalId = altExternalId;
	}

	public void altExternalId(String multirequestToken){
		setToken("altExternalId", multirequestToken);
	}

	// fileSize:
	public Long getFileSize(){
		return this.fileSize;
	}
	public void setFileSize(Long fileSize){
		this.fileSize = fileSize;
	}

	public void fileSize(String multirequestToken){
		setToken("fileSize", multirequestToken);
	}

	// additionalData:
	public String getAdditionalData(){
		return this.additionalData;
	}
	public void setAdditionalData(String additionalData){
		this.additionalData = additionalData;
	}

	public void additionalData(String multirequestToken){
		setToken("additionalData", multirequestToken);
	}

	// altStreamingCode:
	public String getAltStreamingCode(){
		return this.altStreamingCode;
	}
	public void setAltStreamingCode(String altStreamingCode){
		this.altStreamingCode = altStreamingCode;
	}

	public void altStreamingCode(String multirequestToken){
		setToken("altStreamingCode", multirequestToken);
	}

	// alternativeCdnAdapaterProfileId:
	public Long getAlternativeCdnAdapaterProfileId(){
		return this.alternativeCdnAdapaterProfileId;
	}
	public void setAlternativeCdnAdapaterProfileId(Long alternativeCdnAdapaterProfileId){
		this.alternativeCdnAdapaterProfileId = alternativeCdnAdapaterProfileId;
	}

	public void alternativeCdnAdapaterProfileId(String multirequestToken){
		setToken("alternativeCdnAdapaterProfileId", multirequestToken);
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

	// externalStoreId:
	public String getExternalStoreId(){
		return this.externalStoreId;
	}
	public void setExternalStoreId(String externalStoreId){
		this.externalStoreId = externalStoreId;
	}

	public void externalStoreId(String multirequestToken){
		setToken("externalStoreId", multirequestToken);
	}

	// isDefaultLanguage:
	public Boolean getIsDefaultLanguage(){
		return this.isDefaultLanguage;
	}
	public void setIsDefaultLanguage(Boolean isDefaultLanguage){
		this.isDefaultLanguage = isDefaultLanguage;
	}

	public void isDefaultLanguage(String multirequestToken){
		setToken("isDefaultLanguage", multirequestToken);
	}

	// language:
	public String getLanguage(){
		return this.language;
	}
	public void setLanguage(String language){
		this.language = language;
	}

	public void language(String multirequestToken){
		setToken("language", multirequestToken);
	}

	// orderNum:
	public Integer getOrderNum(){
		return this.orderNum;
	}
	public void setOrderNum(Integer orderNum){
		this.orderNum = orderNum;
	}

	public void orderNum(String multirequestToken){
		setToken("orderNum", multirequestToken);
	}

	// outputProtecationLevel:
	public String getOutputProtecationLevel(){
		return this.outputProtecationLevel;
	}
	public void setOutputProtecationLevel(String outputProtecationLevel){
		this.outputProtecationLevel = outputProtecationLevel;
	}

	public void outputProtecationLevel(String multirequestToken){
		setToken("outputProtecationLevel", multirequestToken);
	}

	// cdnAdapaterProfileId:
	public Long getCdnAdapaterProfileId(){
		return this.cdnAdapaterProfileId;
	}
	public void setCdnAdapaterProfileId(Long cdnAdapaterProfileId){
		this.cdnAdapaterProfileId = cdnAdapaterProfileId;
	}

	public void cdnAdapaterProfileId(String multirequestToken){
		setToken("cdnAdapaterProfileId", multirequestToken);
	}

	// status:
	public Boolean getStatus(){
		return this.status;
	}
	public void setStatus(Boolean status){
		this.status = status;
	}

	public void status(String multirequestToken){
		setToken("status", multirequestToken);
	}

	// catalogEndDate:
	public Long getCatalogEndDate(){
		return this.catalogEndDate;
	}
	public void setCatalogEndDate(Long catalogEndDate){
		this.catalogEndDate = catalogEndDate;
	}

	public void catalogEndDate(String multirequestToken){
		setToken("catalogEndDate", multirequestToken);
	}

	// opl:
	public String getOpl(){
		return this.opl;
	}
	public void setOpl(String opl){
		this.opl = opl;
	}

	public void opl(String multirequestToken){
		setToken("opl", multirequestToken);
	}

	// businessModuleDetails:
	public BusinessModuleDetails getBusinessModuleDetails(){
		return this.businessModuleDetails;
	}
	public void setBusinessModuleDetails(BusinessModuleDetails businessModuleDetails){
		this.businessModuleDetails = businessModuleDetails;
	}

	// labels:
	public String getLabels(){
		return this.labels;
	}
	public void setLabels(String labels){
		this.labels = labels;
	}

	public void labels(String multirequestToken){
		setToken("labels", multirequestToken);
	}


	public MediaFile() {
		super();
	}

	public MediaFile(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		assetId = GsonParser.parseInt(jsonObject.get("assetId"));
		id = GsonParser.parseInt(jsonObject.get("id"));
		type = GsonParser.parseString(jsonObject.get("type"));
		typeId = GsonParser.parseInt(jsonObject.get("typeId"));
		altUrl = GsonParser.parseString(jsonObject.get("altUrl"));
		duration = GsonParser.parseLong(jsonObject.get("duration"));
		externalId = GsonParser.parseString(jsonObject.get("externalId"));
		altExternalId = GsonParser.parseString(jsonObject.get("altExternalId"));
		fileSize = GsonParser.parseLong(jsonObject.get("fileSize"));
		additionalData = GsonParser.parseString(jsonObject.get("additionalData"));
		altStreamingCode = GsonParser.parseString(jsonObject.get("altStreamingCode"));
		alternativeCdnAdapaterProfileId = GsonParser.parseLong(jsonObject.get("alternativeCdnAdapaterProfileId"));
		endDate = GsonParser.parseLong(jsonObject.get("endDate"));
		startDate = GsonParser.parseLong(jsonObject.get("startDate"));
		externalStoreId = GsonParser.parseString(jsonObject.get("externalStoreId"));
		isDefaultLanguage = GsonParser.parseBoolean(jsonObject.get("isDefaultLanguage"));
		language = GsonParser.parseString(jsonObject.get("language"));
		orderNum = GsonParser.parseInt(jsonObject.get("orderNum"));
		outputProtecationLevel = GsonParser.parseString(jsonObject.get("outputProtecationLevel"));
		cdnAdapaterProfileId = GsonParser.parseLong(jsonObject.get("cdnAdapaterProfileId"));
		status = GsonParser.parseBoolean(jsonObject.get("status"));
		catalogEndDate = GsonParser.parseLong(jsonObject.get("catalogEndDate"));
		opl = GsonParser.parseString(jsonObject.get("opl"));
		businessModuleDetails = GsonParser.parseObject(jsonObject.getAsJsonObject("businessModuleDetails"), BusinessModuleDetails.class);
		labels = GsonParser.parseString(jsonObject.get("labels"));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaMediaFile");
		kparams.add("assetId", this.assetId);
		kparams.add("typeId", this.typeId);
		kparams.add("altUrl", this.altUrl);
		kparams.add("duration", this.duration);
		kparams.add("externalId", this.externalId);
		kparams.add("altExternalId", this.altExternalId);
		kparams.add("fileSize", this.fileSize);
		kparams.add("additionalData", this.additionalData);
		kparams.add("altStreamingCode", this.altStreamingCode);
		kparams.add("alternativeCdnAdapaterProfileId", this.alternativeCdnAdapaterProfileId);
		kparams.add("endDate", this.endDate);
		kparams.add("startDate", this.startDate);
		kparams.add("externalStoreId", this.externalStoreId);
		kparams.add("isDefaultLanguage", this.isDefaultLanguage);
		kparams.add("language", this.language);
		kparams.add("orderNum", this.orderNum);
		kparams.add("outputProtecationLevel", this.outputProtecationLevel);
		kparams.add("cdnAdapaterProfileId", this.cdnAdapaterProfileId);
		kparams.add("status", this.status);
		kparams.add("catalogEndDate", this.catalogEndDate);
		kparams.add("opl", this.opl);
		kparams.add("businessModuleDetails", this.businessModuleDetails);
		kparams.add("labels", this.labels);
		return kparams;
	}


    public static final Creator<MediaFile> CREATOR = new Creator<MediaFile>() {
        @Override
        public MediaFile createFromParcel(Parcel source) {
            return new MediaFile(source);
        }

        @Override
        public MediaFile[] newArray(int size) {
            return new MediaFile[size];
        }
    };

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        super.writeToParcel(dest, flags);
        dest.writeValue(this.assetId);
        dest.writeValue(this.id);
        dest.writeString(this.type);
        dest.writeValue(this.typeId);
        dest.writeString(this.altUrl);
        dest.writeValue(this.duration);
        dest.writeString(this.externalId);
        dest.writeString(this.altExternalId);
        dest.writeValue(this.fileSize);
        dest.writeString(this.additionalData);
        dest.writeString(this.altStreamingCode);
        dest.writeValue(this.alternativeCdnAdapaterProfileId);
        dest.writeValue(this.endDate);
        dest.writeValue(this.startDate);
        dest.writeString(this.externalStoreId);
        dest.writeValue(this.isDefaultLanguage);
        dest.writeString(this.language);
        dest.writeValue(this.orderNum);
        dest.writeString(this.outputProtecationLevel);
        dest.writeValue(this.cdnAdapaterProfileId);
        dest.writeValue(this.status);
        dest.writeValue(this.catalogEndDate);
        dest.writeString(this.opl);
        dest.writeParcelable(this.businessModuleDetails, flags);
        dest.writeString(this.labels);
    }

    public MediaFile(Parcel in) {
        super(in);
        this.assetId = (Integer)in.readValue(Integer.class.getClassLoader());
        this.id = (Integer)in.readValue(Integer.class.getClassLoader());
        this.type = in.readString();
        this.typeId = (Integer)in.readValue(Integer.class.getClassLoader());
        this.altUrl = in.readString();
        this.duration = (Long)in.readValue(Long.class.getClassLoader());
        this.externalId = in.readString();
        this.altExternalId = in.readString();
        this.fileSize = (Long)in.readValue(Long.class.getClassLoader());
        this.additionalData = in.readString();
        this.altStreamingCode = in.readString();
        this.alternativeCdnAdapaterProfileId = (Long)in.readValue(Long.class.getClassLoader());
        this.endDate = (Long)in.readValue(Long.class.getClassLoader());
        this.startDate = (Long)in.readValue(Long.class.getClassLoader());
        this.externalStoreId = in.readString();
        this.isDefaultLanguage = (Boolean)in.readValue(Boolean.class.getClassLoader());
        this.language = in.readString();
        this.orderNum = (Integer)in.readValue(Integer.class.getClassLoader());
        this.outputProtecationLevel = in.readString();
        this.cdnAdapaterProfileId = (Long)in.readValue(Long.class.getClassLoader());
        this.status = (Boolean)in.readValue(Boolean.class.getClassLoader());
        this.catalogEndDate = (Long)in.readValue(Long.class.getClassLoader());
        this.opl = in.readString();
        this.businessModuleDetails = in.readParcelable(BusinessModuleDetails.class.getClassLoader());
        this.labels = in.readString();
    }
}

