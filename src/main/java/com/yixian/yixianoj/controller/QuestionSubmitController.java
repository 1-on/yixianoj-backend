package com.yixian.yixianoj.controller;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.yixian.yixianoj.annotation.AuthCheck;
import com.yixian.yixianoj.common.BaseResponse;
import com.yixian.yixianoj.common.ErrorCode;
import com.yixian.yixianoj.common.ResultUtils;
import com.yixian.yixianoj.constant.UserConstant;
import com.yixian.yixianoj.exception.BusinessException;
import com.yixian.yixianoj.model.dto.question.QuestionQueryRequest;
import com.yixian.yixianoj.model.dto.questionsubmit.QuestionSubmitAddRequest;
import com.yixian.yixianoj.model.dto.questionsubmit.QuestionSubmitQueryRequest;
import com.yixian.yixianoj.model.entity.Question;
import com.yixian.yixianoj.model.entity.QuestionSubmit;
import com.yixian.yixianoj.model.entity.User;
import com.yixian.yixianoj.model.vo.QuestionSubmitVO;
import com.yixian.yixianoj.service.QuestionSubmitService;
import com.yixian.yixianoj.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

/**
 * 题目提交接口
 *
 * @author <a href="https://github.com/1-on">一弦</a>
 * yixianoj-backend
 */
@RestController
//@RequestMapping("/questionSubmit")
@Slf4j
@Deprecated
public class QuestionSubmitController {

    @Resource
    private QuestionSubmitService questionSubmitService;

    @Resource
    private UserService userService;

//    /**
//     * 提交题目
//     *
//     * @param questionSubmitAddRequest
//     * @param request
//     * @return resultNum 本次点赞变化数
//     */
//    @PostMapping("/")
//    public BaseResponse<Long> doQuestionSubmit(@RequestBody QuestionSubmitAddRequest questionSubmitAddRequest,
//                                               HttpServletRequest request) {
//        if (questionSubmitAddRequest == null || questionSubmitAddRequest.getQuestionId() <= 0) {
//            throw new BusinessException(ErrorCode.PARAMS_ERROR);
//        }
//        // 登录才能点赞
//        final User loginUser = userService.getLoginUser(request);
//        long postId = questionSubmitAddRequest.getQuestionId();
//        Long questionSubmitId = questionSubmitService.doQuestionSubmit(questionSubmitAddRequest, loginUser);
//        return ResultUtils.success(questionSubmitId);
//    }
//
//
//    /**
//     * 分页获取题目提交列表（除了管理员和用户，普通用户只能看到非答案，提交代码等公开信息）
//     *
//     * @param questionSubmitQueryRequest
//     * @return
//     */
//    @PostMapping("/list/page")
//    public BaseResponse<Page<QuestionSubmitVO>> listQuestionSubmitByPage(@RequestBody QuestionSubmitQueryRequest questionSubmitQueryRequest,
//                                                                         HttpServletRequest request) {
//        long current = questionSubmitQueryRequest.getCurrent();
//        long size = questionSubmitQueryRequest.getPageSize();
//        // 从数据库中查询原始的题目提交分页信息
//        Page<QuestionSubmit> questionSubmitPage = questionSubmitService.page(new Page<>(current, size),
//                questionSubmitService.getQueryWrapper(questionSubmitQueryRequest));
//        final User loginUser = userService.getLoginUser(request);
//        // 题目脱敏信息
//        return ResultUtils.success(questionSubmitService.getQuestionSubmitVOPage(questionSubmitPage, loginUser));
//    }

}
