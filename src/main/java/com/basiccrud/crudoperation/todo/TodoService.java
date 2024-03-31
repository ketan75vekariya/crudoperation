package com.basiccrud.crudoperation.todo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;
@Service 
public class TodoService {
	private static List<Todo> todos = new ArrayList();

	static {
		todos.add(new Todo(1, "Ketan Kumar", "Learn Spring", LocalDate.now().plusYears(1), false));
		todos.add(new Todo(2, "Ketan Kumar", "Learn Spring boot", LocalDate.now().plusYears(2), false));
		todos.add(new Todo(3, "Ketan Kumar", "Learn React", LocalDate.now().plusYears(3), false));
		todos.add(new Todo(4, "Ketan Kumar", "Learn AWS", LocalDate.now().plusYears(4), false));
	}

	public List<Todo> findByUsername(String Username) {
		return todos;
	}
}
