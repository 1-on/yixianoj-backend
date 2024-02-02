package com.yixian.yixianoj.judge.strategy;

import com.yixian.yixianoj.model.dto.question.JudgeCase;
import com.yixian.yixianoj.judge.codesandbox.model.JudgeInfo;
import com.yixian.yixianoj.model.entity.Question;
import com.yixian.yixianoj.model.entity.QuestionSubmit;
import lombok.Data;

import java.util.List;

/**
 * 上下文，用于定义在策略中传递的参数
 */
@Data
public class JudgeContext {
    private JudgeInfo judgeInfo;

    private List<String> inputList;

    private List<String> outputList;

    private List<JudgeCase> judgeCaseList;

    private Question question;

    private QuestionSubmit questionSubmit;
}
