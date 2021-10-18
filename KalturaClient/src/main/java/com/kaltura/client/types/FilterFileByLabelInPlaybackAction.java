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
import com.kaltura.client.utils.request.MultiRequestBuilder;

/**
 * This class was generated using exec.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

@SuppressWarnings("serial")
@MultiRequestBuilder.Tokenizer(FilterFileByLabelInPlaybackAction.Tokenizer.class)
public class FilterFileByLabelInPlaybackAction extends FilterFileByLabelAction {
	
	public interface Tokenizer extends FilterFileByLabelAction.Tokenizer {
	}



	public FilterFileByLabelInPlaybackAction() {
		super();
	}

	public FilterFileByLabelInPlaybackAction(JsonObject jsonObject) throws APIException {
		super(jsonObject);
	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaFilterFileByLabelInPlaybackAction");
		return kparams;
	}


    public static final Creator<FilterFileByLabelInPlaybackAction> CREATOR = new Creator<FilterFileByLabelInPlaybackAction>() {
        @Override
        public FilterFileByLabelInPlaybackAction createFromParcel(Parcel source) {
            return new FilterFileByLabelInPlaybackAction(source);
        }

        @Override
        public FilterFileByLabelInPlaybackAction[] newArray(int size) {
            return new FilterFileByLabelInPlaybackAction[size];
        }
    };

    public FilterFileByLabelInPlaybackAction(Parcel in) {
        super(in);
    }
}

