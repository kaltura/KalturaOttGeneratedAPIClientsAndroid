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
 * Defines a condition which is essentially a combination of several content-based
  actions, each has their own score multiplier
 */
@SuppressWarnings("serial")
@MultiRequestBuilder.Tokenizer(ContentScoreCondition.Tokenizer.class)
public class ContentScoreCondition extends BaseSegmentCondition {
	
	public interface Tokenizer extends BaseSegmentCondition.Tokenizer {
		String score();
		RequestBuilder.ListTokenizer<ContentActionCondition.Tokenizer> actions();
	}

	/**
	 * The minimum score to be met
	 */
	private Integer score;
	/**
	 * List of the actions that consist the condition
	 */
	private List<ContentActionCondition> actions;

	// score:
	public Integer getScore(){
		return this.score;
	}
	public void setScore(Integer score){
		this.score = score;
	}

	public void score(String multirequestToken){
		setToken("score", multirequestToken);
	}

	// actions:
	public List<ContentActionCondition> getActions(){
		return this.actions;
	}
	public void setActions(List<ContentActionCondition> actions){
		this.actions = actions;
	}


	public ContentScoreCondition() {
		super();
	}

	public ContentScoreCondition(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		score = GsonParser.parseInt(jsonObject.get("score"));
		actions = GsonParser.parseArray(jsonObject.getAsJsonArray("actions"), ContentActionCondition.class);

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaContentScoreCondition");
		kparams.add("score", this.score);
		kparams.add("actions", this.actions);
		return kparams;
	}


    public static final Creator<ContentScoreCondition> CREATOR = new Creator<ContentScoreCondition>() {
        @Override
        public ContentScoreCondition createFromParcel(Parcel source) {
            return new ContentScoreCondition(source);
        }

        @Override
        public ContentScoreCondition[] newArray(int size) {
            return new ContentScoreCondition[size];
        }
    };

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        super.writeToParcel(dest, flags);
        dest.writeValue(this.score);
        if(this.actions != null) {
            dest.writeInt(this.actions.size());
            dest.writeList(this.actions);
        } else {
            dest.writeInt(-1);
        }
    }

    public ContentScoreCondition(Parcel in) {
        super(in);
        this.score = (Integer)in.readValue(Integer.class.getClassLoader());
        int actionsSize = in.readInt();
        if( actionsSize > -1) {
            this.actions = new ArrayList<>();
            in.readList(this.actions, ContentActionCondition.class.getClassLoader());
        }
    }
}

