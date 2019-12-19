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
// Copyright (C) 2006-2019  Kaltura Inc.
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

import com.kaltura.client.types.HouseholdSegment;
import com.kaltura.client.utils.request.ListResponseRequestBuilder;
import com.kaltura.client.utils.request.RequestBuilder;

/**
 * This class was generated using exec.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

public class HouseholdSegmentService {
	
	public static class AddHouseholdSegmentBuilder extends RequestBuilder<HouseholdSegment, HouseholdSegment.Tokenizer, AddHouseholdSegmentBuilder> {
		
		public AddHouseholdSegmentBuilder(HouseholdSegment householdSegment) {
			super(HouseholdSegment.class, "householdsegment", "add");
			params.add("householdSegment", householdSegment);
		}
	}

	/**
	 * Adds a segment to a household
	 * 
	 * @param householdSegment Household segment
	 */
    public static AddHouseholdSegmentBuilder add(HouseholdSegment householdSegment)  {
		return new AddHouseholdSegmentBuilder(householdSegment);
	}
	
	public static class DeleteHouseholdSegmentBuilder extends RequestBuilder<Boolean, String, DeleteHouseholdSegmentBuilder> {
		
		public DeleteHouseholdSegmentBuilder(long householdId, long segmentId) {
			super(Boolean.class, "householdsegment", "delete");
			params.add("householdId", householdId);
			params.add("segmentId", segmentId);
		}
		
		public void householdId(String multirequestToken) {
			params.add("householdId", multirequestToken);
		}
		
		public void segmentId(String multirequestToken) {
			params.add("segmentId", multirequestToken);
		}
	}

	/**
	 * Deletes a segment from a household
	 * 
	 * @param householdId Household id
	 * @param segmentId Segemnt id
	 */
    public static DeleteHouseholdSegmentBuilder delete(long householdId, long segmentId)  {
		return new DeleteHouseholdSegmentBuilder(householdId, segmentId);
	}
	
	public static class ListHouseholdSegmentBuilder extends ListResponseRequestBuilder<HouseholdSegment, HouseholdSegment.Tokenizer, ListHouseholdSegmentBuilder> {
		
		public ListHouseholdSegmentBuilder() {
			super(HouseholdSegment.class, "householdsegment", "list");
		}
	}

	/**
	 * Retrieve all the segments that apply for given household
	 */
    public static ListHouseholdSegmentBuilder list()  {
		return new ListHouseholdSegmentBuilder();
	}
}
