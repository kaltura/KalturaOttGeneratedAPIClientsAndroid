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
import java.util.ArrayList;
import java.util.List;

/**
 * This class was generated using exec.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

/**
 * Container for searchable attributes configuration
 */
@SuppressWarnings("serial")
@MultiRequestBuilder.Tokenizer(SearchableAttributes.Tokenizer.class)
public class SearchableAttributes extends ObjectBase {
	
	public interface Tokenizer extends ObjectBase.Tokenizer {
		RequestBuilder.ListTokenizer<SearchableAttribute.Tokenizer> items();
	}

	/**
	 * A list of searchable attributes.
	 */
	private List<SearchableAttribute> items;

	// items:
	public List<SearchableAttribute> getItems(){
		return this.items;
	}
	public void setItems(List<SearchableAttribute> items){
		this.items = items;
	}


	public SearchableAttributes() {
		super();
	}

	public SearchableAttributes(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		items = GsonParser.parseArray(jsonObject.getAsJsonArray("items"), SearchableAttribute.class);

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaSearchableAttributes");
		kparams.add("items", this.items);
		return kparams;
	}


    public static final Creator<SearchableAttributes> CREATOR = new Creator<SearchableAttributes>() {
        @Override
        public SearchableAttributes createFromParcel(Parcel source) {
            return new SearchableAttributes(source);
        }

        @Override
        public SearchableAttributes[] newArray(int size) {
            return new SearchableAttributes[size];
        }
    };

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        super.writeToParcel(dest, flags);
        if(this.items != null) {
            dest.writeInt(this.items.size());
            dest.writeList(this.items);
        } else {
            dest.writeInt(-1);
        }
    }

    public SearchableAttributes(Parcel in) {
        super(in);
        int itemsSize = in.readInt();
        if( itemsSize > -1) {
            this.items = new ArrayList<>();
            in.readList(this.items, SearchableAttribute.class.getClassLoader());
        }
    }
}

