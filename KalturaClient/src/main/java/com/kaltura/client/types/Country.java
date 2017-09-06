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
import com.kaltura.client.types.ObjectBase;
import com.kaltura.client.utils.GsonParser;
import com.kaltura.client.utils.request.MultiRequestBuilder;

/**
 * This class was generated using clients-generator\exec.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

/**  Country details  */
@SuppressWarnings("serial")
@MultiRequestBuilder.Tokenizer(Country.Tokenizer.class)
public class Country extends ObjectBase {
	
	public interface Tokenizer extends ObjectBase.Tokenizer {
		String id();
		String name();
		String code();
		String mainLanguageCode();
		String languagesCode();
		String currency();
		String currencySign();
		String vatPercent();
	}

	/**  Country identifier  */
	private Integer id;
	/**  Country name  */
	private String name;
	/**  Country code  */
	private String code;
	/**  The main language code in the country  */
	private String mainLanguageCode;
	/**  All the languages code that are supported in the country  */
	private String languagesCode;
	/**  Currency code  */
	private String currency;
	/**  Currency Sign  */
	private String currencySign;
	/**  Vat Percent in the country  */
	private Double vatPercent;

	// id:
	public Integer getId(){
		return this.id;
	}
	public void setId(Integer id){
		this.id = id;
	}

	public void id(String multirequestToken){
		setToken("id", multirequestToken);
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

	// code:
	public String getCode(){
		return this.code;
	}
	public void setCode(String code){
		this.code = code;
	}

	public void code(String multirequestToken){
		setToken("code", multirequestToken);
	}

	// mainLanguageCode:
	public String getMainLanguageCode(){
		return this.mainLanguageCode;
	}
	public void setMainLanguageCode(String mainLanguageCode){
		this.mainLanguageCode = mainLanguageCode;
	}

	public void mainLanguageCode(String multirequestToken){
		setToken("mainLanguageCode", multirequestToken);
	}

	// languagesCode:
	public String getLanguagesCode(){
		return this.languagesCode;
	}
	public void setLanguagesCode(String languagesCode){
		this.languagesCode = languagesCode;
	}

	public void languagesCode(String multirequestToken){
		setToken("languagesCode", multirequestToken);
	}

	// currency:
	public String getCurrency(){
		return this.currency;
	}
	public void setCurrency(String currency){
		this.currency = currency;
	}

	public void currency(String multirequestToken){
		setToken("currency", multirequestToken);
	}

	// currencySign:
	public String getCurrencySign(){
		return this.currencySign;
	}
	public void setCurrencySign(String currencySign){
		this.currencySign = currencySign;
	}

	public void currencySign(String multirequestToken){
		setToken("currencySign", multirequestToken);
	}

	// vatPercent:
	public Double getVatPercent(){
		return this.vatPercent;
	}
	public void setVatPercent(Double vatPercent){
		this.vatPercent = vatPercent;
	}

	public void vatPercent(String multirequestToken){
		setToken("vatPercent", multirequestToken);
	}


	public Country() {
		super();
	}

	public Country(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		id = GsonParser.parseInt(jsonObject.get("id"));
		name = GsonParser.parseString(jsonObject.get("name"));
		code = GsonParser.parseString(jsonObject.get("code"));
		mainLanguageCode = GsonParser.parseString(jsonObject.get("mainLanguageCode"));
		languagesCode = GsonParser.parseString(jsonObject.get("languagesCode"));
		currency = GsonParser.parseString(jsonObject.get("currency"));
		currencySign = GsonParser.parseString(jsonObject.get("currencySign"));
		vatPercent = GsonParser.parseDouble(jsonObject.get("vatPercent"));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaCountry");
		kparams.add("name", this.name);
		kparams.add("code", this.code);
		kparams.add("mainLanguageCode", this.mainLanguageCode);
		kparams.add("languagesCode", this.languagesCode);
		kparams.add("currency", this.currency);
		kparams.add("currencySign", this.currencySign);
		kparams.add("vatPercent", this.vatPercent);
		return kparams;
	}


    public static final Creator<Country> CREATOR = new Creator<Country>() {
        @Override
        public Country createFromParcel(Parcel source) {
            return new Country(source);
        }

        @Override
        public Country[] newArray(int size) {
            return new Country[size];
        }
    };

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        super.writeToParcel(dest, flags);
        dest.writeValue(this.id);
        dest.writeString(this.name);
        dest.writeString(this.code);
        dest.writeString(this.mainLanguageCode);
        dest.writeString(this.languagesCode);
        dest.writeString(this.currency);
        dest.writeString(this.currencySign);
        dest.writeValue(this.vatPercent);
    }

    public Country(Parcel in) {
        super(in);
        this.id = (Integer)in.readValue(Integer.class.getClassLoader());
        this.name = in.readString();
        this.code = in.readString();
        this.mainLanguageCode = in.readString();
        this.languagesCode = in.readString();
        this.currency = in.readString();
        this.currencySign = in.readString();
        this.vatPercent = (Double)in.readValue(Double.class.getClassLoader());
    }
}

