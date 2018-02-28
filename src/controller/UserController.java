package controller;


import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializerFeature;
import model.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import utils.JsonUtils;

@RequestMapping(value = "/user",method = RequestMethod.POST)
@Controller
public class UserController extends BaseController{

    @RequestMapping(value = "/add")
    @ResponseBody
    public String test(){
        try{
            setCode(200);
        }catch (Exception e){
            setCode(10000);
            setMsg(e.getMessage());
        }finally {
            return getResponseString();
        }

    }





}
