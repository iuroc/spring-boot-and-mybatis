# Spring Boot & MyBatis

## 依赖项

- [3.0.3] [mybatis-spring-boot-starter](https://mvnrepository.com/artifact/org.mybatis.spring.boot/mybatis-spring-boot-starter)
- [3.2.6] [spring-boot-starter-parent](https://mvnrepository.com/artifact/org.springframework.boot/spring-boot-starter-parent)
    - [spring-boot-starter-web](https://mvnrepository.com/artifact/org.springframework.boot/spring-boot-starter-web)
    - [runtime] [spring-boot-devtools](https://mvnrepository.com/artifact/org.springframework.boot/spring-boot-devtools)
    - [runtime] [mysql-connector-j](https://mvnrepository.com/artifact/com.mysql/mysql-connector-j)
    - [test] [spring-boot-starter-test](https://mvnrepository.com/artifact/org.springframework.boot/spring-boot-starter-test)
    - [test] [mybatis-spring-boot-starter-test](https://mvnrepository.com/artifact/org.mybatis.spring.boot/mybatis-spring-boot-starter-test)

## 快速开始

```bash
git clone https://github.com/iuroc/spring-boot-and-mybatis.git
cd spring-boot-and-mybatis
mvn spring-boot:run
```

## 项目结构

- `controller`：包含处理 HTTP 请求的控制器，配置 HTTP 服务器的路由和业务逻辑的入口点。
- `mapper`：包含 MyBatis 的 Mapper 接口和 SQL 映射文件，用于数据库操作和接口的映射。
- `model`：包含数据实体类，表示数据库中的表结构或业务对象。