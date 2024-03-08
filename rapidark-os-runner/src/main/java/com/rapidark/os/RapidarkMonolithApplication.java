package com.rapidark.os;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.metrics.buffering.BufferingApplicationStartup;
import org.springframework.boot.web.servlet.ServletComponentScan;

/**
 * 启动程序
 *
 * @author Lion Li
 */
//@EnableDubbo
//@ServletComponentScan(basePackages = "com.rapidark.npm.cdn", basePackageClasses = { CDNServlet.class })
@SpringBootApplication(scanBasePackages = "com.rapidark")
public class RapidarkMonolithApplication {

    public static void main(String[] args) {
        SpringApplication application = new SpringApplication(RapidarkMonolithApplication.class);
        application.setApplicationStartup(new BufferingApplicationStartup(2048));
        application.run(args);
        System.out.println("(♥◠‿◠)ﾉﾞ  Rapidark V16 启动成功   ლ(´ڡ`ლ)ﾞ");
    }

}
