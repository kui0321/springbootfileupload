package com.bjsxt.wsk.springbootjdbc.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import javax.sql.DataSource;

//@Configuration
//@PropertySource("classpath:/jdbc.properties")
//@EnableConfigurationProperties(JdbcProperties.class)

public class JdbcConfigration {


//    @Value("${jdbc.driverClassName}")
//    private String driverClassName;
//    @Value("${jdbc.url}")
//    private String url;
//    @Value("${jdbc.username}")
//    private String username;
//    @Value("${jdbc.password}")
//    private String password;

  //  @Bean
//    @ConfigurationProperties(prefix = "jdbc")
    public DataSource getDataSource(JdbcProperties jdbcProperties){
        DruidDataSource source = new DruidDataSource();
        source.setPassword(jdbcProperties.getPassword());
        source.setUsername(jdbcProperties.getUsername());
        source.setUrl(jdbcProperties.getUrl());
        source.setDriverClassName(jdbcProperties.getDriverClassName());
        return source;
    }
}
