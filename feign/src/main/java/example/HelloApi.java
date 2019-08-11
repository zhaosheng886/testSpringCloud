package example;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;


//由feign ，只告诉服务，自己去干 空手套白狼
@FeignClient(value = "service-helloworld",fallback = HelloApiFallback.class)
public interface HelloApi {
    @RequestMapping(method = RequestMethod.GET, value = "/hello")
    public String sayHello(@RequestParam("name")String name,User user);


}


