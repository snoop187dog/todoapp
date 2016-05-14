package com.yauhenijava.service;

import java.util.List;

import com.yauhenijava.dao.impl.ChoiseOption;
import com.yauhenijava.model.Task;

public interface TaskService {
	public void add(Task task);
	public void edit(Task task);
	public void delete(int taskId);
	public Task getTask(int taskId);
	public List getAllTasks(ChoiseOption option);
}
