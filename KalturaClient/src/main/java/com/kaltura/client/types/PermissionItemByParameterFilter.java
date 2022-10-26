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

/**
 * This class was generated using exec.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

/**
 * If filter properties are empty will return all parameter type permission items
 */
@SuppressWarnings("serial")
@MultiRequestBuilder.Tokenizer(PermissionItemByParameterFilter.Tokenizer.class)
public class PermissionItemByParameterFilter extends PermissionItemFilter {
	
	public interface Tokenizer extends PermissionItemFilter.Tokenizer {
		String parameterEqual();
		String objectEqual();
	}

	/**
	 * Parameter name
	 */
	private String parameterEqual;
	/**
	 * Parameter name
	 */
	private String objectEqual;

	// parameterEqual:
	public String getParameterEqual(){
		return this.parameterEqual;
	}
	public void setParameterEqual(String parameterEqual){
		this.parameterEqual = parameterEqual;
	}

	public void parameterEqual(String multirequestToken){
		setToken("parameterEqual", multirequestToken);
	}

	// objectEqual:
	public String getObjectEqual(){
		return this.objectEqual;
	}
	public void setObjectEqual(String objectEqual){
		this.objectEqual = objectEqual;
	}

	public void objectEqual(String multirequestToken){
		setToken("objectEqual", multirequestToken);
	}


	public PermissionItemByParameterFilter() {
		super();
	}

	public PermissionItemByParameterFilter(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		parameterEqual = GsonParser.parseString(jsonObject.get("parameterEqual"));
		objectEqual = GsonParser.parseString(jsonObject.get("objectEqual"));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaPermissionItemByParameterFilter");
		kparams.add("parameterEqual", this.parameterEqual);
		kparams.add("objectEqual", this.objectEqual);
		return kparams;
	}


    public static final Creator<PermissionItemByParameterFilter> CREATOR = new Creator<PermissionItemByParameterFilter>() {
        @Override
        public PermissionItemByParameterFilter createFromParcel(Parcel source) {
            return new PermissionItemByParameterFilter(source);
        }

        @Override
        public PermissionItemByParameterFilter[] newArray(int size) {
            return new PermissionItemByParameterFilter[size];
        }
    };

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        super.writeToParcel(dest, flags);
        dest.writeString(this.parameterEqual);
        dest.writeString(this.objectEqual);
    }

    public PermissionItemByParameterFilter(Parcel in) {
        super(in);
        this.parameterEqual = in.readString();
        this.objectEqual = in.readString();
    }
}

