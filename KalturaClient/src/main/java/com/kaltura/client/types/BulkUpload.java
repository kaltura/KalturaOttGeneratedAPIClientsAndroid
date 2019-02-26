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
import com.kaltura.client.enums.BatchUploadJobAction;
import com.kaltura.client.enums.BatchUploadJobStatus;
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
 * Bulk Upload
 */
@SuppressWarnings("serial")
@MultiRequestBuilder.Tokenizer(BulkUpload.Tokenizer.class)
public class BulkUpload extends ObjectBase {
	
	public interface Tokenizer extends ObjectBase.Tokenizer {
		String id();
		String status();
		String createDate();
		String updateDate();
		String uploadTokenId();
		String action();
		RequestBuilder.ListTokenizer<BulkUploadResult.Tokenizer> results();
	}

	/**
	 * Bulk identifier
	 */
	private Long id;
	/**
	 * Status
	 */
	private BatchUploadJobStatus status;
	/**
	 * Specifies when was the bulk action created. Date and time represented as epoch
	 */
	private Long createDate;
	/**
	 * Specifies when was the bulk action last updated. Date and time represented as
	  epoch
	 */
	private Long updateDate;
	/**
	 * Upload Token Id
	 */
	private String uploadTokenId;
	/**
	 * Action
	 */
	private BatchUploadJobAction action;
	/**
	 * A list of results
	 */
	private List<BulkUploadResult> results;

	// id:
	public Long getId(){
		return this.id;
	}
	// status:
	public BatchUploadJobStatus getStatus(){
		return this.status;
	}
	// createDate:
	public Long getCreateDate(){
		return this.createDate;
	}
	// updateDate:
	public Long getUpdateDate(){
		return this.updateDate;
	}
	// uploadTokenId:
	public String getUploadTokenId(){
		return this.uploadTokenId;
	}
	// action:
	public BatchUploadJobAction getAction(){
		return this.action;
	}
	// results:
	public List<BulkUploadResult> getResults(){
		return this.results;
	}

	public BulkUpload() {
		super();
	}

	public BulkUpload(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		id = GsonParser.parseLong(jsonObject.get("id"));
		status = BatchUploadJobStatus.get(GsonParser.parseString(jsonObject.get("status")));
		createDate = GsonParser.parseLong(jsonObject.get("createDate"));
		updateDate = GsonParser.parseLong(jsonObject.get("updateDate"));
		uploadTokenId = GsonParser.parseString(jsonObject.get("uploadTokenId"));
		action = BatchUploadJobAction.get(GsonParser.parseString(jsonObject.get("action")));
		results = GsonParser.parseArray(jsonObject.getAsJsonArray("results"), BulkUploadResult.class);

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaBulkUpload");
		return kparams;
	}


    public static final Creator<BulkUpload> CREATOR = new Creator<BulkUpload>() {
        @Override
        public BulkUpload createFromParcel(Parcel source) {
            return new BulkUpload(source);
        }

        @Override
        public BulkUpload[] newArray(int size) {
            return new BulkUpload[size];
        }
    };

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        super.writeToParcel(dest, flags);
        dest.writeValue(this.id);
        dest.writeInt(this.status == null ? -1 : this.status.ordinal());
        dest.writeValue(this.createDate);
        dest.writeValue(this.updateDate);
        dest.writeString(this.uploadTokenId);
        dest.writeInt(this.action == null ? -1 : this.action.ordinal());
        if(this.results != null) {
            dest.writeInt(this.results.size());
            dest.writeList(this.results);
        } else {
            dest.writeInt(-1);
        }
    }

    public BulkUpload(Parcel in) {
        super(in);
        this.id = (Long)in.readValue(Long.class.getClassLoader());
        int tmpStatus = in.readInt();
        this.status = tmpStatus == -1 ? null : BatchUploadJobStatus.values()[tmpStatus];
        this.createDate = (Long)in.readValue(Long.class.getClassLoader());
        this.updateDate = (Long)in.readValue(Long.class.getClassLoader());
        this.uploadTokenId = in.readString();
        int tmpAction = in.readInt();
        this.action = tmpAction == -1 ? null : BatchUploadJobAction.values()[tmpAction];
        int resultsSize = in.readInt();
        if( resultsSize > -1) {
            this.results = new ArrayList<>();
            in.readList(this.results, BulkUploadResult.class.getClassLoader());
        }
    }
}

