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
import com.kaltura.client.enums.AssetOrderBy;
import com.kaltura.client.types.AssetGroupBy;
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
 * Channel details
 */
@SuppressWarnings("serial")
@MultiRequestBuilder.Tokenizer(Channel.Tokenizer.class)
public class Channel extends BaseChannel {
	
	public interface Tokenizer extends BaseChannel.Tokenizer {
		String description();
		RequestBuilder.ListTokenizer<MediaImage.Tokenizer> images();
		RequestBuilder.ListTokenizer<IntegerValue.Tokenizer> assetTypes();
		String filterExpression();
		String isActive();
		String order();
		AssetGroupBy.Tokenizer groupBy();
	}

	/**
	 * Cannel description
	 */
	private String description;
	/**
	 * Channel images
	 */
	private List<MediaImage> images;
	/**
	 * Asset types in the channel.              -26 is EPG
	 */
	private List<IntegerValue> assetTypes;
	/**
	 * Filter expression
	 */
	private String filterExpression;
	/**
	 * active status
	 */
	private Boolean isActive;
	/**
	 * Channel order
	 */
	private AssetOrderBy order;
	/**
	 * Channel group by
	 */
	private AssetGroupBy groupBy;

	// description:
	public String getDescription(){
		return this.description;
	}
	public void setDescription(String description){
		this.description = description;
	}

	public void description(String multirequestToken){
		setToken("description", multirequestToken);
	}

	// images:
	public List<MediaImage> getImages(){
		return this.images;
	}
	public void setImages(List<MediaImage> images){
		this.images = images;
	}

	// assetTypes:
	public List<IntegerValue> getAssetTypes(){
		return this.assetTypes;
	}
	public void setAssetTypes(List<IntegerValue> assetTypes){
		this.assetTypes = assetTypes;
	}

	// filterExpression:
	public String getFilterExpression(){
		return this.filterExpression;
	}
	public void setFilterExpression(String filterExpression){
		this.filterExpression = filterExpression;
	}

	public void filterExpression(String multirequestToken){
		setToken("filterExpression", multirequestToken);
	}

	// isActive:
	public Boolean getIsActive(){
		return this.isActive;
	}
	public void setIsActive(Boolean isActive){
		this.isActive = isActive;
	}

	public void isActive(String multirequestToken){
		setToken("isActive", multirequestToken);
	}

	// order:
	public AssetOrderBy getOrder(){
		return this.order;
	}
	public void setOrder(AssetOrderBy order){
		this.order = order;
	}

	public void order(String multirequestToken){
		setToken("order", multirequestToken);
	}

	// groupBy:
	public AssetGroupBy getGroupBy(){
		return this.groupBy;
	}
	public void setGroupBy(AssetGroupBy groupBy){
		this.groupBy = groupBy;
	}


	public Channel() {
		super();
	}

	public Channel(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		description = GsonParser.parseString(jsonObject.get("description"));
		images = GsonParser.parseArray(jsonObject.getAsJsonArray("images"), MediaImage.class);
		assetTypes = GsonParser.parseArray(jsonObject.getAsJsonArray("assetTypes"), IntegerValue.class);
		filterExpression = GsonParser.parseString(jsonObject.get("filterExpression"));
		isActive = GsonParser.parseBoolean(jsonObject.get("isActive"));
		order = AssetOrderBy.get(GsonParser.parseString(jsonObject.get("order")));
		groupBy = GsonParser.parseObject(jsonObject.getAsJsonObject("groupBy"), AssetGroupBy.class);

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaChannel");
		kparams.add("description", this.description);
		kparams.add("images", this.images);
		kparams.add("assetTypes", this.assetTypes);
		kparams.add("filterExpression", this.filterExpression);
		kparams.add("isActive", this.isActive);
		kparams.add("order", this.order);
		kparams.add("groupBy", this.groupBy);
		return kparams;
	}


    public static final Creator<Channel> CREATOR = new Creator<Channel>() {
        @Override
        public Channel createFromParcel(Parcel source) {
            return new Channel(source);
        }

        @Override
        public Channel[] newArray(int size) {
            return new Channel[size];
        }
    };

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        super.writeToParcel(dest, flags);
        dest.writeString(this.description);
        if(this.images != null) {
            dest.writeInt(this.images.size());
            dest.writeList(this.images);
        } else {
            dest.writeInt(-1);
        }
        if(this.assetTypes != null) {
            dest.writeInt(this.assetTypes.size());
            dest.writeList(this.assetTypes);
        } else {
            dest.writeInt(-1);
        }
        dest.writeString(this.filterExpression);
        dest.writeValue(this.isActive);
        dest.writeInt(this.order == null ? -1 : this.order.ordinal());
        dest.writeParcelable(this.groupBy, flags);
    }

    public Channel(Parcel in) {
        super(in);
        this.description = in.readString();
        int imagesSize = in.readInt();
        if( imagesSize > -1) {
            this.images = new ArrayList<>();
            in.readList(this.images, MediaImage.class.getClassLoader());
        }
        int assetTypesSize = in.readInt();
        if( assetTypesSize > -1) {
            this.assetTypes = new ArrayList<>();
            in.readList(this.assetTypes, IntegerValue.class.getClassLoader());
        }
        this.filterExpression = in.readString();
        this.isActive = (Boolean)in.readValue(Boolean.class.getClassLoader());
        int tmpOrder = in.readInt();
        this.order = tmpOrder == -1 ? null : AssetOrderBy.values()[tmpOrder];
        this.groupBy = in.readParcelable(AssetGroupBy.class.getClassLoader());
    }
}

