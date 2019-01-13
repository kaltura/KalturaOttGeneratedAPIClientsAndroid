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
// Copyright (C) 2006-2019  Kaltura Inc.
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
import com.kaltura.client.types.ObjectBase;
import com.kaltura.client.utils.GsonParser;
import com.kaltura.client.utils.request.MultiRequestBuilder;
import com.kaltura.client.utils.request.RequestBuilder;
import java.util.ArrayList;
import java.util.List;

/**
 * This class was generated using clients-generator\exec.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

@SuppressWarnings("serial")
@MultiRequestBuilder.Tokenizer(PaymentGatewayConfiguration.Tokenizer.class)
public class PaymentGatewayConfiguration extends ObjectBase {
	
	public interface Tokenizer extends ObjectBase.Tokenizer {
		RequestBuilder.ListTokenizer<KeyValue.Tokenizer> paymentGatewayConfiguration();
	}

	/**
	 * Payment gateway configuration
	 */
	private List<KeyValue> paymentGatewayConfiguration;

	// paymentGatewayConfiguration:
	public List<KeyValue> getPaymentGatewayConfiguration(){
		return this.paymentGatewayConfiguration;
	}
	public void setPaymentGatewayConfiguration(List<KeyValue> paymentGatewayConfiguration){
		this.paymentGatewayConfiguration = paymentGatewayConfiguration;
	}


	public PaymentGatewayConfiguration() {
		super();
	}

	public PaymentGatewayConfiguration(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		paymentGatewayConfiguration = GsonParser.parseArray(jsonObject.getAsJsonArray("paymentGatewayConfiguration"), KeyValue.class);

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaPaymentGatewayConfiguration");
		kparams.add("paymentGatewayConfiguration", this.paymentGatewayConfiguration);
		return kparams;
	}


    public static final Creator<PaymentGatewayConfiguration> CREATOR = new Creator<PaymentGatewayConfiguration>() {
        @Override
        public PaymentGatewayConfiguration createFromParcel(Parcel source) {
            return new PaymentGatewayConfiguration(source);
        }

        @Override
        public PaymentGatewayConfiguration[] newArray(int size) {
            return new PaymentGatewayConfiguration[size];
        }
    };

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        super.writeToParcel(dest, flags);
        if(this.paymentGatewayConfiguration != null) {
            dest.writeInt(this.paymentGatewayConfiguration.size());
            dest.writeList(this.paymentGatewayConfiguration);
        } else {
            dest.writeInt(-1);
        }
    }

    public PaymentGatewayConfiguration(Parcel in) {
        super(in);
        int paymentGatewayConfigurationSize = in.readInt();
        if( paymentGatewayConfigurationSize > -1) {
            this.paymentGatewayConfiguration = new ArrayList<>();
            in.readList(this.paymentGatewayConfiguration, KeyValue.class.getClassLoader());
        }
    }
}

