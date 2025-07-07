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
import java.util.ArrayList;
import java.util.List;

/**
 * This class was generated using exec.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

/**
 * Request object for bulk getPlaybackContext operation
 */
@SuppressWarnings("serial")
@MultiRequestBuilder.Tokenizer(BulkPlaybackContextRequest.Tokenizer.class)
public class BulkPlaybackContextRequest extends ObjectBase {
	
	public interface Tokenizer extends ObjectBase.Tokenizer {
		RequestBuilder.ListTokenizer<GetPlaybackContextParams.Tokenizer> playbackContextParamSets();
	}

	/**
	 * Array of request parameters for getPlaybackContext.              Each entry
	  represents an individual playback context request.
	 */
	private List<GetPlaybackContextParams> playbackContextParamSets;

	// playbackContextParamSets:
	public List<GetPlaybackContextParams> getPlaybackContextParamSets(){
		return this.playbackContextParamSets;
	}
	public void setPlaybackContextParamSets(List<GetPlaybackContextParams> playbackContextParamSets){
		this.playbackContextParamSets = playbackContextParamSets;
	}


	public BulkPlaybackContextRequest() {
		super();
	}

	public BulkPlaybackContextRequest(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		playbackContextParamSets = GsonParser.parseArray(jsonObject.getAsJsonArray("playbackContextParamSets"), GetPlaybackContextParams.class);

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaBulkPlaybackContextRequest");
		kparams.add("playbackContextParamSets", this.playbackContextParamSets);
		return kparams;
	}


    public static final Creator<BulkPlaybackContextRequest> CREATOR = new Creator<BulkPlaybackContextRequest>() {
        @Override
        public BulkPlaybackContextRequest createFromParcel(Parcel source) {
            return new BulkPlaybackContextRequest(source);
        }

        @Override
        public BulkPlaybackContextRequest[] newArray(int size) {
            return new BulkPlaybackContextRequest[size];
        }
    };

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        super.writeToParcel(dest, flags);
        if(this.playbackContextParamSets != null) {
            dest.writeInt(this.playbackContextParamSets.size());
            dest.writeList(this.playbackContextParamSets);
        } else {
            dest.writeInt(-1);
        }
    }

    public BulkPlaybackContextRequest(Parcel in) {
        super(in);
        int playbackContextParamSetsSize = in.readInt();
        if( playbackContextParamSetsSize > -1) {
            this.playbackContextParamSets = new ArrayList<>();
            in.readList(this.playbackContextParamSets, GetPlaybackContextParams.class.getClassLoader());
        }
    }
}

