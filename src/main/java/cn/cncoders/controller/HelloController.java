package cn.cncoders.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description controller
 * @Author eric
 * @Version V1.0.0
 * @Date 2019/6/5
 */
@RestController
public class HelloController {

    /**
     * 处理hello请求
     *
     * @return 返回请求及结果
     */
    @RequestMapping("/hello")
    public String hello() {
        return "hello world!";

    }
}
