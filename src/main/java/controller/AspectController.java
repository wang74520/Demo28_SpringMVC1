package controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AspectController {

    @RequestMapping("/aspect/{name}")
    public String find(@PathVariable("name") String name){
        //int a = 2/0;
        System.out.println("我是Controller中的find()");
        return "find";
    }
}
