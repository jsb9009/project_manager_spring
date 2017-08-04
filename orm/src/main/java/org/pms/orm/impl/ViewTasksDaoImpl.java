package org.pms.orm.impl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.pms.orm.dao.ViewTasksDao;
import org.pms.orm.model.Employees;
import org.pms.orm.model.Projects;
import org.pms.orm.model.Tasks;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by jaliya on 7/24/17.
 */

@Repository
@Transactional
public class ViewTasksDaoImpl implements ViewTasksDao {

    @Autowired
    private HibernateUtilImpl hibernateutilimpl;

    @Resource(name = "sessionFactory")
    protected SessionFactory sessionFactory;


    public List<Tasks> viewTasks() {

        Session session = sessionFactory.openSession();

        List<Tasks> tasksList = session.createCriteria(Tasks.class).list();

        /*String sql = "select task_id,task_name,status,project_id,employee_id from task";

        List<Object[]> taskObjects = hibernateutilimpl.fetchAll(sql);

        List<Tasks> tasksList = new ArrayList<Tasks>();

        for(Object[] taskObject: taskObjects) {

            Tasks tasks = new Tasks();
            Employees employees = tasks.getEmployees();
            Projects projects = tasks.getProjects();

            String id = (String) taskObject[0];
            String name = (String) taskObject[1];
            String status = (String) taskObject[2];
            String projectId = (String) taskObject[3];
            String empId = (String) taskObject[4];

            tasks.setTaskId(id);
            tasks.setTaskName(name);
            tasks.setStatus(status);
            projects.setProjectId(projectId);
//            tasks.setProjects(projects);
//            employees.setEmpId(empId);
//            tasks.setEmployees(employees);

            tasksList.add(tasks);
        }*/

        return tasksList;
    }

}


