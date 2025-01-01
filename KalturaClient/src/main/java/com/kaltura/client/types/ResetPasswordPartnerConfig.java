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
import com.kaltura.client.types.ObjectBase;
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

@SuppressWarnings("serial")
@MultiRequestBuilder.Tokenizer(ResetPasswordPartnerConfig.Tokenizer.class)
public class ResetPasswordPartnerConfig extends ObjectBase {
	
	public interface Tokenizer extends ObjectBase.Tokenizer {
		String templateListLabel();
		RequestBuilder.ListTokenizer<ResetPasswordPartnerConfigTemplate.Tokenizer> templates();
	}

	/**
	 * template List Label
	 */
	private String templateListLabel;
	/**
	 * templates
	 */
	private List<ResetPasswordPartnerConfigTemplate> templates;

	// templateListLabel:
	public String getTemplateListLabel(){
		return this.templateListLabel;
	}
	public void setTemplateListLabel(String templateListLabel){
		this.templateListLabel = templateListLabel;
	}

	public void templateListLabel(String multirequestToken){
		setToken("templateListLabel", multirequestToken);
	}

	// templates:
	public List<ResetPasswordPartnerConfigTemplate> getTemplates(){
		return this.templates;
	}
	public void setTemplates(List<ResetPasswordPartnerConfigTemplate> templates){
		this.templates = templates;
	}


	public ResetPasswordPartnerConfig() {
		super();
	}

	public ResetPasswordPartnerConfig(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		templateListLabel = GsonParser.parseString(jsonObject.get("templateListLabel"));
		templates = GsonParser.parseArray(jsonObject.getAsJsonArray("templates"), ResetPasswordPartnerConfigTemplate.class);

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaResetPasswordPartnerConfig");
		kparams.add("templateListLabel", this.templateListLabel);
		kparams.add("templates", this.templates);
		return kparams;
	}


    public static final Creator<ResetPasswordPartnerConfig> CREATOR = new Creator<ResetPasswordPartnerConfig>() {
        @Override
        public ResetPasswordPartnerConfig createFromParcel(Parcel source) {
            return new ResetPasswordPartnerConfig(source);
        }

        @Override
        public ResetPasswordPartnerConfig[] newArray(int size) {
            return new ResetPasswordPartnerConfig[size];
        }
    };

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        super.writeToParcel(dest, flags);
        dest.writeString(this.templateListLabel);
        if(this.templates != null) {
            dest.writeInt(this.templates.size());
            dest.writeList(this.templates);
        } else {
            dest.writeInt(-1);
        }
    }

    public ResetPasswordPartnerConfig(Parcel in) {
        super(in);
        this.templateListLabel = in.readString();
        int templatesSize = in.readInt();
        if( templatesSize > -1) {
            this.templates = new ArrayList<>();
            in.readList(this.templates, ResetPasswordPartnerConfigTemplate.class.getClassLoader());
        }
    }
}

