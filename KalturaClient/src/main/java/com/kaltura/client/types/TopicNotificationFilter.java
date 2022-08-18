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
import com.kaltura.client.types.SubscribeReference;
import com.kaltura.client.utils.GsonParser;
import com.kaltura.client.utils.request.MultiRequestBuilder;

/**
 * This class was generated using exec.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

@SuppressWarnings("serial")
@MultiRequestBuilder.Tokenizer(TopicNotificationFilter.Tokenizer.class)
public class TopicNotificationFilter extends Filter {
	
	public interface Tokenizer extends Filter.Tokenizer {
		SubscribeReference.Tokenizer subscribeReference();
	}

	/**
	 * Subscribe rreference
	 */
	private SubscribeReference subscribeReference;

	// subscribeReference:
	public SubscribeReference getSubscribeReference(){
		return this.subscribeReference;
	}
	public void setSubscribeReference(SubscribeReference subscribeReference){
		this.subscribeReference = subscribeReference;
	}


	public TopicNotificationFilter() {
		super();
	}

	public TopicNotificationFilter(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		subscribeReference = GsonParser.parseObject(jsonObject.getAsJsonObject("subscribeReference"), SubscribeReference.class);

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaTopicNotificationFilter");
		kparams.add("subscribeReference", this.subscribeReference);
		return kparams;
	}


    public static final Creator<TopicNotificationFilter> CREATOR = new Creator<TopicNotificationFilter>() {
        @Override
        public TopicNotificationFilter createFromParcel(Parcel source) {
            return new TopicNotificationFilter(source);
        }

        @Override
        public TopicNotificationFilter[] newArray(int size) {
            return new TopicNotificationFilter[size];
        }
    };

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        super.writeToParcel(dest, flags);
        dest.writeParcelable(this.subscribeReference, flags);
    }

    public TopicNotificationFilter(Parcel in) {
        super(in);
        this.subscribeReference = in.readParcelable(SubscribeReference.class.getClassLoader());
    }
}

