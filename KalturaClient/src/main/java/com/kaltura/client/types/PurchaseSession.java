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
import com.kaltura.client.utils.GsonParser;
import com.kaltura.client.utils.request.MultiRequestBuilder;

/**
 * This class was generated using clients-generator\exec.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

@SuppressWarnings("serial")
@MultiRequestBuilder.Tokenizer(PurchaseSession.Tokenizer.class)
public class PurchaseSession extends Purchase {
	
	public interface Tokenizer extends Purchase.Tokenizer {
		String previewModuleId();
	}

	/**
	 * Preview module identifier (relevant only for subscription)
	 */
	private Integer previewModuleId;

	// previewModuleId:
	public Integer getPreviewModuleId(){
		return this.previewModuleId;
	}
	public void setPreviewModuleId(Integer previewModuleId){
		this.previewModuleId = previewModuleId;
	}

	public void previewModuleId(String multirequestToken){
		setToken("previewModuleId", multirequestToken);
	}


	public PurchaseSession() {
		super();
	}

	public PurchaseSession(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		previewModuleId = GsonParser.parseInt(jsonObject.get("previewModuleId"));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaPurchaseSession");
		kparams.add("previewModuleId", this.previewModuleId);
		return kparams;
	}


    public static final Creator<PurchaseSession> CREATOR = new Creator<PurchaseSession>() {
        @Override
        public PurchaseSession createFromParcel(Parcel source) {
            return new PurchaseSession(source);
        }

        @Override
        public PurchaseSession[] newArray(int size) {
            return new PurchaseSession[size];
        }
    };

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        super.writeToParcel(dest, flags);
        dest.writeValue(this.previewModuleId);
    }

    public PurchaseSession(Parcel in) {
        super(in);
        this.previewModuleId = (Integer)in.readValue(Integer.class.getClassLoader());
    }
}

