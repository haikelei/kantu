package service;

import dao.ModelDao;
import exception.BaseException;
import exception.ExceptionMap;
import model.ModelDetailEntity;
import model.params.ModelParam;
import model.responses.ResAddModel;

public class ModelService {

    private static ModelService instance;
    private ModelService() {}
    public static synchronized ModelService getInstance() {
        if (instance == null) {
            instance = new ModelService();
        }
        return instance;
    }

    public ResAddModel addModel(ModelParam param){
        if(param.getName() == null ){
            throw new BaseException(ExceptionMap.EXCEPTION_ENTER_MODEL_NAME);
        }else {

            ModelDao dao = new ModelDao();
            ModelDetailEntity entity = dao.addModel(param.toModelDetailEntity());
            ResAddModel resAddModel = new ResAddModel(entity);
            return resAddModel;
        }
    }


}