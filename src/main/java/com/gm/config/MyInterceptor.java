package com.gm.config;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import static com.gm.utils.MyTimeUtils.getTime;

@Configuration
@Slf4j
public class MyInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        String username = (String) request.getSession().getAttribute("username");
        if (null == username) {
            log.info("{} 未登录 {} 请求被拦截", getTime(), request.getServletPath());
            return false;
        }else {
            log.info("{} 用户 {}  {} 请求通过", getTime(), username, request.getServletPath());
            return true;
        }
    }
}
