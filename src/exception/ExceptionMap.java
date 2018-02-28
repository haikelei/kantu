package exception;

import javax.annotation.PostConstruct;
import java.util.HashMap;
import java.util.Map;

public class ExceptionMap {
    public static final int ERROR_CODE_10001 = 10001;
    public static final int ERROR_CODE_10002 = 10002;
    public static final int ERROR_CODE_10003 = 10003;
    public static final int ERROR_CODE_10004 = 10004;










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
    }

    public static String getMsg(int errorCode){
        return exceptionMap.get(errorCode);
    }



}
