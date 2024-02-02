package com.yixian.yixianoj.judge.codesandbox;

import com.yixian.yixianoj.judge.codesandbox.impl.ExampleCodeSandbox;
import com.yixian.yixianoj.judge.codesandbox.impl.RemoteCodeSandbox;
import com.yixian.yixianoj.judge.codesandbox.impl.ThirtyPartyCodeSandbox;

/**
 * 代码沙箱工厂（根据字符串参数创建指定的代码沙箱实例）
 */
public class CodeSandboxFactory {

    public static CodeSandbox newInstance(String type) {
        switch (type) {
            case "example":
                return new ExampleCodeSandbox();
            case "remote":
                return new RemoteCodeSandbox();
            case "thirtyParty":
                return new ThirtyPartyCodeSandbox();
            default:
                return new ExampleCodeSandbox();
        }
    }

}
