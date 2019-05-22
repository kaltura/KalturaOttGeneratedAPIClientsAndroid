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
import com.kaltura.client.utils.GsonParser;
import com.kaltura.client.utils.request.MultiRequestBuilder;

/**
 * This class was generated using exec.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

@SuppressWarnings("serial")
@MultiRequestBuilder.Tokenizer(TopicNotificationMessageFilter.Tokenizer.class)
public class TopicNotificationMessageFilter extends Filter {
	
	public interface Tokenizer extends Filter.Tokenizer {
		String topicNotificationIdEqual();
	}

	/**
	 * Topic notification ID
	 */
	private Long topicNotificationIdEqual;

	// topicNotificationIdEqual:
	public Long getTopicNotificationIdEqual(){
		return this.topicNotificationIdEqual;
	}
	public void setTopicNotificationIdEqual(Long topicNotificationIdEqual){
		this.topicNotificationIdEqual = topicNotificationIdEqual;
	}

	public void topicNotificationIdEqual(String multirequestToken){
		setToken("topicNotificationIdEqual", multirequestToken);
	}


	public TopicNotificationMessageFilter() {
		super();
	}

	public TopicNotificationMessageFilter(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		topicNotificationIdEqual = GsonParser.parseLong(jsonObject.get("topicNotificationIdEqual"));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaTopicNotificationMessageFilter");
		kparams.add("topicNotificationIdEqual", this.topicNotificationIdEqual);
		return kparams;
	}


    public static final Creator<TopicNotificationMessageFilter> CREATOR = new Creator<TopicNotificationMessageFilter>() {
        @Override
        public TopicNotificationMessageFilter createFromParcel(Parcel source) {
            return new TopicNotificationMessageFilter(source);
        }

        @Override
        public TopicNotificationMessageFilter[] newArray(int size) {
            return new TopicNotificationMessageFilter[size];
        }
    };

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        super.writeToParcel(dest, flags);
        dest.writeValue(this.topicNotificationIdEqual);
    }

    public TopicNotificationMessageFilter(Parcel in) {
        super(in);
        this.topicNotificationIdEqual = (Long)in.readValue(Long.class.getClassLoader());
    }
}

