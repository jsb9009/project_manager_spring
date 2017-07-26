package org.pms.orm;

import org.pms.orm.beans.EmployeeBean;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

/**
 * Created by jaliya on 7/21/17.
 */

public interface EmployeeDao {

    void saveEmployee(EmployeeBean employeeBean);

}
