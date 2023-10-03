package com.sud.hibernate_ehcache_demo.util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class LocalConfiguration {

	static public Session getLocalSessionAnnotation() {
		Configuration conf = new Configuration();
		conf.configure("hibernate-annotation.cfg.xml");

		SessionFactory factory = conf.buildSessionFactory();
		return factory.openSession();
	}
}
