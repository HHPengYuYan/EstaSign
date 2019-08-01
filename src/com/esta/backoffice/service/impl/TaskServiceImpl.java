package com.esta.backoffice.service.impl;

import com.esta.backoffice.mapper.TaskMapper;
import com.esta.backoffice.model.Task;
import com.esta.backoffice.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class TaskServiceImpl implements TaskService {

    @Autowired
    private TaskMapper taskmapper;
    @Override
    public void TaskUpload() {
        taskmapper.selectByPrimaryKey(1);
    }
}
