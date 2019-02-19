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
import com.kaltura.client.utils.GsonParser;
import com.kaltura.client.utils.request.MultiRequestBuilder;

/**
 * This class was generated using exec.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

/**
 * Segmentation type which takes all values of a tag/meta as segments
 */
@SuppressWarnings("serial")
@MultiRequestBuilder.Tokenizer(SegmentAllValues.Tokenizer.class)
public class SegmentAllValues extends SegmentValues {
	
	public interface Tokenizer extends SegmentValues.Tokenizer {
		String nameFormat();
	}

	/**
	 * Segment names&amp;#39; format - they will be automatically generated
	 */
	private String nameFormat;

	// nameFormat:
	public String getNameFormat(){
		return this.nameFormat;
	}
	public void setNameFormat(String nameFormat){
		this.nameFormat = nameFormat;
	}

	public void nameFormat(String multirequestToken){
		setToken("nameFormat", multirequestToken);
	}


	public SegmentAllValues() {
		super();
	}

	public SegmentAllValues(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		nameFormat = GsonParser.parseString(jsonObject.get("nameFormat"));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaSegmentAllValues");
		kparams.add("nameFormat", this.nameFormat);
		return kparams;
	}


    public static final Creator<SegmentAllValues> CREATOR = new Creator<SegmentAllValues>() {
        @Override
        public SegmentAllValues createFromParcel(Parcel source) {
            return new SegmentAllValues(source);
        }

        @Override
        public SegmentAllValues[] newArray(int size) {
            return new SegmentAllValues[size];
        }
    };

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        super.writeToParcel(dest, flags);
        dest.writeString(this.nameFormat);
    }

    public SegmentAllValues(Parcel in) {
        super(in);
        this.nameFormat = in.readString();
    }
}

