package com.xuanapi.thumb.controller;

import com.xuanapi.thumb.common.BaseResponse;
import com.xuanapi.thumb.common.ResultUtils;
import com.xuanapi.thumb.model.entity.Blog;
import com.xuanapi.thumb.model.vo.BlogVO;
import com.xuanapi.thumb.service.BlogService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.annotation.Resource;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("blog")
@Tag(name = "博客接口", description = "博客相关的业务")
public class BlogController {
    @Resource
    private BlogService blogService;

    @Operation(description = "根据id获取博客记录")
    @GetMapping("/get")
    public BaseResponse<BlogVO> get(long blogId, HttpServletRequest request) {
        BlogVO blogVO = blogService.getBlogVOById(blogId, request);
        return ResultUtils.success(blogVO);
    }

    @Operation(description = "查询博客列表")
    @GetMapping("/list")
    public BaseResponse<List<BlogVO>> list(HttpServletRequest request) {
        List<Blog> blogList = blogService.list();
        List<BlogVO> blogVOList = blogService.getBlogVOList(blogList, request);
        return ResultUtils.success(blogVOList);
    }

}
