package org.pms.orm.impl;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.pms.orm.dao.ViewAssignedTasksDao;

import org.pms.orm.model.Employees;
import org.pms.orm.model.Tasks;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;

import java.util.List;

/**
 * Created by jaliya on 7/24/17.
 */

@Repository
@Transactional
public class ViewAssignedTasksDaoImpl implements ViewAssignedTasksDao {

    @Autowired
    private HibernateUtilImpl hibernateutilimpl;

    @Resource(name = "sessionFactory")
    protected SessionFactory sessionFactory;


    public List<Tasks> viewassignedTasks(Tasks tasks) {

        /*Include the logic inside this method to the way in following URL :
        https://docs.jboss.org/hibernate/entitymanager/3.5/reference/en/html/querycriteria.html*/

        Session session = sessionFactory.openSession();

        Employees employee = session.get(Employees.class, tasks.getEmployees().getEmpId());

        Criteria cr = session.createCriteria(Tasks.class);
        cr.add(Restrictions.eq("employees.empId", employee.getEmpId()));
        List<Tasks> tasksList = cr.list();


        //        String sql = "select taskId,taskName,projectId,noOfHours from task,project,employee where task
        // .project_id=project.project_id and task.employee_id=employee.employee_id and employee_id=:empId";
        //
        //        Query query = session.createNativeQuery(sql);
        //        query.setParameter("empId", tasks.getTaskId());
        //
        //        List<Object[]> taskObjects = hibernateutilimpl.fetchAll(sql);
        //
        //        List<Tasks> tasksList = new ArrayList<Tasks>();
        //
        //        for (Object[] taskObject : taskObjects) {
        //
        //
        //            Employees employees = tasks.getEmployees();
        //            Projects projects = tasks.getProjects();
        //
        //            String id = (String) taskObject[0];
        //            String name = (String) taskObject[1];
        //            String status = (String) taskObject[2];
        //            String projectId = (String) taskObject[3];
        //            String empId = (String) taskObject[4];
        //
        //            tasks.setTaskId(id);
        //            tasks.setTaskName(name);
        //            tasks.setStatus(status);
        //            projects.setProjectId(projectId);
        //            employees.setEmpId(empId);
        //
        //            tasksList.add(tasks);
        //        }
        return tasksList;

    }

}