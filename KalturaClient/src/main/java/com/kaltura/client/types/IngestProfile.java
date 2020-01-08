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
import com.kaltura.client.enums.IngestProfileAutofillPolicy;
import com.kaltura.client.enums.IngestProfileOverlapPolicy;
import com.kaltura.client.types.ObjectBase;
import com.kaltura.client.utils.GsonParser;
import com.kaltura.client.utils.request.MultiRequestBuilder;
import com.kaltura.client.utils.request.RequestBuilder;
import java.util.HashMap;
import java.util.Map;

/**
 * This class was generated using exec.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

/**
 * Ingest profile
 */
@SuppressWarnings("serial")
@MultiRequestBuilder.Tokenizer(IngestProfile.Tokenizer.class)
public class IngestProfile extends ObjectBase {
	
	public interface Tokenizer extends ObjectBase.Tokenizer {
		String id();
		String name();
		String externalId();
		String assetTypeId();
		String transformationAdapterUrl();
		RequestBuilder.MapTokenizer<StringValue.Tokenizer> transformationAdapterSettings();
		String transformationAdapterSharedSecret();
		String defaultAutoFillPolicy();
		String defaultOverlapPolicy();
		String overlapChannels();
	}

	/**
	 * Ingest profile identifier
	 */
	private Integer id;
	/**
	 * Ingest profile name
	 */
	private String name;
	/**
	 * Ingest profile externalId
	 */
	private String externalId;
	/**
	 * Type of assets that this profile suppose to ingest: 0 - EPG, 1 - MEDIA
	 */
	private Integer assetTypeId;
	/**
	 * Transformation Adapter URL
	 */
	private String transformationAdapterUrl;
	/**
	 * Transformation Adapter settings
	 */
	private Map<String, StringValue> transformationAdapterSettings;
	/**
	 * Transformation Adapter shared secret
	 */
	private String transformationAdapterSharedSecret;
	/**
	 * Ingest profile default Auto-fill policy
	 */
	private IngestProfileAutofillPolicy defaultAutoFillPolicy;
	/**
	 * Ingest profile default Overlap policy
	 */
	private IngestProfileOverlapPolicy defaultOverlapPolicy;
	/**
	 * Ingest profile overlap channels
	 */
	private String overlapChannels;

	// id:
	public Integer getId(){
		return this.id;
	}
	// name:
	public String getName(){
		return this.name;
	}
	public void setName(String name){
		this.name = name;
	}

