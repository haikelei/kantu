package controller;


import exception.BaseException;
import model.AtlasDetailEntity;
import model.responses.ListData;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import service.AppAtlasService;

import java.util.List;

@RequestMapping(value = "/app/atlas",method = RequestMethod.POST,produces="application/json")
@Controller
public class AtlasAppController extends BaseController {

    @CrossOrigin(origins = "*", maxAge = 3600)
    @RequestMapping(value = "/new",method = RequestMethod.POST)
    @ResponseBody
    public String latestAtlas(){
        try{
            List<AtlasDetailEntity> data = AppAtlasService.getInstance().getLatestAtlas();
            ListData<AtlasDetailEntity> listData = new ListData();
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
    @RequestMapping(value = "/hot",method = RequestMethod.POST)
    @ResponseBody
    public String hotAtlas(){
        try{
            List<AtlasDetailEntity> data = AppAtlasService.getInstance().getHotAtlas();
            ListData listData = new ListData();
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
    @RequestMapping(value = "/private",method = RequestMethod.POST)
    @ResponseBody
    public String privateAtlas(){
        try{
            List<AtlasDetailEntity> data = AppAtlasService.getInstance().getPrivateAtlas();
            ListData listData = new ListData();
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






}
