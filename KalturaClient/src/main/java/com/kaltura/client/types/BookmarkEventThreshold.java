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
import com.kaltura.client.enums.TransactionType;
import com.kaltura.client.types.ObjectBase;
import com.kaltura.client.utils.GsonParser;
import com.kaltura.client.utils.request.MultiRequestBuilder;

/**
 * This class was generated using exec.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

@SuppressWarnings("serial")
@MultiRequestBuilder.Tokenizer(BookmarkEventThreshold.Tokenizer.class)
public class BookmarkEventThreshold extends ObjectBase {
	
	public interface Tokenizer extends ObjectBase.Tokenizer {
		String transactionType();
		String threshold();
	}

	/**
	 * bookmark transaction type
	 */
	private TransactionType transactionType;
	/**
	 * event threshold in seconds
	 */
	private Integer threshold;

	// transactionType:
	public TransactionType getTransactionType(){
		return this.transactionType;
	}
	public void setTransactionType(TransactionType transactionType){
		this.transactionType = transactionType;
	}

	public void transactionType(String multirequestToken){
		setToken("transactionType", multirequestToken);
	}

	// threshold:
	public Integer getThreshold(){
		return this.threshold;
	}
	public void setThreshold(Integer threshold){
		this.threshold = threshold;
	}

	public void threshold(String multirequestToken){
		setToken("threshold", multirequestToken);
	}


	public BookmarkEventThreshold() {
		super();
	}

	public BookmarkEventThreshold(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		transactionType = TransactionType.get(GsonParser.parseString(jsonObject.get("transactionType")));
		threshold = GsonParser.parseInt(jsonObject.get("threshold"));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaBookmarkEventThreshold");
		kparams.add("transactionType", this.transactionType);
		kparams.add("threshold", this.threshold);
		return kparams;
	}


    public static final Creator<BookmarkEventThreshold> CREATOR = new Creator<BookmarkEventThreshold>() {
        @Override
        public BookmarkEventThreshold createFromParcel(Parcel source) {
            return new BookmarkEventThreshold(source);
        }

        @Override
        public BookmarkEventThreshold[] newArray(int size) {
            return new BookmarkEventThreshold[size];
        }
    };

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        super.writeToParcel(dest, flags);
        dest.writeInt(this.transactionType == null ? -1 : this.transactionType.ordinal());
        dest.writeValue(this.threshold);
    }

    public BookmarkEventThreshold(Parcel in) {
        super(in);
        int tmpTransactionType = in.readInt();
        this.transactionType = tmpTransactionType == -1 ? null : TransactionType.values()[tmpTransactionType];
        this.threshold = (Integer)in.readValue(Integer.class.getClassLoader());
    }
}

