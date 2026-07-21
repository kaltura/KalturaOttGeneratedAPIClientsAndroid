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
import com.kaltura.client.enums.BooleanOperator;
import com.kaltura.client.types.ContentTypeSelector;
import com.kaltura.client.types.ViewTimeConstraint;
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
 * A helper schema containing shared properties used for defining watch history
  conditions.              Implements KalturaBaseSegmentCondition.
 */
@SuppressWarnings("serial")
@MultiRequestBuilder.Tokenizer(BaseWatchCondition.Tokenizer.class)
public abstract class BaseWatchCondition extends BaseSegmentCondition {
	
	public interface Tokenizer extends BaseSegmentCondition.Tokenizer {
		ContentTypeSelector.Tokenizer contentFilter();
		String evaluationDays();
		String deviceFamilyIn();
		ViewTimeConstraint.Tokenizer viewTimeConstraint();
		String constraintsOperator();
		RequestBuilder.ListTokenizer<BaseAttributeConstraint.Tokenizer> constraintAttributes();
	}

	/**
	 * Specifies criteria to include or exclude specific content types (recordings,
	  programs, media types) from the evaluation.
	 */
	private ContentTypeSelector contentFilter;
	/**
	 * The period in days to look back for watch history.
	 */
	private Integer evaluationDays;
	/**
	 * A comma-separated list of device family names (e.g., &amp;#39;mobile&amp;#39;,
	  &amp;#39;web&amp;#39;, &amp;#39;stb&amp;#39;).
	 */
	private String deviceFamilyIn;
	/**
	 * Filters watch actions that occurred within a specific time window.
	 */
	private ViewTimeConstraint viewTimeConstraint;
	/**
	 * Defines whether to use AND or OR between the items in constraintAttributes.
	 */
	private BooleanOperator constraintsOperator;
	/**
	 * A list of up to 5 specific constraints to filter the watch history.
	 */
	private List<BaseAttributeConstraint> constraintAttributes;

	// contentFilter:
	public ContentTypeSelector getContentFilter(){
		return this.contentFilter;
	}
	public void setContentFilter(ContentTypeSelector contentFilter){
		this.contentFilter = contentFilter;
	}

	// evaluationDays:
	public Integer getEvaluationDays(){
		return this.evaluationDays;
	}
	public void setEvaluationDays(Integer evaluationDays){
		this.evaluationDays = evaluationDays;
	}

	public void evaluationDays(String multirequestToken){
		setToken("evaluationDays", multirequestToken);
	}

	// deviceFamilyIn:
	public String getDeviceFamilyIn(){
		return this.deviceFamilyIn;
	}
	public void setDeviceFamilyIn(String deviceFamilyIn){
		this.deviceFamilyIn = deviceFamilyIn;
	}

	public void deviceFamilyIn(String multirequestToken){
		setToken("deviceFamilyIn", multirequestToken);
	}

	// viewTimeConstraint:
	public ViewTimeConstraint getViewTimeConstraint(){
		return this.viewTimeConstraint;
	}
	public void setViewTimeConstraint(ViewTimeConstraint viewTimeConstraint){
		this.viewTimeConstraint = viewTimeConstraint;
	}

	// constraintsOperator:
	public BooleanOperator getConstraintsOperator(){
		return this.constraintsOperator;
	}
	public void setConstraintsOperator(BooleanOperator constraintsOperator){
		this.constraintsOperator = constraintsOperator;
	}

	public void constraintsOperator(String multirequestToken){
		setToken("constraintsOperator", multirequestToken);
	}

	// constraintAttributes:
	public List<BaseAttributeConstraint> getConstraintAttributes(){
		return this.constraintAttributes;
	}
	public void setConstraintAttributes(List<BaseAttributeConstraint> constraintAttributes){
		this.constraintAttributes = constraintAttributes;
	}


	public BaseWatchCondition() {
		super();
	}

	public BaseWatchCondition(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		contentFilter = GsonParser.parseObject(jsonObject.getAsJsonObject("contentFilter"), ContentTypeSelector.class);
		evaluationDays = GsonParser.parseInt(jsonObject.get("evaluationDays"));
		deviceFamilyIn = GsonParser.parseString(jsonObject.get("deviceFamilyIn"));
		viewTimeConstraint = GsonParser.parseObject(jsonObject.getAsJsonObject("viewTimeConstraint"), ViewTimeConstraint.class);
		constraintsOperator = BooleanOperator.get(GsonParser.parseString(jsonObject.get("constraintsOperator")));
		constraintAttributes = GsonParser.parseArray(jsonObject.getAsJsonArray("constraintAttributes"), BaseAttributeConstraint.class);

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaBaseWatchCondition");
		kparams.add("contentFilter", this.contentFilter);
		kparams.add("evaluationDays", this.evaluationDays);
		kparams.add("deviceFamilyIn", this.deviceFamilyIn);
		kparams.add("viewTimeConstraint", this.viewTimeConstraint);
		kparams.add("constraintsOperator", this.constraintsOperator);
		kparams.add("constraintAttributes", this.constraintAttributes);
		return kparams;
	}


    @Override
    public void writeToParcel(Parcel dest, int flags) {
        super.writeToParcel(dest, flags);
        dest.writeParcelable(this.contentFilter, flags);
        dest.writeValue(this.evaluationDays);
        dest.writeString(this.deviceFamilyIn);
        dest.writeParcelable(this.viewTimeConstraint, flags);
        dest.writeInt(this.constraintsOperator == null ? -1 : this.constraintsOperator.ordinal());
        if(this.constraintAttributes != null) {
            dest.writeInt(this.constraintAttributes.size());
            dest.writeList(this.constraintAttributes);
        } else {
            dest.writeInt(-1);
        }
    }

    public BaseWatchCondition(Parcel in) {
        super(in);
        this.contentFilter = in.readParcelable(ContentTypeSelector.class.getClassLoader());
        this.evaluationDays = (Integer)in.readValue(Integer.class.getClassLoader());
        this.deviceFamilyIn = in.readString();
        this.viewTimeConstraint = in.readParcelable(ViewTimeConstraint.class.getClassLoader());
        int tmpConstraintsOperator = in.readInt();
        this.constraintsOperator = tmpConstraintsOperator == -1 ? null : BooleanOperator.values()[tmpConstraintsOperator];
        int constraintAttributesSize = in.readInt();
        if( constraintAttributesSize > -1) {
            this.constraintAttributes = new ArrayList<>();
            in.readList(this.constraintAttributes, BaseAttributeConstraint.class.getClassLoader());
        }
    }
}

