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
import com.kaltura.client.enums.UploadTokenStatus;
import com.kaltura.client.types.ObjectBase;
import com.kaltura.client.utils.GsonParser;
import com.kaltura.client.utils.request.MultiRequestBuilder;

/**
 * This class was generated using clients-generator\exec.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

@SuppressWarnings("serial")
@MultiRequestBuilder.Tokenizer(UploadToken.Tokenizer.class)
public class UploadToken extends ObjectBase {
	
	public interface Tokenizer extends ObjectBase.Tokenizer {
		String id();
		String status();
		String fileSize();
		String createDate();
		String updateDate();
	}

	/**
	 * Upload-token identifier
	 */
	private String id;
	/**
	 * Status
	 */
	private UploadTokenStatus status;
	/**
	 * File size
	 */
	private Double fileSize;
	/**
	 * Specifies when was the Asset was created. Date and time represented as epoch.
	 */
	private Long createDate;
	/**
	 * Specifies when was the Asset last updated. Date and time represented as epoch.
	 */
	private Long updateDate;

	// id:
	public String getId(){
		return this.id;
	}
	public void setId(String id){
		this.id = id;
	}

	public void id(String multirequestToken){
		setToken("id", multirequestToken);
	}

	// status:
	public UploadTokenStatus getStatus(){
		return this.status;
	}
	public void setStatus(UploadTokenStatus status){
		this.status = status;
	}

	public void status(String multirequestToken){
		setToken("status", multirequestToken);
	}

	// fileSize:
	public Double getFileSize(){
		return this.fileSize;
	}
	public void setFileSize(Double fileSize){
		this.fileSize = fileSize;
	}

	public void fileSize(String multirequestToken){
		setToken("fileSize", multirequestToken);
	}

	// createDate:
	public Long getCreateDate(){
		return this.createDate;
	}
	public void setCreateDate(Long createDate){
		this.createDate = createDate;
	}

	public void createDate(String multirequestToken){
		setToken("createDate", multirequestToken);
	}

	// updateDate:
	public Long getUpdateDate(){
		return this.updateDate;
	}
	public void setUpdateDate(Long updateDate){
		this.updateDate = updateDate;
	}

	public void updateDate(String multirequestToken){
		setToken("updateDate", multirequestToken);
	}


	public UploadToken() {
		super();
	}

	public UploadToken(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		id = GsonParser.parseString(jsonObject.get("id"));
		status = UploadTokenStatus.get(GsonParser.parseString(jsonObject.get("status")));
		fileSize = GsonParser.parseDouble(jsonObject.get("fileSize"));
		createDate = GsonParser.parseLong(jsonObject.get("createDate"));
		updateDate = GsonParser.parseLong(jsonObject.get("updateDate"));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaUploadToken");
		return kparams;
	}


    public static final Creator<UploadToken> CREATOR = new Creator<UploadToken>() {
        @Override
        public UploadToken createFromParcel(Parcel source) {
            return new UploadToken(source);
        }

        @Override
        public UploadToken[] newArray(int size) {
            return new UploadToken[size];
        }
    };

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        super.writeToParcel(dest, flags);
        dest.writeString(this.id);
        dest.writeInt(this.status == null ? -1 : this.status.ordinal());
        dest.writeValue(this.fileSize);
        dest.writeValue(this.createDate);
        dest.writeValue(this.updateDate);
    }

    public UploadToken(Parcel in) {
        super(in);
        this.id = in.readString();
        int tmpStatus = in.readInt();
        this.status = tmpStatus == -1 ? null : UploadTokenStatus.values()[tmpStatus];
        this.fileSize = (Double)in.readValue(Double.class.getClassLoader());
        this.createDate = (Long)in.readValue(Long.class.getClassLoader());
        this.updateDate = (Long)in.readValue(Long.class.getClassLoader());
    }
}

