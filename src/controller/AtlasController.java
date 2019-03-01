package controller;


import exception.BaseException;
import model.params.AddAtlasParam;
import model.params.DeleteAtlasParam;
import model.params.InfoAtlasParam;
import model.params.UpdateAtlasParam;
import model.responses.AddAtlasResponse;
import model.responses.InfoAtlasResponse;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import service.AtlasService;

import javax.servlet.http.HttpServletResponse;

@RequestMapping(value = "/atlas",method = RequestMethod.POST,produces="application/json")
@Controller
public class AtlasController extends BaseController{

    @CrossOrigin(origins = "*", maxAge = 3600)
    @RequestMapping(value = "/add",method = RequestMethod.POST)
    @ResponseBody
    public String add(@RequestBody AddAtlasParam param){
        try{
            System.out.println(param.toString());
            AddAtlasResponse data = AtlasService.getInstance().addAtlas(param);
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

    @RequestMapping(value = "/delete",method = RequestMethod.POST)
    @ResponseBody
    public String deleteAtlas(@RequestBody DeleteAtlasParam param){
        System.out.println(param.toString());
        try{
            AddAtlasResponse data = AtlasService.getInstance().deleteAtlas(param);
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

    @RequestMapping(value = "/info",method = RequestMethod.POST)
    @ResponseBody
    public String infoAtlas(@RequestBody InfoAtlasParam param){
        System.out.println(param.toString());
        try{
            InfoAtlasResponse data = AtlasService.getInstance().infoAtlas(param);
            setCode(0);
            setMsg(null);
            setData(data);
            return getResponseString();
        }catch (Exception e){
            e.printStackTrace();
            if(e instanceof BaseException){
                BaseException baseException = (BaseException) e;
                setCode(baseException.getErrorCode());
                setData(null);
                return getResponseString();
            }else {
                setCode(100080);
                setMsg("查询图集失败");
                return getResponseString();
            }

        }
    }


    @RequestMapping(value = "/update",method = RequestMethod.POST)
    @ResponseBody
    public String updateAtlas(@RequestBody UpdateAtlasParam param){
        try{
            System.out.println(param.toString());
            AddAtlasResponse data = AtlasService.getInstance().updateAtlas(param);
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
