package com.gm.config;

import com.gm.dao.UserDao;
import com.gm.enums.Role;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import static com.gm.utils.MyTimeUtils.getTime;

@Configuration
@Slf4j
public class MyInterceptor implements HandlerInterceptor {
    @Resource
    private UserDao userDao;

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        String username = (String) request.getSession().getAttribute("username");
        String requestServletPath = request.getServletPath();
        String role = userDao.selectUserByUsername(username).getRole();
        if (null == username) {
            log.info("{} 未登录 {} 请求被拦截", getTime(), request.getServletPath());
            return false;
        } else {
            if (Role.STUDENT == role) {
                if (requestServletPath.contains("/student/")) {
                    log.info("{} 用户 {} {} {} 请求通过", getTime(), username, role, request.getServletPath());
                    return true;
                }else {
                    return false;
                }
            } else if (Role.TEACHER == role) {
                log.info("{} 用户 {} {} {} 请求通过", getTime(), username, role, request.getServletPath());
                return true;
            } else if (Role.ADMIN == role) {
                log.info("{} 用户 {} {} {} 请求通过", getTime(), username, role, request.getServletPath());
                return true;
            } else {
                return false;
            }
        }
    }
}
