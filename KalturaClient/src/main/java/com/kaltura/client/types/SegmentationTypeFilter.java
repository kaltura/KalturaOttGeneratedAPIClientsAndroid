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
import com.kaltura.client.utils.GsonParser;
import com.kaltura.client.utils.request.MultiRequestBuilder;

/**
 * This class was generated using exec.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

/**
 * Filter for segmentation types
 */
@SuppressWarnings("serial")
@MultiRequestBuilder.Tokenizer(SegmentationTypeFilter.Tokenizer.class)
public class SegmentationTypeFilter extends BaseSegmentationTypeFilter {
	
	public interface Tokenizer extends BaseSegmentationTypeFilter.Tokenizer {
		String idIn();
		String kSql();
		String nameContain();
		String assetUserRuleIdIn();
	}

	/**
	 * Comma separated segmentation types identifiers
	 */
	private String idIn;
	/**
	 * KSQL expression
	 */
	private String kSql;
	/**
	 * Name of segment contains specific string value
	 */
	private String nameContain;
	/**
	 * comma-separated list of KalturaSegmentationType.assetUserRuleId values
	 */
	private String assetUserRuleIdIn;

	// idIn:
	public String getIdIn(){
		return this.idIn;
	}
	public void setIdIn(String idIn){
		this.idIn = idIn;
	}

	public void idIn(String multirequestToken){
		setToken("idIn", multirequestToken);
	}

	// kSql:
	public String getKSql(){
		return this.kSql;
	}
	public void setKSql(String kSql){
		this.kSql = kSql;
	}

	public void kSql(String multirequestToken){
		setToken("kSql", multirequestToken);
	}

	// nameContain:
	public String getNameContain(){
		return this.nameContain;
	}
	public void setNameContain(String nameContain){
		this.nameContain = nameContain;
	}

	public void nameContain(String multirequestToken){
		setToken("nameContain", multirequestToken);
	}

	// assetUserRuleIdIn:
	public String getAssetUserRuleIdIn(){
		return this.assetUserRuleIdIn;
	}
	public void setAssetUserRuleIdIn(String assetUserRuleIdIn){
		this.assetUserRuleIdIn = assetUserRuleIdIn;
	}

	public void assetUserRuleIdIn(String multirequestToken){
		setToken("assetUserRuleIdIn", multirequestToken);
	}


	public SegmentationTypeFilter() {
		super();
	}

	public SegmentationTypeFilter(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		idIn = GsonParser.parseString(jsonObject.get("idIn"));
		kSql = GsonParser.parseString(jsonObject.get("kSql"));
		nameContain = GsonParser.parseString(jsonObject.get("nameContain"));
		assetUserRuleIdIn = GsonParser.parseString(jsonObject.get("assetUserRuleIdIn"));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaSegmentationTypeFilter");
		kparams.add("idIn", this.idIn);
		kparams.add("kSql", this.kSql);
		kparams.add("nameContain", this.nameContain);
		kparams.add("assetUserRuleIdIn", this.assetUserRuleIdIn);
		return kparams;
	}


    public static final Creator<SegmentationTypeFilter> CREATOR = new Creator<SegmentationTypeFilter>() {
        @Override
        public SegmentationTypeFilter createFromParcel(Parcel source) {
            return new SegmentationTypeFilter(source);
        }

        @Override
        public SegmentationTypeFilter[] newArray(int size) {
            return new SegmentationTypeFilter[size];
        }
    };

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        super.writeToParcel(dest, flags);
        dest.writeString(this.idIn);
        dest.writeString(this.kSql);
        dest.writeString(this.nameContain);
        dest.writeString(this.assetUserRuleIdIn);
    }

    public SegmentationTypeFilter(Parcel in) {
        super(in);
        this.idIn = in.readString();
        this.kSql = in.readString();
        this.nameContain = in.readString();
        this.assetUserRuleIdIn = in.readString();
    }
}