	public void name(String multirequestToken){
		setToken("name", multirequestToken);
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

	// assetTypeId:
	public Integer getAssetTypeId(){
		return this.assetTypeId;
	}
	public void setAssetTypeId(Integer assetTypeId){
		this.assetTypeId = assetTypeId;
	}

	public void assetTypeId(String multirequestToken){
		setToken("assetTypeId", multirequestToken);
	}

	// transformationAdapterUrl:
	public String getTransformationAdapterUrl(){
		return this.transformationAdapterUrl;
	}
	public void setTransformationAdapterUrl(String transformationAdapterUrl){
		this.transformationAdapterUrl = transformationAdapterUrl;
	}

	public void transformationAdapterUrl(String multirequestToken){
		setToken("transformationAdapterUrl", multirequestToken);
	}

	// transformationAdapterSettings:
	public Map<String, StringValue> getTransformationAdapterSettings(){
		return this.transformationAdapterSettings;
	}
	public void setTransformationAdapterSettings(Map<String, StringValue> transformationAdapterSettings){
		this.transformationAdapterSettings = transformationAdapterSettings;
	}

	// transformationAdapterSharedSecret:
	public String getTransformationAdapterSharedSecret(){
		return this.transformationAdapterSharedSecret;
	}
	public void setTransformationAdapterSharedSecret(String transformationAdapterSharedSecret){
		this.transformationAdapterSharedSecret = transformationAdapterSharedSecret;
	}

	public void transformationAdapterSharedSecret(String multirequestToken){
		setToken("transformationAdapterSharedSecret", multirequestToken);
	}

	// defaultAutoFillPolicy:
	public IngestProfileAutofillPolicy getDefaultAutoFillPolicy(){
		return this.defaultAutoFillPolicy;
	}
	public void setDefaultAutoFillPolicy(IngestProfileAutofillPolicy defaultAutoFillPolicy){
		this.defaultAutoFillPolicy = defaultAutoFillPolicy;
	}

	public void defaultAutoFillPolicy(String multirequestToken){
		setToken("defaultAutoFillPolicy", multirequestToken);
	}

	// defaultOverlapPolicy:
	public IngestProfileOverlapPolicy getDefaultOverlapPolicy(){
		return this.defaultOverlapPolicy;
	}
	public void setDefaultOverlapPolicy(IngestProfileOverlapPolicy defaultOverlapPolicy){
		this.defaultOverlapPolicy = defaultOverlapPolicy;
	}

	public void defaultOverlapPolicy(String multirequestToken){
		setToken("defaultOverlapPolicy", multirequestToken);
	}

	// overlapChannels:
	public String getOverlapChannels(){
		return this.overlapChannels;
	}
	public void setOverlapChannels(String overlapChannels){
		this.overlapChannels = overlapChannels;
	}

	public void overlapChannels(String multirequestToken){
		setToken("overlapChannels", multirequestToken);
	}


	public IngestProfile() {
		super();
	}

	public IngestProfile(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		id = GsonParser.parseInt(jsonObject.get("id"));
		name = GsonParser.parseString(jsonObject.get("name"));
		externalId = GsonParser.parseString(jsonObject.get("externalId"));
		assetTypeId = GsonParser.parseInt(jsonObject.get("assetTypeId"));
		transformationAdapterUrl = GsonParser.parseString(jsonObject.get("transformationAdapterUrl"));
		transformationAdapterSettings = GsonParser.parseMap(jsonObject.getAsJsonObject("transformationAdapterSettings"), StringValue.class);
		transformationAdapterSharedSecret = GsonParser.parseString(jsonObject.get("transformationAdapterSharedSecret"));
		defaultAutoFillPolicy = IngestProfileAutofillPolicy.get(GsonParser.parseString(jsonObject.get("defaultAutoFillPolicy")));
		defaultOverlapPolicy = IngestProfileOverlapPolicy.get(GsonParser.parseString(jsonObject.get("defaultOverlapPolicy")));
		overlapChannels = GsonParser.parseString(jsonObject.get("overlapChannels"));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaIngestProfile");
		kparams.add("name", this.name);
		kparams.add("externalId", this.externalId);
		kparams.add("assetTypeId", this.assetTypeId);
		kparams.add("transformationAdapterUrl", this.transformationAdapterUrl);
		kparams.add("transformationAdapterSettings", this.transformationAdapterSettings);
		kparams.add("transformationAdapterSharedSecret", this.transformationAdapterSharedSecret);
		kparams.add("defaultAutoFillPolicy", this.defaultAutoFillPolicy);
		kparams.add("defaultOverlapPolicy", this.defaultOverlapPolicy);
		kparams.add("overlapChannels", this.overlapChannels);
		return kparams;
	}


    public static final Creator<IngestProfile> CREATOR = new Creator<IngestProfile>() {
        @Override
        public IngestProfile createFromParcel(Parcel source) {
            return new IngestProfile(source);
        }

        @Override
        public IngestProfile[] newArray(int size) {
            return new IngestProfile[size];
        }
    };

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        super.writeToParcel(dest, flags);
        dest.writeValue(this.id);
        dest.writeString(this.name);
        dest.writeString(this.externalId);
        dest.writeValue(this.assetTypeId);
        dest.writeString(this.transformationAdapterUrl);
        if(this.transformationAdapterSettings != null) {
            dest.writeInt(this.transformationAdapterSettings.size());
            for (Map.Entry<String, StringValue> entry : this.transformationAdapterSettings.entrySet()) {
                dest.writeString(entry.getKey());
                dest.writeParcelable(entry.getValue(), flags);
            }
        } else {
            dest.writeInt(-1);
        }
        dest.writeString(this.transformationAdapterSharedSecret);
        dest.writeInt(this.defaultAutoFillPolicy == null ? -1 : this.defaultAutoFillPolicy.ordinal());
        dest.writeInt(this.defaultOverlapPolicy == null ? -1 : this.defaultOverlapPolicy.ordinal());
        dest.writeString(this.overlapChannels);
    }

    public IngestProfile(Parcel in) {
        super(in);
        this.id = (Integer)in.readValue(Integer.class.getClassLoader());
        this.name = in.readString();
        this.externalId = in.readString();
        this.assetTypeId = (Integer)in.readValue(Integer.class.getClassLoader());
        this.transformationAdapterUrl = in.readString();
        int transformationAdapterSettingsSize = in.readInt();
        if( transformationAdapterSettingsSize > -1) {
            this.transformationAdapterSettings = new HashMap<>();
            for (int i = 0; i < transformationAdapterSettingsSize; i++) {
                String key = in.readString();
                StringValue value = in.readParcelable(StringValue.class.getClassLoader());
                this.transformationAdapterSettings.put(key, value);
            }
        }
        this.transformationAdapterSharedSecret = in.readString();
        int tmpDefaultAutoFillPolicy = in.readInt();
        this.defaultAutoFillPolicy = tmpDefaultAutoFillPolicy == -1 ? null : IngestProfileAutofillPolicy.values()[tmpDefaultAutoFillPolicy];
        int tmpDefaultOverlapPolicy = in.readInt();
        this.defaultOverlapPolicy = tmpDefaultOverlapPolicy == -1 ? null : IngestProfileOverlapPolicy.values()[tmpDefaultOverlapPolicy];
        this.overlapChannels = in.readString();
    }
}

