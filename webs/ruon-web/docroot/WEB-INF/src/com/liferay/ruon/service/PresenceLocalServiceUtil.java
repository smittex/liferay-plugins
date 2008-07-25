/**
 * Copyright (c) 2000-2008 Liferay, Inc. All rights reserved.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

package com.liferay.ruon.service;

/**
 * <a href="PresenceLocalServiceUtil.java.html"><b><i>View Source</i></b></a>
 *
 * @author Brian Wing Shun Chan
 *
 */
public class PresenceLocalServiceUtil {
	public static java.util.List<com.liferay.ruon.model.PresenceUser> getListOfAllUsers()
		throws com.liferay.ruon.util.RUONException {
		PresenceLocalService presenceLocalService = PresenceLocalServiceFactory.getService();

		return presenceLocalService.getListOfAllUsers();
	}

	public static java.lang.String getPresenceStatusOfUser(
		java.lang.Long userId) throws com.liferay.ruon.util.RUONException {
		PresenceLocalService presenceLocalService = PresenceLocalServiceFactory.getService();

		return presenceLocalService.getPresenceStatusOfUser(userId);
	}

	public static boolean isUserOnline(java.lang.Long userId)
		throws com.liferay.ruon.util.RUONException {
		PresenceLocalService presenceLocalService = PresenceLocalServiceFactory.getService();

		return presenceLocalService.isUserOnline(userId);
	}

	public static void makeAllUsersOffline()
		throws com.liferay.ruon.util.RUONException {
		PresenceLocalService presenceLocalService = PresenceLocalServiceFactory.getService();

		presenceLocalService.makeAllUsersOffline();
	}

	public static void setPresenceStatusOfUser(java.lang.Long userId,
		java.lang.Long status) throws com.liferay.ruon.util.RUONException {
		PresenceLocalService presenceLocalService = PresenceLocalServiceFactory.getService();

		presenceLocalService.setPresenceStatusOfUser(userId, status);
	}
}