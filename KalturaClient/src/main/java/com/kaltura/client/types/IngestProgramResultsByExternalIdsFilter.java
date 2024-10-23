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

@SuppressWarnings("serial")
@MultiRequestBuilder.Tokenizer(IngestProgramResultsByExternalIdsFilter.Tokenizer.class)
public class IngestProgramResultsByExternalIdsFilter extends IngestEpgProgramResultFilter {
	
	public interface Tokenizer extends IngestEpgProgramResultFilter.Tokenizer {
		String externalProgramIdIn();
	}

	/**
	 * Comma seperated external program id.              Up to 20 ids are allowed.
	 */
	private String externalProgramIdIn;

	// externalProgramIdIn:
	public String getExternalProgramIdIn(){
		return this.externalProgramIdIn;
	}
	public void setExternalProgramIdIn(String externalProgramIdIn){
		this.externalProgramIdIn = externalProgramIdIn;
	}

	public void externalProgramIdIn(String multirequestToken){
		setToken("externalProgramIdIn", multirequestToken);
	}


	public IngestProgramResultsByExternalIdsFilter() {
		super();
	}

	public IngestProgramResultsByExternalIdsFilter(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		externalProgramIdIn = GsonParser.parseString(jsonObject.get("externalProgramIdIn"));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaIngestProgramResultsByExternalIdsFilter");
		kparams.add("externalProgramIdIn", this.externalProgramIdIn);
		return kparams;
	}


    public static final Creator<IngestProgramResultsByExternalIdsFilter> CREATOR = new Creator<IngestProgramResultsByExternalIdsFilter>() {
        @Override
        public IngestProgramResultsByExternalIdsFilter createFromParcel(Parcel source) {
            return new IngestProgramResultsByExternalIdsFilter(source);
        }

        @Override
        public IngestProgramResultsByExternalIdsFilter[] newArray(int size) {
            return new IngestProgramResultsByExternalIdsFilter[size];
        }
    };

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        super.writeToParcel(dest, flags);
        dest.writeString(this.externalProgramIdIn);
    }

    public IngestProgramResultsByExternalIdsFilter(Parcel in) {
        super(in);
        this.externalProgramIdIn = in.readString();
    }
}

