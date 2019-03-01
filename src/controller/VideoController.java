package controller;


import exception.BaseException;
import model.params.*;
import model.responses.AddAtlasResponse;
import model.responses.InfoVideoResponse;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import service.VideoService;

@RequestMapping(value = "/video",method = RequestMethod.POST,produces="application/json")
@Controller
public class VideoController extends BaseController {

    @RequestMapping(value = "/add",method = RequestMethod.POST)
    @ResponseBody
    public String add(@RequestBody AddVideoParam param){
        System.out.println(param.toString());
        try{
            AddAtlasResponse data = VideoService.getInstance().addVideo(param);
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
    public String info(@RequestBody InfoVideoList param){
        System.out.println(param.toString());
        try{
            InfoVideoResponse data = VideoService.getInstance().infoVideo(param);
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
    public String delete(@RequestBody DeleteVideoParam param){
        System.out.println(param.toString());
        try{
            AddAtlasResponse data = VideoService.getInstance().deleteVideo(param);
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

    @RequestMapping(value = "/update",method = RequestMethod.POST)
    @ResponseBody
    public String update(@RequestBody UpdateVideoParam param){
        System.out.println(param.toString());
        try{
            AddAtlasResponse data = VideoService.getInstance().updateVideo(param);
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
