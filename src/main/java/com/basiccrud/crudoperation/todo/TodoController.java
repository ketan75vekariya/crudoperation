package com.basiccrud.crudoperation.todo;

import java.time.LocalDate;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

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
	public String addTodo(@RequestParam String description, ModelMap model) {
		String username = (String)model.get("name");
		todoService.addTodo(username, description,LocalDate.now().plusYears(3),false);
		return "redirect:todo-list";
	}
}
