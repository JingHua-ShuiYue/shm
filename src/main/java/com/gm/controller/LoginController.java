package com.gm.controller;

import com.gm.R.R;
import com.gm.pojo.User;
import com.gm.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import static com.gm.utils.MyTimeUtils.getTime;

@Slf4j
@Controller
public class LoginController {

    @Resource
    private UserService userService;

    @PostMapping("/login")
    @ResponseBody
    public R<String> login(HttpServletRequest request, @RequestBody User user) {
        User userInfo = userService.LoginVar(user);
        if (null == userInfo) {
            //账号或者密码错误
            return R.error("您输入的账号或者密码错误");
        } else {
            request.getSession().setAttribute("username", user.getUsername());
            request.getSession().setAttribute("role", userInfo.getRole());
            log.info("用户 {}({}) 于 {} 登录成功", userInfo.getUsername(), userInfo.getRole(), getTime());
            new R<String>().setRole(userInfo.getRole());
            return R.success(getTime() + " " + userInfo.getUsername() + " 登录成功");
        }
    }

    @GetMapping("/logout")
    @ResponseBody
    public R<String> logout(HttpServletRequest request) {
        String username = (String) request.getSession().getAttribute("username");
        String role = (String) request.getSession().getAttribute("role");
        if (null == username) {
            log.info("用户 {}({}) 于 {} 退出成功", "null", role, getTime());
            return R.success("退出成功，虽然您未登录");
        } else {
            request.getSession().removeAttribute("username");
            request.getSession().removeAttribute("role");
            log.info("用户 {}({}) 于 {} 退出成功", username, role, getTime());
            return R.success(getTime() + " " + username + " 退出成功");
        }
    }
}
