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
import com.kaltura.client.types.BulkUploadEntryData;
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
 * instractions for upload data type
 */
@SuppressWarnings("serial")
@MultiRequestBuilder.Tokenizer(BulkUploadJobData.Tokenizer.class)
public abstract class BulkUploadJobData extends ObjectBase {
	
	public interface Tokenizer extends ObjectBase.Tokenizer {
		BulkUploadEntryData.Tokenizer entryData();
	}

	/**
	 * EntryData
	 */
	private BulkUploadEntryData entryData;

	// entryData:
	public BulkUploadEntryData getEntryData(){
		return this.entryData;
	}
	public void setEntryData(BulkUploadEntryData entryData){
		this.entryData = entryData;
	}


	public BulkUploadJobData() {
		super();
	}

	public BulkUploadJobData(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		entryData = GsonParser.parseObject(jsonObject.getAsJsonObject("entryData"), BulkUploadEntryData.class);

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaBulkUploadJobData");
		kparams.add("entryData", this.entryData);
		return kparams;
	}


    @Override
    public void writeToParcel(Parcel dest, int flags) {
        super.writeToParcel(dest, flags);
        dest.writeParcelable(this.entryData, flags);
    }

    public BulkUploadJobData(Parcel in) {
        super(in);
        this.entryData = in.readParcelable(BulkUploadEntryData.class.getClassLoader());
    }
}

