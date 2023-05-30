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
import com.kaltura.client.enums.SearchPriorityCriteriaType;
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
@MultiRequestBuilder.Tokenizer(SearchPriorityCriteria.Tokenizer.class)
public class SearchPriorityCriteria extends ObjectBase {
	
	public interface Tokenizer extends ObjectBase.Tokenizer {
		String type();
		String value();
	}

	/**
	 * Criterion type
	 */
	private SearchPriorityCriteriaType type;
	/**
	 * Condition              KSQL has to have no more than 10 conditions. Text,
	  boolean, enum and tag fields can be used only with = operator, numeric and
	  datetime fields - only with &amp;lt;, = and &amp;gt; operators.
	 */
	private String value;

	// type:
	public SearchPriorityCriteriaType getType(){
		return this.type;
	}
	public void setType(SearchPriorityCriteriaType type){
		this.type = type;
	}

	public void type(String multirequestToken){
		setToken("type", multirequestToken);
	}

	// value:
	public String getValue(){
		return this.value;
	}
	public void setValue(String value){
		this.value = value;
	}

	public void value(String multirequestToken){
		setToken("value", multirequestToken);
	}


	public SearchPriorityCriteria() {
		super();
	}

	public SearchPriorityCriteria(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		type = SearchPriorityCriteriaType.get(GsonParser.parseString(jsonObject.get("type")));
		value = GsonParser.parseString(jsonObject.get("value"));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaSearchPriorityCriteria");
		kparams.add("type", this.type);
		kparams.add("value", this.value);
		return kparams;
	}


    public static final Creator<SearchPriorityCriteria> CREATOR = new Creator<SearchPriorityCriteria>() {
        @Override
        public SearchPriorityCriteria createFromParcel(Parcel source) {
            return new SearchPriorityCriteria(source);
        }

        @Override
        public SearchPriorityCriteria[] newArray(int size) {
            return new SearchPriorityCriteria[size];
        }
    };

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        super.writeToParcel(dest, flags);
        dest.writeInt(this.type == null ? -1 : this.type.ordinal());
        dest.writeString(this.value);
    }

    public SearchPriorityCriteria(Parcel in) {
        super(in);
        int tmpType = in.readInt();
        this.type = tmpType == -1 ? null : SearchPriorityCriteriaType.values()[tmpType];
        this.value = in.readString();
    }
}

