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
import com.kaltura.client.types.ObjectBase;
import com.kaltura.client.utils.GsonParser;
import com.kaltura.client.utils.request.MultiRequestBuilder;
import com.kaltura.client.utils.request.RequestBuilder;
import java.util.ArrayList;
import java.util.List;

/**
 * This class was generated using clients-generator\exec.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

@SuppressWarnings("serial")
@MultiRequestBuilder.Tokenizer(AdsContext.Tokenizer.class)
public class AdsContext extends ObjectBase {
	
	public interface Tokenizer extends ObjectBase.Tokenizer {
		RequestBuilder.ListTokenizer<AdsSource.Tokenizer> sources();
	}

	/**  Sources  */
	private List<AdsSource> sources;

	// sources:
	public List<AdsSource> getSources(){
		return this.sources;
	}
	public void setSources(List<AdsSource> sources){
		this.sources = sources;
	}


	public AdsContext() {
		super();
	}

	public AdsContext(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		sources = GsonParser.parseArray(jsonObject.getAsJsonArray("sources"), AdsSource.class);

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaAdsContext");
		kparams.add("sources", this.sources);
		return kparams;
	}


    public static final Creator<AdsContext> CREATOR = new Creator<AdsContext>() {
        @Override
        public AdsContext createFromParcel(Parcel source) {
            return new AdsContext(source);
        }

        @Override
        public AdsContext[] newArray(int size) {
            return new AdsContext[size];
        }
    };

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        super.writeToParcel(dest, flags);
        if(this.sources != null) {
            dest.writeInt(this.sources.size());
            dest.writeList(this.sources);
        } else {
            dest.writeInt(-1);
        }
    }

    public AdsContext(Parcel in) {
        super(in);
        int sourcesSize = in.readInt();
        if( sourcesSize > -1) {
            this.sources = new ArrayList<>();
            in.readList(this.sources, AdsSource.class.getClassLoader());
        }
    }
}

