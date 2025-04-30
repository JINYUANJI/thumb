package com.xuanapi.thumb.mapper;

import com.xuanapi.thumb.model.entity.Blog;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
* @author 冰点
* @description 针对表【blog】的数据库操作Mapper
* @createDate 2025-04-22 15:52:32
* @Entity com.xuanapi.thumb.model.entity.Blog
*/
@Mapper
public interface BlogMapper extends BaseMapper<Blog> {

}




