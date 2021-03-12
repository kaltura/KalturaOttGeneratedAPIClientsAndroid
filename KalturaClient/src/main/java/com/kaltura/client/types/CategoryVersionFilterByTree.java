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
import com.kaltura.client.enums.CategoryVersionState;
import com.kaltura.client.utils.GsonParser;
import com.kaltura.client.utils.request.MultiRequestBuilder;

/**
 * This class was generated using exec.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

@SuppressWarnings("serial")
@MultiRequestBuilder.Tokenizer(CategoryVersionFilterByTree.Tokenizer.class)
public class CategoryVersionFilterByTree extends CategoryVersionFilter {
	
	public interface Tokenizer extends CategoryVersionFilter.Tokenizer {
		String treeIdEqual();
		String stateEqual();
	}

	/**
	 * Category version tree identifier
	 */
	private Long treeIdEqual;
	/**
	 * Category version state
	 */
	private CategoryVersionState stateEqual;

	// treeIdEqual:
	public Long getTreeIdEqual(){
		return this.treeIdEqual;
	}
	public void setTreeIdEqual(Long treeIdEqual){
		this.treeIdEqual = treeIdEqual;
	}

	public void treeIdEqual(String multirequestToken){
		setToken("treeIdEqual", multirequestToken);
	}

	// stateEqual:
	public CategoryVersionState getStateEqual(){
		return this.stateEqual;
	}
	public void setStateEqual(CategoryVersionState stateEqual){
		this.stateEqual = stateEqual;
	}

	public void stateEqual(String multirequestToken){
		setToken("stateEqual", multirequestToken);
	}


	public CategoryVersionFilterByTree() {
		super();
	}

	public CategoryVersionFilterByTree(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		treeIdEqual = GsonParser.parseLong(jsonObject.get("treeIdEqual"));
		stateEqual = CategoryVersionState.get(GsonParser.parseString(jsonObject.get("stateEqual")));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaCategoryVersionFilterByTree");
		kparams.add("treeIdEqual", this.treeIdEqual);
		kparams.add("stateEqual", this.stateEqual);
		return kparams;
	}


    public static final Creator<CategoryVersionFilterByTree> CREATOR = new Creator<CategoryVersionFilterByTree>() {
        @Override
        public CategoryVersionFilterByTree createFromParcel(Parcel source) {
            return new CategoryVersionFilterByTree(source);
        }

        @Override
        public CategoryVersionFilterByTree[] newArray(int size) {
            return new CategoryVersionFilterByTree[size];
        }
    };

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        super.writeToParcel(dest, flags);
        dest.writeValue(this.treeIdEqual);
        dest.writeInt(this.stateEqual == null ? -1 : this.stateEqual.ordinal());
    }

    public CategoryVersionFilterByTree(Parcel in) {
        super(in);
        this.treeIdEqual = (Long)in.readValue(Long.class.getClassLoader());
        int tmpStateEqual = in.readInt();
        this.stateEqual = tmpStateEqual == -1 ? null : CategoryVersionState.values()[tmpStateEqual];
    }
}

