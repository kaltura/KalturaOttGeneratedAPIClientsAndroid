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
// Copyright (C) 2006-2018  Kaltura Inc.
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
import com.kaltura.client.enums.TimeShiftedTvState;
import com.kaltura.client.utils.GsonParser;
import com.kaltura.client.utils.request.MultiRequestBuilder;

/**
 * This class was generated using clients-generator\exec.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

/**
 * Linear media asset info
 */
@SuppressWarnings("serial")
@MultiRequestBuilder.Tokenizer(LinearMediaAsset.Tokenizer.class)
public class LinearMediaAsset extends MediaAsset {
	
	public interface Tokenizer extends MediaAsset.Tokenizer {
		String enableCdvrState();
		String enableCatchUpState();
		String enableStartOverState();
		String bufferCatchUp();
		String bufferTrickPlay();
		String enableRecordingPlaybackNonEntitledChannelState();
		String enableTrickPlayState();
		String externalIngestId();
		String externalCdvrId();
		String enableCdvr();
		String enableCatchUp();
		String enableStartOver();
		String catchUpBuffer();
		String trickPlayBuffer();
		String enableRecordingPlaybackNonEntitledChannel();
		String enableTrickPlay();
	}

	/**
	 * Enable CDVR, configuration only
	 */
	private TimeShiftedTvState enableCdvrState;
	/**
	 * Enable catch-up, configuration only
	 */
	private TimeShiftedTvState enableCatchUpState;
	/**
	 * Enable start over, configuration only
	 */
	private TimeShiftedTvState enableStartOverState;
	/**
	 * buffer Catch-up, configuration only
	 */
	private Long bufferCatchUp;
	/**
	 * buffer Trick-play, configuration only
	 */
	private Long bufferTrickPlay;
	/**
	 * Enable Recording playback for non entitled channel, configuration only
	 */
	private TimeShiftedTvState enableRecordingPlaybackNonEntitledChannelState;
	/**
	 * Enable trick-play, configuration only
	 */
	private TimeShiftedTvState enableTrickPlayState;
	/**
	 * External identifier used when ingesting programs for this linear media asset
	 */
	private String externalIngestId;
	/**
	 * External identifier for the CDVR
	 */
	private String externalCdvrId;
	/**
	 * Is CDVR enabled for this asset
	 */
	private Boolean enableCdvr;
	/**
	 * Is catch-up enabled for this asset
	 */
	private Boolean enableCatchUp;
	/**
	 * Is start over enabled for this asset
	 */
	private Boolean enableStartOver;
	/**
	 * Catch-up buffer
	 */
	private Long catchUpBuffer;
	/**
	 * buffer Trick-play
	 */
	private Long trickPlayBuffer;
	/**
	 * Is recording playback for non entitled channel enabled for this asset
	 */
	private Boolean enableRecordingPlaybackNonEntitledChannel;
	/**
	 * Is trick-play enabled for this asset
	 */
	private Boolean enableTrickPlay;

	// enableCdvrState:
	public TimeShiftedTvState getEnableCdvrState(){
		return this.enableCdvrState;
	}
	public void setEnableCdvrState(TimeShiftedTvState enableCdvrState){
		this.enableCdvrState = enableCdvrState;
	}

	public void enableCdvrState(String multirequestToken){
		setToken("enableCdvrState", multirequestToken);
	}

	// enableCatchUpState:
	public TimeShiftedTvState getEnableCatchUpState(){
		return this.enableCatchUpState;
	}
	public void setEnableCatchUpState(TimeShiftedTvState enableCatchUpState){
		this.enableCatchUpState = enableCatchUpState;
	}

	public void enableCatchUpState(String multirequestToken){
		setToken("enableCatchUpState", multirequestToken);
	}

	// enableStartOverState:
	public TimeShiftedTvState getEnableStartOverState(){
		return this.enableStartOverState;
	}
	public void setEnableStartOverState(TimeShiftedTvState enableStartOverState){
		this.enableStartOverState = enableStartOverState;
	}

