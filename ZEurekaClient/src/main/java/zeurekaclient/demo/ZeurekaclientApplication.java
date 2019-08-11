package zeurekaclient.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Value;

@SpringBootApplication
@EnableEurekaClient
@RestController

public class ZeurekaclientApplication {

    public static void main(String[] args) {
        SpringApplication.run(ZeurekaclientApplication.class, args);
    }


    @Value("${server.port}")
    String port;
    @RequestMapping("/hi")
    public String toString() {
        return "这是端口为："+port+"实例项目";
    }

    @RequestMapping("/hello")
    public String hello( String name, @RequestBody  User user) {

        System.out.println("dddddddddddddddddddddddddddddd333333333333333333");

        return "hello world ," +name+"port："+port+ "user:"+user.getUsername();
    }

}
