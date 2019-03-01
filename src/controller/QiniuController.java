package controller;

import com.qiniu.util.Auth;
import exception.BaseException;
import model.responses.AccessKeyResponse;
import model.responses.AddAtlasResponse;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import service.AtlasService;

import javax.servlet.http.HttpServletResponse;


@RequestMapping(value = "/qiniu",method = RequestMethod.POST,produces="application/json")
@Controller
public class QiniuController extends BaseController{

    @RequestMapping(value = "/uploadtoken",method = RequestMethod.POST)
    @ResponseBody
    public String getAccessKey(HttpServletResponse response){
        response.setHeader("Access-Control-Allow-Origin", "*");
        try{
            String accessKey = "OFNbfrhhLgVTBUk95LSPa3XtwIsSr3y5sMwRf2xZ";
            String secretKey = "_x8NedHqYU7BMOGnjo8qFQ6TwvLQT8W0QRmht4XY";
            String bucket = "avatartest";
            Auth auth = Auth.create(accessKey, secretKey);
            String upToken = auth.uploadToken(bucket);
            System.out.println(upToken);
            AccessKeyResponse data = new AccessKeyResponse();
            data.uploadToken = upToken;
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
