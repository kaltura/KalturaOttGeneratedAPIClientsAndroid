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
 * Indicates a segment of a household
 */
@SuppressWarnings("serial")
@MultiRequestBuilder.Tokenizer(HouseholdSegment.Tokenizer.class)
public class HouseholdSegment extends ObjectBase {
	
	public interface Tokenizer extends ObjectBase.Tokenizer {
		String householdId();
		String householdId();
		String blockingSegmentIds();
	}

	/**
	 * Household SegmentId
	 */
	private Long householdId;
	/**
	 * Segment Id
	 */
	private Long householdId;
	/**
	 * Blocking segment Ids
	 */
	private String blockingSegmentIds;

	// householdId:
	public Long getHouseholdId(){
		return this.householdId;
	}
	public void setHouseholdId(Long householdId){
		this.householdId = householdId;
	}

	public void householdId(String multirequestToken){
		setToken("householdId", multirequestToken);
	}

	// householdId:
	public Long getHouseholdId(){
		return this.householdId;
	}
	public void setHouseholdId(Long householdId){
		this.householdId = householdId;
	}

	public void householdId(String multirequestToken){
		setToken("householdId", multirequestToken);
	}

	// blockingSegmentIds:
	public String getBlockingSegmentIds(){
		return this.blockingSegmentIds;
	}
	public void setBlockingSegmentIds(String blockingSegmentIds){
		this.blockingSegmentIds = blockingSegmentIds;
	}

	public void blockingSegmentIds(String multirequestToken){
		setToken("blockingSegmentIds", multirequestToken);
	}


	public HouseholdSegment() {
		super();
	}

	public HouseholdSegment(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		householdId = GsonParser.parseLong(jsonObject.get("householdId"));
		householdId = GsonParser.parseLong(jsonObject.get("householdId"));
		blockingSegmentIds = GsonParser.parseString(jsonObject.get("blockingSegmentIds"));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaHouseholdSegment");
		kparams.add("householdId", this.householdId);
		kparams.add("householdId", this.householdId);
		kparams.add("blockingSegmentIds", this.blockingSegmentIds);
		return kparams;
	}


    public static final Creator<HouseholdSegment> CREATOR = new Creator<HouseholdSegment>() {
        @Override
        public HouseholdSegment createFromParcel(Parcel source) {
            return new HouseholdSegment(source);
        }

        @Override
        public HouseholdSegment[] newArray(int size) {
            return new HouseholdSegment[size];
        }
    };

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        super.writeToParcel(dest, flags);
        dest.writeValue(this.householdId);
        dest.writeValue(this.householdId);
        dest.writeString(this.blockingSegmentIds);
    }

    public HouseholdSegment(Parcel in) {
        super(in);
        this.householdId = (Long)in.readValue(Long.class.getClassLoader());
        this.householdId = (Long)in.readValue(Long.class.getClassLoader());
        this.blockingSegmentIds = in.readString();
    }
}

