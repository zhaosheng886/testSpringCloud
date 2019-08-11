package example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FeignTestController {

    @Autowired
    private HelloApi helloApi;

    @RequestMapping(value = "/hello",method = RequestMethod.GET)
    public String sayHello(String name){

        int i = 1;
        System.out.println(1);
    i++;

        System.out.println(2);
    i++;

        System.out.println(3);
        User user=new User();
        user.setUsername("usernamezzzzzzzzzzz");
        user.setPwd("cccccccccccccc");


        return helloApi.sayHello(name,user);
    }

}
