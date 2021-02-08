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

import com.kaltura.client.types.Permission;
import com.kaltura.client.types.PermissionFilter;
import com.kaltura.client.utils.request.ListResponseRequestBuilder;
import com.kaltura.client.utils.request.NullRequestBuilder;
import com.kaltura.client.utils.request.RequestBuilder;

/**
 * This class was generated using exec.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

public class PermissionService {
	
	public static class AddPermissionBuilder extends RequestBuilder<Permission, Permission.Tokenizer, AddPermissionBuilder> {
		
		public AddPermissionBuilder(Permission permission) {
			super(Permission.class, "permission", "add");
			params.add("permission", permission);
		}
	}

	/**
	 * Adds new permission
	 * 
	 * @param permission Permission to insert
	 */
    public static AddPermissionBuilder add(Permission permission)  {
		return new AddPermissionBuilder(permission);
	}
	
	public static class AddPermissionItemPermissionBuilder extends NullRequestBuilder {
		
		public AddPermissionItemPermissionBuilder(long permissionId, long permissionItemId) {
			super("permission", "addPermissionItem");
			params.add("permissionId", permissionId);
			params.add("permissionItemId", permissionItemId);
		}
		
		public void permissionId(String multirequestToken) {
			params.add("permissionId", multirequestToken);
		}
		
		public void permissionItemId(String multirequestToken) {
			params.add("permissionItemId", multirequestToken);
		}
	}

	/**
	 * Adds permission item to permission
	 * 
	 * @param permissionId Permission ID to add to
	 * @param permissionItemId Permission item ID to add
	 */
    public static AddPermissionItemPermissionBuilder addPermissionItem(long permissionId, long permissionItemId)  {
		return new AddPermissionItemPermissionBuilder(permissionId, permissionItemId);
	}
	
	public static class DeletePermissionBuilder extends NullRequestBuilder {
		
		public DeletePermissionBuilder(long id) {
			super("permission", "delete");
			params.add("id", id);
		}
		
		public void id(String multirequestToken) {
			params.add("id", multirequestToken);
		}
	}

	/**
	 * Deletes an existing permission
	 * 
	 * @param id Permission ID to delete
	 */
    public static DeletePermissionBuilder delete(long id)  {
		return new DeletePermissionBuilder(id);
	}
	
	public static class GetCurrentPermissionsPermissionBuilder extends RequestBuilder<String, String, GetCurrentPermissionsPermissionBuilder> {
		
		public GetCurrentPermissionsPermissionBuilder() {
			super(String.class, "permission", "getCurrentPermissions");
		}
	}

	/**
	 * Returns permission names as comma separated string
	 */
    public static GetCurrentPermissionsPermissionBuilder getCurrentPermissions()  {
		return new GetCurrentPermissionsPermissionBuilder();
	}
	
	public static class ListPermissionBuilder extends ListResponseRequestBuilder<Permission, Permission.Tokenizer, ListPermissionBuilder> {
		
		public ListPermissionBuilder(PermissionFilter filter) {
			super(Permission.class, "permission", "list");
			params.add("filter", filter);
		}
	}

	public static ListPermissionBuilder list()  {
		return list(null);
	}

	/**
	 * Retrieving permissions by identifiers, if filter is empty, returns all partner
	  permissions
	 * 
	 * @param filter Filter for permissions
	 */
    public static ListPermissionBuilder list(PermissionFilter filter)  {
		return new ListPermissionBuilder(filter);
	}
	
	public static class RemovePermissionItemPermissionBuilder extends NullRequestBuilder {
		
		public RemovePermissionItemPermissionBuilder(long permissionId, long permissionItemId) {
			super("permission", "removePermissionItem");
			params.add("permissionId", permissionId);
			params.add("permissionItemId", permissionItemId);
		}
		
		public void permissionId(String multirequestToken) {
			params.add("permissionId", multirequestToken);
		}
		
		public void permissionItemId(String multirequestToken) {
			params.add("permissionItemId", multirequestToken);
		}
	}

	/**
	 * Removes permission item from permission
	 * 
	 * @param permissionId Permission ID to remove from
	 * @param permissionItemId Permission item ID to remove
	 */
    public static RemovePermissionItemPermissionBuilder removePermissionItem(long permissionId, long permissionItemId)  {
		return new RemovePermissionItemPermissionBuilder(permissionId, permissionItemId);
	}
}
