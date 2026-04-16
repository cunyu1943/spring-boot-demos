package io.github.cunyu1943.demohello.controller;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @description: Hello World 控制器测试
 * @author: cunyu1943
 * @date: 2026-04-16
 * @fileName: HelloWorldControllerTest
 * @version: 1.0
 * 公众号：村雨遥
 * GitHub: https://github.com/cunyu1943
 */

class HelloWorldControllerTest {

    private final HelloWorldController helloWorldController = new HelloWorldController();

    @Test
    void testIndex() {
        String result = helloWorldController.index();
        assertEquals("Hello World！", result);
    }
}