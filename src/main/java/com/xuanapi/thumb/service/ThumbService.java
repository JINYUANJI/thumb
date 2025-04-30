package com.xuanapi.thumb.service;

import com.xuanapi.thumb.model.dto.thumb.DoThumbRequest;
import com.xuanapi.thumb.model.entity.Thumb;
import com.baomidou.mybatisplus.extension.service.IService;
import jakarta.servlet.http.HttpServletRequest;

/**
* @author 冰点
* @description 针对表【thumb】的数据库操作Service
* @createDate 2025-04-22 15:52:42
*/
public interface ThumbService extends IService<Thumb> {


    /**
     * 点赞
     * @param doThumbRequest
     * @param request
     * @return {@link Boolean }
     */
    Boolean doThumb(DoThumbRequest doThumbRequest, HttpServletRequest request);



    /**
     * 取消点赞
     * @param doThumbRequest
     * @param request
     * @return {@link Boolean }
     */
    Boolean undoThumb(DoThumbRequest doThumbRequest, HttpServletRequest request);

    Boolean hasThumb(Long blogId, Long userId);

}
