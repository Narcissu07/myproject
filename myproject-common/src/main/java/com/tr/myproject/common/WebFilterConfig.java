package com.tr.myproject.common;

/**
 * Created by pj on 2019/10/22.
 */

    import org.springframework.context.annotation.Configuration;
    import org.springframework.boot.web.servlet.FilterRegistrationBean;
    import org.springframework.context.annotation.Bean;
    import org.springframework.context.annotation.Configuration;

    import java.util.ArrayList;
    import java.util.List;

/**
 * Web配置
 *
 * @author hsj
 * @Configuration 这个注解声明这个类是配置类
 * @create 2017-11-11 18:00
 **/

//@Configuration
public class WebFilterConfig {
    @Bean
    public FilterRegistrationBean timeFilter() {
        FilterRegistrationBean registrationBean = new FilterRegistrationBean();
        TimerFilter timerFilter = new TimerFilter();
        registrationBean.setFilter(timerFilter);
        List<String> urls = new ArrayList<>();
        urls.add("/*");
        registrationBean.setUrlPatterns(urls);
        return registrationBean;
    }
}
