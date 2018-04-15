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
// Copyright (C) 2006-2018  Kaltura Inc.
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

/**
 * Translated string
 */
@SuppressWarnings("serial")
@MultiRequestBuilder.Tokenizer(MultilingualString.Tokenizer.class)
public class MultilingualString extends ObjectBase {
	
	public interface Tokenizer extends ObjectBase.Tokenizer {
		RequestBuilder.ListTokenizer<TranslationToken.Tokenizer> values();
	}

	/**
	 * All values in different languages
	 */
	private List<TranslationToken> values;

	// values:
	public List<TranslationToken> getValues(){
		return this.values;
	}
	public void setValues(List<TranslationToken> values){
		this.values = values;
	}


	public MultilingualString() {
		super();
	}

	public MultilingualString(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		values = GsonParser.parseArray(jsonObject.getAsJsonArray("values"), TranslationToken.class);

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaMultilingualString");
		kparams.add("values", this.values);
		return kparams;
	}


    public static final Creator<MultilingualString> CREATOR = new Creator<MultilingualString>() {
        @Override
        public MultilingualString createFromParcel(Parcel source) {
            return new MultilingualString(source);
        }

        @Override
        public MultilingualString[] newArray(int size) {
            return new MultilingualString[size];
        }
    };

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        super.writeToParcel(dest, flags);
        if(this.values != null) {
            dest.writeInt(this.values.size());
            dest.writeList(this.values);
        } else {
            dest.writeInt(-1);
        }
    }

    public MultilingualString(Parcel in) {
        super(in);
        int valuesSize = in.readInt();
        if( valuesSize > -1) {
            this.values = new ArrayList<>();
            in.readList(this.values, TranslationToken.class.getClassLoader());
        }
    }
}

