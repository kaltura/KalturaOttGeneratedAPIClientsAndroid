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
 * This class was generated using exec.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

@SuppressWarnings("serial")
@MultiRequestBuilder.Tokenizer(ObjectVirtualAssetPartnerConfig.Tokenizer.class)
public class ObjectVirtualAssetPartnerConfig extends PartnerConfiguration {
	
	public interface Tokenizer extends PartnerConfiguration.Tokenizer {
		RequestBuilder.ListTokenizer<ObjectVirtualAssetInfo.Tokenizer> objectVirtualAssets();
	}

	/**
	 * List of object virtual asset info
	 */
	private List<ObjectVirtualAssetInfo> objectVirtualAssets;

	// objectVirtualAssets:
	public List<ObjectVirtualAssetInfo> getObjectVirtualAssets(){
		return this.objectVirtualAssets;
	}
	public void setObjectVirtualAssets(List<ObjectVirtualAssetInfo> objectVirtualAssets){
		this.objectVirtualAssets = objectVirtualAssets;
	}


	public ObjectVirtualAssetPartnerConfig() {
		super();
	}

	public ObjectVirtualAssetPartnerConfig(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		objectVirtualAssets = GsonParser.parseArray(jsonObject.getAsJsonArray("objectVirtualAssets"), ObjectVirtualAssetInfo.class);

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaObjectVirtualAssetPartnerConfig");
		kparams.add("objectVirtualAssets", this.objectVirtualAssets);
		return kparams;
	}


    public static final Creator<ObjectVirtualAssetPartnerConfig> CREATOR = new Creator<ObjectVirtualAssetPartnerConfig>() {
        @Override
        public ObjectVirtualAssetPartnerConfig createFromParcel(Parcel source) {
            return new ObjectVirtualAssetPartnerConfig(source);
        }

        @Override
        public ObjectVirtualAssetPartnerConfig[] newArray(int size) {
            return new ObjectVirtualAssetPartnerConfig[size];
        }
    };

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        super.writeToParcel(dest, flags);
        if(this.objectVirtualAssets != null) {
            dest.writeInt(this.objectVirtualAssets.size());
            dest.writeList(this.objectVirtualAssets);
        } else {
            dest.writeInt(-1);
        }
    }

    public ObjectVirtualAssetPartnerConfig(Parcel in) {
        super(in);
        int objectVirtualAssetsSize = in.readInt();
        if( objectVirtualAssetsSize > -1) {
            this.objectVirtualAssets = new ArrayList<>();
            in.readList(this.objectVirtualAssets, ObjectVirtualAssetInfo.class.getClassLoader());
        }
    }
}

