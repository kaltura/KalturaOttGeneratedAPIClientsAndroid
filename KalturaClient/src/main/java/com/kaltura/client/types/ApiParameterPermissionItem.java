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
import com.kaltura.client.enums.ApiParameterPermissionItemAction;
import com.google.gson.JsonObject;


/**
 * This class was generated using clients-generator\exec.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

@SuppressWarnings("serial")
public class ApiParameterPermissionItem extends PermissionItem {

	/**  API object name  */
    private String object;
	/**  API parameter name  */
    private String parameter;
	/**  API action type  */
    private ApiParameterPermissionItemAction action;

    // object:
    public String getObject(){
        return this.object;
    }
    public void setObject(String object){
        this.object = object;
    }

    // parameter:
    public String getParameter(){
        return this.parameter;
    }
    public void setParameter(String parameter){
        this.parameter = parameter;
    }

    // action:
    public ApiParameterPermissionItemAction getAction(){
        return this.action;
    }
    public void setAction(ApiParameterPermissionItemAction action){
        this.action = action;
    }


    public ApiParameterPermissionItem() {
       super();
    }

    public ApiParameterPermissionItem(JsonObject jsonObject) throws APIException {
        super(jsonObject);

        if(jsonObject == null) return;

        // set members values:
        object = GsonParser.parseString(jsonObject.get("object"));
        parameter = GsonParser.parseString(jsonObject.get("parameter"));
        action = ApiParameterPermissionItemAction.get(GsonParser.parseString(jsonObject.get("action")));

    }

    public Params toParams() {
        Params kparams = super.toParams();
        kparams.add("objectType", "KalturaApiParameterPermissionItem");
        kparams.add("object", this.object);
        kparams.add("parameter", this.parameter);
        kparams.add("action", this.action);
        return kparams;
    }

}

