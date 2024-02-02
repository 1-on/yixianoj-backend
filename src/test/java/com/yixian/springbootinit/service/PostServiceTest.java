package com.yixian.springbootinit.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.yixian.yixianoj.model.dto.post.PostQueryRequest;
import com.yixian.yixianoj.model.entity.Post;
import javax.annotation.Resource;

import com.yixian.yixianoj.service.PostService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * 帖子服务测试
 *
 * @author <a href="https://github.com/1-on">一弦</a>
 * yixianoj-backend
 */
@SpringBootTest
class PostServiceTest {

    @Resource
    private PostService postService;

    @Test
    void searchFromEs() {
        PostQueryRequest postQueryRequest = new PostQueryRequest();
        postQueryRequest.setUserId(1L);
        Page<Post> postPage = postService.searchFromEs(postQueryRequest);
        Assertions.assertNotNull(postPage);
    }

}