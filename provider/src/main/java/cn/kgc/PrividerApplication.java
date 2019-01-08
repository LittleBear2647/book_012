package cn.kgc;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@MapperScan("cn.kgc.mapper")
@ImportResource("spring-provider.xml")
public class PrividerApplication {

    public static void main(String[] args) {
        SpringApplication.run(PrividerApplication.class, args);
    }

}

