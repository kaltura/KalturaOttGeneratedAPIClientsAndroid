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
import com.kaltura.client.types.IotProfileAws;
import com.kaltura.client.utils.GsonParser;
import com.kaltura.client.utils.request.MultiRequestBuilder;

/**
 * This class was generated using exec.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

/**
 * IOT PROFILE
 */
@SuppressWarnings("serial")
@MultiRequestBuilder.Tokenizer(IotProfile.Tokenizer.class)
public class IotProfile extends CrudObject {
	
	public interface Tokenizer extends CrudObject.Tokenizer {
		String adapterUrl();
		IotProfileAws.Tokenizer iotProfileAws();
	}

	/**
	 * adapterUrl
	 */
	private String adapterUrl;
	/**
	 * kalturaIotProfileAws
	 */
	private IotProfileAws iotProfileAws;

	// adapterUrl:
	public String getAdapterUrl(){
		return this.adapterUrl;
	}
	public void setAdapterUrl(String adapterUrl){
		this.adapterUrl = adapterUrl;
	}

	public void adapterUrl(String multirequestToken){
		setToken("adapterUrl", multirequestToken);
	}

	// iotProfileAws:
	public IotProfileAws getIotProfileAws(){
		return this.iotProfileAws;
	}
	public void setIotProfileAws(IotProfileAws iotProfileAws){
		this.iotProfileAws = iotProfileAws;
	}


	public IotProfile() {
		super();
	}

	public IotProfile(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		adapterUrl = GsonParser.parseString(jsonObject.get("adapterUrl"));
		iotProfileAws = GsonParser.parseObject(jsonObject.getAsJsonObject("iotProfileAws"), IotProfileAws.class);

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaIotProfile");
		kparams.add("adapterUrl", this.adapterUrl);
		kparams.add("iotProfileAws", this.iotProfileAws);
		return kparams;
	}


    public static final Creator<IotProfile> CREATOR = new Creator<IotProfile>() {
        @Override
        public IotProfile createFromParcel(Parcel source) {
            return new IotProfile(source);
        }

        @Override
        public IotProfile[] newArray(int size) {
            return new IotProfile[size];
        }
    };

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        super.writeToParcel(dest, flags);
        dest.writeString(this.adapterUrl);
        dest.writeParcelable(this.iotProfileAws, flags);
    }

    public IotProfile(Parcel in) {
        super(in);
        this.adapterUrl = in.readString();
        this.iotProfileAws = in.readParcelable(IotProfileAws.class.getClassLoader());
    }
}

