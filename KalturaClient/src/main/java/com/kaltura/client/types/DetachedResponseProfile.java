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
import com.kaltura.client.types.RelatedObjectFilter;
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
 * Define specific base profile response
 */
@SuppressWarnings("serial")
@MultiRequestBuilder.Tokenizer(DetachedResponseProfile.Tokenizer.class)
public class DetachedResponseProfile extends BaseResponseProfile {
	
	public interface Tokenizer extends BaseResponseProfile.Tokenizer {
		String name();
		RelatedObjectFilter.Tokenizer filter();
		RequestBuilder.ListTokenizer<DetachedResponseProfile.Tokenizer> relatedProfiles();
	}

	/**
	 * name
	 */
	private String name;
	/**
	 * filter
	 */
	private RelatedObjectFilter filter;
	/**
	 * relatedProfiles
	 */
	private List<DetachedResponseProfile> relatedProfiles;

	// name:
	public String getName(){
		return this.name;
	}
	public void setName(String name){
		this.name = name;
	}

	public void name(String multirequestToken){
		setToken("name", multirequestToken);
	}

	// filter:
	public RelatedObjectFilter getFilter(){
		return this.filter;
	}
	public void setFilter(RelatedObjectFilter filter){
		this.filter = filter;
	}

	// relatedProfiles:
	public List<DetachedResponseProfile> getRelatedProfiles(){
		return this.relatedProfiles;
	}
	public void setRelatedProfiles(List<DetachedResponseProfile> relatedProfiles){
		this.relatedProfiles = relatedProfiles;
	}


	public DetachedResponseProfile() {
		super();
	}

	public DetachedResponseProfile(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		name = GsonParser.parseString(jsonObject.get("name"));
		filter = GsonParser.parseObject(jsonObject.getAsJsonObject("filter"), RelatedObjectFilter.class);
		relatedProfiles = GsonParser.parseArray(jsonObject.getAsJsonArray("relatedProfiles"), DetachedResponseProfile.class);

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaDetachedResponseProfile");
		kparams.add("name", this.name);
		kparams.add("filter", this.filter);
		kparams.add("relatedProfiles", this.relatedProfiles);
		return kparams;
	}


    public static final Creator<DetachedResponseProfile> CREATOR = new Creator<DetachedResponseProfile>() {
        @Override
        public DetachedResponseProfile createFromParcel(Parcel source) {
            return new DetachedResponseProfile(source);
        }

        @Override
        public DetachedResponseProfile[] newArray(int size) {
            return new DetachedResponseProfile[size];
        }
    };

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        super.writeToParcel(dest, flags);
        dest.writeString(this.name);
        dest.writeParcelable(this.filter, flags);
        if(this.relatedProfiles != null) {
            dest.writeInt(this.relatedProfiles.size());
            dest.writeList(this.relatedProfiles);
        } else {
            dest.writeInt(-1);
        }
    }

    public DetachedResponseProfile(Parcel in) {
        super(in);
        this.name = in.readString();
        this.filter = in.readParcelable(RelatedObjectFilter.class.getClassLoader());
        int relatedProfilesSize = in.readInt();
        if( relatedProfilesSize > -1) {
            this.relatedProfiles = new ArrayList<>();
            in.readList(this.relatedProfiles, DetachedResponseProfile.class.getClassLoader());
        }
    }
}

