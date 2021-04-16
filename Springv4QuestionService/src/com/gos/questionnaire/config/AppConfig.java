package com.gos.questionnaire.config;

import java.util.Properties;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.JpaVendorAdapter;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.EclipseLinkJpaVendorAdapter;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.JstlView;
import org.springframework.web.servlet.view.UrlBasedViewResolver;

@Configuration
@EnableTransactionManagement
@EnableWebMvc
@ComponentScan(basePackages = {"com.gos.questionnaire"})
@EnableJpaRepositories(basePackages="com.gos.questionnaire.repositories")
public class AppConfig {
	
	@Bean
	   public LocalContainerEntityManagerFactoryBean entityManagerFactory() {		 
		 String jndiName = "jdbc/OFSAAAIINFO";		 
		 LocalContainerEntityManagerFactoryBean em = new LocalContainerEntityManagerFactoryBean();
		 Properties properties = new Properties();
		 properties.put("eclipselink.persistencexml", "../classes/META-INF/GRCpersistence.xml");
		 properties.put("javax.persistence.nonJtaDataSource" , "java:comp/env/"+jndiName);
		 properties.put("eclipselink.weaving" , "false");// to resolve Cannot apply class transformer without LoadTimeWeaver specified
		 properties.put("eclipselink.target-database" , "Oracle");// to resolve Cannot apply class transformer without LoadTimeWeaver specified
		 JpaVendorAdapter vendorAdapter = new EclipseLinkJpaVendorAdapter();
		 
		 em.setJpaProperties(properties);
		 em.setPackagesToScan(new String[] {"com.gos.questionnaire.beans"});
		 em.setJpaVendorAdapter(vendorAdapter);
		 em.setPersistenceUnitName("AAI_QUESTIONNAIRE");
		 return em;
	   }
	
	@Bean
	public JpaVendorAdapter getJpaVendorAdapter() {
	    JpaVendorAdapter adapter = new EclipseLinkJpaVendorAdapter();
	    return adapter;
	}

   
	@Bean(name="transactionManager")
   public PlatformTransactionManager transactionManager(){
      JpaTransactionManager transactionManager = new JpaTransactionManager();
      transactionManager.setEntityManagerFactory(entityManagerFactory().getObject() );
      return transactionManager;
   }
	
	@Bean
    public UrlBasedViewResolver setupViewResolver() {
        UrlBasedViewResolver resolver = new UrlBasedViewResolver();
        resolver.setPrefix("/questionUi/");
        resolver.setSuffix(".jsp");
        resolver.setViewClass(JstlView.class);
        return resolver;
    }

}
