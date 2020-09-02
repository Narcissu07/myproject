package com.tr.myproject.common; /**
 * Created by pj on 2019/10/22.
 */


import javax.servlet.*;
import java.io.IOException;
import java.util.Date;


public class TimerFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("Time  filter init");
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("Time filter start");
        long startTime = new Date().getTime();
        filterChain.doFilter(servletRequest, servletResponse);
        System.out.println("time filter:"+(new Date().getTime()-startTime));
        System.out.println("time filter finish");
    }

    @Override
    public void destroy() {
        System.out.println("Time filter destroy");
    }
}
