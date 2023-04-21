package ua.com.shop.shop_admin_np_371_372.configuration;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class MvcConfig implements WebMvcConfigurer {

    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
       // registry.addViewController("/login").setViewName("login");
        registry.addViewController("/info").setViewName("info");
        registry.addViewController("/manager").setViewName("manager");
    }
}
