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
import com.kaltura.client.enums.TransactionType;
import com.kaltura.client.utils.GsonParser;
import com.kaltura.client.utils.request.MultiRequestBuilder;

/**
 * This class was generated using clients-generator\exec.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

/**
 * Business module condition
 */
@SuppressWarnings("serial")
@MultiRequestBuilder.Tokenizer(BusinessModuleCondition.Tokenizer.class)
public class BusinessModuleCondition extends Condition {
	
	public interface Tokenizer extends Condition.Tokenizer {
		String businessModuleType();
		String businessModuleId();
	}

	/**
	 * Business module type
	 */
	private TransactionType businessModuleType;
	/**
	 * Business module ID
	 */
	private Long businessModuleId;

	// businessModuleType:
	public TransactionType getBusinessModuleType(){
		return this.businessModuleType;
	}
	public void setBusinessModuleType(TransactionType businessModuleType){
		this.businessModuleType = businessModuleType;
	}

	public void businessModuleType(String multirequestToken){
		setToken("businessModuleType", multirequestToken);
	}

	// businessModuleId:
	public Long getBusinessModuleId(){
		return this.businessModuleId;
	}
	public void setBusinessModuleId(Long businessModuleId){
		this.businessModuleId = businessModuleId;
	}

	public void businessModuleId(String multirequestToken){
		setToken("businessModuleId", multirequestToken);
	}


	public BusinessModuleCondition() {
		super();
	}

	public BusinessModuleCondition(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		businessModuleType = TransactionType.get(GsonParser.parseString(jsonObject.get("businessModuleType")));
		businessModuleId = GsonParser.parseLong(jsonObject.get("businessModuleId"));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaBusinessModuleCondition");
		kparams.add("businessModuleType", this.businessModuleType);
		kparams.add("businessModuleId", this.businessModuleId);
		return kparams;
	}


    public static final Creator<BusinessModuleCondition> CREATOR = new Creator<BusinessModuleCondition>() {
        @Override
        public BusinessModuleCondition createFromParcel(Parcel source) {
            return new BusinessModuleCondition(source);
        }

        @Override
        public BusinessModuleCondition[] newArray(int size) {
            return new BusinessModuleCondition[size];
        }
    };

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        super.writeToParcel(dest, flags);
        dest.writeInt(this.businessModuleType == null ? -1 : this.businessModuleType.ordinal());
        dest.writeValue(this.businessModuleId);
    }

    public BusinessModuleCondition(Parcel in) {
        super(in);
        int tmpBusinessModuleType = in.readInt();
        this.businessModuleType = tmpBusinessModuleType == -1 ? null : TransactionType.values()[tmpBusinessModuleType];
        this.businessModuleId = (Long)in.readValue(Long.class.getClassLoader());
    }
}

