package com.security.dao.common;

import java.util.List;

/**
 * @author r.kachinatte.ramatpa
 *
 */
public interface GenericDaoIntf<T> {

	void save(T t);
	void saveOrUpdates(T t);
	void saveOrUpdateAll(List<T> t);
	<X> T get(X val);
	List<T> getAll();
}
