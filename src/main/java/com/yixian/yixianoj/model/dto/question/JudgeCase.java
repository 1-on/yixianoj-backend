package com.yixian.yixianoj.model.dto.question;

import lombok.Data;

@Data
public class JudgeCase {
    /**
     * 输入用例
     */
    private String input;

    /**
     * 输出用例
     */
    private String output;
}
