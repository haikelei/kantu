package controller;


import exception.BaseException;
import model.params.AddAtlasParam;
import model.responses.AddAtlasResponse;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import service.AtlasService;

@RequestMapping(value = "/atlas",method = RequestMethod.POST,produces="application/json")
@Controller
public class AtlasController extends BaseController{

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





}
