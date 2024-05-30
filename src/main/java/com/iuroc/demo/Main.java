package com.iuroc.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Main {
    @Value("${server.port}")
    public int serverPort;

    public static void main(String[] args) {
        // 启动 Spring 应用并返回应用的上下文
        ConfigurableApplicationContext context = SpringApplication.run(Main.class, args);
        // 从 Spring 容器中获取 Main 类型的 Bean 实例
        Main main = context.getBean(Main.class);
        // 输出服务器端口号
        System.out.printf("http://127.0.0.1:%d\n", main.serverPort);
    }
}