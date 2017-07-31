package org.pms.core.impl;

import org.pms.core.service.GetTasksService;
import org.pms.orm.beans.GetTasksBean;
import org.pms.orm.impl.GetTasksDaoImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by jaliya on 7/28/17.
 */

@Service
public class GetTasksServiceImpl implements GetTasksService{

    @Autowired
    private GetTasksDaoImpl gettasksdao;

    public List<GetTasksBean> getTasks() {

        return gettasksdao.getTasks();

    }
}
