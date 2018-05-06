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

@SuppressWarnings("serial")
@MultiRequestBuilder.Tokenizer(DynamicChannel.Tokenizer.class)
public class DynamicChannel extends Channel {
	
	public interface Tokenizer extends Channel.Tokenizer {
		String kSql();
		RequestBuilder.ListTokenizer<IntegerValue.Tokenizer> channelAssetTypes();
		AssetGroupBy.Tokenizer channelGroupBy();
	}

	/**
	 * Search assets using dynamic criteria. Provided collection of nested expressions
	  with key, comparison operators, value, and logical conjunction.             
	  Possible keys: any Tag or Meta defined in the system and the following reserved
	  keys: start_date, end_date.               epg_id, media_id - for specific asset
	  IDs.              geo_block - only valid value is &amp;quot;true&amp;quot;: When
	  enabled, only assets that are not restriced to the user by geo-block rules will
	  return.              parental_rules - only valid value is
	  &amp;quot;true&amp;quot;: When enabled, only assets that the user
	  doesn&amp;#39;t need to provide PIN code will return.             
	  user_interests - only valid value is &amp;quot;true&amp;quot;. When enabled,
	  only assets that the user defined as his interests (by tags and metas) will
	  return.              epg_channel_id – the channel identifier of the EPG
	  program.              entitled_assets - valid values: &amp;quot;free&amp;quot;,
	  &amp;quot;entitled&amp;quot;, &amp;quot;both&amp;quot;. free - gets only free to
	  watch assets. entitled - only those that the user is implicitly entitled to
	  watch.              Comparison operators: for numerical fields =, &amp;gt;,
	  &amp;gt;=, &amp;lt;, &amp;lt;=, : (in).               For alpha-numerical fields
	  =, != (not), ~ (like), !~, ^ (any word starts with), ^= (phrase starts with), +
	  (exists), !+ (not exists).              Logical conjunction: and, or.           
	     Search values are limited to 20 characters each.              (maximum length
	  of entire filter is 2048 characters)
	 */
	private String kSql;
	/**
	 * Asset types in the channel.              -26 is EPG
	 */
	private List<IntegerValue> channelAssetTypes;
	/**
	 * Channel group by
	 */
	private AssetGroupBy channelGroupBy;

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

	// channelAssetTypes:
	public List<IntegerValue> getChannelAssetTypes(){
		return this.channelAssetTypes;
	}
	public void setChannelAssetTypes(List<IntegerValue> channelAssetTypes){
		this.channelAssetTypes = channelAssetTypes;
	}

	// channelGroupBy:
	public AssetGroupBy getChannelGroupBy(){
		return this.channelGroupBy;
	}
	public void setChannelGroupBy(AssetGroupBy channelGroupBy){
		this.channelGroupBy = channelGroupBy;
	}


	public DynamicChannel() {
		super();
	}

	public DynamicChannel(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		kSql = GsonParser.parseString(jsonObject.get("kSql"));
		channelAssetTypes = GsonParser.parseArray(jsonObject.getAsJsonArray("channelAssetTypes"), IntegerValue.class);
		channelGroupBy = GsonParser.parseObject(jsonObject.getAsJsonObject("channelGroupBy"), AssetGroupBy.class);

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaDynamicChannel");
		kparams.add("kSql", this.kSql);
		kparams.add("channelAssetTypes", this.channelAssetTypes);
		kparams.add("channelGroupBy", this.channelGroupBy);
		return kparams;
	}


    public static final Creator<DynamicChannel> CREATOR = new Creator<DynamicChannel>() {
        @Override
        public DynamicChannel createFromParcel(Parcel source) {
            return new DynamicChannel(source);
        }

        @Override
        public DynamicChannel[] newArray(int size) {
            return new DynamicChannel[size];
        }
    };

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        super.writeToParcel(dest, flags);
        dest.writeString(this.kSql);
        if(this.channelAssetTypes != null) {
            dest.writeInt(this.channelAssetTypes.size());
            dest.writeList(this.channelAssetTypes);
        } else {
            dest.writeInt(-1);
        }
        dest.writeParcelable(this.channelGroupBy, flags);
    }

    public DynamicChannel(Parcel in) {
        super(in);
        this.kSql = in.readString();
        int channelAssetTypesSize = in.readInt();
        if( channelAssetTypesSize > -1) {
            this.channelAssetTypes = new ArrayList<>();
            in.readList(this.channelAssetTypes, IntegerValue.class.getClassLoader());
        }
        this.channelGroupBy = in.readParcelable(AssetGroupBy.class.getClassLoader());
    }
}

