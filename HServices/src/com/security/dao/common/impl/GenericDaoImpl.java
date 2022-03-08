package com.security.dao.common.impl;

import java.sql.SQLException;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.orm.hibernate3.HibernateCallback;
import org.springframework.orm.hibernate3.HibernateTemplate;

import com.security.dao.common.GenericDaoIntf;

/**
 * @author r.kachinatte.ramatpa
 *
 */

public class GenericDaoImpl<T> extends HibernateTemplate implements GenericDaoIntf<T>{
	
	public GenericDaoImpl(SessionFactory sessionFactory){
		super(sessionFactory);
	}

	public void save(T t) {
		save(t);	
	}

		
	public void saveOrUpdates(T t) {
		saveOrUpdate(t);
	}

	
	public void saveOrUpdateAll(List<T> t) {
		saveOrUpdateAll(t);
	}

	
	public<X> T get(final X val) {
		return (T)this.execute(new HibernateCallback() {			
			@Override
			public Object doInHibernate(Session session) throws HibernateException, SQLException {
				return session.createCriteria(Object.class).add(Restrictions.idEq(val)).uniqueResult();
		}});
	}

	
	public List<T> getAll() {
		return (List<T>)this.execute(new HibernateCallback() {			
			@Override
			public Object doInHibernate(Session session) throws HibernateException, SQLException {
				return session.createCriteria(Object.class).list();
			}
		});
	}

	
}
