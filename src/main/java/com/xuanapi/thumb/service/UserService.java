package com.xuanapi.thumb.service;

import com.xuanapi.thumb.model.entity.User;
import com.baomidou.mybatisplus.extension.service.IService;
import jakarta.servlet.http.HttpServletRequest;

/**
* @author 冰点
* @description 针对表【user】的数据库操作Service
* @createDate 2025-04-22 15:52:49
*/
public interface UserService extends IService<User> {

    User getLoginUser(HttpServletRequest request);
}
