package com.cjc.config;

import java.util.Properties;

import org.hibernate.cfg.Environment;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.stereotype.Controller;
@Controller
public class HibernateConfig {

	

		@Value("${db.driver}")
		private String Driver;
		@Value("${db.url}")
		private String URL;
		@Value("${db.username}")
		private String USERNAME;
		@Value("${db.password}")
		private String PASSWORD;
		@Value("${hb.dialect}")
		private String DIALECT;
		@Value("${hb.hbm2ddl}")
		private String HBM2DDL;
		@Value("${hb.show_sql}")
		private String SHOW_SQL;
		@Value("${hb.packageToScan}")
		private String packageToScan;
		
		
		@Bean
		public DriverManagerDataSource datasource()
		{
			DriverManagerDataSource d= new DriverManagerDataSource();
			d.setDriverClassName(Driver);
			d.setUrl(URL);
			d.setUsername(USERNAME);
			d.setPassword(PASSWORD);
			
			return d;
		}
		
		
		@Bean
		public LocalSessionFactoryBean sf()
		{
			LocalSessionFactoryBean sf= new LocalSessionFactoryBean();
			sf.setDataSource(datasource());
			
			Properties p= new Properties();
			p.put("hibernate.dialect", DIALECT);
			p.put(Environment.HBM2DDL_AUTO,HBM2DDL);
			p.put(Environment.SHOW_SQL,SHOW_SQL);
			
			sf.setHibernateProperties(p);
			sf.setPackagesToScan(packageToScan);
			
			return sf;
		}

	}




