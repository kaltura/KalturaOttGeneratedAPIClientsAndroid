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
 * This class was generated using clients-generator\exec.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

@SuppressWarnings("serial")
@MultiRequestBuilder.Tokenizer(SocialUserConfig.Tokenizer.class)
public class SocialUserConfig extends SocialConfig {
	
	public interface Tokenizer extends SocialConfig.Tokenizer {
		RequestBuilder.ListTokenizer<ActionPermissionItem.Tokenizer> actionPermissionItems();
	}

	/**
	 * List of action permission items
	 */
	private List<ActionPermissionItem> actionPermissionItems;

	// actionPermissionItems:
	public List<ActionPermissionItem> getActionPermissionItems(){
		return this.actionPermissionItems;
	}
	public void setActionPermissionItems(List<ActionPermissionItem> actionPermissionItems){
		this.actionPermissionItems = actionPermissionItems;
	}


	public SocialUserConfig() {
		super();
	}

	public SocialUserConfig(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		actionPermissionItems = GsonParser.parseArray(jsonObject.getAsJsonArray("actionPermissionItems"), ActionPermissionItem.class);

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaSocialUserConfig");
		kparams.add("actionPermissionItems", this.actionPermissionItems);
		return kparams;
	}


    public static final Creator<SocialUserConfig> CREATOR = new Creator<SocialUserConfig>() {
        @Override
        public SocialUserConfig createFromParcel(Parcel source) {
            return new SocialUserConfig(source);
        }

        @Override
        public SocialUserConfig[] newArray(int size) {
            return new SocialUserConfig[size];
        }
    };

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        super.writeToParcel(dest, flags);
        if(this.actionPermissionItems != null) {
            dest.writeInt(this.actionPermissionItems.size());
            dest.writeList(this.actionPermissionItems);
        } else {
            dest.writeInt(-1);
        }
    }

    public SocialUserConfig(Parcel in) {
        super(in);
        int actionPermissionItemsSize = in.readInt();
        if( actionPermissionItemsSize > -1) {
            this.actionPermissionItems = new ArrayList<>();
            in.readList(this.actionPermissionItems, ActionPermissionItem.class.getClassLoader());
        }
    }
}

