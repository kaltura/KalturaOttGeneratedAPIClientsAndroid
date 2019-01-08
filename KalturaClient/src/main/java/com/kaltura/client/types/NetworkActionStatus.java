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
import com.kaltura.client.enums.SocialNetwork;
import com.kaltura.client.enums.SocialStatus;
import com.kaltura.client.types.ObjectBase;
import com.kaltura.client.utils.GsonParser;
import com.kaltura.client.utils.request.MultiRequestBuilder;

/**
 * This class was generated using clients-generator\exec.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

@SuppressWarnings("serial")
@MultiRequestBuilder.Tokenizer(NetworkActionStatus.Tokenizer.class)
public class NetworkActionStatus extends ObjectBase {
	
	public interface Tokenizer extends ObjectBase.Tokenizer {
		String status();
		String network();
	}

	/**
	 * Status
	 */
	private SocialStatus status;
	/**
	 * Social network
	 */
	private SocialNetwork network;

	// status:
	public SocialStatus getStatus(){
		return this.status;
	}
	public void setStatus(SocialStatus status){
		this.status = status;
	}

	public void status(String multirequestToken){
		setToken("status", multirequestToken);
	}

	// network:
	public SocialNetwork getNetwork(){
		return this.network;
	}
	public void setNetwork(SocialNetwork network){
		this.network = network;
	}

	public void network(String multirequestToken){
		setToken("network", multirequestToken);
	}


	public NetworkActionStatus() {
		super();
	}

	public NetworkActionStatus(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		status = SocialStatus.get(GsonParser.parseString(jsonObject.get("status")));
		network = SocialNetwork.get(GsonParser.parseString(jsonObject.get("network")));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaNetworkActionStatus");
		kparams.add("status", this.status);
		kparams.add("network", this.network);
		return kparams;
	}


    public static final Creator<NetworkActionStatus> CREATOR = new Creator<NetworkActionStatus>() {
        @Override
        public NetworkActionStatus createFromParcel(Parcel source) {
            return new NetworkActionStatus(source);
        }

        @Override
        public NetworkActionStatus[] newArray(int size) {
            return new NetworkActionStatus[size];
        }
    };

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        super.writeToParcel(dest, flags);
        dest.writeInt(this.status == null ? -1 : this.status.ordinal());
        dest.writeInt(this.network == null ? -1 : this.network.ordinal());
    }

    public NetworkActionStatus(Parcel in) {
        super(in);
        int tmpStatus = in.readInt();
        this.status = tmpStatus == -1 ? null : SocialStatus.values()[tmpStatus];
        int tmpNetwork = in.readInt();
        this.network = tmpNetwork == -1 ? null : SocialNetwork.values()[tmpNetwork];
    }
}

