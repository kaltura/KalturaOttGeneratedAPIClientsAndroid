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
// Copyright (C) 2006-2017  Kaltura Inc.
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
import com.kaltura.client.enums.EntityReferenceBy;
import com.kaltura.client.utils.GsonParser;
import com.kaltura.client.utils.request.MultiRequestBuilder;

/**
 * This class was generated using clients-generator\exec.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

@SuppressWarnings("serial")
@MultiRequestBuilder.Tokenizer(ParentalRuleFilter.Tokenizer.class)
public class ParentalRuleFilter extends Filter {
	
	public interface Tokenizer extends Filter.Tokenizer {
		String entityReferenceEqual();
	}

	/**  Reference type to filter by  */
	private EntityReferenceBy entityReferenceEqual;

	// entityReferenceEqual:
	public EntityReferenceBy getEntityReferenceEqual(){
		return this.entityReferenceEqual;
	}
	public void setEntityReferenceEqual(EntityReferenceBy entityReferenceEqual){
		this.entityReferenceEqual = entityReferenceEqual;
	}

	public void entityReferenceEqual(String multirequestToken){
		setToken("entityReferenceEqual", multirequestToken);
	}


	public ParentalRuleFilter() {
		super();
	}

	public ParentalRuleFilter(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		entityReferenceEqual = EntityReferenceBy.get(GsonParser.parseString(jsonObject.get("entityReferenceEqual")));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaParentalRuleFilter");
		kparams.add("entityReferenceEqual", this.entityReferenceEqual);
		return kparams;
	}


    public static final Creator<ParentalRuleFilter> CREATOR = new Creator<ParentalRuleFilter>() {
        @Override
        public ParentalRuleFilter createFromParcel(Parcel source) {
            return new ParentalRuleFilter(source);
        }

        @Override
        public ParentalRuleFilter[] newArray(int size) {
            return new ParentalRuleFilter[size];
        }
    };

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        super.writeToParcel(dest, flags);
        dest.writeInt(this.entityReferenceEqual == null ? -1 : this.entityReferenceEqual.ordinal());
    }

    public ParentalRuleFilter(Parcel in) {
        super(in);
        int tmpEntityReferenceEqual = in.readInt();
        this.entityReferenceEqual = tmpEntityReferenceEqual == -1 ? null : EntityReferenceBy.values()[tmpEntityReferenceEqual];
    }
}

