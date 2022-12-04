package com.gm.controller;

import com.gm.R.R;
import com.gm.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

public class PageController {
    @Resource
    private UserService userService;

    /**
     * 根据登录用户角色分别返回对应的init.json文件的路径
     * @param request
     * @return --init.json文件路径
     */
    @GetMapping("/page/pageInit")
    @ResponseBody
    public String getPageInfoByRole(HttpServletRequest request){
        String username = (String) request.getSession().getAttribute("username");
        String role = userService.getUserByUsername(username).getRole();
        return "init文件路径" + role + "文件后缀";
    }
}
