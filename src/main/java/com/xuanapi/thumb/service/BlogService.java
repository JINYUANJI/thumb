package com.xuanapi.thumb.service;

import com.xuanapi.thumb.model.entity.Blog;
import com.baomidou.mybatisplus.extension.service.IService;
import com.xuanapi.thumb.model.vo.BlogVO;
import jakarta.servlet.http.HttpServletRequest;

import java.util.List;

/**
* @author 冰点
* @description 针对表【blog】的数据库操作Service
* @createDate 2025-04-22 15:52:32
*/
public interface BlogService extends IService<Blog> {

    /**
     * 根据ID获取博客
     * @param blogId ID
     * @param request 请求
     * @return
     */
    BlogVO getBlogVOById(long blogId, HttpServletRequest request);

    /**
     * 获取blog列表
     * @param blogList
     * @param request
     * @return
     */
    List<BlogVO> getBlogVOList(List<Blog> blogList, HttpServletRequest request);

}
