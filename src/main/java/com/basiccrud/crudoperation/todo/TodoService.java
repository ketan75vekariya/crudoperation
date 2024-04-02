package com.basiccrud.crudoperation.todo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import jakarta.validation.Valid;
@Service 
public class TodoService {
	private static List<Todo> todos = new ArrayList<Todo>();
	private static int todoCounts  = 0;

	static {
		todos.add(new Todo(++todoCounts, "user", "Learn Spring", LocalDate.now().plusYears(1), false));
		todos.add(new Todo(++todoCounts, "user", "Learn Spring boot", LocalDate.now().plusYears(2), false));
		todos.add(new Todo(++todoCounts, "user", "Learn React", LocalDate.now().plusYears(3), false));
		todos.add(new Todo(++todoCounts, "user", "Learn AWS", LocalDate.now().plusYears(4), false));
	}

	
	
	public List<Todo> findByUsername(String username) {
		 Predicate<? super Todo> predicate = todo -> todo.getUsername().equalsIgnoreCase(username);
	        
	        return todos.stream().filter(predicate).collect(Collectors.toList());
		
		
	    /*Predicate<? super Todo> predicate = todo -> {
	        String todoUsername = todo.getUsername();
	        return todoUsername != null && todoUsername.equalsIgnoreCase(username);
	    };
	    return todos.stream().filter(predicate).toList();*/
	}

	public void addTodo(String username, String description, LocalDate targetDate, boolean done) {
		// TODO Auto-generated method stub
		Todo todo = new Todo(++todoCounts, username,description,targetDate,done);
		todos.add(todo);
	}
	
	public void deleteById(int id) {
		Predicate<? super Todo> predicate = todo -> todo.getId() == id;
		todos.removeIf(predicate);
	}

	public Todo FindById(int id) {
		// TODO Auto-generated method stub
		Predicate<? super Todo> predicate = todo->todo.getId() == id;
		Todo todo = todos.stream().filter(predicate).findFirst().get();
		return todo;
	}

	public void updateTodo(@Valid Todo todo) {
		// TODO Auto-generated method stub
		deleteById(todo.getId());
		todos.add(todo);
	}
}
