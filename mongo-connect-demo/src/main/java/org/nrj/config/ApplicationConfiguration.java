package org.nrj.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

@Configuration
@PropertySource("classpath:config.properties")
public class ApplicationConfiguration {

	@Autowired
	private Environment env;
	
	public String getEnvProperty(String key) {
		return env.getProperty(key);
	}
	
	
	/*@Value("${org.nrj.welcome.url}")
	private String gMapReportUrl;

	

	@Bean
	public static PropertySourcesPlaceholderConfigurer propertyConfigInDev() {
		return new PropertySourcesPlaceholderConfigurer();
	}

	public String printValues(){
		System.out.println("ENV : " + env.getProperty("org.nrj.welcome.url"));
		System.out.println("PROPERTY : " + gMapReportUrl);

		return "ENV : " + env.getProperty("org.nrj.welcome.url") + "\nPROPERTY : " + gMapReportUrl;
	}*/

}