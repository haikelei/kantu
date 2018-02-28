package init;

import utils.HibernateUtil;

import javax.annotation.PostConstruct;

/**
 * 初始化应用程序的类
 */
public class Application {


    @PostConstruct
    public void init(){
        HibernateUtil.getSessionFactory();
    }
}
