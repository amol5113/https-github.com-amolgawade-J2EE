package com.cdac.springsetterdiapp.comp;

import java.util.List;
import java.util.Map;
import java.util.Properties;

public class MyColl {
	private List<String> annotatedClasses;
	private Map<String, String> jdbcProperties;
	private Properties hibernateProperties;
	public MyColl() {
		super();
		// TODO Auto-generated constructor stub
	}
	public List<String> getAnnotatedClasses() {
		return annotatedClasses;
	}
	public void setAnnotatedClasses(List<String> annotatedClasses) {
		this.annotatedClasses = annotatedClasses;
	}
	public Map<String, String> getJdbcProperties() {
		return jdbcProperties;
	}
	public void setJdbcProperties(Map<String, String> jdbcProperties) {
		this.jdbcProperties = jdbcProperties;
	}
	public Properties getHibernateProperties() {
		return hibernateProperties;
	}
	public void setHibernateProperties(Properties hibernateProperties) {
		this.hibernateProperties = hibernateProperties;
	}
	
}
