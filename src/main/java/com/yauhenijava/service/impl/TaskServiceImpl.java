package com.yauhenijava.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.yauhenijava.dao.TaskDao;
import com.yauhenijava.dao.impl.ChoiseOption;
import com.yauhenijava.model.Task;
import com.yauhenijava.service.TaskService;

@Service
public class TaskServiceImpl implements TaskService {
	@Autowired
	private TaskDao taskDao;
	
	@Transactional
	public void add(Task task) {
		taskDao.add(task);

	}

	@Transactional
	public void edit(Task task) {
		taskDao.edit(task); 

	}

	@Transactional
	public void delete(int taskId) {
		taskDao.delete(taskId);
	}

	@Transactional
	public Task getTask(int taskId) {
		return taskDao.getTask(taskId);
	}

	@Transactional
	public List getAllTasks(ChoiseOption option) {
		return taskDao.getAllTasks(option);
	}


}
