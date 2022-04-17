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
@MultiRequestBuilder.Tokenizer(IngestProgramResultsByProgramIdsFilter.Tokenizer.class)
public class IngestProgramResultsByProgramIdsFilter extends IngestEpgProgramResultFilter {
	
	public interface Tokenizer extends IngestEpgProgramResultFilter.Tokenizer {
		String programIdIn();
	}

	/**
	 * Comma seperated program id (the unique ingested program id as it determined by
	  Kaltura BE).              Up to 20 ids are allowed.
	 */
	private String programIdIn;

	// programIdIn:
	public String getProgramIdIn(){
		return this.programIdIn;
	}
	public void setProgramIdIn(String programIdIn){
		this.programIdIn = programIdIn;
	}

	public void programIdIn(String multirequestToken){
		setToken("programIdIn", multirequestToken);
	}


	public IngestProgramResultsByProgramIdsFilter() {
		super();
	}

	public IngestProgramResultsByProgramIdsFilter(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		programIdIn = GsonParser.parseString(jsonObject.get("programIdIn"));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaIngestProgramResultsByProgramIdsFilter");
		kparams.add("programIdIn", this.programIdIn);
		return kparams;
	}


    public static final Creator<IngestProgramResultsByProgramIdsFilter> CREATOR = new Creator<IngestProgramResultsByProgramIdsFilter>() {
        @Override
        public IngestProgramResultsByProgramIdsFilter createFromParcel(Parcel source) {
            return new IngestProgramResultsByProgramIdsFilter(source);
        }

        @Override
        public IngestProgramResultsByProgramIdsFilter[] newArray(int size) {
            return new IngestProgramResultsByProgramIdsFilter[size];
        }
    };

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        super.writeToParcel(dest, flags);
        dest.writeString(this.programIdIn);
    }

    public IngestProgramResultsByProgramIdsFilter(Parcel in) {
        super(in);
        this.programIdIn = in.readString();
    }
}

