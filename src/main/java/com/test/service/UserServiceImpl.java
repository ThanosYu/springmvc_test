package com.test.service;



import com.test.model.User;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author Thanos Yu on 2017/3/28.
 */
@Service
@Transactional(readOnly = true,rollbackFor = Exception.class)
public class UserServiceImpl implements UserService {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    @Transactional(readOnly = true,rollbackFor = Exception.class)
    public List<User> search(){
        Query query = sessionFactory.getCurrentSession().getNamedQuery("User.all");
        return query.list();
    }

}
