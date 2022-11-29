package com.gm.controller;

import com.gm.R.R;
import com.gm.service.UserService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

@RestController
public class PageController {

    @Resource
    private UserService userService;

    @PostMapping("/pageControl/getInit")
    public R<String> getInitFile(HttpServletRequest request) {
        try{
            String username = (String) request.getSession().getAttribute("username");
            if(null == username){
                return R.error("账户未登录");
            }else {
                String role = userService.getUserByUsername(username).getRole();
                return R.success("api/init/" + role + "Init.json"); // api/init/--Init.json
            }
        }catch (Exception e){
            return R.error("账户未登录");
        }

    }

}
