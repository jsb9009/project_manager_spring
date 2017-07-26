package org.pms.orm;

import org.pms.orm.beans.ChooseEmployeeBean;
import org.pms.orm.beans.TaskBean;
import org.pms.orm.beans.ViewTasksBean;

import java.util.List;

/**
 * Created by jaliya on 7/24/17.
 */
public interface ChooseEmployeeDao {


    String chooseEmpoyeeNo(String emp_no);
    List<ChooseEmployeeBean> viewassignedTasks(String indexNo);
}
