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
import com.google.gson.JsonObject;


/**
 * This class was generated using clients-generator\exec.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

/**  Returns social configuration for the partner  */
@SuppressWarnings("serial")
public class SocialFacebookConfig extends SocialConfig {

	/**  The application identifier  */
    private String appId;
	/**  List of application permissions  */
    private String permissions;

    // appId:
    public String getAppId(){
        return this.appId;
    }
    public void setAppId(String appId){
        this.appId = appId;
    }

    // permissions:
    public String getPermissions(){
        return this.permissions;
    }
    public void setPermissions(String permissions){
        this.permissions = permissions;
    }


    public SocialFacebookConfig() {
       super();
    }

    public SocialFacebookConfig(JsonObject jsonObject) throws APIException {
        super(jsonObject);

        if(jsonObject == null) return;

        // set members values:
        appId = GsonParser.parseString(jsonObject.get("appId"));
        permissions = GsonParser.parseString(jsonObject.get("permissions"));

    }

    public Params toParams() {
        Params kparams = super.toParams();
        kparams.add("objectType", "KalturaSocialFacebookConfig");
        kparams.add("appId", this.appId);
        kparams.add("permissions", this.permissions);
        return kparams;
    }

}

