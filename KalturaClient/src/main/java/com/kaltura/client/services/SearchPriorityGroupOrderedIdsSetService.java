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

import com.kaltura.client.types.SearchPriorityGroupOrderedIdsSet;
import com.kaltura.client.utils.request.RequestBuilder;

/**
 * This class was generated using exec.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

public class SearchPriorityGroupOrderedIdsSetService {
	
	public static class GetSearchPriorityGroupOrderedIdsSetBuilder extends RequestBuilder<SearchPriorityGroupOrderedIdsSet, SearchPriorityGroupOrderedIdsSet.Tokenizer, GetSearchPriorityGroupOrderedIdsSetBuilder> {
		
		public GetSearchPriorityGroupOrderedIdsSetBuilder() {
			super(SearchPriorityGroupOrderedIdsSet.class, "searchprioritygrouporderedidsset", "get");
		}
	}

	/**
	 * Return the current ordering of priority groups for the partner.
	 */
    public static GetSearchPriorityGroupOrderedIdsSetBuilder get()  {
		return new GetSearchPriorityGroupOrderedIdsSetBuilder();
	}
	
	public static class SetSearchPriorityGroupOrderedIdsSetBuilder extends RequestBuilder<SearchPriorityGroupOrderedIdsSet, SearchPriorityGroupOrderedIdsSet.Tokenizer, SetSearchPriorityGroupOrderedIdsSetBuilder> {
		
		public SetSearchPriorityGroupOrderedIdsSetBuilder(SearchPriorityGroupOrderedIdsSet orderedList) {
			super(SearchPriorityGroupOrderedIdsSet.class, "searchprioritygrouporderedidsset", "set");
			params.add("orderedList", orderedList);
		}
	}

	/**
	 * Set the ordering of priority groups for the partner.
	 * 
	 * @param orderedList List with ordered search priority groups.
	 */
    public static SetSearchPriorityGroupOrderedIdsSetBuilder set(SearchPriorityGroupOrderedIdsSet orderedList)  {
		return new SetSearchPriorityGroupOrderedIdsSetBuilder(orderedList);
	}
}
