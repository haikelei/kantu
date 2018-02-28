package controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@RequestMapping(value = "/test",method = RequestMethod.POST)
@Controller
public class TestController  {

    @RequestMapping(method = RequestMethod.POST)
    @ResponseBody
    public String test(){
        return "hello lujialei";
    }





}
