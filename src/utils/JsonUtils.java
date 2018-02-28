package utils;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializerFeature;

public class JsonUtils {

    /**
     * null对象返回为null值的json字符串
     * @param o
     * @return
     */
    public static String toJsonString(Object o){
        return JSON.toJSONString(o, SerializerFeature.WriteMapNullValue);
    }
}
