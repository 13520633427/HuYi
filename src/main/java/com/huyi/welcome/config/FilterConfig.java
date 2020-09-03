package com.huyi.welcome.config;

import net.bull.javamelody.MonitoringFilter;
import net.bull.javamelody.SessionListener;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletListenerRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;

@Configuration
public class FilterConfig {

    /**
     * 可以通过访问  ip+端口:/monitoring  来查看项目使用情况
     */

    /**
     * 配置javaMelody
     */
    @Bean
    @Order
    public FilterRegistrationBean<MonitoringFilter> monitoringFilter(){
        FilterRegistrationBean<MonitoringFilter> monitoringFilterFilterRegistrationBean = new FilterRegistrationBean<>();
        monitoringFilterFilterRegistrationBean.setFilter(new MonitoringFilter());
        monitoringFilterFilterRegistrationBean.addUrlPatterns("/*");
        monitoringFilterFilterRegistrationBean.setName("monitoring");
        return monitoringFilterFilterRegistrationBean;
    }

    /**
     * 配置javaMelody的SessionListener
     */
    @Bean
    public ServletListenerRegistrationBean<SessionListener> sessionListenerServletListenerRegistrationBean(){
        ServletListenerRegistrationBean<SessionListener> registrationBean = new ServletListenerRegistrationBean<>();
        registrationBean.setListener(new SessionListener());
        return registrationBean;
    }

}
