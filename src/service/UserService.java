package service;

import dao.UserDao;
import model.UserEntity;
import model.params.AddUserParam;

import java.util.Date;

public class UserService {
    private static UserService instance;
    private UserService() {}
    public static synchronized UserService getInstance() {
        if (instance == null) {
            instance = new UserService();
        }
        return instance;
    }

    public boolean addUser(AddUserParam param){
        int month = param.getVipType();
        long length  = month*30*24*60*60*1000;
        Date date = new Date();
        UserEntity entity = new UserEntity();
        entity.setDeviceId(param.getDeviceId());
        entity.setVipBuytime(String.valueOf(date.getTime()));
        entity.setVipDeadline(String.valueOf(date.getTime()+length));
        // TODO: 2018/3/23 增加用户
        UserDao userDao = new UserDao();
        boolean result = userDao.addUser(entity);
        return result;
    }
}