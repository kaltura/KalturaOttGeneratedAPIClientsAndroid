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
package com.kaltura.client.services;

import com.kaltura.client.types.PricePlan;
import com.kaltura.client.types.PricePlanFilter;
import com.kaltura.client.utils.request.ListResponseRequestBuilder;
import com.kaltura.client.utils.request.RequestBuilder;

/**
 * This class was generated using exec.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

public class PricePlanService {
	
	public static class AddPricePlanBuilder extends RequestBuilder<PricePlan, PricePlan.Tokenizer, AddPricePlanBuilder> {
		
		public AddPricePlanBuilder(PricePlan pricePlan) {
			super(PricePlan.class, "priceplan", "add");
			params.add("pricePlan", pricePlan);
		}
	}

	/**
	 * Internal API !!!  Insert new PriceDetails for partner
	 * 
	 * @param pricePlan Price plan Object
	 */
    public static AddPricePlanBuilder add(PricePlan pricePlan)  {
		return new AddPricePlanBuilder(pricePlan);
	}
	
	public static class DeletePricePlanBuilder extends RequestBuilder<Boolean, String, DeletePricePlanBuilder> {
		
		public DeletePricePlanBuilder(long id) {
			super(Boolean.class, "priceplan", "delete");
			params.add("id", id);
		}
		
		public void id(String multirequestToken) {
			params.add("id", multirequestToken);
		}
	}

	/**
	 * Internal API !!! Delete PricePlan
	 * 
	 * @param id PricePlan identifier
	 */
    public static DeletePricePlanBuilder delete(long id)  {
		return new DeletePricePlanBuilder(id);
	}
	
	public static class ListPricePlanBuilder extends ListResponseRequestBuilder<PricePlan, PricePlan.Tokenizer, ListPricePlanBuilder> {
		
		public ListPricePlanBuilder(PricePlanFilter filter) {
			super(PricePlan.class, "priceplan", "list");
			params.add("filter", filter);
		}
	}

	public static ListPricePlanBuilder list()  {
		return list(null);
	}

	/**
	 * Returns a list of price plans by IDs
	 * 
	 * @param filter Filter request
	 */
    public static ListPricePlanBuilder list(PricePlanFilter filter)  {
		return new ListPricePlanBuilder(filter);
	}
	
	public static class UpdatePricePlanBuilder extends RequestBuilder<PricePlan, PricePlan.Tokenizer, UpdatePricePlanBuilder> {
		
		public UpdatePricePlanBuilder(long id, PricePlan pricePlan) {
			super(PricePlan.class, "priceplan", "update");
			params.add("id", id);
			params.add("pricePlan", pricePlan);
		}
		
		public void id(String multirequestToken) {
			params.add("id", multirequestToken);
		}
	}

	/**
	 * Updates a price plan
	 * 
	 * @param id Price plan ID
	 * @param pricePlan Price plan to update
	 */
    public static UpdatePricePlanBuilder update(long id, PricePlan pricePlan)  {
		return new UpdatePricePlanBuilder(id, pricePlan);
	}
}
