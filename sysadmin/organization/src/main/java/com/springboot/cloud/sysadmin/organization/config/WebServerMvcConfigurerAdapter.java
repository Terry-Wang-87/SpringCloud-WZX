package com.springboot.cloud.sysadmin.organization.config;

import com.springboot.cloud.common.web.interceptor.UserInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/*
2. WebMvcConfigurer接口

	2.1 addInterceptors：拦截器
	
	2.2 addViewControllers：页面跳转
	
	2.3 addResourceHandlers：静态资源
	
	2.4 configureDefaultServletHandling：默认静态资源处理器
	
	2.5 configureViewResolvers：视图解析器
	
	2.6 configureContentNegotiation：配置内容裁决的一些参数
	
	2.7 addCorsMappings：跨域
	
	2.8 configureMessageConverters：信息转换器
*/

@Configuration
public class WebServerMvcConfigurerAdapter implements WebMvcConfigurer {

    @Bean
    public HandlerInterceptor userInterceptor() {
        return new UserInterceptor();
    }

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(userInterceptor());
    }
}
