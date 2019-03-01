package controller;


import exception.BaseException;
import model.ModelDetailEntity;
import model.params.ModelDeleteParam;
import model.params.ModelParam;
import model.params.ModelUpdateParam;
import model.responses.ResAddModel;
import model.responses.UpdateModelData;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import service.ModelService;
import utils.JsonUtils;

import javax.servlet.http.HttpServletResponse;
import java.util.List;

@RequestMapping(value = "/model",method = RequestMethod.POST,produces="application/json")
@Controller
public class ModelController extends BaseController {

    @CrossOrigin(origins = "*", maxAge = 3600)
    @RequestMapping(value = "/add",method = RequestMethod.POST)
    @ResponseBody
    public String addModel(@RequestBody ModelParam param){
        System.out.println(param.toString());
        try {
            ResAddModel resAddModel = ModelService.getInstance().addModel(param);
            setData(resAddModel);
            setCode(0);
            setMsg(null);
            return getResponseString();
        }catch (BaseException e){
            setCode(e.getErrorCode());
            return getResponseString();
        }
    }

    @RequestMapping(value = "/delete",method = RequestMethod.POST)
    @ResponseBody
    public String deleteModel(@RequestBody ModelDeleteParam param){
        System.out.println("==="+param.toString());
        try {
            ResAddModel resAddModel = ModelService.getInstance().deleteModel(param);
            setData(resAddModel);
            setCode(0);
            setMsg(null);
            return getResponseString();
        }catch (BaseException e){
            setCode(e.getErrorCode());
            setData(null);
            return getResponseString();
        }
    }


    @RequestMapping(value = "/update",method = RequestMethod.POST)
    @ResponseBody
    public String updateModel(@RequestBody ModelUpdateParam param){
        System.out.println("==="+param.toString());
        try {
            UpdateModelData data = ModelService.getInstance().updateModel(param);
            setData(data);
            setCode(0);
            setMsg(null);
            return getResponseString();
        }catch (BaseException e){
            setCode(e.getErrorCode());
            setData(null);
            return getResponseString();
        }
    }


    @RequestMapping(value = "/info",method = RequestMethod.POST)
    @ResponseBody
    public String quaryModel(@RequestBody ModelDeleteParam param){
        System.out.println("==="+param.toString());
        try {
            ModelDetailEntity data = ModelService.getInstance().quaryModel(param);
            setData(data);
            setCode(0);
            setMsg(null);
            return getResponseString();
        }catch (BaseException e){
            setCode(e.getErrorCode());
            setData(null);
            return getResponseString();
        }
    }

    @RequestMapping(value = "/list",method = RequestMethod.POST)
    @ResponseBody
    public String getList(HttpServletResponse response){
        response.setHeader("Access-Control-Allow-Origin", "*");
        try {
            List<ModelDetailEntity> data = ModelService.getInstance().getModelList();
            setData(data);
            setCode(0);
            setMsg(null);
            return getResponseString();
        }catch (BaseException e){
            setCode(e.getErrorCode());
            setData(null);
            return getResponseString();
        }
    }





}
