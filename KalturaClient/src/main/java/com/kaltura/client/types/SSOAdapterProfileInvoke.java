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
import java.util.HashMap;
import java.util.Map;

/**
 * This class was generated using exec.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

@SuppressWarnings("serial")
@MultiRequestBuilder.Tokenizer(SSOAdapterProfileInvoke.Tokenizer.class)
public class SSOAdapterProfileInvoke extends ObjectBase {
	
	public interface Tokenizer extends ObjectBase.Tokenizer {
		RequestBuilder.MapTokenizer<StringValue.Tokenizer> adapterData();
		String code();
		String message();
	}

	/**
	 * key/value map field for adapter data
	 */
	private Map<String, StringValue> adapterData;
	/**
	 * code
	 */
	private String code;
	/**
	 * message
	 */
	private String message;

	// adapterData:
	public Map<String, StringValue> getAdapterData(){
		return this.adapterData;
	}
	public void setAdapterData(Map<String, StringValue> adapterData){
		this.adapterData = adapterData;
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


	public SSOAdapterProfileInvoke() {
		super();
	}

	public SSOAdapterProfileInvoke(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		adapterData = GsonParser.parseMap(jsonObject.getAsJsonObject("adapterData"), StringValue.class);
		code = GsonParser.parseString(jsonObject.get("code"));
		message = GsonParser.parseString(jsonObject.get("message"));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaSSOAdapterProfileInvoke");
		kparams.add("adapterData", this.adapterData);
		kparams.add("code", this.code);
		kparams.add("message", this.message);
		return kparams;
	}


    public static final Creator<SSOAdapterProfileInvoke> CREATOR = new Creator<SSOAdapterProfileInvoke>() {
        @Override
        public SSOAdapterProfileInvoke createFromParcel(Parcel source) {
            return new SSOAdapterProfileInvoke(source);
        }

        @Override
        public SSOAdapterProfileInvoke[] newArray(int size) {
            return new SSOAdapterProfileInvoke[size];
        }
    };

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        super.writeToParcel(dest, flags);
        if(this.adapterData != null) {
            dest.writeInt(this.adapterData.size());
            for (Map.Entry<String, StringValue> entry : this.adapterData.entrySet()) {
                dest.writeString(entry.getKey());
                dest.writeParcelable(entry.getValue(), flags);
            }
        } else {
            dest.writeInt(-1);
        }
        dest.writeString(this.code);
        dest.writeString(this.message);
    }

    public SSOAdapterProfileInvoke(Parcel in) {
        super(in);
        int adapterDataSize = in.readInt();
        if( adapterDataSize > -1) {
            this.adapterData = new HashMap<>();
            for (int i = 0; i < adapterDataSize; i++) {
                String key = in.readString();
                StringValue value = in.readParcelable(StringValue.class.getClassLoader());
                this.adapterData.put(key, value);
            }
        }
        this.code = in.readString();
        this.message = in.readString();
    }
}

