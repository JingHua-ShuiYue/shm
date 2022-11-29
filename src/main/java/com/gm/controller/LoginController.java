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
            log.info("用户 {}({}) 于 {} 登录成功", user.getUsername(), user.getRole(), getTime());
            return R.success(getTime() + " " + user.getUsername() + " 登录成功");
        }
    }

    @GetMapping("/logout")
    @ResponseBody
    public R<String> logout(HttpServletRequest request) {
        String username = (String) request.getSession().getAttribute("username");
        if (null == username) {
            log.info("用户 {} 于 {} 登录成功", "null(未登录)", getTime());
            return R.success("退出成功，虽然您未登录");
        } else {
            request.getSession().removeAttribute("username");
            log.info("用户 {} 于 {} 登录成功", username, getTime());
            return R.success(getTime() + " " + username + " 退出成功");
        }
    }
}
