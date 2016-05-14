 package com.yauhenijava.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.yauhenijava.dao.TaskDao;
import com.yauhenijava.model.Task;

@Repository
public class TaskDaoImpl implements TaskDao {
	
	@Autowired
	private SessionFactory session;
	
	@Override
	public void add(Task task) {
		session.getCurrentSession().save(task);
	}

	@Override
	public void edit(Task task) {
		session.getCurrentSession().update(task);
	}

	@Override
	public void delete(int taskId) {
		session.getCurrentSession().delete(getTask(taskId));
	}

	@Override
	public Task getTask(int taskId) {
		return (Task) session.getCurrentSession().get(Task.class, taskId);
	}

	@Override
	public List getAllTasks(ChoiseOption option) {
		
		List<Object> initial = session.getCurrentSession().createQuery("from Task").list();
		
		switch (option) {
		case ALL:
			return initial;
		case DONE:
			List<Object> done = new ArrayList<>();
			for(Object obj : initial){
				if(((Task)obj).getProcess())done.add(obj);
			}
			return done;
		case UNDONE:
			List<Object> undone = new ArrayList<>();
			for(Object obj : initial){
				if(!((Task)obj).getProcess())undone.add(obj);
			}
			return undone;
		default:
			break;
		}
		
		return session.getCurrentSession().createQuery("from Task").list(); 
	}

}
