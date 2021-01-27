package com.bjsxt.wsk.springbootweb.config;

import com.bjsxt.wsk.springbootweb.Filtert.FirstFilter;
import com.bjsxt.wsk.springbootweb.Filtert.SecondFileter;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FilteConfig {
    @Bean
    public FilterRegistrationBean getFilterRegistrationBean() {
        FilterRegistrationBean bean = new FilterRegistrationBean(new SecondFileter());
        bean.addUrlPatterns("/second");
        return bean;
    }
}
