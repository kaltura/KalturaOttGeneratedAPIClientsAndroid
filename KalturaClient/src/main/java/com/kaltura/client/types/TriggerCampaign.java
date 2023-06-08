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
// Copyright (C) 2006-2020  Kaltura Inc.
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
import com.kaltura.client.enums.ApiAction;
import com.kaltura.client.enums.ApiService;
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

/**
 * Campaign
 */
@SuppressWarnings("serial")
@MultiRequestBuilder.Tokenizer(TriggerCampaign.Tokenizer.class)
public class TriggerCampaign extends Campaign {
	
	public interface Tokenizer extends Campaign.Tokenizer {
		String service();
		String action();
		RequestBuilder.ListTokenizer<Condition.Tokenizer> triggerConditions();
	}

	/**
	 * service
	 */
	private ApiService service;
	/**
	 * action
	 */
	private ApiAction action;
	/**
	 * List of conditions for the trigger (conditions on the object)
	 */
	private List<Condition> triggerConditions;

	// service:
	public ApiService getService(){
		return this.service;
	}
	public void setService(ApiService service){
		this.service = service;
	}

	public void service(String multirequestToken){
		setToken("service", multirequestToken);
	}

	// action:
	public ApiAction getAction(){
		return this.action;
	}
	public void setAction(ApiAction action){
		this.action = action;
	}

	public void action(String multirequestToken){
		setToken("action", multirequestToken);
	}

	// triggerConditions:
	public List<Condition> getTriggerConditions(){
		return this.triggerConditions;
	}
	public void setTriggerConditions(List<Condition> triggerConditions){
		this.triggerConditions = triggerConditions;
	}


	public TriggerCampaign() {
		super();
	}

	public TriggerCampaign(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		service = ApiService.get(GsonParser.parseString(jsonObject.get("service")));
		action = ApiAction.get(GsonParser.parseString(jsonObject.get("action")));
		triggerConditions = GsonParser.parseArray(jsonObject.getAsJsonArray("triggerConditions"), Condition.class);

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaTriggerCampaign");
		kparams.add("service", this.service);
		kparams.add("action", this.action);
		kparams.add("triggerConditions", this.triggerConditions);
		return kparams;
	}


    public static final Creator<TriggerCampaign> CREATOR = new Creator<TriggerCampaign>() {
        @Override
        public TriggerCampaign createFromParcel(Parcel source) {
            return new TriggerCampaign(source);
        }

        @Override
        public TriggerCampaign[] newArray(int size) {
            return new TriggerCampaign[size];
        }
    };

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        super.writeToParcel(dest, flags);
        dest.writeInt(this.service == null ? -1 : this.service.ordinal());
        dest.writeInt(this.action == null ? -1 : this.action.ordinal());
        if(this.triggerConditions != null) {
            dest.writeInt(this.triggerConditions.size());
            dest.writeList(this.triggerConditions);
        } else {
            dest.writeInt(-1);
        }
    }

    public TriggerCampaign(Parcel in) {
        super(in);
        int tmpService = in.readInt();
        this.service = tmpService == -1 ? null : ApiService.values()[tmpService];
        int tmpAction = in.readInt();
        this.action = tmpAction == -1 ? null : ApiAction.values()[tmpAction];
        int triggerConditionsSize = in.readInt();
        if( triggerConditionsSize > -1) {
            this.triggerConditions = new ArrayList<>();
            in.readList(this.triggerConditions, Condition.class.getClassLoader());
        }
    }
}

