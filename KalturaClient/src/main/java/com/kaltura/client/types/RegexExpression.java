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

/**
 * KalturaRegexExpression
 */
@SuppressWarnings("serial")
@MultiRequestBuilder.Tokenizer(RegexExpression.Tokenizer.class)
public class RegexExpression extends ObjectBase {
	
	public interface Tokenizer extends ObjectBase.Tokenizer {
		String expression();
		String description();
	}

	/**
	 * regex expression
	 */
	private String expression;
	/**
	 * description
	 */
	private String description;

	// expression:
	public String getExpression(){
		return this.expression;
	}
	public void setExpression(String expression){
		this.expression = expression;
	}

	public void expression(String multirequestToken){
		setToken("expression", multirequestToken);
	}

	// description:
	public String getDescription(){
		return this.description;
	}
	public void setDescription(String description){
		this.description = description;
	}

	public void description(String multirequestToken){
		setToken("description", multirequestToken);
	}


	public RegexExpression() {
		super();
	}

	public RegexExpression(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		expression = GsonParser.parseString(jsonObject.get("expression"));
		description = GsonParser.parseString(jsonObject.get("description"));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaRegexExpression");
		kparams.add("expression", this.expression);
		kparams.add("description", this.description);
		return kparams;
	}


    public static final Creator<RegexExpression> CREATOR = new Creator<RegexExpression>() {
        @Override
        public RegexExpression createFromParcel(Parcel source) {
            return new RegexExpression(source);
        }

        @Override
        public RegexExpression[] newArray(int size) {
            return new RegexExpression[size];
        }
    };

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        super.writeToParcel(dest, flags);
        dest.writeString(this.expression);
        dest.writeString(this.description);
    }

    public RegexExpression(Parcel in) {
        super(in);
        this.expression = in.readString();
        this.description = in.readString();
    }
}

