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
@MultiRequestBuilder.Tokenizer(ResetPasswordPartnerConfigTemplate.Tokenizer.class)
public class ResetPasswordPartnerConfigTemplate extends ObjectBase {
	
	public interface Tokenizer extends ObjectBase.Tokenizer {
		String id();
		String label();
		String isDefault();
	}

	/**
	 * id
	 */
	private String id;
	/**
	 * label
	 */
	private String label;
	/**
	 * is Default
	 */
	private Boolean isDefault;

	// id:
	public String getId(){
		return this.id;
	}
	public void setId(String id){
		this.id = id;
	}

	public void id(String multirequestToken){
		setToken("id", multirequestToken);
	}

	// label:
	public String getLabel(){
		return this.label;
	}
	public void setLabel(String label){
		this.label = label;
	}

	public void label(String multirequestToken){
		setToken("label", multirequestToken);
	}

	// isDefault:
	public Boolean getIsDefault(){
		return this.isDefault;
	}
	public void setIsDefault(Boolean isDefault){
		this.isDefault = isDefault;
	}

	public void isDefault(String multirequestToken){
		setToken("isDefault", multirequestToken);
	}


	public ResetPasswordPartnerConfigTemplate() {
		super();
	}

	public ResetPasswordPartnerConfigTemplate(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		id = GsonParser.parseString(jsonObject.get("id"));
		label = GsonParser.parseString(jsonObject.get("label"));
		isDefault = GsonParser.parseBoolean(jsonObject.get("isDefault"));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaResetPasswordPartnerConfigTemplate");
		kparams.add("id", this.id);
		kparams.add("label", this.label);
		kparams.add("isDefault", this.isDefault);
		return kparams;
	}


    public static final Creator<ResetPasswordPartnerConfigTemplate> CREATOR = new Creator<ResetPasswordPartnerConfigTemplate>() {
        @Override
        public ResetPasswordPartnerConfigTemplate createFromParcel(Parcel source) {
            return new ResetPasswordPartnerConfigTemplate(source);
        }

        @Override
        public ResetPasswordPartnerConfigTemplate[] newArray(int size) {
            return new ResetPasswordPartnerConfigTemplate[size];
        }
    };

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        super.writeToParcel(dest, flags);
        dest.writeString(this.id);
        dest.writeString(this.label);
        dest.writeValue(this.isDefault);
    }

    public ResetPasswordPartnerConfigTemplate(Parcel in) {
        super(in);
        this.id = in.readString();
        this.label = in.readString();
        this.isDefault = (Boolean)in.readValue(Boolean.class.getClassLoader());
    }
}

