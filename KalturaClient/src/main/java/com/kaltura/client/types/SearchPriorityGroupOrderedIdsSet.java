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

/**
 * This class was generated using exec.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

@SuppressWarnings("serial")
@MultiRequestBuilder.Tokenizer(SearchPriorityGroupOrderedIdsSet.Tokenizer.class)
public class SearchPriorityGroupOrderedIdsSet extends ObjectBase {
	
	public interface Tokenizer extends ObjectBase.Tokenizer {
		String priorityGroupIds();
	}

	/**
	 * The order and effectively the priority of each group.
	 */
	private String priorityGroupIds;

	// priorityGroupIds:
	public String getPriorityGroupIds(){
		return this.priorityGroupIds;
	}
	public void setPriorityGroupIds(String priorityGroupIds){
		this.priorityGroupIds = priorityGroupIds;
	}

	public void priorityGroupIds(String multirequestToken){
		setToken("priorityGroupIds", multirequestToken);
	}


	public SearchPriorityGroupOrderedIdsSet() {
		super();
	}

	public SearchPriorityGroupOrderedIdsSet(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		priorityGroupIds = GsonParser.parseString(jsonObject.get("priorityGroupIds"));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaSearchPriorityGroupOrderedIdsSet");
		kparams.add("priorityGroupIds", this.priorityGroupIds);
		return kparams;
	}


    public static final Creator<SearchPriorityGroupOrderedIdsSet> CREATOR = new Creator<SearchPriorityGroupOrderedIdsSet>() {
        @Override
        public SearchPriorityGroupOrderedIdsSet createFromParcel(Parcel source) {
            return new SearchPriorityGroupOrderedIdsSet(source);
        }

        @Override
        public SearchPriorityGroupOrderedIdsSet[] newArray(int size) {
            return new SearchPriorityGroupOrderedIdsSet[size];
        }
    };

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        super.writeToParcel(dest, flags);
        dest.writeString(this.priorityGroupIds);
    }

    public SearchPriorityGroupOrderedIdsSet(Parcel in) {
        super(in);
        this.priorityGroupIds = in.readString();
    }
}

