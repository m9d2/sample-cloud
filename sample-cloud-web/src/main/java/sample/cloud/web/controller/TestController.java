package sample.cloud.web.controller;

import lombok.AllArgsConstructor;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@AllArgsConstructor
@RestController
public class TestController {

    private final Environment env;

    public String getApplicationName() {
        return env.getProperty("spring.application.name");
    }

    @GetMapping("/")
    public String index() {
        return "服务已启动，当前服务名称为：" + getApplicationName();
    }
}
