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
import java.util.HashMap;
import java.util.Map;

/**
 * This class was generated using exec.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

/**
 * Metadata generation result object.
 */
@SuppressWarnings("serial")
@MultiRequestBuilder.Tokenizer(GenerateMetadataResult.Tokenizer.class)
public class GenerateMetadataResult extends ObjectBase {
	
	public interface Tokenizer extends ObjectBase.Tokenizer {
		RequestBuilder.MapTokenizer<TranslationToken.Tokenizer> enrichedMetadata();
	}

	/**
	 * A dictionary/map containing the generated metadata. The map key includes the
	  metadata name and the map value includes the generated value.
	 */
	private Map<String, TranslationToken> enrichedMetadata;

	// enrichedMetadata:
	public Map<String, TranslationToken> getEnrichedMetadata(){
		return this.enrichedMetadata;
	}
	public void setEnrichedMetadata(Map<String, TranslationToken> enrichedMetadata){
		this.enrichedMetadata = enrichedMetadata;
	}


	public GenerateMetadataResult() {
		super();
	}

	public GenerateMetadataResult(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		enrichedMetadata = GsonParser.parseMap(jsonObject.getAsJsonObject("enrichedMetadata"), TranslationToken.class);

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaGenerateMetadataResult");
		kparams.add("enrichedMetadata", this.enrichedMetadata);
		return kparams;
	}


    public static final Creator<GenerateMetadataResult> CREATOR = new Creator<GenerateMetadataResult>() {
        @Override
        public GenerateMetadataResult createFromParcel(Parcel source) {
            return new GenerateMetadataResult(source);
        }

        @Override
        public GenerateMetadataResult[] newArray(int size) {
            return new GenerateMetadataResult[size];
        }
    };

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        super.writeToParcel(dest, flags);
        if(this.enrichedMetadata != null) {
            dest.writeInt(this.enrichedMetadata.size());
            for (Map.Entry<String, TranslationToken> entry : this.enrichedMetadata.entrySet()) {
                dest.writeString(entry.getKey());
                dest.writeParcelable(entry.getValue(), flags);
            }
        } else {
            dest.writeInt(-1);
        }
    }

    public GenerateMetadataResult(Parcel in) {
        super(in);
        int enrichedMetadataSize = in.readInt();
        if( enrichedMetadataSize > -1) {
            this.enrichedMetadata = new HashMap<>();
            for (int i = 0; i < enrichedMetadataSize; i++) {
                String key = in.readString();
                TranslationToken value = in.readParcelable(TranslationToken.class.getClassLoader());
                this.enrichedMetadata.put(key, value);
            }
        }
    }
}

