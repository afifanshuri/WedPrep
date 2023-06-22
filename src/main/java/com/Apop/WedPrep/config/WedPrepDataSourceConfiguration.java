package com.Apop.WedPrep.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties(prefix="spring.datasource")
public class WedPrepDataSourceConfiguration {
	
	

}
