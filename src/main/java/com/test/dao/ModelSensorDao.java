package com.test.dao;

import com.test.entity.ModelSensorEntity;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.List;

/**
 * @author Thanos Yu
 * @date 10/9/2018 1:31 PM
 */
public class ModelSensorDao {

    public List<ModelSensorEntity> query() {
        Session session = null;
        List<ModelSensorEntity> list = null;
        try {
            //实例化Configuration，这行代码默认加载hibernate.cfg.xml文件
            Configuration conf = new Configuration().configure();
            //以Configuration创建SessionFactory
            SessionFactory sf = conf.buildSessionFactory();
            //实例化Session
            session = sf.openSession();
            String hql = "from ModelSensorEntity ";
            Query query = session.createQuery(hql);
            list = query.list();
        } catch (HibernateException e) {
            e.printStackTrace();
            return null;
        } finally {
            if (session != null) {
                session.close();
            }
        }
        return list;
    }

}