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
import com.kaltura.client.utils.GsonParser;
import com.kaltura.client.utils.request.MultiRequestBuilder;

/**
 * This class was generated using exec.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

/**
 * instructions for upload data type with xml
 */
@SuppressWarnings("serial")
@MultiRequestBuilder.Tokenizer(BulkUploadIngestJobData.Tokenizer.class)
public class BulkUploadIngestJobData extends BulkUploadJobData {
	
	public interface Tokenizer extends BulkUploadJobData.Tokenizer {
		String ingestProfileId();
	}

	/**
	 * Identifies the ingest profile that will handle the ingest of programs           
	    Ingest profiles are created separately using the ingest profile service
	 */
	private Integer ingestProfileId;

	// ingestProfileId:
	public Integer getIngestProfileId(){
		return this.ingestProfileId;
	}
	public void setIngestProfileId(Integer ingestProfileId){
		this.ingestProfileId = ingestProfileId;
	}

	public void ingestProfileId(String multirequestToken){
		setToken("ingestProfileId", multirequestToken);
	}


	public BulkUploadIngestJobData() {
		super();
	}

	public BulkUploadIngestJobData(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		ingestProfileId = GsonParser.parseInt(jsonObject.get("ingestProfileId"));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaBulkUploadIngestJobData");
		kparams.add("ingestProfileId", this.ingestProfileId);
		return kparams;
	}


    public static final Creator<BulkUploadIngestJobData> CREATOR = new Creator<BulkUploadIngestJobData>() {
        @Override
        public BulkUploadIngestJobData createFromParcel(Parcel source) {
            return new BulkUploadIngestJobData(source);
        }

        @Override
        public BulkUploadIngestJobData[] newArray(int size) {
            return new BulkUploadIngestJobData[size];
        }
    };

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        super.writeToParcel(dest, flags);
        dest.writeValue(this.ingestProfileId);
    }

    public BulkUploadIngestJobData(Parcel in) {
        super(in);
        this.ingestProfileId = (Integer)in.readValue(Integer.class.getClassLoader());
    }
}

