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
import com.kaltura.client.types.ObjectBase;
import java.util.List;
import com.google.gson.JsonObject;


/**
 * This class was generated using clients-generator\exec.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

/**  Single aggregation objects  */
@SuppressWarnings("serial")
public class AssetsCount extends ObjectBase {

	/**  Field name  */
    private String field;
	/**  Values, their count and sub groups  */
    private List<AssetCount> objects;

    // field:
    public String getField(){
        return this.field;
    }
    public void setField(String field){
        this.field = field;
    }

    // objects:
    public List<AssetCount> getObjects(){
        return this.objects;
    }
    public void setObjects(List<AssetCount> objects){
        this.objects = objects;
    }


    public AssetsCount() {
       super();
    }

    public AssetsCount(JsonObject jsonObject) throws APIException {
        super(jsonObject);

        if(jsonObject == null) return;

        // set members values:
        field = GsonParser.parseString(jsonObject.get("field"));
        objects = GsonParser.parseArray(jsonObject.getAsJsonArray("objects"), AssetCount.class);

    }

    public Params toParams() {
        Params kparams = super.toParams();
        kparams.add("objectType", "KalturaAssetsCount");
        kparams.add("field", this.field);
        kparams.add("objects", this.objects);
        return kparams;
    }

}

