package info.devjournal.springBootSSL;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SimpleRestController {

    @GetMapping("/hello")
    public String helloWorld(){
        return "Hello dev!";
    }
}