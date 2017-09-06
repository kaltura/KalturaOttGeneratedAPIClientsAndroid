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
import com.kaltura.client.enums.AssetType;
import com.kaltura.client.enums.MetaFieldName;
import com.kaltura.client.enums.MetaType;
import com.kaltura.client.utils.GsonParser;
import com.kaltura.client.utils.request.MultiRequestBuilder;

/**
 * This class was generated using clients-generator\exec.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

/**  Meta filter  */
@SuppressWarnings("serial")
@MultiRequestBuilder.Tokenizer(MetaFilter.Tokenizer.class)
public class MetaFilter extends Filter {
	
	public interface Tokenizer extends Filter.Tokenizer {
		String fieldNameEqual();
		String fieldNameNotEqual();
		String typeEqual();
		String assetTypeEqual();
	}

	/**  Meta system field name to filter by  */
	private MetaFieldName fieldNameEqual;
	/**  Meta system field name to filter by  */
	private MetaFieldName fieldNameNotEqual;
	/**  Meta type to filter by  */
	private MetaType typeEqual;
	/**  Asset type to filter by  */
	private AssetType assetTypeEqual;

	// fieldNameEqual:
	public MetaFieldName getFieldNameEqual(){
		return this.fieldNameEqual;
	}
	public void setFieldNameEqual(MetaFieldName fieldNameEqual){
		this.fieldNameEqual = fieldNameEqual;
	}

	public void fieldNameEqual(String multirequestToken){
		setToken("fieldNameEqual", multirequestToken);
	}

	// fieldNameNotEqual:
	public MetaFieldName getFieldNameNotEqual(){
		return this.fieldNameNotEqual;
	}
	public void setFieldNameNotEqual(MetaFieldName fieldNameNotEqual){
		this.fieldNameNotEqual = fieldNameNotEqual;
	}

	public void fieldNameNotEqual(String multirequestToken){
		setToken("fieldNameNotEqual", multirequestToken);
	}

	// typeEqual:
	public MetaType getTypeEqual(){
		return this.typeEqual;
	}
	public void setTypeEqual(MetaType typeEqual){
		this.typeEqual = typeEqual;
	}

	public void typeEqual(String multirequestToken){
		setToken("typeEqual", multirequestToken);
	}

	// assetTypeEqual:
	public AssetType getAssetTypeEqual(){
		return this.assetTypeEqual;
	}
	public void setAssetTypeEqual(AssetType assetTypeEqual){
		this.assetTypeEqual = assetTypeEqual;
	}

	public void assetTypeEqual(String multirequestToken){
		setToken("assetTypeEqual", multirequestToken);
	}


	public MetaFilter() {
		super();
	}

	public MetaFilter(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		fieldNameEqual = MetaFieldName.get(GsonParser.parseString(jsonObject.get("fieldNameEqual")));
		fieldNameNotEqual = MetaFieldName.get(GsonParser.parseString(jsonObject.get("fieldNameNotEqual")));
		typeEqual = MetaType.get(GsonParser.parseString(jsonObject.get("typeEqual")));
		assetTypeEqual = AssetType.get(GsonParser.parseString(jsonObject.get("assetTypeEqual")));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaMetaFilter");
		kparams.add("fieldNameEqual", this.fieldNameEqual);
		kparams.add("fieldNameNotEqual", this.fieldNameNotEqual);
		kparams.add("typeEqual", this.typeEqual);
		kparams.add("assetTypeEqual", this.assetTypeEqual);
		return kparams;
	}


    public static final Creator<MetaFilter> CREATOR = new Creator<MetaFilter>() {
        @Override
        public MetaFilter createFromParcel(Parcel source) {
            return new MetaFilter(source);
        }

        @Override
        public MetaFilter[] newArray(int size) {
            return new MetaFilter[size];
        }
    };

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        super.writeToParcel(dest, flags);
        dest.writeInt(this.fieldNameEqual == null ? -1 : this.fieldNameEqual.ordinal());
        dest.writeInt(this.fieldNameNotEqual == null ? -1 : this.fieldNameNotEqual.ordinal());
        dest.writeInt(this.typeEqual == null ? -1 : this.typeEqual.ordinal());
        dest.writeInt(this.assetTypeEqual == null ? -1 : this.assetTypeEqual.ordinal());
    }

    public MetaFilter(Parcel in) {
        super(in);
        int tmpFieldNameEqual = in.readInt();
        this.fieldNameEqual = tmpFieldNameEqual == -1 ? null : MetaFieldName.values()[tmpFieldNameEqual];
        int tmpFieldNameNotEqual = in.readInt();
        this.fieldNameNotEqual = tmpFieldNameNotEqual == -1 ? null : MetaFieldName.values()[tmpFieldNameNotEqual];
        int tmpTypeEqual = in.readInt();
        this.typeEqual = tmpTypeEqual == -1 ? null : MetaType.values()[tmpTypeEqual];
        int tmpAssetTypeEqual = in.readInt();
        this.assetTypeEqual = tmpAssetTypeEqual == -1 ? null : AssetType.values()[tmpAssetTypeEqual];
    }
}

