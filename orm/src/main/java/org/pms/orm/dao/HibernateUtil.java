package org.pms.orm.dao;

import java.io.Serializable;

/**
 * Created by jaliya on 8/1/17.
 */
public interface HibernateUtil {

    public <T> Serializable create(final T entity);

}
