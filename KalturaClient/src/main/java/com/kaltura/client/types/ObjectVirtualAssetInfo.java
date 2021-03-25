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
import com.kaltura.client.enums.ObjectVirtualAssetInfoType;
import com.kaltura.client.types.ObjectBase;
import com.kaltura.client.utils.GsonParser;
import com.kaltura.client.utils.request.MultiRequestBuilder;

/**
 * This class was generated using exec.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

@SuppressWarnings("serial")
@MultiRequestBuilder.Tokenizer(ObjectVirtualAssetInfo.Tokenizer.class)
public class ObjectVirtualAssetInfo extends ObjectBase {
	
	public interface Tokenizer extends ObjectBase.Tokenizer {
		String assetStructId();
		String metaId();
		String type();
	}

	/**
	 * Asset struct identifier
	 */
	private Integer assetStructId;
	/**
	 * Meta identifier
	 */
	private Integer metaId;
	/**
	 * Object virtual asset info type
	 */
	private ObjectVirtualAssetInfoType type;

	// assetStructId:
	public Integer getAssetStructId(){
		return this.assetStructId;
	}
	public void setAssetStructId(Integer assetStructId){
		this.assetStructId = assetStructId;
	}

	public void assetStructId(String multirequestToken){
		setToken("assetStructId", multirequestToken);
	}

	// metaId:
	public Integer getMetaId(){
		return this.metaId;
	}
	public void setMetaId(Integer metaId){
		this.metaId = metaId;
	}

	public void metaId(String multirequestToken){
		setToken("metaId", multirequestToken);
	}

	// type:
	public ObjectVirtualAssetInfoType getType(){
		return this.type;
	}
	public void setType(ObjectVirtualAssetInfoType type){
		this.type = type;
	}

	public void type(String multirequestToken){
		setToken("type", multirequestToken);
	}


	public ObjectVirtualAssetInfo() {
		super();
	}

	public ObjectVirtualAssetInfo(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		assetStructId = GsonParser.parseInt(jsonObject.get("assetStructId"));
		metaId = GsonParser.parseInt(jsonObject.get("metaId"));
		type = ObjectVirtualAssetInfoType.get(GsonParser.parseString(jsonObject.get("type")));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaObjectVirtualAssetInfo");
		kparams.add("assetStructId", this.assetStructId);
		kparams.add("metaId", this.metaId);
		kparams.add("type", this.type);
		return kparams;
	}


    public static final Creator<ObjectVirtualAssetInfo> CREATOR = new Creator<ObjectVirtualAssetInfo>() {
        @Override
        public ObjectVirtualAssetInfo createFromParcel(Parcel source) {
            return new ObjectVirtualAssetInfo(source);
        }

        @Override
        public ObjectVirtualAssetInfo[] newArray(int size) {
            return new ObjectVirtualAssetInfo[size];
        }
    };

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        super.writeToParcel(dest, flags);
        dest.writeValue(this.assetStructId);
        dest.writeValue(this.metaId);
        dest.writeInt(this.type == null ? -1 : this.type.ordinal());
    }

    public ObjectVirtualAssetInfo(Parcel in) {
        super(in);
        this.assetStructId = (Integer)in.readValue(Integer.class.getClassLoader());
        this.metaId = (Integer)in.readValue(Integer.class.getClassLoader());
        int tmpType = in.readInt();
        this.type = tmpType == -1 ? null : ObjectVirtualAssetInfoType.values()[tmpType];
    }
}

