package com.yixian.yixianoj.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.yixian.yixianoj.model.dto.question.QuestionQueryRequest;
import com.yixian.yixianoj.model.dto.questionsubmit.QuestionSubmitAddRequest;
import com.yixian.yixianoj.model.dto.questionsubmit.QuestionSubmitQueryRequest;
import com.yixian.yixianoj.model.entity.Question;
import com.yixian.yixianoj.model.entity.QuestionSubmit;
import com.baomidou.mybatisplus.extension.service.IService;
import com.yixian.yixianoj.model.entity.User;
import com.yixian.yixianoj.model.vo.QuestionSubmitVO;
import com.yixian.yixianoj.model.vo.QuestionVO;

import javax.servlet.http.HttpServletRequest;

/**
 * @author jiangfei
 * @description 针对表【question_submit(题目提交)】的数据库操作Service
 * @createDate 2024-01-25 18:41:39
 */
public interface QuestionSubmitService extends IService<QuestionSubmit> {
    /**
     * 题目提交
     *
     * @param questionSubmitAddRequest 题目提交信息
     * @param loginUser
     * @return
     */
    Long doQuestionSubmit(QuestionSubmitAddRequest questionSubmitAddRequest, User loginUser);

    /**
     * 获取查询条件
     *
     * @param questionSubmitQueryRequest
     * @return
     */
    QueryWrapper<QuestionSubmit> getQueryWrapper(QuestionSubmitQueryRequest questionSubmitQueryRequest);


    /**
     * 获取题目封装
     *
     * @param question
     * @param loginUser
     * @return
     */
    QuestionSubmitVO getQuestionSubmitVO(QuestionSubmit question, User loginUser);

    /**
     * 分页获取题目封装
     *
     * @param questionSubmit
     * @param loginUser
     * @return
     */
    Page<QuestionSubmitVO> getQuestionSubmitVOPage(Page<QuestionSubmit> questionSubmit, User loginUser);


}
