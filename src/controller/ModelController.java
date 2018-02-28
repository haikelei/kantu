package controller;


import exception.BaseException;
import model.params.ModelParam;
import model.responses.ResAddModel;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import service.ModelService;
import utils.JsonUtils;

@RequestMapping(value = "/model",method = RequestMethod.POST,produces="application/json")
@Controller
public class ModelController extends BaseController {

    @RequestMapping(value = "add",method = RequestMethod.POST)
    @ResponseBody
    public String addModel(@RequestBody ModelParam param){
        System.out.println(param.toString());
        try {
            ResAddModel resAddModel = ModelService.getInstance().addModel(param);
            setData(resAddModel);
        }catch (BaseException e){
            setCode(e.getErrorCode());
        }finally {
            return getResponseString();
        }

    }





}
