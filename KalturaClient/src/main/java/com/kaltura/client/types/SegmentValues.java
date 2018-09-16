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
// Copyright (C) 2006-2018  Kaltura Inc.
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
import com.kaltura.client.types.SegmentSource;
import com.kaltura.client.utils.GsonParser;
import com.kaltura.client.utils.request.MultiRequestBuilder;
import com.kaltura.client.utils.request.RequestBuilder;
import java.util.ArrayList;
import java.util.List;

/**
 * This class was generated using clients-generator\exec.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

/**
 * Segmentation type which takes certain values of a tag/meta as segments
 */
@SuppressWarnings("serial")
@MultiRequestBuilder.Tokenizer(SegmentValues.Tokenizer.class)
public class SegmentValues extends BaseSegmentValue {
	
	public interface Tokenizer extends BaseSegmentValue.Tokenizer {
		SegmentSource.Tokenizer source();
		RequestBuilder.ListTokenizer<SegmentValue.Tokenizer> values();
	}

	/**
	 * Segment values source
	 */
	private SegmentSource source;
	/**
	 * List of segment values
	 */
	private List<SegmentValue> values;

	// source:
	public SegmentSource getSource(){
		return this.source;
	}
	public void setSource(SegmentSource source){
		this.source = source;
	}

	// values:
	public List<SegmentValue> getValues(){
		return this.values;
	}
	public void setValues(List<SegmentValue> values){
		this.values = values;
	}


	public SegmentValues() {
		super();
	}

	public SegmentValues(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		source = GsonParser.parseObject(jsonObject.getAsJsonObject("source"), SegmentSource.class);
		values = GsonParser.parseArray(jsonObject.getAsJsonArray("values"), SegmentValue.class);

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaSegmentValues");
		kparams.add("source", this.source);
		kparams.add("values", this.values);
		return kparams;
	}


    public static final Creator<SegmentValues> CREATOR = new Creator<SegmentValues>() {
        @Override
        public SegmentValues createFromParcel(Parcel source) {
            return new SegmentValues(source);
        }

        @Override
        public SegmentValues[] newArray(int size) {
            return new SegmentValues[size];
        }
    };

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        super.writeToParcel(dest, flags);
        dest.writeParcelable(this.source, flags);
        if(this.values != null) {
            dest.writeInt(this.values.size());
            dest.writeList(this.values);
        } else {
            dest.writeInt(-1);
        }
    }

    public SegmentValues(Parcel in) {
        super(in);
        this.source = in.readParcelable(SegmentSource.class.getClassLoader());
        int valuesSize = in.readInt();
        if( valuesSize > -1) {
            this.values = new ArrayList<>();
            in.readList(this.values, SegmentValue.class.getClassLoader());
        }
    }
}

