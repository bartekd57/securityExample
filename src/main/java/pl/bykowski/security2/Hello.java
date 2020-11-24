package pl.bykowski.security2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hello {

    @GetMapping("/hello")
    public String hello(){
        return "hello!";
    }

    @GetMapping("/hello2")
    public String hello2(){
        return "hello2!";
    }

}
