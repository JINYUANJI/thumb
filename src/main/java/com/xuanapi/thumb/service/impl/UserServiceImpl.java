package com.xuanapi.thumb.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.xuanapi.thumb.common.BaseResponse;
import com.xuanapi.thumb.common.ResultUtils;
import com.xuanapi.thumb.constant.UserConstant;
import com.xuanapi.thumb.model.entity.User;
import com.xuanapi.thumb.service.UserService;
import com.xuanapi.thumb.mapper.UserMapper;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Service;

/**
 * @author 冰点
 * @description 针对表【user】的数据库操作Service实现
 * @createDate 2025-04-22 15:52:49
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User>
        implements UserService {

    /**
     * @param request
     * @return
     */
    @Override
    public User getLoginUser(HttpServletRequest request) {
        return (User) request.getSession().getAttribute(UserConstant.LOGIN_USER);
    }

}




