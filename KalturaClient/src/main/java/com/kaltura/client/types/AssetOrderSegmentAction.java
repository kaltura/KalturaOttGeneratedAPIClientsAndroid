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
import com.kaltura.client.utils.request.RequestBuilder;
import java.util.ArrayList;
import java.util.List;

/**
 * This class was generated using exec.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

/**
 * Asset order segment action
 */
@SuppressWarnings("serial")
@MultiRequestBuilder.Tokenizer(AssetOrderSegmentAction.Tokenizer.class)
public class AssetOrderSegmentAction extends BaseSegmentAction {
	
	public interface Tokenizer extends BaseSegmentAction.Tokenizer {
		String name();
		RequestBuilder.ListTokenizer<StringValue.Tokenizer> values();
	}

	/**
	 * Action name
	 */
	private String name;
	/**
	 * Action values
	 */
	private List<StringValue> values;

	// name:
	public String getName(){
		return this.name;
	}
	public void setName(String name){
		this.name = name;
	}

	public void name(String multirequestToken){
		setToken("name", multirequestToken);
	}

	// values:
	public List<StringValue> getValues(){
		return this.values;
	}
	public void setValues(List<StringValue> values){
		this.values = values;
	}


	public AssetOrderSegmentAction() {
		super();
	}

	public AssetOrderSegmentAction(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		name = GsonParser.parseString(jsonObject.get("name"));
		values = GsonParser.parseArray(jsonObject.getAsJsonArray("values"), StringValue.class);

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaAssetOrderSegmentAction");
		kparams.add("name", this.name);
		kparams.add("values", this.values);
		return kparams;
	}


    public static final Creator<AssetOrderSegmentAction> CREATOR = new Creator<AssetOrderSegmentAction>() {
        @Override
        public AssetOrderSegmentAction createFromParcel(Parcel source) {
            return new AssetOrderSegmentAction(source);
        }

        @Override
        public AssetOrderSegmentAction[] newArray(int size) {
            return new AssetOrderSegmentAction[size];
        }
    };

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        super.writeToParcel(dest, flags);
        dest.writeString(this.name);
        if(this.values != null) {
            dest.writeInt(this.values.size());
            dest.writeList(this.values);
        } else {
            dest.writeInt(-1);
        }
    }

    public AssetOrderSegmentAction(Parcel in) {
        super(in);
        this.name = in.readString();
        int valuesSize = in.readInt();
        if( valuesSize > -1) {
            this.values = new ArrayList<>();
            in.readList(this.values, StringValue.class.getClassLoader());
        }
    }
}

