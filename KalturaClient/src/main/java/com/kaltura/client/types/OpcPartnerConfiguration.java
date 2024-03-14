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
import com.kaltura.client.types.ResetPasswordPartnerConfig;
import com.kaltura.client.utils.GsonParser;
import com.kaltura.client.utils.request.MultiRequestBuilder;

/**
 * This class was generated using exec.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

@SuppressWarnings("serial")
@MultiRequestBuilder.Tokenizer(OpcPartnerConfiguration.Tokenizer.class)
public class OpcPartnerConfiguration extends PartnerConfiguration {
	
	public interface Tokenizer extends PartnerConfiguration.Tokenizer {
		ResetPasswordPartnerConfig.Tokenizer resetPassword();
	}

	/**
	 * Reset Password
	 */
	private ResetPasswordPartnerConfig resetPassword;

	// resetPassword:
	public ResetPasswordPartnerConfig getResetPassword(){
		return this.resetPassword;
	}
	public void setResetPassword(ResetPasswordPartnerConfig resetPassword){
		this.resetPassword = resetPassword;
	}


	public OpcPartnerConfiguration() {
		super();
	}

	public OpcPartnerConfiguration(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		resetPassword = GsonParser.parseObject(jsonObject.getAsJsonObject("resetPassword"), ResetPasswordPartnerConfig.class);

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaOpcPartnerConfiguration");
		kparams.add("resetPassword", this.resetPassword);
		return kparams;
	}


    public static final Creator<OpcPartnerConfiguration> CREATOR = new Creator<OpcPartnerConfiguration>() {
        @Override
        public OpcPartnerConfiguration createFromParcel(Parcel source) {
            return new OpcPartnerConfiguration(source);
        }

        @Override
        public OpcPartnerConfiguration[] newArray(int size) {
            return new OpcPartnerConfiguration[size];
        }
    };

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        super.writeToParcel(dest, flags);
        dest.writeParcelable(this.resetPassword, flags);
    }

    public OpcPartnerConfiguration(Parcel in) {
        super(in);
        this.resetPassword = in.readParcelable(ResetPasswordPartnerConfig.class.getClassLoader());
    }
}

