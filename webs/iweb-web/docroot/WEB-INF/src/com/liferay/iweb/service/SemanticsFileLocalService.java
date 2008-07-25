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

package com.liferay.iweb.service;

/**
 * <a href="SemanticsFileLocalService.java.html"><b><i>View Source</i></b></a>
 *
 * @author Brian Wing Shun Chan
 *
 */
public interface SemanticsFileLocalService {
	public com.liferay.iweb.model.SemanticsFile addSemanticsFile(
		com.liferay.iweb.model.SemanticsFile semanticsFile)
		throws com.liferay.portal.SystemException;

	public void deleteSemanticsFile(java.lang.String semanticsURI)
		throws com.liferay.portal.SystemException,
			com.liferay.portal.PortalException;

	public void deleteSemanticsFile(
		com.liferay.iweb.model.SemanticsFile semanticsFile)
		throws com.liferay.portal.SystemException;

	public java.util.List<Object> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.SystemException;

	public java.util.List<Object> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) throws com.liferay.portal.SystemException;

	public com.liferay.iweb.model.SemanticsFile getSemanticsFile(
		java.lang.String semanticsURI)
		throws com.liferay.portal.SystemException,
			com.liferay.portal.PortalException;

	public java.util.List<com.liferay.iweb.model.SemanticsFile> getSemanticsFiles(
		int start, int end) throws com.liferay.portal.SystemException;

	public int getSemanticsFilesCount()
		throws com.liferay.portal.SystemException;

	public com.liferay.iweb.model.SemanticsFile updateSemanticsFile(
		com.liferay.iweb.model.SemanticsFile semanticsFile)
		throws com.liferay.portal.SystemException;

	public void createNewSemanticsFile() throws com.liferay.iweb.IWebException;

	public void deleteSemanticsFile() throws com.liferay.iweb.IWebException;

	public java.util.Set<com.liferay.iweb.model.SemanticsFile> getAllSemanticElements(
		java.util.Set<com.liferay.iweb.model.SemanticsFile> semanticsFile)
		throws com.liferay.iweb.IWebException;

	public java.util.Set<com.liferay.iweb.model.SemanticsFile> getAvailablePublicSemanticsFiles()
		throws com.liferay.iweb.IWebException;

	public java.util.Set<com.liferay.iweb.model.SemanticsElement> getRelatedSemanticsElements(
		java.util.Set<com.liferay.iweb.model.SemanticsElement> elements,
		boolean reason) throws com.liferay.iweb.IWebException;

	public java.util.Set<com.liferay.iweb.model.SemanticsFile> listAllSemantics()
		throws com.liferay.iweb.IWebException;

	public com.liferay.iweb.model.SemanticsFile loadSemanticsFile(
		java.lang.String uri, java.lang.String name)
		throws com.liferay.iweb.IWebException;

	public void loadSemanticsReasoner() throws com.liferay.iweb.IWebException;

	public void removeCachedSemanticsFile(java.lang.String semanticsURI)
		throws com.liferay.iweb.IWebException;

	public void updateSemanticsFile(java.lang.String uri, java.lang.String name)
		throws com.liferay.iweb.IWebException;

	public boolean validateSemantics(
		com.liferay.iweb.model.SemanticsFile semanticsFile)
		throws com.liferay.iweb.IWebException;
}