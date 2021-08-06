package com.ecommerce.teamseven.dao.impl;

import com.ecommerce.dao.CustomerOrderDao;
import com.ecommerce.model.CustomerOrder;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by Yuth on 4/6/2017.
 */
@Repository
@Transactional
public class CustomerOrderDaoImpl implements CustomerOrderDao{

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public void addCustomerOrder(CustomerOrder customerOrder) {
        Session session = sessionFactory.getCurrentSession();
        session.saveOrUpdate(customerOrder);
        session.flush();
    }
}
