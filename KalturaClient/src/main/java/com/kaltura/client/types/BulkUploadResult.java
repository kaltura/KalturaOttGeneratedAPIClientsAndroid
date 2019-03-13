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
import com.kaltura.client.enums.BulkUploadResultStatus;
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
 * Bulk Upload Result
 */
@SuppressWarnings("serial")
@MultiRequestBuilder.Tokenizer(BulkUploadResult.Tokenizer.class)
public abstract class BulkUploadResult extends ObjectBase {
	
	public interface Tokenizer extends ObjectBase.Tokenizer {
		String objectId();
		String index();
		String bulkUploadId();
		String status();
		String errorCode();
		String errorMessage();
		RequestBuilder.ListTokenizer<Message.Tokenizer> warnings();
	}

	/**
	 * the result ObjectId (assetId, userId etc)
	 */
	private Long objectId;
	/**
	 * result index
	 */
	private Integer index;
	/**
	 * Bulk upload identifier
	 */
	private Long bulkUploadId;
	/**
	 * status
	 */
	private BulkUploadResultStatus status;
	/**
	 * Error Code
	 */
	private Integer errorCode;
	/**
	 * Error Message
	 */
	private String errorMessage;
	/**
	 * A list of warnings
	 */
	private List<Message> warnings;

	// objectId:
	public Long getObjectId(){
		return this.objectId;
	}
	// index:
	public Integer getIndex(){
		return this.index;
	}
	// bulkUploadId:
	public Long getBulkUploadId(){
		return this.bulkUploadId;
	}
	// status:
	public BulkUploadResultStatus getStatus(){
		return this.status;
	}
	// errorCode:
	public Integer getErrorCode(){
		return this.errorCode;
	}
	// errorMessage:
	public String getErrorMessage(){
		return this.errorMessage;
	}
	// warnings:
	public List<Message> getWarnings(){
		return this.warnings;
	}

	public BulkUploadResult() {
		super();
	}

	public BulkUploadResult(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		objectId = GsonParser.parseLong(jsonObject.get("objectId"));
		index = GsonParser.parseInt(jsonObject.get("index"));
		bulkUploadId = GsonParser.parseLong(jsonObject.get("bulkUploadId"));
		status = BulkUploadResultStatus.get(GsonParser.parseString(jsonObject.get("status")));
		errorCode = GsonParser.parseInt(jsonObject.get("errorCode"));
		errorMessage = GsonParser.parseString(jsonObject.get("errorMessage"));
		warnings = GsonParser.parseArray(jsonObject.getAsJsonArray("warnings"), Message.class);

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaBulkUploadResult");
		return kparams;
	}


    @Override
    public void writeToParcel(Parcel dest, int flags) {
        super.writeToParcel(dest, flags);
        dest.writeValue(this.objectId);
        dest.writeValue(this.index);
        dest.writeValue(this.bulkUploadId);
        dest.writeInt(this.status == null ? -1 : this.status.ordinal());
        dest.writeValue(this.errorCode);
        dest.writeString(this.errorMessage);
        if(this.warnings != null) {
            dest.writeInt(this.warnings.size());
            dest.writeList(this.warnings);
        } else {
            dest.writeInt(-1);
        }
    }

    public BulkUploadResult(Parcel in) {
        super(in);
        this.objectId = (Long)in.readValue(Long.class.getClassLoader());
        this.index = (Integer)in.readValue(Integer.class.getClassLoader());
        this.bulkUploadId = (Long)in.readValue(Long.class.getClassLoader());
        int tmpStatus = in.readInt();
        this.status = tmpStatus == -1 ? null : BulkUploadResultStatus.values()[tmpStatus];
        this.errorCode = (Integer)in.readValue(Integer.class.getClassLoader());
        this.errorMessage = in.readString();
        int warningsSize = in.readInt();
        if( warningsSize > -1) {
            this.warnings = new ArrayList<>();
            in.readList(this.warnings, Message.class.getClassLoader());
        }
    }
}

