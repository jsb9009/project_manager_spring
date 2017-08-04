package org.pms.orm.dao;

import java.io.Serializable;

/**
 * Created by jaliya on 8/1/17.
 */
public interface HibernateUtil {

    <T> Serializable create(final T entity);

}
