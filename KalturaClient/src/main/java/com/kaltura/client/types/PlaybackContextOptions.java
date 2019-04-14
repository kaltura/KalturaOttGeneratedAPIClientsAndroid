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
// Copyright (C) 2006-2019  Kaltura Inc.
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
import com.kaltura.client.enums.PlaybackContextType;
import com.kaltura.client.enums.UrlType;
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
@MultiRequestBuilder.Tokenizer(PlaybackContextOptions.Tokenizer.class)
public class PlaybackContextOptions extends ObjectBase {
	
	public interface Tokenizer extends ObjectBase.Tokenizer {
		String mediaProtocol();
		String streamerType();
		String assetFileIds();
		RequestBuilder.MapTokenizer<StringValue.Tokenizer> adapterData();
		String context();
		String urlType();
	}

	/**
	 * Protocol of the specific media object (http / https).
	 */
	private String mediaProtocol;
	/**
	 * Playback streamer type: applehttp, mpegdash, url, smothstreaming, none
	 */
	private String streamerType;
	/**
	 * List of comma separated media file IDs
	 */
	private String assetFileIds;
	/**
	 * key/value map field for extra data
	 */
	private Map<String, StringValue> adapterData;
	/**
	 * Playback context type
	 */
	private PlaybackContextType context;
	/**
	 * Url type
	 */
	private UrlType urlType;

	// mediaProtocol:
	public String getMediaProtocol(){
		return this.mediaProtocol;
	}
	public void setMediaProtocol(String mediaProtocol){
		this.mediaProtocol = mediaProtocol;
	}

	public void mediaProtocol(String multirequestToken){
		setToken("mediaProtocol", multirequestToken);
	}

	// streamerType:
	public String getStreamerType(){
		return this.streamerType;
	}
	public void setStreamerType(String streamerType){
		this.streamerType = streamerType;
	}

	public void streamerType(String multirequestToken){
		setToken("streamerType", multirequestToken);
	}

	// assetFileIds:
	public String getAssetFileIds(){
		return this.assetFileIds;
	}
	public void setAssetFileIds(String assetFileIds){
		this.assetFileIds = assetFileIds;
	}

	public void assetFileIds(String multirequestToken){
		setToken("assetFileIds", multirequestToken);
	}

	// adapterData:
	public Map<String, StringValue> getAdapterData(){
		return this.adapterData;
	}
	public void setAdapterData(Map<String, StringValue> adapterData){
		this.adapterData = adapterData;
	}

	// context:
	public PlaybackContextType getContext(){
		return this.context;
	}
	public void setContext(PlaybackContextType context){
		this.context = context;
	}

	public void context(String multirequestToken){
		setToken("context", multirequestToken);
	}

	// urlType:
	public UrlType getUrlType(){
		return this.urlType;
	}
	public void setUrlType(UrlType urlType){
		this.urlType = urlType;
	}

	public void urlType(String multirequestToken){
		setToken("urlType", multirequestToken);
	}


	public PlaybackContextOptions() {
		super();
	}

	public PlaybackContextOptions(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		mediaProtocol = GsonParser.parseString(jsonObject.get("mediaProtocol"));
		streamerType = GsonParser.parseString(jsonObject.get("streamerType"));
		assetFileIds = GsonParser.parseString(jsonObject.get("assetFileIds"));
		adapterData = GsonParser.parseMap(jsonObject.getAsJsonObject("adapterData"), StringValue.class);
		context = PlaybackContextType.get(GsonParser.parseString(jsonObject.get("context")));
		urlType = UrlType.get(GsonParser.parseString(jsonObject.get("urlType")));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaPlaybackContextOptions");
		kparams.add("mediaProtocol", this.mediaProtocol);
		kparams.add("streamerType", this.streamerType);
		kparams.add("assetFileIds", this.assetFileIds);
		kparams.add("adapterData", this.adapterData);
		kparams.add("context", this.context);
		kparams.add("urlType", this.urlType);
		return kparams;
	}


    public static final Creator<PlaybackContextOptions> CREATOR = new Creator<PlaybackContextOptions>() {
        @Override
        public PlaybackContextOptions createFromParcel(Parcel source) {
            return new PlaybackContextOptions(source);
        }

        @Override
        public PlaybackContextOptions[] newArray(int size) {
            return new PlaybackContextOptions[size];
        }
    };

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        super.writeToParcel(dest, flags);
        dest.writeString(this.mediaProtocol);
        dest.writeString(this.streamerType);
        dest.writeString(this.assetFileIds);
        if(this.adapterData != null) {
            dest.writeInt(this.adapterData.size());
            for (Map.Entry<String, StringValue> entry : this.adapterData.entrySet()) {
                dest.writeString(entry.getKey());
                dest.writeParcelable(entry.getValue(), flags);
            }
        } else {
            dest.writeInt(-1);
        }
        dest.writeInt(this.context == null ? -1 : this.context.ordinal());
        dest.writeInt(this.urlType == null ? -1 : this.urlType.ordinal());
    }

    public PlaybackContextOptions(Parcel in) {
        super(in);
        this.mediaProtocol = in.readString();
        this.streamerType = in.readString();
        this.assetFileIds = in.readString();
        int adapterDataSize = in.readInt();
        if( adapterDataSize > -1) {
            this.adapterData = new HashMap<>();
            for (int i = 0; i < adapterDataSize; i++) {
                String key = in.readString();
                StringValue value = in.readParcelable(StringValue.class.getClassLoader());
                this.adapterData.put(key, value);
            }
        }
        int tmpContext = in.readInt();
        this.context = tmpContext == -1 ? null : PlaybackContextType.values()[tmpContext];
        int tmpUrlType = in.readInt();
        this.urlType = tmpUrlType == -1 ? null : UrlType.values()[tmpUrlType];
    }
}

