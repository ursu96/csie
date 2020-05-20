package ursu.disertatie.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorld {

    @GetMapping(value = "/")
    String getHelloWorld (){
        return "Hello world CSIE";
    }

}