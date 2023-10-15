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
import com.kaltura.client.enums.VodIngestAssetResultStatus;
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
@MultiRequestBuilder.Tokenizer(VodIngestAssetResult.Tokenizer.class)
public class VodIngestAssetResult extends ObjectBase {
	
	public interface Tokenizer extends ObjectBase.Tokenizer {
		String assetName();
		String shopAssetUserRuleId();
		String fileName();
		String ingestDate();
		String status();
		String vodTypeSystemName();
		RequestBuilder.ListTokenizer<VodIngestAssetResultErrorMessage.Tokenizer> errors();
		RequestBuilder.ListTokenizer<VodIngestAssetResultErrorMessage.Tokenizer> warnings();
	}

	/**
	 * Ingested asset name. Absent only in case of NameRequired error
	 */
	private String assetName;
	/**
	 * The shop ID the asset is assigned to. Omitted if the asset is not associated to
	  any shop.
	 */
	private Long shopAssetUserRuleId;
	/**
	 * The XML file name used at the ingest gateway. Referred to as process name
	 */
	private String fileName;
	/**
	 * Date and time the asset was ingested. Date and time represented as epoch.
	 */
	private Long ingestDate;
	/**
	 * The status result for the asset ingest.              FAILURE - the asset ingest
	  was failed after the ingest process started, specify the error for it.          
	     SUCCESS - the asset was succeeded to be ingested.             
	  SUCCESS_WARNING - the asset was succeeded to be ingested with warnings that do
	  not prevent the ingest.              EXTERNAL_FAILURE - the asset ingest was
	  failed before the ingest process started, specify the error for it.
	 */
	private VodIngestAssetResultStatus status;
	/**
	 * VOD asset type (assetStruct.systemName).
	 */
	private String vodTypeSystemName;
	/**
	 * Errors which prevent the asset from being ingested
	 */
	private List<VodIngestAssetResultErrorMessage> errors;
	/**
	 * Errors which do not prevent the asset from being ingested
	 */
	private List<VodIngestAssetResultErrorMessage> warnings;

	// assetName:
	public String getAssetName(){
		return this.assetName;
	}
	public void setAssetName(String assetName){
		this.assetName = assetName;
	}

	public void assetName(String multirequestToken){
		setToken("assetName", multirequestToken);
	}

	// shopAssetUserRuleId:
	public Long getShopAssetUserRuleId(){
		return this.shopAssetUserRuleId;
	}
	public void setShopAssetUserRuleId(Long shopAssetUserRuleId){
		this.shopAssetUserRuleId = shopAssetUserRuleId;
	}

	public void shopAssetUserRuleId(String multirequestToken){
		setToken("shopAssetUserRuleId", multirequestToken);
	}

	// fileName:
	public String getFileName(){
		return this.fileName;
	}
	public void setFileName(String fileName){
		this.fileName = fileName;
	}

	public void fileName(String multirequestToken){
		setToken("fileName", multirequestToken);
	}

	// ingestDate:
	public Long getIngestDate(){
		return this.ingestDate;
	}
	public void setIngestDate(Long ingestDate){
		this.ingestDate = ingestDate;
	}

	public void ingestDate(String multirequestToken){
		setToken("ingestDate", multirequestToken);
	}

	// status:
	public VodIngestAssetResultStatus getStatus(){
		return this.status;
	}
	public void setStatus(VodIngestAssetResultStatus status){
		this.status = status;
	}

	public void status(String multirequestToken){
		setToken("status", multirequestToken);
	}

	// vodTypeSystemName:
	public String getVodTypeSystemName(){
		return this.vodTypeSystemName;
	}
	public void setVodTypeSystemName(String vodTypeSystemName){
		this.vodTypeSystemName = vodTypeSystemName;
	}

	public void vodTypeSystemName(String multirequestToken){
		setToken("vodTypeSystemName", multirequestToken);
	}

