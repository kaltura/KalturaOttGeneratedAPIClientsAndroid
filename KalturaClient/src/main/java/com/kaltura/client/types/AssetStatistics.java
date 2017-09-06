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
import com.kaltura.client.types.BuzzScore;
import com.kaltura.client.types.ObjectBase;
import com.kaltura.client.utils.GsonParser;
import com.kaltura.client.utils.request.MultiRequestBuilder;

/**
 * This class was generated using clients-generator\exec.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

/**  Asset statistics  */
@SuppressWarnings("serial")
@MultiRequestBuilder.Tokenizer(AssetStatistics.Tokenizer.class)
public class AssetStatistics extends ObjectBase {
	
	public interface Tokenizer extends ObjectBase.Tokenizer {
		String assetId();
		String likes();
		String views();
		String ratingCount();
		String rating();
		BuzzScore.Tokenizer buzzScore();
	}

	/**  Unique identifier for the asset  */
	private Integer assetId;
	/**  Total number of likes for this asset  */
	private Integer likes;
	/**  Total number of views for this asset  */
	private Integer views;
	/**  Number of people that rated the asset  */
	private Integer ratingCount;
	/**  Average rating for the asset  */
	private Double rating;
	/**  Buzz score  */
	private BuzzScore buzzScore;

	// assetId:
	public Integer getAssetId(){
		return this.assetId;
	}
	public void setAssetId(Integer assetId){
		this.assetId = assetId;
	}

	public void assetId(String multirequestToken){
		setToken("assetId", multirequestToken);
	}

	// likes:
	public Integer getLikes(){
		return this.likes;
	}
	public void setLikes(Integer likes){
		this.likes = likes;
	}

	public void likes(String multirequestToken){
		setToken("likes", multirequestToken);
	}

	// views:
	public Integer getViews(){
		return this.views;
	}
	public void setViews(Integer views){
		this.views = views;
	}

	public void views(String multirequestToken){
		setToken("views", multirequestToken);
	}

	// ratingCount:
	public Integer getRatingCount(){
		return this.ratingCount;
	}
	public void setRatingCount(Integer ratingCount){
		this.ratingCount = ratingCount;
	}

	public void ratingCount(String multirequestToken){
		setToken("ratingCount", multirequestToken);
	}

	// rating:
	public Double getRating(){
		return this.rating;
	}
	public void setRating(Double rating){
		this.rating = rating;
	}

	public void rating(String multirequestToken){
		setToken("rating", multirequestToken);
	}

	// buzzScore:
	public BuzzScore getBuzzScore(){
		return this.buzzScore;
	}
	public void setBuzzScore(BuzzScore buzzScore){
		this.buzzScore = buzzScore;
	}


	public AssetStatistics() {
		super();
	}

	public AssetStatistics(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		assetId = GsonParser.parseInt(jsonObject.get("assetId"));
		likes = GsonParser.parseInt(jsonObject.get("likes"));
		views = GsonParser.parseInt(jsonObject.get("views"));
		ratingCount = GsonParser.parseInt(jsonObject.get("ratingCount"));
		rating = GsonParser.parseDouble(jsonObject.get("rating"));
		buzzScore = GsonParser.parseObject(jsonObject.getAsJsonObject("buzzScore"), BuzzScore.class);

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaAssetStatistics");
		kparams.add("assetId", this.assetId);
		kparams.add("likes", this.likes);
		kparams.add("views", this.views);
		kparams.add("ratingCount", this.ratingCount);
		kparams.add("rating", this.rating);
		kparams.add("buzzScore", this.buzzScore);
		return kparams;
	}


    public static final Creator<AssetStatistics> CREATOR = new Creator<AssetStatistics>() {
        @Override
        public AssetStatistics createFromParcel(Parcel source) {
            return new AssetStatistics(source);
        }

        @Override
        public AssetStatistics[] newArray(int size) {
            return new AssetStatistics[size];
        }
    };

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        super.writeToParcel(dest, flags);
        dest.writeValue(this.assetId);
        dest.writeValue(this.likes);
        dest.writeValue(this.views);
        dest.writeValue(this.ratingCount);
        dest.writeValue(this.rating);
        dest.writeParcelable(this.buzzScore, flags);
    }

    public AssetStatistics(Parcel in) {
        super(in);
        this.assetId = (Integer)in.readValue(Integer.class.getClassLoader());
        this.likes = (Integer)in.readValue(Integer.class.getClassLoader());
        this.views = (Integer)in.readValue(Integer.class.getClassLoader());
        this.ratingCount = (Integer)in.readValue(Integer.class.getClassLoader());
        this.rating = (Double)in.readValue(Double.class.getClassLoader());
        this.buzzScore = in.readParcelable(BuzzScore.class.getClassLoader());
    }
}

