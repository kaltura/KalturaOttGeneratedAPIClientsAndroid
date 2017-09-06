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
package com.kaltura.client.services;

import com.kaltura.client.types.FilterPager;
import com.kaltura.client.types.FollowTvSeries;
import com.kaltura.client.types.FollowTvSeriesFilter;
import com.kaltura.client.utils.request.ListResponseRequestBuilder;
import com.kaltura.client.utils.request.RequestBuilder;

/**
 * This class was generated using clients-generator\exec.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

public class FollowTvSeriesService {
	
	public static class AddFollowTvSeriesBuilder extends RequestBuilder<FollowTvSeries, FollowTvSeries.Tokenizer, AddFollowTvSeriesBuilder> {
		
		public AddFollowTvSeriesBuilder(FollowTvSeries followTvSeries) {
			super(FollowTvSeries.class, "followtvseries", "add");
			params.add("followTvSeries", followTvSeries);
		}
	}

	/**  Add a user&amp;#39;s tv series follow.              Possible status codes:
	  UserAlreadyFollowing = 8013, NotFound = 500007, InvalidAssetId = 4024  */
    public static AddFollowTvSeriesBuilder add(FollowTvSeries followTvSeries)  {
		return new AddFollowTvSeriesBuilder(followTvSeries);
	}
	
	public static class DeleteFollowTvSeriesBuilder extends RequestBuilder<Boolean, String, DeleteFollowTvSeriesBuilder> {
		
		public DeleteFollowTvSeriesBuilder(int assetId) {
			super(Boolean.class, "followtvseries", "delete");
			params.add("assetId", assetId);
		}
		
		public void assetId(String multirequestToken) {
			params.add("assetId", multirequestToken);
		}
	}

	/**  Delete a user&amp;#39;s tv series follow.              Possible status codes:
	  UserNotFollowing = 8012, NotFound = 500007, InvalidAssetId = 4024,
	  AnnouncementNotFound = 8006  */
    public static DeleteFollowTvSeriesBuilder delete(int assetId)  {
		return new DeleteFollowTvSeriesBuilder(assetId);
	}
	
	public static class ListFollowTvSeriesBuilder extends ListResponseRequestBuilder<FollowTvSeries, FollowTvSeries.Tokenizer, ListFollowTvSeriesBuilder> {
		
		public ListFollowTvSeriesBuilder(FollowTvSeriesFilter filter, FilterPager pager) {
			super(FollowTvSeries.class, "followtvseries", "list");
			params.add("filter", filter);
			params.add("pager", pager);
		}
	}

	public static ListFollowTvSeriesBuilder list(FollowTvSeriesFilter filter)  {
		return list(filter, null);
	}

	/**  List user&amp;#39;s tv series follows.              Possible status codes:  */
    public static ListFollowTvSeriesBuilder list(FollowTvSeriesFilter filter, FilterPager pager)  {
		return new ListFollowTvSeriesBuilder(filter, pager);
	}
}