	public void enableStartOverState(String multirequestToken){
		setToken("enableStartOverState", multirequestToken);
	}

	// bufferCatchUp:
	public Long getBufferCatchUp(){
		return this.bufferCatchUp;
	}
	public void setBufferCatchUp(Long bufferCatchUp){
		this.bufferCatchUp = bufferCatchUp;
	}

	public void bufferCatchUp(String multirequestToken){
		setToken("bufferCatchUp", multirequestToken);
	}

	// bufferTrickPlay:
	public Long getBufferTrickPlay(){
		return this.bufferTrickPlay;
	}
	public void setBufferTrickPlay(Long bufferTrickPlay){
		this.bufferTrickPlay = bufferTrickPlay;
	}

	public void bufferTrickPlay(String multirequestToken){
		setToken("bufferTrickPlay", multirequestToken);
	}

	// enableRecordingPlaybackNonEntitledChannelState:
	public TimeShiftedTvState getEnableRecordingPlaybackNonEntitledChannelState(){
		return this.enableRecordingPlaybackNonEntitledChannelState;
	}
	public void setEnableRecordingPlaybackNonEntitledChannelState(TimeShiftedTvState enableRecordingPlaybackNonEntitledChannelState){
		this.enableRecordingPlaybackNonEntitledChannelState = enableRecordingPlaybackNonEntitledChannelState;
	}

	public void enableRecordingPlaybackNonEntitledChannelState(String multirequestToken){
		setToken("enableRecordingPlaybackNonEntitledChannelState", multirequestToken);
	}

	// enableTrickPlayState:
	public TimeShiftedTvState getEnableTrickPlayState(){
		return this.enableTrickPlayState;
	}
	public void setEnableTrickPlayState(TimeShiftedTvState enableTrickPlayState){
		this.enableTrickPlayState = enableTrickPlayState;
	}

	public void enableTrickPlayState(String multirequestToken){
		setToken("enableTrickPlayState", multirequestToken);
	}

	// externalIngestId:
	public String getExternalIngestId(){
		return this.externalIngestId;
	}
	public void setExternalIngestId(String externalIngestId){
		this.externalIngestId = externalIngestId;
	}

	public void externalIngestId(String multirequestToken){
		setToken("externalIngestId", multirequestToken);
	}

	// externalCdvrId:
	public String getExternalCdvrId(){
		return this.externalCdvrId;
	}
	public void setExternalCdvrId(String externalCdvrId){
		this.externalCdvrId = externalCdvrId;
	}

	public void externalCdvrId(String multirequestToken){
		setToken("externalCdvrId", multirequestToken);
	}

	// enableCdvr:
	public Boolean getEnableCdvr(){
		return this.enableCdvr;
	}
	public void setEnableCdvr(Boolean enableCdvr){
		this.enableCdvr = enableCdvr;
	}

	public void enableCdvr(String multirequestToken){
		setToken("enableCdvr", multirequestToken);
	}

	// enableCatchUp:
	public Boolean getEnableCatchUp(){
		return this.enableCatchUp;
	}
	public void setEnableCatchUp(Boolean enableCatchUp){
		this.enableCatchUp = enableCatchUp;
	}

	public void enableCatchUp(String multirequestToken){
		setToken("enableCatchUp", multirequestToken);
	}

	// enableStartOver:
	public Boolean getEnableStartOver(){
		return this.enableStartOver;
	}
	public void setEnableStartOver(Boolean enableStartOver){
		this.enableStartOver = enableStartOver;
	}

	public void enableStartOver(String multirequestToken){
		setToken("enableStartOver", multirequestToken);
	}

	// catchUpBuffer:
	public Long getCatchUpBuffer(){
		return this.catchUpBuffer;
	}
	public void setCatchUpBuffer(Long catchUpBuffer){
		this.catchUpBuffer = catchUpBuffer;
	}

	public void catchUpBuffer(String multirequestToken){
		setToken("catchUpBuffer", multirequestToken);
	}

