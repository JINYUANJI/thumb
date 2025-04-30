package com.xuanapi.thumb.controller;

import com.xuanapi.thumb.common.BaseResponse;
import com.xuanapi.thumb.common.ResultUtils;
import com.xuanapi.thumb.constant.UserConstant;
import com.xuanapi.thumb.model.entity.User;
import com.xuanapi.thumb.service.UserService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.annotation.Resource;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
@Tag(name = "用户接口",description = "用户登陆注册获取，用户信息的接口")
public class UserController {
    @Resource
    private UserService userService;

    @GetMapping("/login")
    @Operation(summary = "登录接口",description = "用于验证登录信息")
    public BaseResponse<User> login(long userId, HttpServletRequest request){
        User user = userService.getById(userId);
        request.getSession().setAttribute(UserConstant.LOGIN_USER,user);
        return ResultUtils.success(user);
    }


    @GetMapping("/get/login")
    @Operation(summary = "获取登录信息",description = "获取登录信息的接口")
    public BaseResponse<User> getLoginUser(HttpServletRequest request) {
        return ResultUtils.success(userService.getLoginUser(request));
    }

}
