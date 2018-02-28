package controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@RequestMapping(value = "/atlas",method = RequestMethod.POST)
@Controller
public class AtlasController {

    @RequestMapping(value = "add",method = RequestMethod.POST)
    @ResponseBody
    public String add(){
        return "hello lujialei";
    }





}
