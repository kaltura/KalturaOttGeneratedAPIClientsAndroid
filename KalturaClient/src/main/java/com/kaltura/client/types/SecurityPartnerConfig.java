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
import com.kaltura.client.types.DataEncryption;
import com.kaltura.client.utils.GsonParser;
import com.kaltura.client.utils.request.MultiRequestBuilder;

/**
 * This class was generated using exec.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

@SuppressWarnings("serial")
@MultiRequestBuilder.Tokenizer(SecurityPartnerConfig.Tokenizer.class)
public class SecurityPartnerConfig extends PartnerConfiguration {
	
	public interface Tokenizer extends PartnerConfiguration.Tokenizer {
		DataEncryption.Tokenizer encryption();
	}

	/**
	 * Encryption config
	 */
	private DataEncryption encryption;

	// encryption:
	public DataEncryption getEncryption(){
		return this.encryption;
	}
	public void setEncryption(DataEncryption encryption){
		this.encryption = encryption;
	}


	public SecurityPartnerConfig() {
		super();
	}

	public SecurityPartnerConfig(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		encryption = GsonParser.parseObject(jsonObject.getAsJsonObject("encryption"), DataEncryption.class);

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaSecurityPartnerConfig");
		kparams.add("encryption", this.encryption);
		return kparams;
	}


    public static final Creator<SecurityPartnerConfig> CREATOR = new Creator<SecurityPartnerConfig>() {
        @Override
        public SecurityPartnerConfig createFromParcel(Parcel source) {
            return new SecurityPartnerConfig(source);
        }

        @Override
        public SecurityPartnerConfig[] newArray(int size) {
            return new SecurityPartnerConfig[size];
        }
    };

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        super.writeToParcel(dest, flags);
        dest.writeParcelable(this.encryption, flags);
    }

    public SecurityPartnerConfig(Parcel in) {
        super(in);
        this.encryption = in.readParcelable(DataEncryption.class.getClassLoader());
    }
}

