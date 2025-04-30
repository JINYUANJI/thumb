package com.xuanapi.thumb.controller;

import com.xuanapi.thumb.common.BaseResponse;
import com.xuanapi.thumb.common.ResultUtils;
import com.xuanapi.thumb.model.dto.thumb.DoThumbRequest;
import com.xuanapi.thumb.service.ThumbService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.annotation.Resource;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@Tag(name = "点赞接口")
@RestController
@RequestMapping("thumb")
public class ThumbController {
    @Resource
    private ThumbService thumbService;

    @Operation(description = "点赞功能")
    @PostMapping("/do")
    public BaseResponse<Boolean> doThumb(@RequestBody DoThumbRequest doThumbRequest, HttpServletRequest request) {
        Boolean success = thumbService.doThumb(doThumbRequest, request);
        return ResultUtils.success(success) ;
    }


    @PostMapping("/undo")
    public BaseResponse<Boolean> undoThumb(@RequestBody DoThumbRequest doThumbRequest, HttpServletRequest request) {
        Boolean success = thumbService.undoThumb(doThumbRequest, request);
        return ResultUtils.success(success);
    }

}
