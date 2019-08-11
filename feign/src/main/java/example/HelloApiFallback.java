package example;

import org.springframework.stereotype.Component;
@Component
public class HelloApiFallback implements HelloApi{
    @Override
    public String sayHello(String name,User user) {
        return "服务异常，启动熔断,HelloWorld";
    }
}
