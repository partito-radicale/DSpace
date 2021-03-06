/**
 * The contents of this file are subject to the license and copyright
 * detailed in the LICENSE and NOTICE files at the root of the source
 * tree and available online at
 *
 * http://www.dspace.org/license/
 */
package org.dspace.app.rest.model;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * Methods to implement to make a REST resource addressable
 * 
 * @author Andrea Bollini (andrea.bollini at 4science.it)
 *
 */
public interface RestModel extends Serializable {
	public static final String CORE = "core";
	public static final String EPERSON = "eperson";
	public static final String DISCOVER = "discover";
	
	@JsonIgnore
	public String getCategory();
	
	public String getType();

	@JsonIgnore
	public Class getController();
}
