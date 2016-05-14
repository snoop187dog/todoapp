package com.yauhenijava.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Task {
	@Id
	@Column
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int taskId;
	@Column
	private String task;
	@Column
	private boolean process;
	
		
	public boolean getProcess() {
		return process;
	}

	public void setProcess(boolean process) {
		this.process = process;
	}


	public Task(){}


	public Task(int taskId, String task, boolean process) {
		super();
		this.taskId = taskId;
		this.task = task;
		this.process = process;
	}
	public int getTaskId() {
		return taskId;
	}
	public void setTaskId(int taskId) {
		this.taskId = taskId;
	}

	public String getTask() {
		return task;
	}
	public void setTask(String task) {
		this.task = task;
	}
	
	
}
