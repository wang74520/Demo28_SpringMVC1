package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

@Controller
public class MyController {
    @RequestMapping("/my1")
    public String my(HttpServletRequest req){
        req.setAttribute("name","tom");
        req.setAttribute("age","20");
        return "my";
    }

    @RequestMapping("/my2")
    public ModelAndView my2(ModelAndView mv){
        mv.addObject("name","tom2");
        mv.addObject("age","22");
        mv.setViewName("my");
        return mv;
    }

    @RequestMapping("/my3")
    @ResponseBody
    public int my3(){
        return 123;
    }



}
