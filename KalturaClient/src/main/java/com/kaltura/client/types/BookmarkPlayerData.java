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

import android.os.Parcel;
import com.google.gson.JsonObject;
import com.kaltura.client.Params;
import com.kaltura.client.enums.BookmarkActionType;
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
@MultiRequestBuilder.Tokenizer(BookmarkPlayerData.Tokenizer.class)
public class BookmarkPlayerData extends ObjectBase {
	
	public interface Tokenizer extends ObjectBase.Tokenizer {
		String action();
		String averageBitrate();
		String totalBitrate();
		String currentBitrate();
		String fileId();
	}

	/**  Action  */
	private BookmarkActionType action;
	/**  Average Bitrate  */
	private Integer averageBitrate;
	/**  Total Bitrate  */
	private Integer totalBitrate;
	/**  Current Bitrate  */
	private Integer currentBitrate;
	/**  Identifier of the file  */
	private Long fileId;

	// action:
	public BookmarkActionType getAction(){
		return this.action;
	}
	public void setAction(BookmarkActionType action){
		this.action = action;
	}

	public void action(String multirequestToken){
		setToken("action", multirequestToken);
	}

	// averageBitrate:
	public Integer getAverageBitrate(){
		return this.averageBitrate;
	}
	public void setAverageBitrate(Integer averageBitrate){
		this.averageBitrate = averageBitrate;
	}

	public void averageBitrate(String multirequestToken){
		setToken("averageBitrate", multirequestToken);
	}

	// totalBitrate:
	public Integer getTotalBitrate(){
		return this.totalBitrate;
	}
	public void setTotalBitrate(Integer totalBitrate){
		this.totalBitrate = totalBitrate;
	}

	public void totalBitrate(String multirequestToken){
		setToken("totalBitrate", multirequestToken);
	}

	// currentBitrate:
	public Integer getCurrentBitrate(){
		return this.currentBitrate;
	}
	public void setCurrentBitrate(Integer currentBitrate){
		this.currentBitrate = currentBitrate;
	}

	public void currentBitrate(String multirequestToken){
		setToken("currentBitrate", multirequestToken);
	}

	// fileId:
	public Long getFileId(){
		return this.fileId;
	}
	public void setFileId(Long fileId){
		this.fileId = fileId;
	}

	public void fileId(String multirequestToken){
		setToken("fileId", multirequestToken);
	}


	public BookmarkPlayerData() {
		super();
	}

	public BookmarkPlayerData(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		action = BookmarkActionType.get(GsonParser.parseString(jsonObject.get("action")));
		averageBitrate = GsonParser.parseInt(jsonObject.get("averageBitrate"));
		totalBitrate = GsonParser.parseInt(jsonObject.get("totalBitrate"));
		currentBitrate = GsonParser.parseInt(jsonObject.get("currentBitrate"));
		fileId = GsonParser.parseLong(jsonObject.get("fileId"));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaBookmarkPlayerData");
		kparams.add("action", this.action);
		kparams.add("averageBitrate", this.averageBitrate);
		kparams.add("totalBitrate", this.totalBitrate);
		kparams.add("currentBitrate", this.currentBitrate);
		kparams.add("fileId", this.fileId);
		return kparams;
	}


    public static final Creator<BookmarkPlayerData> CREATOR = new Creator<BookmarkPlayerData>() {
        @Override
        public BookmarkPlayerData createFromParcel(Parcel source) {
            return new BookmarkPlayerData(source);
        }

        @Override
        public BookmarkPlayerData[] newArray(int size) {
            return new BookmarkPlayerData[size];
        }
    };

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        super.writeToParcel(dest, flags);
        dest.writeInt(this.action == null ? -1 : this.action.ordinal());
        dest.writeValue(this.averageBitrate);
        dest.writeValue(this.totalBitrate);
        dest.writeValue(this.currentBitrate);
        dest.writeValue(this.fileId);
    }

    public BookmarkPlayerData(Parcel in) {
        super(in);
        int tmpAction = in.readInt();
        this.action = tmpAction == -1 ? null : BookmarkActionType.values()[tmpAction];
        this.averageBitrate = (Integer)in.readValue(Integer.class.getClassLoader());
        this.totalBitrate = (Integer)in.readValue(Integer.class.getClassLoader());
        this.currentBitrate = (Integer)in.readValue(Integer.class.getClassLoader());
        this.fileId = (Long)in.readValue(Long.class.getClassLoader());
    }
}

