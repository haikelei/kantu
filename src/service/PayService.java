package service;


import cn.beecloud.BeeCloud;

public class PayService {
    private static PayService instance;
    private PayService() {}
    public static synchronized PayService getInstance() {
        if (instance == null) {
            instance = new PayService();
        }
        return instance;
    }

    public void initPay(){
        //LIVE模式使用方法
//        BeeCloud.registerApp(appId, testSecret, appSecret, masterSecret);
        //LIVE模式中的testSecret可为null
        //默认开启LIVE模式

        //测试模式使用方法
//        BeeCloud.registerApp(appId, testSecret, **appSecret**, **masterSecret**);
        //测试模式中的appSecret、masterSecret可为null
        //设置sandbox属性为true，开启测试模式
//        BeeCloud.setSandbox(true);
    }


}

