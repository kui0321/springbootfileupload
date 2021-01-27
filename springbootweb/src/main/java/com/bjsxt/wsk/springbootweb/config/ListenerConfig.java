package com.bjsxt.wsk.springbootweb.config;

import com.bjsxt.wsk.springbootweb.listener.SecondListener;
import org.springframework.boot.web.servlet.ServletListenerRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ListenerConfig {
    @Bean
    public ServletListenerRegistrationBean getServletRegistrationBean() {
        ServletListenerRegistrationBean bean = new ServletListenerRegistrationBean(new SecondListener());
        return bean;
    }
}
