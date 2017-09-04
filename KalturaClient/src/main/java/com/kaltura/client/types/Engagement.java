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
import com.kaltura.client.enums.EngagementType;
import com.google.gson.JsonObject;


/**
 * This class was generated using clients-generator\exec.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

/**  Engagement  */
@SuppressWarnings("serial")
public class Engagement extends ObjectBase {

	/**  Engagement id  */
    private Integer id;
	/**  Total number of recipients  */
    private Integer totalNumberOfRecipients;
	/**  Engagement type  */
    private EngagementType type;
	/**  Engagement adapter id  */
    private Integer adapterId;
	/**  Engagement adapter dynamic data  */
    private String adapterDynamicData;
	/**  Interval (seconds)  */
    private Integer intervalSeconds;
	/**  Manual User list  */
    private String userList;
	/**  Send time (seconds)  */
    private Long sendTimeInSeconds;
	/**  Coupon GroupId  */
    private Integer couponGroupId;

    // id:
    public Integer getId(){
        return this.id;
    }
    public void setId(Integer id){
        this.id = id;
    }

    // totalNumberOfRecipients:
    public Integer getTotalNumberOfRecipients(){
        return this.totalNumberOfRecipients;
    }
    public void setTotalNumberOfRecipients(Integer totalNumberOfRecipients){
        this.totalNumberOfRecipients = totalNumberOfRecipients;
    }

    // type:
    public EngagementType getType(){
        return this.type;
    }
    public void setType(EngagementType type){
        this.type = type;
    }

    // adapterId:
    public Integer getAdapterId(){
        return this.adapterId;
    }
    public void setAdapterId(Integer adapterId){
        this.adapterId = adapterId;
    }

    // adapterDynamicData:
    public String getAdapterDynamicData(){
        return this.adapterDynamicData;
    }
    public void setAdapterDynamicData(String adapterDynamicData){
        this.adapterDynamicData = adapterDynamicData;
    }

    // intervalSeconds:
    public Integer getIntervalSeconds(){
        return this.intervalSeconds;
    }
    public void setIntervalSeconds(Integer intervalSeconds){
        this.intervalSeconds = intervalSeconds;
    }

    // userList:
    public String getUserList(){
        return this.userList;
    }
    public void setUserList(String userList){
        this.userList = userList;
    }

    // sendTimeInSeconds:
    public Long getSendTimeInSeconds(){
        return this.sendTimeInSeconds;
    }
    public void setSendTimeInSeconds(Long sendTimeInSeconds){
        this.sendTimeInSeconds = sendTimeInSeconds;
    }

    // couponGroupId:
    public Integer getCouponGroupId(){
        return this.couponGroupId;
    }
    public void setCouponGroupId(Integer couponGroupId){
        this.couponGroupId = couponGroupId;
    }


    public Engagement() {
       super();
    }

    public Engagement(JsonObject jsonObject) throws APIException {
        super(jsonObject);

        if(jsonObject == null) return;

        // set members values:
        id = GsonParser.parseInt(jsonObject.get("id"));
        totalNumberOfRecipients = GsonParser.parseInt(jsonObject.get("totalNumberOfRecipients"));
        type = EngagementType.get(GsonParser.parseString(jsonObject.get("type")));
        adapterId = GsonParser.parseInt(jsonObject.get("adapterId"));
        adapterDynamicData = GsonParser.parseString(jsonObject.get("adapterDynamicData"));
        intervalSeconds = GsonParser.parseInt(jsonObject.get("intervalSeconds"));
        userList = GsonParser.parseString(jsonObject.get("userList"));
        sendTimeInSeconds = GsonParser.parseLong(jsonObject.get("sendTimeInSeconds"));
        couponGroupId = GsonParser.parseInt(jsonObject.get("couponGroupId"));

    }

    public Params toParams() {
        Params kparams = super.toParams();
        kparams.add("objectType", "KalturaEngagement");
        kparams.add("type", this.type);
        kparams.add("adapterId", this.adapterId);
        kparams.add("adapterDynamicData", this.adapterDynamicData);
        kparams.add("intervalSeconds", this.intervalSeconds);
        kparams.add("userList", this.userList);
        kparams.add("sendTimeInSeconds", this.sendTimeInSeconds);
        kparams.add("couponGroupId", this.couponGroupId);
        return kparams;
    }

}

