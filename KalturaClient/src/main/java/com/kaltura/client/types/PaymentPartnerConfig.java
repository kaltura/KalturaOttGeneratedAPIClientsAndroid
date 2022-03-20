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
 * Partner billing configuration
 */
@SuppressWarnings("serial")
@MultiRequestBuilder.Tokenizer(PaymentPartnerConfig.Tokenizer.class)
public class PaymentPartnerConfig extends PartnerConfiguration {
	
	public interface Tokenizer extends PartnerConfiguration.Tokenizer {
		RequestBuilder.ListTokenizer<UnifiedBillingCycle.Tokenizer> unifiedBillingCycles();
	}

	/**
	 * configuration for unified billing cycles.
	 */
	private List<UnifiedBillingCycle> unifiedBillingCycles;

	// unifiedBillingCycles:
	public List<UnifiedBillingCycle> getUnifiedBillingCycles(){
		return this.unifiedBillingCycles;
	}
	public void setUnifiedBillingCycles(List<UnifiedBillingCycle> unifiedBillingCycles){
		this.unifiedBillingCycles = unifiedBillingCycles;
	}


	public PaymentPartnerConfig() {
		super();
	}

	public PaymentPartnerConfig(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		unifiedBillingCycles = GsonParser.parseArray(jsonObject.getAsJsonArray("unifiedBillingCycles"), UnifiedBillingCycle.class);

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaPaymentPartnerConfig");
		kparams.add("unifiedBillingCycles", this.unifiedBillingCycles);
		return kparams;
	}


    public static final Creator<PaymentPartnerConfig> CREATOR = new Creator<PaymentPartnerConfig>() {
        @Override
        public PaymentPartnerConfig createFromParcel(Parcel source) {
            return new PaymentPartnerConfig(source);
        }

        @Override
        public PaymentPartnerConfig[] newArray(int size) {
            return new PaymentPartnerConfig[size];
        }
    };

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        super.writeToParcel(dest, flags);
        if(this.unifiedBillingCycles != null) {
            dest.writeInt(this.unifiedBillingCycles.size());
            dest.writeList(this.unifiedBillingCycles);
        } else {
            dest.writeInt(-1);
        }
    }

    public PaymentPartnerConfig(Parcel in) {
        super(in);
        int unifiedBillingCyclesSize = in.readInt();
        if( unifiedBillingCyclesSize > -1) {
            this.unifiedBillingCycles = new ArrayList<>();
            in.readList(this.unifiedBillingCycles, UnifiedBillingCycle.class.getClassLoader());
        }
    }
}

