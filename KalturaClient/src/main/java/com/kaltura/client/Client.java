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
package com.kaltura.client;

import com.kaltura.client.utils.request.ConnectionConfiguration;
import com.kaltura.client.types.BaseResponseProfile;

/**
 * This class was generated using clients-generator\exec.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

@SuppressWarnings("serial")
public class Client extends ClientBase {
	
	public Client(ConnectionConfiguration config) {
		super(config);
		
		this.setClientTag("java:17-09-10");
		this.setApiVersion("4.5.4.20099");
		this.clientConfiguration.put("format", 1); // JSON
	}
	
	/**
	 * @param clientTag
	 */
	public void setClientTag(String clientTag){
		this.clientConfiguration.put("clientTag", clientTag);
	}
	
	/**
	 * @return String
	 */
	public String getClientTag(){
		if(this.clientConfiguration.containsKey("clientTag")){
			return(String) this.clientConfiguration.get("clientTag");
		}
		
		return null;
	}
	
	/**
	 * @param apiVersion
	 */
	public void setApiVersion(String apiVersion){
		this.clientConfiguration.put("apiVersion", apiVersion);
	}
	
	/**
	 * @return String
	 */
	public String getApiVersion(){
		if(this.clientConfiguration.containsKey("apiVersion")){
			return(String) this.clientConfiguration.get("apiVersion");
		}
		
		return null;
	}
	
	/**
	 * Impersonated partner id
	 * 
	 * @param partnerId
	 */
	public void setPartnerId(Integer partnerId){
		this.requestConfiguration.put("partnerId", partnerId);
	}
	
	/**
	 * Impersonated partner id
	 * 
	 * @return Integer
	 */
	public Integer getPartnerId(){
		if(this.requestConfiguration.containsKey("partnerId")){
			return(Integer) this.requestConfiguration.get("partnerId");
		}
		
		return 0;
	}
	
	/**
	 * Impersonated user id
	 * 
	 * @param userId
	 */
	public void setUserId(Integer userId){
		this.requestConfiguration.put("userId", userId);
	}
	
	/**
	 * Impersonated user id
	 * 
	 * @return Integer
	 */
	public Integer getUserId(){
		if(this.requestConfiguration.containsKey("userId")){
			return(Integer) this.requestConfiguration.get("userId");
		}
		
		return 0;
	}
	
	/**
	 * Content language
	 * 
	 * @param language
	 */
	public void setLanguage(String language){
		this.requestConfiguration.put("language", language);
	}
	
	/**
	 * Content language
	 * 
	 * @return String
	 */
	public String getLanguage(){
		if(this.requestConfiguration.containsKey("language")){
			return(String) this.requestConfiguration.get("language");
		}
		
		return null;
	}
	
	/**
	 * Content currency
	 * 
	 * @param currency
	 */
	public void setCurrency(String currency){
		this.requestConfiguration.put("currency", currency);
	}
	
	/**
	 * Content currency
	 * 
	 * @return String
	 */
	public String getCurrency(){
		if(this.requestConfiguration.containsKey("currency")){
			return(String) this.requestConfiguration.get("currency");
		}
		
		return null;
	}
	
	/**
	 * Kaltura API session
	 * 
	 * @param ks
	 */
	public void setKs(String ks){
		this.requestConfiguration.put("ks", ks);
	}
	
	/**
	 * Kaltura API session
	 * 
	 * @return String
	 */
	public String getKs(){
		if(this.requestConfiguration.containsKey("ks")){
			return(String) this.requestConfiguration.get("ks");
		}
		
		return null;
	}
	
	/**
	 * Kaltura API session
	 * 
	 * @param sessionId
	 */
	public void setSessionId(String sessionId){
		this.requestConfiguration.put("ks", sessionId);
	}
	
	/**
	 * Kaltura API session
	 * 
	 * @return String
	 */
	public String getSessionId(){
		if(this.requestConfiguration.containsKey("ks")){
			return(String) this.requestConfiguration.get("ks");
		}
		
		return null;
	}
	
	/**
	 * Response profile - this attribute will be automatically unset after every API call
	 * 
	 * @param responseProfile
	 */
	public void setResponseProfile(BaseResponseProfile responseProfile){
		this.requestConfiguration.put("responseProfile", responseProfile);
	}
	
	/**
	 * Response profile - this attribute will be automatically unset after every API call
	 * 
	 * @return BaseResponseProfile
	 */
	public BaseResponseProfile getResponseProfile(){
		if(this.requestConfiguration.containsKey("responseProfile")){
			return(BaseResponseProfile) this.requestConfiguration.get("responseProfile");
		}
		
		return null;
	}
	
}
