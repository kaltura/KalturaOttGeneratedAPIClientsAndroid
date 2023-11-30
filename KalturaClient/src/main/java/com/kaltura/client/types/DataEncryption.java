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
import com.kaltura.client.types.Encryption;
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
@MultiRequestBuilder.Tokenizer(DataEncryption.Tokenizer.class)
public class DataEncryption extends ObjectBase {
	
	public interface Tokenizer extends ObjectBase.Tokenizer {
		Encryption.Tokenizer username();
	}

	/**
	 * Username encryption config
	 */
	private Encryption username;

	// username:
	public Encryption getUsername(){
		return this.username;
	}
	public void setUsername(Encryption username){
		this.username = username;
	}


	public DataEncryption() {
		super();
	}

	public DataEncryption(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		username = GsonParser.parseObject(jsonObject.getAsJsonObject("username"), Encryption.class);

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaDataEncryption");
		kparams.add("username", this.username);
		return kparams;
	}


    public static final Creator<DataEncryption> CREATOR = new Creator<DataEncryption>() {
        @Override
        public DataEncryption createFromParcel(Parcel source) {
            return new DataEncryption(source);
        }

        @Override
        public DataEncryption[] newArray(int size) {
            return new DataEncryption[size];
        }
    };

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        super.writeToParcel(dest, flags);
        dest.writeParcelable(this.username, flags);
    }

    public DataEncryption(Parcel in) {
        super(in);
        this.username = in.readParcelable(Encryption.class.getClassLoader());
    }
}

