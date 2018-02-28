package exception;

import javax.annotation.PostConstruct;
import java.util.HashMap;
import java.util.Map;

public class ExceptionMap {

    public static Map<Integer,String> exceptionMap = new HashMap<Integer, String>();

    @PostConstruct
    public void init() {
        generateMapping();
    }

    private void generateMapping() {
        exceptionMap.put(EXCEPTION_ENTER_MODEL_NAME,"请输入模特名字");
    }

    public static String getMsg(int errorCode){
        return exceptionMap.get(errorCode);
    }


    public static final int EXCEPTION_ENTER_MODEL_NAME = 10001;
}
