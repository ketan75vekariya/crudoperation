package com.basiccrud.crudoperation.todo;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class TodoController {

	private TodoService todoService;

	public TodoController(TodoService todoService) {
		super();
		this.todoService = todoService;
	}

	@RequestMapping("todo-list")
	public String gotoTodoPage(ModelMap model) {
		List<Todo> todos = todoService.findByUsername("Ketan kumar");
		model.addAttribute("todos", todos);
		return "todo";
	}
	@RequestMapping(value = "add-todo", method= RequestMethod.GET)
	public String gotoNewTodoPage(ModelMap model) {
		
		return "newtodo";
	}
	@RequestMapping(value = "add-todo", method= RequestMethod.POST)
	public String addTodo(ModelMap model) {
		
		return "redirect:todo-list";
	}
}
