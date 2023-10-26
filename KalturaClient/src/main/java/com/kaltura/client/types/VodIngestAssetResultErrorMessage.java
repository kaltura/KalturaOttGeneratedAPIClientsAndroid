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
 * A Kaltura error message
 */
@SuppressWarnings("serial")
@MultiRequestBuilder.Tokenizer(VodIngestAssetResultErrorMessage.Tokenizer.class)
public class VodIngestAssetResultErrorMessage extends ObjectBase {
	
	public interface Tokenizer extends ObjectBase.Tokenizer {
		String message();
		String code();
	}

	/**
	 * The message description with arguments place holders
	 */
	private String message;
	/**
	 * The message code
	 */
	private String code;

	// message:
	public String getMessage(){
		return this.message;
	}
	public void setMessage(String message){
		this.message = message;
	}

	public void message(String multirequestToken){
		setToken("message", multirequestToken);
	}

	// code:
	public String getCode(){
		return this.code;
	}
	public void setCode(String code){
		this.code = code;
	}

	public void code(String multirequestToken){
		setToken("code", multirequestToken);
	}


	public VodIngestAssetResultErrorMessage() {
		super();
	}

	public VodIngestAssetResultErrorMessage(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		message = GsonParser.parseString(jsonObject.get("message"));
		code = GsonParser.parseString(jsonObject.get("code"));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaVodIngestAssetResultErrorMessage");
		kparams.add("message", this.message);
		kparams.add("code", this.code);
		return kparams;
	}


    public static final Creator<VodIngestAssetResultErrorMessage> CREATOR = new Creator<VodIngestAssetResultErrorMessage>() {
        @Override
        public VodIngestAssetResultErrorMessage createFromParcel(Parcel source) {
            return new VodIngestAssetResultErrorMessage(source);
        }

        @Override
        public VodIngestAssetResultErrorMessage[] newArray(int size) {
            return new VodIngestAssetResultErrorMessage[size];
        }
    };

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        super.writeToParcel(dest, flags);
        dest.writeString(this.message);
        dest.writeString(this.code);
    }

    public VodIngestAssetResultErrorMessage(Parcel in) {
        super(in);
        this.message = in.readString();
        this.code = in.readString();
    }
}

