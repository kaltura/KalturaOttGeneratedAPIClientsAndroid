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
import com.kaltura.client.types.TreeQuestion;
import com.kaltura.client.types.TreeRecommendations;
import com.kaltura.client.utils.GsonParser;
import com.kaltura.client.utils.request.MultiRequestBuilder;
import com.kaltura.client.utils.request.RequestBuilder;
import java.util.ArrayList;
import java.util.List;

/**
 * This class was generated using exec.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

/**
 * A class representing the response from the getNextNodeAndRecommendation API.    
           Contains the next question, possible answers, and content
  recommendations.
 */
@SuppressWarnings("serial")
@MultiRequestBuilder.Tokenizer(TreeNextNodeResponse.Tokenizer.class)
public class TreeNextNodeResponse extends ObjectBase {
	
	public interface Tokenizer extends ObjectBase.Tokenizer {
		String treeId();
		TreeQuestion.Tokenizer question();
		String totalLevelQuestions();
		RequestBuilder.ListTokenizer<TreeAnswer.Tokenizer> answers();
		TreeRecommendations.Tokenizer recommendations();
	}

	/**
	 * The tree id whom this node belongs to.
	 */
	private String treeId;
	/**
	 * The next question to present to the user, or null for terminal nodes.
	 */
	private TreeQuestion question;
	/**
	 * Number of total questions in the level.
	 */
	private Integer totalLevelQuestions;
	/**
	 * Array of possible answer options for the question.
	 */
	private List<TreeAnswer> answers;
	/**
	 * Content recommendations based on the current path.
	 */
	private TreeRecommendations recommendations;

	// treeId:
	public String getTreeId(){
		return this.treeId;
	}
	public void setTreeId(String treeId){
		this.treeId = treeId;
	}

	public void treeId(String multirequestToken){
		setToken("treeId", multirequestToken);
	}

	// question:
	public TreeQuestion getQuestion(){
		return this.question;
	}
	public void setQuestion(TreeQuestion question){
		this.question = question;
	}

	// totalLevelQuestions:
	public Integer getTotalLevelQuestions(){
		return this.totalLevelQuestions;
	}
	public void setTotalLevelQuestions(Integer totalLevelQuestions){
		this.totalLevelQuestions = totalLevelQuestions;
	}

	public void totalLevelQuestions(String multirequestToken){
		setToken("totalLevelQuestions", multirequestToken);
	}

	// answers:
	public List<TreeAnswer> getAnswers(){
		return this.answers;
	}
	public void setAnswers(List<TreeAnswer> answers){
		this.answers = answers;
	}

	// recommendations:
	public TreeRecommendations getRecommendations(){
		return this.recommendations;
	}
	public void setRecommendations(TreeRecommendations recommendations){
		this.recommendations = recommendations;
	}


	public TreeNextNodeResponse() {
		super();
	}

	public TreeNextNodeResponse(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		treeId = GsonParser.parseString(jsonObject.get("treeId"));
		question = GsonParser.parseObject(jsonObject.getAsJsonObject("question"), TreeQuestion.class);
		totalLevelQuestions = GsonParser.parseInt(jsonObject.get("totalLevelQuestions"));
		answers = GsonParser.parseArray(jsonObject.getAsJsonArray("answers"), TreeAnswer.class);
		recommendations = GsonParser.parseObject(jsonObject.getAsJsonObject("recommendations"), TreeRecommendations.class);

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaTreeNextNodeResponse");
		kparams.add("treeId", this.treeId);
		kparams.add("question", this.question);
		kparams.add("totalLevelQuestions", this.totalLevelQuestions);
		kparams.add("answers", this.answers);
		kparams.add("recommendations", this.recommendations);
		return kparams;
	}


    public static final Creator<TreeNextNodeResponse> CREATOR = new Creator<TreeNextNodeResponse>() {
        @Override
        public TreeNextNodeResponse createFromParcel(Parcel source) {
            return new TreeNextNodeResponse(source);
        }

        @Override
        public TreeNextNodeResponse[] newArray(int size) {
            return new TreeNextNodeResponse[size];
        }
    };

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        super.writeToParcel(dest, flags);
        dest.writeString(this.treeId);
        dest.writeParcelable(this.question, flags);
        dest.writeValue(this.totalLevelQuestions);
        if(this.answers != null) {
            dest.writeInt(this.answers.size());
            dest.writeList(this.answers);
        } else {
            dest.writeInt(-1);
        }
        dest.writeParcelable(this.recommendations, flags);
    }

    public TreeNextNodeResponse(Parcel in) {
        super(in);
        this.treeId = in.readString();
        this.question = in.readParcelable(TreeQuestion.class.getClassLoader());
        this.totalLevelQuestions = (Integer)in.readValue(Integer.class.getClassLoader());
        int answersSize = in.readInt();
        if( answersSize > -1) {
            this.answers = new ArrayList<>();
            in.readList(this.answers, TreeAnswer.class.getClassLoader());
        }
        this.recommendations = in.readParcelable(TreeRecommendations.class.getClassLoader());
    }
}

