package com.tr.myproject.common;

/**
 * Created by pj on 2019/10/22.
 */

import org.springframework.stereotype.Component;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Date;

/**
 * this is spring interceptor
 *
 * @author hsj
 * @create 2017-11-11 18:16
 **/

public class TimeInterceptor implements HandlerInterceptor {

    /**
     * 控制器方法处理之前
     *
     * @param httpServletRequest
     * @param httpServletResponse
     * @param handler
     * @return
     * @throws Exception
     */
    @Override
    public boolean preHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object handler) throws Exception {
        System.out.println("preHandle");
        System.out.println(((HandlerMethod) handler).getBean().getClass().getName());
        System.out.println(((HandlerMethod) handler).getMethod().getName());
        httpServletRequest.setAttribute("startTime", new Date().getTime());
        return true;
    }

    /**
     * 控制器方法处理之后
     * 控制器方法调用不抛异常调用
     *
     * @param httpServletRequest
     * @param httpServletResponse
     * @param
     * @param modelAndView
     * @throws Exception
     */
    @Override
    public void postHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object handler, ModelAndView modelAndView) throws Exception {
        System.out.println("postHandle");
        Long startTime = (Long) httpServletRequest.getAttribute("startTime");
        System.out.println("time interceptor 耗时" + (new Date().getTime() - startTime));
    }

    /**
     * 控制器方法抛不抛异常都会被调用
     *
     * @param httpServletRequest
     * @param httpServletResponse
     * @param o
     * @param e
     * @throws Exception
     */
    @Override
    public void afterCompletion(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) throws Exception {
        System.out.println("afterCompletion");
        Long startTime = (Long) httpServletRequest.getAttribute("startTime");
        System.out.println("time interceptor 耗时" + (new Date().getTime() - startTime));
        System.out.println("ex is" + e);
    }
}