package com.yauhenijava.controller;



import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.yauhenijava.dao.impl.ChoiseOption;
import com.yauhenijava.model.Task;
import com.yauhenijava.service.TaskService;

@Controller
public class TaskController {
	@Autowired
	private TaskService taskService;
	
	@RequestMapping("/index")
	public String setupForm(Map<String, Object> map){
		Task task = new Task();
		map.put("task",task);
		map.put("taskList", taskService.getAllTasks(ChoiseOption.ALL));
		return "task";
	}
	@RequestMapping(value="/task.do", method=RequestMethod.POST)
	public String doActions(@ModelAttribute Task task, BindingResult result, @RequestParam String action, Map<String, Object> map){
		Task taskResult = new Task();
		
		ChoiseOption option = ChoiseOption.ALL;
		
		switch (action.toLowerCase()) {
		case "add":
			taskService.add(task);
			taskResult = task;
			break;
		case "edit":
			taskService.edit(task);
			taskResult = task;
			break;
		case "delete":
			taskService.delete(task.getTaskId());
			taskResult = new Task();
			break;
		case "show all":
			System.out.println("show all stub");
			break;
		case "only done":
			option = ChoiseOption.DONE;
			System.out.println("show done stub");
			break;
		case "only undone":
			option = ChoiseOption.UNDONE;
			System.out.println("show undone stub");
			break;
		}
		map.put("task" , taskResult);
		map.put("taskList", taskService.getAllTasks(option));
		return "task";
	}
}
