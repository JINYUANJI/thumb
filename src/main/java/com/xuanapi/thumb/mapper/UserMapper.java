package com.xuanapi.thumb.mapper;

import com.xuanapi.thumb.model.entity.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
* @author 冰点
* @description 针对表【user】的数据库操作Mapper
* @createDate 2025-04-22 15:52:49
* @Entity com.xuanapi.thumb.model.entity.User
*/
@Mapper
public interface UserMapper extends BaseMapper<User> {

}




