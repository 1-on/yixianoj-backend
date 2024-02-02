package com.yixian.yixianoj.judge;

import com.yixian.yixianoj.judge.strategy.DefaultJudgeStrategy;
import com.yixian.yixianoj.judge.strategy.JavaLanguageJudgeStrategy;
import com.yixian.yixianoj.judge.strategy.JudgeContext;
import com.yixian.yixianoj.judge.strategy.JudgeStrategy;
import com.yixian.yixianoj.judge.codesandbox.model.JudgeInfo;
import com.yixian.yixianoj.model.entity.QuestionSubmit;
import org.springframework.stereotype.Service;

@Service
public class JudgeManager {
    /**
     * 执行判题
     *
     * @param judgeContext
     * @return
     */
    JudgeInfo doJudge(JudgeContext judgeContext) {
        QuestionSubmit questionSubmit = judgeContext.getQuestionSubmit();
        String language = questionSubmit.getLanguage();
        JudgeStrategy judgeStrategy = new DefaultJudgeStrategy();
        if ("java".equals(language)) {
            judgeStrategy = new JavaLanguageJudgeStrategy();
        }
        return judgeStrategy.doJudge(judgeContext);
    }
}
