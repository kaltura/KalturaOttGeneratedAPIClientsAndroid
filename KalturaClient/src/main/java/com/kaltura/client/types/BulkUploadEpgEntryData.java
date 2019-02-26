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
import com.kaltura.client.utils.request.MultiRequestBuilder;

/**
 * This class was generated using exec.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

/**
 * instractions for upload epg asset values
 */
@SuppressWarnings("serial")
@MultiRequestBuilder.Tokenizer(BulkUploadEpgEntryData.Tokenizer.class)
public class BulkUploadEpgEntryData extends BulkUploadAssetEntryData {
	
	public interface Tokenizer extends BulkUploadAssetEntryData.Tokenizer {
	}



	public BulkUploadEpgEntryData() {
		super();
	}

	public BulkUploadEpgEntryData(JsonObject jsonObject) throws APIException {
		super(jsonObject);
	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaBulkUploadEpgEntryData");
		return kparams;
	}


    public static final Creator<BulkUploadEpgEntryData> CREATOR = new Creator<BulkUploadEpgEntryData>() {
        @Override
        public BulkUploadEpgEntryData createFromParcel(Parcel source) {
            return new BulkUploadEpgEntryData(source);
        }

        @Override
        public BulkUploadEpgEntryData[] newArray(int size) {
            return new BulkUploadEpgEntryData[size];
        }
    };

    public BulkUploadEpgEntryData(Parcel in) {
        super(in);
    }
}

