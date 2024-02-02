package com.yixian.yixianoj.judge.strategy;

import com.yixian.yixianoj.judge.codesandbox.model.JudgeInfo;

public interface JudgeStrategy {
    /**
     * 执行判题
     *
     * @return
     */
    JudgeInfo doJudge(JudgeContext judgeContext);
}
