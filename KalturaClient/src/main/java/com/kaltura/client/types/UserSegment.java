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
import com.kaltura.client.types.ObjectBase;
import com.kaltura.client.utils.GsonParser;
import com.kaltura.client.utils.request.MultiRequestBuilder;

/**
 * This class was generated using exec.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

/**
 * Indicates a segment of a user
 */
@SuppressWarnings("serial")
@MultiRequestBuilder.Tokenizer(UserSegment.Tokenizer.class)
public class UserSegment extends ObjectBase {
	
	public interface Tokenizer extends ObjectBase.Tokenizer {
		String segmentId();
		String segmentationTypeId();
		String userId();
	}

	/**
	 * Segment Id
	 */
	private Long segmentId;
	/**
	 * Segmentation type Id
	 */
	private Long segmentationTypeId;
	/**
	 * User Id of segment
	 */
	private String userId;

	// segmentId:
	public Long getSegmentId(){
		return this.segmentId;
	}
	public void setSegmentId(Long segmentId){
		this.segmentId = segmentId;
	}

	public void segmentId(String multirequestToken){
		setToken("segmentId", multirequestToken);
	}

	// segmentationTypeId:
	public Long getSegmentationTypeId(){
		return this.segmentationTypeId;
	}
	public void setSegmentationTypeId(Long segmentationTypeId){
		this.segmentationTypeId = segmentationTypeId;
	}

	public void segmentationTypeId(String multirequestToken){
		setToken("segmentationTypeId", multirequestToken);
	}

	// userId:
	public String getUserId(){
		return this.userId;
	}
	public void setUserId(String userId){
		this.userId = userId;
	}

	public void userId(String multirequestToken){
		setToken("userId", multirequestToken);
	}


	public UserSegment() {
		super();
	}

	public UserSegment(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		segmentId = GsonParser.parseLong(jsonObject.get("segmentId"));
		segmentationTypeId = GsonParser.parseLong(jsonObject.get("segmentationTypeId"));
		userId = GsonParser.parseString(jsonObject.get("userId"));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaUserSegment");
		kparams.add("segmentId", this.segmentId);
		kparams.add("segmentationTypeId", this.segmentationTypeId);
		kparams.add("userId", this.userId);
		return kparams;
	}


    public static final Creator<UserSegment> CREATOR = new Creator<UserSegment>() {
        @Override
        public UserSegment createFromParcel(Parcel source) {
            return new UserSegment(source);
        }

        @Override
        public UserSegment[] newArray(int size) {
            return new UserSegment[size];
        }
    };

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        super.writeToParcel(dest, flags);
        dest.writeValue(this.segmentId);
        dest.writeValue(this.segmentationTypeId);
        dest.writeString(this.userId);
    }

    public UserSegment(Parcel in) {
        super(in);
        this.segmentId = (Long)in.readValue(Long.class.getClassLoader());
        this.segmentationTypeId = (Long)in.readValue(Long.class.getClassLoader());
        this.userId = in.readString();
    }
}

