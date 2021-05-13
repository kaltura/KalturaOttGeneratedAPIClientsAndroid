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
import com.kaltura.client.types.ObjectBase;
import com.kaltura.client.utils.GsonParser;
import com.kaltura.client.utils.request.MultiRequestBuilder;
import com.kaltura.client.utils.request.RequestBuilder;
import java.util.HashMap;
import java.util.Map;

/**
 * This class was generated using exec.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

/**
 * Category management
 */
@SuppressWarnings("serial")
@MultiRequestBuilder.Tokenizer(CategoryManagement.Tokenizer.class)
public class CategoryManagement extends ObjectBase {
	
	public interface Tokenizer extends ObjectBase.Tokenizer {
		String defaultTreeId();
		RequestBuilder.MapTokenizer<LongValue.Tokenizer> deviceFamilyToCategoryTree();
	}

	/**
	 * Default CategoryVersion tree id
	 */
	private Long defaultTreeId;
	/**
	 * Device family to Category TreeId mapping
	 */
	private Map<String, LongValue> deviceFamilyToCategoryTree;

	// defaultTreeId:
	public Long getDefaultTreeId(){
		return this.defaultTreeId;
	}
	public void setDefaultTreeId(Long defaultTreeId){
		this.defaultTreeId = defaultTreeId;
	}

	public void defaultTreeId(String multirequestToken){
		setToken("defaultTreeId", multirequestToken);
	}

	// deviceFamilyToCategoryTree:
	public Map<String, LongValue> getDeviceFamilyToCategoryTree(){
		return this.deviceFamilyToCategoryTree;
	}
	public void setDeviceFamilyToCategoryTree(Map<String, LongValue> deviceFamilyToCategoryTree){
		this.deviceFamilyToCategoryTree = deviceFamilyToCategoryTree;
	}


	public CategoryManagement() {
		super();
	}

	public CategoryManagement(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		defaultTreeId = GsonParser.parseLong(jsonObject.get("defaultTreeId"));
		deviceFamilyToCategoryTree = GsonParser.parseMap(jsonObject.getAsJsonObject("deviceFamilyToCategoryTree"), LongValue.class);

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaCategoryManagement");
		kparams.add("defaultTreeId", this.defaultTreeId);
		kparams.add("deviceFamilyToCategoryTree", this.deviceFamilyToCategoryTree);
		return kparams;
	}


    public static final Creator<CategoryManagement> CREATOR = new Creator<CategoryManagement>() {
        @Override
        public CategoryManagement createFromParcel(Parcel source) {
            return new CategoryManagement(source);
        }

        @Override
        public CategoryManagement[] newArray(int size) {
            return new CategoryManagement[size];
        }
    };

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        super.writeToParcel(dest, flags);
        dest.writeValue(this.defaultTreeId);
        if(this.deviceFamilyToCategoryTree != null) {
            dest.writeInt(this.deviceFamilyToCategoryTree.size());
            for (Map.Entry<String, LongValue> entry : this.deviceFamilyToCategoryTree.entrySet()) {
                dest.writeString(entry.getKey());
                dest.writeParcelable(entry.getValue(), flags);
            }
        } else {
            dest.writeInt(-1);
        }
    }

    public CategoryManagement(Parcel in) {
        super(in);
        this.defaultTreeId = (Long)in.readValue(Long.class.getClassLoader());
        int deviceFamilyToCategoryTreeSize = in.readInt();
        if( deviceFamilyToCategoryTreeSize > -1) {
            this.deviceFamilyToCategoryTree = new HashMap<>();
            for (int i = 0; i < deviceFamilyToCategoryTreeSize; i++) {
                String key = in.readString();
                LongValue value = in.readParcelable(LongValue.class.getClassLoader());
                this.deviceFamilyToCategoryTree.put(key, value);
            }
        }
    }
}

