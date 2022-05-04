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

/**
 * This class was generated using exec.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

/**
 * A Lineup channel asset is KalturaLiveAsset in a context of specific region
  (includes LCN)
 */
@SuppressWarnings("serial")
@MultiRequestBuilder.Tokenizer(LineupChannelAsset.Tokenizer.class)
public class LineupChannelAsset extends LiveAsset {
	
	public interface Tokenizer extends LiveAsset.Tokenizer {
		String lcn();
	}

	/**
	 * Lineup channel number (LCN) - A logical linear channel number. This number is
	  unique in the region context.
	 */
	private Integer lcn;

	// lcn:
	public Integer getLcn(){
		return this.lcn;
	}
	public void setLcn(Integer lcn){
		this.lcn = lcn;
	}

	public void lcn(String multirequestToken){
		setToken("lcn", multirequestToken);
	}


	public LineupChannelAsset() {
		super();
	}

	public LineupChannelAsset(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		lcn = GsonParser.parseInt(jsonObject.get("lcn"));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaLineupChannelAsset");
		kparams.add("lcn", this.lcn);
		return kparams;
	}


    public static final Creator<LineupChannelAsset> CREATOR = new Creator<LineupChannelAsset>() {
        @Override
        public LineupChannelAsset createFromParcel(Parcel source) {
            return new LineupChannelAsset(source);
        }

        @Override
        public LineupChannelAsset[] newArray(int size) {
            return new LineupChannelAsset[size];
        }
    };

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        super.writeToParcel(dest, flags);
        dest.writeValue(this.lcn);
    }

    public LineupChannelAsset(Parcel in) {
        super(in);
        this.lcn = (Integer)in.readValue(Integer.class.getClassLoader());
    }
}

