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

import com.kaltura.client.types.ActionResult;
import com.kaltura.client.types.FilterPager;
import com.kaltura.client.types.ImmediateRecording;
import com.kaltura.client.types.Recording;
import com.kaltura.client.types.RecordingFilter;
import com.kaltura.client.utils.request.ArrayRequestBuilder;
import com.kaltura.client.utils.request.ListResponseRequestBuilder;
import com.kaltura.client.utils.request.RequestBuilder;

/**
 * This class was generated using exec.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

public class RecordingService {
	
	public static class AddRecordingBuilder extends RequestBuilder<Recording, Recording.Tokenizer, AddRecordingBuilder> {
		
		public AddRecordingBuilder(Recording recording) {
			super(Recording.class, "recording", "add");
			params.add("recording", recording);
		}
	}

	/**
	 * Issue a record request for a program
	 * 
	 * @param recording Recording Object
	 */
    public static AddRecordingBuilder add(Recording recording)  {
		return new AddRecordingBuilder(recording);
	}
	
	public static class BulkdeleteRecordingBuilder extends ArrayRequestBuilder<ActionResult, ActionResult.Tokenizer, BulkdeleteRecordingBuilder> {
		
		public BulkdeleteRecordingBuilder(String recordingIds) {
			super(ActionResult.class, "recording", "bulkdelete");
			params.add("recordingIds", recordingIds);
		}
		
		public void recordingIds(String multirequestToken) {
			params.add("recordingIds", multirequestToken);
		}
	}

	/**
	 * Delete list of user&amp;#39;s recordings. Recording can be deleted only in
	  status Recorded.              Possible error codes for each recording:
	  RecordingNotFound = 3039, RecordingStatusNotValid = 3043, Error = 1
	 * 
	 * @param recordingIds Recording identifiers. Up to 40 private copies and up to 100 shared copies can
	 * be deleted withing a call.
	 */
    public static BulkdeleteRecordingBuilder bulkdelete(String recordingIds)  {
		return new BulkdeleteRecordingBuilder(recordingIds);
	}
	
	public static class CancelRecordingBuilder extends RequestBuilder<Recording, Recording.Tokenizer, CancelRecordingBuilder> {
		
		public CancelRecordingBuilder(long id) {
			super(Recording.class, "recording", "cancel");
			params.add("id", id);
		}
		
		public void id(String multirequestToken) {
			params.add("id", multirequestToken);
		}
	}

	/**
	 * Cancel a previously requested recording. Cancel recording can be called for
	  recording in status Scheduled or Recording Only
	 * 
	 * @param id Recording identifier
	 */
    public static CancelRecordingBuilder cancel(long id)  {
		return new CancelRecordingBuilder(id);
	}
	
	public static class DeleteRecordingBuilder extends RequestBuilder<Recording, Recording.Tokenizer, DeleteRecordingBuilder> {
		
		public DeleteRecordingBuilder(long id) {
			super(Recording.class, "recording", "delete");
			params.add("id", id);
		}
		
		public void id(String multirequestToken) {
			params.add("id", multirequestToken);
		}
	}

	/**
	 * Delete one or more user recording(s). Delete recording can be called only for
	  recordings in status Recorded
	 * 
	 * @param id Recording identifier
	 */
    public static DeleteRecordingBuilder delete(long id)  {
		return new DeleteRecordingBuilder(id);
	}
	
	public static class GetRecordingBuilder extends RequestBuilder<Recording, Recording.Tokenizer, GetRecordingBuilder> {
		
		public GetRecordingBuilder(long id) {
			super(Recording.class, "recording", "get");
			params.add("id", id);
		}
		
		public void id(String multirequestToken) {
			params.add("id", multirequestToken);
		}
	}

	/**
	 * Returns recording object by internal identifier
	 * 
	 * @param id Recording identifier
	 */
    public static GetRecordingBuilder get(long id)  {
		return new GetRecordingBuilder(id);
	}
	
	public static class ImmediateRecordRecordingBuilder extends RequestBuilder<ImmediateRecording, ImmediateRecording.Tokenizer, ImmediateRecordRecordingBuilder> {
		
		public ImmediateRecordRecordingBuilder(long assetId, long epgChannelId, int endPadding) {
			super(ImmediateRecording.class, "recording", "immediateRecord");
			params.add("assetId", assetId);
			params.add("epgChannelId", epgChannelId);
			params.add("endPadding", endPadding);
		}
		
		public void assetId(String multirequestToken) {
			params.add("assetId", multirequestToken);
		}
		
		public void epgChannelId(String multirequestToken) {
			params.add("epgChannelId", multirequestToken);
		}
		
		public void endPadding(String multirequestToken) {
			params.add("endPadding", multirequestToken);
		}
	}

	public static ImmediateRecordRecordingBuilder immediateRecord(long assetId, long epgChannelId)  {
		return immediateRecord(assetId, epgChannelId, Integer.MIN_VALUE);
	}

	/**
	 * Immediate Record
	 * 
	 * @param assetId asset identifier
	 * @param epgChannelId epg channel identifier
	 * @param endPadding end padding offset
	 */
    public static ImmediateRecordRecordingBuilder immediateRecord(long assetId, long epgChannelId, int endPadding)  {
		return new ImmediateRecordRecordingBuilder(assetId, epgChannelId, endPadding);
	}
	
	public static class ListRecordingBuilder extends ListResponseRequestBuilder<Recording, Recording.Tokenizer, ListRecordingBuilder> {
		
		public ListRecordingBuilder(RecordingFilter filter, FilterPager pager) {
			super(Recording.class, "recording", "list");
			params.add("filter", filter);
			params.add("pager", pager);
		}
	}

	public static ListRecordingBuilder list()  {
		return list(null);
	}

	public static ListRecordingBuilder list(RecordingFilter filter)  {
		return list(filter, null);
	}

	/**
	 * Return a list of recordings for the household with optional filter by status and
	  KSQL.
	 * 
	 * @param filter Filter parameters for filtering out the result
	 * @param pager Page size and index
	 */
    public static ListRecordingBuilder list(RecordingFilter filter, FilterPager pager)  {
		return new ListRecordingBuilder(filter, pager);
	}
	
	public static class ProtectRecordingBuilder extends RequestBuilder<Recording, Recording.Tokenizer, ProtectRecordingBuilder> {
		
		public ProtectRecordingBuilder(long id) {
			super(Recording.class, "recording", "protect");
			params.add("id", id);
		}
		
		public void id(String multirequestToken) {
			params.add("id", multirequestToken);
		}
	}

	/**
	 * Deprecated, please use recording.update instead              Protects an
	  existing recording from the cleanup process for the defined protection period
	 * 
	 * @param id Recording identifier
	 */
    public static ProtectRecordingBuilder protect(long id)  {
		return new ProtectRecordingBuilder(id);
	}
	
	public static class StopRecordingBuilder extends RequestBuilder<Recording, Recording.Tokenizer, StopRecordingBuilder> {
		
		public StopRecordingBuilder(long assetId, long epgChannelId, long householdRecordingId) {
			super(Recording.class, "recording", "stop");
			params.add("assetId", assetId);
			params.add("epgChannelId", epgChannelId);
			params.add("householdRecordingId", householdRecordingId);
		}
		
		public void assetId(String multirequestToken) {
			params.add("assetId", multirequestToken);
		}
		
		public void epgChannelId(String multirequestToken) {
			params.add("epgChannelId", multirequestToken);
		}
		
		public void householdRecordingId(String multirequestToken) {
			params.add("householdRecordingId", multirequestToken);
		}
	}

	/**
	 * Stop ongoing household recording
	 * 
	 * @param assetId asset identifier
	 * @param epgChannelId epg channel identifier
	 * @param householdRecordingId household recording identifier
	 */
    public static StopRecordingBuilder stop(long assetId, long epgChannelId, long householdRecordingId)  {
		return new StopRecordingBuilder(assetId, epgChannelId, householdRecordingId);
	}
	
	public static class UpdateRecordingBuilder extends RequestBuilder<Recording, Recording.Tokenizer, UpdateRecordingBuilder> {
		
		public UpdateRecordingBuilder(long id, Recording recording) {
			super(Recording.class, "recording", "update");
			params.add("id", id);
			params.add("recording", recording);
		}
		
		public void id(String multirequestToken) {
			params.add("id", multirequestToken);
		}
	}

	/**
	 * Update an existing recording with is protected field
	 * 
	 * @param id recording identifier
	 * @param recording recording to update
	 */
    public static UpdateRecordingBuilder update(long id, Recording recording)  {
		return new UpdateRecordingBuilder(id, recording);
	}
}
