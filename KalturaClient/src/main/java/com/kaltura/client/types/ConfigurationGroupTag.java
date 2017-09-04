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
import com.google.gson.JsonObject;


/**
 * This class was generated using clients-generator\exec.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

@SuppressWarnings("serial")
public class ConfigurationGroupTag extends ObjectBase {

	/**  Configuration group identifier  */
    private String configurationGroupId;
	/**  Partner identifier  */
    private Integer partnerId;
	/**  Tag  */
    private String tag;

    // configurationGroupId:
    public String getConfigurationGroupId(){
        return this.configurationGroupId;
    }
    public void setConfigurationGroupId(String configurationGroupId){
        this.configurationGroupId = configurationGroupId;
    }

    // partnerId:
    public Integer getPartnerId(){
        return this.partnerId;
    }
    public void setPartnerId(Integer partnerId){
        this.partnerId = partnerId;
    }

    // tag:
    public String getTag(){
        return this.tag;
    }
    public void setTag(String tag){
        this.tag = tag;
    }


    public ConfigurationGroupTag() {
       super();
    }

    public ConfigurationGroupTag(JsonObject jsonObject) throws APIException {
        super(jsonObject);

        if(jsonObject == null) return;

        // set members values:
        configurationGroupId = GsonParser.parseString(jsonObject.get("configurationGroupId"));
        partnerId = GsonParser.parseInt(jsonObject.get("partnerId"));
        tag = GsonParser.parseString(jsonObject.get("tag"));

    }

    public Params toParams() {
        Params kparams = super.toParams();
        kparams.add("objectType", "KalturaConfigurationGroupTag");
        kparams.add("configurationGroupId", this.configurationGroupId);
        kparams.add("tag", this.tag);
        return kparams;
    }

}

