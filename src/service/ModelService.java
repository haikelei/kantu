package service;

import dao.ModelDao;
import exception.BaseException;
import exception.ExceptionMap;
import model.ModelDetailEntity;
import model.params.ModelDeleteParam;
import model.params.ModelParam;
import model.params.ModelUpdateParam;
import model.responses.ResAddModel;
import model.responses.UpdateModelData;

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
            throw new BaseException(ExceptionMap.ERROR_CODE_10001);
        }else {
            ModelDao dao = new ModelDao();
            ModelDetailEntity entity = dao.addModel(param.toModelDetailEntity());
            ResAddModel resAddModel = new ResAddModel(entity);
            return resAddModel;
        }
    }


    public ResAddModel deleteModel(ModelDeleteParam param) {
            ModelDao dao = new ModelDao();
            boolean result = dao.deleteModel(param.toModelDetailEntity());
            ResAddModel resAddModel = new ResAddModel(result);
            return resAddModel;
        }


    public UpdateModelData updateModel(ModelUpdateParam param) {
        ModelDao dao = new ModelDao();
        boolean result = dao.updateModel(param.toModelDetailEntity());
        if(result){
            return new UpdateModelData(true,param.getId());
        }else {
            return new UpdateModelData(false,param.getId());
        }
    }

    public ModelDetailEntity quaryModel(ModelDeleteParam param) {
        ModelDao dao = new ModelDao();
        ModelDetailEntity entity = param.toModelDetailEntity();
        ModelDetailEntity data = dao.quaryModel(entity);
        return data;
    }
}