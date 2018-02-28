package controller;

import exception.ExceptionMap;
import model.ResponseEntity;
import utils.JsonUtils;

public class BaseController {
    protected ResponseEntity responseEntity;

    public BaseController() {
        responseEntity = new ResponseEntity();
        responseEntity.setCode(200);
        responseEntity.setMsg(null);
    }

    public String getResponseString(){
        return JsonUtils.toJsonString(responseEntity);
    }

    protected void setCode(int code){
        responseEntity.setCode(code);
        responseEntity.setMsg(ExceptionMap.getMsg(code));
    }

    protected void setMsg(String msg){
        responseEntity.setMsg(msg);
    }

    protected void setData(Object data){
        responseEntity.setData(data);
    }
}
