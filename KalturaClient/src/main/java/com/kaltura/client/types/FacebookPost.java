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
@MultiRequestBuilder.Tokenizer(FacebookPost.Tokenizer.class)
public class FacebookPost extends SocialNetworkComment {
	
	public interface Tokenizer extends SocialNetworkComment.Tokenizer {
		RequestBuilder.ListTokenizer<SocialNetworkComment.Tokenizer> comments();
		String link();
	}

	/**
	 * List of comments on the post
	 */
	private List<SocialNetworkComment> comments;
	/**
	 * A link associated to the post
	 */
	private String link;

	// comments:
	public List<SocialNetworkComment> getComments(){
		return this.comments;
	}
	public void setComments(List<SocialNetworkComment> comments){
		this.comments = comments;
	}

	// link:
	public String getLink(){
		return this.link;
	}
	public void setLink(String link){
		this.link = link;
	}

	public void link(String multirequestToken){
		setToken("link", multirequestToken);
	}


	public FacebookPost() {
		super();
	}

	public FacebookPost(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		comments = GsonParser.parseArray(jsonObject.getAsJsonArray("comments"), SocialNetworkComment.class);
		link = GsonParser.parseString(jsonObject.get("link"));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaFacebookPost");
		kparams.add("comments", this.comments);
		kparams.add("link", this.link);
		return kparams;
	}


    public static final Creator<FacebookPost> CREATOR = new Creator<FacebookPost>() {
        @Override
        public FacebookPost createFromParcel(Parcel source) {
            return new FacebookPost(source);
        }

        @Override
        public FacebookPost[] newArray(int size) {
            return new FacebookPost[size];
        }
    };

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        super.writeToParcel(dest, flags);
        if(this.comments != null) {
            dest.writeInt(this.comments.size());
            dest.writeList(this.comments);
        } else {
            dest.writeInt(-1);
        }
        dest.writeString(this.link);
    }

    public FacebookPost(Parcel in) {
        super(in);
        int commentsSize = in.readInt();
        if( commentsSize > -1) {
            this.comments = new ArrayList<>();
            in.readList(this.comments, SocialNetworkComment.class.getClassLoader());
        }
        this.link = in.readString();
    }
}

