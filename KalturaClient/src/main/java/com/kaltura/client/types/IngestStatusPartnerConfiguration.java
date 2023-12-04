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
import com.kaltura.client.types.IngestStatusEpgConfiguration;
import com.kaltura.client.types.IngestStatusVodConfiguration;
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
@MultiRequestBuilder.Tokenizer(IngestStatusPartnerConfiguration.Tokenizer.class)
public class IngestStatusPartnerConfiguration extends ObjectBase {
	
	public interface Tokenizer extends ObjectBase.Tokenizer {
		IngestStatusEpgConfiguration.Tokenizer epg();
		IngestStatusVodConfiguration.Tokenizer vod();
	}

	/**
	 * Defines the epg configuration of the partner.
	 */
	private IngestStatusEpgConfiguration epg;
	/**
	 * Defines the vod configuration of the partner.
	 */
	private IngestStatusVodConfiguration vod;

	// epg:
	public IngestStatusEpgConfiguration getEpg(){
		return this.epg;
	}
	public void setEpg(IngestStatusEpgConfiguration epg){
		this.epg = epg;
	}

	// vod:
	public IngestStatusVodConfiguration getVod(){
		return this.vod;
	}
	public void setVod(IngestStatusVodConfiguration vod){
		this.vod = vod;
	}


	public IngestStatusPartnerConfiguration() {
		super();
	}

	public IngestStatusPartnerConfiguration(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		epg = GsonParser.parseObject(jsonObject.getAsJsonObject("epg"), IngestStatusEpgConfiguration.class);
		vod = GsonParser.parseObject(jsonObject.getAsJsonObject("vod"), IngestStatusVodConfiguration.class);

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaIngestStatusPartnerConfiguration");
		kparams.add("epg", this.epg);
		kparams.add("vod", this.vod);
		return kparams;
	}


    public static final Creator<IngestStatusPartnerConfiguration> CREATOR = new Creator<IngestStatusPartnerConfiguration>() {
        @Override
        public IngestStatusPartnerConfiguration createFromParcel(Parcel source) {
            return new IngestStatusPartnerConfiguration(source);
        }

        @Override
        public IngestStatusPartnerConfiguration[] newArray(int size) {
            return new IngestStatusPartnerConfiguration[size];
        }
    };

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        super.writeToParcel(dest, flags);
        dest.writeParcelable(this.epg, flags);
        dest.writeParcelable(this.vod, flags);
    }

    public IngestStatusPartnerConfiguration(Parcel in) {
        super(in);
        this.epg = in.readParcelable(IngestStatusEpgConfiguration.class.getClassLoader());
        this.vod = in.readParcelable(IngestStatusVodConfiguration.class.getClassLoader());
    }
}

