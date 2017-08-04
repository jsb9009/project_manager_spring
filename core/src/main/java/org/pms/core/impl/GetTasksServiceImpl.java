package org.pms.core.impl;

import org.pms.core.service.GetTasksService;

import org.pms.orm.dao.GetTasksDao;

import org.pms.orm.model.Tasks;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by jaliya on 7/28/17.
 */

@Service
@Transactional
public class GetTasksServiceImpl implements GetTasksService{

    @Autowired
    private GetTasksDao gettasksdao;

    public List<Tasks> getTasks() {

        return gettasksdao.getTasks();

    }
}
