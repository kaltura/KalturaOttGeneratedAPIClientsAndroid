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
import com.kaltura.client.enums.NotificationType;
import com.kaltura.client.types.PushMessage;
import com.kaltura.client.types.RegistryResponse;
import com.kaltura.client.utils.request.RequestBuilder;

/**
 * This class was generated using clients-generator\exec.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

public class NotificationService {

	/**  TBD  */
    public static RequestBuilder<RegistryResponse> register(String identifier, NotificationType type)  {
        Params kparams = new Params();
        kparams.add("identifier", identifier);
        kparams.add("type", type);

        return new RequestBuilder<RegistryResponse>(RegistryResponse.class, "notification", "register", kparams);
    }

	/**  Sends push notification to user devices  */
    public static RequestBuilder<Boolean> sendPush(int userId, PushMessage pushMessage)  {
        Params kparams = new Params();
        kparams.add("userId", userId);
        kparams.add("pushMessage", pushMessage);

        return new RequestBuilder<Boolean>(Boolean.class, "notification", "sendPush", kparams);
    }

	/**  Registers the device push token to the push service  */
    public static RequestBuilder<Boolean> setDevicePushToken(String pushToken)  {
        Params kparams = new Params();
        kparams.add("pushToken", pushToken);

        return new RequestBuilder<Boolean>(Boolean.class, "notification", "setDevicePushToken", kparams);
    }
}
