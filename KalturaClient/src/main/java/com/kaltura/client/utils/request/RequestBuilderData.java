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
package com.kaltura.client.utils.request;

import com.kaltura.client.Params;

/**
 * This class was generated using clients-generator\exec.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

public abstract class RequestBuilderData {
	
	protected Params params = new Params();
	
	protected RequestBuilderData() {
	}
	
	/**
	 * @param clientTag 
	 */
	public void setClientTag(String clientTag){
		params.add("clientTag", clientTag);
	}
	
	/**
	 * @param apiVersion 
	 */
	public void setApiVersion(String apiVersion){
		params.add("apiVersion", apiVersion);
	}
	
	/**
	 * @param partnerId Impersonated partner id
	 */
	public void setPartnerId(Integer partnerId){
		params.add("partnerId", partnerId);
	}
	
	/**
	 * @param userId Impersonated user id
	 */
	public void setUserId(Integer userId){
		params.add("userId", userId);
	}
	
	/**
	 * @param language Content language
	 */
	public void setLanguage(String language){
		params.add("language", language);
	}
	
	/**
	 * @param currency Content currency
	 */
	public void setCurrency(String currency){
		params.add("currency", currency);
	}
	
	/**
	 * @param ks Kaltura API session
	 */
	public void setKs(String ks){
		params.add("ks", ks);
	}
	
	/**
	 * @param sessionId Kaltura API session
	 */
	public void setSessionId(String sessionId){
		params.add("ks", sessionId);
	}
	
}
