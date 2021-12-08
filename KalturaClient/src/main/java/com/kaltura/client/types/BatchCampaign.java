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
@MultiRequestBuilder.Tokenizer(BatchCampaign.Tokenizer.class)
public class BatchCampaign extends Campaign {
	
	public interface Tokenizer extends Campaign.Tokenizer {
		RequestBuilder.ListTokenizer<Condition.Tokenizer> populationConditions();
	}

	/**
	 * These conditions define the population that apply one the campaign
	 */
	private List<Condition> populationConditions;

	// populationConditions:
	public List<Condition> getPopulationConditions(){
		return this.populationConditions;
	}
	public void setPopulationConditions(List<Condition> populationConditions){
		this.populationConditions = populationConditions;
	}


	public BatchCampaign() {
		super();
	}

	public BatchCampaign(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		populationConditions = GsonParser.parseArray(jsonObject.getAsJsonArray("populationConditions"), Condition.class);

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaBatchCampaign");
		kparams.add("populationConditions", this.populationConditions);
		return kparams;
	}


    public static final Creator<BatchCampaign> CREATOR = new Creator<BatchCampaign>() {
        @Override
        public BatchCampaign createFromParcel(Parcel source) {
            return new BatchCampaign(source);
        }

        @Override
        public BatchCampaign[] newArray(int size) {
            return new BatchCampaign[size];
        }
    };

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        super.writeToParcel(dest, flags);
        if(this.populationConditions != null) {
            dest.writeInt(this.populationConditions.size());
            dest.writeList(this.populationConditions);
        } else {
            dest.writeInt(-1);
        }
    }

    public BatchCampaign(Parcel in) {
        super(in);
        int populationConditionsSize = in.readInt();
        if( populationConditionsSize > -1) {
            this.populationConditions = new ArrayList<>();
            in.readList(this.populationConditions, Condition.class.getClassLoader());
        }
    }
}

