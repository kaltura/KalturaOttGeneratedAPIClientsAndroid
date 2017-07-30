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
import com.kaltura.client.types.BaseResponseProfile;
import com.google.gson.JsonObject;


/**
 * This class was generated using clients-generator\exec.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

/**  Define client request optional configurations  */
@SuppressWarnings("serial")
public class RequestConfiguration extends ObjectBase {

	/**  Impersonated partner id  */
    private Integer partnerId;
	/**  Impersonated user id  */
    private Integer userId;
	/**  Content language  */
    private String language;
	/**  Kaltura API session  */
    private String ks;
	/**  Kaltura response profile object  */
    private BaseResponseProfile responseProfile;

    // partnerId:
    public Integer getPartnerId(){
        return this.partnerId;
    }
    public void setPartnerId(Integer partnerId){
        this.partnerId = partnerId;
    }

    // userId:
    public Integer getUserId(){
        return this.userId;
    }
    public void setUserId(Integer userId){
        this.userId = userId;
    }

    // language:
    public String getLanguage(){
        return this.language;
    }
    public void setLanguage(String language){
        this.language = language;
    }

    // ks:
    public String getKs(){
        return this.ks;
    }
    public void setKs(String ks){
        this.ks = ks;
    }

    // responseProfile:
    public BaseResponseProfile getResponseProfile(){
        return this.responseProfile;
    }
    public void setResponseProfile(BaseResponseProfile responseProfile){
        this.responseProfile = responseProfile;
    }


    public RequestConfiguration() {
       super();
    }

    public RequestConfiguration(JsonObject jsonObject) throws APIException {
        super(jsonObject);

        if(jsonObject == null) return;

        // set members values:
        partnerId = GsonParser.parseInt(jsonObject.get("partnerId"));
        userId = GsonParser.parseInt(jsonObject.get("userId"));
        language = GsonParser.parseString(jsonObject.get("language"));
        ks = GsonParser.parseString(jsonObject.get("ks"));
        responseProfile = GsonParser.parseObject(jsonObject.getAsJsonObject("responseProfile"), BaseResponseProfile.class);

    }

    public Params toParams() {
        Params kparams = super.toParams();
        kparams.add("objectType", "KalturaRequestConfiguration");
        kparams.add("partnerId", this.partnerId);
        kparams.add("userId", this.userId);
        kparams.add("language", this.language);
        kparams.add("ks", this.ks);
        kparams.add("responseProfile", this.responseProfile);
        return kparams;
    }

}