	// errors:
	public List<VodIngestAssetResultErrorMessage> getErrors(){
		return this.errors;
	}
	public void setErrors(List<VodIngestAssetResultErrorMessage> errors){
		this.errors = errors;
	}

	// warnings:
	public List<VodIngestAssetResultErrorMessage> getWarnings(){
		return this.warnings;
	}
	public void setWarnings(List<VodIngestAssetResultErrorMessage> warnings){
		this.warnings = warnings;
	}


	public VodIngestAssetResult() {
		super();
	}

	public VodIngestAssetResult(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		assetName = GsonParser.parseString(jsonObject.get("assetName"));
		shopAssetUserRuleId = GsonParser.parseLong(jsonObject.get("shopAssetUserRuleId"));
		fileName = GsonParser.parseString(jsonObject.get("fileName"));
		ingestDate = GsonParser.parseLong(jsonObject.get("ingestDate"));
		status = VodIngestAssetResultStatus.get(GsonParser.parseString(jsonObject.get("status")));
		vodTypeSystemName = GsonParser.parseString(jsonObject.get("vodTypeSystemName"));
		errors = GsonParser.parseArray(jsonObject.getAsJsonArray("errors"), VodIngestAssetResultErrorMessage.class);
		warnings = GsonParser.parseArray(jsonObject.getAsJsonArray("warnings"), VodIngestAssetResultErrorMessage.class);

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaVodIngestAssetResult");
		kparams.add("assetName", this.assetName);
		kparams.add("shopAssetUserRuleId", this.shopAssetUserRuleId);
		kparams.add("fileName", this.fileName);
		kparams.add("ingestDate", this.ingestDate);
		kparams.add("status", this.status);
		kparams.add("vodTypeSystemName", this.vodTypeSystemName);
		kparams.add("errors", this.errors);
		kparams.add("warnings", this.warnings);
		return kparams;
	}


    public static final Creator<VodIngestAssetResult> CREATOR = new Creator<VodIngestAssetResult>() {
        @Override
        public VodIngestAssetResult createFromParcel(Parcel source) {
            return new VodIngestAssetResult(source);
        }

        @Override
        public VodIngestAssetResult[] newArray(int size) {
            return new VodIngestAssetResult[size];
        }
    };

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        super.writeToParcel(dest, flags);
        dest.writeString(this.assetName);
        dest.writeValue(this.shopAssetUserRuleId);
        dest.writeString(this.fileName);
        dest.writeValue(this.ingestDate);
        dest.writeInt(this.status == null ? -1 : this.status.ordinal());
        dest.writeString(this.vodTypeSystemName);
        if(this.errors != null) {
            dest.writeInt(this.errors.size());
            dest.writeList(this.errors);
        } else {
            dest.writeInt(-1);
        }
        if(this.warnings != null) {
            dest.writeInt(this.warnings.size());
            dest.writeList(this.warnings);
        } else {
            dest.writeInt(-1);
        }
    }

    public VodIngestAssetResult(Parcel in) {
        super(in);
        this.assetName = in.readString();
        this.shopAssetUserRuleId = (Long)in.readValue(Long.class.getClassLoader());
        this.fileName = in.readString();
        this.ingestDate = (Long)in.readValue(Long.class.getClassLoader());
        int tmpStatus = in.readInt();
        this.status = tmpStatus == -1 ? null : VodIngestAssetResultStatus.values()[tmpStatus];
        this.vodTypeSystemName = in.readString();
        int errorsSize = in.readInt();
        if( errorsSize > -1) {
            this.errors = new ArrayList<>();
            in.readList(this.errors, VodIngestAssetResultErrorMessage.class.getClassLoader());
        }
        int warningsSize = in.readInt();
        if( warningsSize > -1) {
            this.warnings = new ArrayList<>();
            in.readList(this.warnings, VodIngestAssetResultErrorMessage.class.getClassLoader());
        }
    }
}

