package xzp.xf.pro.impl;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "xzp.xf")
@MapperScan(basePackages = "xzp.xf.sql.mapper")
public class Application{

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}
