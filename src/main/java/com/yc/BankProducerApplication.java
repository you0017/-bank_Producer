package com.yc;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@MapperScan("com.yc.mapper")
@EnableAspectJAutoProxy//aop
@EnableTransactionManagement//事务
public class BankProducerApplication {

    public static void main(String[] args) {
        SpringApplication.run(BankProducerApplication.class, args);
    }

}
