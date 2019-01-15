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
import com.kaltura.client.enums.TransactionAdapterStatus;
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
@MultiRequestBuilder.Tokenizer(TransactionStatus.Tokenizer.class)
public class TransactionStatus extends ObjectBase {
	
	public interface Tokenizer extends ObjectBase.Tokenizer {
		String adapterTransactionStatus();
		String externalId();
		String externalStatus();
		String externalMessage();
		String failReason();
	}

	/**
	 * Payment gateway adapter application state for the transaction to update
	 */
	private TransactionAdapterStatus adapterTransactionStatus;
	/**
	 * External transaction identifier
	 */
	private String externalId;
	/**
	 * Payment gateway transaction status
	 */
	private String externalStatus;
	/**
	 * Payment gateway message
	 */
	private String externalMessage;
	/**
	 * The reason the transaction failed
	 */
	private Integer failReason;

	// adapterTransactionStatus:
	public TransactionAdapterStatus getAdapterTransactionStatus(){
		return this.adapterTransactionStatus;
	}
	public void setAdapterTransactionStatus(TransactionAdapterStatus adapterTransactionStatus){
		this.adapterTransactionStatus = adapterTransactionStatus;
	}

	public void adapterTransactionStatus(String multirequestToken){
		setToken("adapterTransactionStatus", multirequestToken);
	}

	// externalId:
	public String getExternalId(){
		return this.externalId;
	}
	public void setExternalId(String externalId){
		this.externalId = externalId;
	}

	public void externalId(String multirequestToken){
		setToken("externalId", multirequestToken);
	}

	// externalStatus:
	public String getExternalStatus(){
		return this.externalStatus;
	}
	public void setExternalStatus(String externalStatus){
		this.externalStatus = externalStatus;
	}

	public void externalStatus(String multirequestToken){
		setToken("externalStatus", multirequestToken);
	}

	// externalMessage:
	public String getExternalMessage(){
		return this.externalMessage;
	}
	public void setExternalMessage(String externalMessage){
		this.externalMessage = externalMessage;
	}

	public void externalMessage(String multirequestToken){
		setToken("externalMessage", multirequestToken);
	}

	// failReason:
	public Integer getFailReason(){
		return this.failReason;
	}
	public void setFailReason(Integer failReason){
		this.failReason = failReason;
	}

	public void failReason(String multirequestToken){
		setToken("failReason", multirequestToken);
	}


	public TransactionStatus() {
		super();
	}

	public TransactionStatus(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		adapterTransactionStatus = TransactionAdapterStatus.get(GsonParser.parseString(jsonObject.get("adapterTransactionStatus")));
		externalId = GsonParser.parseString(jsonObject.get("externalId"));
		externalStatus = GsonParser.parseString(jsonObject.get("externalStatus"));
		externalMessage = GsonParser.parseString(jsonObject.get("externalMessage"));
		failReason = GsonParser.parseInt(jsonObject.get("failReason"));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaTransactionStatus");
		kparams.add("adapterTransactionStatus", this.adapterTransactionStatus);
		kparams.add("externalId", this.externalId);
		kparams.add("externalStatus", this.externalStatus);
		kparams.add("externalMessage", this.externalMessage);
		kparams.add("failReason", this.failReason);
		return kparams;
	}


    public static final Creator<TransactionStatus> CREATOR = new Creator<TransactionStatus>() {
        @Override
        public TransactionStatus createFromParcel(Parcel source) {
            return new TransactionStatus(source);
        }

        @Override
        public TransactionStatus[] newArray(int size) {
            return new TransactionStatus[size];
        }
    };

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        super.writeToParcel(dest, flags);
        dest.writeInt(this.adapterTransactionStatus == null ? -1 : this.adapterTransactionStatus.ordinal());
        dest.writeString(this.externalId);
        dest.writeString(this.externalStatus);
        dest.writeString(this.externalMessage);
        dest.writeValue(this.failReason);
    }

    public TransactionStatus(Parcel in) {
        super(in);
        int tmpAdapterTransactionStatus = in.readInt();
        this.adapterTransactionStatus = tmpAdapterTransactionStatus == -1 ? null : TransactionAdapterStatus.values()[tmpAdapterTransactionStatus];
        this.externalId = in.readString();
        this.externalStatus = in.readString();
        this.externalMessage = in.readString();
        this.failReason = (Integer)in.readValue(Integer.class.getClassLoader());
    }
}

