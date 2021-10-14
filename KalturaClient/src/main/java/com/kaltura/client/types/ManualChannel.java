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
import com.kaltura.client.utils.GsonParser;
import com.kaltura.client.utils.request.MultiRequestBuilder;
import com.kaltura.client.utils.request.RequestBuilder;
import java.util.ArrayList;
import java.util.List;

/**
 * This class was generated using exec.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

@SuppressWarnings("serial")
@MultiRequestBuilder.Tokenizer(ManualChannel.Tokenizer.class)
public class ManualChannel extends Channel {
	
	public interface Tokenizer extends Channel.Tokenizer {
		String mediaIds();
		RequestBuilder.ListTokenizer<ManualCollectionAsset.Tokenizer> assets();
	}

	/**
	 * A list of comma separated media ids associated with this channel, according to
	  the order of the medias in the channel.
	 */
	private String mediaIds;
	/**
	 * List of assets identifier
	 */
	private List<ManualCollectionAsset> assets;

	// mediaIds:
	public String getMediaIds(){
		return this.mediaIds;
	}
	public void setMediaIds(String mediaIds){
		this.mediaIds = mediaIds;
	}

	public void mediaIds(String multirequestToken){
		setToken("mediaIds", multirequestToken);
	}

	// assets:
	public List<ManualCollectionAsset> getAssets(){
		return this.assets;
	}
	public void setAssets(List<ManualCollectionAsset> assets){
		this.assets = assets;
	}


	public ManualChannel() {
		super();
	}

	public ManualChannel(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		mediaIds = GsonParser.parseString(jsonObject.get("mediaIds"));
		assets = GsonParser.parseArray(jsonObject.getAsJsonArray("assets"), ManualCollectionAsset.class);

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaManualChannel");
		kparams.add("mediaIds", this.mediaIds);
		kparams.add("assets", this.assets);
		return kparams;
	}


    public static final Creator<ManualChannel> CREATOR = new Creator<ManualChannel>() {
        @Override
        public ManualChannel createFromParcel(Parcel source) {
            return new ManualChannel(source);
        }

        @Override
        public ManualChannel[] newArray(int size) {
            return new ManualChannel[size];
        }
    };

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        super.writeToParcel(dest, flags);
        dest.writeString(this.mediaIds);
        if(this.assets != null) {
            dest.writeInt(this.assets.size());
            dest.writeList(this.assets);
        } else {
            dest.writeInt(-1);
        }
    }

    public ManualChannel(Parcel in) {
        super(in);
        this.mediaIds = in.readString();
        int assetsSize = in.readInt();
        if( assetsSize > -1) {
            this.assets = new ArrayList<>();
            in.readList(this.assets, ManualCollectionAsset.class.getClassLoader());
        }
    }
}

