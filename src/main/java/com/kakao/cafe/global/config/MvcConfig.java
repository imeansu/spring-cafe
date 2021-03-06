package com.kakao.cafe.global.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.core.Ordered;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class MvcConfig implements WebMvcConfigurer {
    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        WebMvcConfigurer.super.addViewControllers(registry);
        registry.setOrder(Ordered.HIGHEST_PRECEDENCE);

        registry.addViewController("/users/joinForm").setViewName("user/joinForm");
        registry.addViewController("/articles/form").setViewName("article/form");
        registry.addViewController("/users/login/form").setViewName("user/login");
        registry.addViewController("/users/login/form/failed").setViewName("user/login_failed");
    }
}
