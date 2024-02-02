package com.yixian.yixianoj.judge.codesandbox.impl;

import com.yixian.yixianoj.judge.codesandbox.CodeSandbox;
import com.yixian.yixianoj.judge.codesandbox.model.ExecuteCodeRequest;
import com.yixian.yixianoj.judge.codesandbox.model.ExecuteCodeResponse;

public class ThirtyPartyCodeSandbox implements CodeSandbox {

    @Override
    public ExecuteCodeResponse executeCode(ExecuteCodeRequest executeCodeRequest) {
        System.out.println("第三方代码沙箱");
        return null;
    }
}
