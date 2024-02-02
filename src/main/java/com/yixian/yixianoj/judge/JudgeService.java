package com.yixian.yixianoj.judge;

import com.yixian.yixianoj.judge.codesandbox.model.ExecuteCodeRequest;
import com.yixian.yixianoj.judge.codesandbox.model.ExecuteCodeResponse;
import com.yixian.yixianoj.model.entity.QuestionSubmit;
import com.yixian.yixianoj.model.vo.QuestionSubmitVO;
import org.springframework.stereotype.Service;

public interface JudgeService {
    /**
     * 判题服务
     *
     * @param questionSubmitId
     * @return
     */
    QuestionSubmit doJudge(Long questionSubmitId);
}
