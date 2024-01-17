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
import com.kaltura.client.enums.LinearChannelType;
import com.kaltura.client.enums.TimeShiftedTvState;
import com.kaltura.client.utils.GsonParser;
import com.kaltura.client.utils.request.MultiRequestBuilder;

/**
 * This class was generated using exec.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

/**
 * Linear media asset info
 */
@SuppressWarnings("serial")
@MultiRequestBuilder.Tokenizer(LiveAsset.Tokenizer.class)
public class LiveAsset extends MediaAsset {
	
	public interface Tokenizer extends MediaAsset.Tokenizer {
		String enableCdvrState();
		String enableCatchUpState();
		String enableStartOverState();
		String bufferCatchUpSetting();
		String paddingBeforeProgramStarts();
		String paddingAfterProgramEnds();
		String bufferTrickPlaySetting();
		String enableRecordingPlaybackNonEntitledChannelState();
		String enableTrickPlayState();
		String externalEpgIngestId();
		String externalCdvrId();
		String enableCdvr();
		String enableCatchUp();
		String enableStartOver();
		String catchUpBuffer();
		String trickPlayBuffer();
		String enableRecordingPlaybackNonEntitledChannel();
		String enableTrickPlay();
		String channelType();
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
	private Long bufferCatchUpSetting;
	/**
	 * Returns padding before program starts in seconds from a live asset if
	  configured,              otherwise returns corresponding value from
	  TimeShiftedTvPartnerSettings.
	 */
	private Long paddingBeforeProgramStarts;
	/**
	 * Returns padding after program ends in seconds from a live asset if configured,  
	             otherwise returns corresponding value from
	  TimeShiftedTvPartnerSettings.
	 */
	private Long paddingAfterProgramEnds;
	/**
	 * buffer Trick-play, configuration only
	 */
	private Long bufferTrickPlaySetting;
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
	private String externalEpgIngestId;
	/**
	 * External identifier for the CDVR
	 */
	private String externalCdvrId;
	/**
	 * Is CDVR enabled for this asset              Please, note that value of this
	  property is strictly connected with CDV-R setting on Partner level.             
	  In order to enable CDV-R for KalturaLiveAsset, Partner CDV-R setting should be
	  enabled.
	 */
	private Boolean enableCdvr;
	/**
	 * Is catch-up enabled for this asset              Please, note that value of this
	  property is strictly connected with Catch Up setting on Partner level.          
	     In order to enable Catch Up for KalturaLiveAsset, Partner Catch Up setting
	  should be enabled.
	 */
	private Boolean enableCatchUp;
	/**
	 * Is start over enabled for this asset              Please, note that value of
	  this property is strictly connected with Start Over setting on Partner level.   
	            In order to enable Start Over for KalturaLiveAsset, Partner Start Over
	  setting should be enabled.
	 */
	private Boolean enableStartOver;
	/**
	 * summed Catch-up buffer, the TimeShiftedTvPartnerSettings are also taken into
	  consideration
	 */
	private Long catchUpBuffer;
	/**
	 * summed Trick-play buffer, the TimeShiftedTvPartnerSettings are also taken into
	  consideration
	 */
	private Long trickPlayBuffer;
	/**
	 * Is recording playback for non entitled channel enabled for this asset
	 */
	private Boolean enableRecordingPlaybackNonEntitledChannel;
	/**
	 * Is trick-play enabled for this asset              Please, note that value of
	  this property is strictly connected with Trick Play setting on Partner level.   
	            In order to enable Trick Play for KalturaLiveAsset, Partner Trick Play
	  setting should be enabled.
	 */
	private Boolean enableTrickPlay;
	/**
	 * channel type, possible values: UNKNOWN, DTT, OTT, DTT_AND_OTT
	 */
	private LinearChannelType channelType;

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

	// bufferCatchUpSetting:
	public Long getBufferCatchUpSetting(){
		return this.bufferCatchUpSetting;
	}
	public void setBufferCatchUpSetting(Long bufferCatchUpSetting){
		this.bufferCatchUpSetting = bufferCatchUpSetting;
	}

	public void bufferCatchUpSetting(String multirequestToken){
		setToken("bufferCatchUpSetting", multirequestToken);
	}

	// paddingBeforeProgramStarts:
	public Long getPaddingBeforeProgramStarts(){
		return this.paddingBeforeProgramStarts;
	}
	public void setPaddingBeforeProgramStarts(Long paddingBeforeProgramStarts){
		this.paddingBeforeProgramStarts = paddingBeforeProgramStarts;
	}

	public void paddingBeforeProgramStarts(String multirequestToken){
		setToken("paddingBeforeProgramStarts", multirequestToken);
	}

	// paddingAfterProgramEnds:
	public Long getPaddingAfterProgramEnds(){
		return this.paddingAfterProgramEnds;
	}
	public void setPaddingAfterProgramEnds(Long paddingAfterProgramEnds){
		this.paddingAfterProgramEnds = paddingAfterProgramEnds;
	}

