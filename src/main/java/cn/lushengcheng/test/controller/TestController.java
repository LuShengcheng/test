package cn.lushengcheng.test.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 * 测试
 * </p>
 *
 * @author lushengcheng
 * @since 2022/7/12 20:17
 **/
@RestController
@Slf4j
@RequestMapping("/test")
public class TestController {

    /**测试控制器
     * Get请求
     * 返回test字符串
     */
    @GetMapping("/test")
    public String test() {
        log.info("test");

        return "test";
    }
}
