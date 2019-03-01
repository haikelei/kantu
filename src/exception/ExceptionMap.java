package exception;

import javax.annotation.PostConstruct;
import java.util.HashMap;
import java.util.Map;

public class ExceptionMap {
    public static final int ERROR_CODE_10001 = 10001;
    public static final int ERROR_CODE_10002 = 10002;
    public static final int ERROR_CODE_10003 = 10003;
    public static final int ERROR_CODE_10004 = 10004;
    public static final int ERROR_CODE_10005 = 10005;
    public static final int ERROR_CODE_10006 = 10006;
    public static final int ERROR_CODE_10007 = 10007;
    public static final int ERROR_CODE_10008 = 10008;
    public static final int ERROR_CODE_10009 = 10009;
    public static final int ERROR_CODE_10010 = 10010;
    public static final int ERROR_CODE_10011 = 10011;
    public static final int ERROR_CODE_10012 = 10012;
    public static final int ERROR_CODE_10013 = 10013;
    public static final int ERROR_CODE_10014 = 10014;










    public static Map<Integer,String> exceptionMap = new HashMap<Integer, String>();
    @PostConstruct
    public void init() {
        generateMapping();
    }

    private void generateMapping() {
        exceptionMap.put(ERROR_CODE_10001,"请输入模特名字");
        exceptionMap.put(ERROR_CODE_10002,"找不到该模特信息");
        exceptionMap.put(ERROR_CODE_10003,"更新模特信息视频失败");
        exceptionMap.put(ERROR_CODE_10004,"查询失败");
        exceptionMap.put(ERROR_CODE_10005,"创建图集失败");
        exceptionMap.put(ERROR_CODE_10006,"插入图片失败");
        exceptionMap.put(ERROR_CODE_10007,"删除图集失败");
        exceptionMap.put(ERROR_CODE_10008,"查询图集信息失败");
        exceptionMap.put(ERROR_CODE_10009,"更新图集信息失败");
        exceptionMap.put(ERROR_CODE_10010,"添加视频失败");
        exceptionMap.put(ERROR_CODE_10011,"查询视频失败");
        exceptionMap.put(ERROR_CODE_10012,"删除视频失败");
        exceptionMap.put(ERROR_CODE_10013,"修改视频失败");
        exceptionMap.put(ERROR_CODE_10014,"增加用户失败");






    }

    public static String getMsg(int errorCode){
        return exceptionMap.get(errorCode);
    }



}
