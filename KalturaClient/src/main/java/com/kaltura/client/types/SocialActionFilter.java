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

import com.kaltura.client.Params;
import com.kaltura.client.utils.GsonParser;
import com.kaltura.client.enums.AssetType;
import com.google.gson.JsonObject;


/**
 * This class was generated using clients-generator\exec.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

@SuppressWarnings("serial")
public class SocialActionFilter extends Filter {

	/**  Comma separated list of asset identifiers.  */
    private String assetIdIn;
	/**  Asset Type  */
    private AssetType assetTypeEqual;
	/**  Comma separated list of social actions to filter by  */
    private String actionTypeIn;

    // assetIdIn:
    public String getAssetIdIn(){
        return this.assetIdIn;
    }
    public void setAssetIdIn(String assetIdIn){
        this.assetIdIn = assetIdIn;
    }

    // assetTypeEqual:
    public AssetType getAssetTypeEqual(){
        return this.assetTypeEqual;
    }
    public void setAssetTypeEqual(AssetType assetTypeEqual){
        this.assetTypeEqual = assetTypeEqual;
    }

    // actionTypeIn:
    public String getActionTypeIn(){
        return this.actionTypeIn;
    }
    public void setActionTypeIn(String actionTypeIn){
        this.actionTypeIn = actionTypeIn;
    }


    public SocialActionFilter() {
       super();
    }

    public SocialActionFilter(JsonObject jsonObject) throws APIException {
        super(jsonObject);

        if(jsonObject == null) return;

        // set members values:
        assetIdIn = GsonParser.parseString(jsonObject.get("assetIdIn"));
        assetTypeEqual = AssetType.get(GsonParser.parseString(jsonObject.get("assetTypeEqual")));
        actionTypeIn = GsonParser.parseString(jsonObject.get("actionTypeIn"));

    }

    public Params toParams() {
        Params kparams = super.toParams();
        kparams.add("objectType", "KalturaSocialActionFilter");
        kparams.add("assetIdIn", this.assetIdIn);
        kparams.add("assetTypeEqual", this.assetTypeEqual);
        kparams.add("actionTypeIn", this.actionTypeIn);
        return kparams;
    }

}

