package controller;


import exception.BaseException;
import model.ModelDetailEntity;
import model.params.ModelDetailParam;
import model.responses.ListData;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import service.AppModelService;

import java.util.List;

@RequestMapping(value = "/app/model",method = RequestMethod.POST,produces="application/json")
@Controller
public class ModelAppController extends BaseController {

    @CrossOrigin(origins = "*", maxAge = 3600)
    @RequestMapping(value = "/list",method = RequestMethod.POST)
    @ResponseBody
    public String modelList(){
        try{
            List<ModelDetailEntity> data = AppModelService.getInstance().getModelList();
            ListData<ModelDetailEntity> listData = new ListData();
            listData.setList(data);
            setCode(0);
            setMsg(null);
            setData(listData);
            return getResponseString();
        }catch (BaseException e){
            setCode(e.getErrorCode());
            setData(null);
            return getResponseString();
        }
    }


    @CrossOrigin(origins = "*", maxAge = 3600)
    @RequestMapping(value = "/detail",method = RequestMethod.POST)
    @ResponseBody
    public String modeDetail(@RequestBody ModelDetailParam param){
        try{
            ModelDetailEntity data = AppModelService.getInstance().getModelDetail(param);
            setCode(0);
            setMsg(null);
            setData(data);
            return getResponseString();
        }catch (BaseException e){
            setCode(e.getErrorCode());
            setData(null);
            return getResponseString();
        }
    }


}
