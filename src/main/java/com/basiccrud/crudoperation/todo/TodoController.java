package com.basiccrud.crudoperation.todo;

import java.time.LocalDate;
import java.util.List;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import jakarta.validation.Valid;

// @Controller
public class TodoController {

	private TodoService todoService;

	public TodoController(TodoService todoService) {
		super();
		this.todoService = todoService;
	}

	@RequestMapping("todo-list")
	public String gotoTodoPage(ModelMap model) {
		String username =  getLoggedInUsername(model);
		List<Todo> todos = todoService.findByUsername(username);
		model.addAttribute("todos", todos);
		return "todo";
	}
	@RequestMapping(value = "add-todo", method= RequestMethod.GET)
	public String gotoNewTodoPage(ModelMap model) {
		String username = getLoggedInUsername(model);
		Todo todo =new Todo(0,username,"",LocalDate.now().plusYears(1),false);
		model.put("todo", todo);
		return "newtodo";
	}
	@RequestMapping(value = "add-todo", method= RequestMethod.POST)
	public String addTodo(ModelMap model, @Valid Todo todo, BindingResult result) {
		if(result.hasErrors()) {
			return "newtodo";
		}
		String username = getLoggedInUsername(model);
		todoService.addTodo(username, todo.getDescription(),todo.getTargetDate(),false);
		return "redirect:todo-list";
	}
	@RequestMapping("delete-todo")
	public String deleteTodo(@RequestParam int id) {
		todoService.deleteById(id);
		return "redirect:todo-list";
		
	}
	@RequestMapping(value = "update-todo", method=RequestMethod.GET)
	public String showUpdateTodo(@RequestParam int id, ModelMap model) {
		Todo todo = todoService.FindById(id);
		model.addAttribute("todo",todo);
		return "newtodo";
		
	}
	@RequestMapping(value = "update-todo", method= RequestMethod.POST)
	public String updateTodo(ModelMap model, @Valid Todo todo, BindingResult result) {
		if(result.hasErrors()) {
			return "newtodo";
		}
		String username = getLoggedInUsername(model);
		todo.setUsername(username);
		todoService.updateTodo(todo);
		return "redirect:todo-list";
	}
	
	private String getLoggedInUsername(ModelMap model) {
		Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
		return authentication.getName();
	}
}
