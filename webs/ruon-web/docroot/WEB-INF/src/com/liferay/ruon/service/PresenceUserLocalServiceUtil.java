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
 * <a href="PresenceUserLocalServiceUtil.java.html"><b><i>View Source</i></b></a>
 *
 * @author Brian Wing Shun Chan
 *
 */
public class PresenceUserLocalServiceUtil {
	public static com.liferay.ruon.model.PresenceUser addPresenceUser(
		com.liferay.ruon.model.PresenceUser presenceUser)
		throws com.liferay.portal.SystemException {
		PresenceUserLocalService presenceUserLocalService = PresenceUserLocalServiceFactory.getService();

		return presenceUserLocalService.addPresenceUser(presenceUser);
	}

	public static void deletePresenceUser(long presenceUserId)
		throws com.liferay.portal.PortalException,
			com.liferay.portal.SystemException {
		PresenceUserLocalService presenceUserLocalService = PresenceUserLocalServiceFactory.getService();

		presenceUserLocalService.deletePresenceUser(presenceUserId);
	}

	public static void deletePresenceUser(
		com.liferay.ruon.model.PresenceUser presenceUser)
		throws com.liferay.portal.SystemException {
		PresenceUserLocalService presenceUserLocalService = PresenceUserLocalServiceFactory.getService();

		presenceUserLocalService.deletePresenceUser(presenceUser);
	}

	public static java.util.List<Object> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.SystemException {
		PresenceUserLocalService presenceUserLocalService = PresenceUserLocalServiceFactory.getService();

		return presenceUserLocalService.dynamicQuery(dynamicQuery);
	}

	public static java.util.List<Object> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) throws com.liferay.portal.SystemException {
		PresenceUserLocalService presenceUserLocalService = PresenceUserLocalServiceFactory.getService();

		return presenceUserLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	public static com.liferay.ruon.model.PresenceUser getPresenceUser(
		long presenceUserId)
		throws com.liferay.portal.PortalException,
			com.liferay.portal.SystemException {
		PresenceUserLocalService presenceUserLocalService = PresenceUserLocalServiceFactory.getService();

		return presenceUserLocalService.getPresenceUser(presenceUserId);
	}

	public static java.util.List<com.liferay.ruon.model.PresenceUser> getPresenceUsers(
		int start, int end) throws com.liferay.portal.SystemException {
		PresenceUserLocalService presenceUserLocalService = PresenceUserLocalServiceFactory.getService();

		return presenceUserLocalService.getPresenceUsers(start, end);
	}

	public static int getPresenceUsersCount()
		throws com.liferay.portal.SystemException {
		PresenceUserLocalService presenceUserLocalService = PresenceUserLocalServiceFactory.getService();

		return presenceUserLocalService.getPresenceUsersCount();
	}

	public static com.liferay.ruon.model.PresenceUser updatePresenceUser(
		com.liferay.ruon.model.PresenceUser presenceUser)
		throws com.liferay.portal.SystemException {
		PresenceUserLocalService presenceUserLocalService = PresenceUserLocalServiceFactory.getService();

		return presenceUserLocalService.updatePresenceUser(presenceUser);
	}

	public static java.util.List<com.liferay.ruon.model.PresenceUser> getAllUsers()
		throws com.liferay.ruon.util.RUONException {
		PresenceUserLocalService presenceUserLocalService = PresenceUserLocalServiceFactory.getService();

		return presenceUserLocalService.getAllUsers();
	}
}