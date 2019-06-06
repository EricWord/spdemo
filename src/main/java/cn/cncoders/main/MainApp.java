package cn.cncoders.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @Description
 * @Author eric
 * @Version V1.0.0
 * @Date 2019/6/5
 */
//下面这个注解是告诉SpringBoot当前类是启动类
@SpringBootApplication
public class MainApp {


    public static void main(String[] args) {
        //启动应用
        SpringApplication.run(MainApp.class,args);
    }
}
