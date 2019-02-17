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
import com.kaltura.client.enums.RecordingStatus;
import com.kaltura.client.enums.RecordingType;
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
@MultiRequestBuilder.Tokenizer(Recording.Tokenizer.class)
public class Recording extends ObjectBase {
	
	public interface Tokenizer extends ObjectBase.Tokenizer {
		String id();
		String status();
		String assetId();
		String type();
		String viewableUntilDate();
		String isProtected();
		String createDate();
		String updateDate();
	}

	/**
	 * Kaltura unique ID representing the recording identifier
	 */
	private Long id;
	/**
	 * Recording state: scheduled/recording/recorded/canceled/failed/deleted
	 */
	private RecordingStatus status;
	/**
	 * Kaltura unique ID representing the program identifier
	 */
	private Long assetId;
	/**
	 * Recording Type: single/season/series
	 */
	private RecordingType type;
	/**
	 * Specifies until when the recording is available for viewing. Date and time
	  represented as epoch.
	 */
	private Long viewableUntilDate;
	/**
	 * Specifies whether or not the recording is protected
	 */
	private Boolean isProtected;
	/**
	 * Specifies when was the recording created. Date and time represented as epoch.
	 */
	private Long createDate;
	/**
	 * Specifies when was the recording last updated. Date and time represented as
	  epoch.
	 */
	private Long updateDate;

	// id:
	public Long getId(){
		return this.id;
	}
	// status:
	public RecordingStatus getStatus(){
		return this.status;
	}
	// assetId:
	public Long getAssetId(){
		return this.assetId;
	}
	public void setAssetId(Long assetId){
		this.assetId = assetId;
	}

	public void assetId(String multirequestToken){
		setToken("assetId", multirequestToken);
	}

	// type:
	public RecordingType getType(){
		return this.type;
	}
	public void setType(RecordingType type){
		this.type = type;
	}

	public void type(String multirequestToken){
		setToken("type", multirequestToken);
	}

	// viewableUntilDate:
	public Long getViewableUntilDate(){
		return this.viewableUntilDate;
	}
	public void setViewableUntilDate(Long viewableUntilDate){
		this.viewableUntilDate = viewableUntilDate;
	}

	public void viewableUntilDate(String multirequestToken){
		setToken("viewableUntilDate", multirequestToken);
	}

	// isProtected:
	public Boolean getIsProtected(){
		return this.isProtected;
	}
	public void setIsProtected(Boolean isProtected){
		this.isProtected = isProtected;
	}

	public void isProtected(String multirequestToken){
		setToken("isProtected", multirequestToken);
	}

	// createDate:
	public Long getCreateDate(){
		return this.createDate;
	}
	// updateDate:
	public Long getUpdateDate(){
		return this.updateDate;
	}

	public Recording() {
		super();
	}

	public Recording(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		id = GsonParser.parseLong(jsonObject.get("id"));
		status = RecordingStatus.get(GsonParser.parseString(jsonObject.get("status")));
		assetId = GsonParser.parseLong(jsonObject.get("assetId"));
		type = RecordingType.get(GsonParser.parseString(jsonObject.get("type")));
		viewableUntilDate = GsonParser.parseLong(jsonObject.get("viewableUntilDate"));
		isProtected = GsonParser.parseBoolean(jsonObject.get("isProtected"));
		createDate = GsonParser.parseLong(jsonObject.get("createDate"));
		updateDate = GsonParser.parseLong(jsonObject.get("updateDate"));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaRecording");
		kparams.add("assetId", this.assetId);
		kparams.add("type", this.type);
		kparams.add("viewableUntilDate", this.viewableUntilDate);
		kparams.add("isProtected", this.isProtected);
		return kparams;
	}


    public static final Creator<Recording> CREATOR = new Creator<Recording>() {
        @Override
        public Recording createFromParcel(Parcel source) {
            return new Recording(source);
        }

        @Override
        public Recording[] newArray(int size) {
            return new Recording[size];
        }
    };

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        super.writeToParcel(dest, flags);
        dest.writeValue(this.id);
        dest.writeInt(this.status == null ? -1 : this.status.ordinal());
        dest.writeValue(this.assetId);
        dest.writeInt(this.type == null ? -1 : this.type.ordinal());
        dest.writeValue(this.viewableUntilDate);
        dest.writeValue(this.isProtected);
        dest.writeValue(this.createDate);
        dest.writeValue(this.updateDate);
    }

    public Recording(Parcel in) {
        super(in);
        this.id = (Long)in.readValue(Long.class.getClassLoader());
        int tmpStatus = in.readInt();
        this.status = tmpStatus == -1 ? null : RecordingStatus.values()[tmpStatus];
        this.assetId = (Long)in.readValue(Long.class.getClassLoader());
        int tmpType = in.readInt();
        this.type = tmpType == -1 ? null : RecordingType.values()[tmpType];
        this.viewableUntilDate = (Long)in.readValue(Long.class.getClassLoader());
        this.isProtected = (Boolean)in.readValue(Boolean.class.getClassLoader());
        this.createDate = (Long)in.readValue(Long.class.getClassLoader());
        this.updateDate = (Long)in.readValue(Long.class.getClassLoader());
    }
}

