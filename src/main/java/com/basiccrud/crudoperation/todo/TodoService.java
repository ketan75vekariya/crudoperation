package com.basiccrud.crudoperation.todo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;
@Service 
public class TodoService {
	private static List<Todo> todos = new ArrayList();
	private static int todoCounts  = 0;

	static {
		todos.add(new Todo(++todoCounts, "Ketan Kumar", "Learn Spring", LocalDate.now().plusYears(1), false));
		todos.add(new Todo(++todoCounts, "Ketan Kumar", "Learn Spring boot", LocalDate.now().plusYears(2), false));
		todos.add(new Todo(++todoCounts, "Ketan Kumar", "Learn React", LocalDate.now().plusYears(3), false));
		todos.add(new Todo(++todoCounts, "Ketan Kumar", "Learn AWS", LocalDate.now().plusYears(4), false));
	}

	public List<Todo> findByUsername(String Username) {
		return todos;
	}

	public void addTodo(String username, String description, LocalDate targetDate, boolean done) {
		// TODO Auto-generated method stub
		Todo todo = new Todo(++todoCounts, username,description,targetDate,done);
		todos.add(todo);
	}
}
