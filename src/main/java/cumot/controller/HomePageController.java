package cumot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomePageController {
    
    @RequestMapping("/")
    public String hello() {

        return "Hello CU MOT !";
    }

}
