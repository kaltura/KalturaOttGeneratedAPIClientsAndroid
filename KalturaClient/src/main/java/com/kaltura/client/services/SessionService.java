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
import com.kaltura.client.types.LoginSession;
import com.kaltura.client.types.Session;
import com.kaltura.client.utils.request.RequestBuilder;

/**
 * This class was generated using clients-generator\exec.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

public class SessionService {

    public static RequestBuilder<Session> get()  {
        return get(null);
    }

	/**  Parses KS  */
    public static RequestBuilder<Session> get(String session)  {
        Params kparams = new Params();
        kparams.add("session", session);

        return new RequestBuilder<Session>(Session.class, "session", "get", kparams);
    }

	/**  Revokes all the sessions (KS) of a given user  */
    public static RequestBuilder<Boolean> revoke()  {
        Params kparams = new Params();

        return new RequestBuilder<Boolean>(Boolean.class, "session", "revoke", kparams);
    }

	/**  Switching the user in the session by generating a new session for a new user
	  within the same household  */
    public static RequestBuilder<LoginSession> switchUser(String userIdToSwitch)  {
        Params kparams = new Params();
        kparams.add("userIdToSwitch", userIdToSwitch);

        return new RequestBuilder<LoginSession>(LoginSession.class, "session", "switchUser", kparams);
    }
}
