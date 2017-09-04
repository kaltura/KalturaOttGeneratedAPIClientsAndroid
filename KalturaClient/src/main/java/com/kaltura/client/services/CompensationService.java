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

import com.kaltura.client.Params;
import com.kaltura.client.types.Compensation;
import com.kaltura.client.utils.request.NullRequestBuilder;
import com.kaltura.client.utils.request.RequestBuilder;

/**
 * This class was generated using clients-generator\exec.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

public class CompensationService {

	/**  Adds a new compensation for a household for a given number of iterations of a
	  subscription renewal for a fixed amount / percentage of the renewal price.  */
    public static RequestBuilder<Compensation> add(Compensation compensation)  {
        Params kparams = new Params();
        kparams.add("compensation", compensation);

        return new RequestBuilder<Compensation>(Compensation.class, "compensation", "add", kparams);
    }

	/**  Delete a compensation by identifier  */
    public static RequestBuilder<Void> delete(long id)  {
        Params kparams = new Params();
        kparams.add("id", id);

        return new NullRequestBuilder("compensation", "delete", kparams);
    }

	/**  Get a compensation by identifier  */
    public static RequestBuilder<Compensation> get(long id)  {
        Params kparams = new Params();
        kparams.add("id", id);

        return new RequestBuilder<Compensation>(Compensation.class, "compensation", "get", kparams);
    }
}
