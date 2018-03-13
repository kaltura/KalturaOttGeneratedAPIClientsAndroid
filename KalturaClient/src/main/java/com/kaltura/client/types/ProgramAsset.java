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
import com.kaltura.client.utils.GsonParser;
import com.kaltura.client.utils.request.MultiRequestBuilder;

/**
 * This class was generated using clients-generator\exec.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

/**
 * Program-asset info
 */
@SuppressWarnings("serial")
@MultiRequestBuilder.Tokenizer(ProgramAsset.Tokenizer.class)
public class ProgramAsset extends Asset {
	
	public interface Tokenizer extends Asset.Tokenizer {
		String epgChannelId();
		String epgId();
		String relatedMediaId();
		String crid();
		String linearAssetId();
	}

	/**
	 * EPG channel identifier
	 */
	private Long epgChannelId;
	/**
	 * EPG identifier
	 */
	private String epgId;
	/**
	 * Ralated media identifier
	 */
	private Long relatedMediaId;
	/**
	 * Unique identifier for the program
	 */
	private String crid;
	/**
	 * Id of linear media asset
	 */
	private Long linearAssetId;

	// epgChannelId:
	public Long getEpgChannelId(){
		return this.epgChannelId;
	}
	public void setEpgChannelId(Long epgChannelId){
		this.epgChannelId = epgChannelId;
	}

	public void epgChannelId(String multirequestToken){
		setToken("epgChannelId", multirequestToken);
	}

	// epgId:
	public String getEpgId(){
		return this.epgId;
	}
	public void setEpgId(String epgId){
		this.epgId = epgId;
	}

	public void epgId(String multirequestToken){
		setToken("epgId", multirequestToken);
	}

	// relatedMediaId:
	public Long getRelatedMediaId(){
		return this.relatedMediaId;
	}
	public void setRelatedMediaId(Long relatedMediaId){
		this.relatedMediaId = relatedMediaId;
	}

	public void relatedMediaId(String multirequestToken){
		setToken("relatedMediaId", multirequestToken);
	}

	// crid:
	public String getCrid(){
		return this.crid;
	}
	public void setCrid(String crid){
		this.crid = crid;
	}

	public void crid(String multirequestToken){
		setToken("crid", multirequestToken);
	}

	// linearAssetId:
	public Long getLinearAssetId(){
		return this.linearAssetId;
	}
	public void setLinearAssetId(Long linearAssetId){
		this.linearAssetId = linearAssetId;
	}

	public void linearAssetId(String multirequestToken){
		setToken("linearAssetId", multirequestToken);
	}


	public ProgramAsset() {
		super();
	}

	public ProgramAsset(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		epgChannelId = GsonParser.parseLong(jsonObject.get("epgChannelId"));
		epgId = GsonParser.parseString(jsonObject.get("epgId"));
		relatedMediaId = GsonParser.parseLong(jsonObject.get("relatedMediaId"));
		crid = GsonParser.parseString(jsonObject.get("crid"));
		linearAssetId = GsonParser.parseLong(jsonObject.get("linearAssetId"));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaProgramAsset");
		kparams.add("epgChannelId", this.epgChannelId);
		kparams.add("epgId", this.epgId);
		kparams.add("relatedMediaId", this.relatedMediaId);
		kparams.add("crid", this.crid);
		kparams.add("linearAssetId", this.linearAssetId);
		return kparams;
	}


    public static final Creator<ProgramAsset> CREATOR = new Creator<ProgramAsset>() {
        @Override
        public ProgramAsset createFromParcel(Parcel source) {
            return new ProgramAsset(source);
        }

        @Override
        public ProgramAsset[] newArray(int size) {
            return new ProgramAsset[size];
        }
    };

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        super.writeToParcel(dest, flags);
        dest.writeValue(this.epgChannelId);
        dest.writeString(this.epgId);
        dest.writeValue(this.relatedMediaId);
        dest.writeString(this.crid);
        dest.writeValue(this.linearAssetId);
    }

    public ProgramAsset(Parcel in) {
        super(in);
        this.epgChannelId = (Long)in.readValue(Long.class.getClassLoader());
        this.epgId = in.readString();
        this.relatedMediaId = (Long)in.readValue(Long.class.getClassLoader());
        this.crid = in.readString();
        this.linearAssetId = (Long)in.readValue(Long.class.getClassLoader());
    }
}

