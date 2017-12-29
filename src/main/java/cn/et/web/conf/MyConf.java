package cn.et.web.conf;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
public class MyConf {
	
	@Value("${url}")
	private String url;
	
	@Value("${username1}")
	private String userName;
	
	@Value("${password2}")
	private String password;
	
	@Value("${driverClass}")
	private String driverClassName;
	
	@Bean
	public JdbcTemplate jdbcTemplate(DataSource dataSource){
		return new JdbcTemplate(dataSource);
	}
	
	@Bean
	public DataSource dataSource(){
		DriverManagerDataSource dmds = new DriverManagerDataSource();
		dmds.setUrl(url);
		dmds.setUsername(userName);
		dmds.setPassword(password);
		dmds.setDriverClassName(driverClassName);
		return dmds;
	}
}