	// trickPlayBuffer:
	public Long getTrickPlayBuffer(){
		return this.trickPlayBuffer;
	}
	public void setTrickPlayBuffer(Long trickPlayBuffer){
		this.trickPlayBuffer = trickPlayBuffer;
	}

	public void trickPlayBuffer(String multirequestToken){
		setToken("trickPlayBuffer", multirequestToken);
	}

	// enableRecordingPlaybackNonEntitledChannel:
	public Boolean getEnableRecordingPlaybackNonEntitledChannel(){
		return this.enableRecordingPlaybackNonEntitledChannel;
	}
	public void setEnableRecordingPlaybackNonEntitledChannel(Boolean enableRecordingPlaybackNonEntitledChannel){
		this.enableRecordingPlaybackNonEntitledChannel = enableRecordingPlaybackNonEntitledChannel;
	}

	public void enableRecordingPlaybackNonEntitledChannel(String multirequestToken){
		setToken("enableRecordingPlaybackNonEntitledChannel", multirequestToken);
	}

	// enableTrickPlay:
	public Boolean getEnableTrickPlay(){
		return this.enableTrickPlay;
	}
	public void setEnableTrickPlay(Boolean enableTrickPlay){
		this.enableTrickPlay = enableTrickPlay;
	}

	public void enableTrickPlay(String multirequestToken){
		setToken("enableTrickPlay", multirequestToken);
	}


	public LinearMediaAsset() {
		super();
	}

	public LinearMediaAsset(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		enableCdvrState = TimeShiftedTvState.get(GsonParser.parseString(jsonObject.get("enableCdvrState")));
		enableCatchUpState = TimeShiftedTvState.get(GsonParser.parseString(jsonObject.get("enableCatchUpState")));
		enableStartOverState = TimeShiftedTvState.get(GsonParser.parseString(jsonObject.get("enableStartOverState")));
		bufferCatchUp = GsonParser.parseLong(jsonObject.get("bufferCatchUp"));
		bufferTrickPlay = GsonParser.parseLong(jsonObject.get("bufferTrickPlay"));
		enableRecordingPlaybackNonEntitledChannelState = TimeShiftedTvState.get(GsonParser.parseString(jsonObject.get("enableRecordingPlaybackNonEntitledChannelState")));
		enableTrickPlayState = TimeShiftedTvState.get(GsonParser.parseString(jsonObject.get("enableTrickPlayState")));
		externalIngestId = GsonParser.parseString(jsonObject.get("externalIngestId"));
		externalCdvrId = GsonParser.parseString(jsonObject.get("externalCdvrId"));
		enableCdvr = GsonParser.parseBoolean(jsonObject.get("enableCdvr"));
		enableCatchUp = GsonParser.parseBoolean(jsonObject.get("enableCatchUp"));
		enableStartOver = GsonParser.parseBoolean(jsonObject.get("enableStartOver"));
		catchUpBuffer = GsonParser.parseLong(jsonObject.get("catchUpBuffer"));
		trickPlayBuffer = GsonParser.parseLong(jsonObject.get("trickPlayBuffer"));
		enableRecordingPlaybackNonEntitledChannel = GsonParser.parseBoolean(jsonObject.get("enableRecordingPlaybackNonEntitledChannel"));
		enableTrickPlay = GsonParser.parseBoolean(jsonObject.get("enableTrickPlay"));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaLinearMediaAsset");
		kparams.add("enableCdvrState", this.enableCdvrState);
		kparams.add("enableCatchUpState", this.enableCatchUpState);
		kparams.add("enableStartOverState", this.enableStartOverState);
		kparams.add("bufferCatchUp", this.bufferCatchUp);
		kparams.add("bufferTrickPlay", this.bufferTrickPlay);
		kparams.add("enableRecordingPlaybackNonEntitledChannelState", this.enableRecordingPlaybackNonEntitledChannelState);
		kparams.add("enableTrickPlayState", this.enableTrickPlayState);
		kparams.add("externalIngestId", this.externalIngestId);
		kparams.add("externalCdvrId", this.externalCdvrId);
		return kparams;
	}


