/*
 * ============================================================================
 *                   GNU Lesser General Public License
 * ============================================================================
 *
 * JasperReports - Free Java report-generating library.
 * Copyright (C) 2001-2005 JasperSoft Corporation http://www.jaspersoft.com
 * 
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 2.1 of the License, or (at your option) any later version.
 * 
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 * 
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA  02111-1307, USA.
 * 
 * JasperSoft Corporation
 * 185, Berry Street, Suite 6200
 * San Francisco CA 94107
 * http://www.jaspersoft.com
 */
package net.sf.jasperreports.engine.xml;

import org.xml.sax.Attributes;

import net.sf.jasperreports.engine.design.JRDesignParameter;


/**
 * @author Teodor Danciu (teodord@users.sourceforge.net)
 * @version $Id$
 */
public class JRParameterFactory extends JRBaseFactory
{


	/**
	 *
	 */
	private static final String ATTRIBUTE_name = "name";
	private static final String ATTRIBUTE_class = "class";
	private static final String ATTRIBUTE_isForPrompting = "isForPrompting";


	/**
	 *
	 */
	public Object createObject(Attributes atts)
	{
		JRDesignParameter parameter = new JRDesignParameter();
		
		parameter.setName(atts.getValue(ATTRIBUTE_name));
		
		if (atts.getValue(ATTRIBUTE_class) != null)
		{
			parameter.setValueClassName(atts.getValue(ATTRIBUTE_class));
		}

		String isForPrompting = atts.getValue(ATTRIBUTE_isForPrompting);
		if (isForPrompting != null && isForPrompting.length() > 0)
		{
			parameter.setForPrompting(Boolean.valueOf(isForPrompting).booleanValue());
		}

		return parameter;
	}
	

}
