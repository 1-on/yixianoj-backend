package com.yixian.yixianoj.judge.codesandbox;

import com.yixian.yixianoj.judge.codesandbox.model.ExecuteCodeRequest;
import com.yixian.yixianoj.judge.codesandbox.model.ExecuteCodeResponse;

public interface CodeSandbox {
    ExecuteCodeResponse executeCode(ExecuteCodeRequest executeCodeRequest);
}
