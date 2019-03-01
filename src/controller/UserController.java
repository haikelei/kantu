package controller;


import exception.ExceptionMap;
import model.params.AddUserParam;
import model.responses.AddAtlasResponse;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import service.UserService;

@RequestMapping(value = "/user",method = RequestMethod.POST)
@Controller
public class UserController extends BaseController{


    @CrossOrigin(origins = "*", maxAge = 3600)
    @RequestMapping(value = "/add",method = RequestMethod.POST)
    @ResponseBody
    public String addUser(@RequestBody AddUserParam param){
        try{
            boolean b = UserService.getInstance().addUser(param);
            setData(new AddAtlasResponse(b));
            setCode(200);
        }catch (Exception e){
            setCode(ExceptionMap.ERROR_CODE_10014);
            setMsg(e.getMessage());
        }finally {
            return getResponseString();
        }

    }





}