	public void paddingAfterProgramEnds(String multirequestToken){
		setToken("paddingAfterProgramEnds", multirequestToken);
	}

	// bufferTrickPlaySetting:
	public Long getBufferTrickPlaySetting(){
		return this.bufferTrickPlaySetting;
	}
	public void setBufferTrickPlaySetting(Long bufferTrickPlaySetting){
		this.bufferTrickPlaySetting = bufferTrickPlaySetting;
	}

	public void bufferTrickPlaySetting(String multirequestToken){
		setToken("bufferTrickPlaySetting", multirequestToken);
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

	// externalEpgIngestId:
	public String getExternalEpgIngestId(){
		return this.externalEpgIngestId;
	}
	public void setExternalEpgIngestId(String externalEpgIngestId){
		this.externalEpgIngestId = externalEpgIngestId;
	}

	public void externalEpgIngestId(String multirequestToken){
		setToken("externalEpgIngestId", multirequestToken);
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
	// enableCatchUp:
	public Boolean getEnableCatchUp(){
		return this.enableCatchUp;
	}
	// enableStartOver:
	public Boolean getEnableStartOver(){
		return this.enableStartOver;
	}
	// catchUpBuffer:
	public Long getCatchUpBuffer(){
		return this.catchUpBuffer;
	}
	// trickPlayBuffer:
	public Long getTrickPlayBuffer(){
		return this.trickPlayBuffer;
	}
	// enableRecordingPlaybackNonEntitledChannel:
	public Boolean getEnableRecordingPlaybackNonEntitledChannel(){
		return this.enableRecordingPlaybackNonEntitledChannel;
	}
	// enableTrickPlay:
	public Boolean getEnableTrickPlay(){
		return this.enableTrickPlay;
	}
	// channelType:
	public LinearChannelType getChannelType(){
		return this.channelType;
	}
	public void setChannelType(LinearChannelType channelType){
		this.channelType = channelType;
	}

	public void channelType(String multirequestToken){
		setToken("channelType", multirequestToken);
	}


	public LiveAsset() {
		super();
	}

	public LiveAsset(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		enableCdvrState = TimeShiftedTvState.get(GsonParser.parseString(jsonObject.get("enableCdvrState")));
		enableCatchUpState = TimeShiftedTvState.get(GsonParser.parseString(jsonObject.get("enableCatchUpState")));
		enableStartOverState = TimeShiftedTvState.get(GsonParser.parseString(jsonObject.get("enableStartOverState")));
		bufferCatchUpSetting = GsonParser.parseLong(jsonObject.get("bufferCatchUpSetting"));
		paddingBeforeProgramStarts = GsonParser.parseLong(jsonObject.get("paddingBeforeProgramStarts"));
		paddingAfterProgramEnds = GsonParser.parseLong(jsonObject.get("paddingAfterProgramEnds"));
		bufferTrickPlaySetting = GsonParser.parseLong(jsonObject.get("bufferTrickPlaySetting"));
		enableRecordingPlaybackNonEntitledChannelState = TimeShiftedTvState.get(GsonParser.parseString(jsonObject.get("enableRecordingPlaybackNonEntitledChannelState")));
		enableTrickPlayState = TimeShiftedTvState.get(GsonParser.parseString(jsonObject.get("enableTrickPlayState")));
		externalEpgIngestId = GsonParser.parseString(jsonObject.get("externalEpgIngestId"));
		externalCdvrId = GsonParser.parseString(jsonObject.get("externalCdvrId"));
		enableCdvr = GsonParser.parseBoolean(jsonObject.get("enableCdvr"));
		enableCatchUp = GsonParser.parseBoolean(jsonObject.get("enableCatchUp"));
		enableStartOver = GsonParser.parseBoolean(jsonObject.get("enableStartOver"));
		catchUpBuffer = GsonParser.parseLong(jsonObject.get("catchUpBuffer"));
		trickPlayBuffer = GsonParser.parseLong(jsonObject.get("trickPlayBuffer"));
		enableRecordingPlaybackNonEntitledChannel = GsonParser.parseBoolean(jsonObject.get("enableRecordingPlaybackNonEntitledChannel"));
		enableTrickPlay = GsonParser.parseBoolean(jsonObject.get("enableTrickPlay"));
		channelType = LinearChannelType.get(GsonParser.parseString(jsonObject.get("channelType")));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaLiveAsset");
		kparams.add("enableCdvrState", this.enableCdvrState);
		kparams.add("enableCatchUpState", this.enableCatchUpState);
		kparams.add("enableStartOverState", this.enableStartOverState);
		kparams.add("bufferCatchUpSetting", this.bufferCatchUpSetting);
		kparams.add("paddingBeforeProgramStarts", this.paddingBeforeProgramStarts);
		kparams.add("paddingAfterProgramEnds", this.paddingAfterProgramEnds);
		kparams.add("bufferTrickPlaySetting", this.bufferTrickPlaySetting);
		kparams.add("enableRecordingPlaybackNonEntitledChannelState", this.enableRecordingPlaybackNonEntitledChannelState);
		kparams.add("enableTrickPlayState", this.enableTrickPlayState);
		kparams.add("externalEpgIngestId", this.externalEpgIngestId);
		kparams.add("externalCdvrId", this.externalCdvrId);
		kparams.add("channelType", this.channelType);
		return kparams;
	}


    public static final Creator<LiveAsset> CREATOR = new Creator<LiveAsset>() {
        @Override
        public LiveAsset createFromParcel(Parcel source) {
            return new LiveAsset(source);
        }

        @Override
        public LiveAsset[] newArray(int size) {
            return new LiveAsset[size];
        }
    };

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        super.writeToParcel(dest, flags);
        dest.writeInt(this.enableCdvrState == null ? -1 : this.enableCdvrState.ordinal());
        dest.writeInt(this.enableCatchUpState == null ? -1 : this.enableCatchUpState.ordinal());
        dest.writeInt(this.enableStartOverState == null ? -1 : this.enableStartOverState.ordinal());
        dest.writeValue(this.bufferCatchUpSetting);
        dest.writeValue(this.paddingBeforeProgramStarts);
        dest.writeValue(this.paddingAfterProgramEnds);
        dest.writeValue(this.bufferTrickPlaySetting);
        dest.writeInt(this.enableRecordingPlaybackNonEntitledChannelState == null ? -1 : this.enableRecordingPlaybackNonEntitledChannelState.ordinal());
        dest.writeInt(this.enableTrickPlayState == null ? -1 : this.enableTrickPlayState.ordinal());
        dest.writeString(this.externalEpgIngestId);
        dest.writeString(this.externalCdvrId);
        dest.writeValue(this.enableCdvr);
        dest.writeValue(this.enableCatchUp);
        dest.writeValue(this.enableStartOver);
        dest.writeValue(this.catchUpBuffer);
        dest.writeValue(this.trickPlayBuffer);
        dest.writeValue(this.enableRecordingPlaybackNonEntitledChannel);
        dest.writeValue(this.enableTrickPlay);
        dest.writeInt(this.channelType == null ? -1 : this.channelType.ordinal());
    }

    public LiveAsset(Parcel in) {
        super(in);
        int tmpEnableCdvrState = in.readInt();
        this.enableCdvrState = tmpEnableCdvrState == -1 ? null : TimeShiftedTvState.values()[tmpEnableCdvrState];
        int tmpEnableCatchUpState = in.readInt();
        this.enableCatchUpState = tmpEnableCatchUpState == -1 ? null : TimeShiftedTvState.values()[tmpEnableCatchUpState];
        int tmpEnableStartOverState = in.readInt();
        this.enableStartOverState = tmpEnableStartOverState == -1 ? null : TimeShiftedTvState.values()[tmpEnableStartOverState];
        this.bufferCatchUpSetting = (Long)in.readValue(Long.class.getClassLoader());
        this.paddingBeforeProgramStarts = (Long)in.readValue(Long.class.getClassLoader());
        this.paddingAfterProgramEnds = (Long)in.readValue(Long.class.getClassLoader());
        this.bufferTrickPlaySetting = (Long)in.readValue(Long.class.getClassLoader());
        int tmpEnableRecordingPlaybackNonEntitledChannelState = in.readInt();
        this.enableRecordingPlaybackNonEntitledChannelState = tmpEnableRecordingPlaybackNonEntitledChannelState == -1 ? null : TimeShiftedTvState.values()[tmpEnableRecordingPlaybackNonEntitledChannelState];
        int tmpEnableTrickPlayState = in.readInt();
        this.enableTrickPlayState = tmpEnableTrickPlayState == -1 ? null : TimeShiftedTvState.values()[tmpEnableTrickPlayState];
        this.externalEpgIngestId = in.readString();
        this.externalCdvrId = in.readString();
        this.enableCdvr = (Boolean)in.readValue(Boolean.class.getClassLoader());
        this.enableCatchUp = (Boolean)in.readValue(Boolean.class.getClassLoader());
        this.enableStartOver = (Boolean)in.readValue(Boolean.class.getClassLoader());
        this.catchUpBuffer = (Long)in.readValue(Long.class.getClassLoader());
        this.trickPlayBuffer = (Long)in.readValue(Long.class.getClassLoader());
        this.enableRecordingPlaybackNonEntitledChannel = (Boolean)in.readValue(Boolean.class.getClassLoader());
        this.enableTrickPlay = (Boolean)in.readValue(Boolean.class.getClassLoader());
        int tmpChannelType = in.readInt();
        this.channelType = tmpChannelType == -1 ? null : LinearChannelType.values()[tmpChannelType];
    }
}