    public static final Creator<LinearMediaAsset> CREATOR = new Creator<LinearMediaAsset>() {
        @Override
        public LinearMediaAsset createFromParcel(Parcel source) {
            return new LinearMediaAsset(source);
        }

        @Override
        public LinearMediaAsset[] newArray(int size) {
            return new LinearMediaAsset[size];
        }
    };

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        super.writeToParcel(dest, flags);
        dest.writeInt(this.enableCdvrState == null ? -1 : this.enableCdvrState.ordinal());
        dest.writeInt(this.enableCatchUpState == null ? -1 : this.enableCatchUpState.ordinal());
        dest.writeInt(this.enableStartOverState == null ? -1 : this.enableStartOverState.ordinal());
        dest.writeValue(this.bufferCatchUp);
        dest.writeValue(this.bufferTrickPlay);
        dest.writeInt(this.enableRecordingPlaybackNonEntitledChannelState == null ? -1 : this.enableRecordingPlaybackNonEntitledChannelState.ordinal());
        dest.writeInt(this.enableTrickPlayState == null ? -1 : this.enableTrickPlayState.ordinal());
        dest.writeString(this.externalIngestId);
        dest.writeString(this.externalCdvrId);
        dest.writeValue(this.enableCdvr);
        dest.writeValue(this.enableCatchUp);
        dest.writeValue(this.enableStartOver);
        dest.writeValue(this.catchUpBuffer);
        dest.writeValue(this.trickPlayBuffer);
        dest.writeValue(this.enableRecordingPlaybackNonEntitledChannel);
        dest.writeValue(this.enableTrickPlay);
    }

    public LinearMediaAsset(Parcel in) {
        super(in);
        int tmpEnableCdvrState = in.readInt();
        this.enableCdvrState = tmpEnableCdvrState == -1 ? null : TimeShiftedTvState.values()[tmpEnableCdvrState];
        int tmpEnableCatchUpState = in.readInt();
        this.enableCatchUpState = tmpEnableCatchUpState == -1 ? null : TimeShiftedTvState.values()[tmpEnableCatchUpState];
        int tmpEnableStartOverState = in.readInt();
        this.enableStartOverState = tmpEnableStartOverState == -1 ? null : TimeShiftedTvState.values()[tmpEnableStartOverState];
        this.bufferCatchUp = (Long)in.readValue(Long.class.getClassLoader());
        this.bufferTrickPlay = (Long)in.readValue(Long.class.getClassLoader());
        int tmpEnableRecordingPlaybackNonEntitledChannelState = in.readInt();
        this.enableRecordingPlaybackNonEntitledChannelState = tmpEnableRecordingPlaybackNonEntitledChannelState == -1 ? null : TimeShiftedTvState.values()[tmpEnableRecordingPlaybackNonEntitledChannelState];
        int tmpEnableTrickPlayState = in.readInt();
        this.enableTrickPlayState = tmpEnableTrickPlayState == -1 ? null : TimeShiftedTvState.values()[tmpEnableTrickPlayState];
        this.externalIngestId = in.readString();
        this.externalCdvrId = in.readString();
        this.enableCdvr = (Boolean)in.readValue(Boolean.class.getClassLoader());
        this.enableCatchUp = (Boolean)in.readValue(Boolean.class.getClassLoader());
        this.enableStartOver = (Boolean)in.readValue(Boolean.class.getClassLoader());
        this.catchUpBuffer = (Long)in.readValue(Long.class.getClassLoader());
        this.trickPlayBuffer = (Long)in.readValue(Long.class.getClassLoader());
        this.enableRecordingPlaybackNonEntitledChannel = (Boolean)in.readValue(Boolean.class.getClassLoader());
        this.enableTrickPlay = (Boolean)in.readValue(Boolean.class.getClassLoader());
    }
}

