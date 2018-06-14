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
import com.kaltura.client.types.StringValueArray;
import com.kaltura.client.utils.GsonParser;
import com.kaltura.client.utils.request.MultiRequestBuilder;

/**
 * This class was generated using clients-generator\exec.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

/**
 * Media file details
 */
@SuppressWarnings("serial")
@MultiRequestBuilder.Tokenizer(MediaFile.Tokenizer.class)
public class MediaFile extends ObjectBase {
	
	public interface Tokenizer extends ObjectBase.Tokenizer {
		String assetId();
		String id();
		String type();
		String url();
		String duration();
		String externalId();
		String billingType();
		String quality();
		String handlingType();
		String cdnName();
		String cdnCode();
		String altCdnCode();
		StringValueArray.Tokenizer ppvModules();
		String productCode();
		String fileSize();
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
	 * Device types as defined in the system
	 */
	private String type;
	/**
	 * URL of the media file to be played
	 */
	private String url;
	/**
	 * Duration of the media file
	 */
	private Long duration;
	/**
	 * External identifier for the media file
	 */
	private String externalId;
	/**
	 * Billing type
	 */
	private String billingType;
	/**
	 * Quality
	 */
	private String quality;
	/**
	 * Handling type
	 */
	private String handlingType;
	/**
	 * CDN name
	 */
	private String cdnName;
	/**
	 * CDN code
	 */
	private String cdnCode;
	/**
	 * Alt CDN code
	 */
	private String altCdnCode;
	/**
	 * PPV Module
	 */
	private StringValueArray ppvModules;
	/**
	 * Product code
	 */
	private String productCode;
	/**
	 * File size
	 */
	private Long fileSize;

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
	public void setId(Integer id){
		this.id = id;
	}

	public void id(String multirequestToken){
		setToken("id", multirequestToken);
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

	// url:
	public String getUrl(){
		return this.url;
	}
	public void setUrl(String url){
		this.url = url;
	}

	public void url(String multirequestToken){
		setToken("url", multirequestToken);
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

	// billingType:
	public String getBillingType(){
		return this.billingType;
	}
	public void setBillingType(String billingType){
		this.billingType = billingType;
	}

	public void billingType(String multirequestToken){
		setToken("billingType", multirequestToken);
	}

	// quality:
	public String getQuality(){
		return this.quality;
	}
	public void setQuality(String quality){
		this.quality = quality;
	}

	public void quality(String multirequestToken){
		setToken("quality", multirequestToken);
	}

	// handlingType:
	public String getHandlingType(){
		return this.handlingType;
	}
	public void setHandlingType(String handlingType){
		this.handlingType = handlingType;
	}

	public void handlingType(String multirequestToken){
		setToken("handlingType", multirequestToken);
	}

	// cdnName:
	public String getCdnName(){
		return this.cdnName;
	}
	public void setCdnName(String cdnName){
		this.cdnName = cdnName;
	}

	public void cdnName(String multirequestToken){
		setToken("cdnName", multirequestToken);
	}

	// cdnCode:
	public String getCdnCode(){
		return this.cdnCode;
	}
	public void setCdnCode(String cdnCode){
		this.cdnCode = cdnCode;
	}

	public void cdnCode(String multirequestToken){
		setToken("cdnCode", multirequestToken);
	}

	// altCdnCode:
	public String getAltCdnCode(){
		return this.altCdnCode;
	}
	public void setAltCdnCode(String altCdnCode){
		this.altCdnCode = altCdnCode;
	}

	public void altCdnCode(String multirequestToken){
		setToken("altCdnCode", multirequestToken);
	}

	// ppvModules:
	public StringValueArray getPpvModules(){
		return this.ppvModules;
	}
	public void setPpvModules(StringValueArray ppvModules){
		this.ppvModules = ppvModules;
	}

	// productCode:
	public String getProductCode(){
		return this.productCode;
	}
	public void setProductCode(String productCode){
		this.productCode = productCode;
	}

	public void productCode(String multirequestToken){
		setToken("productCode", multirequestToken);
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
		url = GsonParser.parseString(jsonObject.get("url"));
		duration = GsonParser.parseLong(jsonObject.get("duration"));
		externalId = GsonParser.parseString(jsonObject.get("externalId"));
		billingType = GsonParser.parseString(jsonObject.get("billingType"));
		quality = GsonParser.parseString(jsonObject.get("quality"));
		handlingType = GsonParser.parseString(jsonObject.get("handlingType"));
		cdnName = GsonParser.parseString(jsonObject.get("cdnName"));
		cdnCode = GsonParser.parseString(jsonObject.get("cdnCode"));
		altCdnCode = GsonParser.parseString(jsonObject.get("altCdnCode"));
		ppvModules = GsonParser.parseObject(jsonObject.getAsJsonObject("ppvModules"), StringValueArray.class);
		productCode = GsonParser.parseString(jsonObject.get("productCode"));
		fileSize = GsonParser.parseLong(jsonObject.get("fileSize"));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaMediaFile");
		kparams.add("assetId", this.assetId);
		kparams.add("type", this.type);
		kparams.add("url", this.url);
		kparams.add("duration", this.duration);
		kparams.add("externalId", this.externalId);
		kparams.add("billingType", this.billingType);
		kparams.add("quality", this.quality);
		kparams.add("handlingType", this.handlingType);
		kparams.add("cdnName", this.cdnName);
		kparams.add("cdnCode", this.cdnCode);
		kparams.add("altCdnCode", this.altCdnCode);
		kparams.add("ppvModules", this.ppvModules);
		kparams.add("productCode", this.productCode);
		kparams.add("fileSize", this.fileSize);
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
        dest.writeString(this.url);
        dest.writeValue(this.duration);
        dest.writeString(this.externalId);
        dest.writeString(this.billingType);
        dest.writeString(this.quality);
        dest.writeString(this.handlingType);
        dest.writeString(this.cdnName);
        dest.writeString(this.cdnCode);
        dest.writeString(this.altCdnCode);
        dest.writeParcelable(this.ppvModules, flags);
        dest.writeString(this.productCode);
        dest.writeValue(this.fileSize);
    }

    public MediaFile(Parcel in) {
        super(in);
        this.assetId = (Integer)in.readValue(Integer.class.getClassLoader());
        this.id = (Integer)in.readValue(Integer.class.getClassLoader());
        this.type = in.readString();
        this.url = in.readString();
        this.duration = (Long)in.readValue(Long.class.getClassLoader());
        this.externalId = in.readString();
        this.billingType = in.readString();
        this.quality = in.readString();
        this.handlingType = in.readString();
        this.cdnName = in.readString();
        this.cdnCode = in.readString();
        this.altCdnCode = in.readString();
        this.ppvModules = in.readParcelable(StringValueArray.class.getClassLoader());
        this.productCode = in.readString();
        this.fileSize = (Long)in.readValue(Long.class.getClassLoader());
    }
}

